package org.edutecno.ejercicio.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class Curriculum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombre;

    @NotBlank(message = "El apellido no puede estar vacío")
    private String apellido;

    @NotBlank(message = "La fecha de nacimiento no puede estar vacía")
    private String fecha;

    @NotNull(message = "La edad es obligatoria")
    @Min(value = 1, message = "La edad debe ser mayor a 0")
    private Integer edad;

    @NotBlank(message = "El correo electrónico no puede estar vacío")
    @Email(message = "Debe ingresar un correo electrónico válido")
    private String email;

    @NotBlank(message = "El número no puede estar vacío")
    @Pattern(regexp = "^[0-9]{11}$", message = "El número debe tener 11 dígitos")
    private String numero;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "El nombre no puede estar vacío") String getNombre() {
        return nombre;
    }

    public void setNombre(@NotBlank(message = "El nombre no puede estar vacío") String nombre) {
        this.nombre = nombre;
    }

    public @NotBlank(message = "El apellido no puede estar vacío") String getApellido() {
        return apellido;
    }

    public void setApellido(@NotBlank(message = "El apellido no puede estar vacío") String apellido) {
        this.apellido = apellido;
    }

    public @NotBlank(message = "La fecha de nacimiento no puede estar vacía") String getFecha() {
        return fecha;
    }

    public void setFecha(@NotBlank(message = "La fecha de nacimiento no puede estar vacía") String fecha) {
        this.fecha = fecha;
    }

    public @NotNull(message = "La edad es obligatoria") @Min(value = 1, message = "La edad debe ser mayor a 0") Integer getEdad() {
        return edad;
    }

    public void setEdad(@NotNull(message = "La edad es obligatoria") @Min(value = 1, message = "La edad debe ser mayor a 0") Integer edad) {
        this.edad = edad;
    }

    public @NotBlank(message = "El correo electrónico no puede estar vacío") @Email(message = "Debe ingresar un correo electrónico válido") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "El correo electrónico no puede estar vacío") @Email(message = "Debe ingresar un correo electrónico válido") String email) {
        this.email = email;
    }

    public @NotBlank(message = "El número no puede estar vacío") @Pattern(regexp = "^[0-9]{11}$", message = "El número debe tener 11 dígitos") String getNumero() {
        return numero;
    }

    public void setNumero(@NotBlank(message = "El número no puede estar vacío") @Pattern(regexp = "^[0-9]{11}$", message = "El número debe tener 11 dígitos") String numero) {
        this.numero = numero;
    }
}
