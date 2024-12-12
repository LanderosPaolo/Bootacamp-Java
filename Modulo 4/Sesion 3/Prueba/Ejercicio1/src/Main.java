import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaramos variables
        int num;
        int numerosPar;
        int numerosImpar;

        //arrays para guardar numeros pares e impares
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();


        //Solicitamos numero al usuario
        System.out.println("Ingrese un número entre 1 y 100: ");
        num = sc.nextInt();

        //En caso de no estar entre 1 y 100 se vuelve a repetir
        while(num < 1 || num > 100) {
            System.out.println("----- Error -----");
            System.out.println("Ingrese un número entre 1 y 100: ");
            num = sc.nextInt();
        }

        //Con el for recorremos la cantidad de números que hay entre 1 y el número del usuario
        for(int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            } else {
                impares.add(i);
            }
        }

        //Contamos la cantidad de elementos en el arreglo
        numerosPar = pares.size();
        numerosImpar = impares.size();

        //Damos el mensaje por consola
        System.out.println("El total de números pares es: " + numerosPar);
        System.out.println("El total de números impares es: " + numerosImpar);
        System.out.println("----- Fin del programa -----");

        sc.close();
    }
}