package org.edutecno.ejerciciocomprobacion.dto;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String clave;
    private int rut;
    private char dv;


    public Usuario(int idUsuario, String nombre, String clave, int rut, char dv) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.clave = clave;
        this.rut = rut;
        this.dv = dv;
    }

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", clave='" + clave + '\'' +
                ", rut=" + rut +
                ", dv=" + dv +
                '}';
    }
}
