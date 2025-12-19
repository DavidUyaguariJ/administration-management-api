package com.udla.api_administration.Service;

import com.udla.api_administration.Dto.Prestamo.TipoPrestamoCreateDTO;
import com.udla.api_administration.Dto.Prestamo.TipoPrestamoDTO;
import com.udla.api_administration.Entity.TipoPrestamo;
import com.udla.api_administration.Mapper.TipoPrestamoMapper;
import com.udla.api_administration.Repository.TipoPrestamoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPrestamoService {

    private final TipoPrestamoRepository repo;
    private final TipoPrestamoMapper mapper;

    public TipoPrestamoService(TipoPrestamoRepository repo, TipoPrestamoMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    public TipoPrestamoDTO findById(Integer id) {
        return mapper.toDTO(repo.findById(id).orElseThrow());
    }

    public List<TipoPrestamoDTO> getAll() {
        return repo.findAll().stream().map(mapper::toDTO).toList();
    }

    public TipoPrestamoDTO create(TipoPrestamoCreateDTO dto) {
        TipoPrestamo entidad = mapper.toEntity(dto);
        repo.save(entidad);
        return mapper.toDTO(entidad);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}