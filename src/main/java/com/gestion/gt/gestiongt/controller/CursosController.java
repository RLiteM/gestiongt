package com.gestion.gt.gestiongt.controller;

import com.gestion.gt.gestiongt.entities.Cursos;
import com.gestion.gt.gestiongt.service.CursosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursosController {

    private final CursosService service;

    public CursosController(CursosService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cursos> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cursos> getById(@PathVariable Integer id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Cursos create(@RequestBody Cursos curso) {
        return service.save(curso);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
