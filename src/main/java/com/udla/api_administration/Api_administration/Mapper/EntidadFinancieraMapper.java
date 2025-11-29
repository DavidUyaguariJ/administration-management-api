package com.udla.api_administration.Api_administration.Mapper;

import org.mapstruct.Mapper;
import com.udla.api_administration.Api_administration.Dto.Entidad.*;
import  com.udla.api_administration.Api_administration.Entity.*;
@Mapper(componentModel = "sping")
public interface EntidadFinancieraMapper {
    EntidadFinancieraDTO toDTO(EntidadFinanciera entidad);

    EntidadFinanciera toEntity(EntidadFinancieraCreateDTO dto);

    EntidadFinanciera toEntity(EntidadFinancieraUpdateDTO dto);

}

