package com.proyecto_avion.vuelos.controllers;

import com.proyecto_avion.vuelos.entities.Tarjeta;
import com.proyecto_avion.vuelos.entities.Usuario;
import com.proyecto_avion.vuelos.service.tarjeta.ITarjetaService;
import com.proyecto_avion.vuelos.service.usuario.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TarjetaRestController {

    @Autowired
    private ITarjetaService tarjetaService;

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/tarjetas:{id}")
    public List<Tarjeta> getTarjetas(@PathVariable Long id){

        Usuario usuario = usuarioService.findById(id);

        return tarjetaService.findAll();
    }
}
