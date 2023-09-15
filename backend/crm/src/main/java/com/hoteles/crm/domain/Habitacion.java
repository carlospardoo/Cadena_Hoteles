package com.hoteles.crm.domain;

import java.io.Serializable;

public class Habitacion implements Serializable {

    private int idHabitacion;

    private String piso;

    private int numeroHabitacion;

    private int capacidad;

    private TipoHabitacion tipoHabitacion;

    private Sede sede;

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, String piso, int numeroHabitacion, int capacidad, TipoHabitacion tipoHabitacion, Sede sede) {
        this.idHabitacion = idHabitacion;
        this.piso = piso;
        this.numeroHabitacion = numeroHabitacion;
        this.capacidad = capacidad;
        this.tipoHabitacion = tipoHabitacion;
        this.sede = sede;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
