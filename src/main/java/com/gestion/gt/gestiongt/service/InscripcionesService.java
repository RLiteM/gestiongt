package com.gestion.gt.gestiongt.service;

import com.gestion.gt.gestiongt.entities.Inscripciones;
import com.gestion.gt.gestiongt.repository.InscripcionesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InscripcionesService {

    private final InscripcionesRepository repository;

    public InscripcionesService(InscripcionesRepository repository) {
        this.repository = repository;
    }

    public List<Inscripciones> getAll() {
        return repository.findAll();
    }

    public Optional<Inscripciones> getById(Integer id) {
        return repository.findById(id);
    }

    public Inscripciones save(Inscripciones inscripcion) {
        return repository.save(inscripcion);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
