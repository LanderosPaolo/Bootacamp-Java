package modelo;

public abstract class Producto {
    private Integer precio;
    private Integer cantDispo;

    public Producto(Integer precio, Integer cantDispo) {
        super();
        this.precio = precio;
        this.cantDispo = cantDispo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCantDispo() {
        return cantDispo;
    }

    public void setCantDispo(Integer cantDispo) {
        this.cantDispo = cantDispo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                ", cantDispo=" + cantDispo +
                '}';
    }
}
