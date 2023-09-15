package com.hoteles.crm.mapper.output;

import com.hoteles.crm.domain.Habitacion;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DisponibilidadResponseDto implements Serializable {

    private int id;

    private Habitacion habitacion;

    private BigDecimal Total;

    private LocalDateTime fechaEntrada;

    private LocalDateTime fechaSalida;

    public DisponibilidadResponseDto(int id, Habitacion habitacion, BigDecimal total, LocalDateTime fechaEntrada, LocalDateTime fechaSalida) {
        this.id = id;
        this.habitacion = habitacion;
        Total = total;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public BigDecimal getTotal() {
        return Total;
    }

    public void setTotal(BigDecimal total) {
        Total = total;
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
}
