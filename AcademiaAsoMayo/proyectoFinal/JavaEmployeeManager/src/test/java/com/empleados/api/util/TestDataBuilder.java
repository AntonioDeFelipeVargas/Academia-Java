package com.empleados.api.util;

import com.empleados.api.dto.EmpleadoDTO;
import com.empleados.api.model.EmpleadoModel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase utilitaria para generar datos de prueba
 */
public class TestDataBuilder {

    /**
     * Crea un objeto EmpleadoModel para pruebas
     */
    public static EmpleadoModel createEmpleado() {
        return new EmpleadoModel(
                1L,
                "Juan",
                "Pérez",
                "juan.perez@example.com",
                LocalDate.of(2020, 1, 15),
                new BigDecimal("50000.00"),
                "Tecnología"
        );
    }

    /**
     * Crea un objeto EmpleadoDTO para pruebas
     */
    public static EmpleadoDTO createEmpleadoDTO() {
        return new EmpleadoDTO(
                1L,
                "Juan",
                "Pérez",
                "juan.perez@example.com",
                LocalDate.of(2020, 1, 15),
                new BigDecimal("50000.00"),
                "Tecnología"
        );
    }

    /**
     * Crea un segundo EmpleadoModel con datos diferentes para pruebas
     */
    public static EmpleadoModel createEmpleado2() {
        return new EmpleadoModel(
                2L,
                "Ana",
                "García",
                "ana.garcia@example.com",
                LocalDate.of(2019, 5, 10),
                new BigDecimal("48000.00"),
                "Recursos Humanos"
        );
    }

    /**
     * Crea un segundo EmpleadoDTO con datos diferentes para pruebas
     */
    public static EmpleadoDTO createEmpleadoDTO2() {
        return new EmpleadoDTO(
                2L,
                "Ana",
                "García",
                "ana.garcia@example.com",
                LocalDate.of(2019, 5, 10),
                new BigDecimal("48000.00"),
                "Recursos Humanos"
        );
    }

    /**
     * Crea un nuevo EmpleadoDTO sin ID (para creación)
     */
    public static EmpleadoDTO createNewEmpleadoDTO() {
        return new EmpleadoDTO(
                null,
                "Carlos",
                "Rodríguez",
                "carlos.rodriguez@example.com",
                LocalDate.of(2021, 3, 22),
                new BigDecimal("52000.00"),
                "Tecnología"
        );
    }

    /**
     * Crea un EmpleadoDTO con datos inválidos para pruebas
     */
    public static EmpleadoDTO createInvalidEmpleadoDTO() {
        return new EmpleadoDTO(
                null,
                "", // Nombre vacío (inválido)
                "", // Apellido vacío (inválido)
                "email-invalido", // Email inválido
                LocalDate.now().plusDays(1), // Fecha futura (inválida)
                new BigDecimal("-1000.00"), // Salario negativo
                ""
        );
    }

    /**
     * Crea una lista de EmpleadoDTO para pruebas
     */
    public static List<EmpleadoDTO> createEmpleadoDTOList() {
        List<EmpleadoDTO> empleados = new ArrayList<>();
        empleados.add(createEmpleadoDTO());
        empleados.add(createEmpleadoDTO2());
        return empleados;
    }

    /**
     * Crea una lista de EmpleadoModel para pruebas
     */
    public static List<EmpleadoModel> createEmpleadoList() {
        List<EmpleadoModel> empleados = new ArrayList<>();
        empleados.add(createEmpleado());
        empleados.add(createEmpleado2());
        return empleados;
    }

    /**
     * Crea una lista de Empleados por departamento
     */
    public static List<EmpleadoModel> createEmpleadosByDepartamento(String departamento) {
        List<EmpleadoModel> empleados = new ArrayList<>();
        
        if ("Tecnología".equals(departamento)) {
            empleados.add(createEmpleado());
        } else if ("Recursos Humanos".equals(departamento)) {
            empleados.add(createEmpleado2());
        }
        
        return empleados;
    }

    /**
     * Crea una lista de EmpleadosDTO por departamento
     */
    public static List<EmpleadoDTO> createEmpleadosDTOByDepartamento(String departamento) {
        List<EmpleadoDTO> empleados = new ArrayList<>();
        
        if ("Tecnología".equals(departamento)) {
            empleados.add(createEmpleadoDTO());
        } else if ("Recursos Humanos".equals(departamento)) {
            empleados.add(createEmpleadoDTO2());
        }
        
        return empleados;
    }
}