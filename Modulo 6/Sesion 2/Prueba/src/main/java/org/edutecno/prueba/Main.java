package org.edutecno.prueba;

import org.edutecno.prueba.controller.Bibliotecario;
import org.edutecno.prueba.models.Autor;
import org.edutecno.prueba.models.Editorial;
import org.edutecno.prueba.models.Libro;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner run(Bibliotecario bibliotecario) {
        return args -> {
            bibliotecario.agregarUnLibro(new Libro(1, "Libro 1", new Autor("Autor 1", "Apellido 1"), new Editorial("Editorial 1", "Pais 1"), 100, "genero 1", true));
            bibliotecario.agregarUnLibro(new Libro(2, "Libro 2", new Autor("Autor 2", "Apellido 2"), new Editorial("Editorial 2", "Pais 2"), 200, "genero 2", true));

            bibliotecario.devolucionOPrestamoDeLibro(1);
            bibliotecario.solicitanTodosLosLibros();
            bibliotecario.buscarLibro("Apellido 1");
        };
    }
}