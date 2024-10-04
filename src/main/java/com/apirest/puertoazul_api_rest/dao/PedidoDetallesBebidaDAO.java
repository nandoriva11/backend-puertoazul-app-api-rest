package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.Estado;
import com.apirest.puertoazul_api_rest.entities.Pedido_Detalles_Bebidas;
import com.apirest.puertoazul_api_rest.entities.Pedido_Detalles_Plato;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface PedidoDetallesBebidaDAO extends GenericJPAStatusRepository<Pedido_Detalles_Bebidas, Long>{

    @Transactional
    @Modifying
    @Query("update Pedido_Detalles_Bebidas m set m.estado = ?1 where m.id = ?2")
    void updatePedidoDetallesBebidas(Estado estado, Integer id);


}
