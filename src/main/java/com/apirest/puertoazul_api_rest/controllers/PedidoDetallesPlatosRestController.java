package com.apirest.puertoazul_api_rest.controllers;

import com.apirest.puertoazul_api_rest.entities.Estado;
import com.apirest.puertoazul_api_rest.entities.Pedido_Detalles_Bebidas;
import com.apirest.puertoazul_api_rest.entities.Pedido_Detalles_Plato;
import com.apirest.puertoazul_api_rest.generics.controller.GenericControllerWithStatus;
import com.apirest.puertoazul_api_rest.services.IPedidoBebidaDetallesService;
import com.apirest.puertoazul_api_rest.services.IPedidoPlatoDetallesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = ControllerPaths.PEDIDO_DETALLES_PLATOS)
public class PedidoDetallesPlatosRestController extends GenericControllerWithStatus<Pedido_Detalles_Plato, Long, IPedidoPlatoDetallesService> {

    @PutMapping("/editar-estado-pedido/{id}/{estado}")
    public ResponseEntity<?> editar_estado_pedido(@PathVariable(name = "id") Integer id, @PathVariable(name = "estado") Estado estado) {
        System.out.println("EDITANDO PLATOS");
        service.updatePedidoDetalles(estado, id);
        return ResponseEntity.noContent().build();
    }
}
