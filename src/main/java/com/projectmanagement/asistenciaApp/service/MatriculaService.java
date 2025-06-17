package com.projectmanagement.asistenciaApp.service;

import com.projectmanagement.asistenciaApp.model.Matricula;
import com.projectmanagement.asistenciaApp.repository.MatriculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaService {
    private final MatriculaRepository matriculaRepository;

    public MatriculaService(MatriculaRepository matriculaRepository) {
        this.matriculaRepository = matriculaRepository;
    }

    public Matricula registrar(Matricula matricula) {
        Optional<Matricula> existente = matriculaRepository.findByUsuario_IdAndSeccion_Id(
                matricula.getUsuario().getId(),
                matricula.getSeccion().getId()
        );

        if (existente.isPresent()) {
            throw new IllegalStateException("El alumno ya está matriculado en esta sección.");
        }

        return matriculaRepository.save(matricula);
    }

    public List<Matricula> listarPorSeccion(Integer idSeccion) {
        return matriculaRepository.findBySeccion_Id(idSeccion);
    }

    public List<Matricula> listarPorUsuario(Integer idUsuario) {
        return matriculaRepository.findByUsuario_Id(idUsuario);
    }
}