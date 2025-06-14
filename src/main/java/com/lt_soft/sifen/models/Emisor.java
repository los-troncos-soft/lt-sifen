package com.lt_soft.sifen.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "emisores")
@Data
public class Emisor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_emisor")
  private Long id;
  @Column(name = "ruc", nullable = false, length = 8)
  private String ruc;
  @Column(name = "dv", nullable = false, length = 1)
  private String DV;
  @Column(name = "tipo_contribuyente", nullable = false)
  private int tipoContribuyente;
  @Column(name = "tipo_regimen", nullable = false)
  private int tipoRegimen;
  @Column(name = "razon_social", nullable = false, length = 255)
  private String razonSocial;
  @Column(name = "nombre_fantasia", nullable = true, length = 255)
  private String nombreFantasia;
  @Column(name = "direccion", nullable = false, length = 255)
  private String direccion;
  @Column(name = "nro_casa", nullable = false)
  private int nroCasa;
  @Column(name = "direccion1", nullable = true, length = 255)
  private String direccion1;
  @Column(name = "direccion2", nullable = true, length = 255)
  private String direccion2;
  @Column(name = "departamento", nullable = false)
  private int departamento;
  @Column(name = "distrito", nullable = true)
  private int distrito;
  @Column(name = "ciudad", nullable = true)
  private int ciudad;
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
  @Column(name = "tipo_doc_responsable", nullable = false)
  private int tipoDocumentoResponsable;
  @Column(name = "nro_doc_responsable", nullable = false, length = 20)
  private String nroDocumentoResposanble;
  @Column(name = "nombre_responsable", nullable = false, length = 255)
  private String nombreResponsable;
  @Column(name = "cargo_responsable", nullable = false, length = 255)
  private String cargoResponsable;
}
