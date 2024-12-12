package models;

public class Avion {
    private String marca;
    private String modelo;
    private boolean listoParaDespegar;
    private Alas alas;
    private Motores motores;
    private Ruedas ruedas;
    private Cabina cabina;

    public Avion(String marca, String modelo, boolean listoParaDespegar, Alas alas, Motores motores, Ruedas ruedas, Cabina cabina) {
        this.marca = marca;
        this.modelo = modelo;
        this.listoParaDespegar = listoParaDespegar;
        this.alas = alas;
        this.motores = motores;
        this.ruedas = ruedas;
        this.cabina = cabina;
    }

    public void setListoParaDespegar(boolean listoParaDespegar) {
        this.listoParaDespegar = listoParaDespegar;
    }

    public void recibirPasajeros() {
        if (cabina.getCapacidadPasajeros() > 0) {
            System.out.println("Comenzar el abordaje");
        } else {
            System.out.println("Ya no pueden ingresar más pasajeros");
        }
    }

    public void despegar() {
        if (cabina.isBuenEstado() && alas.isBuenEstado() && motores.isBuenEstado() && ruedas.isBuenEstado()) {
            System.out.println("El avión puede despegar.");
            setListoParaDespegar(true);
        } else {
            System.out.println("Revisar nuevamente el avión.");
            setListoParaDespegar(false);
        }
    }

    @Override
    public String toString() {
        return "Avion{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", listoParaDespegar=" + listoParaDespegar +
                ", alas=" + alas +
                ", motores=" + motores +
                ", ruedas=" + ruedas +
                ", cabina=" + cabina +
                '}';
    }
}
