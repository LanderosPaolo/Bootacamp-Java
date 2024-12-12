package models;

import interfaces.MetodoPagoInterface;

public class Credito implements MetodoPagoInterface {

    @Override
    public String pago(){
        return "Ha pagado con tarjeta de Credito";
    }
}
