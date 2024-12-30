package org.edutecno.ejercicio.service.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.edutecno.ejercicio.model.Alumno;
import org.edutecno.ejercicio.service.ICalculadora;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculadora implements ICalculadora {
    private List<Alumno> alumnos;

    @Override
    public List<Alumno> calcularPromedio() {
        for(Alumno alumno : alumnos) {
            float promedio = (float) alumno.getNotas().stream().mapToInt(Integer::intValue).average().orElse(0);
            alumno.setPromedio(promedio);
        }
        return alumnos;
    }
}
