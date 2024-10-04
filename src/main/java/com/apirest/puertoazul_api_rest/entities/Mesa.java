package com.apirest.puertoazul_api_rest.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Null;

@Entity
@Table(name = "mesas")
public class Mesa implements IGenericStatusClass<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private int nmesa;

    private int npersonas;

    private String detalles;

    private int piso;

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

    @Override
    public Estado getEstado() {
        return estado;
    }

    @Override
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getNmesa() {
        return nmesa;
    }

    public void setNmesa(int nmesa) {
        this.nmesa = nmesa;
    }

    public int getNpersonas() {
        return npersonas;
    }

    public void setNpersonas(int npersonas) {
        this.npersonas = npersonas;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "id=" + id +
                ", nmesa=" + nmesa +
                ", npersonas=" + npersonas +
                ", detalles='" + detalles + '\'' +
                ", piso=" + piso +
                ", estado=" + estado +
                '}';
    }
}
