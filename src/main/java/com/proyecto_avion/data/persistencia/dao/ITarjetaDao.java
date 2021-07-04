package com.proyecto_avion.data.persistencia.dao;

import com.proyecto_avion.data.entities.Tarjeta;
import org.springframework.data.repository.CrudRepository;

public interface ITarjetaDao extends CrudRepository<Tarjeta,Long> {
}
