package com.gestion.gt.gestiongt.service;

import com.gestion.gt.gestiongt.dto.ProfesorDTO;
import com.gestion.gt.gestiongt.entities.Profesores;
import com.gestion.gt.gestiongt.repository.ProfesoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProfesoresService {

    private final ProfesoresRepository repository;

    public ProfesoresService(ProfesoresRepository repository) {
        this.repository = repository;
    }

    public List<ProfesorDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public Optional<ProfesorDTO> getById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    // Filtro por apellido
    public List<ProfesorDTO> findByApellido(String apellido) {
        return repository.findByApellido(apellido)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    // Métodos CRUD (con Entity)
    public Profesores save(Profesores profesor) {
        return repository.save(profesor);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    // Conversión Entity → DTO
    private ProfesorDTO convertToDTO(Profesores profesor) {
        return new ProfesorDTO(profesor.getId(), profesor.getNombre(), profesor.getApellido());
    }
}
