package com.proyecto_avion.data.service.reserva;

import com.proyecto_avion.data.entities.Reserva;
import com.proyecto_avion.data.persistencia.dao.IReservaDao;
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
