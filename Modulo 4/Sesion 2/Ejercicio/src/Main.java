import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declarar variables
        String nombre;
        int p1, p2, p3, p4, p5, total;

        //Solicitar nombre
        System.out.print("Ingrese su nombre: ");
        nombre = sc.next();

        //Solicitar valores
        System.out.print("Ingrese el valor del producto 1: ");
        p1 = sc.nextInt();
        System.out.print("Ingrese el valor del producto 2: ");
        p2 = sc.nextInt();
        System.out.print("Ingrese el valor del producto 3: ");
        p3 = sc.nextInt();
        System.out.print("Ingrese el valor del producto 4: ");
        p4 = sc.nextInt();
        System.out.print("Ingrese el valor del producto 5: ");
        p5 = sc.nextInt();

        total = p1 + p2 + p3 + p4 + p5;

        if (total < 10000) {
            System.out.printf("%s pagaras con efectivo el total de: $%d%n", nombre, total);
        } else if (total >= 10001 && total < 20000) {
            System.out.printf("%s pagaras con tarjeta el total de: $%d%n", nombre, total);
        } else {
            System.out.printf("%s pagaras con cheque el total de: $%d%n", nombre, total);
        }
        sc.close();
    }
}