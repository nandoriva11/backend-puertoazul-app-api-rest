package com.apirest.puertoazul_api_rest.generics.service;

import com.apirest.puertoazul_api_rest.entities.GenericEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class GenericServiceImpl<E extends GenericEntity<Key>, R extends JpaRepository<E, Key>, Key>
        implements GenericService<E, Key> {

    @Autowired
    protected R dao;

    @Override
    @Transactional(readOnly = true)
    public Iterable<E> findAll() {
        // TODO Auto-generated method stub
        return dao.findAll();
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<E> findById(Key id) {
        // TODO Auto-generated method stub
        return dao.findById(id);
    }

    @Override
    @Transactional
    public E save(E e) {
        return dao.save(e);
    }

    @Override
    @Transactional
    public void deleteById(Key id) {
        // TODO Auto-generated method stub
        dao.deleteById(id);
    }

    @Override
    public Page<E> findAll(Pageable pageable) {
        return dao.findAll(pageable);
    }

    @Override
    public boolean ExistsEntity(Key id) {
        return dao.existsById(id);
    }



}