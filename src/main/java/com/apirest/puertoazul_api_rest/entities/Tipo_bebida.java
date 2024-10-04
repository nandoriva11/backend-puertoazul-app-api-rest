package com.apirest.puertoazul_api_rest.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tipos_bebida")
public class Tipo_bebida implements GenericEntity<Integer>, java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "nombre_bebida")
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
