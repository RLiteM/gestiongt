package com.gestion.gt.gestiongt.controller;

import com.gestion.gt.gestiongt.entities.Profesores;
import com.gestion.gt.gestiongt.service.ProfesoresService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
public class ProfesoresController {

    private final ProfesoresService service;

    public ProfesoresController(ProfesoresService service) {
        this.service = service;
    }

    @GetMapping
    public List<Profesores> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profesores> getById(@PathVariable Integer id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Profesores create(@RequestBody Profesores profesor) {
        return service.save(profesor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
