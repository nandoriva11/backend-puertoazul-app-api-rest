package com.apirest.puertoazul_api_rest.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "pedidos_detalles_bebida")
public class Pedido_Detalles_Bebidas implements IGenericStatusClass<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cantidad;

    private double precio_venta;

    private double subtotal;

    private String detalles;

    @NotNull(message = "Usted debe seleccionar un Pago")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bebida")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Bebida bebida;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @PrePersist
    public void prePersist() {
        this.estado = Estado.RECIBIDO;
    }


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    @Override
    public Estado getEstado() {
        return estado;
    }

    @Override
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
