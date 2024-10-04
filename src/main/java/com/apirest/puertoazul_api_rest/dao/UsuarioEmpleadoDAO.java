package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.Tipo_Pedido;
import com.apirest.puertoazul_api_rest.entities.Usuario_Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UsuarioEmpleadoDAO extends JpaRepository<Usuario_Empleado, Integer> {

    Optional<Usuario_Empleado> findByEmail(String email);

    @Transactional
    @Modifying
    @Query("update Usuario_Empleado m set m.enabled = ?1 where m.id = ?2")
    int updateEstado(boolean estado, Integer id);

    @Query("select u from Usuario_Empleado u where u.email = ?1")
    Optional<Usuario_Empleado> getUsuarioByEmail(String email);
}
