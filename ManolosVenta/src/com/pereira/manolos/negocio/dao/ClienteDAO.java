package com.pereira.manolos.negocio.dao;

import com.pereira.manolos.negocio.modelos.ModeloCliente;

public interface ClienteDAO extends DAO<ModeloCliente> {

    void darBaja ( ModeloCliente m );

    void darAlta ( ModeloCliente m );

    String findNombreByID ( int id );
}
