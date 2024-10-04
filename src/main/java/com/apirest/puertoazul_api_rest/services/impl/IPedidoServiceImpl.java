package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.MesaDAO;
import com.apirest.puertoazul_api_rest.dao.PedidoDAO;
import com.apirest.puertoazul_api_rest.entities.Estado;
import com.apirest.puertoazul_api_rest.entities.Mesa;
import com.apirest.puertoazul_api_rest.entities.Pedido;
import com.apirest.puertoazul_api_rest.exceptions.InternalServerError;
import com.apirest.puertoazul_api_rest.exceptions.NotFoundException;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceImpl;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceWithStatusImpl;
import com.apirest.puertoazul_api_rest.services.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class IPedidoServiceImpl extends GenericServiceWithStatusImpl<Pedido, PedidoDAO, Long> implements IPedidoService {

    @Autowired
    private MesaDAO daomesa;

    @Override
    @Transactional
    public Pedido save(Pedido pedido) {
        Mesa mesaBD = null;
        System.out.println(pedido.getMesa());
        if (pedido.getMesa() != null) {
            mesaBD = daomesa.findById(pedido.getMesa().getId()).orElse(null);
        }
        if (mesaBD != null) {
            mesaBD.setEstado(Estado.OCUPADO);
            daomesa.save(mesaBD);
        } else {
            System.out.println("Pedido para llevar");
        }

        Long id = super.dao.findLastId().orElse(null);
        if (id != null) {
            pedido.setN_pedido(id + 1);
        } else {
            throw new InternalServerError("Ocurrio un error interno, CONTACTAR ADMINISTRADOR DEL SISTEMA");
        }
        return dao.save(pedido);
    }

    @Override
    public String getLastNumPed() {
        Long id = super.dao.findLastId().orElse(null);
        if (id != null) {
            id = id + 1;
            String stringID = id.toString();
            int vecesBucle = 9 - stringID.length();

            if (stringID.length() > 9) {
                return "999999999";
            }

            for (int index = 0; index < vecesBucle; index++) {
                stringID = "0" + stringID;
            }
            return stringID;
        } else {
            return "000000000";
        }

    }

    @Override
    public Map<String, Object> anularPedido(long id) {
        Optional<Pedido> obj = dao.findById(id);
        Pedido pedidoBD = null;
        Map<String, Object> responseToController = new HashMap<>();
        if (obj.isEmpty()) {
            throw new NotFoundException("El pedido no existe");
        }
        pedidoBD = obj.get();

        if (pedidoBD.getEstado() == Estado.ANULADO) {
            responseToController.put("mensaje", "El pedido ya fue anulado.");
            return responseToController;
        } else if (pedidoBD.getEstado() == Estado.ENPREPARACION) {
            responseToController.put("mensaje", "El pedido se encuentra en preparación y no puede ser anulado.");
            return responseToController;
        } else if (pedidoBD.getEstado() == Estado.RECIBIDO) {

            dao.anularPedidoByID(pedidoBD.getId());
            daomesa.updateEstadoMesa(pedidoBD.getMesa().getId(), Estado.LIBRE);
            responseToController.put("mensaje", "El pedido fue anulado correctamente");
            responseToController.put("obj", pedidoBD);
            return responseToController;
        } else {
            responseToController.put("mensaje", "No se pudo anular pedido por razones desconocidas.");
            return responseToController;
        }
    }

    @Override
    public List<Pedido> getPedidosByIDEmpleado(Long idEmpleado) {
        List<Pedido> lista = dao.getPedidosByIDEmpleado(idEmpleado);

        return lista;
    }

    @Override
    public List<Pedido> getPedidosByIDMesa(Long idMesa) {
        List<Pedido> lista = dao.getPedidosByIDMesa(idMesa);

        return lista;
    }

    @Override
    public List<Pedido> getPedidosByIDEmpleado(Long idEmpleado, Estado estado) {
        List<Pedido> lista = dao.getPedidosByIDEmpleado(idEmpleado, estado);

        return lista;
    }

    @Override
    public List<Pedido> getPedidosByIDMesa(Long idMesa, Estado estado) {
        List<Pedido> lista = dao.getPedidosByIDMesa(idMesa, estado);

        return lista;
    }

    @Override
    public void actualizarEstadoPedido(Long id, Estado estado) {
        dao.actualizarEstadoPedido(id, estado);
    }


}
