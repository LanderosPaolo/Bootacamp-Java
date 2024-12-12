package modelo;

import java.util.Scanner;

import interfaces.InterfazVehiculo;

public class Auto extends Vehiculo implements InterfazVehiculo {
    private String color;
    private String modelo;

    public Auto(Integer numRuedas, Integer numVentanas, String color, String modelo) {
        super(numRuedas, numVentanas);
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public void encender() {
        System.out.println("El auto está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El auto está apagado.");
    }

    @Override
    public void tipoBencina() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a E-camp combustibles");
        System.out.println("Que bencina va a cargar?");
        String bencina = sc.nextLine();
        System.out.println("combustible de " + bencina + " cargada!");
        System.out.println("Gracias por preferirnos");
        sc.close();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
