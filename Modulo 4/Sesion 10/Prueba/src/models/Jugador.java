package models;

import interfaces.JugadorInterface;

public class Jugador extends Persona implements JugadorInterface {
    private int numCamiseta;
    private String posicion;

    public Jugador(String nombre, String apellido, int edad, int numCamiseta, String posicion) {
        super(nombre, apellido, edad);
        this.numCamiseta = numCamiseta;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador[" +
                "numCamiseta=" + numCamiseta +
                ", posicion='" + posicion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ']';
    }

    @Override
    public void correr(){
        System.out.println(nombre + " está corriendo");
    }

    @Override
    public void saltar() {
        System.out.println(nombre + " está saltando");
    }

    @Override
    public void quitarBalon() {
        System.out.println(nombre + " está quitando el balón");
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
    /*public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }*/
}
