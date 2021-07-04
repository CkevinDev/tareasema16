package com.proyecto_avion.data.persistencia.dao;

import com.proyecto_avion.data.entities.Viajero;
import org.springframework.data.repository.CrudRepository;

public interface IViajeroDao extends CrudRepository<Viajero,Long> {
}
