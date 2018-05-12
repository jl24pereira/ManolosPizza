/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.modelos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author Jose Luis
 */
public class ModeloPagoCompra {

    private Date fecha;
    private ModeloCompra vCompra;
    private BigDecimal vPago;
    private static final Logger LOG = Logger.getLogger ( ModeloPagoCompra.class.
            getName () );

    public ModeloPagoCompra ( ModeloCompra pCompra , Date pFecha ,
                              BigDecimal pPago ) {
        this.vCompra = pCompra;
        this.fecha = pFecha;
        this.vPago = pPago;
    }

    /**
     * @return the vCompra
     */
    public ModeloCompra getCompra () {
        return vCompra;
    }

    /**
     * @return the fecha
     */
    public Date getFecha () {
        return fecha;
    }

    /**
     * @return the vPago
     */
    public BigDecimal getPago () {
        return vPago;
    }

    /**
     * @param compra the compra to set
     */
    public void setCompra (
            ModeloCompra compra ) {
        this.vCompra = compra;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha ( Date fecha ) {
        this.fecha = fecha;
    }

    /**
     * @param pago the pago to set
     */
    public void setPago ( BigDecimal pago ) {
        this.vPago = pago;
    }
}
