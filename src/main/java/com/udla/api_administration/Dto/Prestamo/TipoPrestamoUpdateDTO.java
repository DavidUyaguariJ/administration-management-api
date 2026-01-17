package com.udla.api_administration.Dto.Prestamo;

import lombok.Data;

@Data
public class TipoPrestamoUpdateDTO {
    private String nombre;
    private String descripcion;
    private String tipoGeneral;
    private Double tasaBase;
    private Double cuotaMinima;
    private String otrosRequisitos;
}
