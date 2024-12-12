package models;

import interfaces.PersonaInterface;

public class DirectorTecnico extends Persona implements PersonaInterface {
    private int aniosEntrenando;

    public DirectorTecnico (String nombre, String apellido, int edad, int aniosEntrenando) {
        super(nombre, apellido, edad);
        this.aniosEntrenando = aniosEntrenando;
    }

    @Override
    public String toString() {
        return "DirectorTecnico[" +
                "AñosEntrenando=" + aniosEntrenando +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ']';
    }

    @Override
    public void amonestado() {
        System.out.println(nombre + " está siendo amonestado");
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " está hablando");
    }

    @Override
    public void celebrar() {
        System.out.println(nombre + " está hablando");
    }

    //Al no ser usados no deberiamos escribir esta parte del codigo
    /*public int getAniosEntrenando() {
        return aniosEntrenando;
    }

    public void setAniosTrabajando(int aniosEntrenando) {
        aniosEntrenando = aniosEntrenando;
    }*/
}
