package models;

public class Alas {
    private String largoEnMetros;
    private boolean buenEstado;

    public Alas(String largoEnMetros, boolean buenEstado) {
        this.largoEnMetros = largoEnMetros;
        this.buenEstado = buenEstado;
    }

    public boolean isBuenEstado() {
        return buenEstado;
    }


    public void pruebaAlas() {
        if(buenEstado) {
            System.out.println("Alas listas.");
        } else {
            System.out.println("Alas en mal estado.");
        }
    }

    @Override
    public String toString() {
        return "Alas{" +
                "largoEnMetros='" + largoEnMetros + '\'' +
                ", buenEstado=" + buenEstado +
                '}';
    }
}