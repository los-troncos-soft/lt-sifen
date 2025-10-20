package com.lt_soft.sifen.validators.emisor;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DepartamentoValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidDepartamento {
    String message() default "Departamento inválido. Valores admitidos del 1 al 20";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}