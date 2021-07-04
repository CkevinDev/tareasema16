package com.proyecto_avion.data.service.tarjeta;

import com.proyecto_avion.data.entities.Tarjeta;
import com.proyecto_avion.data.persistencia.dao.ITarjetaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarjetaServiceImp implements ITarjetaService{

    @Autowired
    private ITarjetaDao tarjetaDao;

    @Override
    public List<Tarjeta> findAll() {
        return (List<Tarjeta>) tarjetaDao.findAll();
    }
}
