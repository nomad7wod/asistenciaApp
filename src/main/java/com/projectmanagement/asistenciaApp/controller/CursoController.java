package com.projectmanagement.asistenciaApp.controller;

import com.projectmanagement.asistenciaApp.model.Curso;
import com.projectmanagement.asistenciaApp.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    public Curso crearCurso(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }

    @GetMapping
    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }
}
