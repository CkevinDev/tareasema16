package com.proyecto_avion.data.service.vuelo;

import com.proyecto_avion.data.entities.Vuelo;
import com.proyecto_avion.data.persistencia.dao.IVueloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueloServiceImp implements IVueloService{

    @Autowired
    private IVueloDao vueloDao;

    @Override
    public List<Vuelo> findAll() {
        return (List<Vuelo>) vueloDao.findAll();
    }
}
