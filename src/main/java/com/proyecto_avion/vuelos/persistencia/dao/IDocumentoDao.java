package com.proyecto_avion.vuelos.persistencia.dao;

import com.proyecto_avion.vuelos.entities.Documento;
import org.springframework.data.repository.CrudRepository;

public interface IDocumentoDao extends CrudRepository<Documento,Long> {
}
