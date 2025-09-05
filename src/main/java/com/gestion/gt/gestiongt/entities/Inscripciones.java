package com.gestion.gt.gestiongt.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "inscripciones", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"estudiante_id", "asignacion_id"})
})
public class Inscripciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", nullable = false)
    private Estudiantes estudiante;

    @ManyToOne
    @JoinColumn(name = "asignacion_id", nullable = false)
    private Asignaciones asignacion;

    @Column
    private Double nota;   // Nueva columna para registrar la nota final

    @Column(length = 20)
    private String ciclo;  // Nueva columna para registrar ciclo o semestre

    // Constructor por defecto
    public Inscripciones() {}

    // Constructor con parámetros
    public Inscripciones(Estudiantes estudiante, Asignaciones asignacion, Double nota, String ciclo) {
        this.estudiante = estudiante;
        this.asignacion = asignacion;
        this.nota = nota;
        this.ciclo = ciclo;
    }

    // Getters y setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Estudiantes getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiantes estudiante) { this.estudiante = estudiante; }

    public Asignaciones getAsignacion() { return asignacion; }
    public void setAsignacion(Asignaciones asignacion) { this.asignacion = asignacion; }

    public Double getNota() { return nota; }
    public void setNota(Double nota) { this.nota = nota; }

    public String getCiclo() { return ciclo; }
    public void setCiclo(String ciclo) { this.ciclo = ciclo; }
}
