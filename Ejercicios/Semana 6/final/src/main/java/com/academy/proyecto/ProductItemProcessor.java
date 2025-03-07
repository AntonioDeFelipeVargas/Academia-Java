package com.academy.proyecto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.academy.proyecto.bo.ProductBean;

public class ProductItemProcessor implements ItemProcessor<ProductBean, ProductBean> {

    private Logger LOGGER = LoggerFactory.getLogger(ProductItemProcessor.class);

    @Override
    public ProductBean process(final ProductBean product) throws Exception {
        String price = "$" + product.getPrecio();
        
        ProductBean transformedProduct = new ProductBean(
        		product.getProductoId(),
        		product.getProductoNombre(),
        		product.getProductoDescripcion(),
        		price);
        
        LOGGER.info("Convertiendo ( {} ) en ( {} )", product, transformedProduct);
        return transformedProduct;
    }
}
