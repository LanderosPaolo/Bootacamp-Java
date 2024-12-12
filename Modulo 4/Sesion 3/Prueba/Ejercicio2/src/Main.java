import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Declaramos la variable
        int numero, nCeros, nNegativos, nPositivos;
        Scanner sc = new Scanner(System.in);

        //Usamos arrays para guardar los números
        ArrayList<Integer> ceros = new ArrayList<>();
        ArrayList<Integer> negativos = new ArrayList<>();
        ArrayList<Integer> positivos = new ArrayList<>();

        for (int i = 1; i <= 10 ; i++) {
            System.out.print("Introduce número: ");
            numero = sc.nextInt();

            //agregamos los numeros a los arreglos respectivos
            if(numero < 0) {
                negativos.add(numero);
            } else if (numero == 0) {
                ceros.add(numero);
            } else {
                positivos.add(numero);
            }
        }

        //Saber el tamaño del arreglo
        nCeros = ceros.size();
        nNegativos = negativos.size();
        nPositivos = positivos.size();

        System.out.println("El número de ceros introducidos es de: " + nCeros);
        System.out.println("El número de positivos introducidos es de: " + nPositivos);
        System.out.println("El número de negativos introducidos es de: " + nNegativos);

        sc.close();
    }
}