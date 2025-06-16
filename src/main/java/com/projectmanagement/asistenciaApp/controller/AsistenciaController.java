package com.projectmanagement.asistenciaApp.controller;

import com.projectmanagement.asistenciaApp.model.Asistencia;
import com.projectmanagement.asistenciaApp.model.Sesion;
import com.projectmanagement.asistenciaApp.model.Usuario;
import com.projectmanagement.asistenciaApp.repository.AsistenciaRepository;
import com.projectmanagement.asistenciaApp.repository.SesionRepository;
import com.projectmanagement.asistenciaApp.repository.UsuarioRepository;
import com.projectmanagement.asistenciaApp.service.AsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("/api/asistencias")
public class AsistenciaController {

    @Autowired
    private AsistenciaService asistenciaService;

    @PostMapping
    public ResponseEntity<?> registrarAsistencia(@RequestParam Integer idUsuario,
                                                 @RequestParam Integer idSesion,
                                                 @RequestParam(defaultValue = "presente") String estado) {
        try {
            Asistencia asistencia = asistenciaService.registrarAsistencia(idUsuario, idSesion, estado);
            return ResponseEntity.ok(asistencia);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al registrar asistencia");
        }
    }


}
