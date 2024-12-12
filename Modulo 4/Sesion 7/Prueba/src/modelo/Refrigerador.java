package modelo;

import interfaces.ProductoInterface;
import java.util.Scanner;

public class Refrigerador extends Producto implements ProductoInterface {
    Scanner sc = new Scanner(System.in);
    private String gastoElec;
    private Integer numPuertas;
    private Integer cantidad;

    public Refrigerador(Integer precio, Integer cantDispo, String gastoElec, Integer numPuertas) {
        super(precio, cantDispo);
        this.gastoElec = gastoElec;
        this.numPuertas = numPuertas;
        this.cantidad = 0;
    }

    public String getGastoElec() {
        return gastoElec;
    }

    public void setGastoElec(String gastoElec) {
        this.gastoElec = gastoElec;
    }

    public Integer getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(Integer numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Refrigerador{" +
                "gastoElec='" + gastoElec + '\'' +
                ", numPuertas=" + numPuertas +
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
}
