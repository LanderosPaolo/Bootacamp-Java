package menus;

import interfaces.MetodoPagoInterface;
import modelsPeliculas.ListaPeliculas;
import modelsPeliculas.Pelicula;

import java.util.Scanner;

public class Menu {
    private Scanner sc;

    public Menu() {
        sc = new Scanner(System.in);
    }

    public void mostrarMenuPrincipal() {
        System.out.println("Selecciona la opción que desees: ");
        System.out.println("1.- Ver lista de peliculas");
        System.out.println("2.- Ver lista de peliculas disponibles");
        System.out.println("3.- Arrendar pelicula");
        System.out.println("4.- Devolver pelicula");
        System.out.println("5.- Salir");
    }

    public void mostrarMenuArrendar(String nombrePelicula, ListaPeliculas listaPeliculas, MetodoPagoInterface metodoPagoDebito, MetodoPagoInterface metodoPagoEfectivo) {
        int opcion;
        boolean encontrada = false;
        for(Pelicula p : listaPeliculas.getPeliculas()) {
            if(p.getTitulo().equals(nombrePelicula)) {
                encontrada = true;

                if (p.isDisponible() == true) {
                    System.out.println("Seleccione medio de pago");
                    System.out.println("1.- Debito");
                    System.out.println("2.- Efectivo");
                    opcion = guardarOpcion();

                    switch (opcion) {
                        case 1:
                            System.out.println("Pelicula: " + p.getTitulo() + " ha sido arrendada exitosamente");
                            System.out.println(metodoPagoDebito.pago());
                            p.setDisponible(false);
                            break;
                        case 2:
                            System.out.println("Pelicula: " + p.getTitulo() + " ha sido arrendada exitosamente");
                            System.out.println(metodoPagoEfectivo.pago());
                            p.setDisponible(false);
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                } else {
                    System.out.println("Pelicula: " + nombrePelicula + " no se encuentra disponible");
                }
                break;
            }
        }

        if(!encontrada) {
            System.out.println("Pelicula: " + nombrePelicula + " no existe");
        }
    }

    public void devolverPelicula(String nombrePelicula, ListaPeliculas listaPeliculas) {
        for (Pelicula p : listaPeliculas.getPeliculas()) {
            if (p.getTitulo().equals(nombrePelicula)) {
                if (p.isDisponible() == false) {
                    System.out.println("Gracias por devolver la pelicula");
                    p.setDisponible(true);
                } else {
                    System.out.println("La película ya está disponible, no es necesario devolverla.");
                }
                break;
            }
        }
    }

    public int guardarOpcion() {
        int opcion = sc.nextInt();
        return opcion;
    }
}
