package com.projectmanagement.asistenciaApp.model;

import jakarta.persistence.*;
@Entity
@Table(name = "secciones")
public class Seccion {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_seccion;

    @ManyToOne
    @JoinColumn(name = "id_curso" , nullable = false)
    private Curso curso;

    private String nombre;

    // Getters y setters
    public Integer getId_seccion() { return id_seccion; }
    public void setId_seccion(Integer id_seccion) { this.id_seccion = id_seccion; }

    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
