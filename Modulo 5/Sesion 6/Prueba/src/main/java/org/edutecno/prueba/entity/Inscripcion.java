package org.edutecno.prueba.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "inscripcion")
public class Inscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "id_curso")
    private int idCurso;

    @Column(name = "id_forma_pago")
    private int idFormaPago;

    public Inscripcion(String nombre, String telefono, int idCurso, int idFormaPago) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.idCurso = idCurso;
        this.idFormaPago = idFormaPago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", idCurso=" + idCurso +
                ", idFormaPago=" + idFormaPago +
                '}';
    }
}