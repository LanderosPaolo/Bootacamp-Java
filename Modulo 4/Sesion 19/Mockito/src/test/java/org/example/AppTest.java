package org.example;

import org.example.models.Calculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class AppTest {
    Calculadora calculadora = mock(Calculadora.class);

    @Test
    @DisplayName("Test Sumar")
    public void testSumar() {
        when(calculadora.sumar(5, 5)).thenReturn(10);
    }

    @Test
    @DisplayName("Test Restar")
    void testRestar() {
        when(calculadora.restar(5, 5)).thenReturn(0);
    }

    @Test
    @DisplayName("Test Multiplicar")
    void testMultiplicar() {
        when(calculadora.multiplicar(5, 5)).thenReturn(25);
    }

    @Test
    @DisplayName("Test Dividir")
    void testDividir() {
        when(calculadora.dividir(5, 5)).thenReturn(1);
    }

    @Test
    @DisplayName("Test para verificar la invocación del método Dividir")
    void testVerificaDividir() {
        calculadora.dividir(1, 1);
        verify(calculadora).dividir(1, 1);
    }

    @Test
    @DisplayName("Test para verificar la cantidad de invocaciones al método Dividir")
    void testVerificaVecesrDividir() {
        for (int i = 0; i < 4; i++) {
            calculadora.dividir(1, 1);
        }
        calculadora.dividir(1, 1);
        verify(calculadora, times(5)).dividir(1, 1);
    }

    @Test
    @DisplayName("Test para verificar el orden de las invocaciones al método Dividir")
    void testVerificaOrdenDividir() {
        calculadora.dividir(1, 1);
        calculadora.sumar(2, 3);
        calculadora.restar(6, 5);
        calculadora.multiplicar(30, 2);

        InOrder enOrden = Mockito.inOrder(calculadora);
        enOrden.verify(calculadora).dividir(1, 1);
        enOrden.verify(calculadora).sumar(2, 3);
        enOrden.verify(calculadora).restar(6, 5);
        enOrden.verify(calculadora).multiplicar(30, 2);
    }
}

