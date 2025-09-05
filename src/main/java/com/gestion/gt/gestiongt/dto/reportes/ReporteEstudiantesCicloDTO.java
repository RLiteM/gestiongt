package com.gestion.gt.gestiongt.dto.reportes;

public class ReporteEstudiantesCicloDTO {
    private String ciclo;
    private Long totalEstudiantes;

    public ReporteEstudiantesCicloDTO(String ciclo, Long totalEstudiantes) {
        this.ciclo = ciclo;
        this.totalEstudiantes = totalEstudiantes;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public Long getTotalEstudiantes() {
        return totalEstudiantes;
    }

    public void setTotalEstudiantes(Long totalEstudiantes) {
        this.totalEstudiantes = totalEstudiantes;
    }
}
