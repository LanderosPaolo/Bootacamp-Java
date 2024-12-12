import packageA.UtilidadIVA;
import packageB.Factura;

public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura();
        factura.setImporte(200);
        System.out.println(factura.getImporteIVA());
        System.out.println(UtilidadIVA.calcularIVA(100));
    }
}