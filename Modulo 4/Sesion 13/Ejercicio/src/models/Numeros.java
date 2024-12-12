package models;

import interfaces.INumeros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numeros implements INumeros {
    private double num;

    public Numeros(double num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Numeros{" +
                "num=" + num +
                '}';
    }

    @Override
    public void leerValores(ArrayList<Integer> listaNumeros) {
        Scanner sc = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Ingrese el numero: ");
            numero = sc.nextInt();
            if (numero == -99) {
                break;
            }
            listaNumeros.add(numero);
        }
        System.out.println("Los números ingresados son: ");
        listaNumeros.stream().forEach(System.out::println);
    }

    @Override
    public int calcularSuma(ArrayList<Integer> listaNumeros) {
        int suma = listaNumeros.stream().reduce(0, (a, b) -> a + b);
        return suma;
    }

    @Override
    public void mostrarResultados(ArrayList<Integer> listaNumeros) {
        double suma = calcularSuma(listaNumeros);
        double media = suma / listaNumeros.size();
        List<Integer> mayorALaMedia = listaNumeros.stream().filter(num -> num > media).collect(Collectors.toList());
        List<Integer> menorALaMedia = listaNumeros.stream().filter(num -> num < media).collect(Collectors.toList());
        System.out.println("La suma de todos los números es: " + suma);
        System.out.println("La media es: " + media);
        System.out.println("Los números mayores a la media son: " + mayorALaMedia.stream().count());
        System.out.println("Los números menores a la media son: " + menorALaMedia.stream().count());
    }
}
