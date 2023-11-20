package com.example.proyectobdd.DTO;

import java.util.Date;

public class DTOTratamientoPagar {

    private String descripcion;
    private Integer estado_tratamiento;
    private Date fecha_tratamiento;
    private Integer idMascota;
    private Integer idTratamiento;

    public DTOTratamientoPagar() {
    }

    public DTOTratamientoPagar(String descripcion, Integer estado_tratamiento, Date fecha_tratamiento, Integer id_mascota, Integer id_tratamiento) {
        this.descripcion = descripcion;
        this.estado_tratamiento = estado_tratamiento;
        this.fecha_tratamiento = fecha_tratamiento;
        this.idMascota = id_mascota;
        this.idTratamiento = id_tratamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEstado_tratamiento() {
        return estado_tratamiento;
    }

    public void setEstado_tratamiento(Integer estado_tratamiento) {
        this.estado_tratamiento = estado_tratamiento;
    }

    public Date getFecha_tratamiento() {
        return fecha_tratamiento;
    }

    public void setFecha_tratamiento(Date fecha_tratamiento) {
        this.fecha_tratamiento = fecha_tratamiento;
    }

    public Integer getId_mascota() {
        return idMascota;
    }

    public void setId_mascota(Integer id_mascota) {
        this.idMascota = id_mascota;
    }

    public Integer getId_tratamiento() {
        return idTratamiento;
    }

    public void setId_tratamiento(Integer id_tratamiento) {
        this.idTratamiento = id_tratamiento;
    }
}

