package com.lt_soft.sifen.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DepartamentoValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidDepartamento {
    String message() default "Departamento inválido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}