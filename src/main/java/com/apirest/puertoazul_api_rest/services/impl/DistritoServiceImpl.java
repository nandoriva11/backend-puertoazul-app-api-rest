package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.DistritoDAO;
import com.apirest.puertoazul_api_rest.entities.Distrito;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceImpl;
import com.apirest.puertoazul_api_rest.services.IDistritoService;
import org.springframework.stereotype.Service;

@Service
public class DistritoServiceImpl extends GenericServiceImpl<Distrito, DistritoDAO, Integer> implements IDistritoService {
}
