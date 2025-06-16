package com.projectmanagement.asistenciaApp.service;

import com.projectmanagement.asistenciaApp.model.Asistencia;
import com.projectmanagement.asistenciaApp.model.Sesion;
import com.projectmanagement.asistenciaApp.model.Usuario;
import com.projectmanagement.asistenciaApp.repository.AsistenciaRepository;
import com.projectmanagement.asistenciaApp.repository.SesionRepository;
import com.projectmanagement.asistenciaApp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AsistenciaService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private SesionRepository sesionRepository;

    @Autowired
    private AsistenciaRepository asistenciaRepository;

    public Asistencia registrarAsistencia(Integer idUsuario, Integer idSesion, String estado) {
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado"));
        Sesion sesion = sesionRepository.findById(idSesion)
                .orElseThrow(() -> new IllegalArgumentException("Sesión no encontrada"));

        Asistencia asistencia = new Asistencia();
        asistencia.setUsuario(usuario);
        asistencia.setSesion(sesion);
        asistencia.setEstado(estado);
        asistencia.setHoraIngreso(LocalDateTime.now());

        return asistenciaRepository.save(asistencia);
    }
}
