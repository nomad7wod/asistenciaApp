package com.projectmanagement.asistenciaApp.model;

import jakarta.persistence.*;
@Entity
@Table(name = "secciones")
public class Seccion {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_seccion")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_curso" , nullable = false)
    private Curso curso;

    private String nombre;

    // Getters y setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
