package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.TipoReciboDAO;
import com.apirest.puertoazul_api_rest.entities.TipoRecibo;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceImpl;
import com.apirest.puertoazul_api_rest.services.ITipoReciboService;
import org.springframework.stereotype.Service;

@Service
public class ITipoReciboServiceImpl extends GenericServiceImpl<TipoRecibo, TipoReciboDAO, Integer> implements ITipoReciboService {
}
