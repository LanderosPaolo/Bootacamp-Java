import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        float promedio = 0;
        //Arreglos para guardar asignatura y notas
        String[] asignaturas;
        asignaturas = new String[5];

        float[] notas;
        notas = new float[5];

        //Solicitamos al usuario que ingrese su asignatura y nota correspondiente
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Ingrese el nombre de la asignatura: ");
            asignaturas[i] = sc.next();
            System.out.println("Ingrese el promedio de la asignatura " + asignaturas[i]);
            notas[i] = sc.nextFloat();
            promedio += notas[i] / notas.length;
        }
        System.out.println("Sus notas son las siguientes: ");
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println(asignaturas[i] + " = " + notas[i]);
        }

        System.out.println("Su promedio general es = " + df.format(promedio));

        sc.close();
    }
}