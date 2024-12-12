package org.example.auxiliar;

import org.example.service.BromaService;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    BromaService bs = new BromaService();

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
                        bs.obtenerBroma();
                        break;
                    case 2:
                        bs.obtenerBromas();
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
