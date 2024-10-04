package com.apirest.puertoazul_api_rest.services.impl;

import com.apirest.puertoazul_api_rest.dao.PagoDAO;
import com.apirest.puertoazul_api_rest.dao.PedidoDAO;
import com.apirest.puertoazul_api_rest.entities.Estado;
import com.apirest.puertoazul_api_rest.entities.Pago;
import com.apirest.puertoazul_api_rest.entities.Pedido;
import com.apirest.puertoazul_api_rest.exceptions.BadRequestException;
import com.apirest.puertoazul_api_rest.exceptions.InternalServerError;
import com.apirest.puertoazul_api_rest.exceptions.NotFoundException;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceWithStatusImpl;
import com.apirest.puertoazul_api_rest.services.IPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;

@Service
public class IPagoServiceImpl extends GenericServiceWithStatusImpl<Pago, PagoDAO, Long> implements IPagoService {


    @Autowired
    private PedidoDAO pedidoDAO;

    @Override
    @Transactional
    public Pago save(Pago pago) {
        if (pago.getId() == null) {
            pago.setEstado(Estado.PENDIENTE);
            if (pago.getPedido().getNItems() > 0) {
                if (pago.getPedido().getNotSomeonePendiente()) {
                    Long id = super.dao.findLastId().orElse(0L);
                    if (id != null) {
                        pago.setN_pago(id + 1);
                    } else {
                        throw new InternalServerError("Ocurrio un error, contactar administrador del sistema");
                    }
                    pago.setFecha_gen(new Date());
                    pago.setImporte_pago(pago.getPedido().getTotal());
                    return super.save(pago);
                } else {
                    throw new BadRequestException("Existen pagos pendientes");
                }
            } else {
                throw new BadRequestException("El pedido no cuenta con ningun detalle Bebida/Platos, verifique información.");
            }
        } else {
            return super.save(pago);
        }
    }

    @Override
    @Transactional
    public Pago cobrarPago(Pago pago) {
        Pago pagoDB = dao.findById(pago.getId()).orElse(null);
        if (pagoDB != null) {
            pedidoDAO.actualizarEstadoPedido(pagoDB.getPedido().getId(), Estado.PAGADO);
            pagoDB.setFecha_pago(new Date());
            pagoDB.setEstado(Estado.PAGADO);
            pagoDB.setTipoPago(pago.getTipoPago());
            pagoDB.setTipoRecibo(pago.getTipoRecibo());
            pagoDB.setCliente(pago.getCliente());
            return dao.save(pagoDB);
        } else {
            throw new NotFoundException("Verifique datos, el PAGO no existe");
        }
    }

    @Override
    public boolean anularPago(Long id) {
        int res = dao.actualizarEstadoPago(id, Estado.ANULADO);
        return res == 1;
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


}
