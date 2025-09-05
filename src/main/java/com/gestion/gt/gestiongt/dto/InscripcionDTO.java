package com.gestion.gt.gestiongt.dto;

public class InscripcionDTO {
    private Integer id;
    private Integer estudianteId;
    private String estudianteNombre;
    private Integer asignacionId;
    private String cursoNombre;
    private String profesorNombre;
    private Double nota;       // nuevo campo
    private String ciclo;      // nuevo campo

    // Constructor vacío
    public InscripcionDTO() {}

    // Constructor con parámetros (todos los campos)
    public InscripcionDTO(Integer id, Integer estudianteId, String estudianteNombre,
                          Integer asignacionId, String cursoNombre, String profesorNombre,
                          Double nota, String ciclo) {
        this.id = id;
        this.estudianteId = estudianteId;
        this.estudianteNombre = estudianteNombre;
        this.asignacionId = asignacionId;
        this.cursoNombre = cursoNombre;
        this.profesorNombre = profesorNombre;
        this.nota = nota;
        this.ciclo = ciclo;
    }

    // Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getEstudianteId() { return estudianteId; }
    public void setEstudianteId(Integer estudianteId) { this.estudianteId = estudianteId; }

    public String getEstudianteNombre() { return estudianteNombre; }
    public void setEstudianteNombre(String estudianteNombre) { this.estudianteNombre = estudianteNombre; }

    public Integer getAsignacionId() { return asignacionId; }
    public void setAsignacionId(Integer asignacionId) { this.asignacionId = asignacionId; }

    public String getCursoNombre() { return cursoNombre; }
    public void setCursoNombre(String cursoNombre) { this.cursoNombre = cursoNombre; }

    public String getProfesorNombre() { return profesorNombre; }
    public void setProfesorNombre(String profesorNombre) { this.profesorNombre = profesorNombre; }

    public Double getNota() { return nota; }
    public void setNota(Double nota) { this.nota = nota; }

    public String getCiclo() { return ciclo; }
    public void setCiclo(String ciclo) { this.ciclo = ciclo; }
}
