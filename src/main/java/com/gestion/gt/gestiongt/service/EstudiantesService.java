package com.gestion.gt.gestiongt.service;

import com.gestion.gt.gestiongt.dto.EstudianteDTO;
import com.gestion.gt.gestiongt.entities.Estudiantes;
import com.gestion.gt.gestiongt.repository.EstudiantesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EstudiantesService {

    private final EstudiantesRepository repository;

    public EstudiantesService(EstudiantesRepository repository) {
        this.repository = repository;
    }

    public List<EstudianteDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public Optional<EstudianteDTO> getById(Integer id) {
        return repository.findById(id).map(this::convertToDTO);
    }

    // Filtro por apellido
    public List<EstudianteDTO> findByApellido(String apellido) {
        return repository.findByApellido(apellido)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public Estudiantes save(Estudiantes estudiante) {
        return repository.save(estudiante);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    private EstudianteDTO convertToDTO(Estudiantes estudiante) {
        return new EstudianteDTO(estudiante.getId(), estudiante.getNombre(), estudiante.getApellido());
    }
}
