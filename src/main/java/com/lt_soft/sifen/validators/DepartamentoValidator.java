package com.lt_soft.sifen.validators;

import com.lt_soft.sifen.enums.EDepartamento;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DepartamentoValidator implements ConstraintValidator<ValidDepartamento, Short> {

    @Override
    public boolean isValid(Short value, ConstraintValidatorContext context) {
        if (value == null)
            return true; // O false si querés que sea obligatorio

        return EDepartamento.getByVal(value) != null;
    }
}