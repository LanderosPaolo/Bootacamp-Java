import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declarar variables
        float temperatura;

        //Damos la bienvenida la usuario y le pedimos la temperatura de hoy
        System.out.print("Bienvenido\n");
        System.out.print("Por favor, ingrese la temperatura de hoy: ");
        temperatura = sc.nextFloat();

        if(temperatura <= 10) {
            System.out.print("Hay " + temperatura + " grados. El tipo de clima hoy es frío");
        } else if(temperatura > 10 && temperatura <= 20) {
            System.out.print("Hay " + temperatura + " grados. El tipo de clima hoy es nublado");
        } else if(temperatura > 20 && temperatura <= 30) {
            System.out.print("Hay " + temperatura + " grados. El tipo de clima hoy es caluroso");
        } else {
            System.out.print("Hay " + temperatura + " grados. El tipo de clima hoy es tropical");
        }
        sc.close();
    }
}