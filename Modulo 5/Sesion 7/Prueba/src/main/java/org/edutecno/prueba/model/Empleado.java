package org.edutecno.prueba.model;

public class Empleado {
    private int numeroEmpleado;
    private String nombreEmpleado;
    private int numeroDepartamento;

    public Empleado(int numeroEmpleado, String nombreEmpleado, int numeroDepartamento) {
        this.numeroEmpleado = numeroEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.numeroDepartamento = numeroDepartamento;
    }

    public Empleado() {
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getNumeroDepartamento() {
        return numeroDepartamento;
    }

    public void setNumeroDepartamento(int numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numeroEmpleado=" + numeroEmpleado +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", numeroDepartamento='" + numeroDepartamento + '\'' +
                '}';
    }
}
