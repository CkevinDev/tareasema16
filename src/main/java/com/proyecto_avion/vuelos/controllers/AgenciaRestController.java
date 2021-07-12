package com.proyecto_avion.vuelos.controllers;

import com.proyecto_avion.vuelos.entities.Agencia;
import com.proyecto_avion.vuelos.service.agencia.IAgenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/")
public class AgenciaRestController {

    @Autowired
    private IAgenciaService agenciaService;

    @GetMapping("/agencias")
    public List<Agencia> getAll(){
        return agenciaService.findAll();
    }
}
