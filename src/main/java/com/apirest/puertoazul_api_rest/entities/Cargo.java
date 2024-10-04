package com.apirest.puertoazul_api_rest.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "cargos")
public class Cargo implements Serializable, GenericEntity<Integer> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;

	@Column(name = "nombre_cargo")
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

	@Override
	public String toString() {
		return "Cargo{" +
				"id=" + id +
				", nombre='" + nombre + '\'' +
				'}';
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
