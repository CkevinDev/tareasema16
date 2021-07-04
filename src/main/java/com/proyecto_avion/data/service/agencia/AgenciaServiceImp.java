package com.proyecto_avion.data.service.agencia;

import com.proyecto_avion.data.entities.Agencia;
import com.proyecto_avion.data.persistencia.dao.IAgenciaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenciaServiceImp implements IAgenciaService{

    @Autowired
    private IAgenciaDao agenciaDao;

    @Override
    public List<Agencia> findAll() {
        return (List<Agencia>) agenciaDao.findAll();
    }
}
