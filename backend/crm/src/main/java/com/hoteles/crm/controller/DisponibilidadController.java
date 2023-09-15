package com.hoteles.crm.controller;

import com.hoteles.crm.mapper.input.DisponibilidadRequestDto;
import com.hoteles.crm.mapper.output.DisponibilidadResponseDto;
import com.hoteles.crm.service.DisponibilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hoteles/api/v1/disponibilidad")
public class DisponibilidadController {

    private final DisponibilidadService disponibilidadService;

    @Autowired
    public DisponibilidadController(DisponibilidadService disponibilidadService) {
        this.disponibilidadService = disponibilidadService;
    }

    @GetMapping("/get_disponibilidad")
    public ResponseEntity<List<DisponibilidadResponseDto>> getHabitacionesDisponibles(@PathVariable DisponibilidadRequestDto disponibilidadRequestDto){
        return new ResponseEntity<>(disponibilidadService.getDisponibilidad(disponibilidadRequestDto), HttpStatus.FOUND);
    }

}
