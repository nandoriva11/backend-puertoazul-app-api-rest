package com.apirest.puertoazul_api_rest.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebidas")
public class Bebida implements IGenericStatusClass<Integer>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Ingresé nombre del plato.")
    private String nombre;

    @NotNull(message = "Usted debe seleccionar un tipo de bebida.")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_bebida")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Tipo_bebida tipo_bebida;

    private String imagen;

    private double precio;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo_bebida getTipo_bebida() {
        return tipo_bebida;
    }

    public void setTipo_bebida(Tipo_bebida tipo_bebida) {
        this.tipo_bebida = tipo_bebida;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
