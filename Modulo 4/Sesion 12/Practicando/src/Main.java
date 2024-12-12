import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String nombre = "archivo2.txt";

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try {
            FileWriter fw = new FileWriter(nombre);
            PrintWriter pw = new PrintWriter(fw);

            for (int i = 0; i < numeros.length; i++) {
                pw.println(numeros[i]);
            }

            pw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Fichero " + nombre + "no se pudo crear" + e);
        }
    }
}