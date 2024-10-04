package com.apirest.puertoazul_api_rest.controllers;

import com.apirest.puertoazul_api_rest.entities.Mesa;
import com.apirest.puertoazul_api_rest.entities.Pago;
import com.apirest.puertoazul_api_rest.exceptions.InternalServerError;
import com.apirest.puertoazul_api_rest.generics.controller.GenericControllerWithStatus;
import com.apirest.puertoazul_api_rest.services.IMesaService;
import com.apirest.puertoazul_api_rest.services.IPagoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping(path = ControllerPaths.PATH_PAGOS)
public class PagoRestController extends GenericControllerWithStatus<Pago, Long, IPagoService> {

    @GetMapping("/anular-pago/{id}")
    public ResponseEntity<?> anular_pago(@PathVariable(name = "id") long id) {
        Map<String, Object> response = new HashMap<>();
        boolean res = service.anularPago(id);
        if (res) {
            response.put("mensaje", "Pago anulado correctamente");
        } else {
            response.put("mensaje", "No se puedo anular el pago, verifique");
        }

        return ResponseEntity.ok(response);
    }

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

    @PutMapping("/pagar/{id}")
    public ResponseEntity<?> pagar_pedido(@Valid Pago pago, BindingResult result,
                                          @PathVariable("id") Long id) throws IOException {
        Map<String, Object> response = new HashMap<>();
        Pago pagodb = service.cobrarPago(pago);
        response.put("mensaje", "Pago realizado correctamente");
        response.put("pago", pagodb);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


}
