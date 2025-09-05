package com.gestion.gt.gestiongt.service;

import com.gestion.gt.gestiongt.dto.reportes.ReporteCursosProfesorDTO;
import com.gestion.gt.gestiongt.dto.reportes.ReportePromedioCursoDTO;
import com.gestion.gt.gestiongt.dto.reportes.ReporteEstudiantesCicloDTO;
import com.gestion.gt.gestiongt.dto.reportes.ReporteTopCursosDTO;
import com.gestion.gt.gestiongt.repository.AsignacionesRepository;
import com.gestion.gt.gestiongt.repository.InscripcionesRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportesService {

    private final AsignacionesRepository asignacionesRepository;
    private final InscripcionesRepository inscripcionesRepository;

    public ReportesService(AsignacionesRepository asignacionesRepository,
                           InscripcionesRepository inscripcionesRepository) {
        this.asignacionesRepository = asignacionesRepository;
        this.inscripcionesRepository = inscripcionesRepository;
    }

    //  Reporte 1: Cursos por profesor
    public List<ReporteCursosProfesorDTO> getCursosPorProfesor() {
        return asignacionesRepository.reporteCursosPorProfesor();
    }

    //  Reporte 2: Promedio de notas por curso
    public List<ReportePromedioCursoDTO> getPromedioNotasPorCurso() {
        return inscripcionesRepository.reportePromedioPorCurso();
    }

    //  Reporte 3: Estudiantes por ciclo
    public List<ReporteEstudiantesCicloDTO> getEstudiantesPorCiclo() {
        return inscripcionesRepository.reporteEstudiantesPorCiclo();
    }

    //  Reporte 4: Top 3 cursos con mejor promedio
    public List<ReporteTopCursosDTO> getTop3Cursos() {
        return inscripcionesRepository.topCursosConMejorPromedio(PageRequest.of(0, 3));
    }
}
