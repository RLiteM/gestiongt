package com.gestion.gt.gestiongt.repository;

import com.gestion.gt.gestiongt.entities.Asignaciones;
import com.gestion.gt.gestiongt.entities.Cursos;
import com.gestion.gt.gestiongt.entities.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsignacionesRepository extends JpaRepository<Asignaciones, Integer> {
    List<Asignaciones> findByProfesor(Profesores profesor);
    List<Asignaciones> findByCurso(Cursos curso);

    // Filtros directos por IDs (opcional)
    List<Asignaciones> findByProfesorId(Integer profesorId);
    List<Asignaciones> findByCursoId(Integer cursoId);

    boolean existsByProfesorAndCurso(Profesores profesor, Cursos curso);
}
