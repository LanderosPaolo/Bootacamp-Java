package org.edutecno.prueba.model;

import lombok.*;

import java.util.List;

@Data
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
