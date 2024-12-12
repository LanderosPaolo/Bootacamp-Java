package org.edutecno.modelos;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String rut;
    private String nombre;
    private String apellido;
    private String direccion;
    private List<Materia> listaMaterias;

    public Alumno(String rut, String nombre, String apellido, String direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.listaMaterias = new ArrayList<>();
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Materia> getListaMaterias() {
        return listaMaterias;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", listaMaterias=" + listaMaterias +
                '}';
    }
}
