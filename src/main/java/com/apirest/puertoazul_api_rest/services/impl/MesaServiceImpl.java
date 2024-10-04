package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.MesaDAO;
import com.apirest.puertoazul_api_rest.entities.Mesa;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceWithStatusImpl;
import com.apirest.puertoazul_api_rest.services.IMesaService;
import org.springframework.stereotype.Service;

@Service
public class MesaServiceImpl extends GenericServiceWithStatusImpl<Mesa, MesaDAO, Integer> implements IMesaService {
}
