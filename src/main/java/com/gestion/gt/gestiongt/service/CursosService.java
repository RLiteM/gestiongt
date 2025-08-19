package com.gestion.gt.gestiongt.service;

import com.gestion.gt.gestiongt.dto.CursoDTO;
import com.gestion.gt.gestiongt.entities.Cursos;
import com.gestion.gt.gestiongt.repository.CursosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CursosService {
    private final CursosRepository repository;

    public CursosService(CursosRepository repository) {
        this.repository = repository;
    }

    public List<CursoDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public Optional<CursoDTO> getById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    // Filtro por nombre
    public List<CursoDTO> findByNombre(String nombre) {
        return repository.findByNombreContainingIgnoreCase(nombre)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public Cursos save(Cursos curso) {
        return repository.save(curso);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    private CursoDTO convertToDTO(Cursos curso) {
        return new CursoDTO(curso.getId(), curso.getNombre());
    }
}
