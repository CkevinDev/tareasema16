package com.proyecto_avion.data.persistencia.dao;

import com.proyecto_avion.data.entities.Documento;
import org.springframework.data.repository.CrudRepository;

public interface IDocumentoDao extends CrudRepository<Documento,Long> {
}
