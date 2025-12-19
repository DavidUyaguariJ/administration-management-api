package com.udla.api_administration.Dto.Entidad;

import lombok.Data;

@Data
public class EntidadFinancieraDTO {
    private Integer id;
    private String nombre;
    private Double tasaInteres;
    private Double ingresoMinimo;
    private Double relacionCuotaIngresoMaxima;
    private Integer antiguedadHistorialMinima;
    private boolean aceptaMora;
    private boolean requiereTarjetaCredito;
}
