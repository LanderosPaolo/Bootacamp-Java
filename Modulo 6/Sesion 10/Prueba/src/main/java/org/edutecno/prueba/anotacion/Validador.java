package org.edutecno.prueba.anotacion;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Validador implements ConstraintValidator<FechaValida, String> {
    @Override
    public boolean isValid(String fecha, ConstraintValidatorContext context) {
        if (fecha == null || fecha.isEmpty()) {
            return false;
        }

        String fechaActual = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return fecha.equals(fechaActual);
    }
}
