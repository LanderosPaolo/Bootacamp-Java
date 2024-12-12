package org.edutecno.vistas;

import org.edutecno.modelos.Alumno;
import org.edutecno.modelos.Materia;
import org.edutecno.modelos.MateriaEnum;
import org.edutecno.servicios.AlumnoServicio;
import org.edutecno.servicios.ArchivoServicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu extends MenuTemplate {
    public AlumnoServicio alumnoServicio = new AlumnoServicio();
    ArchivoServicio archivoServicio = new ArchivoServicio();

    @Override
    protected void exportarDatos(Map<String, Alumno> alumnoList) {
        System.out.println("Alumnos a exportar: " + alumnoServicio.listaAlumnos);

        // Usar directamente el Map de AlumnoServicio
        if (!alumnoServicio.listaAlumnos.isEmpty()) {
            List<Alumno> alumnos = new ArrayList<>(alumnoServicio.listaAlumnos.values());
            archivoServicio.exportarDatos(alumnos, "promedios.txt");
            System.out.println("Datos exportados con éxito a promedios.txt");
        } else {
            System.out.println("No hay alumnos para exportar.");
        }
    }

    @Override
    protected void crearAlumno() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el rut del alumno: ");
        String rut = sc.nextLine();

        if (alumnoServicio.listaAlumnos.containsKey(rut)) {
            System.out.println("Alumno ya se encuentra registrado.");
            return;
        }

        System.out.println("Ingresa el nombre del alumno: ");
        String nombre = sc.nextLine();

        System.out.println("Ingresa el apellido del alumno: ");
        String apellido = sc.nextLine();

        System.out.println("Ingresa la direccion del alumno: ");
        String direccion = sc.nextLine();

        Alumno alumno = new Alumno(rut, nombre, apellido, direccion);
        alumnoServicio.crearAlumno(alumno);
        System.out.println("Alumno creado con éxito");
    }

    @Override
    public void agregarMateria(List<Alumno> alumnoList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el RUT del alumno:");
        String rut = sc.nextLine();

        Alumno alumno = alumnoServicio.listaAlumnos.get(rut);

        if (alumno == null) {
            System.out.println("El rut del alumno no se encuentra registrado.");
            return;
        }

        System.out.println("Seleccione la materia que desea agregar: ");
        for (MateriaEnum materiaEnum : MateriaEnum.values()) {
            System.out.println("-" + materiaEnum.toString());
        }

        String seleccionMateria = sc.nextLine().toUpperCase();

        try {
            MateriaEnum materiaEnum = MateriaEnum.valueOf(seleccionMateria);

            boolean materiaExiste = alumno.getListaMaterias().stream()
                    .anyMatch(m -> m.getNombre().equals(materiaEnum));

            if (materiaExiste) {
                System.out.println("El alumno ya tiene registrada esa materia.");
                return;
            }

            List<Integer> notasAlumnos = new ArrayList<>();
            Materia materia = new Materia(materiaEnum, notasAlumnos);
            alumnoServicio.agregarMateria(rut, materia);
            System.out.println("Materia agregada con éxito");

        } catch (Exception e) {
            System.out.println("No se puede seleccionar la materia.");
        }
    }

    @Override
    protected void agregarNotaPasoUno(List<Alumno> alumnoList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el RUT del alumno:");
        String rut = sc.nextLine();

        // Buscar el alumno por RUT
        Alumno alumno = alumnoServicio.listaAlumnos.get(rut);

        if (alumno == null) {
            System.out.println("El alumno con el RUT " + rut + " no existe.");
            return;
        }

        System.out.println("Seleccione la materia a la que desea agregar nota");
        System.out.println("***Debe escribir el nombre de la materia que desea agregar***");
        List<Materia> materiasAlumno = alumno.getListaMaterias();

        if (materiasAlumno.isEmpty()) {
            System.out.println("El alumno no está inscrito en ninguna materia.");
            return;
        }

        for (Materia materia : materiasAlumno) {
            System.out.println("- " + materia.getNombre());
        }

        String seleccionMateria = sc.nextLine().toUpperCase();

        Materia materiaSeleccionada = materiasAlumno.stream()
                .filter(m -> m.getNombre().name().equals(seleccionMateria))
                .findFirst()
                .orElse(null);

        if (materiaSeleccionada == null) {
            System.out.println("La materia " + seleccionMateria + " no está registrada para el alumno.");
            return;
        }

        System.out.println("Ingrese la nota: ");
        int nota = sc.nextInt();
        sc.nextLine();

        materiaSeleccionada.getNotasAlumno().add(nota);
        System.out.println("Nota agregada con éxito a " + materiaSeleccionada.getNombre());
    }

    public void listarAlumnos() {
        alumnoServicio.listarAlumnos();
    }

    @Override
    protected void terminarPrograma() {
        System.out.println("Cerrando el  programa...");
        System.exit(0);
    }
}