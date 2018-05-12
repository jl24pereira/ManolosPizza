package com.pereira.manolos.negocio.dao;

import com.pereira.manolos.negocio.modelos.ModeloCotizacion;

public interface CotizacionDAO extends DAO<ModeloCotizacion> {

    void insertarInformal ( ModeloCotizacion t ) throws Exception;

    String getNumero () throws Exception;
}
