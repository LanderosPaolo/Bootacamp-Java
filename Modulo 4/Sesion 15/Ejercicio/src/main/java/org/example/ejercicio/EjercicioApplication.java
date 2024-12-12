package org.example.ejercicio;

import org.example.ejercicio.entity.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioApplication {

    public static void main(String[] args) {
        SpringApplication.run(EjercicioApplication.class, args);

        Menu menu = new Menu();

        menu.mostrarMenu();

    }
}