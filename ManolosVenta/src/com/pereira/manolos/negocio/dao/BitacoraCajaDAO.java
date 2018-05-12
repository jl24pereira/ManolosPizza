package com.pereira.manolos.negocio.dao;

import com.pereira.manolos.negocio.modelos.ModeloBitacoraCaja;
import java.math.BigDecimal;
import org.jooq.Condition;

public interface BitacoraCajaDAO extends DAO<ModeloBitacoraCaja> {

    ModeloBitacoraCaja encuentraUltimaApertura ( int id ) throws Exception;

    BigDecimal buscarVentas ( ModeloBitacoraCaja apertura ) throws Exception;

    BigDecimal buscarEgresos ( ModeloBitacoraCaja apertura ) throws Exception;

    BigDecimal buscarDevoluciones ( ModeloBitacoraCaja apertura ) throws Exception;

    boolean hayCorteZ ( Condition c ) throws Exception;

    boolean hayCorteGZ ( Condition c ) throws Exception;
}
