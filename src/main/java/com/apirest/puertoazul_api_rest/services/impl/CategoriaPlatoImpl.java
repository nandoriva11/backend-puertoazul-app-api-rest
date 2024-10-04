package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.CategoriaPlatoDAO;
import com.apirest.puertoazul_api_rest.entities.Categoria_plato;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceImpl;
import com.apirest.puertoazul_api_rest.services.ICategoriaPlato;
import org.springframework.stereotype.Service;

@Service
public class CategoriaPlatoImpl extends GenericServiceImpl<Categoria_plato, CategoriaPlatoDAO, Integer> implements ICategoriaPlato {
}
