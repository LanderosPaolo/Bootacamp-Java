package org.edutecno.entidades;

import jakarta.persistence.*;
import sun.util.resources.Bundles;

@Entity
@Table(name = "cursos")
public class Curso {
    private int idCurso;
    private String descripcion;
    private double precio;

    public curso() {

    }

    @Id
    @Column(name = "id_curso")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cursoid")
    @SequenceGenerator(name = "cursoid", sequenceName = "cursoid", allocationSize = 1)
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
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
    }
}
