package com.apirest.puertoazul_api_rest.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tipos_recibo")
public class TipoRecibo implements GenericEntity<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "nombre_tipo_recibo")
    public String nombre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
