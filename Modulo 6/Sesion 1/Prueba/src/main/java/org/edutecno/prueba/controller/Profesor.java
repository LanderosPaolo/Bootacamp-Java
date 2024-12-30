package org.edutecno.prueba.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.edutecno.prueba.model.Alumno;
import org.edutecno.prueba.service.ICalculadora;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profesor {
    private ICalculadora calculadora;

    public void mostrarPromedio(){
        List<Alumno> alumnos = calculadora.calcularPromedios();
        float promedio = (float) alumnos.stream().mapToDouble(Alumno::getPromedio).average().orElse(0);
        System.out.println("Promedio: " + promedio);
    }
}
