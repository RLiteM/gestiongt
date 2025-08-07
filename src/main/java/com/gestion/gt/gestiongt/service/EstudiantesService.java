package com.gestion.gt.gestiongt.service;

import com.gestion.gt.gestiongt.entities.Estudiantes;
import com.gestion.gt.gestiongt.repository.EstudiantesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudiantesService {

    private final EstudiantesRepository repository;

    public EstudiantesService(EstudiantesRepository repository) {
        this.repository = repository;
    }

    public List<Estudiantes> getAll() {
        return repository.findAll();
    }

    public Optional<Estudiantes> getById(Integer id) {
        return repository.findById(id);
    }

    public Estudiantes save(Estudiantes estudiante) {
        return repository.save(estudiante);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
