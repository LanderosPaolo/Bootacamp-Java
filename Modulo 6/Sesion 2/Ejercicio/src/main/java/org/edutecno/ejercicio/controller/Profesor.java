package org.edutecno.ejercicio.controller;

import lombok.*;
import org.edutecno.ejercicio.model.Alumno;
import org.edutecno.ejercicio.service.ICalculadora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@Getter
@Setter
@Component
public class Profesor {
    private ICalculadora calculadora;

    @Autowired
    public Profesor(@Qualifier("calculadoraPrin") ICalculadora calculadora) {
        this.calculadora = calculadora;
    }

    public void mostrarPromedio() {
        List<Alumno> alumnos = calculadora.calcularPromedios();
        float promedio = (float) alumnos.stream().mapToDouble(Alumno::getPromedio).average().orElse(0);
        System.out.println("Promedio: " + promedio);
    }
}
