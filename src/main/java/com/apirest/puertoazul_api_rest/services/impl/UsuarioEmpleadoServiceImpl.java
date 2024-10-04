package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.UsuarioEmpleadoDAO;
import com.apirest.puertoazul_api_rest.entities.Rol;
import com.apirest.puertoazul_api_rest.entities.Usuario_Empleado;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceImpl;
import com.apirest.puertoazul_api_rest.services.UsuarioEmpleadoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioEmpleadoServiceImpl extends GenericServiceImpl<Usuario_Empleado, UsuarioEmpleadoDAO, Integer> implements UsuarioEmpleadoService {

    protected final static List<Rol> CARGO_EMPLEADO = Arrays.asList(new Rol(1L));
    protected final static List<Rol> CARGO_COCINERO = List.of(new Rol(1L), new Rol(3L), new Rol(4L), new Rol(8L), new Rol(9L));
    protected final static List<Rol> CARGO_MOZO = Arrays.asList(new Rol(8L), new Rol(1L));
    protected final static List<Rol> CARGO_AYUDANTE_COCINA = Arrays.asList(new Rol(8L), new Rol(1L), new Rol(4L));
    protected final static List<Rol> CARGO_BARMAN = Arrays.asList(new Rol(1L), new Rol(4L), new Rol(6L), new Rol(8L), new Rol(9L));
    protected final static List<Rol> CARGO_AYUDANTE_BARMAN = Arrays.asList(new Rol(8L), new Rol(1L), new Rol(6L));
    protected final static List<Rol> CARGO_ADMINISTRADOR = Arrays.asList(new Rol(1L), new Rol(2L), new Rol(3L), new Rol(4L), new Rol(5L), new Rol(6L), new Rol(7L), new Rol(8L), new Rol(9L));
    protected final static List<Rol> CARGO_CAJERO = Arrays.asList(new Rol(1L), new Rol(7L), new Rol(3L), new Rol(5L), new Rol(8L));


    @Override
    public Optional<Usuario_Empleado> getUsuarioByEmail(String email) {
        return dao.getUsuarioByEmail(email);
    }

    @Override
    public Usuario_Empleado update(Usuario_Empleado usuario) {
        return dao.save(usuario);
    }


    @Override
    public int changeStatusUser(Integer id, boolean enabled) {
        return dao.existsById(id) ? dao.updateEstado(enabled, id) : null;
    }

}
