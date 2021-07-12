package com.proyecto_avion.vuelos.persistencia.dao;

import com.proyecto_avion.vuelos.entities.Vuelo;
import org.springframework.data.repository.CrudRepository;

public interface IVueloDao extends CrudRepository<Vuelo,Long> {
}
