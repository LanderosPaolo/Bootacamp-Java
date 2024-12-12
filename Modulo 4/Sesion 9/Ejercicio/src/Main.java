import models.Alumno;
import models.Persona;
import models.Profesor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //arreglo de personas donde se agregaran profesor y alumnos
        ArrayList<Persona> personas = new ArrayList();

        //instanciar profesor y alumnos
        Profesor profe = new Profesor("Juan", "02-09-1989");
        Alumno alumno1 = new Alumno("Ignacio", "08-04-2015", "Estudiar");
        Alumno alumno2 = new Alumno("Javier", "12-10-2014", "Leer");
        Alumno alumno3 = new Alumno("Rodrigo", "22-07-2015", "Correr");

        //Agregamos a la lista
        personas.add(profe);
        personas.add(alumno1);
        personas.add(alumno2);
        personas.add(alumno3);

        //Se realizan for por separados para realizar cada punto del ejercicio.

        //Punto 3: Imprimirá s si es alumno o profesor y el nombre del individuo.
        System.out.println("Alumno o Profesor: ");
        for (Persona persona: personas) {
            System.out.println(persona.getClass().getSimpleName() + " - " + persona.getNombre());
        }

        //Punto 4: Imprimirá s la super clase correspondiente a cada uno.
        System.out.println("\nSuperClase de cada uno: ");
        for (Persona persona: personas) {
            System.out.println("La superClass() de " + persona.getNombre() + " es: " +  persona.getClass().getSuperclass());
        }

        //Punto 5: Imprimirá s la lista completa de individuos.
        System.out.println("\nLista completa: ");
        for (Persona persona: personas) {
            System.out.println(persona.toString());
        }
    }
}