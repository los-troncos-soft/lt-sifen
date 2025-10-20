package com.lt_soft.sifen.validators.emisor;

import com.lt_soft.sifen.enums.ETipoRegimen;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TipoRegimenValidator implements ConstraintValidator<ValidTipoRegimen, Short> {
    @Override
    public boolean isValid(Short value, ConstraintValidatorContext context) {
        if (value == null)
            return false; // True == opcional, false == obligatorio

        return ETipoRegimen.getByVal(value) != null;
    }
}
