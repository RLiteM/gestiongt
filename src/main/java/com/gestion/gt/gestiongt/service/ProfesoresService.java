package com.gestion.gt.gestiongt.service;

import com.gestion.gt.gestiongt.entities.Profesores;
import com.gestion.gt.gestiongt.repository.ProfesoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesoresService {

    private final ProfesoresRepository repository;

    public ProfesoresService(ProfesoresRepository repository) {
        this.repository = repository;
    }

    public List<Profesores> getAll() {
        return repository.findAll();
    }

    public Optional<Profesores> getById(Integer id) {
        return repository.findById(id);
    }

    public Profesores save(Profesores profesor) {
        return repository.save(profesor);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
