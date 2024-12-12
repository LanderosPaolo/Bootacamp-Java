package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Auxiliar {
    private List<Integer> numerador;
    private List<Integer> denominador;

    public Auxiliar() {
        this.numerador = new ArrayList<>();
        this.denominador = new ArrayList<>();

        //Agregando los numeradores predeterminados
        Collections.addAll(numerador, 4, 8, 16, 32, 64, 128, 256, 512);
        //Agregando los denominadores predeterminados
        Collections.addAll(denominador, 2, 0, 4, 4, 0, 8);
    }

    public List<Integer> getNumerador() {
        return numerador;
    }

    public List<Integer> getDenominador() {
        return denominador;
    }

    //Metodo para dividir
    public static void dividir(List<Integer> numeradores, List<Integer> denominadores) {

        for (int i = 0; i < numeradores.size(); i++) {
            try {
                int resultado = numeradores.get(i) / denominadores.get(i);
                System.out.println("La division entre " + "'" + numeradores.get(i) + "'" + " y " + "'" + denominadores.get(i) + "'" + "es: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir por cero.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Fuera de limite en la matriz.");
                break;
            }
        }
    }
}