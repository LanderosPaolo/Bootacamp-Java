package org.example.models;

public class Producto {
    private String nombre;
    private int idProducto;
    private String condicion;
    private String precio;

    public Producto(String nombre, int idProducto, String condicion, String precio) {
        this.nombre = nombre;
        this.idProducto = idProducto;
        this.condicion = condicion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getCondicion() {
        return condicion;
    }

    public String getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", idProducto=" + idProducto +
                ", condicion='" + condicion + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }

    public Producto crearAviso(String nombre, int idProducto, String condicion, String precio) {
        Producto producto = new Producto(nombre, idProducto, condicion, precio);
        return producto;
    }
}
