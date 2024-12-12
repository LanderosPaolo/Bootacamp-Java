import modelo.Bicicleta;
import modelo.Auto;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto(4, 6, "rojo", "Corsa");
        Bicicleta bici = new Bicicleta(2, 0, "electrica");

        auto.encender();
        System.out.println("----------------");

        bici.encender();
        System.out.println("----------------");

        auto.tipoBencina();
        System.out.println();

        auto.apagar();
        System.out.println("----------------");

        bici.apagar();
    }
}