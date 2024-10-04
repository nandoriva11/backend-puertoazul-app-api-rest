package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.Rol;
import com.apirest.puertoazul_api_rest.entities.Tipo_Documento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDocumentoDAO extends JpaRepository<Tipo_Documento, Integer> {


}
