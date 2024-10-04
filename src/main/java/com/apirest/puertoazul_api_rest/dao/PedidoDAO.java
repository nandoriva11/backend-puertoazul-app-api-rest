package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.Empleado;
import com.apirest.puertoazul_api_rest.entities.Estado;
import com.apirest.puertoazul_api_rest.entities.Pedido;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface PedidoDAO extends GenericJPAStatusRepository<Pedido, Long> {

    @Query(value = "SELECT IFNULL(MAX(p.n_pedido), 0) AS MaxX FROM pedidos P", nativeQuery = true)
    Optional<Long> findLastId();

    @Query(value = "select p from Pedido p where p.mesa.id = :idMesa and p.estado = :estado")
    List<Pedido> getPedidosByIDMesa(@Param("idMesa") Long idMesa, @Param("estado") Estado estado);

    @Query(value = "select p from Pedido p where p.empleado.id = :idEmpleado and p.estado = :estado")
    List<Pedido> getPedidosByIDEmpleado(@Param("idEmpleado") Long idEmpleado, @Param("estado") Estado estado);

    @Query(value = "select p from Pedido p where p.mesa.id = :idMesa")
    List<Pedido> getPedidosByIDMesa(@Param("idMesa") Long idMesa);

    @Query(value = "select p from Pedido p where p.empleado.id = :idEmpleado")
    List<Pedido> getPedidosByIDEmpleado(@Param("idEmpleado") Long idEmpleado);

    @Transactional
    @Modifying
    @Query(value = "update Pedido p set p.estado = 'ANULADO' where p.id = :id")
    void anularPedidoByID(@Param("id") Long id);

    @Transactional
    @Modifying
    @Query(value = "update Pedido p set p.estado = ?1 where p.id = ?2")
    void actualizarEstadoPedido(Long id, Estado estado);



}
