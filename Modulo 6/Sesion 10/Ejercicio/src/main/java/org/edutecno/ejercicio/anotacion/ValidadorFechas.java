package org.edutecno.ejercicio.anotacion;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.edutecno.ejercicio.entidad.Curriculum;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ValidadorFechas implements ConstraintValidator<EdadFechaValida, Curriculum> {
    @Override
    public boolean isValid(Curriculum curriculum, ConstraintValidatorContext context) {
        try {
            LocalDate fechaNacimiento = LocalDate.parse(curriculum.getFecha(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            int edadCalculada = Period.between(fechaNacimiento, LocalDate.now()).getYears();
            return edadCalculada == curriculum.getEdad();
        } catch (Exception e) {
            return false;
        }
    }
}
