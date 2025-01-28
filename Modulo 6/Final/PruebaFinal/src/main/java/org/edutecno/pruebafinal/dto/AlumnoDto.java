package org.edutecno.pruebafinal.dto;

import org.edutecno.pruebafinal.modelo.Materia;

import java.util.Set;

public class AlumnoDto {
    private Long id;
    private String rut;
    private String nombre;
    private String direccion;
    private Set<Materia> materiaList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Set<Materia> getMateriaList() {
        return materiaList;
    }

    public void setMateriaList(Set<Materia> materiaList) {
        this.materiaList = materiaList;
    }
}
