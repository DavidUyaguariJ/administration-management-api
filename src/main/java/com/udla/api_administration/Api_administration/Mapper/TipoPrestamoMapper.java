package com.udla.api_administration.Api_administration.Mapper;

import com.udla.api_administration.Api_administration.Dto.Prestamo.TipoPrestamoCreateDTO;
import com.udla.api_administration.Api_administration.Dto.Prestamo.TipoPrestamoDTO;
import com.udla.api_administration.Api_administration.Entity.TipoPrestamo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TipoPrestamoMapper {
    TipoPrestamoDTO toDTO(TipoPrestamo entidad);

    TipoPrestamo toEntity(TipoPrestamoCreateDTO dto);
}
