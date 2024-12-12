import models.Bolsa;
import models.Polera;
import models.Zapato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        //creacion de variables
        String marcaZapato, colorPolera;
        int idZapato = 1, idPolera = 1, idZapatoEliminar;
        boolean encontrado = false;

        //Creacion de la lista
        Bolsa<Zapato> bolsaZapato = new Bolsa<>();
        Bolsa<Polera> bolsaPolera = new Bolsa<>();

        System.out.println("Ingrese el tamaño de la bolsa: ");
        int bolsa = sc.nextInt();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nQue deseas guardar en la bolsa?");
            System.out.println("*Recuerda que el tamaño de la bolsa es " + bolsa + "*");
            System.out.println("1.- Zapatos");
            System.out.println("2.- Poleras");
            System.out.println("3.- Eliminar producto de la bolsa ");
            System.out.println("4.- Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (bolsaZapato.bolsa.size() < bolsa) {
                        System.out.println("\nMarca del zapato: ");
                        marcaZapato = sc.next();
                        bolsaZapato.agregarProducto(new Zapato(marcaZapato, idZapato));
                        idZapato++;
                    } else {
                        System.out.println("\n--> La bolsa de zapatos está llena <--");
                    }
                    break;
                case 2:
                    if (bolsaPolera.bolsa.size() < bolsa) {
                        System.out.println("Color de la polera: ");
                        colorPolera = sc.next();
                        bolsaPolera.agregarProducto(new Polera(colorPolera, idPolera));
                        idPolera++;
                    } else {
                        System.out.println("\n--> La bolsa de poleras está llena <--");
                    }
                    break;
                case 3:
                    System.out.println("\nQue deseas eliminar de la bolsa?");
                    System.out.println("1.- Zapatos");
                    System.out.println("2.- Poleras");
                    System.out.println("3.- Volver al menú");
                    opcion = sc.nextInt();
                    switch (opcion) {

                        case 1:
                            if (bolsaZapato.bolsa.isEmpty()) {
                                System.out.println("\n--> Esta bolsa se encuentra sin articulos <--");
                                continue;
                            } else {
                                System.out.println("\nProductos en la bolsa de zapatos: ");
                                bolsaZapato.mostrarProductos();

                                System.out.println("\nIngrese el ID del zapato a borrar: ");
                                idZapatoEliminar = sc.nextInt();

                                for (Zapato zapato : bolsaZapato.bolsa) {
                                    if (zapato.getId() == idZapatoEliminar) {
                                        bolsaZapato.eliminarProducto(zapato);
                                        System.out.println("\n----------------------------");
                                        System.out.println("Zapato eliminado de la bolsa");
                                        System.out.println("----------------------------\n");
                                        encontrado = true;
                                        break;
                                    }
                                }

                                if(!encontrado) {
                                    System.out.println("--> Ese articulo no se encuentra en la bolsa <--");
                                    continue;
                                }
                            }
                            break;

                        case 2:
                            if (bolsaPolera.bolsa.isEmpty()) {
                                System.out.println("\n--> Esta bolsa se encuentra sin articulos <--");
                                continue;
                            } else {
                                System.out.println("\nProductos en la bolsa de poleras: ");
                                bolsaPolera.mostrarProductos();

                                System.out.println("\nIngrese el ID del zapato a borrar: ");
                                idZapatoEliminar = sc.nextInt();

                                for (Polera polera : bolsaPolera.bolsa) {
                                    if (polera.getId() == idZapatoEliminar) {
                                        bolsaPolera.eliminarProducto(polera);
                                        System.out.println("\n-----------------------------");
                                        System.out.println("\nPolera eliminada de la bolsa");
                                        System.out.println("-----------------------------\n");
                                        encontrado = true;
                                        break;
                                    }
                                }

                                if(!encontrado) {
                                    System.out.println("--> Ese articulo no se encuentra en la bolsa <--");
                                    continue;
                                }
                            }
                            break;

                        case 3:
                            System.out.println("\nVolviendo al menú. espere unos segundos...");
                            Thread.sleep(1000);
                            continue;

                        default:
                            System.out.println("\nOpcion no valida.");
                    }
                case 4:
                    continuar = false;
                    System.out.println("Vuelve pronto!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

        //Productos en la bolsa
        if (bolsaZapato.bolsa.isEmpty()) {
            System.out.println("\nBolsa de zapatos: ");
            System.out.println("--> Esta bolsa se encuentra sin articulos <--");
        } else {
            System.out.println("\nBolsa de zapatos: ");
            bolsaZapato.mostrarProductos();

        }

        if (bolsaPolera.bolsa.isEmpty()) {
            System.out.println("\nBolsa de poleras: ");
            System.out.println("--> Esta bolsa se encuentra sin articulos <--");
        } else {
            System.out.println("\nBolsa de poleras: ");
            bolsaPolera.mostrarProductos();
        }

        sc.close();
    }
}