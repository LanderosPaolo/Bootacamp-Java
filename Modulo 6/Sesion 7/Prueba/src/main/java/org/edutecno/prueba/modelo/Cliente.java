package org.edutecno.prueba.modelo;

public class Cliente {
    private int idCliente;
    private String primerNombre;
    private String segundoNombre;
    private String apellPaterno;
    private String apellMaterno;
    private String direccion;

    public Cliente(int idCliente, String primerNombre, String segundoNombre, String apellPaterno, String apellMaterno, String direccion) {
        this.idCliente = idCliente;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellPaterno = apellPaterno;
        this.apellMaterno = apellMaterno;
        this.direccion = direccion;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellPaterno() {
        return apellPaterno;
    }

    public void setApellPaterno(String apellPaterno) {
        this.apellPaterno = apellPaterno;
    }

    public String getApellMaterno() {
        return apellMaterno;
    }

    public void setApellMaterno(String apellMaterno) {
        this.apellMaterno = apellMaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", primerNombre='" + primerNombre + '\'' +
                ", segundoNombre='" + segundoNombre + '\'' +
                ", apellPaterno='" + apellPaterno + '\'' +
                ", apellMaterno='" + apellMaterno + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
