package org.example;

import junit.framework.TestCase;
import org.example.models.Mercado;
import org.example.models.Producto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Prueba para metodos")
public class AppTest extends TestCase {

    @Test
    @DisplayName("Test para crearAviso")
    public void testCrearAviso() {
        Producto producto = new Producto("", 0, "", "");
        Producto nuevoProducto = producto.crearAviso("Computadora X", 111, "Nuevo", "$500.000");
        assertNotNull(String.valueOf(nuevoProducto));
    }

    @Test
    @DisplayName("Test para los valores de crearAviso")
    public void testCrearAvisoValues() {
        Producto producto = new Producto("", 0, "", "");
        Producto nuevoProducto = producto.crearAviso("Computadora X", 111, "Nuevo", "$500.000");
        assertEquals("Computadora X", nuevoProducto.getNombre());
        assertEquals(111, nuevoProducto.getIdProducto());
        assertEquals("Nuevo", nuevoProducto.getCondicion());
        assertEquals("$500.000", nuevoProducto.getPrecio());
    }

    @Test
    @DisplayName("Test para publicarAviso")
    public void testPublicarAvisoNotNull() {
        List<Producto> productos = new ArrayList<>();
        Mercado mercado = new Mercado(productos);
        Producto nuevoProducto = new Producto("Computadora X", 111, "Nuevo", "$500.000");
        List<Producto> resultado = mercado.publicarAviso(nuevoProducto);
        assertNotNull(resultado);
    }

    @Test
    @DisplayName("Test para que publicarAviso agrega el producto")
    public void testPublicarAvisoAddsProduct() {
        List<Producto> productos = new ArrayList<>();
        Mercado mercado = new Mercado(productos);
        Producto nuevoProducto = new Producto("Computadora X", 111, "Nuevo", "$500.000");
        mercado.publicarAviso(nuevoProducto);
        assertEquals(1, mercado.getProductos().size());
        assertEquals(nuevoProducto, mercado.getProductos().get(0));
    }
}
