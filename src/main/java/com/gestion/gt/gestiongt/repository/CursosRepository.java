package com.gestion.gt.gestiongt.repository;

import com.gestion.gt.gestiongt.entities.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursosRepository extends JpaRepository<Cursos, Integer> {
    // Buscar cursos por nombre
    List<Cursos> findByNombreContainingIgnoreCase(String nombre);
}
