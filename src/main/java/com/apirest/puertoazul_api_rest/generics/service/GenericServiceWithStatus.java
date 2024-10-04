package com.apirest.puertoazul_api_rest.generics.service;

import com.apirest.puertoazul_api_rest.entities.Estado;
import com.apirest.puertoazul_api_rest.entities.IGenericStatusClass;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface GenericServiceWithStatus<T extends IGenericStatusClass<Key>, Key> {

    public Iterable<T> findAll();

    public Page<T> findAll(Pageable pageable);

    public Optional<T> findById(Key id);

    public T save(T entity);

    public void deleteById(Key id);

    public boolean ExistsEntity(Key id);

    public boolean ChangeStatus(Key id, Estado estado);

    public Iterable<T> findAllByStatus(Estado estado);


}