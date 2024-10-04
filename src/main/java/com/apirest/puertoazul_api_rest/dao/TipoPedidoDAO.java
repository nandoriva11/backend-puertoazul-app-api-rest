package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.Tipo_Documento;
import com.apirest.puertoazul_api_rest.entities.Tipo_Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoPedidoDAO extends JpaRepository<Tipo_Pedido, Integer> {

}
