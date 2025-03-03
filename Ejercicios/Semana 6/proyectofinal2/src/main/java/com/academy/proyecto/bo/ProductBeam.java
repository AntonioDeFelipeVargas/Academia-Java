package com.academy.proyecto.bo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("productdata")
public class ProductBeam {
	private String productoId;
	private String productoNombre;
	private String productoDescripcion;
	private String precio;
}
