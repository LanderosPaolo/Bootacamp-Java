package service;

import models.Alumno;
import models.Curso;

import java.util.*;

public class Auxiliar {
    private Map<Curso, List<Alumno>> asignaciones;
    private List<Curso> cursos;
    private List<Alumno> alumnos;

    public Auxiliar() {
        this.asignaciones = new HashMap<>();
        this.cursos = new ArrayList<>();
        this.alumnos = new ArrayList<>();

        Curso curso1 = new Curso("Ingles", "ING1", "Curso completo desde nivel básico hasta avanzado. 80 horas");
        Curso curso2 = new Curso("Comunicación efectiva", "COAF1", "Fundamentos de la comunicación efectiva para el fortalecimiento de las relaciones interpresonales en espacios de trabajo. 100 horas");
        Curso curso3 = new Curso("Excel avanzado", "EXC2", "Formulas, listas y plantillas en Excel. 50 horas");
        Curso curso4 = new Curso("Word básico", "WOR1", "Uso de elementos básicos en Word. Creación de Curriculum Vitae. 20 horas");

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        Alumno alumno1 = new Alumno("Jaime Cerca", "15569258-6", "30-08-1984");
        Alumno alumno2 = new Alumno("Teresita Pérez", "17269128-3", "05-05-1990");
        Alumno alumno3 = new Alumno("Patricio Meneses", "10425125-6", "21-06-1970");
        Alumno alumno4 = new Alumno("Carmen Tapia", "15269125-3", "08-02-1980");
        Alumno alumno5 = new Alumno("Fernanda Lizama", "20125816-9", "17-09-1999");
        Alumno alumno6 = new Alumno("Ignacio Canto", "18124742-8", "09-03-1995");
        Alumno alumno7 = new Alumno("Esteban Fuentes", "12247369-5", "14-12-1974");
        Alumno alumno8 = new Alumno("Constanza Álvarez", "20789635-6", "09-09-2000");

        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
        alumnos.add(alumno6);
        alumnos.add(alumno7);
        alumnos.add(alumno8);
    }

    //Metodo para mostrar lista de cursos
    public void listaCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    // Metodo para agregar alumnos
    public void agregarAlumno() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del alumno: ");
        String nombreAlumno = sc.nextLine();
        System.out.println("Ingrese el rut del alumno: ");
        String rutAlumno = sc.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del alumno (DD/MM/YYYY) :");
        String fechaNacimiento = sc.nextLine();

        if (alumnos.stream().anyMatch(alumno -> alumno.getRut().equals(rutAlumno))) {
            System.out.println("---> El alumno ya existe <---");
        } else {
            alumnos.add(new Alumno(nombreAlumno, rutAlumno, fechaNacimiento));
            System.out.println("---> Alumno registrado con exito <---");
        }
    }

    // Metodo para agregar cursos
    public void agregarCurso() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del curso: ");
        String nombreCurso = sc.nextLine();
        System.out.println("Ingrese el codigo del curso: ");
        String codigoCurso = sc.nextLine();
        System.out.println("Ingrese el descripcion del curso: ");
        String descripcionCurso = sc.nextLine();

        if (cursos.stream().anyMatch(curso -> curso.getCodigo().equals(codigoCurso))) {
            System.out.println("El curso ya existe");
        } else {
            cursos.add(new Curso(nombreCurso, codigoCurso.toUpperCase(), descripcionCurso));
            System.out.println("---> Curso registrado con exito <---");
        }
    }

    // Metodo para asignar curso y submenu
    public void asignarCurso(String rutAAsignar, String codigoCurso) {
        Alumno alumno = alumnos.stream().filter(a -> a.getRut().equals(rutAAsignar)).findFirst().orElse(null);
        Curso curso = cursos.stream().filter(c -> c.getCodigo().equals(codigoCurso)).findFirst().orElse(null);

        if (curso != null && alumno != null) {
            List<Alumno> alumnosAsignados = asignaciones.computeIfAbsent(curso, c -> new ArrayList<>());
            if (alumnosAsignados.contains(alumno)) {
                System.out.println("Alumno ya registrado en el curso");
            } else {
                alumnosAsignados.add(alumno);
                System.out.println("El alumno: " + alumno.getNombre() + " (" + alumno.getRut() + ")");
                System.out.println("Fue asignado al curso: " + curso.getNombreCurso() + " (" + curso.getCodigo() + ")");
                System.out.println(asignaciones);
            }
        }
    }

    public void submenu() {
        Scanner sc = new Scanner(System.in);

        String opcion;

        System.out.println("Desea ver la lista de cursos? Y/N");
        opcion = sc.nextLine();
        if (opcion.equalsIgnoreCase("Y")) {
            int contadorSubmenu = 0;
            for (Curso curso : cursos) {
                contadorSubmenu++;
                System.out.println(contadorSubmenu + ".-" + curso.getNombreCurso() + " - Codigo: (" + curso.getCodigo() + ")");
            }
        }

        System.out.println("Ingrese el codigo del curso al que desea acceder: ");
        String codigoCurso = sc.nextLine();
        System.out.println("Desea ver la lista de alumnos? Y/N");
        opcion = sc.nextLine();

        if (opcion.equalsIgnoreCase("Y")) {
            for (Alumno alumno : alumnos) {
                System.out.println(".- " + alumno);
            }
        }

        System.out.println("Ingrese el rut del alumno que desea asignar al curso");
        String rutAlumno = sc.nextLine();

        asignarCurso(rutAlumno, codigoCurso.toUpperCase());
    }

    public void alumnosXCurso() {
        int contadorXCurso = 0;
        for (Curso curso : cursos) {
            System.out.println("Curso: " + curso.getNombreCurso() + "(" + curso.getCodigo() + ")");

            List<Alumno> alumnos = asignaciones.get(curso);

            if (alumnos != null && !alumnos.isEmpty()) {
                for (Alumno alumno : alumnos) {
                    contadorXCurso++;
                    System.out.println(contadorXCurso + ".-" + alumno.getNombre() + " (" + alumno.getRut() + ")");
                }
            } else {
                System.out.println("--> Sin alumnos <--");
            }
            System.out.println();
        }
    }
}