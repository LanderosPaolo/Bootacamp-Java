
import models.Productos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        Productos productos = new Productos("", 0, "");
        ArrayList<Productos> carrito = new ArrayList<>();

        //Menú
        do {
            System.out.println("\nQue desea hacer?:");
            System.out.println("1.- Ver lista de productos disponibles");
            System.out.println("2.- Agregar un producto a mi lista de compras");
            System.out.println("3.- Pagar");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("---> Lista de productos disponibles <---");
                    productos.verListaProductos();
                    break;
                case 2:
                    System.out.println("--> Estas agregando un producto al carrito <--");
                    productos.agregarProductoCarrito(carrito);
                    break;
                case 3:
                    System.out.println("Procesando pago");
                    productos.generarBoleta(carrito);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 3);

    }
}