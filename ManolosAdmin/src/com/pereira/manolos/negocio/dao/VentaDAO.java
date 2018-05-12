package com.pereira.manolos.negocio.dao;

import com.pereira.manolos.negocio.modelos.ModeloResolucion;
import com.pereira.manolos.negocio.modelos.ModeloVenta;

public interface VentaDAO extends DAO<ModeloVenta> {

    void insertarSinCliente ( ModeloVenta t ) throws Exception;

    String getTicket ( ModeloResolucion resolucion );

    ModeloVenta getVentaByTicket ( String ticket ) throws Exception;
}
