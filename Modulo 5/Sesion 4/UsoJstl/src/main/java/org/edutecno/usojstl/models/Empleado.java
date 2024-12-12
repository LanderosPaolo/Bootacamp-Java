package org.edutecno.usojstl.models;

public class Empleado {
    private int numEmpleado;
    private String nombre;

    public Empleado(int numEmpleado, String nombre) {
        this.numEmpleado = numEmpleado;
        this.nombre = nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numEmpleado=" + numEmpleado +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
