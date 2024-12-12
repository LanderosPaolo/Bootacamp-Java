package models;

public class Venta {
    private Vendedor vendedor;
    private int ganancia;

    public Venta(Vendedor vendedor, int ganancia) {
        super();
        this.vendedor = vendedor;
        this.ganancia = ganancia;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "vendedor=" + vendedor +
                ", ganancia=" + ganancia +
                '}';
    }
}
