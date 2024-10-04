package com.apirest.puertoazul_api_rest.controllers;

import com.apirest.puertoazul_api_rest.entities.Bebida;
import com.apirest.puertoazul_api_rest.entities.Mesa;
import com.apirest.puertoazul_api_rest.exceptions.BadRequestException;
import com.apirest.puertoazul_api_rest.exceptions.InternalServerError;
import com.apirest.puertoazul_api_rest.exceptions.NotFoundException;
import com.apirest.puertoazul_api_rest.generics.controller.GenericControllerWithStatus;
import com.apirest.puertoazul_api_rest.services.IBebidaService;
import com.apirest.puertoazul_api_rest.services.IMesaService;
import com.apirest.puertoazul_api_rest.services.UploadService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(path = ControllerPaths.PATH_MESAS)
public class MesaRestController extends GenericControllerWithStatus<Mesa, Integer, IMesaService> {


}
