package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.PedidoDetallesBebidaDAO;
import com.apirest.puertoazul_api_rest.entities.Estado;
import com.apirest.puertoazul_api_rest.entities.Pedido_Detalles_Bebidas;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceWithStatusImpl;
import com.apirest.puertoazul_api_rest.services.IPedidoBebidaDetallesService;
import org.springframework.stereotype.Service;

@Service
public class IPedidoBebidaDetallesServiceImpl extends GenericServiceWithStatusImpl<Pedido_Detalles_Bebidas, PedidoDetallesBebidaDAO, Long> implements IPedidoBebidaDetallesService {
    @Override
    public void updatePedidoDetalles(Estado estado, Integer id) {
        dao.updatePedidoDetallesBebidas(estado, id);
    }
}
