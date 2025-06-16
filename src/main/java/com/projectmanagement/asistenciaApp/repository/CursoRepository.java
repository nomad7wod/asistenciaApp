package com.projectmanagement.asistenciaApp.repository;

import com.projectmanagement.asistenciaApp.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
