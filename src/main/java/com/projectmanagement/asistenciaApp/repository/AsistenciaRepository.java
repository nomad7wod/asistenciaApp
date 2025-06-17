package com.projectmanagement.asistenciaApp.repository;

import com.projectmanagement.asistenciaApp.model.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AsistenciaRepository extends JpaRepository<Asistencia, Integer> {
    List<Asistencia> findBySesionId(Integer id);
}
