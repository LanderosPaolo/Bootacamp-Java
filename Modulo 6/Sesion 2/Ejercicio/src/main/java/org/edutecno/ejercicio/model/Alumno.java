package org.edutecno.ejercicio.model;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Alumno {
    private String rut;
    private String nombre;
    private List<Integer> notas;
    private Float promedio;
}
