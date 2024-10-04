package com.apirest.puertoazul_api_rest.controllers;

import com.apirest.puertoazul_api_rest.entities.Empleado;
import com.apirest.puertoazul_api_rest.entities.Plato;
import com.apirest.puertoazul_api_rest.exceptions.BadRequestException;
import com.apirest.puertoazul_api_rest.exceptions.InternalServerError;
import com.apirest.puertoazul_api_rest.exceptions.NotFoundException;
import com.apirest.puertoazul_api_rest.generics.controller.GenericControllerWithStatus;
import com.apirest.puertoazul_api_rest.services.IEmpleadoService;
import com.apirest.puertoazul_api_rest.services.UploadService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.core.io.Resource;
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
@RequestMapping(path = ControllerPaths.PATH_EMPLEADO)
public class EmpleadoRestController extends GenericControllerWithStatus<Empleado, Integer, IEmpleadoService> {


    @Autowired
    UploadService uploadService;

    @PutMapping("/edit/{id}")
    public ResponseEntity<?> update(@Valid Empleado empleado, BindingResult result,
                                    @PathVariable("id") Integer id_empleado, @RequestParam(name = "file", required = false) MultipartFile foto) {
        Map<String, Object> response = new HashMap<>();

        Optional<Empleado> o = service.findById(id_empleado);

        if (o.isEmpty()) {
            throw new NotFoundException("El empleado a editar no existe.");
        }

        if (result.hasErrors()) {
            Map<String, String> errors = result.getFieldErrors().stream()
                    .collect(Collectors.toMap(FieldError::getField, DefaultMessageSourceResolvable::getDefaultMessage));
            response.put("errors", errors);
            throw new BadRequestException(errors);
        }

        Empleado empleadoDB = o.get();
        empleadoDB.setNombres(empleado.getNombres());
        empleadoDB.setApellidos(empleado.getApellidos());
        empleadoDB.setFecha_nac(empleado.getFecha_nac());
        empleadoDB.setNum_doc(empleado.getNum_doc());
        empleadoDB.setGenero(empleado.getGenero());
        empleadoDB.setEstado_civil(empleado.getEstado_civil());
        empleadoDB.setCelular(empleado.getCelular());
        empleadoDB.setEmail(empleado.getEmail());
        empleadoDB.setFecha_registro(empleado.getFecha_registro());
        empleadoDB.setDesc_empleado(empleado.getDesc_empleado());
        empleadoDB.setDireccion(empleado.getDireccion());
        empleadoDB.setCargo(empleado.getCargo());
        empleadoDB.setTipo_documento(empleado.getTipo_documento());
        empleadoDB.setDistrito(empleado.getDistrito());

        if (foto != null && !foto.isEmpty()) {
            String nombreArchivo = null;
            try {
                nombreArchivo = uploadService.copiarImg(foto);
            } catch (IOException e) {
                throw new InternalServerError(e.getCause() + " " + e.getMessage());
            }
            String nombreFotoAnterior = empleadoDB.getFoto();
            uploadService.eliminar(nombreFotoAnterior);
            empleadoDB.setFoto(nombreArchivo);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(empleadoDB));

    }

    @PostMapping("/crear-con-foto")
    public ResponseEntity<?> crearConFoto(@Valid Empleado empleado, BindingResult result,
                                          @RequestParam(name = "file") MultipartFile foto) {

        if (!foto.isEmpty()) {
            String nombreArchivo = null;
            try {
                nombreArchivo = uploadService.copiarImg(foto);
            } catch (IOException e) {
                throw new InternalServerError(e.getCause() + " " + e.getMessage());
            }
            empleado.setFoto(nombreArchivo);
        }
        return super.crear(empleado, result);
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

    @GetMapping("/email/{email}")
    public ResponseEntity<?> checkEmail(@PathVariable(name = "email") String email) {
        Map<String, Boolean> response;
        boolean existsEmail;
        try {
            existsEmail = service.emailExists(email);
        } catch (Exception e) {
            throw new InternalServerError(e.getMessage());
        }
        response = new HashMap<>();
        response.put("existe", existsEmail);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/dni/{dni}")
    public ResponseEntity<?> checkDNI(@PathVariable(name = "dni") String dni) {
        Map<String, Boolean> response;
        boolean existsEmail;
        try {
            existsEmail = service.dniExists(dni);
        } catch (Exception e) {
            throw new InternalServerError(e.getMessage());
        }
        response = new HashMap<>();
        response.put("existe", existsEmail);
        return ResponseEntity.ok(response);
    }


}
