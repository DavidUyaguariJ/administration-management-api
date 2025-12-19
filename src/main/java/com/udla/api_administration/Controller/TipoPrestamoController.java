package com.udla.api_administration.Controller;

import com.udla.api_administration.Dto.Prestamo.TipoPrestamoCreateDTO;
import com.udla.api_administration.Dto.Prestamo.TipoPrestamoDTO;
import com.udla.api_administration.Service.TipoPrestamoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipos_prestamos")
public class
TipoPrestamoController {
    private final TipoPrestamoService service;

    public TipoPrestamoController(TipoPrestamoService service) {
        this.service = service;
    }

    @GetMapping
    public List<TipoPrestamoDTO> listar() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public TipoPrestamoDTO buscar(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public TipoPrestamoDTO crear(@RequestBody TipoPrestamoCreateDTO dto) {
        return service.create(dto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.delete(id);
    }
}

