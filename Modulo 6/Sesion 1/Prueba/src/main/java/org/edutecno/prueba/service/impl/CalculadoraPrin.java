package org.edutecno.prueba.service.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.edutecno.prueba.model.Alumno;
import org.edutecno.prueba.service.ICalculadora;

import java.util.List;

@Data
@AllArgsConstructor
public class CalculadoraPrin implements ICalculadora {
    private final List<Alumno> alumnos;

    @Override
    public List<Alumno> calcularPromedios() {
        for(Alumno alumno : alumnos){
            float promedio = (float) alumno.getNotas().stream().mapToInt(Integer::intValue).average().orElse(0);
            alumno.setPromedio(promedio);
        }
        return alumnos;
    }
}
