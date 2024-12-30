package org.edutecno.prueba.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Libro {
    private int id;
    private String titulo;
    private Autor autor;
    private Editorial editorial;
    private int pagina;
    private String genero;
    private boolean disponible;
}
