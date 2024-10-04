package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.Empleado;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpleadoDAO extends GenericJPAStatusRepository<Empleado, Integer>{

    @Query(nativeQuery = true, value = "select e.email from empleados e where e.email = ?1")
    List<String> emailsExists(String email);

    @Query(nativeQuery = true, value = "select e.num_doc from empleados e where e.num_doc = ?1")
    List<String> dniExists(String dni);
}
