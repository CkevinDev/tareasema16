package com.proyecto_avion.data.persistencia.dao;

import com.proyecto_avion.data.entities.Reserva;
import org.springframework.data.repository.CrudRepository;

public interface IReservaDao extends CrudRepository<Reserva,Long> {
}
