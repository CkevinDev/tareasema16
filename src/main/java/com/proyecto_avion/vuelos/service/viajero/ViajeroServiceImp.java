package com.proyecto_avion.vuelos.service.viajero;

import com.proyecto_avion.vuelos.entities.Viajero;
import com.proyecto_avion.vuelos.persistencia.dao.IViajeroDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViajeroServiceImp implements IViajeroService {

    @Autowired
    private IViajeroDao viajeroDao;

    @Override
    public List<Viajero> findAll() {
        return (List<Viajero>) viajeroDao.findAll();
    }
}
