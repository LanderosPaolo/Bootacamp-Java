package org.edutecno.prueba.dto;

public class InscripcionDTO {
    private int idInsc;
    private String nombre;
    private String celular;
    private int idCurso;
    private int idFormaDePago;

    public InscripcionDTO() {
        super();
    }

    public InscripcionDTO(int idInsc, String nombre, String celular, int idCurso, int idFormaDePago) {
        this.idInsc = idInsc;
        this.nombre = nombre;
        this.celular = celular;
        this.idCurso = idCurso;
        this.idFormaDePago = idFormaDePago;
    }

    public int getIdInsc() {
        return idInsc;
    }

    public void setIdInsc(int idInsc) {
        this.idInsc = idInsc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdFormaDePago() {
        return idFormaDePago;
    }

    public void setIdFormaDePago(int idFormaDePago) {
        this.idFormaDePago = idFormaDePago;
    }

    @Override
    public String toString() {
        return "InscripcionDTO{" +
                "idInsc=" + idInsc +
                ", nombre='" + nombre + '\'' +
                ", celular='" + celular + '\'' +
                ", idCurso=" + idCurso +
                ", idFormaDePago=" + idFormaDePago +
                '}';
    }
}
