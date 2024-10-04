package com.apirest.puertoazul_api_rest.controllers;

import com.apirest.puertoazul_api_rest.entities.*;
import com.apirest.puertoazul_api_rest.exceptions.InternalServerError;
import com.apirest.puertoazul_api_rest.generics.controller.GenericControllerWithStatus;
import com.apirest.puertoazul_api_rest.services.IPedidoBebidaDetallesService;
import com.apirest.puertoazul_api_rest.services.IPedidoPlatoDetallesService;
import com.apirest.puertoazul_api_rest.services.IPedidoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@RestController
@RequestMapping(path = ControllerPaths.PEDIDO_DETALLES_BEBIDAS)
public class PedidoDetallesBebidasRestController extends GenericControllerWithStatus<Pedido_Detalles_Bebidas, Long, IPedidoBebidaDetallesService> {


    @PutMapping("/editar-estado-pedido/{id}/{estado}")
    public ResponseEntity<?> editar_estado_pedido(@PathVariable(name = "id") Integer id, @PathVariable(name = "estado") Estado estado) {
        System.out.println("EDITANDO BEBIDAS");
        service.updatePedidoDetalles(estado, id);
        return ResponseEntity.noContent().build();
    }

}
