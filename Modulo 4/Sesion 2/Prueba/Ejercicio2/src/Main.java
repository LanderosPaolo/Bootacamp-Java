import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declarar variables
        double saldo = 1000;
        double depositar, retirar;
        int opcion;

        //Preguntar al usuario que desea hacer y guardar respuesta
        System.out.println("Seleccione la opcíon:");
        System.out.println("1. Depositar dinero a mi cuenta");
        System.out.println("2. Retirar dinero de mi cuenta");
        System.out.println("3. Salir");

        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.printf("Su saldo inicial es: $%,.2f%n", saldo);
                System.out.println("Digite la cantidad que desea depositar: ");
                depositar = sc.nextDouble();
                saldo = saldo + depositar;
                System.out.printf("Saldo actual: $%,.2f%n", saldo);
                System.out.println("Gracias por operar con nostros");
                break;

            case 2:
                System.out.printf("Su saldo inicial es: $%,.2f%n", saldo);
                System.out.println("Digite la cantidad que desea retirar: ");
                retirar = sc.nextDouble();

                if (retirar > saldo) {
                    System.out.println("Saldo insuficiente");
                    System.out.println("Vuelva a intentarlo");
                } else {
                    saldo = saldo - retirar;
                    System.out.printf("Saldo actual: $%,.2f%n", saldo);
                    System.out.println("Gracias por operar con nostros");
                }
                break;

            case 3:
                System.out.println("Gracias por operar con nostros");
                break;
        }
        sc.close();
    }
}