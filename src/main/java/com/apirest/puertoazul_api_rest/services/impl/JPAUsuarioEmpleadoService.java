package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.UsuarioEmpleadoDAO;
import com.apirest.puertoazul_api_rest.entities.Usuario_Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JPAUsuarioEmpleadoService implements UserDetailsService {

    @Autowired
    private UsuarioEmpleadoDAO dao;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario_Empleado> o = dao.getUsuarioByEmail(username);

        if (o.isEmpty()) {
            throw new UsernameNotFoundException(String.format("Username %s no eciste en el sistema!", username));
        }
        Usuario_Empleado usuario_empleado = o.orElseThrow();


        List<GrantedAuthority> authorities = usuario_empleado.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol.getNombre())).collect(Collectors.toList());

        return new User(usuario_empleado.getEmail(),
                usuario_empleado.getPassword(),
                usuario_empleado.isEnabled(),
                true,
                true,
                true,
                authorities);
    }
}
