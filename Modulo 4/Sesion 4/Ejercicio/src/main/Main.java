package main;

import model.Persona;

public class Main {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];
        personas[0] = new Persona("Juan", 16, 54.1, 1.74);
        personas[1] = new Persona("Sofía", 17, 60.8, 1.60);
        personas[2] = new Persona("Pedro", 18, 80.2, 1.70);
        personas[3] = new Persona("María", 19, 90.8, 1.62);
        personas[4] = new Persona("Matías", 20, 150.6, 1.84);

        for(Persona persona : personas) {
            System.out.println(persona.getNombre() + ":");
            System.out.println("Calculando su IMC....");
            System.out.printf("Su indice de masa muscular es: %.2f\n", persona.calcularIMC());
            if(persona.calcularIMC() <= 18.4) {
                System.out.println("Usted se encuentra bajo peso");
            } else if(persona.calcularIMC() >= 18.5 && persona.calcularIMC() <= 24.9) {
                System.out.println("Usted se encuentra en un peso normal");
            } else if(persona.calcularIMC() >= 25.0 && persona.calcularIMC() <= 29.9) {
                System.out.println("Usted se encuentra sobre peso");
            } else if(persona.calcularIMC() >= 30.0 && persona.calcularIMC() <= 34.9) {
                System.out.println("Usted se encuentra con obesidad clase 1");
            } else if(persona.calcularIMC() >= 35.0 && persona.calcularIMC() <= 39.9) {
                System.out.println("Usted se encuentra con obesidad clase 2");
            } else {
                System.out.println("Usted se encuentra con obesidad clase 3");
            }

            System.out.println("Su edad es: " + persona.getEdad());
            if(persona.getEdad() >= 18) {
                System.out.println("Ustes es mayor de edad");
            } else {
                System.out.println("Usted es menor de edad");
            }
            System.out.println(persona.toString());
            System.out.println("----------------------------\n");
        }
    }
}