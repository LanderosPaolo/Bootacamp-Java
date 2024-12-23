package org.edutecno.prueba.dto;

public class DepartamentoDto {
    private int numDepartamento;
    private String nombreDepartamento;
    private String ubicacionDepartamento;

    public DepartamentoDto(int numDepartamento, String nombreDepartamento, String ubicacionDepartamento) {
        this.numDepartamento = numDepartamento;
        this.nombreDepartamento = nombreDepartamento;
        this.ubicacionDepartamento = ubicacionDepartamento;
    }

    public DepartamentoDto() {
    }

    public int getNumDepartamento() {
        return numDepartamento;
    }

    public void setNumDepartamento(int numDepartamento) {
        this.numDepartamento = numDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getUbicacionDepartamento() {
        return ubicacionDepartamento;
    }

    public void setUbicacionDepartamento(String ubicacionDepartamento) {
        this.ubicacionDepartamento = ubicacionDepartamento;
    }

    @Override
    public String toString() {
        return "DepartamentoDTO{" +
                "numDepartamento=" + numDepartamento +
                ", nombreDepartamento='" + nombreDepartamento + '\'' +
                ", ubicacionDepartamento='" + ubicacionDepartamento + '\'' +
                '}';
    }
}