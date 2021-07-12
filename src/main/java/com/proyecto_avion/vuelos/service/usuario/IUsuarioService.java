package com.proyecto_avion.vuelos.service.usuario;

import com.proyecto_avion.vuelos.entities.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> findAll();
    public Usuario findById(Long id);
    public Usuario save(Usuario usuario);
    public void delete(Long id);
}
