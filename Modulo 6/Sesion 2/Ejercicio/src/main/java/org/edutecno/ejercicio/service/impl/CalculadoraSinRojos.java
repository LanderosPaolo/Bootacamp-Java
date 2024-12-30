package org.edutecno.ejercicio.service.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.edutecno.ejercicio.model.Alumno;
import org.edutecno.ejercicio.service.ICalculadora;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Getter
@Setter
@Component("calculadoraSinRojos")
public class CalculadoraSinRojos implements ICalculadora {
    private List<Alumno> alumnos;

    @Override
    public List<Alumno> calcularPromedios() {
        for (
                Alumno alumno : alumnos) {
            float promedio = (float) alumno.getNotas().stream().filter(nota -> nota >= 3).mapToInt(Integer::intValue).average().orElse(0);
            alumno.setPromedio(promedio);
        }
        return alumnos;
    }

}

