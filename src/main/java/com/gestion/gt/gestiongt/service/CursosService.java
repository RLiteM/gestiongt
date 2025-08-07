package com.gestion.gt.gestiongt.service;

import org.springframework.stereotype.Service;
import com.gestion.gt.gestiongt.entities.Cursos;
import com.gestion.gt.gestiongt.repository.CursosRepository;
import java.util.List;
import java.util.Optional;

@Service
public class CursosService {
    private final CursosRepository repository;

    public CursosService(CursosRepository repository) {
        this.repository = repository;
    }

    public List<Cursos> getAll() {
        return repository.findAll();
    }

    public Optional<Cursos> getById(Integer id) {
        return repository.findById(id);
    }

    public Cursos save(Cursos curso) {
        return repository.save(curso);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

}
