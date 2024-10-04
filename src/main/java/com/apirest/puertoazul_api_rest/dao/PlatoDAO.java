package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.Categoria_plato;
import com.apirest.puertoazul_api_rest.entities.Empleado;
import com.apirest.puertoazul_api_rest.entities.Plato;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlatoDAO extends GenericJPAStatusRepository<Plato, Integer> {




    @Query("SELECT p FROM Plato p WHERE p.estado = 'ACTIVO' and p.categoriaPlato.id = :idCategoria")
    List<Plato> buscarPorCategoria(@Param("idCategoria") int idCategoria);

    @Query("SELECT p FROM Plato p WHERE p.estado = 'ACTIVO' and p.nombre LIKE ':nombre'")
    List<Plato> buscarPorNombre(@Param("nombre") String nombre);
}
