package com.gestion.gt.gestiongt.controller;

import com.gestion.gt.gestiongt.dto.ProfesorDTO;
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

    // GET con lista completa o filtrada
    @GetMapping
    public List<ProfesorDTO> getAll(@RequestParam(required = false) String apellido) {
        if (apellido != null) {
            return service.findByApellido(apellido); // filtrado
        }
        return service.getAll(); // lista completa
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfesorDTO> getById(@PathVariable Integer id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST y DELETE siguen trabajando con Entities
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
