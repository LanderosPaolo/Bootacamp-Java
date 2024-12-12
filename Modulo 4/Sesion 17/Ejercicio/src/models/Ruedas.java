package models;

public class Ruedas {
    private boolean infladas;
    private boolean buenEstado;

    public Ruedas(boolean infladas, boolean buenEstado) {
        this.infladas = infladas;
        this.buenEstado = buenEstado;
    }

    public boolean isBuenEstado() {
        return buenEstado;
    }

    public void inflar() {
        if(buenEstado && infladas) {
            System.out.println("Ruedas listas.");
        } else {
            System.out.println("Revisar Estado y presion de ruedas");
        }
    }

    @Override
    public String toString() {
        return "Ruedas{" +
                "infladas=" + infladas +
                ", buenEstado=" + buenEstado +
                '}';
    }
}
