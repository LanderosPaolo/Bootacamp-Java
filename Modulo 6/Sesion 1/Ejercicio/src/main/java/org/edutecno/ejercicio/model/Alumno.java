package org.edutecno.ejercicio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {
    private String rut;
    private String nombre;
    private List<Integer> notas;
    private Float promedio;
}
