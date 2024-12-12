package models;

public class Persona {
    private String nombre;
    private int edad;
    private String cargo;

    public Persona(String nombre, int edad, String cargo) {
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
