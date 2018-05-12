package com.pereira.manolos.negocio.dao;

import com.pereira.manolos.negocio.modelos.ModeloCaja;

public interface CajaDAO extends DAO<ModeloCaja> {

    ModeloCaja findByIp(String ip) throws Exception;

    boolean isOpen(ModeloCaja caja) throws Exception;

    boolean isCaja(String ip) throws Exception;
}
