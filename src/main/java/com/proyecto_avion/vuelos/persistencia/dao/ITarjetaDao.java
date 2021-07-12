package com.proyecto_avion.vuelos.persistencia.dao;

import com.proyecto_avion.vuelos.entities.Tarjeta;
import org.springframework.data.repository.CrudRepository;

public interface ITarjetaDao extends CrudRepository<Tarjeta,Long> {
}
