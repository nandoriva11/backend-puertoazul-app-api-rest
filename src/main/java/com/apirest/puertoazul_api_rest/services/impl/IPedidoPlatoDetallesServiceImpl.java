package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.PedidoDetallesPlatoDAO;
import com.apirest.puertoazul_api_rest.entities.Estado;
import com.apirest.puertoazul_api_rest.entities.Pedido_Detalles_Plato;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceWithStatusImpl;
import com.apirest.puertoazul_api_rest.services.IPedidoPlatoDetallesService;
import org.springframework.stereotype.Service;

@Service
public class IPedidoPlatoDetallesServiceImpl extends GenericServiceWithStatusImpl<Pedido_Detalles_Plato, PedidoDetallesPlatoDAO, Long> implements IPedidoPlatoDetallesService {

    @Override
    public void updatePedidoDetalles(Estado estado, Integer id) {
        dao.updatePedidoDetallesPlatos(estado, id);
    }
}
