package com.hoteles.crm.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Temporada implements Serializable {

    private int idTemporada;

    private String nombreTemporada;

    private BigDecimal costoHora;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    public Temporada() {
    }

    public Temporada(int idTemporada, String nombreTemporada, BigDecimal costoHora, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idTemporada = idTemporada;
        this.nombreTemporada = nombreTemporada;
        this.costoHora = costoHora;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public int getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(int idTemporada) {
        this.idTemporada = idTemporada;
    }

    public String getNombreTemporada() {
        return nombreTemporada;
    }

    public void setNombreTemporada(String nombreTemporada) {
        this.nombreTemporada = nombreTemporada;
    }

    public BigDecimal getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(BigDecimal costoHora) {
        this.costoHora = costoHora;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}
