package com.gestion.gt.gestiongt.repository;

import com.gestion.gt.gestiongt.entities.Inscripciones;
import com.gestion.gt.gestiongt.entities.Estudiantes;
import com.gestion.gt.gestiongt.entities.Asignaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InscripcionesRepository extends JpaRepository<Inscripciones, Integer> {
    List<Inscripciones> findByEstudiante(Estudiantes estudiante);
    List<Inscripciones> findByAsignacion(Asignaciones asignacion);

    // Filtros directos por IDs
    List<Inscripciones> findByEstudianteId(Integer estudianteId);
    List<Inscripciones> findByAsignacionId(Integer asignacionId);

    boolean existsByEstudianteAndAsignacion(Estudiantes estudiante, Asignaciones asignacion);
}
