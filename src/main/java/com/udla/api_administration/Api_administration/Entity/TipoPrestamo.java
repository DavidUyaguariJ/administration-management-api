package com.udla.api_administration.Api_administration.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="tipo_prestamo")
@Data
public class TipoPrestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(max = 100)
    private String nombre;

    @Size(max = 300)
    private String descripcion;

    @NotBlank
    private String tipoGeneral;

    @DecimalMin("0.01") @DecimalMax("100")
    private Double tasaBase;

    @DecimalMin("0")
    private Double cuotaMinima;

    private String otrosRequisitos;
    @OneToMany(mappedBy = "tipoPrestamo", cascade = CascadeType.ALL)
    private List<EntidadTipoPrestamo> entidadesTipoPrestamo;
}
