package org.example;

import org.example.models.Calculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@DisplayName("Tests para la clase Calculadora")
public class AppTest {

    //private final Calculadora calculadora = new Calculadora();
    Calculadora calculadora = mock(Calculadora.class);

    @Test
    @DisplayName("Test Sumar")
    public void testSumar() {
        //assertEquals(10, calculadora.sumar(5, 5));
        when(calculadora.sumar(5, 5)).thenReturn(10);
    }

    /*@Test
    @DisplayName("Test Restar")
    public void testRestar() {
        //assertEquals(0, calculadora.restar(5, 5));
        when(calculadora.restar(5, 5)).thenReturn(0);
    }

    @Test
    @DisplayName("Test Multiplicar")
    public void testMultiplicar() {
        //assertEquals(25, calculadora.multiplicar(5, 5));
        when(calculadora.multiplicar(5, 5)).thenReturn(25);
    }

    @Test
    @DisplayName("Test Dividir")
    public void testDividir() {
        //assertEquals(1, calculadora.dividir(5, 5));
        when(calculadora.dividir(5, 5)).thenReturn(1);
    }*/
}
