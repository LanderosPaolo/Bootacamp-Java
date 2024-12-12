package model;

public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private int velocidadMaxima;
    private boolean encendido;

    public Auto(String marca, String modelo, String color, int velocidadMaxima, boolean encendido) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
        this.encendido = encendido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void encenderAuto() {
        if (encendido) {
            System.out.println("No se puede realizar esta acción porque su auto ya se encuentra encendido");
        } else {
            encendido = true;
            System.out.println("Se ha encendido su auto");
        }
    }

    public void apagarAuto() {
        if (!encendido) {
            System.out.println("No se puede realizar esta acción porque su auto ya se encuentra apagado");
        } else {
            encendido = false;
            System.out.println("Se ha apagado su auto");
        }
    }

    public void acelerarAuto() {
        if (!encendido) {
            System.out.println("No se puede realizar esta acción porque su auto se encuentra apagado");
        } else {
            System.out.println("Su auto esta acelerando");
        }
    }

    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", velocidadMaxima="
                + velocidadMaxima + ", encendido=" + encendido + "]";
    }
}
