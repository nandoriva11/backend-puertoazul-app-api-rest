package com.apirest.puertoazul_api_rest.services;

import com.apirest.puertoazul_api_rest.entities.Empleado;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceWithStatus;

public interface IEmpleadoService extends GenericServiceWithStatus<Empleado, Integer> {

    boolean emailExists(String email);

    boolean dniExists(String email);
}
