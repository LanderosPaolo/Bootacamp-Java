package models;

import java.time.LocalDate;

public class Vegetales extends Productos{
    private LocalDate fechaEnvasado;
    private LocalDate fechaCaducidad;

    public Vegetales(String nombre, String codigo, int precio, LocalDate fechaEnvasado, LocalDate fechaCaducidad) {
        super(nombre, codigo, precio);
        this.fechaEnvasado = fechaEnvasado;
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Vegetales{" +
                "fechaEnvasado='" + fechaEnvasado + '\'' +
                ", fechaCaducidad='" + fechaCaducidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", precio=" + precio +
                '}';
    }

}

