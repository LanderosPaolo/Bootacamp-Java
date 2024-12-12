package main;

import model.Persona;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        String user, password, fullName, dateOfBirth;
        int option;

        while (true) {
            System.out.println("Que deseas hacer?");
            System.out.println("1.-Registrar");
            System.out.println("2.-Iniciar sesión");
            System.out.println("3.-Salir");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingrese el nombre del usuario");
                    user = sc.next();

                    while (true) {
                        System.out.println("Ingrese password");
                        password = sc.next();
                        if (password.length() < 10) {
                            System.out.println("\n-----------------------------------------------");
                            System.out.println("La contraseña debe tener al menos 10 caracteres");
                            System.out.println("-----------------------------------------------\n");
                        } else {
                            int upperCase = 0;
                            int numbers = 0;
                            int chars = 0;

                            for (int i = 0; i < password.length(); i++) {
                                if (Character.isUpperCase(password.charAt(i))) {
                                    upperCase++;
                                } else if (Character.isDigit(password.charAt(i))) {
                                    numbers++;
                                } else if (!Character.isLetterOrDigit(password.charAt(i))) {
                                    chars++;
                                }
                            }

                            if (upperCase < 2) {
                                System.out.println("\n-----------------------------------------------");
                                System.out.println("La constraseña debe tener al menos 2 mayusculas");
                                System.out.println("-----------------------------------------------\n");
                            } else if ((numbers + chars) < 3) {
                                System.out.println("\n-------------------------------------------------------------------");
                                System.out.println("La contraseña debe tener al menos 3 números o caracteres especiales");
                                System.out.println("-------------------------------------------------------------------\n");
                            } else {
                                break;
                            }
                        }

                    }
                    System.out.println("Ingrese fecha de nacimiento DD-MM-YYYY");
                    dateOfBirth = sc.next();
                    System.out.println("Ingrese su nombre completo");
                    fullName = sc.next();
                    sc.nextLine();
                    System.out.println("Registrado con éxito");

                    if (personas.size() < 1) {
                        personas.add(new Persona(user, password, fullName, dateOfBirth));
                        System.out.println("-------------------------------------");
                        System.out.println("Lista total de usuarios registrados: ");
                        for (Persona p : personas) {
                            System.out.println("- " + p.getFullName());
                        }
                        System.out.println("-------------------------------------\n");

                    } else {
                        System.out.println("Lamento informar que la lista se encuentra llena");
                    }

                    break;

                case 2:
                    System.out.println("Ingrese el nombre del usuario");
                    user = sc.next();
                    System.out.println("Ingrese password");
                    password = sc.next();

                    boolean isUser = false;

                    for (Persona persona : personas) {
                        if (persona.getUser().equals(user) && persona.getPassword().equals(password)) {
                            isUser = true;
                            System.out.println("Bienvenido/a " + persona.getFullName());
                            String yearString = persona.getDateOfBirth().substring(6, 10);
                            int year = Integer.parseInt(yearString);
                            int currentYear = cal.get(Calendar.YEAR);
                            if ((currentYear - year) >= 18) {
                                System.out.println("Puedes pasar a la zona para mayores de 18 años");
                            } else {
                                System.out.println("No puedes pasar a la zona para mayores de 18 años");
                            }
                            break;
                        }
                    }

                    if (!isUser) {
                        System.out.println("\n---------------------------------");
                        System.out.println("Usuario o contraseña incorrectos.");
                        System.out.println("---------------------------------\n");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    sc.close();
                    return;

                default:
                    System.out.println("\n----------------");
                    System.out.println("Opcion no valida");
                    System.out.println("----------------\n");
                    break;
            }
        }
    }
}