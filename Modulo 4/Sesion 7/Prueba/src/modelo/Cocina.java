package modelo;

import interfaces.CocinaInterface;
import java.util.Scanner;

public class Cocina extends Producto implements CocinaInterface {
    Scanner sc = new Scanner(System.in);
    private int cantQuemadores;
    private int cantidad;

    public Cocina(Integer precio, Integer cantDispo, int cantQuemadores) {
        super(precio, cantDispo);
        this.cantQuemadores = cantQuemadores;
        this.cantidad = 0;
    }

    public int getCantQuemadores() {
        return cantQuemadores;
    }

    public void setCantQuemadores(int cantQuemadores) {
        this.cantQuemadores = cantQuemadores;
    }

    @Override
    public String toString() {
        return "Cocina{" +
                "cantQuemadores=" + cantQuemadores +
                '}';
    }

    @Override
    public Integer cambiarPrecio() {
        while (true) {
            System.out.println("¿Cuántos artículos deseas comprar?");
            Integer cantidad = sc.nextInt();

            if (cantidad > getCantDispo()) {
                System.out.println("Lo siento, solo tenemos " + getCantDispo() + " unidades disponibles.");
                System.out.println("Por favor, ingrese una cantidad válida.");
            } else {
                this.cantidad = cantidad;
                Integer total = getPrecio() * cantidad;
                return total;
            }
        }
    }

    @Override
    public void cantDisponible() {
        int nuevoDisponible = getCantDispo() - cantidad;
        System.out.println("Nueva cantidad de articulos disponibles: " + nuevoDisponible);
    }

    @Override
    public void incluyeGas() {
        System.out.println("Desea incluir un gas por 5000 pesos? SI/NO");
        String respuesta = sc.next().toLowerCase();
        if (respuesta.equals("si")) {
            System.out.println("Felicidades! ha comprado su cocina incluyendo un gas.");
        } else {
            System.out.println("Felicidades! ha comprado su cocina.");
        }
    }
}
