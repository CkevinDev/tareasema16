package com.proyecto_avion.vuelos.persistencia.dao;

import com.proyecto_avion.vuelos.entities.Reserva;
import org.springframework.data.repository.CrudRepository;

public interface IReservaDao extends CrudRepository<Reserva,Long> {
}
