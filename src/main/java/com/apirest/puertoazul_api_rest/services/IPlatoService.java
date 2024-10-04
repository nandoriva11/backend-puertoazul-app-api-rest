package com.apirest.puertoazul_api_rest.services;

import com.apirest.puertoazul_api_rest.entities.Bebida;
import com.apirest.puertoazul_api_rest.entities.Plato;
import com.apirest.puertoazul_api_rest.generics.service.GenericService;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceWithStatus;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPlatoService extends GenericServiceWithStatus<Plato,Integer> {

    Plato update(Plato plato);

    List<Plato> buscarPorCategoria(@Param("idCategoria") int idCategoria);
}
