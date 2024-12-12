package modelsPago;

import interfaces.MetodoPagoInterface;

public class Efectivo implements MetodoPagoInterface {

    @Override
    public String pago() {
        return "Realizaste el pago con efectivo";
    }
}
