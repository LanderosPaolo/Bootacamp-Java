package models;

import interfaces.IProductos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Productos implements IProductos {
    private String nombre;
    private int precio;
    private String codigo;

    public Productos(String nombre, int precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    @Override
    public void verListaProductos() {
        String nombreFichero = "listaProductos.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
            String data;

            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
            br.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void agregarProductoCarrito(ArrayList<Productos> carrito) {
        Scanner sc = new Scanner(System.in);
        String listaProductos = "listaProductos.txt";
        ArrayList<Productos> productos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(listaProductos))) {
            String data;
            while ((data = br.readLine()) != null) {
                String[] partes = data.split(" / ");
                if (partes.length == 3) {
                    String nombre = partes[0].trim();
                    int precio = Integer.parseInt(partes[1].trim());
                    String codigo = partes[2].trim();
                    productos.add(new Productos(nombre, precio, codigo));
                }
            }
        } catch (Exception e) {
            System.out.println("Error al cargar los productos: " + e.getMessage());
            return;
        }

        System.out.println("Ingresa el código del producto: ");
        String codigo = sc.nextLine();

        for (Productos producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                carrito.add(producto);
                System.out.println("\n---------------------------------------");
                System.out.println("El producto: " + producto.getNombre());
                System.out.println("Se ha agregado correctamente al carrito");
                System.out.println("----------------------------------------\n");
                return;
            }
        }
        System.out.println("Código no encontrado. Por favor intenta nuevamente.");
    }

    public void generarBoleta(ArrayList<Productos> carrito) {
        if (carrito.isEmpty()) {
            System.out.println("El carrito está vacío. No se puede generar una boleta.");
            return;
        }

        int total = 0;
        String boletaArchivo = "boleta.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(boletaArchivo))) {
            bw.write("---- Boleta de compra ----\n");
            for (Productos producto : carrito) {
                total += producto.getPrecio();
            }
            bw.write("\nTotal cancelado: $" + total);
            bw.write("\nEl detalle de su compra es: \n");
            for (Productos producto : carrito) {
                bw.write(producto.toString() + "\n");
            }
            bw.write("\nGracias por preferirnos");
            System.out.println("Boleta generada en " + boletaArchivo);
        } catch (Exception e) {
            System.out.println("Error al generar la boleta: " + e.getMessage());
        }
    }
}