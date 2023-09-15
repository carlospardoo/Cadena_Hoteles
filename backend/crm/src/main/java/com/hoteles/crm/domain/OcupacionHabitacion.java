package com.hoteles.crm.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OcupacionHabitacion implements Serializable {

    private int idOcupacion;

    private LocalDateTime fechaEntrada;

    private LocalDateTime fechaSalida;

    private BigDecimal costoTotal;

    private Temporada temporada;

    private Habitacion habitacion;

    public OcupacionHabitacion() {
    }

    public OcupacionHabitacion(int idOcupacion, LocalDateTime fechaEntrada, LocalDateTime fechaSalida, BigDecimal costoTotal, Temporada temporada, Habitacion habitacion) {
        this.idOcupacion = idOcupacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.costoTotal = costoTotal;
        this.temporada = temporada;
        this.habitacion = habitacion;
    }

    public int getIdOcupacion() {
        return idOcupacion;
    }

    public void setIdOcupacion(int idOcupacion) {
        this.idOcupacion = idOcupacion;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public BigDecimal getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(BigDecimal costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String toString() {
        return "OcupacionHabitacion{" +
                "idOcupacion=" + idOcupacion +
                ", fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                ", costoTotal=" + costoTotal +
                ", temporada=" + temporada +
                ", habitacion=" + habitacion +
                '}';
    }
}
