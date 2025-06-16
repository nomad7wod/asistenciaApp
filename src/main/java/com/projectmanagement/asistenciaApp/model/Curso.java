package com.projectmanagement.asistenciaApp.model;


import jakarta.persistence.*;

@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_curso;

    private String nombre;

    private String codigo;

    // Getters y setters
    public Integer getId_curso() { return id_curso; }
    public void setId_curso(Integer id_curso) { this.id_curso = id_curso; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
}
