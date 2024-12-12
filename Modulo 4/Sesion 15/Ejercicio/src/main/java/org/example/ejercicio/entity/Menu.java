package org.example.ejercicio.entity;

import java.util.Scanner;

import org.example.ejercicio.service.ApiService;

public class Menu {
    Scanner sc = new Scanner(System.in);

    ApiService api = new ApiService();

    public void mostrarMenu() {
        try {
            do {
                System.out.println("Welcome to practice program.");
                System.out.println("Select an option:");
                System.out.println("1.- One random joke.");
                System.out.println("2.- 10 random joke.");
                System.out.println("3.- Exit program");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        String broma = api.obtenerUnaBroma();
                        System.out.println(broma);
                        break;
                    case 2:
                        String bromas = api.obtenerBromas();
                        System.out.println(bromas);
                        break;
                    case 3:
                        System.out.println("Closing program...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
            } while (true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
