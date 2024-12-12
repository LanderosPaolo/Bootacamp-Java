import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaramos las variables
        int altura, base, area, perimetro;

        //Capturar y almacenar variables
        System.out.println("Ingrese la altura del rectangulo: ");
        altura = sc.nextInt();
        System.out.println("Ingrese la base del rectangulo: ");
        base = sc.nextInt();

        //Asignar los resultados a sus respectivas variables
        area = base * altura;
        perimetro = (base * 2) + (altura * 2);

        //Mostrar resultados en consola
        System.out.println("El área del rectangulo es: " + area + " metros");
        System.out.println("El perímetro del rectangulo es: " + perimetro + " metros");

        sc.close();
    }
}