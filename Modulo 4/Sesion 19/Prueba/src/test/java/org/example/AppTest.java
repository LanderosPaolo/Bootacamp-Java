package org.example;

import org.example.models.Mercado;
import org.example.models.Producto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@DisplayName("Test para las clases de Producto y Mercado")
public class AppTest {

    @Test
    @DisplayName("Test para verificar el orden de las invocaciones para los objetos Producto y Mercado")
    void testOrden() {
        Producto productoMock = mock(Producto.class);
        Mercado mercadoMock = mock(Mercado.class);

        Producto nuevoProducto = new Producto("Computadora X", 111, "Nuevo", "$500.000");

        when(productoMock.crearAviso("Computadora X", 111, "Nuevo", "$500.000"))
                .thenReturn(nuevoProducto);

        List<Producto> productosMock = new ArrayList<>();
        productosMock.add(nuevoProducto);
        when(mercadoMock.publicarAviso(nuevoProducto))
                .thenReturn(productosMock);

        Producto productoCreado = productoMock.crearAviso("Computadora X", 111, "Nuevo", "$500.000");
        mercadoMock.publicarAviso(productoCreado);

        InOrder inOrder = inOrder(productoMock, mercadoMock);
        inOrder.verify(productoMock).crearAviso("Computadora X", 111, "Nuevo", "$500.000");
        inOrder.verify(mercadoMock).publicarAviso(productoCreado);

        assertNotNull(productoCreado);
        assertEquals("Computadora X", productoCreado.getNombre());
        assertEquals(productosMock, mercadoMock.publicarAviso(nuevoProducto));
    }

    @Test
    @DisplayName("Test crearAviso()")
    void testCrearAviso() {
        Producto productoMock = mock(Producto.class);

        when(productoMock.crearAviso("Computadora X", 111, "Nuevo", "$500000"))
                .thenReturn(new Producto("Computadora X", 111, "Nuevo", "$500000"));

        Producto producto = productoMock.crearAviso("Computadora X", 111, "Nuevo", "$500000");

        verify(productoMock).crearAviso("Computadora X", 111, "Nuevo", "$500000");

        assertEquals("Computadora X", producto.getNombre());
        assertEquals(111, producto.getIdProducto());
        assertEquals("Nuevo", producto.getCondicion());
        assertEquals("$500000", producto.getPrecio());
    }

    @Test
    @DisplayName("Test publicarAviso()")
    void testPublicarAviso() {
        Mercado mercadoMock = mock(Mercado.class);

        Producto nuevoProducto = new Producto("Computadora X", 111, "Nuevo", "$500.000");

        List<Producto> productosMock = new ArrayList<>();
        productosMock.add(nuevoProducto);
        when(mercadoMock.publicarAviso(nuevoProducto)).thenReturn(productosMock);

        List<Producto> resultado = mercadoMock.publicarAviso(nuevoProducto);

        verify(mercadoMock).publicarAviso(nuevoProducto);

        assertNotNull(resultado);
    }


}
