package com.hoteles.crm.mapper.output;

import com.hoteles.crm.domain.Habitacion;

import java.io.Serializable;
import java.math.BigDecimal;

public class DisponibilidadResponseDto implements Serializable {

    private int id;

    private Habitacion habitacion;

    private BigDecimal Total;

    

}
