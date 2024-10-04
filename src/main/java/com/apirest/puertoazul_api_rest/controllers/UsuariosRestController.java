package com.apirest.puertoazul_api_rest.controllers;

import com.apirest.puertoazul_api_rest.entities.Cargo;
import com.apirest.puertoazul_api_rest.entities.Rol;
import com.apirest.puertoazul_api_rest.entities.Usuario_Empleado;
import com.apirest.puertoazul_api_rest.exceptions.NotFoundException;
import com.apirest.puertoazul_api_rest.generics.controller.GenericController;
import com.apirest.puertoazul_api_rest.services.ICargoService;
import com.apirest.puertoazul_api_rest.services.RolService;
import com.apirest.puertoazul_api_rest.services.UsuarioEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = ControllerPaths.PATH_USUARIOS)
public class UsuariosRestController extends GenericController<Usuario_Empleado, Integer, UsuarioEmpleadoService> {


    @Autowired
    private RolService rolService;

    @PutMapping("/status/{id}/{boolean}")
    public ResponseEntity<?> cambiarEstado(@PathVariable("id") Integer id, @PathVariable("boolean") boolean estado) {
        return ResponseEntity.ok(service.changeStatusUser(id, estado));
    }


    @PutMapping("/{id}/save-changes")
    public ResponseEntity<?> saveChanges(@RequestBody List<Rol> roles, @PathVariable("id") Integer id) {
        Optional<Usuario_Empleado> o = service.findById(id);
        if (o.isEmpty()) {
            throw new NotFoundException("El usuario no existe");
        }
        Usuario_Empleado userDb = o.get();
        userDb.getRoles().clear();
        roles.forEach(userDb.getRoles()::add);
        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.update(userDb));
    }

    @GetMapping("/roles")
    public ResponseEntity<?> getRoles() {
        return ResponseEntity.ok(rolService.findAll());
    }
}
