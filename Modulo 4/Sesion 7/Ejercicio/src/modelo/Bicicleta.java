package modelo;

public class Bicicleta extends Vehiculo {
    private String tipoBicicleta;

    public Bicicleta(Integer numRuedas, Integer numVentanas, String tipoBicicleta) {
        super(numRuedas, numVentanas);
        this.tipoBicicleta = tipoBicicleta;
    }

    @Override
    public void encender() {
        System.out.println("La bicicleta está lista para usar!");
        System.out.println("Pedaleando mejoras tu salud y aportas a mejorar el medio ambiente");
    }

    @Override
    public void apagar() {
        System.out.println("La bicicleta ha sido estacionada.");
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "tipoBicicleta='" + tipoBicicleta + '\'' +
                '}';
    }
}
