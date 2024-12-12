package org.example;


import org.example.models.Calculadora;

public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.sumar(15, 30); // 45
        calculadora.restar(15, 5); // 10
        calculadora.multiplicar(3, 34); // 102
        calculadora.dividir(8, 4); // 2
    }
}

