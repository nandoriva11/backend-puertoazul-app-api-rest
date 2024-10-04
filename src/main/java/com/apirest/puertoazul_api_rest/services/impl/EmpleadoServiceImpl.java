package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.EmpleadoDAO;
import com.apirest.puertoazul_api_rest.entities.Empleado;
import com.apirest.puertoazul_api_rest.entities.Usuario_Empleado;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceWithStatusImpl;
import com.apirest.puertoazul_api_rest.services.IEmpleadoService;
import com.apirest.puertoazul_api_rest.services.UsuarioEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.apirest.puertoazul_api_rest.services.impl.UsuarioEmpleadoServiceImpl.*;

import java.util.Optional;

@Service
public class EmpleadoServiceImpl extends GenericServiceWithStatusImpl<Empleado, EmpleadoDAO, Integer> implements IEmpleadoService {


    @Override
    public boolean emailExists(String email) {
        return !dao.emailsExists(email).isEmpty();
    }

    @Override
    public boolean dniExists(String email) {
        return !dao.dniExists(email).isEmpty();
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UsuarioEmpleadoService usuarioService;

    @Override
    @Transactional
    public Empleado save(Empleado e) {
        Empleado empleadoCreated = super.save(e);
        System.out.println(empleadoCreated.getId());
        Optional<Empleado> empleadoDB = dao.findById(empleadoCreated.getId());
        empleadoCreated = empleadoDB.orElse(null);
        Usuario_Empleado usuario = new Usuario_Empleado();
        System.out.println(empleadoCreated);
        System.out.println(empleadoCreated.getCargo().getNombre());
        System.out.println(empleadoCreated.getCargo().getId());
        switch (empleadoCreated.getCargo().getNombre()) {
            case "MOZO": {
                usuario.setRoles(CARGO_MOZO);
                break;
            }
            case "COCINERO": {
                System.out.println("COCINERO");
                usuario.setRoles(CARGO_COCINERO);
                System.out.println("COCINERO SWICH");
                usuario.getRoles().forEach(r -> System.out.println(r.getId()));
                break;
            }
            case "BARMAN": {
                usuario.setRoles(CARGO_BARMAN);
                break;
            }
            case "AYUDANTE DE COCINA": {
                usuario.setRoles(CARGO_AYUDANTE_BARMAN);
                break;
            }
            case "CAJERO": {
                usuario.setRoles(CARGO_CAJERO);
                break;
            }
            case "EMPLEADO": {
                usuario.setRoles(CARGO_EMPLEADO);
                break;
            }
        }
        System.out.println(usuario.getRoles().size());
        System.out.println(usuario.getRoles().size());
        usuario.setEmail(empleadoCreated.getEmail());
        usuario.setEmpleado(empleadoCreated);
        usuario.setPassword(passwordEncoder.encode(empleadoCreated.getNum_doc()));
        return usuarioService.save(usuario).getEmpleado();
    }
}
