package com.projectmanagement.asistenciaApp.repository;


import com.projectmanagement.asistenciaApp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
