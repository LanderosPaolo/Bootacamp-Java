package modelsParticipantes;

import interfaces.ITombolaParticipantes;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Participante implements ITombolaParticipantes {
    String nombre;

    public Participante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void creacionDelFichero(ArrayList<Participante> participantes) {
        String nombreFichero = "Participantes.txt";
        File fichero = new File(nombreFichero);

        //Comprobamos si el archivo existe
        if (fichero.exists()) {
            System.out.println("El fichero ya existe, no se creara nuevamente");
            return;
        }

        try {
            FileWriter fw = new FileWriter(nombreFichero);
            PrintWriter pw = new PrintWriter(fw);
            for (Participante participante : participantes) {
                pw.println(participante.getNombre());
            }
            pw.close();
            fw.close();
            System.out.println("El fichero se ha creado con exito");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void agregarParticipante(ArrayList<Participante> participantes) {
        Scanner sc = new Scanner(System.in);
        String nombreFichero = "Participantes.txt";
        String nombreParticipante;
        System.out.println("Ingrese el nombre del participante: ");
        nombreParticipante = sc.nextLine();
        try {
            FileWriter fw = new FileWriter(nombreFichero, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(nombreParticipante);
            participantes.add(new Participante(nombreParticipante));
            System.out.println("El participante se ha agregado con exito");
            pw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void verParticipantes(ArrayList<Participante> participantes) {
        String nombreFichero = "Participantes.txt";
        try {
            FileReader fr = new FileReader(nombreFichero);
            BufferedReader br = new BufferedReader(fr);
            String data = br.readLine();

            while (data != null) {
                System.out.println(data);
                data = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void seleccionarParticipante(ArrayList<Participante> participantes) {
        String nombreFichero = "Participantes.txt";

        try {
            FileReader fr = new FileReader(nombreFichero);
            BufferedReader br = new BufferedReader(fr);
            Random ganador = new Random();
            int indiceGanador = ganador.nextInt(participantes.size());
            System.out.println("El ganador de la bicicleta es: " + "'" + participantes.get(indiceGanador).getNombre() + "'");
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
