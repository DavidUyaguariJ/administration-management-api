package com.udla.api_administration.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "entidad_financiera")
@Data
public class EntidadFinanciera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(max=100)
    private String nombre;

    @DecimalMin("0.01") @DecimalMax("100")
    private Double tasaInteres;

    @DecimalMin("0")
    private Double ingresoMinimo;

    @DecimalMin("0.01") @DecimalMax("1.0")
    private Double relacionCuotaIngresoMaxima;

    @Min(0) @Max(100)
    private Integer antiguedadHistorialMinima;

    private  boolean aceptarMora;
    private  boolean requiereTarjetaCredito;

    @OneToMany(mappedBy = "entidadFinanciera", cascade = CascadeType.ALL)
    private List<EntidadTipoPrestamo> entidadTipoPrestamos;

}
