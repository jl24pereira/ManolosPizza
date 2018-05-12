package com.pereira.manolos.negocio.dao;

import com.pereira.manolos.negocio.modelos.ModeloInsumo;

public interface InsumoDAO extends DAO<ModeloInsumo> {

    void descontarInsumo ( ModeloInsumo insumo , double descuento ) throws Exception;

    ModeloInsumo findByID ( int id ) throws Exception;
}
