package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.TipoPago;
import com.apirest.puertoazul_api_rest.entities.TipoRecibo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoPagoDAO extends JpaRepository<TipoPago, Integer> {
}
