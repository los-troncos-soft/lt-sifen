package com.lt_soft.sifen.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "emisores")
public @Data class Emisor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_emisor")
  private Long id;
  @Column(name = "ruc", nullable = false, length = 8)
  private String ruc;
  @Column(name = "dv", nullable = false, length = 1)
  private String DV;
  @Column(name = "tipo_contribuyente", nullable = false)
  private short tipoContribuyente;
  @Column(name = "tipo_regimen", nullable = false)
  private short tipoRegimen;
  @Column(name = "razon_social", nullable = false, length = 255)
  private String razonSocial;
  @Column(name = "nombre_fantasia", nullable = true, length = 255)
  private String nombreFantasia;
  @Column(name = "direccion", nullable = false, length = 255)
  private String direccion;
  @Column(name = "nro_casa", nullable = false)
  private short nroCasa;
  @Column(name = "direccion1", nullable = true, length = 255)
  private String direccion1;
  @Column(name = "direccion2", nullable = true, length = 255)
  private String direccion2;
  @Column(name = "departamento", nullable = false)
  private short departamento;
  @Column(name = "idistrito", nullable = true)
  private short distrito;
  @Column(name = "ciudad", nullable = true)
  private short ciudad;
  @Column(name = "telefono", nullable = false, length = 15)
  private String telefono;
  @Column(name = "email", nullable = false, length = 80)
  private String email;
  @Column(name = "sucursal", nullable = true, length = 30)
  private String sucursal;
  @Column(name = "codigo_actividad", nullable = false, length = 10)
  private String codigoActividad;
  @Column(name = "descripcion_actividad", nullable = false, length = 300)
  private String descripcionActividad;
  @Column(name = "path_certificado", nullable = false, length = 255)
  private String pathCertificado;
  @Column(name = "password_certificado", nullable = false, length = 50)
  private String passwordCertificado;
  @Column(name = "id_csc_1", nullable = false, length = 5)
  private String idCsc1;
  @Column(name = "csc_1", nullable = false, length = 50)
  private String csc1;
  @Column(name = "ambiente", nullable = false)
  private short ambiente;
}
