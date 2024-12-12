package models;

import interfaces.GlobalInterface;

public class Persona implements GlobalInterface {
    private String nombre;
    private int identificador;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Persona(String nombre, int identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", identificador=" + identificador +
                '}';
    }

    //Metodo para leer
    @Override
    public void leer() {

    }
    //Metodo para realizar ejercicios en clases
    @Override
    public void realizarEjercicio() {}
}
