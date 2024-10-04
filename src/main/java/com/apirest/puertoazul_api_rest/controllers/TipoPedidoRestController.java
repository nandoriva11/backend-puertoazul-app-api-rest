package com.apirest.puertoazul_api_rest.controllers;

import com.apirest.puertoazul_api_rest.entities.Tipo_Pedido;
import com.apirest.puertoazul_api_rest.entities.Tipo_bebida;
import com.apirest.puertoazul_api_rest.generics.controller.GenericController;
import com.apirest.puertoazul_api_rest.services.ITipoBebidaService;
import com.apirest.puertoazul_api_rest.services.ITipoPedidoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path = ControllerPaths.PATH_TIPO_PEDIDO)
public class TipoPedidoRestController extends GenericController<Tipo_Pedido, Integer, ITipoPedidoService> {

}
