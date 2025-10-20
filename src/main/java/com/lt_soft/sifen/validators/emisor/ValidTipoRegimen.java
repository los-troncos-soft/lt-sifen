package com.lt_soft.sifen.validators.emisor;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TipoRegimenValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidTipoRegimen {
    String message() default "Tipo de régimen inválido. Valores: 1 al 8";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
