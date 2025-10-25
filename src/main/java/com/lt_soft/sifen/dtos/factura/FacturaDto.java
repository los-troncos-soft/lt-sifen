package com.lt_soft.sifen.dtos.factura;

import com.lt_soft.sifen.dtos.common.EmisorDE;
import com.lt_soft.sifen.dtos.common.Operacion;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
public class FacturaDto {
    @NotNull(message = "Los datos de la operación son requeridos")
    @Valid
    private Operacion operacion;

    @NotNull(message = "La información del emisor es requerida")
    @Valid
    private EmisorDE emisor;
}
