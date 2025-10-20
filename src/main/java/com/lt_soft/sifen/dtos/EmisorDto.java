package com.lt_soft.sifen.dtos;

import com.lt_soft.sifen.validators.emisor.*;
import lombok.Data;
import javax.validation.constraints.*;

@Data
public class EmisorDto {
    @NotBlank(message = "El RUC es obligatorio")
    @Size(min = 5, max = 8, message = "El RUC debe tener entre 5 y 8 dígitos")
    private String ruc;
    @NotBlank(message = "El DV es obligatorio")
    @Size(max = 1, message = "El DV debe tener solo 1 carácter")
    private String DV;

    @NotNull(message = "El tipo de contribuyente es obligatorio")
    @ValidTipoContribuyente
    private short tipoContribuyente;

    @NotNull(message = "El tipo de régimen es obligatorio")
    @ValidTipoRegimen
    private short tipoRegimen;

    @NotBlank(message = "La razón social es obligatoria")
    private String razonSocial;

    private String nombreFantasia;

    @NotBlank(message = "La dirección es obligatoria")
    private String direccion;

    @NotNull(message = "El número de casa es obligatorio")
    private short nroCasa;

    private String direccion1;

    private String direccion2;

    @NotNull(message = "El departamento es obligatorio")
    @ValidDepartamento
    private short departamento;

    private short distrito;

    private short ciudad;

    @NotBlank(message = "El teléfono es obligatorio")
    private String telefono;

    @Email(message = "El correo electrónico no tiene un formato válido")
    private String email;

    private String sucursal;

    @NotBlank(message = "El código de la actividad es obligatorio")
    private String codigoActividad;

    @NotBlank(message = "La descripción de la actividad es obligatoria")
    private String descripcionActividad;

    @NotNull(message = "El tipo de documento del responsable es obligatorio")
    @ValidTipoDocumento
    private short tipoDocumentoResponsable;

    @NotBlank(message = "El nro de documento del responsable es obligatorio")
    private String nroDocumentoResposanble;

    @NotBlank(message = "El nombre del responsable es obligatorio")
    private String nombreResponsable;

    @NotBlank(message = "El cargo del responsable es obligatorio")
    private String cargoResponsable;

    @NotBlank(message = "El path del certificado es obligatorio")
    private String pathCertificado;

    @NotBlank(message = "El password del certificado es obligatorio")
    private String passwordCertificado;

    @NotBlank(message = "El IdCSC1 es obligatorio")
    private String idCsc1;

    @NotBlank(message = "El CSC1 es obligatorio")
    private String csc1;

    private String idCsc2;

    private String csc2;

    @NotNull(message = "El ambiente es obligatorio")
    @ValidAmbiente
    private short ambiente;
}
