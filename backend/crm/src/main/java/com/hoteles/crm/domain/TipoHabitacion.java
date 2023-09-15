package com.hoteles.crm.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class TipoHabitacion implements Serializable {

    private int idTipoHabitacion;

    private String nombreHabitacion;

    private BigDecimal costo;

    public TipoHabitacion() {
    }

    public TipoHabitacion(int idTipoHabitacion, String nombreHabitacion, BigDecimal costo) {
        this.idTipoHabitacion = idTipoHabitacion;
        this.nombreHabitacion = nombreHabitacion;
        this.costo = costo;
    }

    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public String getNombreHabitacion() {
        return nombreHabitacion;
    }

    public void setNombreHabitacion(String nombreHabitacion) {
        this.nombreHabitacion = nombreHabitacion;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }
}
