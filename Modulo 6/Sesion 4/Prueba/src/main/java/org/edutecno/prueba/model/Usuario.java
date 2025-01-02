package org.edutecno.prueba.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String username;
    private String password;
    private String email;
}