package com.lt_soft.sifen.validators.emisor;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = AmbienteValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidAmbiente {
    String message() default "Ambiente inválido. Valores 0 == TEST, 1 == PRODUCCION";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
