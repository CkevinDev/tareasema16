package com.proyecto_avion.vuelos.controllers;

import com.proyecto_avion.vuelos.entities.Reserva;
import com.proyecto_avion.vuelos.service.reserva.IReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ReservaRestController {

    @Autowired
    private IReservaService reservaService;

    @GetMapping("/reservas")
    public List<Reserva> getReservas(){
        return reservaService.findAll();
    }
}
