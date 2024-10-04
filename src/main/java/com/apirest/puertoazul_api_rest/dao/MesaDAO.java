package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.Bebida;
import com.apirest.puertoazul_api_rest.entities.Estado;
import com.apirest.puertoazul_api_rest.entities.Mesa;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface MesaDAO extends GenericJPAStatusRepository<Mesa, Integer> {

    @Transactional
    @Modifying
    @Query(value = "update Mesa m set m.estado = :status where m.id = :id")
    void updateEstadoMesa(@Param("id") int id, @Param("status") Estado mesa);



}
