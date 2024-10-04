package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.CategoriaPlatoDAO;
import com.apirest.puertoazul_api_rest.dao.PlatoDAO;
import com.apirest.puertoazul_api_rest.entities.Categoria_plato;
import com.apirest.puertoazul_api_rest.entities.Plato;
import com.apirest.puertoazul_api_rest.exceptions.NotFoundException;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceWithStatusImpl;
import com.apirest.puertoazul_api_rest.services.IPlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class IPlatoServiceImpl extends GenericServiceWithStatusImpl<Plato, PlatoDAO, Integer> implements IPlatoService {

    @Autowired
    private CategoriaPlatoDAO categoriaPlatoDAO;

    @Override
    public Plato update(Plato plato) {
        return null;
    }


    @Override
    @Transactional(readOnly = true)
    public List<Plato> buscarPorCategoria(int idCategoria) {
        Optional<Categoria_plato> catePlato = categoriaPlatoDAO.findById(idCategoria);
        if (catePlato.isEmpty()) {
            throw new NotFoundException("No existe el ID de la categoria seleccionada");
        }
        return dao.buscarPorCategoria(idCategoria);
    }
}
