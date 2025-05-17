package com.empleados.api.config;

import com.empleados.api.model.EmpleadoModel;
import com.empleados.api.repository.EmpleadoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

/**
 * Clase para inicializar datos de prueba
 */
@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initData(EmpleadoRepository empleadoRepository) {
        return args -> {
            // Verificamos si ya hay datos cargados
            if (empleadoRepository.count() == 0) {
                // Creamos 20 empleados de prueba
                EmpleadoModel[] empleados = {
                        new EmpleadoModel(null, "Juan", "Pérez", "juan.perez@example.com",
                                LocalDate.of(2020, 1, 15), new BigDecimal("50000.00"), "Tecnología"),
                        new EmpleadoModel(null, "Ana", "García", "ana.garcia@example.com",
                                LocalDate.of(2019, 5, 10), new BigDecimal("48000.00"), "Recursos Humanos"),
                        new EmpleadoModel(null, "Carlos", "Rodríguez", "carlos.rodriguez@example.com",
                                LocalDate.of(2021, 3, 22), new BigDecimal("52000.00"), "Tecnología"),
                        new EmpleadoModel(null, "María", "López", "maria.lopez@example.com",
                                LocalDate.of(2018, 11, 5), new BigDecimal("55000.00"), "Finanzas"),
                        new EmpleadoModel(null, "Pedro", "Martínez", "pedro.martinez@example.com",
                                LocalDate.of(2022, 2, 14), new BigDecimal("45000.00"), "Marketing"),
                        new EmpleadoModel(null, "Laura", "Sánchez", "laura.sanchez@example.com",
                                LocalDate.of(2017, 7, 20), new BigDecimal("60000.00"), "Ventas"),
                        new EmpleadoModel(null, "Miguel", "González", "miguel.gonzalez@example.com",
                                LocalDate.of(2021, 9, 30), new BigDecimal("47000.00"), "Tecnología"),
                        new EmpleadoModel(null, "Sofía", "Fernández", "sofia.fernandez@example.com",
                                LocalDate.of(2019, 4, 12), new BigDecimal("49000.00"), "Recursos Humanos"),
                        new EmpleadoModel(null, "Javier", "Díaz", "javier.diaz@example.com",
                                LocalDate.of(2020, 6, 8), new BigDecimal("51000.00"), "Finanzas"),
                        new EmpleadoModel(null, "Carmen", "Ruiz", "carmen.ruiz@example.com",
                                LocalDate.of(2022, 1, 17), new BigDecimal("46000.00"), "Marketing"),
                        new EmpleadoModel(null, "David", "Moreno", "david.moreno@example.com",
                                LocalDate.of(2018, 8, 25), new BigDecimal("58000.00"), "Ventas"),
                        new EmpleadoModel(null, "Elena", "Jiménez", "elena.jimenez@example.com",
                                LocalDate.of(2019, 12, 3), new BigDecimal("54000.00"), "Tecnología"),
                        new EmpleadoModel(null, "Alberto", "Torres", "alberto.torres@example.com",
                                LocalDate.of(2021, 5, 19), new BigDecimal("49500.00"), "Recursos Humanos"),
                        new EmpleadoModel(null, "Lucía", "Vargas", "lucia.vargas@example.com",
                                LocalDate.of(2020, 10, 7), new BigDecimal("53000.00"), "Finanzas"),
                        new EmpleadoModel(null, "Roberto", "Reyes", "roberto.reyes@example.com",
                                LocalDate.of(2017, 3, 14), new BigDecimal("62000.00"), "Ventas"),
                        new EmpleadoModel(null, "Isabel", "Navarro", "isabel.navarro@example.com",
                                LocalDate.of(2022, 4, 29), new BigDecimal("47500.00"), "Marketing"),
                        new EmpleadoModel(null, "Fernando", "Castro", "fernando.castro@example.com",
                                LocalDate.of(2019, 2, 11), new BigDecimal("56000.00"), "Tecnología"),
                        new EmpleadoModel(null, "Marta", "Ortega", "marta.ortega@example.com",
                                LocalDate.of(2018, 6, 22), new BigDecimal("59000.00"), "Finanzas"),
                        new EmpleadoModel(null, "Pablo", "Gallego", "pablo.gallego@example.com",
                                LocalDate.of(2021, 11, 9), new BigDecimal("48500.00"), "Recursos Humanos"),
                        new EmpleadoModel(null, "Cristina", "Vega", "cristina.vega@example.com",
                                LocalDate.of(2020, 8, 3), new BigDecimal("52500.00"), "Marketing"),
                        // Registros adicionales para llegar a 40
                        new EmpleadoModel(null, "Sergio", "Romero", "sergio.romero@example.com",
                                LocalDate.of(2023, 1, 5), new BigDecimal("44000.00"), "Soporte"),
                        new EmpleadoModel(null, "Patricia", "Molina", "patricia.molina@example.com",
                                LocalDate.of(2022, 7, 12), new BigDecimal("51500.00"), "Ventas"),
                        new EmpleadoModel(null, "Ricardo", "Blanco", "ricardo.blanco@example.com",
                                LocalDate.of(2017, 10, 25), new BigDecimal("63000.00"), "Tecnología"),
                        new EmpleadoModel(null, "Verónica", "Suárez", "veronica.suarez@example.com",
                                LocalDate.of(2020, 3, 18), new BigDecimal("47800.00"), "Finanzas"),
                        new EmpleadoModel(null, "Jorge", "Pascual", "jorge.pascual@example.com",
                                LocalDate.of(2019, 8, 9), new BigDecimal("50500.00"), "Recursos Humanos"),
                        new EmpleadoModel(null, "Beatriz", "Herrera", "beatriz.herrera@example.com",
                                LocalDate.of(2021, 2, 20), new BigDecimal("46500.00"), "Marketing"),
                        new EmpleadoModel(null, "Francisco", "Gil", "francisco.gil@example.com",
                                LocalDate.of(2022, 11, 30), new BigDecimal("53500.00"), "Soporte"),
                        new EmpleadoModel(null, "Natalia", "Iglesias", "natalia.iglesias@example.com",
                                LocalDate.of(2018, 1, 15), new BigDecimal("57000.00"), "Ventas"),
                        new EmpleadoModel(null, "Andrés", "Flores", "andres.flores@example.com",
                                LocalDate.of(2023, 3, 7), new BigDecimal("49200.00"), "Tecnología"),
                        new EmpleadoModel(null, "Silvia", "Pardo", "silvia.pardo@example.com",
                                LocalDate.of(2017, 6, 1), new BigDecimal("61000.00"), "Finanzas"),
                        new EmpleadoModel(null, "Manuel", "Santos", "manuel.santos@example.com",
                                LocalDate.of(2020, 9, 14), new BigDecimal("48200.00"), "Recursos Humanos"),
                        new EmpleadoModel(null, "Lorena", "Crespo", "lorena.crespo@example.com",
                                LocalDate.of(2019, 7, 22), new BigDecimal("45500.00"), "Marketing"),
                        new EmpleadoModel(null, "Óscar", "Méndez", "oscar.mendez@example.com",
                                LocalDate.of(2022, 5, 3), new BigDecimal("52800.00"), "Soporte"),
                        new EmpleadoModel(null, "Raquel", "Domínguez", "raquel.dominguez@example.com",
                                LocalDate.of(2021, 8, 18), new BigDecimal("59500.00"), "Ventas"),
                        new EmpleadoModel(null, "Adrián", "Campos", "adrian.campos@example.com",
                                LocalDate.of(2018, 4, 27), new BigDecimal("55500.00"), "Tecnología"),
                        new EmpleadoModel(null, "Clara", "Guerrero", "clara.guerrero@example.com",
                                LocalDate.of(2023, 2, 9), new BigDecimal("47200.00"), "Finanzas"),
                        new EmpleadoModel(null, "Samuel", "Prieto", "samuel.prieto@example.com",
                                LocalDate.of(2017, 12, 11), new BigDecimal("49800.00"), "Recursos Humanos"),
                        new EmpleadoModel(null, "Eva", "Lorenzo", "eva.lorenzo@example.com",
                                LocalDate.of(2020, 4, 5), new BigDecimal("46800.00"), "Marketing"),
                        new EmpleadoModel(null, "Diego", "Nuñez", "diego.nunez@example.com",
                                LocalDate.of(2019, 10, 19), new BigDecimal("51200.00"), "Soporte"),
                        new EmpleadoModel(null, "Rosa", "Serrano", "rosa.serrano@example.com",
                                LocalDate.of(2021, 6, 28), new BigDecimal("58500.00"), "Ventas")
                };
                
                empleadoRepository.saveAll(Arrays.asList(empleados));
                
                System.out.println("¡Se han cargado 40 empleados de prueba en la base de datos!");
            }
        };
    }
}