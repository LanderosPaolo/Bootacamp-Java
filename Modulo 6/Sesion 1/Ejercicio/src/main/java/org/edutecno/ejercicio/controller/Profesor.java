package org.edutecno.ejercicio.controller;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.edutecno.ejercicio.service.ICalculadora;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profesor {
    private ICalculadora calculadora;

    public void mostrarAlumnosConPromedios(){
        calculadora.calcularPromedio().forEach(System.out::println);
    }
}
