package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.TipoPedidoDAO;
import com.apirest.puertoazul_api_rest.entities.Tipo_Pedido;
import com.apirest.puertoazul_api_rest.generics.service.GenericService;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceImpl;
import com.apirest.puertoazul_api_rest.services.ITipoPedidoService;
import org.springframework.stereotype.Service;

@Service
public class ITipoPedidoServiceImpl extends GenericServiceImpl<Tipo_Pedido, TipoPedidoDAO, Integer> implements ITipoPedidoService {
}
