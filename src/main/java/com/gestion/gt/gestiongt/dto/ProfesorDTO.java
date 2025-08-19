package com.gestion.gt.gestiongt.dto;

public class ProfesorDTO {
    private Integer id;
    private String nombreCompleto;

    public ProfesorDTO(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombreCompleto = nombre + " " + apellido;
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
}
