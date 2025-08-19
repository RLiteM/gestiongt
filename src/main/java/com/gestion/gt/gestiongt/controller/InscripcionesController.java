package com.gestion.gt.gestiongt.controller;

import com.gestion.gt.gestiongt.dto.InscripcionDTO;
import com.gestion.gt.gestiongt.entities.Inscripciones;
import com.gestion.gt.gestiongt.service.InscripcionesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inscripciones")
public class InscripcionesController {

    private final InscripcionesService service;

    public InscripcionesController(InscripcionesService service) {
        this.service = service;
    }

    @GetMapping
    public List<InscripcionDTO> getAll(@RequestParam(required = false) Integer estudianteId) {
        if (estudianteId != null) {
            return service.findByEstudianteId(estudianteId);
        }
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InscripcionDTO> getById(@PathVariable Integer id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Inscripciones create(@RequestBody Inscripciones inscripcion) {
        return service.save(inscripcion);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
