package modelsPago;

import interfaces.MetodoPagoInterface;

public class Debito implements MetodoPagoInterface {

    @Override
    public String pago() {
        return "Realizaste el pago con tarjeta de débito";
    }
}
