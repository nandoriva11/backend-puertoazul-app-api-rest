package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.Bebida;
import com.apirest.puertoazul_api_rest.entities.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoDAO extends JpaRepository<Cargo, Integer> {
}
