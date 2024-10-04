package com.apirest.puertoazul_api_rest.controllers;

import com.apirest.puertoazul_api_rest.entities.Bebida;
import com.apirest.puertoazul_api_rest.entities.Cargo;
import com.apirest.puertoazul_api_rest.entities.Tipo_bebida;
import com.apirest.puertoazul_api_rest.generics.controller.GenericController;
import com.apirest.puertoazul_api_rest.services.ICargoService;
import com.apirest.puertoazul_api_rest.services.ITipoBebidaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = ControllerPaths.PATH_TIPO_BEBIDA)
public class TipoBebidaRestController extends GenericController<Tipo_bebida, Integer, ITipoBebidaService> {
}
