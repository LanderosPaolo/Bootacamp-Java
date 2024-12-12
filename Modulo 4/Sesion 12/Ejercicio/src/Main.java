import modelsParticipantes.Participante;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Participante participante = new Participante("");

        //Iniciamos con el arreglo con los participantes predeterminados
        ArrayList<Participante> listaParticipantes = new ArrayList<>();
        listaParticipantes.add(new Participante("Diego Perez"));
        listaParticipantes.add(new Participante("Juan Barrios"));
        listaParticipantes.add(new Participante("Julia Inostroza"));
        listaParticipantes.add(new Participante("Fernando Solis"));
        listaParticipantes.add(new Participante("Alexandra Alvarez"));
        listaParticipantes.add(new Participante("Camila Gomez"));
        listaParticipantes.add(new Participante("Pedro Olea"));

        //Crear el fichero con los datos predeterminados en caso de que no exista
        participante.creacionDelFichero(listaParticipantes);

        //Menú
        int opcion;

        do {
            System.out.println("\n-----> TOMBOLA PARA GANAR BICICLETA <-----");
            System.out.println("1- Agregar un nuevo participante");
            System.out.println("2- Ver lista completa de participantes");
            System.out.println("3- Seleccionar al ganador");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    participante.agregarParticipante(listaParticipantes);
                    break;
                case 2:
                    System.out.println("\n-----> Participantes <-----");
                    participante.verParticipantes(listaParticipantes);
                    break;
                case 3:
                    participante.seleccionarParticipante(listaParticipantes);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 3);
    }
}