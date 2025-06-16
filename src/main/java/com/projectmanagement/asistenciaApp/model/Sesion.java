package com.projectmanagement.asistenciaApp.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "sesiones")
public class Sesion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_sesion;

    @ManyToOne
    @JoinColumn(name = "id_seccion", nullable = false)
    private Seccion seccion;

    private LocalDate fecha;
    private LocalTime hora_inicio;

    @Column(columnDefinition = "TEXT")
    private String imagen_url;

    private String estado;
    private String tipo_ingreso;

    // Getters y setters
    public Integer getId_sesion() { return id_sesion; }
    public void setId_sesion(Integer id_sesion) { this.id_sesion = id_sesion; }

    public Seccion getSeccion() { return seccion; }
    public void setSeccion(Seccion seccion) { this.seccion = seccion; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public LocalTime getHora_inicio() { return hora_inicio; }
    public void setHora_inicio(LocalTime hora_inicio) { this.hora_inicio = hora_inicio; }

    public String getImagen_url() { return imagen_url; }
    public void setImagen_url(String imagen_url) { this.imagen_url = imagen_url; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getTipo_ingreso() { return tipo_ingreso; }
    public void setTipo_ingreso(String tipo_ingreso) { this.tipo_ingreso = tipo_ingreso; }



}
