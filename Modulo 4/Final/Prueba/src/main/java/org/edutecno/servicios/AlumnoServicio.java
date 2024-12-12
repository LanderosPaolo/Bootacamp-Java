package org.edutecno.servicios;

import org.edutecno.modelos.Alumno;
import org.edutecno.modelos.Materia;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlumnoServicio {
    public Map<String, Alumno> listaAlumnos = new HashMap<>();

    public void crearAlumno(Alumno alumno) {
        listaAlumnos.put(alumno.getRut(), alumno);
        System.out.println("Alumno creado: " + alumno);
    }

    public void agregarMateria(String rutAlumno, Materia currentMateria) {
        Alumno alumno = listaAlumnos.get(rutAlumno);
        if (alumno != null) {
            alumno.getListaMaterias().add(currentMateria);
        }
    }

    public List<Materia> materiasPorAlumnos(String rutAlumno) {
        Alumno alumno = listaAlumnos.get(rutAlumno);
        if (alumno == null) {
            System.out.println("--> Alumno no encontrado <--");
            return null;
        }

        if (alumno.getListaMaterias().isEmpty()) {
            System.out.println("--> Sin materias registradas <--");
        } else {
            for (Materia materia : alumno.getListaMaterias()) {
                System.out.println(" - " + materia.getNombre());
                System.out.println("   Notas: " + materia.getNotasAlumno());
            }
        }
        return alumno.getListaMaterias();
    }

    public Map<String, Alumno> listarAlumnos() {
        if (listaAlumnos == null || listaAlumnos.isEmpty()) {
            System.out.println("No existen alumnos.");
        } else {
            for (Alumno alumno : listaAlumnos.values()) {
                System.out.println("\nDATOS ALUMNO:");
                System.out.println(" - Rut: " + alumno.getRut());
                System.out.println(" - Nombre: " + alumno.getNombre());
                System.out.println(" - Apellido: " + alumno.getApellido());
                System.out.println(" - Dirección: " + alumno.getDireccion());
                System.out.println("Materias:");
                materiasPorAlumnos(alumno.getRut());
            }
        }
        return listaAlumnos;
    }
}
