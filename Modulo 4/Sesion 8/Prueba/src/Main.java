import models.*;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        //Variables generales
        int opcion, total = 0;
        String producto;

        //Variables para guardar nombre y rut de vendedor
        String nombre, rut;

        //Productos
        Vegetales vegetal1 = new Vegetales("Zanahoria", "veg1", 500, LocalDate.of(2024, 9, 27), LocalDate.of(2024, 10, 2));
        Vegetales vegetal2 = new Vegetales("Lechuga", "veg2", 500, LocalDate.of(2024, 10, 2), LocalDate.of(2024, 10, 7));
        Vegetales vegetal3 = new Vegetales("Papa", "veg3", 700, LocalDate.of(2024, 10, 7), LocalDate.of(2024, 10, 12));

        Vestuarios vestuarios1 = new Vestuarios("Polera", "ves4", 12000, "M", "Rojo");
        Vestuarios vestuarios2 = new Vestuarios("Poleron", "ves5", 22000, "L", "Negro");
        Vestuarios vestuarios3 = new Vestuarios("Pantalon", "ves6", 18000, "42", "Azul");

        //Guardar vendedor
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su rut");
        rut = sc.nextLine();
        Vendedor vendedor = new Vendedor(nombre, rut);
        System.out.println("Bienvenido/a " + vendedor.getNombre() + "\n");

        //Arreglos para los productos y carrito de compra
        Vegetales[] vegetales = new Vegetales[3];
        vegetales[0] = vegetal1;
        vegetales[1] = vegetal2;
        vegetales[2] = vegetal3;

        Vestuarios[] vestuarios = new Vestuarios[3];
        vestuarios[0] = vestuarios1;
        vestuarios[1] = vestuarios2;
        vestuarios[2] = vestuarios3;

        HashMap<String, Integer> carritoCompras = new HashMap<>();

        //bucle para el menú
        do {
            System.out.println("Que desea hacer?: ");
            System.out.println("1.- Mostrar lista de productos");
            System.out.println("2.- Comprar");
            System.out.println("3.- Ver carrito de compras");
            System.out.println("4.- Pagar");
            System.out.println("5.- Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    //Separamos los productos y creamos otros menú
                    do {
                        System.out.println("Que productos deseas ver?: ");
                        System.out.println("1.- Vegetales");
                        System.out.println("2.- Vestuario");
                        System.out.println("3.- Volver");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                for (int i = 0; i < vegetales.length; i++) {
                                    System.out.println(vegetales[i]);
                                }
                                break;
                            case 2:
                                for (int i = 0; i < vestuarios.length; i++) {
                                    System.out.println(vestuarios[i]);
                                }
                                break;
                            case 3:
                                System.out.println("Cargando... \n");
                                Thread.sleep(1000);
                                break;
                            default:
                                break;
                        }
                    } while (opcion != 3);
                    break;

                case 2:
                    if (carritoCompras.size() < 10) {
                        boolean seguirComprando = true;
                        while (seguirComprando) {
                            System.out.println("Ingrese el codigo del producto que desea comprar: ");
                            producto = sc.next();
                            boolean existe = false;

                            for (Vegetales vegetal : vegetales) {
                                //Recorremos el arreglo y agregamos el producto en caso de existir
                                if (producto.equals(vegetal.getCodigo())) {
                                    carritoCompras.put(vegetal.getNombre(), vegetal.getPrecio());
                                    System.out.println("Producto agregado exitosamente");
                                    existe = true;
                                    break;
                                }
                            }
                            //Recorremos el segundo arreglo en caso de no encontrar el producto en el primer arreglo
                            if (!existe) {
                                for (Vestuarios vestuario : vestuarios) {
                                    if (producto.equals(vestuario.getCodigo())) {
                                        carritoCompras.put(vestuario.getNombre(), vestuario.getPrecio());
                                        System.out.println("Producto agregado exitosamente");
                                        existe = true;
                                        break;
                                    }
                                }
                            }
                            //Si no encuentra productos en el segundo arreglo me da el mensaje de error "Producto desconocido"
                            if (!existe) {
                                System.out.println("Producto desconocido");
                            }
                            //Preguntamos si queremos agregar mas productos
                            System.out.println("Desea agregar más productos? (1: Sí, 2: No)");
                            int decision = sc.nextInt();
                            seguirComprando = (decision == 1);
                        }
                        break;

                    } else {
                        System.out.println("Carro de compras lleno");
                    }

                case 3:
                    if (carritoCompras.size() == 0) {
                        System.out.println("\n---------------------------------------");
                        System.out.println("Total a pagar: $" + total);
                        System.out.println("---------------------------------------\n");
                    } else {
                        System.out.println("\nProductos en el carro: ");
                        System.out.println("-----------------------------------------------------------");
                        for (HashMap.Entry<String, Integer> carrito : carritoCompras.entrySet()) {
                            System.out.println("Producto= " + carrito.getKey() + ", Precio= $" + carrito.getValue());
                        }
                        System.out.println("-----------------------------------------------------------\n");
                    }
                    break;
                case 4:
                    if (carritoCompras.size() == 0) {
                        System.out.println("\n---------------------------------------");
                        System.out.println("No hay productos en el carro de compras");
                        System.out.println("---------------------------------------\n");
                    } else {
                        System.out.println("\nProductos a pagar: ");
                        System.out.println("-----------------------------------------------------------");
                        for (HashMap.Entry<String, Integer> carrito : carritoCompras.entrySet()) {
                            System.out.println("Producto= " + carrito.getKey() + ", Precio= $" + carrito.getValue());
                        }
                        System.out.println("-----------------------------------------------------------\n");

                        // calculamos el total
                        total = 0;
                        for (HashMap.Entry<String, Integer> carrito : carritoCompras.entrySet()) {
                            total = total + carrito.getValue();
                        }

                        System.out.println("El total a pagar es de: $" + total);
                        System.out.println("Procesando el pago...\n");

                        // simulamos la espera al pagar
                        Thread.sleep(1000);

                        // Mostramos los datos del vendedor y el total pagado
                        System.out.println("------------------------------------------");
                        System.out.println("Pago realizado con éxito.");
                        System.out.println("Total cancelado: $" + total);
                        System.out.println("Datos del vendedor:");
                        System.out.println("Nombre: " + vendedor.getNombre());
                        System.out.println("RUT: " + vendedor.getRut());
                        System.out.println("------------------------------------------\n");

                        // despues de pagar el carro queda vacio
                        total = 0;
                        carritoCompras.clear();
                    }
                    break;
                case 5:
                    System.out.println("Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 5);
    }
}