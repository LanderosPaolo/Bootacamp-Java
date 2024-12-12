import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaramos las variables
        float peso, altura, IMC;
        Scanner sc = new Scanner(System.in);

        //Solicitamos los datos al usuario
        System.out.print("Ingrese su peso en KG: ");
        peso = sc.nextFloat();
        System.out.print("Ingrese su altura en metros: ");
        altura = sc.nextFloat();

        IMC = peso / (altura * altura);

        //Imprimiendo en consola
        System.out.println("Calculando su IMC...");

        System.out.println("Su indice de masa corporal es: " + IMC);

        sc.close();
    }
}