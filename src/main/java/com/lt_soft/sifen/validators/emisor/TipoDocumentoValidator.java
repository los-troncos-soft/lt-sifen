package com.lt_soft.sifen.validators.emisor;

import com.lt_soft.sifen.enums.ETipoDocumento;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TipoDocumentoValidator implements ConstraintValidator<ValidTipoDocumento, Short> {
    @Override
    public boolean isValid(Short value, ConstraintValidatorContext context) {
        if (value == null)
            return false; // True == opcional, false == obligatorio

        return ETipoDocumento.getByVal(value) != null;
    }
}
