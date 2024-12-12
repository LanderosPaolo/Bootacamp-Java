package models;

public class Polera {
    private String color;
    private int id;

    public Polera(String color, int id) {
        this.color = color;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Polera{" +
                "color='" + color + '\'' +
                ", id=" + id +
                '}';
    }

}
