import models.Numeros;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros(0);

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        numeros.leerValores(listaNumeros);
        numeros.mostrarResultados(listaNumeros);
    }
}