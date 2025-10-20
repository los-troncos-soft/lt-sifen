package com.lt_soft.sifen.validators.emisor;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TipoDocumentoValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidTipoDocumento {
    String message() default "Tipo de documento inválido. Valores: 1 == Cédula paraguaya, 2 == Pasaporte, 3 == Cédula extranjera, 4 == Carnet de residencia";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
