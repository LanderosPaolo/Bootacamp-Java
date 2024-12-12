package models;

public class Alumno extends Persona {
    private String tareas;

    public Alumno(String nombre, String fechaNacimiento, String tareas) {
        super(nombre, fechaNacimiento);
        this.tareas = tareas;
    }

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "tareas='" + tareas + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
