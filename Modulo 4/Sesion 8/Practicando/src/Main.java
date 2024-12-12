import models.Circulo;
import models.Cuadrado;
import models.FiguraGeometrica;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica figuraGeometrica = new Circulo("Rojo", 5);
        FiguraGeometrica figuraGeometrica2 = new Circulo("Negro", 15);
        System.out.println(figuraGeometrica);
        System.out.println(figuraGeometrica2);
    }
}