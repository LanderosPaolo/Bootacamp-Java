package models;

public class PistaAeropuerto {
    private boolean disponible;

    public PistaAeropuerto(boolean disponible) {
        this.disponible = disponible;
    }

    public void actualizarDisponibilidad() {
        if (disponible) {
            System.out.println("Pista 1 disponible");
            disponible = false;
        }
        else {
            System.out.println("Pista 2 no disponible");
            disponible = true;
        }
    }

    @Override
    public String toString() {
        return "PistaAeropuerto{" +
                "disponible=" + disponible +
                '}';
    }
}
