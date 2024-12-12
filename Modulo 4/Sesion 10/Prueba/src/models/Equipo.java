package models;

import java.util.ArrayList;

public class Equipo {
    private ArrayList<Persona> equipo;

    public Equipo() {
        this.equipo = new ArrayList<>();
    }

     public void agregarPersona(Persona persona) {
        equipo.add(persona);
     }

     public void mostrarEquipo() {
        for (Persona persona : equipo) {
            System.out.println(persona);
        }
     }
}
