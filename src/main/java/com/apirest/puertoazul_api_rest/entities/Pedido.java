package com.apirest.puertoazul_api_rest.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedidos")
public class Pedido implements IGenericStatusClass<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long n_pedido;

    @Temporal(TemporalType.DATE)
    private Date fec_pedido;

    @Temporal(TemporalType.TIME)
    private Date hora_pedido;
    private double subtotal;

    private int dscto;

    private double total;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Cliente cliente;

    @NotNull(message = "Usted debe seleccionar una empleado.")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empleado")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Empleado empleado;

    @NotNull(message = "Usted debe seleccionar una cliente.")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_pedido")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Tipo_Pedido tipo_pedido;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pedido")
    @JsonIgnoreProperties({"pedidos", "hibernateLazyInitializer", "handler"})
    private List<Pedido_Detalles_Plato> pedidoDetallesPlatos;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pedido")
    @JsonIgnoreProperties({"pedidos", "hibernateLazyInitializer", "handler"})
    private List<Pedido_Detalles_Bebidas> pedidoDetallesBebidas;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_mesa")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Mesa mesa;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }


    public String getNumPedido() {
        String stringID = getN_pedido().toString();
        int vecesBucle = 9 - stringID.length();
        if (stringID.length() > 9) {
            return "999999999";
        }
        for (int index = 0; index < vecesBucle; index++) {
            stringID = "0" + stringID;
        }
        return stringID;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", n_pedido=" + n_pedido +
                ", fec_pedido=" + fec_pedido +
                ", hora_pedido=" + hora_pedido +
                ", subtotal=" + subtotal +
                ", dscto=" + dscto +
                ", total=" + total +
                ", cliente=" + cliente +
                ", empleado=" + empleado +
                ", tipo_pedido=" + tipo_pedido +
                ", pedidoDetallesPlatos=" + pedidoDetallesPlatos +
                ", pedidoDetallesBebidas=" + pedidoDetallesBebidas +
                ", estado=" + estado +
                '}';
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Long getN_pedido() {
        return n_pedido;
    }

    public void setN_pedido(Long n_pedido) {
        this.n_pedido = n_pedido;
    }

    public Date getFec_pedido() {
        return fec_pedido;
    }

    public void setFec_pedido(Date fec_pedido) {
        this.fec_pedido = fec_pedido;
    }

    public Date getHora_pedido() {
        return hora_pedido;
    }

    public void setHora_pedido(Date hora_pedido) {
        this.hora_pedido = hora_pedido;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getDscto() {
        return dscto;
    }

    public void setDscto(int dscto) {
        this.dscto = dscto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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

    public Tipo_Pedido getTipo_pedido() {
        return tipo_pedido;
    }

    public void setTipo_pedido(Tipo_Pedido tipo_pedido) {
        this.tipo_pedido = tipo_pedido;
    }

    public List<Pedido_Detalles_Plato> getPedidoDetallesPlatos() {
        return pedidoDetallesPlatos;
    }

    public void setPedidoDetallesPlatos(List<Pedido_Detalles_Plato> pedidoDetallesPlatos) {
        this.pedidoDetallesPlatos = pedidoDetallesPlatos;
    }

    public List<Pedido_Detalles_Bebidas> getPedidoDetallesBebidas() {
        return pedidoDetallesBebidas;
    }

    public void setPedidoDetallesBebidas(List<Pedido_Detalles_Bebidas> pedidoDetallesBebidas) {
        this.pedidoDetallesBebidas = pedidoDetallesBebidas;
    }

    @Override
    public Estado getEstado() {
        return estado;
    }

    @Override
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getNItems() {
        return this.getPedidoDetallesBebidas().size() + getPedidoDetallesPlatos().size();
    }

    public boolean getNotSomeonePendiente() {
        boolean res = false;
        List<Estado> estados;
        if (getNItems() > 0) {
            estados = new ArrayList<>();
            this.getPedidoDetallesPlatos().forEach(obj -> estados.add(obj.getEstado()));
            this.getPedidoDetallesBebidas().forEach(obj -> estados.add((obj.getEstado())));
            for (Estado estado1 : estados) {
                if (estado1 == Estado.RECIBIDO) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
