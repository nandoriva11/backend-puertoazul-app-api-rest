package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.ClienteDAO;
import com.apirest.puertoazul_api_rest.entities.Cliente;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceImpl;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceWithStatusImpl;
import com.apirest.puertoazul_api_rest.services.IClienteService;
import org.springframework.stereotype.Service;

@Service
public class IClienteServiceImpl extends GenericServiceImpl<Cliente, ClienteDAO, Integer> implements IClienteService {
}
