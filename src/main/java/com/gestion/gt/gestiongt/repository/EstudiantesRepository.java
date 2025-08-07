package com.gestion.gt.gestiongt.repository;

import com.gestion.gt.gestiongt.entities.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudiantesRepository extends JpaRepository<Estudiantes, Integer> {
    // Métodos personalizados opcionales
}
