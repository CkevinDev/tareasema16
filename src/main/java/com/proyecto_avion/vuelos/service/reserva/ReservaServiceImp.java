package com.proyecto_avion.vuelos.service.reserva;

import com.proyecto_avion.vuelos.entities.Reserva;
import com.proyecto_avion.vuelos.persistencia.dao.IReservaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImp implements IReservaService{

    @Autowired
    private IReservaDao reservaDao;

    @Override
    public List<Reserva> findAll() {
        return (List<Reserva>) reservaDao.findAll();
    }
}
