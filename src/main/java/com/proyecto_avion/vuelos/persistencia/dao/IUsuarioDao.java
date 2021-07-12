package com.proyecto_avion.vuelos.persistencia.dao;

import com.proyecto_avion.vuelos.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario,Long> {

}
