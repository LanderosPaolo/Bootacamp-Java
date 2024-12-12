package org.example.models;

public class Jugador {
    private String nombre;
    private int edad;
    private int numero;

    public Jugador(String nombre, int edad, int numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numero=" + numero +
                '}';
    }

    //Metodo crearJugador
    public Jugador crearJugador(String nombre, int edad, int numero) {
        return new Jugador(nombre, edad, numero);
    }
}
