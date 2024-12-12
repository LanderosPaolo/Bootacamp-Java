package org.example.auxiliar;

import org.example.service.UserService;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    //Service
    UserService userService = new UserService();

    public void mostrarMenu() {
        try {
            System.out.println("Bienvenido!");
            System.out.println("Para crear un usuario debe llenar los siguientes campos: ");
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Apellido: ");
            String apellido = sc.nextLine();
            System.out.println("Correo: ");
            String correo = sc.nextLine();
            System.out.println("Contraseña: ");
            String contrasenia = sc.nextLine();

            System.out.println("Gracias! su Usuario es: ");
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Correo: " + correo);
            System.out.println("Contraseña: " + contrasenia);

            System.out.println("Obteniendo datos...");
            Thread.sleep(1000);

            userService.obtenerLocalizacion();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
