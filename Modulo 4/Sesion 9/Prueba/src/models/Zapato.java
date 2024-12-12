package models;

public class Zapato {
    private String marca;
    private int id;

    public Zapato(String marca, int id) {
        this.marca = marca;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Zapatos{" +
                "marca='" + marca + '\'' +
                ", id=" + id +
                '}';
    }

}
