package com.apirest.puertoazul_api_rest.generics.service;

import com.apirest.puertoazul_api_rest.entities.GenericEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface GenericService<T extends GenericEntity<Key>, Key> {

    public Iterable<T> findAll();

    public Page<T> findAll(Pageable pageable);

    public Optional<T> findById(Key id);

    public T save(T entity);

    public void deleteById(Key id);


    public boolean ExistsEntity(Key id);


}