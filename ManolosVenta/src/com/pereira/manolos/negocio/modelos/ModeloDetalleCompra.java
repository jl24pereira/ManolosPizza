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
public class ModeloDetalleCompra {

    private double vCantidad;
    private ModeloCompra vCompra;
    private ModeloInsumo vInsumo;
    private BigDecimal vPrecio;
    private static final Logger LOG = Logger.getLogger (
            ModeloDetalleCompra.class.getName () );

    public ModeloDetalleCompra ( ModeloCompra pCompra , ModeloInsumo pInsumo ,
                                 double pCantidad , BigDecimal pPrecio ) {
        this.vCompra = pCompra;
        this.vInsumo = pInsumo;
        this.vCantidad = pCantidad;
        this.vPrecio = pPrecio;
    }

    /**
     * @return the vCantidad
     */
    public double getCantidad () {
        return vCantidad;
    }

    /**
     * @return the vCompra
     */
    public ModeloCompra getCompra () {
        return vCompra;
    }

    /**
     * @return the vInsumo
     */
    public ModeloInsumo getInsumo () {
        return vInsumo;
    }

    /**
     * @return the vPrecio
     */
    public BigDecimal getPrecio () {
        return vPrecio;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad ( double cantidad ) {
        this.vCantidad = cantidad;
    }

    /**
     * @param compra the compra to set
     */
    public void setCompra (
            ModeloCompra compra ) {
        this.vCompra = compra;
    }

    /**
     * @param insumo the insumo to set
     */
    public void setInsumo (
            ModeloInsumo insumo ) {
        this.vInsumo = insumo;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio ( BigDecimal precio ) {
        this.vPrecio = precio;
    }
}
