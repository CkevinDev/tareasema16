package com.proyecto_avion.data.persistencia.dao;

import com.proyecto_avion.data.entities.Agencia;
import org.springframework.data.repository.CrudRepository;

public interface IAgenciaDao extends CrudRepository<Agencia,Long> {
}
