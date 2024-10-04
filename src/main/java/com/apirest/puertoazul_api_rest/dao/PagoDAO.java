package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.Estado;
import com.apirest.puertoazul_api_rest.entities.Mesa;
import com.apirest.puertoazul_api_rest.entities.Pago;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface PagoDAO extends GenericJPAStatusRepository<Pago, Long> {

    @Query(value = "SELECT IFNULL(MAX(p.n_pago), 0) AS MaxX FROM Pagos p", nativeQuery = true)
    Optional<Long> findLastId();

    @Transactional
    @Modifying
    @Query(value = "update Pago p set p.estado = ?1 where p.id = ?2")
    int actualizarEstadoPago(Long id, Estado estado);
}
