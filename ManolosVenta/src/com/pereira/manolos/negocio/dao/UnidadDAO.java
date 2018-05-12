package com.pereira.manolos.negocio.dao;

import com.pereira.manolos.negocio.modelos.ModeloUnidad;

public interface UnidadDAO extends DAO<ModeloUnidad> {

    String getUnidadByID ( int id ) throws Exception;
}
