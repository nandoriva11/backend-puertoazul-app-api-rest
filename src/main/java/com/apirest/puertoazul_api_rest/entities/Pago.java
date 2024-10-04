package com.apirest.puertoazul_api_rest.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
@Table(name = "pagos")
public class Pago implements IGenericStatusClass<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long n_pago;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_gen;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_pago;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Cliente cliente;

    @NotNull(message = "Usted debe seleccionar una empleado.")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cajero")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Empleado empleado;

    @NotNull(message = "Usted debe seleccionar un tipo de Pago..")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_pago", updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private TipoPago tipoPago;


    //@NotNull(message = "Usted debe seleccionar un tipo de recibo.")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_recibo", updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private TipoRecibo tipoRecibo;

    @NotNull(message = "Usted debe seleccionar una cliente.")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pedido")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Pedido pedido;

    public Date getFecha_gen() {
        return fecha_gen;
    }

    public void setFecha_gen(Date fecha_gen) {
        this.fecha_gen = fecha_gen;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public TipoRecibo getTipoRecibo() {
        return tipoRecibo;
    }

    public void setTipoRecibo(TipoRecibo tipoRecibo) {
        this.tipoRecibo = tipoRecibo;
    }

    private double importe_pago;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Long getN_pago() {
        return n_pago;
    }

    public void setN_pago(Long n_pago) {
        this.n_pago = n_pago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getImporte_pago() {
        return importe_pago;
    }

    public void setImporte_pago(double importe_pago) {
        this.importe_pago = importe_pago;
    }

    @Override
    public Estado getEstado() {
        return estado;
    }

    @Override
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNumPedido() {
        String stringID = n_pago.toString();
        int vecesBucle = 8 - stringID.length();
        if (stringID.length() > 8) {
            return "99999999";
        }
        for (int index = 0; index < vecesBucle; index++) {
            stringID = "0" + stringID;
        }
        return stringID;
    }


}
