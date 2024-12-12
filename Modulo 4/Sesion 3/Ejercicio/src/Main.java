import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número al azar: ");
        numero = sc.nextInt();

        System.out.println("\nPatron 1:");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.print(".");
            } else {
                System.out.print("*");
            }
        }

        System.out.println("\nPatron 2:");
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero; j++) {
                if (i == 1 || i == numero) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == numero) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
            sc.close();
    }
}