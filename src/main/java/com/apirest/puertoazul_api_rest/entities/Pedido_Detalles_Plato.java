package com.apirest.puertoazul_api_rest.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "pedidos_detalles_plato")
public class Pedido_Detalles_Plato implements IGenericStatusClass<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cantidad;

    private double precio_venta;

    private double sub_total;

    @NotNull(message = "Usted debe seleccionar un Pago")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_plato")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Plato plato;


    @Enumerated(EnumType.STRING)
    private Estado estado;


    private String detalles;


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

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
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

    public double getSub_total() {
        return sub_total;
    }

    public void setSub_total(double sub_total) {
        this.sub_total = sub_total;
    }
}
