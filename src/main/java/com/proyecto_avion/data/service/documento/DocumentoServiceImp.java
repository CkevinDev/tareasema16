package com.proyecto_avion.data.service.documento;

import com.proyecto_avion.data.entities.Documento;
import com.proyecto_avion.data.persistencia.dao.IDocumentoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoServiceImp implements IDocumentoService{

    @Autowired
    private IDocumentoDao documentoDao;

    @Override
    public List<Documento> findAll() {
        return (List<Documento>) documentoDao.findAll();
    }
}
