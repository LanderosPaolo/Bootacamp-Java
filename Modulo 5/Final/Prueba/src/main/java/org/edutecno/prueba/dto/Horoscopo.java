package org.edutecno.prueba.dto;

import java.util.Date;

public class Horoscopo {
    private String animal;
    private Date fechaInicio;
    private Date fechaFin;

    public Horoscopo(String animal, Date fechaInicio, Date fechaFin) {
        this.animal = animal;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Horoscopo() {
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Horoscopo{" +
                "animal='" + animal + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}
