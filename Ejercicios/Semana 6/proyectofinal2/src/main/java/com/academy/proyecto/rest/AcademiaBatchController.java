package com.academy.proyecto.rest;

import com.academy.proyecto.bo.ProductBeam;
//Imports para usar mis exceptions
import com.academy.proyecto.exceptions.CustomCSVProcessingException;
import com.academy.proyecto.exceptions.CustomCSVValidationException;
import com.academy.proyecto.exceptions.CustomDatabaseException;
import com.academy.proyecto.exceptions.CustomGenericException;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.BulkOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import org.springframework.dao.DataAccessException;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//Imports para usar log
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class AcademiaBatchController {
    //Creo el objeto log para poder usarlo y mostrar mensajes
    private static final Logger log = LoggerFactory.getLogger(AcademiaBatchController.class);

    @Value("${file.input}")
    private String fileInput;

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/mongodbUpdate")
    public String directHomePage() {
        try
        {
            commitBulkUpdateToMongoDB();
            return "Se actualizo la base de datos de MongoDB con una operacion bulk!";
        }
        catch (DataAccessException e)
        { // Catch especifico para MongoDB
            System.err.println("Error al actualizar MongoDB: " + e.getMessage());
            log.error("Error en la operacion bulk a MongoDB", e); // Log con el objeto log
            return "Error al actualizar la base de datos: " + e.getMessage();
        }
        catch (Exception e)
        {
            // Catch generico
            System.err.println("Error inesperado: " + e.getMessage());
            log.error("Error inesperado en la operacion bulk a MongoDB", e);
            return "Error inesperado al actualizar la base de datos";
        }

    }

    private void commitBulkUpdateToMongoDB() {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(fileInput));
            CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
            CSVReader csvReader = new CSVReaderBuilder(reader).withCSVParser(parser).withSkipLines(1).build();

            List<String[]> allData = csvReader.readAll();
            int count ;
            ProductBeam productData;
            List<ProductBeam> productInfoList = new ArrayList<>();

            for (String[] productRow : allData)
            {
                String[] productStringArray = new String[productRow.length];
                productData = new ProductBeam();
                count = 0;
                for (String productInfo : productRow)
                {
                    productStringArray[count] = productInfo;
                    count++;
                }
                productData.setProductoId(productStringArray[0]);
                productData.setProductoNombre(productStringArray[1]);
                productData.setProductoDescripcion(productStringArray[2]);
                productData.setPrecio(productStringArray[3]);
                productInfoList.add(productData);
            }

            BulkOperations bulkOps = 
            		mongoTemplate.bulkOps(BulkOperations.BulkMode.UNORDERED, ProductBeam.class);
            productInfoList.stream().filter(Objects::nonNull).forEach(product -> {
                org.bson.Document dbDoc = new org.bson.Document().append("$set", product);
                mongoTemplate.getConverter().write(product, dbDoc);
                Query query = new Query().addCriteria(new Criteria("uuid").is(product.getProductoId()));
                Update update = Update.fromDocument(dbDoc, "");
                bulkOps.upsert(query, update);
            });

            //BulkWriteResult result = bulkOps.execute(); No se usa

        }
        catch (IOException e)
        {
            System.err.println("Error de E/S al leer el archivo CSV: " + e.getMessage());
            log.error("Error de E/S al procesar CSV", e);
            // Maneja el error según tus necesidades. Puedes relanzar la excepcion,
            // devolver un codigo de error, o realizar alguna otra accion
            throw new CustomCSVProcessingException("Error al leer el archivo CSV", e);
        }
        catch (CustomCSVValidationException e)
        {
            System.err.println("Error de validacion en el archivo CSV: " + e.getMessage());
            log.error("Error de validacion de CSV", e);
            // Manejo específico para errores de validación (formato incorrecto, datos faltantes)
            throw new CustomCSVValidationException("Error de validacion en el archivo CSV", e);
        }
        catch (DataAccessException e)
        {
            System.err.println("Error al acceder a la base de datos: " + e.getMessage());
            log.error("Error de base de datos", e);
            // Maneja el error de la base de datos (ej: reintentar la operación, lanzar excepción, etc.).
            throw new CustomDatabaseException("Error al acceder a la base de datos", e);
        }
        catch (Exception e)
        {  // Catch genérico (úsalo con precaución)
            System.err.println("Error inesperado: " + e.getMessage());
            log.error("Error inesperado", e);
            // Si llegas aquí, es un error que no esperabas.
            // Puedes relanzar la excepción para que se maneje en un nivel superior,
            // o realizar alguna otra acción de "fallback".
            throw new CustomGenericException("Error inesperado durante el procesamiento", e);
        }
    }
}
