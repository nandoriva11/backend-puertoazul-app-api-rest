package com.apirest.puertoazul_api_rest.services;

import com.apirest.puertoazul_api_rest.entities.Estado;
import com.apirest.puertoazul_api_rest.entities.Pedido_Detalles_Bebidas;
import com.apirest.puertoazul_api_rest.entities.Pedido_Detalles_Plato;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceWithStatus;

public interface IPedidoBebidaDetallesService extends GenericServiceWithStatus<Pedido_Detalles_Bebidas, Long> {

    void updatePedidoDetalles(Estado estado, Integer id);
}
