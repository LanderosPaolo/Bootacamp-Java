package org.edutecno.prueba.service.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.edutecno.prueba.model.Alumno;
import org.edutecno.prueba.service.ICalculadora;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class CalculadoraSinAyB implements ICalculadora {
    private final List<Alumno> alumnos;

    @Override
    public List<Alumno> calcularPromedios() {
        for(Alumno alumno : alumnos) {
            List<Integer> notas = new ArrayList<>(alumno.getNotas());
            if (notas.size() > 2) {
                notas.remove(notas.stream().max(Integer::compareTo).orElse(0));
                notas.remove(notas.stream().min(Integer::compareTo).orElse(0));
            }

            float promedio = (float) notas.stream().mapToInt(Integer::intValue).average().orElse(0);
            alumno.setPromedio(promedio);
        }
        return alumnos;
    }
}
