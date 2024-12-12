package models;

public class Alumno extends Persona{
    private Profesor profesor;
    private String hobby;

    public Alumno(int identificador, String nombre, Profesor profesor, String hobby) {
        super(nombre, identificador);
        this.profesor = profesor;
        this.hobby = hobby;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + getNombre() + '\'' +
                ", identificador=" + getIdentificador() +
                ", profesor=" + profesor +
                ", hobby='" + hobby + '\'' +
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
