package com.projectmanagement.asistenciaApp.repository;


import com.projectmanagement.asistenciaApp.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {
    // Changed from seccion_IdSeccion to match the entity structure
    List<Matricula> findBySeccion_Id(Integer idSeccion);

    // Changed from usuario_IdUsuario to match the entity structure
    List<Matricula> findByUsuario_Id(Integer idUsuario);

    // Changed to match the correct property names
    Optional<Matricula> findByUsuario_IdAndSeccion_Id(Integer idUsuario, Integer idSeccion);

}




