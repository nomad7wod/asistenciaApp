package com.projectmanagement.asistenciaApp.controller;

import com.projectmanagement.asistenciaApp.model.Sesion;
import com.projectmanagement.asistenciaApp.repository.SesionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/sesiones")
public class SesionController {
    private final SesionRepository sesionRepository;

    public SesionController(SesionRepository sesionRepository) {
        this.sesionRepository = sesionRepository;
    }

    @GetMapping
    public List<Sesion> listarSesiones(){
        return sesionRepository.findAll();
    }

    @PostMapping
    public Sesion crearSesion(@RequestBody Sesion sesion) {
        return sesionRepository.save(sesion);
    }
}
