package org.edutecno.vistas;

import org.edutecno.modelos.Alumno;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public abstract class MenuTemplate {
    protected abstract void exportarDatos(Map<String, Alumno> alumnoList);

    protected void crearAlumno() {
    }
    public abstract void agregarMateria(List<Alumno> alumnoList);

    protected abstract void agregarNotaPasoUno(List<Alumno> alumnoList);

    protected void listarAlumnos() {
    }

    protected void terminarPrograma() {
    }

    public void iniciarMenu(List<Alumno> alumnoList) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        Map<String, Alumno> alumnoMap = new HashMap<>();
        for (Alumno alumno : alumnoList) {
            alumnoMap.put(alumno.getRut(), alumno);
        }

            do {
                System.out.println("\n---> Menu Principal <---");
                System.out.println("1. Crear Alumno");
                System.out.println("2. Agregar Materia");
                System.out.println("3. Agregar Nota Paso 1");
                System.out.println("4. Listar alumnos");
                System.out.println("5. Exportar Datos");
                System.out.println("6. Terminar programa");

                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        crearAlumno();
                        break;
                    case 2:
                        agregarMateria(alumnoList);
                        break;
                    case 3:
                        agregarNotaPasoUno(alumnoList);
                        break;
                    case 4:
                        listarAlumnos();
                        break;
                    case 5:
                        exportarDatos(alumnoMap);
                        break;
                    case 6:
                        terminarPrograma();
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            } while (opcion != 6);
    }
}
