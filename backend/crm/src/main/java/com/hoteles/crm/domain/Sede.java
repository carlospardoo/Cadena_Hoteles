package com.hoteles.crm.domain;

import java.io.Serializable;

public class Sede implements Serializable {

    private int idSede;

    private String nombreSede;

    public Sede() {
    }

    public Sede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public Sede(int idSede, String nombreSede) {
        this.idSede = idSede;
        this.nombreSede = nombreSede;
    }

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }
}
