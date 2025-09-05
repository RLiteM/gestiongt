package com.gestion.gt.gestiongt.controller;

import com.gestion.gt.gestiongt.dto.reportes.ReporteCursosProfesorDTO;
import com.gestion.gt.gestiongt.dto.reportes.ReportePromedioCursoDTO;
import com.gestion.gt.gestiongt.dto.reportes.ReporteEstudiantesCicloDTO;
import com.gestion.gt.gestiongt.dto.reportes.ReporteTopCursosDTO;
import com.gestion.gt.gestiongt.service.ReportesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reportes")
public class ReportesController {

    private final ReportesService reportesService;

    public ReportesController(ReportesService reportesService) {
        this.reportesService = reportesService;
    }

    //  Reporte 1: Número total de cursos que imparte cada profesor
    @GetMapping("/cursos-profesor")
    public List<ReporteCursosProfesorDTO> getCursosPorProfesor() {
        return reportesService.getCursosPorProfesor();
    }

    // Reporte 2: Nota promedio para cada curso
    @GetMapping("/promedio-curso")
    public List<ReportePromedioCursoDTO> getPromedioNotasPorCurso() {
        return reportesService.getPromedioNotasPorCurso();
    }

    // Reporte 3: Estudiantes inscritos por ciclo académico
    @GetMapping("/estudiantes-ciclo")
    public List<ReporteEstudiantesCicloDTO> getEstudiantesPorCiclo() {
        return reportesService.getEstudiantesPorCiclo();
    }

    //  Reporte 4: Top 3 cursos con la nota promedio más alta
    @GetMapping("/top-cursos")
    public List<ReporteTopCursosDTO> getTop3Cursos() {
        return reportesService.getTop3Cursos();
    }
}
