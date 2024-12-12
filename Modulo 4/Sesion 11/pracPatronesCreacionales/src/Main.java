import interfaces.MetodoPagoInterface;
import models.MetodoPago;
import models.Singleton;

public class Main {
    public static void main(String[] args) {
        /*
        //Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);

         */

        //Factory Method
        MetodoPagoInterface metodoPago = (MetodoPagoInterface)
                MetodoPago.getFormaPago(MetodoPago.FormasPago.Credito);
        MetodoPagoInterface metodoPago2 = (MetodoPagoInterface)
                MetodoPago.getFormaPago (MetodoPago.FormasPago.Debito);

        System.out.println(metodoPago.pago());
        System.out.println(metodoPago2.pago());
    }
}