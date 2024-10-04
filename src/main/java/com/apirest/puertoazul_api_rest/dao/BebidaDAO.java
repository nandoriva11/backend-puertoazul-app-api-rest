package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.Bebida;
import com.apirest.puertoazul_api_rest.entities.Empleado;
import com.apirest.puertoazul_api_rest.entities.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BebidaDAO extends GenericJPAStatusRepository<Bebida, Integer> {

    @Query("SELECT b FROM Bebida b WHERE b.tipo_bebida.id = :idTipoBebida")
    List<Bebida> buscarBebidasPorTipo(@Param("idTipoBebida") int idTipoBebida);
}
