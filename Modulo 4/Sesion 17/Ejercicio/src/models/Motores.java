package models;

public class Motores {
    private boolean tieneCombustible;
    private boolean buenEstado;

    public Motores(boolean tieneCombustible, boolean buenEstado) {
        this.tieneCombustible = tieneCombustible;
        this.buenEstado = buenEstado;
    }

    public boolean isBuenEstado() {
        return buenEstado;
    }

    public void cargarCombustible () {
        if(buenEstado && tieneCombustible) {
            System.out.println("Motores listos.");
        } else {
            System.out.println("Necesita ser chequeado");
        }
    }

    @Override
    public String toString() {
        return "Motores{" +
                "tieneCombustible=" + tieneCombustible +
                ", buenEstado=" + buenEstado +
                '}';
    }
}
