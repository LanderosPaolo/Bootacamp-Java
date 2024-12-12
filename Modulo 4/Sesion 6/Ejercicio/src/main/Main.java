package main;

import model.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        String usuario, contrasena;
        boolean existeUsuario = false;
        int opcion = 0, numero, base, exponente;

        ArrayList<Persona> listaPersona = new ArrayList<>();

        // Usuarios iniciales
        listaPersona.add(new Persona("usuario1", "123"));
        listaPersona.add(new Persona("usuario2", "456"));
        listaPersona.add(new Persona("usuario3", "789"));

        while (!existeUsuario) {
            System.out.println("Ingrese su usuario: ");
            usuario = sc.next();
            System.out.println("Ingrese su contrasena: ");
            contrasena = sc.next();

            System.out.println("Validando credenciales...");
            Thread.sleep(3000);

            // Recorre la lista en busca de credenciales correctas
            for (Persona persona : listaPersona) {
                if (persona.getUsuario().equals(usuario) && persona.getContrasena().equals(contrasena)) {
                    existeUsuario = true;
                    System.out.println("Iniciando sesión....\n");
                    Thread.sleep(1000);

                    // Mostrando menú
                    do {
                        System.out.println("Bienvenido: " + persona.getUsuario());
                        System.out.println("¿Qué desea realizar?");
                        System.out.println("1- Calcular la raíz cuadrada de un número");
                        System.out.println("2- Ver el valor de π");
                        System.out.println("3- Calcular la potencia de un número");
                        System.out.println("4- Salir: ");
                        opcion = sc.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Ingresa un número: ");
                                numero = sc.nextInt();
                                System.out.println("La raíz cuadrada del número '" + numero + "' es: " + Math.sqrt(numero) + "\n");
                                break;
                            case 2:
                                System.out.println("π = " + Math.PI + "\n");
                                break;
                            case 3:
                                System.out.println("Ingrese un número base: ");
                                base = sc.nextInt();
                                System.out.println("Ingrese el exponente: ");
                                exponente = sc.nextInt();
                                System.out.println("'" + base + "' elevado a '" + exponente + "' es: " + Math.pow(base, exponente) + "\n");
                                break;
                            case 4:
                                System.out.println("Saliendo....");
                                break;
                            default:
                                System.out.println("\n-----------------------------------");
                                System.out.println("Opción no válida, vuelva a intentar");
                                System.out.println("-----------------------------------\n");
                        }
                    } while (opcion != 4);

                    break;

                }
            }
            // En caso de no coincidir, vuelve a preguntar por las credenciales
            if (!existeUsuario) {
                Thread.sleep(3000);
                System.out.println("Credenciales no válidas, intente nuevamente.");
            }
        }
        sc.close();
    }
}
