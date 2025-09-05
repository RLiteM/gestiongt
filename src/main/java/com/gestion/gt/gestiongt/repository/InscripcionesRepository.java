package com.gestion.gt.gestiongt.repository;

import com.gestion.gt.gestiongt.dto.reportes.ReportePromedioCursoDTO;
import com.gestion.gt.gestiongt.dto.reportes.ReporteEstudiantesCicloDTO;
import com.gestion.gt.gestiongt.dto.reportes.ReporteTopCursosDTO;
import com.gestion.gt.gestiongt.entities.Inscripciones;
import com.gestion.gt.gestiongt.entities.Estudiantes;
import com.gestion.gt.gestiongt.entities.Asignaciones;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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

    // Reporte 2: Promedio de notas por curso
    @Query("SELECT new com.gestion.gt.gestiongt.dto.reportes.ReportePromedioCursoDTO(" +
            "c.nombre, AVG(i.nota)) " +
            "FROM Inscripciones i " +
            "JOIN i.asignacion a " +
            "JOIN a.curso c " +
            "GROUP BY c.id, c.nombre")
    List<ReportePromedioCursoDTO> reportePromedioPorCurso();

    //Reporte 3: Estudiantes por ciclo académico
    @Query("SELECT new com.gestion.gt.gestiongt.dto.reportes.ReporteEstudiantesCicloDTO(" +
            "i.ciclo, COUNT(i.estudiante)) " +
            "FROM Inscripciones i " +
            "GROUP BY i.ciclo")
    List<ReporteEstudiantesCicloDTO> reporteEstudiantesPorCiclo();

    //  Reporte 4: Top cursos con mejor promedio
    @Query("SELECT new com.gestion.gt.gestiongt.dto.reportes.ReporteTopCursosDTO(" +
            "c.nombre, AVG(i.nota)) " +
            "FROM Inscripciones i " +
            "JOIN i.asignacion a " +
            "JOIN a.curso c " +
            "GROUP BY c.id, c.nombre " +
            "ORDER BY AVG(i.nota) DESC")
    List<ReporteTopCursosDTO> topCursosConMejorPromedio(Pageable pageable);
}
