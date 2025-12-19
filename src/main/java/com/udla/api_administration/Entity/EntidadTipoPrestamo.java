package com.udla.api_administration.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "entidad_tipo_prestamo")
@Data
public class EntidadTipoPrestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name="entidad_financiera_id")
    private  EntidadFinanciera entidadFinanciera;
    @ManyToOne
    @JoinColumn(name="tipo_prestamo_id")
    private TipoPrestamo tipoPrestamo;

}
