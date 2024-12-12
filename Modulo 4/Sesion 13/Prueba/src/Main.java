import service.Auxiliar;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        //Instancia de auxiliar
        Auxiliar aux = new Auxiliar();

        do {
            System.out.println("\nCentro de estudios integrales");
            System.out.println("1- Mostrar cursos disponibles");
            System.out.println("2- Matricular nuevo alumno");
            System.out.println("3- Agregar nuevo curso");
            System.out.println("4- Asignar curso a un alumno");
            System.out.println("5- Ver lista de alumnos por curso");
            System.out.println("6- Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n---> CURSOS DISPONIBLES <---");
                    aux.listaCursos();
                    break;
                case 2:
                    System.out.println("\n---> MATRICULAR ALUMNO <---");
                    aux.agregarAlumno();
                    break;
                case 3:
                    System.out.println("\n---> AGREGAR CURSO <---");
                    aux.agregarCurso();
                    break;
                case 4:
                    System.out.println("\n---> ASIGNAR CURSO <---");
                    aux.submenu();
                    break;
                case 5:
                    System.out.println("\n---> LISTA DE ALUMNOS POR CURSO <---");
                    aux.alumnosXCurso();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 6);
    }
}