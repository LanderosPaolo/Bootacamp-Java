package org.edutecno.prueba.models;

public class Departamento {
    private int numDepto;
    private String nomDepto;
    private String ubicacionDpto;

    public Departamento(int numDepto, String nomDepto, String ubicacionDpto) {
        this.numDepto = numDepto;
        this.nomDepto = nomDepto;
        this.ubicacionDpto = ubicacionDpto;
    }

    public int getNumDepto() {
        return numDepto;
    }

    public void setNumDepto(int numDepto) {
        this.numDepto = numDepto;
    }

    public String getNomDepto() {
        return nomDepto;
    }

    public void setNomDepto(String nomDepto) {
        this.nomDepto = nomDepto;
    }

    public String getUbicacionDepto() {
        return ubicacionDpto;
    }

    public void setUbicacionDpto(String ubicacionDpto) {
        this.ubicacionDpto = ubicacionDpto;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "numDepto=" + numDepto +
                ", nomDepto='" + nomDepto + '\'' +
                ", ubicacionDpto='" + ubicacionDpto + '\'' +
                '}';
    }
}
