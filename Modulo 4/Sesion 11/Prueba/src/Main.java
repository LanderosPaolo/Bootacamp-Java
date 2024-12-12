import interfaces.MetodoPagoInterface;
import menus.Menu;
import modelsAdministrador.Administrador;
import modelsPago.MetodoPago;
import modelsPeliculas.ListaPeliculas;
import modelsPeliculas.Pelicula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        String nombrePelicula;

        //Creamos al administrador
        Administrador administrador = Administrador.getInstance();
        administrador.inicializar("Francisco Puentes");

        //Creamos la lista de peliculas con las peliculas para el ejemplo
        ListaPeliculas listaPeliculas = new ListaPeliculas();
        listaPeliculas.agregarPelicula(new Pelicula("Star Wars", 1977, true));
        listaPeliculas.agregarPelicula(new Pelicula("Star Trek", 1979, true));
        listaPeliculas.agregarPelicula(new Pelicula("Dune", 1984, false));

        //Creamos los metodos de pago
        MetodoPagoInterface metodoPagoDebito = MetodoPago.getFormasPago(MetodoPago.FormasPago.Debito);
        MetodoPagoInterface metodoPagoEfectivo = MetodoPago.getFormasPago(MetodoPago.FormasPago.Efectivo);

        //Metodos para el menu
        Menu menu = new Menu();

        System.out.println("Bienvenido a Video Club Nostalgia " + administrador.getNombre());
        do {
            menu.mostrarMenuPrincipal();
            opcion = menu.guardarOpcion();
            switch (opcion) {
                case 1:
                    listaPeliculas.mostrarTotalPeliculas();
                    break;
                case 2:
                    listaPeliculas.mostrarPeliculasDisponibles();
                    break;
                case 3:
                    System.out.println("Ingrese el nombre de la pelicula que desea arrendar: ");
                    nombrePelicula = sc.nextLine();
                    menu.mostrarMenuArrendar(nombrePelicula, listaPeliculas, metodoPagoDebito, metodoPagoEfectivo);
                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la pelicula que desea devolver: ");
                    nombrePelicula = sc.nextLine();
                    menu.devolverPelicula(nombrePelicula, listaPeliculas);
                    break;

                case 5:
                    System.out.println("Hasta luego!");
                    break;
            }
        } while (opcion != 5);
    }
}