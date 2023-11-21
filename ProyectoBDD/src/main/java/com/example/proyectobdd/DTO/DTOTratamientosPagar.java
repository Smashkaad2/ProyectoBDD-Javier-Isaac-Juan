package com.example.proyectobdd.DTO;

import java.time.LocalDate;
import java.util.Date;

public class DTOTratamientosPagar {

    private int id;
    private String estado;
    private String name;
    private int mascota;
    private LocalDate fecha;
    private int costo;


    public DTOTratamientosPagar(int id, String estado, String name, int mascota, LocalDate fecha, int costo) {
        this.id = id;
        this.estado = estado;
        this.name = name;
        this.mascota = mascota;
        this.fecha = fecha;
        this.costo = costo;
    }

    public int getMascota() {
        return mascota;
    }

    public void setMascota(Integer mascota) {
        this.mascota = mascota;
    }

    // the getters and setters are in the fomat getCapitalizedAttibute
    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "DTOTratamientosPagar{" +
                "id=" + id +
                ", estado='" + estado + '\'' +
                ", name='" + name + '\'' +
                ", mascota=" + mascota +
                ", fecha=" + fecha +
                ", costo=" + costo +
                '}';
    }
}

