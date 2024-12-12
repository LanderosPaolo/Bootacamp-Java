package main;
import java.util.Scanner;
import modelo.Cocina;
import modelo.Refrigerador;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Cocina cocina = new Cocina(150000,10, 4);
        Refrigerador refrigerador = new Refrigerador(170000, 7, "B", 2);

        do {
            System.out.println("¿Que producto desea comprar?");
            System.out.println("1.- Cocina");
            System.out.println("2.- Refrigerador");
            opcion = sc.nextByte();

            if (opcion == 1) {
                Integer total = cocina.cambiarPrecio();
                System.out.println("Valor: " + cocina.getPrecio());
                System.out.println("Cuenta con: " + cocina.getCantQuemadores() + " quemadores");
                System.out.println("Articulos disponibles: " + cocina.getCantDispo());
                System.out.println("Total a pagar: " + total);

                while(true) {
                    System.out.println("Presione Y para continuar, N para cancelar");
                    String continuar = sc.next().toLowerCase();
                    if (continuar.equals("y")) {
                        cocina.incluyeGas();
                        cocina.cantDisponible();
                        break;
                    } else if (continuar.equals("n")) {
                        System.out.println("Compra cancelada. Esperamos que vuelvas pronto!.");
                        break;
                    } else {
                        System.out.println("Entrada no válida. Intenta nuevamente.");
                    }
                }
            } else {
                Integer total = refrigerador.cambiarPrecio();
                System.out.println("Valor: " + refrigerador.getPrecio());
                System.out.println("Cuenta con: " + refrigerador.getNumPuertas() + " puertas");
                System.out.println("Gastlo electrico: " + refrigerador.getGastoElec());
                System.out.println("Articulos disponibles: " + refrigerador.getCantDispo());
                System.out.println("Total a pagar: " + total);

                while(true) {
                    System.out.println("Presione Y para continuar, N para cancelar");
                    String continuar = sc.next().toLowerCase();
                    if (continuar.equals("y")) {
                        System.out.println("Felicidades! ha comprado su refrigerador.");
                        refrigerador.cantDisponible();
                        break;
                    } else if (continuar.equals("n")) {
                        System.out.println("Compra cancelada, Esperamos que vuelvas pronto!.");
                        break;
                    } else {
                        System.out.println("Entrada no válida. Intenta nuevamente.");
                    }
                }
            }

        } while (opcion != 1 && opcion != 2);
    }
}