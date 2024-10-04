package com.apirest.puertoazul_api_rest.entities;

public interface IGenericStatusClass<Key> {

    Estado getEstado();

    void setEstado(Estado estado);

    Key getId();

    void setId(Key id);
}
