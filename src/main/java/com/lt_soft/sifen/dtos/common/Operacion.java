package com.lt_soft.sifen.dtos.common;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class Operacion {
    @NotNull(message = "El tipo de emisión es obligatorio")
    @Min(value = 1, message = "El tipo de emisión: valores permitidos 1 == Normal, 2 == Contingencia")
    @Max(value = 2, message = "El tipo de emisión: valores permitidos 1 == Normal, 2 == Contingencia")
    private short tipoEmision;

    @NotBlank(message = "El código de seguridad es obligatorio")
    @Size(min = 1, max = 9, message = "El código de seguridad debe tener entre 1 y 9 caracteres")
    @Pattern(regexp = "\\d+", message = "El código de seguridad solo puede contener números")
    private String codigoSeguridad;

    @Size(min = 1, max = 3000, message = "La información de emisión debe tener entre 1 y 3000 caracteres")
    private String infoEmision;

    @Size(min = 1, max = 3000, message = "La información fiscal debe tener entre 1 y 3000 caracteres")
    private String infoFiscal;
}
