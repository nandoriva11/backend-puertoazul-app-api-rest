package com.apirest.puertoazul_api_rest.controllers;

import com.apirest.puertoazul_api_rest.entities.TipoPago;
import com.apirest.puertoazul_api_rest.entities.TipoRecibo;
import com.apirest.puertoazul_api_rest.generics.controller.GenericController;
import com.apirest.puertoazul_api_rest.services.ITipoPagoService;
import com.apirest.puertoazul_api_rest.services.ITipoReciboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = ControllerPaths.PATH_TIPO_RECIBO)
public class TipoReciboRestController extends GenericController<TipoRecibo, Integer, ITipoReciboService> {
}
