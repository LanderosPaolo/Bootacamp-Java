package models;

import java.util.ArrayList;

public class Bolsa<T> {
    public ArrayList<T> bolsa;

    public Bolsa() {
        this.bolsa = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        bolsa.add(producto);
    }

    public void mostrarProductos() {
        for (T producto : bolsa) {
            System.out.println(producto);
        }
    }

    public void eliminarProducto(T producto) {
        bolsa.remove(producto);
    }

}
