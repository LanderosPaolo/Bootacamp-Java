import models.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Alas alas = new Alas("65", true);
        Motores motores = new Motores(true, true);
        Ruedas ruedas = new Ruedas(true, true);
        Cabina cabina = new Cabina(100, 12, true, true);
        Avion avion = new Avion("Damond", "DA42", true, alas, motores, ruedas, cabina);
        PistaAeropuerto pista1 = new PistaAeropuerto(true);

        pista1.actualizarDisponibilidad();
        System.out.println("Verificaremos que el avión esté en buenas condiciones.");
        System.out.println("Verificando...");
        Thread.sleep(1000);
        System.out.println("--- Alas ---");
        Thread.sleep(1000);
        alas.pruebaAlas();
        Thread.sleep(1000);
        System.out.println("--- Motores ---");
        Thread.sleep(1000);
        motores.cargarCombustible();
        Thread.sleep(1000);
        System.out.println("--- Ruedas ---");
        Thread.sleep(1000);
        ruedas.inflar();
        Thread.sleep(1000);
        System.out.println("--- Cabina ---");
        Thread.sleep(1000);
        cabina.cerrarPuertas();
    }
}