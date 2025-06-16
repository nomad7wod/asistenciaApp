package com.projectmanagement.asistenciaApp.controller;

import com.projectmanagement.asistenciaApp.model.Seccion;
import com.projectmanagement.asistenciaApp.repository.SeccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/secciones")
public class SeccionController {
    private final SeccionRepository seccionRepository;

    public SeccionController(SeccionRepository seccionRepository) {
        this.seccionRepository = seccionRepository;
    }

    @PostMapping
    public Seccion crearSeccion(@RequestBody Seccion seccion) {
        return seccionRepository.save(seccion);
    }

    @GetMapping
    public List<Seccion> listarSecciones() {
        return seccionRepository.findAll();
    }
}
