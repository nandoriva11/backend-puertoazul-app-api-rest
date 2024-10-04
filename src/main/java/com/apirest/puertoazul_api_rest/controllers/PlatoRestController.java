package com.apirest.puertoazul_api_rest.controllers;


import com.apirest.puertoazul_api_rest.entities.Plato;
import com.apirest.puertoazul_api_rest.exceptions.BadRequestException;
import com.apirest.puertoazul_api_rest.exceptions.InternalServerError;
import com.apirest.puertoazul_api_rest.exceptions.NotFoundException;
import com.apirest.puertoazul_api_rest.generics.controller.GenericControllerWithStatus;

import com.apirest.puertoazul_api_rest.services.IPlatoService;

import com.apirest.puertoazul_api_rest.services.UploadService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
@RequestMapping(path = ControllerPaths.PATH_PLATOS)
public class PlatoRestController extends GenericControllerWithStatus<Plato, Integer, IPlatoService> {

    @Autowired
    UploadService uploadService;

    @PutMapping("/edit/{id}")
    public ResponseEntity<?> update(@Valid Plato plato, BindingResult result,
                                    @PathVariable("id") Integer id_plato, @RequestParam(name = "file", required = false) MultipartFile foto) {
        Map<String, Object> response = new HashMap<>();

        Optional<Plato> o = service.findById(id_plato);

        if (o.isEmpty()) {
            throw new NotFoundException("El plato a editar no existe.");
        }

        if (result.hasErrors()) {
            Map<String, String> errors = result.getFieldErrors().stream()
                    .collect(Collectors.toMap(FieldError::getField, DefaultMessageSourceResolvable::getDefaultMessage));
            response.put("errors", errors);
            throw new BadRequestException(errors);
        }

        Plato platoDB = o.get();
        platoDB.setNombre(plato.getNombre());
        platoDB.setCategoriaPlato(plato.getCategoriaPlato());
        platoDB.setPrecio(plato.getPrecio());
        System.out.println(plato.getImagen());
        if (foto != null && !foto.isEmpty()) {
            String nombreArchivo = null;
            try {
                nombreArchivo = uploadService.copiarImg(foto);
            } catch (IOException e) {
                throw new InternalServerError(e.getCause() + " " + e.getMessage());
            }
            String nombreFotoAnterior = platoDB.getImagen();
            uploadService.eliminar(nombreFotoAnterior);
            platoDB.setImagen(nombreArchivo);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(platoDB));

    }

    @PostMapping("/crear-con-foto")
    public ResponseEntity<?> crearConFoto(@Valid Plato plato, BindingResult result,
                                          @RequestParam(name = "file") MultipartFile foto) {

        if (!foto.isEmpty()) {
            String nombreArchivo = null;
            try {
                nombreArchivo = uploadService.copiarImg(foto);
            } catch (IOException e) {
                throw new InternalServerError(e.getCause() + " " + e.getMessage());
            }
            plato.setImagen(nombreArchivo);
        }
        return super.crear(plato, result);
    }

    @GetMapping("/uploads/img/{nombreFoto:.+}")
    public ResponseEntity<Resource> verFoto(@PathVariable String nombreFoto) {

        Resource recurso = null;

        try {
            recurso = uploadService.cargar(nombreFoto);
        } catch (MalformedURLException e) {
            throw new InternalServerError(e.getMessage() + ": e.printStackTrace();");
        }
        HttpHeaders cabecera = new HttpHeaders();
        cabecera.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + recurso.getFilename() + "\"");

        return new ResponseEntity<>(recurso, cabecera, HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/{id}")
    protected ResponseEntity<?> eliminar(Integer id) {
        Optional<Plato> o = service.findById(id);

        if (o.isEmpty()) {
            throw new NotFoundException("El/La objeto no existe");
        }
        try {
            String nombreFotoAnterior = o.get().getImagen();
            uploadService.eliminar(nombreFotoAnterior);
            service.deleteById(id);
        } catch (DataAccessException e) {
            throw new InternalServerError(e.getMostSpecificCause().toString());
        }
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/listar-por-categoria/{id}")
    public ResponseEntity<?> buscarPorCategoria(@PathVariable(name = "id") int idCategoria) {

        return ResponseEntity.ok(service.buscarPorCategoria(idCategoria));
    }
}

