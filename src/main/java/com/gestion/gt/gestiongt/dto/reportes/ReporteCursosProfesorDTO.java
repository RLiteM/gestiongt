package com.gestion.gt.gestiongt.dto.reportes;

public class ReporteCursosProfesorDTO {
    private String profesorNombre;
    private Long totalCursos;

    public ReporteCursosProfesorDTO(String profesorNombre, Long totalCursos) {
        this.profesorNombre = profesorNombre;
        this.totalCursos = totalCursos;
    }

    public String getProfesorNombre() {
        return profesorNombre;
    }

    public void setProfesorNombre(String profesorNombre) {
        this.profesorNombre = profesorNombre;
    }

    public Long getTotalCursos() {
        return totalCursos;
    }

    public void setTotalCursos(Long totalCursos) {
        this.totalCursos = totalCursos;
    }
}
