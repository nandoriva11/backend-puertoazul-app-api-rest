package com.apirest.puertoazul_api_rest.controllers;

import com.apirest.puertoazul_api_rest.entities.Bebida;
import com.apirest.puertoazul_api_rest.entities.Plato;
import com.apirest.puertoazul_api_rest.exceptions.BadRequestException;
import com.apirest.puertoazul_api_rest.exceptions.InternalServerError;
import com.apirest.puertoazul_api_rest.exceptions.NotFoundException;
import com.apirest.puertoazul_api_rest.generics.controller.GenericController;
import com.apirest.puertoazul_api_rest.generics.controller.GenericControllerWithStatus;
import com.apirest.puertoazul_api_rest.services.IBebidaService;
import com.apirest.puertoazul_api_rest.services.UploadService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.core.io.Resource;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
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
@RequestMapping(path = ControllerPaths.PATH_BEBIDAS)
public class BebidaRestController extends GenericControllerWithStatus<Bebida, Integer, IBebidaService> {


    @Autowired
    UploadService uploadService;

    @PutMapping("/edit/{id}")
    public ResponseEntity<?> update(@Valid Bebida bebida, BindingResult result,
                                    @PathVariable("id") Integer id_bebida, @RequestParam(name = "file", required = false) MultipartFile foto) throws IOException {
        Map<String, Object> response = new HashMap<>();

        Optional<Bebida> o = service.findById(id_bebida);

        if (o.isEmpty()) {
            throw new NotFoundException("La bebida a editar no existe.");
        }

        if (result.hasErrors()) {
            Map<String, String> errors = result.getFieldErrors().stream()
                    .collect(Collectors.toMap(FieldError::getField, DefaultMessageSourceResolvable::getDefaultMessage));
            response.put("errors", errors);
            throw new BadRequestException(errors);
        }

        Bebida bebidaDB = o.get();
        bebidaDB.setNombre(bebida.getNombre());
        bebidaDB.setTipo_bebida(bebida.getTipo_bebida());
        bebidaDB.setPrecio(bebida.getPrecio());

        if (foto != null && !foto.isEmpty()) {
            String nombreArchivo = null;
            try {
                nombreArchivo = uploadService.copiarImg(foto);
            } catch (IOException e) {
                throw new InternalServerError(e.getCause() + " " + e.getMessage());
            }
            String nombreFotoAnterior = bebidaDB.getImagen();
            uploadService.eliminar(nombreFotoAnterior);
            bebidaDB.setImagen(nombreArchivo);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(bebidaDB));

    }

    @PostMapping("/crear-con-foto")
    public ResponseEntity<?> crearConFoto(@Valid Bebida bebida, BindingResult result,
                                          @RequestParam(name = "file") MultipartFile foto) {

        if (!foto.isEmpty()) {
            String nombreArchivo = null;
            try {
                nombreArchivo = uploadService.copiarImg(foto);
            } catch (IOException e) {
                throw new InternalServerError(e.getCause() + " " + e.getMessage());
            }
            bebida.setImagen(nombreArchivo);
        }
        return super.crear(bebida, result);
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
        Optional<Bebida> o = service.findById(id);

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

    @GetMapping("/listar-por-tipo-bebida/{id}")
    public ResponseEntity<?> buscarPorTipoBebida(@PathVariable(name = "id") int idTipoBebida) {
        return ResponseEntity.ok(service.buscarBebidasPorTipo(idTipoBebida));
    }
}
