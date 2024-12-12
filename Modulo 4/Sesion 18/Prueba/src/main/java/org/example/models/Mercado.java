package org.example.models;

import java.util.List;

public class Mercado {
    private List<Producto> productos;

    public Mercado(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public String toString() {
        return "Mercado{" +
                "productos=" + productos +
                '}';
    }

    public List<Producto> publicarAviso(Producto nuevoProducto) {
        productos.add(nuevoProducto);
        System.out.println("Su producto ha sido subido al mercado online.");
        return productos;
    }

    public void verTodoAviso() {
        System.out.println("Los productos disponibles en el mercado ahora son:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
