package org.edutecno.ejercicio.anotacion;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidadorFechas.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface EdadFechaValida {
    String message() default "La fecha de nacimiento y la edad no coinciden";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
