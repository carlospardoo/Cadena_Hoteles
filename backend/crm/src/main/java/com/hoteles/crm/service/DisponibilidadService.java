package com.hoteles.crm.service;

import com.hoteles.crm.mapper.input.DisponibilidadRequestDto;
import com.hoteles.crm.mapper.output.DisponibilidadResponseDto;

import java.util.List;

public interface DisponibilidadService {

    public List<DisponibilidadResponseDto> getDisponibilidad(DisponibilidadRequestDto requestDto);

}
