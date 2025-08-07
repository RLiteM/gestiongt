package com.gestion.gt.gestiongt.repository;

import com.gestion.gt.gestiongt.entities.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursosRepository extends JpaRepository<Cursos, Integer> {
    // Ejemplo: Optional<Cursos> findByNombre(String nombre);
}
