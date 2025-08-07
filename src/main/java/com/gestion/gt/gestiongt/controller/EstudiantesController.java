package com.gestion.gt.gestiongt.controller;

import com.gestion.gt.gestiongt.entities.Estudiantes;
import com.gestion.gt.gestiongt.service.EstudiantesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudiantesController {

    private final EstudiantesService service;

    public EstudiantesController(EstudiantesService service) {
        this.service = service;
    }

    @GetMapping
    public List<Estudiantes> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiantes> getById(@PathVariable Integer id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Estudiantes create(@RequestBody Estudiantes estudiante) {
        return service.save(estudiante);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
