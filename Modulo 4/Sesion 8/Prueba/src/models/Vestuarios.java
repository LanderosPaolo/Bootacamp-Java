package models;

public class Vestuarios extends Productos{
    private String talla;
    private String color;

    public Vestuarios(String nombre, String codigo, int precio, String talla, String color) {
        super(nombre, codigo, precio);
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vestuario{" +
                "talla=" + talla +
                ", color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", precio=" + precio +
                '}';
    }

}
