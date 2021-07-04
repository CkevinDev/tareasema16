package com.proyecto_avion.data.persistencia.dao;

import com.proyecto_avion.data.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario,Long> {

}
