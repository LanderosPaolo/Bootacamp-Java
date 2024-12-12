package models;

import interfaces.MetodoPagoInterface;

public class MetodoPago {

    public enum FormasPago{ Credito, Debito}

    public static MetodoPagoInterface getFormaPago(FormasPago formasPago) {
        switch (formasPago) {
            case Credito: return new Credito();
            case Debito: return new Debito();
        }
        return null;
    }
}
