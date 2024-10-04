package com.apirest.puertoazul_api_rest.dao;

import com.apirest.puertoazul_api_rest.entities.Estado;
import com.apirest.puertoazul_api_rest.entities.IGenericStatusClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericJPAStatusRepository<E extends IGenericStatusClass<Key>, Key> extends JpaRepository<E, Key> {

    Iterable<E> findByEstado(Estado estado);
}

