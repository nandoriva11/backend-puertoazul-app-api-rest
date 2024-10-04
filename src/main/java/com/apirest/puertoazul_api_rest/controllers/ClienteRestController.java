package com.apirest.puertoazul_api_rest.controllers;

import com.apirest.puertoazul_api_rest.entities.Cliente;
import com.apirest.puertoazul_api_rest.entities.Tipo_Pedido;
import com.apirest.puertoazul_api_rest.generics.controller.GenericController;
import com.apirest.puertoazul_api_rest.services.IClienteService;
import com.apirest.puertoazul_api_rest.services.ITipoPedidoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = ControllerPaths.PATH_CLIENTES)
public class ClienteRestController extends GenericController<Cliente, Integer, IClienteService> {

}
