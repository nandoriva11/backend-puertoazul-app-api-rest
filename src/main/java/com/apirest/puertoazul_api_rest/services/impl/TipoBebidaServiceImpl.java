package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.TipoBebidaDAO;
import com.apirest.puertoazul_api_rest.entities.Tipo_bebida;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceImpl;
import com.apirest.puertoazul_api_rest.services.ITipoBebidaService;
import org.hibernate.integrator.internal.IntegratorServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TipoBebidaServiceImpl extends GenericServiceImpl<Tipo_bebida, TipoBebidaDAO, Integer> implements ITipoBebidaService {

}
