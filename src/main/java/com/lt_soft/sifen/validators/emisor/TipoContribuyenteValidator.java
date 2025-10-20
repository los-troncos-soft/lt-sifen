package com.lt_soft.sifen.validators.emisor;

import com.lt_soft.sifen.enums.ETipoContribuyente;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TipoContribuyenteValidator implements ConstraintValidator<ValidTipoContribuyente, Short> {
    @Override
    public boolean isValid(Short value, ConstraintValidatorContext context) {
        if (value == null)
            return false; // True == opcional, false == obligatorio

        return ETipoContribuyente.getByVal(value) != null;
    }
}
