package org.edutecno.modelos;

import java.util.List;

public class Materia {
    private MateriaEnum nombre;
    private List<Integer> notasAlumno;

    public Materia(MateriaEnum nombre, List<Integer> notasAlumno) {
        this.nombre = nombre;
        this.notasAlumno = notasAlumno;
    }

    public MateriaEnum getNombre() {
        return nombre;
    }

    public List<Integer> getNotasAlumno() {
        return notasAlumno;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre=" + nombre +
                '}';
    }
}
