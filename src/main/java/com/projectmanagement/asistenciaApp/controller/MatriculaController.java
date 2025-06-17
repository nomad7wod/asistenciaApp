package com.projectmanagement.asistenciaApp.controller;

import com.projectmanagement.asistenciaApp.model.Matricula;
import com.projectmanagement.asistenciaApp.service.MatriculaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {

    private final MatriculaService matriculaService;

    public MatriculaController(MatriculaService matriculaService) {
        this.matriculaService = matriculaService;
    }

    @PostMapping
    public ResponseEntity<Matricula> registrar(@RequestBody Matricula matricula) {
        return ResponseEntity.ok(matriculaService.registrar(matricula));
    }

    @GetMapping("/seccion/{idSeccion}")
    public ResponseEntity<List<Matricula>> listarPorSeccion(@PathVariable Integer idSeccion) {
        return ResponseEntity.ok(matriculaService.listarPorSeccion(idSeccion));
    }

    @GetMapping("/usuario/{idUsuario}")
    public ResponseEntity<List<Matricula>> listarPorUsuario(@PathVariable Integer idUsuario) {
        return ResponseEntity.ok(matriculaService.listarPorUsuario(idUsuario));
    }
}
