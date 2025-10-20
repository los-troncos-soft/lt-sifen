package com.lt_soft.sifen.validators.emisor;

import com.lt_soft.sifen.enums.EAmbiente;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AmbienteValidator implements ConstraintValidator<ValidAmbiente, Short> {
    @Override
    public boolean isValid(Short value, ConstraintValidatorContext context) {
        if (value == null)
            return false; // True == opcional, false == obligatorio

        return EAmbiente.getByVal(value) != null;
    }
}

