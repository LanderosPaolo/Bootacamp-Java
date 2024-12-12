package main;

import model.Producto;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, valor, modificar, elemento;
        int capacidadMaxima = 7;
        String nombre, descripcion;
        ArrayList<Producto> producto = new ArrayList<>();

        // Productos iniciales en la lista
        producto.add(new Producto("Chocolate", 500, "Chocolate amargo, 500gr."));
        producto.add(new Producto("Leche", 800, "Leche entera, 1 litro."));
        producto.add(new Producto("Arroz", 900, "Arroz grado 2, 1 kilo."));

        do {
            System.out.println("\nElija una opción: ");
            System.out.println("1- Ver productos");
            System.out.println("2- Agregar producto");
            System.out.println("3- Modificar producto");
            System.out.println("4- Salir");

            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea después de leer la opción

            switch (opcion) {
                case 1:
                    System.out.println("Estos son los productos:");
                    for (int i = 0; i < producto.size(); i++) {
                        System.out.println("Producto: " + producto.get(i).getNombre() + " - " + producto.get(i).getValor() + " - " + producto.get(i).getDescripcion());
                    }
                    break;

                case 2:
                    if (producto.size() < capacidadMaxima) {
                        // Solicitamos información para el nuevo producto
                        System.out.println("Ingresa el nombre del producto: ");
                        nombre = sc.nextLine();
                        System.out.println("Ingresa el valor del producto: ");
                        valor = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingresa una descripción del producto: ");
                        descripcion = sc.nextLine();
                        // Agregamos el nuevo producto al arreglo
                        producto.add(new Producto(nombre, valor, descripcion));
                        // Mensaje de que se cumplió el objetivo
                        System.out.println("----> Producto agregado con éxito <----");
                        System.out.println("---------------------------------------");
                    } else {
                        System.out.println("----> Datos máximos alcanzados, intente más tarde <----");
                        System.out.println("-------------------------------------------------------");
                    }
                    break;

                case 3:
                    System.out.println("¿Qué producto deseas modificar?");
                    System.out.println("Selecciona el número del producto: ");
                    for (int i = 0; i < producto.size(); i++) {
                        System.out.println((i + 1) + " " + producto.get(i).getNombre());
                    }
                    modificar = sc.nextInt();
                    sc.nextLine();
                    System.out.println("¿Qué deseas modificar en el producto?: ");
                    System.out.println("Selecciona un número para modificar ");
                    if (modificar <= 0 || modificar > producto.size()) {
                        System.out.println("Opción inválida.");
                        break;
                    }
                    Producto productoAModificar = producto.get(modificar - 1);
                    System.out.println("1- Nombre");
                    System.out.println("2- Valor");
                    System.out.println("3- Descripción");
                    elemento = sc.nextInt();
                    sc.nextLine();

                    switch (elemento) {
                        case 1:
                            System.out.println("Introduce el nuevo nombre: ");
                            String nuevoNombre = sc.nextLine();
                            productoAModificar.setNombre(nuevoNombre);
                            System.out.println("Nombre modificado con éxito.");
                            break;

                        case 2:
                            System.out.println("Introduce el nuevo valor: ");
                            int nuevoValor = sc.nextInt();
                            sc.nextLine();
                            productoAModificar.setValor(nuevoValor);
                            System.out.println("Valor modificado con éxito.");
                            break;

                        case 3:
                            System.out.println("Introduce la nueva descripción: ");
                            String nuevaDescripcion = sc.nextLine();
                            productoAModificar.setDescripcion(nuevaDescripcion);
                            System.out.println("Descripción modificada con éxito.");
                            break;

                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    System.out.println("----> Producto modificado <----");
                    System.out.println("------------------------------");
                    break;

                case 4:
                    System.out.println("Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);
        sc.close();
    }
}