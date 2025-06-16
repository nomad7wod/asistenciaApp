package com.projectmanagement.asistenciaApp.repository;

import com.projectmanagement.asistenciaApp.model.Sesion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SesionRepository extends JpaRepository<Sesion, Integer> {
}
