package models;

public class FiguraGeometrica {
    protected String color;

    public FiguraGeometrica(String color) {
        super();
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "color='" + color + '\'' +
                '}';
    }
}
