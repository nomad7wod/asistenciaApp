package com.projectmanagement.asistenciaApp.repository;

import com.projectmanagement.asistenciaApp.model.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsistenciaRepository extends JpaRepository<Asistencia, Integer> {
}
