package com.udla.api_administration.Mapper;

import org.mapstruct.Mapper;
import com.udla.api_administration.Dto.Entidad.*;
import com.udla.api_administration.Entity.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EntidadFinancieraMapper {

    EntidadFinancieraMapper MAPPER = Mappers.getMapper(EntidadFinancieraMapper.class);

    EntidadFinancieraDTO toDTO(EntidadFinanciera entidad);

    EntidadFinanciera toEntity(EntidadFinancieraCreateDTO dto);

    EntidadFinanciera toEntity(EntidadFinancieraUpdateDTO dto);

}

