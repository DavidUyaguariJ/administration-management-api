package com.udla.api_administration.Controller;


import com.udla.api_administration.Dto.Entidad.EntidadFinancieraCreateDTO;
import com.udla.api_administration.Dto.Entidad.EntidadFinancieraDTO;
import com.udla.api_administration.Dto.Entidad.EntidadFinancieraUpdateDTO;
import com.udla.api_administration.Service.EntidadFinancieraService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entidades")
@RequiredArgsConstructor

public class EntidadFinancieraController {
    private final EntidadFinancieraService service;

    @GetMapping
    public List<EntidadFinancieraDTO> listar() {
        return service.getAll();
    }

    @PostMapping
    public EntidadFinancieraDTO crear(@RequestBody EntidadFinancieraCreateDTO dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public EntidadFinancieraDTO actualizar(
            @PathVariable Integer id,
            @RequestBody EntidadFinancieraUpdateDTO dto
    ) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.delete(id);
    }
}
