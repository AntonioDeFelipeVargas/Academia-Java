package com.academy.proyecto.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductBean
{
	private String productoId;
	private String productoNombre;
	private String productoDescripcion;
	private String precio;
}
