package interfaces;

import models.Productos;

import java.util.ArrayList;

public interface IProductos {
    void verListaProductos();
    void agregarProductoCarrito(ArrayList<Productos> carrito);
    void generarBoleta(ArrayList<Productos> carrito);
}
