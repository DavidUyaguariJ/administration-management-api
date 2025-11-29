package com.udla.api_administration.Api_administration.Service;

import com.udla.api_administration.Api_administration.Dto.Entidad.EntidadFinancieraCreateDTO;
import com.udla.api_administration.Api_administration.Dto.Entidad.EntidadFinancieraDTO;
import com.udla.api_administration.Api_administration.Dto.Entidad.EntidadFinancieraUpdateDTO;
import com.udla.api_administration.Api_administration.Entity.EntidadFinanciera;
import com.udla.api_administration.Api_administration.Mapper.EntidadFinancieraMapper;
import com.udla.api_administration.Api_administration.Repository.EntidadFinancieraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntidadFinancieraService {

    private final EntidadFinancieraRepository repo;
    private final EntidadFinancieraMapper mapper;

    public EntidadFinancieraService(EntidadFinancieraRepository repo, EntidadFinancieraMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    public List<EntidadFinancieraDTO> getAll() {
        return repo.findAll().stream().map(mapper::toDTO).toList();
    }

    public EntidadFinancieraDTO create(EntidadFinancieraCreateDTO dto) {
        EntidadFinanciera entidad = mapper.toEntity(dto);
        repo.save(entidad);
        return mapper.toDTO(entidad);
    }

    public EntidadFinancieraDTO update(Integer id, EntidadFinancieraUpdateDTO dto) {
        EntidadFinanciera entidad = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Entidad no encontrada"));

        EntidadFinanciera updated = mapper.toEntity(dto);
        updated.setId(entidad.getId());

        repo.save(updated);
        return mapper.toDTO(updated);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}