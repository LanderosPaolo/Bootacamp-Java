package models;

public class Alumno {
    private String nombre;
    private String rut;
    private String fechaNacimiento;

    public Alumno(String nombre, String rut, String fechaNacimiento) {
        this.nombre = nombre;
        this.rut = rut;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}