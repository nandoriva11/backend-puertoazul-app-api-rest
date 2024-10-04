package com.apirest.puertoazul_api_rest.controllers;

import com.apirest.puertoazul_api_rest.entities.Cargo;
import com.apirest.puertoazul_api_rest.entities.Distrito;
import com.apirest.puertoazul_api_rest.generics.controller.GenericController;
import com.apirest.puertoazul_api_rest.services.ICargoService;
import com.apirest.puertoazul_api_rest.services.IDistritoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = ControllerPaths.PATH_DISTRITOS)
public class DistritoRestController extends GenericController<Distrito, Integer, IDistritoService> {
}
