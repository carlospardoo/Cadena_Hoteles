package com.hoteles.crm.service.impl;

import com.hoteles.crm.mapper.input.DisponibilidadRequestDto;
import com.hoteles.crm.mapper.output.DisponibilidadResponseDto;
import com.hoteles.crm.persistance.DisponibilidadDao;
import com.hoteles.crm.service.DisponibilidadService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DisponibilidadServiceImpl implements DisponibilidadService {

    private final DisponibilidadDao disponibilidadDao;

    @Autowired
    public DisponibilidadServiceImpl(DisponibilidadDao disponibilidadDao) {
        this.disponibilidadDao = disponibilidadDao;
    }

    @Override
    public List<DisponibilidadResponseDto> getDisponibilidad(DisponibilidadRequestDto requestDto) {
        return null;
    }
}
