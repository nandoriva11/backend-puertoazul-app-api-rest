package com.apirest.puertoazul_api_rest.controllers;

import com.apirest.puertoazul_api_rest.entities.TipoPago;
import com.apirest.puertoazul_api_rest.entities.Tipo_bebida;
import com.apirest.puertoazul_api_rest.generics.controller.GenericController;
import com.apirest.puertoazul_api_rest.services.ITipoBebidaService;
import com.apirest.puertoazul_api_rest.services.ITipoPagoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = ControllerPaths.PATH_TIPO_PAGO)
public class TipoPagoRestController extends GenericController<TipoPago, Integer, ITipoPagoService> {
}
