package com.pereira.manolos.negocio.dao;

import java.util.List;
import org.jooq.Condition;

public interface DAO<T> {

    void insertar ( T t ) throws Exception;

    void modificar ( T t ) throws Exception;

    void eliminar ( T t ) throws Exception;

    List<T> obtenerLista ( Condition condition ) throws Exception;

}
