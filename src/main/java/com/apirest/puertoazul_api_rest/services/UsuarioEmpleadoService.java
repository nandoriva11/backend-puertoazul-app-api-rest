package com.apirest.puertoazul_api_rest.services;

import com.apirest.puertoazul_api_rest.entities.Rol;
import com.apirest.puertoazul_api_rest.entities.Usuario_Empleado;
import com.apirest.puertoazul_api_rest.generics.service.GenericService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public interface UsuarioEmpleadoService extends GenericService<Usuario_Empleado, Integer> {
    Optional<Usuario_Empleado> getUsuarioByEmail(String email);


    Usuario_Empleado update(Usuario_Empleado usuario);
    int changeStatusUser(Integer id, boolean enabled);


}
