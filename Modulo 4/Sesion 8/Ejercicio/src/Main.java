import models.Alumno;
import models.Persona;
import models.Profesor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Lista de curso
        ArrayList<Persona> curso = new ArrayList<>();

        //Instanciando profesor y alumnos
        Profesor profesor = new Profesor(7852,"Francisca Vargas", "Historia");
        Alumno alumno1 = new Alumno(123, "Rodrigo fernandez", profesor, "Hacer maraton de Netflix");
        Alumno alumno2 = new Alumno(456, "Carmen Araya", profesor, "Jugar futbol");
        Alumno alumno3 = new Alumno(789, "Sergio Fuentes", profesor, "Leer comic y mangas");

        //Agregando a la lista
        curso.add(profesor);
        curso.add(alumno1);
        curso.add(alumno2);
        curso.add(alumno3);

        System.out.println("El curso esta compuesto por: ");
        for (Persona persona : curso) {
            System.out.println(persona);
        }
    }
}