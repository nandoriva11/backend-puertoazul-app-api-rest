package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.Cargo;
import com.apirest.puertoazul_api_rest.entities.Tipo_bebida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoBebidaDAO extends JpaRepository<Tipo_bebida, Integer> {
}
