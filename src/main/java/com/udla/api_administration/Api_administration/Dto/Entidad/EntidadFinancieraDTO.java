package com.udla.api_administration.Api_administration.Dto.Entidad;
import lombok.Data;
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
