package com.gestion.gt.gestiongt.dto.reportes;

public class ReportePromedioCursoDTO {
    private String cursoNombre;
    private Double promedioNota;

    public ReportePromedioCursoDTO(String cursoNombre, Double promedioNota) {
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
