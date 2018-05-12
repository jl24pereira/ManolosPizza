/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.modelos;

import java.util.Date;

/**
 *
 * @author Jose Luis
 */
public class ModeloMovimientoCaja {

    private ModeloCaja vCaja;
    private Date vApertura;
    private Date vCierre;

    public ModeloMovimientoCaja ( ModeloCaja pCaja , Date pApertura ,
                                  Date pCierre ) {
        this.vCaja = pCaja;
        this.vApertura = pApertura;
        this.vCierre = pCierre;
    }

    /**
     * @return the vApertura
     */
    public Date getApertura () {
        return vApertura;
    }

    /**
     * @return the vCaja
     */
    public ModeloCaja getCaja () {
        return vCaja;
    }

    /**
     * @return the vCierre
     */
    public Date getCierre () {
        return vCierre;
    }

    /**
     * @param apertura the apertura to set
     */
    public void setApertura ( Date apertura ) {
        this.vApertura = apertura;
    }

    /**
     * @param caja the caja to set
     */
    public void setCaja ( ModeloCaja caja ) {
        this.vCaja = caja;
    }

    /**
     * @param cierre the cierre to set
     */
    public void setCierre ( Date cierre ) {
        this.vCierre = cierre;
    }

}
