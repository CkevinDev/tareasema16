package com.proyecto_avion.data.service.viajero;

import com.proyecto_avion.data.entities.Viajero;
import com.proyecto_avion.data.persistencia.dao.IViajeroDao;
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
