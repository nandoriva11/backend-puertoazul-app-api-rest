package com.apirest.puertoazul_api_rest.controllers;

import com.apirest.puertoazul_api_rest.entities.Bebida;
import com.apirest.puertoazul_api_rest.entities.Estado;
import com.apirest.puertoazul_api_rest.entities.Mesa;
import com.apirest.puertoazul_api_rest.entities.Pedido;
import com.apirest.puertoazul_api_rest.exceptions.BadRequestException;
import com.apirest.puertoazul_api_rest.exceptions.InternalServerError;
import com.apirest.puertoazul_api_rest.exceptions.NotFoundException;
import com.apirest.puertoazul_api_rest.generics.controller.GenericControllerWithStatus;
import com.apirest.puertoazul_api_rest.services.IMesaService;
import com.apirest.puertoazul_api_rest.services.IPedidoService;
import jakarta.validation.Valid;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
@RequestMapping(path = ControllerPaths.PEDIDOS)
public class PedidoRestController extends GenericControllerWithStatus<Pedido, Long, IPedidoService> {

    @GetMapping("/traer-num-ped")
    public ResponseEntity<?> getNextNumPed() {
        Map<String, String> response;
        String numped;
        try {
            numped = service.getLastNumPed();
        } catch (Exception e) {
            throw new InternalServerError(e.getMessage());
        }
        response = new HashMap<>();
        response.put("next", numped);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/anular-pedido/{id}")
    public ResponseEntity<?> anular_pedido(@PathVariable(name = "id") int idPedido) {
        Map<String, Object> response;
        response = service.anularPedido(idPedido);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/pedidos-empleado/{id}/{estado}")
    public ResponseEntity<?> buscar_pedidos_por_empleados(@PathVariable(name = "id") Long idEmpleado, @PathVariable(name = "estado") Estado estado) {

        if (estado.equals(Estado.ALL)) {
            return ResponseEntity.ok(service.getPedidosByIDEmpleado(idEmpleado));
        } else {
            return ResponseEntity.ok(service.getPedidosByIDEmpleado(idEmpleado, estado));
        }

    }

    @GetMapping("/pedidos-mesa/{id}/{estado}")
    public ResponseEntity<?> buscar_pedidos_por_mesa(@PathVariable(name = "id") Long idMesa, @PathVariable(name = "estado") Estado estado) {


        if (estado.equals(Estado.ALL)) {
            return ResponseEntity.ok(service.getPedidosByIDMesa(idMesa));
        } else {
            return ResponseEntity.ok(service.getPedidosByIDMesa(idMesa, estado));
        }
    }

    @PutMapping("/editar-estado-pedido/{id}/{estado}")
    public ResponseEntity<?> editar_estado_pedido(@PathVariable(name = "id") Long id, @PathVariable(name = "estado") Estado estado) {
        service.actualizarEstadoPedido(id, estado);
        return ResponseEntity.noContent().build();
    }




}
