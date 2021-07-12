package com.proyecto_avion.vuelos.persistencia.dao;

import com.proyecto_avion.vuelos.entities.Viajero;
import org.springframework.data.repository.CrudRepository;

public interface IViajeroDao extends CrudRepository<Viajero,Long> {
}
