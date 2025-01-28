package org.edutecno.prueba.entidad;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Farmacia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreMedicamento;

    @Column(nullable = false)
    private Double precio;
}
