package models;

import interfaces.MetodoPagoInterface;

public class Debito implements MetodoPagoInterface {

    @Override
    public String pago(){
        return "Ha pagado con tarjeta de Debito";
    }
}
