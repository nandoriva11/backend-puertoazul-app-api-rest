package com.apirest.puertoazul_api_rest.controllers;

import com.apirest.puertoazul_api_rest.entities.Estado;
import com.apirest.puertoazul_api_rest.services.APIService.ReniecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = ControllerPaths.PATH_RENIEC_API)
public class ClientReniecController {

    @Autowired
    private ReniecService reniecService;

    @GetMapping("/cliente/{dni}")
    public ResponseEntity<?> editar_estado_pedido(@PathVariable(name = "dni") String dni) {

        return ResponseEntity.ok(reniecService.getApiData(dni));
    }
}
