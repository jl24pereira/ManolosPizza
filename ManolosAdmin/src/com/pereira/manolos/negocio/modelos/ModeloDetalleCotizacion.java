package com.pereira.manolos.negocio.modelos;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class ModeloDetalleCotizacion {

    private int vCantidad;
    private ModeloCotizacion vCotizacion;
    private BigDecimal vPrecio;
    private ModeloProducto vProducto;
    private String vTipo;
    private static final Logger LOG = Logger.getLogger (
            ModeloDetalleCotizacion.class.getName () );

    public ModeloDetalleCotizacion ( ModeloCotizacion pCotizacion ,
                                     ModeloProducto pProducto , int pCantidad ,
                                     BigDecimal pPrecio , String pTipo ) {
        this.vCotizacion = pCotizacion;
        this.vProducto = pProducto;
        this.vCantidad = pCantidad;
        this.vPrecio = pPrecio;
        this.vTipo = pTipo;
    }

    public ModeloDetalleCotizacion ( ModeloProducto pProducto , int pCantidad ,
                                     BigDecimal pPrecio , String pTipo ) {
        this.vProducto = pProducto;
        this.vCantidad = pCantidad;
        this.vPrecio = pPrecio;
        this.vTipo = pTipo;
    }

    /**
     * @return the vCantidad
     */
    public int getCantidad () {
        return vCantidad;
    }

    /**
     * @return the vCotizacion
     */
    public ModeloCotizacion getCotizacion () {
        return vCotizacion;
    }

    /**
     * @return the vPrecio
     */
    public BigDecimal getPrecio () {
        return vPrecio;
    }

    /**
     * @return the vProducto
     */
    public ModeloProducto getProducto () {
        return vProducto;
    }

    /**
     * @return the vTipo
     */
    public String getTipo () {
        return vTipo;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad ( int cantidad ) {
        this.vCantidad = cantidad;
    }

    /**
     * @param cotizacion the cotizacion to set
     */
    public void setCotizacion (
            ModeloCotizacion cotizacion ) {
        this.vCotizacion = cotizacion;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio ( BigDecimal precio ) {
        this.vPrecio = precio;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto (
            ModeloProducto producto ) {
        this.vProducto = producto;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo ( String tipo ) {
        this.vTipo = tipo;
    }

}
