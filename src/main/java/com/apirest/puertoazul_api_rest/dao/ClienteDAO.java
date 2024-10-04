package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.Bebida;
import com.apirest.puertoazul_api_rest.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {
}
