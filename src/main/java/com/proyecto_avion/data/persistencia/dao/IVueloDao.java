package com.proyecto_avion.data.persistencia.dao;

import com.proyecto_avion.data.entities.Vuelo;
import org.springframework.data.repository.CrudRepository;

public interface IVueloDao extends CrudRepository<Vuelo,Long> {
}
