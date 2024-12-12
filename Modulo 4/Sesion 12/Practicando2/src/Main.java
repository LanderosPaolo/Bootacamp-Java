import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 4
        /*String nombre = "archivo.txt";

        ArrayList<String> numerosString;
        ArrayList<Integer> numeros = new ArrayList<>();

        try {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            String data = br.readLine();

            numerosString = new ArrayList<>(Arrays.asList(data.split(",")));

            for(String temp : numerosString){
                numeros.add(Integer.parseInt(temp));
            }
            System.out.println(numeros);

            br.close();
            fr.close();

        } catch (Exception e) {
            System.out.println("archivo no encontrado");
        }*/

        //Ejecutar un fichero con mas de una linea
        String nombre = "archivo.txt";
        ArrayList<Integer> numeros = new ArrayList<>();
        try {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            String data = br.readLine();
            while (data != null) {
                numeros.add(Integer.parseInt(data));
                data = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("No fue posible acceder al fichero");
        }
        System.out.println(numeros);
    }
}