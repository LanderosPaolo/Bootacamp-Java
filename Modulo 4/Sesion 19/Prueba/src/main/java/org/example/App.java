package org.example;

import org.example.models.Mercado;
import org.example.models.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        List<Producto> listaProductos = new ArrayList<>();
        Mercado mercado = new Mercado(listaProductos);

        while (true) {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Publicar aviso");
            System.out.println("2. Ver lista de productos");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el nombre de su producto:");
                    String nombre = sc.nextLine();
                    System.out.println("Introduzca el ID de su producto:");
                    int idProducto = sc.nextInt();
                    sc.nextLine();
                    System.out.println("¿Cuál es la condición de su producto?");
                    String condicion = sc.nextLine();
                    System.out.println("¿Cuál es el precio de su producto?");
                    String precio = sc.nextLine();

                    Producto nuevoProducto = new Producto(nombre, idProducto, condicion, precio);
                    mercado.publicarAviso(nuevoProducto);
                    break;
                case 2:
                    mercado.verTodoAviso();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}