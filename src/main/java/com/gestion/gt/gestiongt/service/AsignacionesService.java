package com.gestion.gt.gestiongt.service;

import com.gestion.gt.gestiongt.entities.Asignaciones;
import com.gestion.gt.gestiongt.repository.AsignacionesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignacionesService {

    private final AsignacionesRepository repository;

    public AsignacionesService(AsignacionesRepository repository) {
        this.repository = repository;
    }

    public List<Asignaciones> getAll() {
        return repository.findAll();
    }

    public Optional<Asignaciones> getById(Integer id) {
        return repository.findById(id);
    }

    public Asignaciones save(Asignaciones asignacion) {
        return repository.save(asignacion);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
