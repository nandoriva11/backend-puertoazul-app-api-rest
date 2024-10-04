package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.BebidaDAO;
import com.apirest.puertoazul_api_rest.dao.TipoBebidaDAO;
import com.apirest.puertoazul_api_rest.entities.Bebida;
import com.apirest.puertoazul_api_rest.entities.Tipo_bebida;
import com.apirest.puertoazul_api_rest.exceptions.NotFoundException;
import com.apirest.puertoazul_api_rest.generics.service.GenericService;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceImpl;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceWithStatusImpl;
import com.apirest.puertoazul_api_rest.services.IBebidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class IBebidaServiceImpl extends GenericServiceWithStatusImpl<Bebida, BebidaDAO, Integer> implements IBebidaService {

    @Autowired
    private TipoBebidaDAO tipoBebidaDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Bebida> buscarBebidasPorTipo(int idBebida) {
        Optional<Tipo_bebida> tb = tipoBebidaDAO.findById(idBebida);
        if (tb.isEmpty()) {
            throw new NotFoundException("Tipo bebida no existe, verifique datos");
        }
        return dao.buscarBebidasPorTipo(idBebida);
    }
}
