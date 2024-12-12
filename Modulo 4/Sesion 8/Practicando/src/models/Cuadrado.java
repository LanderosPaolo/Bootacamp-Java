package models;

public class Cuadrado extends FiguraGeometrica{
    private double tamanioLado;

    public Cuadrado(String color, double tamanioLado) {
        super(color);
        this.tamanioLado = tamanioLado;
    }

    public double getTamanioLado() {
        return tamanioLado;
    }

    public void setTamanioLado(double tamanioLado) {
        this.tamanioLado = tamanioLado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "tamanioLado=" + tamanioLado +
                ", color='" + color + '\'' +
                '}';
    }
}
