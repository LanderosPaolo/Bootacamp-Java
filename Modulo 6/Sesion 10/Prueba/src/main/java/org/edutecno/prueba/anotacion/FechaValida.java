package org.edutecno.prueba.anotacion;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = Validador.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FechaValida{
    String message() default "La fecha ingresada no coincide con la fecha actual";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
