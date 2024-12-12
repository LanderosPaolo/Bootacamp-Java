package models;

public class Profesor extends Persona{
    private String especialidad;

    public Profesor(int identificador, String nombre,String especialidad) {
        super(nombre, identificador);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "especialidad='" + especialidad + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", identificador=" + getIdentificador() +
                '}';
    }

    //Puede leer
    @Override
    public void leer() {
        super.leer();
    }

    //Puede realizar ejercicios
    @Override
    public void realizarEjercicio() {
        super.realizarEjercicio();
    }

}
