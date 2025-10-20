package com.lt_soft.sifen.validators.emisor;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TipoContribuyenteValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidTipoContribuyente {
    String message() default "Tipo de contribuyente inválido. Valores 1 == Persona Física, 2 == Persona Jurídica";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}