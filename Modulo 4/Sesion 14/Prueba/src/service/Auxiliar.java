package service;

import models.Persona;

import java.util.*;

public class Auxiliar {
    private List<Persona> socios;

    public Auxiliar() {
        this.socios = new ArrayList<>();

        //Ingresamos los socios por defecto, parten en 5 socios
        socios.add(new Persona("Laura Martínez", 28, "Diseñadora gráfica"));
        socios.add(new Persona("Carlos Rivera", 35, "Ingeniero de software"));
        socios.add(new Persona("Sofía Gómez", 22, "Estudiante de medicina"));
        socios.add(new Persona("Miguel Torres", 40, "Profesor de historia"));
        socios.add(new Persona("Ana Rojas", 30, "Consultora de marketing"));
    }

    // Metodos
    public void cantidadSocios() {
        int numeroSocios = socios.size();
        for (Persona socio : socios) {
            System.out.println(socio);
        }
        System.out.println("Número de socios: " + numeroSocios);
    }

    public String nombreSocio() {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Ingrese el nombre del socio: ");
                String nombre = sc.nextLine();
                if (nombre.isEmpty() || !nombre.matches("[a-zA-Z ]+")) {
                    throw new Exception("\nEl nombre no puede contener números ni estar vacío.");
                }
                return nombre;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public Integer edadSocio() {
        Scanner sc = new Scanner(System.in);
        int edad;
        do {
            try {
                System.out.println("Ingrese la edad del socio: ");
                edad = Integer.parseInt(sc.next());
                if (edad < 0) {
                    throw new Exception("\nLa edad no puede ser negativa.");
                }
                return edad;

            } catch (NumberFormatException e) {
                System.out.println("\nEl dato ingresado no es un número.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public String cargoSocio() {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Ingrese el cargo del socio: ");
                String cargo = sc.nextLine();
                if (cargo.isEmpty() || !cargo.matches("[a-zA-Z ]+")) {
                    throw new Exception("\nEl cargo no puede contener números.");
                }
                return cargo;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }


    public void agregarSocio() {
        String nombre = nombreSocio();
        Integer edad = edadSocio();
        String cargo = cargoSocio();
        try {
            if (socios.stream().anyMatch(p -> p.getNombre().equals(nombre) &&
                    p.getEdad() == edad &&
                    p.getCargo().equals(cargo))) {

                System.out.println("nombre: " + nombre + ", Edad: " + edad + ", Cargo: " + cargo);
                throw new Exception("\nSocio ya esta afiliado");
            } else {
                if (socios.size() < 7) {
                    socios.add(new Persona(nombre, edad, cargo));
                    System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Cargo: " + cargo);
                    System.out.println("Socio afiliado exitosamente, bienvenido!");
                } else {
                    throw new Exception("El club ha llegado al número maximo de socios.");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}