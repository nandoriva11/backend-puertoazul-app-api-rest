package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.CargoDAO;
import com.apirest.puertoazul_api_rest.entities.Cargo;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceImpl;
import com.apirest.puertoazul_api_rest.services.ICargoService;
import org.springframework.stereotype.Service;

@Service
public class CargoServiceImpl extends GenericServiceImpl<Cargo, CargoDAO, Integer> implements ICargoService {

}
