package packageB;
import packageA.UtilidadIVA;

public class Factura {
    private int numero;
    private String concepto;
    private double importe;

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getImporteIVA() {
        return UtilidadIVA.calcularIVA(importe);
    }
}
