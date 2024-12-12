package org.edutecno;

import org.edutecno.modelos.Alumno;
import org.edutecno.modelos.Materia;
import org.edutecno.modelos.MateriaEnum;
import org.edutecno.servicios.AlumnoServicio;
import org.edutecno.servicios.PromedioServicioImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test para 'PromedioServicio', 'AlumnoServicio'")
public class AppTest {
    private final PromedioServicioImp promedioServicio = new PromedioServicioImp();

    private AlumnoServicio alumnoServicio;
    private Alumno mapu;

    @BeforeEach
    void setup() {
        alumnoServicio = new AlumnoServicio();

        mapu = new Alumno("12345678-9", "Mapu", "Perez", "Dirección Ejemplo");
    }

    @Test
    @DisplayName("Test para verificar el funcionamiento de calcularPromedio()")
    void testCalcularPromedio() {
        List<Integer> notas = new ArrayList<>();
        notas.add(7);
        notas.add(5);
        notas.add(4);

        assertEquals(5.333333333333333, promedioServicio.calcularPromedio(notas));
    }

    @Test
    @DisplayName("Test para verificar el funcionamiento de crearAlumno()")
    void crearAlumnoTest() {
        alumnoServicio.crearAlumno(mapu);
        assertTrue(alumnoServicio.listaAlumnos.containsKey(mapu.getRut()));
        assertEquals(mapu, alumnoServicio.listaAlumnos.get(mapu.getRut()));
    }

    @Test
    @DisplayName("Test para verificar el funcionamiento de agregarMateria()")
    void agregarMateriaTest() {
        alumnoServicio.crearAlumno(mapu);

        Materia matematicas = new Materia(MateriaEnum.MATEMATICAS, new ArrayList<>());
        Materia lenguaje = new Materia(MateriaEnum.LENGUAJE, new ArrayList<>());

        alumnoServicio.agregarMateria(mapu.getRut(), matematicas);
        alumnoServicio.agregarMateria(mapu.getRut(), lenguaje);

        List<Materia> materias = alumnoServicio.listaAlumnos.get(mapu.getRut()).getListaMaterias();
        assertTrue(materias.contains(matematicas));
        assertTrue(materias.contains(lenguaje));
    }

    @Test
    @DisplayName("Test para verificar el funcionamiento de materiasPorAlumnos()")
    void materiasPorAlumnosTest() {
        alumnoServicio.crearAlumno(mapu);

        Materia matematicas = new Materia(MateriaEnum.MATEMATICAS, new ArrayList<>());
        alumnoServicio.agregarMateria(mapu.getRut(), matematicas);

        List<Materia> materias = alumnoServicio.materiasPorAlumnos(mapu.getRut());
        assertNotNull(materias);
        assertEquals(1, materias.size());
        assertTrue(materias.contains(matematicas));
    }

    @Test
    @DisplayName("Test para verificar el funcionamiento de listarAlumnos()")
    void listarAlumnosTest() {
        alumnoServicio.crearAlumno(mapu);

        Materia matematicas = new Materia(MateriaEnum.MATEMATICAS, new ArrayList<>());
        alumnoServicio.agregarMateria(mapu.getRut(), matematicas);

        assertEquals(1, alumnoServicio.listaAlumnos.size());
    }
}