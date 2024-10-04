package com.apirest.puertoazul_api_rest.services;

import com.apirest.puertoazul_api_rest.entities.Bebida;
import com.apirest.puertoazul_api_rest.entities.Estado;
import com.apirest.puertoazul_api_rest.entities.Pedido;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceWithStatus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public interface IPedidoService extends GenericServiceWithStatus<Pedido, Long> {


    String getLastNumPed();


    Map<String, Object> anularPedido(long id);

    List<Pedido> getPedidosByIDEmpleado(Long idEmpleado);

    List<Pedido> getPedidosByIDMesa(Long idMesa);

    List<Pedido> getPedidosByIDEmpleado(Long idEmpleado, Estado estado);

    List<Pedido> getPedidosByIDMesa(Long idMesa, Estado estado);

    void actualizarEstadoPedido(Long id, Estado estado);
}
