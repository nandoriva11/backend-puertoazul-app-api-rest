package com.apirest.puertoazul_api_rest.generics.controller;

import com.apirest.puertoazul_api_rest.entities.Estado;
import com.apirest.puertoazul_api_rest.entities.IGenericStatusClass;
import com.apirest.puertoazul_api_rest.exceptions.BadRequestException;
import com.apirest.puertoazul_api_rest.exceptions.NotFoundException;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceWithStatus;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

public class GenericControllerWithStatus<Entity extends IGenericStatusClass<Key>, Key, Service extends GenericServiceWithStatus<Entity, Key>>{


    @Autowired
    protected Service service;

    protected Class<Entity> type;

    @GetMapping
    private ResponseEntity<?> listar() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/pagina")
    private ResponseEntity<?> listar(Pageable pageable) {
        return ResponseEntity.ok().body(service.findAll(pageable));
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> buscarPorID(@PathVariable("id") Key id) {
        Optional<Entity> o = service.findById(id);
        Map<String, Object> resp = new HashMap<String, Object>();;
        if (o.isEmpty()) {
            resp.put("error", "El ID no existe");
            throw new NotFoundException("El objeto no existe");
        }

        resp.put("mensaje:", "Objeto encontrado.");
        resp.put("objeto", o.get());
        return ResponseEntity.ok(resp);
    }

    @PostMapping
    public ResponseEntity<?> crear(@Valid @RequestBody Entity entity, BindingResult result) {
        Entity entityCreated;
        //entity.setId(null);
        Map<String, Object> response = new HashMap<>();

        if (result.hasErrors()) {
            List<String> errors = new ArrayList<String>();
            errors = result.getFieldErrors().stream().map(err -> "'" + err.getField() + "': " + err.getDefaultMessage())
                    .collect(Collectors.toList());
            response.put("errors", errors);
            /*
             * Map<String, String> errors = new HashMap<String, String>(); errors =
             * result.getFieldErrors().stream()
             * .collect(Collectors.toMap(FieldError::getField,
             * DefaultMessageSourceResolvable::getDefaultMessage)); response.put("errors",
             * errors);
             */
            throw new BadRequestException(errors);
        }
        entityCreated = service.save(entity);

        return ResponseEntity.status(HttpStatus.CREATED).body(entityCreated);
    }

    @DeleteMapping("/{id}")
    protected ResponseEntity<?> eliminar(@PathVariable Key id) {

        Optional<Entity> o = service.findById(id);

        if (o.isEmpty()) {
            throw new NotFoundException("El/La objeto no existe");
        }
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    protected String getClassName() {
        return type.getSimpleName().toLowerCase();
    }

    @PutMapping("/estado/{id}" )
    private ResponseEntity<?> changeStatus(@PathVariable("id") Key id, @RequestParam(name = "estado") Estado estado) {
        service.ChangeStatus(id, estado);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/" )
    private ResponseEntity<?> findAllByStatus(@RequestParam(name = "estado") Estado estado) {

        return ResponseEntity.ok().body(service.findAllByStatus(estado));
    }

}
