package org.example.ejercicio2;

import org.example.ejercicio2.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioApplication implements CommandLineRunner {

    private final Menu menu;

    @Autowired
    public EjercicioApplication(Menu menu) {
        this.menu = menu;
    }

    public static void main(String[] args) {
        SpringApplication.run(EjercicioApplication.class, args);
    }

    @Override
    public void run(String... args) {
        menu.mostrarMenu();
    }
}
