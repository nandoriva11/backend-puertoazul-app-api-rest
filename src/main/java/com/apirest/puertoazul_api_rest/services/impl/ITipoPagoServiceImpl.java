package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.TipoPagoDAO;
import com.apirest.puertoazul_api_rest.entities.TipoPago;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceImpl;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceWithStatusImpl;
import com.apirest.puertoazul_api_rest.services.ITipoPagoService;
import org.springframework.stereotype.Service;

@Service
public class ITipoPagoServiceImpl extends GenericServiceImpl<TipoPago, TipoPagoDAO, Integer> implements ITipoPagoService {

    @Override
    public TipoPago save(TipoPago alumno) {

        return super.save(alumno);
    }
}
