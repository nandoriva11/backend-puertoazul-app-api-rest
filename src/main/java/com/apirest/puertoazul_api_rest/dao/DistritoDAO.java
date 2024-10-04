package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.Bebida;
import com.apirest.puertoazul_api_rest.entities.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DistritoDAO extends JpaRepository<Distrito, Integer> {

    //@Query("select d from Distrito where d.ubigeo = ?1")
    //List<Distrito> findByUbigeo(String ubigeo);
}
