package com.apirest.puertoazul_api_rest.services;

import com.apirest.puertoazul_api_rest.entities.Mesa;
import com.apirest.puertoazul_api_rest.entities.Pago;
import com.apirest.puertoazul_api_rest.generics.service.GenericServiceWithStatus;

public interface IPagoService extends GenericServiceWithStatus<Pago, Long> {


    Pago cobrarPago(Pago pago);

    boolean anularPago(Long id);

    String getLastNumPed();
}
