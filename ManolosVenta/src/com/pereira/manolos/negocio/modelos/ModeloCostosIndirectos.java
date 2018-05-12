/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.modelos;

import java.math.BigDecimal;
import java.util.logging.Logger;

/**
 *
 * @author Jose Luis
 */
public class ModeloCostosIndirectos {

    private String rubro;
    private BigDecimal vCosto;
    private int vIdcosto;
    private static final Logger LOG = Logger.getLogger (
            ModeloCostosIndirectos.class.getName () );

    public ModeloCostosIndirectos ( String pRubro , BigDecimal pCosto ) {
        this.rubro = pRubro;
        this.vCosto = pCosto;
    }

    public ModeloCostosIndirectos ( int pIdcosto , String pRubro ,
                                    BigDecimal pCosto ) {
        this.vIdcosto = pIdcosto;
        this.rubro = pRubro;
        this.vCosto = pCosto;
    }

    /**
     * @return the vCosto
     */
    public BigDecimal getCosto () {
        return vCosto;
    }

    /**
     * @return the vIdcosto
     */
    public int getIdcosto () {
        return vIdcosto;
    }

    /**
     * @return the rubro
     */
    public String getRubro () {
        return rubro;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto ( BigDecimal costo ) {
        this.vCosto = costo;
    }

    /**
     * @param idcosto the idcosto to set
     */
    public void setIdcosto ( int idcosto ) {
        this.vIdcosto = idcosto;
    }

    /**
     * @param rubro the rubro to set
     */
    public void setRubro ( String rubro ) {
        this.rubro = rubro;
    }
}
