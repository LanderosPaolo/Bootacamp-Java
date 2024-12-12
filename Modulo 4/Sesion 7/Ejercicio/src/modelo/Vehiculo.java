package modelo;

public abstract class Vehiculo {
    private Integer numRuedas;
    private Integer numVentanas;

    public Vehiculo(Integer numRuedas, Integer numVentanas) {
        super();
        this.numRuedas = numRuedas;
        this.numVentanas = numVentanas;
    }

    //Metodos abstractos encender y apagar
    public abstract void encender();

    public abstract void apagar();

}