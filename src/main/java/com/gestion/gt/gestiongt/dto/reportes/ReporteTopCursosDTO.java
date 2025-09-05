package com.gestion.gt.gestiongt.dto.reportes;

public class ReporteTopCursosDTO {
    private String cursoNombre;
    private Double promedioNota;

    public ReporteTopCursosDTO(String cursoNombre, Double promedioNota) {
        this.cursoNombre = cursoNombre;
        this.promedioNota = promedioNota;
    }

    public String getCursoNombre() {
        return cursoNombre;
    }

    public void setCursoNombre(String cursoNombre) {
        this.cursoNombre = cursoNombre;
    }

    public Double getPromedioNota() {
        return promedioNota;
    }

    public void setPromedioNota(Double promedioNota) {
        this.promedioNota = promedioNota;
    }
}
