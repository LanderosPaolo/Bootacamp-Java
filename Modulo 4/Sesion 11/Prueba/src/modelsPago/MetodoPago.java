package modelsPago;

import interfaces.MetodoPagoInterface;

public class MetodoPago {

    public enum FormasPago { Debito, Efectivo}

    public static MetodoPagoInterface getFormasPago(FormasPago formasPago) {
        switch (formasPago) {
            case Debito: return new Debito();
            case Efectivo: return new Efectivo();
        }
        return null;
    }
}
