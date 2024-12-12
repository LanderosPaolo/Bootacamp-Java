package models;

public class Cabina {
    private int capacidadPasajeros;
    private int numeroPuertas;
    private boolean puertasCerradas;
    private boolean buenEstado;

    public Cabina(int capacidadPasajeros, int numeroPuertas, boolean puertasCerradas, boolean buenEstado) {
        this.capacidadPasajeros = capacidadPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.puertasCerradas = puertasCerradas;
        this.buenEstado = buenEstado;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public boolean isBuenEstado() {
        return buenEstado;
    }

    public void cerrarPuertas() {
        if (puertasCerradas && buenEstado) {
            System.out.println("Cabina lista");
            puertasCerradas = true;
        } else {
            System.out.println("Revisar puertas");
        }
    }

    @Override
    public String toString() {
        return "Cabina{" +
                "capacidadPasajeros=" + capacidadPasajeros +
                ", numeroPuertas=" + numeroPuertas +
                ", puertasCerradas=" + puertasCerradas +
                ", buenEstado=" + buenEstado +
                '}';
    }
}
