package com.lt_soft.sifen.dtos.common;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class EmisorDE {
    @NotBlank(message = "El RUC del Emisor es obligatorio")
    @Size(min = 5, max = 8, message = "El RUC debe tener entre 5 y 8 dígitos")
    private String ruc;
}
