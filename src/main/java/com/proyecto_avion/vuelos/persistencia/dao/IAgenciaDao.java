package com.proyecto_avion.vuelos.persistencia.dao;

import com.proyecto_avion.vuelos.entities.Agencia;
import org.springframework.data.repository.CrudRepository;

public interface IAgenciaDao extends CrudRepository<Agencia,Long> {
}
