package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.Cargo;
import com.apirest.puertoazul_api_rest.entities.TipoRecibo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoReciboDAO extends JpaRepository<TipoRecibo, Integer> {
}
