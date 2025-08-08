package com.gestion.gt.gestiongt.repository;

import com.gestion.gt.gestiongt.entities.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesoresRepository extends JpaRepository<Profesores, Integer> {
}
