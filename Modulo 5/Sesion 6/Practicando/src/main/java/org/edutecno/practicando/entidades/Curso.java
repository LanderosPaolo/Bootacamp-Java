package org.edutecno.practicando.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CURSO")
    private int idCurso;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "PRECIO")
    private double precio;

    public Curso() {
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idCurso=" + idCurso +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }

    /*private int idCurso;
    private String descripcion;
    private double precio;

    public Curso() {

    }

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cursoid")
    @SequenceGenerator(name = "cursoid", sequenceName = "cursoid", allocationSize = 1)
    public int getIdCurso() {
        return idCurso;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "precio")
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }*/
}