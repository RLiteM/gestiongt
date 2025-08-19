package com.gestion.gt.gestiongt.repository;

import com.gestion.gt.gestiongt.entities.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudiantesRepository extends JpaRepository<Estudiantes, Integer> {
    // Buscar estudiantes por apellido
    List<Estudiantes> findByApellido(String apellido);
}
