package main;

import model.Auto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        String marca, modelo, color;
        int velocidadMaxima;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la marca del vehiculo: ");
        marca = sc.next();
        System.out.println("Ingrese el modelo del vehiculo: ");
        modelo = sc.next();
        System.out.println("Ingrese el color del vehiculo: ");
        color = sc.next();
        System.out.println("Ingrese la velocidad maxima de su vehiculo: ");
        velocidadMaxima = sc.nextInt();

        Auto auto1 = new Auto(marca, modelo, color, velocidadMaxima, false);

        System.out.println("Felicidades por su nuevo auto " + auto1);
        while (opcion != 4) {
            System.out.println("Seleccione que desea hacer: ");
            System.out.println("1.- Encender auto");
            System.out.println("2.- Apagar auto");
            System.out.println("3.- Acelerar auto");
            System.out.println("4.- salir");
            opcion = sc.nextInt();

            if (opcion < 1 || opcion > 4) {
                System.out.print("Opcion no valida, vuelva a intentar.\n");
            } else {
                switch (opcion) {
                    case 1:
                        auto1.encenderAuto();
                        break;

                    case 2:
                        auto1.apagarAuto();
                        break;

                    case 3:
                        auto1.acelerarAuto();
                        break;

                    case 4:
                        System.out.println("Saliendo...");
                }
            }

        }
        sc.close();
    }
}