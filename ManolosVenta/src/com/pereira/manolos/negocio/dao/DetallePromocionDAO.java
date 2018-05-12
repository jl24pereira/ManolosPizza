package com.pereira.manolos.negocio.dao;

import com.pereira.manolos.negocio.modelos.ModeloDetallePromocion;
import com.pereira.manolos.negocio.modelos.ModeloPromocion;

public interface DetallePromocionDAO extends DAO<ModeloDetallePromocion> {

    public void eliminarByPromocion ( ModeloPromocion promo ) throws Exception;
}
