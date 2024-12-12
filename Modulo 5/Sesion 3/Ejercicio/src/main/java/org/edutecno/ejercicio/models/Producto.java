package org.edutecno.ejercicio.models;

public class Producto {
    private int id;
    private String concepto;
    private double importe;

    public Producto(int id, String concepto, double importe) {
        this.id = id;
        this.concepto = concepto;
        this.importe = importe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", concepto='" + concepto + '\'' +
                ", importe=" + importe +
                '}';
    }
}
