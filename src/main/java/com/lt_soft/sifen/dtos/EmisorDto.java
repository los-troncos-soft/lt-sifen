package com.lt_soft.sifen.dtos;

import lombok.Data;
import javax.validation.constraints.*;

import com.lt_soft.sifen.validators.ValidDepartamento;

@Data
public class EmisorDto {
    @NotBlank(message = "El RUC es obligatorio")
    @Size(min = 5, max = 8, message = "El RUC debe tener entre 5 y 8 dígitos")
    private String ruc;
    @NotBlank(message = "El DV es obligatorio")
    @Size(max = 1, message = "El DV debe tener solo 1 carácter")
    private String DV;

    @NotNull(message = "El tipo de contribuyente es obligatorio")
    private Integer tipoContribuyente;

    @NotNull(message = "El tipo de régimen es obligatorio")
    private Integer tipoRegimen;

    @NotBlank(message = "La razón social es obligatoria")
    private String razonSocial;

    @NotBlank(message = "La dirección es obligatoria")
    private String direccion;

    @NotNull(message = "El número de casa es obligatorio")
    private Integer nroCasa;

    @NotNull(message = "El departamento es obligatorio")
    @ValidDepartamento
    private Short departamento;

    @NotBlank(message = "El teléfono es obligatorio")
    private String telefono;

    @Email(message = "El correo electrónico no tiene un formato válido")
    private String email;
}
