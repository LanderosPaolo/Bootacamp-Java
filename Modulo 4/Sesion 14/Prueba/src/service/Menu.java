package service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    Auxiliar aux = new Auxiliar();

    public void mostrarMenu() {
        int opcion;
        try {
            do {
                System.out.println("\nSocios en sistema:");
                aux.cantidadSocios();
                System.out.println("Opciones: ");
                System.out.println("1. Ingresar nuevo socio");
                System.out.println("2. Salir");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        aux.agregarSocio();
                        break;
                    case 2:
                        System.out.println("Hasta pronto!");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } while (opcion != 2);
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Por favor ingrese una opción numérica");
        }
    }
}
