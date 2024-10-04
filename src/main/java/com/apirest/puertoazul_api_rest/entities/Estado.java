package com.apirest.puertoazul_api_rest.entities;

public enum Estado {
    ALL("ALL"),
    ACTIVO("Activo"),
    INACTIVO("Inactivo"),
    PENDIENTE("Pendiente"),
    ANULADO("Anulado"),
    TERMINADO("TERMINADO"),
    PAGADO("PAGADO"),
    CANCELADO("CANCELADO"),
    OCUPADO("OCUPADO"),
    ENPREPARACION("ENPREPARACION"),
    LISTO("LISTO"),
    LIBRE("LIBRE"),
    ENTREGADO("ENTREGADO"),

    RECIBIDO("RECIBIDO");

    Estado(String nombre) {
        this.nombre = nombre;
    }

    private final String nombre;

    public String getNombre() {
        return nombre;
    }
}
