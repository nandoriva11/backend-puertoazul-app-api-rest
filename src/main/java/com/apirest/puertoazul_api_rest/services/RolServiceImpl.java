package com.apirest.puertoazul_api_rest.services;

import com.apirest.puertoazul_api_rest.dao.RolDAO;
import com.apirest.puertoazul_api_rest.entities.Rol;
import com.apirest.puertoazul_api_rest.generics.service.GenericService;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class RolServiceImpl extends GenericServiceImpl<Rol, RolDAO, Long> implements RolService {
}
