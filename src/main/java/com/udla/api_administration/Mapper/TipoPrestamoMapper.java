package com.udla.api_administration.Mapper;

import com.udla.api_administration.Dto.Prestamo.TipoPrestamoCreateDTO;
import com.udla.api_administration.Dto.Prestamo.TipoPrestamoDTO;
import com.udla.api_administration.Entity.TipoPrestamo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TipoPrestamoMapper {

    TipoPrestamoMapper MAPPER = Mappers.getMapper(TipoPrestamoMapper.class);

    TipoPrestamoDTO toDTO(TipoPrestamo entidad);

    TipoPrestamo toEntity(TipoPrestamoCreateDTO dto);
}
