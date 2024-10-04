package com.apirest.puertoazul_api_rest.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.Arrays;

@Entity
@Table(name = "platos")
public class Plato implements IGenericStatusClass<Integer>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Ingresé nombre del plato.")
    private String nombre;

    @NotNull(message = "Usted debe seleccionar una categoria.")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria_plato")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Categoria_plato categoriaPlato;

    private double precio;


    private String imagen;

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


    public Categoria_plato getCategoriaPlato() {
        return categoriaPlato;
    }

    public void setCategoriaPlato(Categoria_plato categoriaPlato) {
        this.categoriaPlato = categoriaPlato;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public Estado getEstado() {
        return estado;
    }

    @Override
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
