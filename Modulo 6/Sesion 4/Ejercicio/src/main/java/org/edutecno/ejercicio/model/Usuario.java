package org.edutecno.ejercicio.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Usuario {
    private String nombre;
    private String apellido;
    private String username;
    private String password;
    private String email;
}
