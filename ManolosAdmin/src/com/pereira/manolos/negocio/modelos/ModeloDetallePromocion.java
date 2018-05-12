package com.pereira.manolos.negocio.modelos;

import java.util.logging.Logger;

public class ModeloDetallePromocion {

    private int vCantidad;
    private ModeloProducto vProducto;
    private ModeloPromocion vPromocion;
    private String vTipo;

    private static final Logger LOG = Logger.getLogger (
            ModeloDetallePromocion.class.getName () );

    public ModeloDetallePromocion ( ModeloPromocion pPromocion ,
                                    ModeloProducto pProducto , int pCantidad ,
                                    String pTipo ) {
        this.vPromocion = pPromocion;
        this.vProducto = pProducto;
        this.vCantidad = pCantidad;
        this.vTipo = pTipo;
    }

    /**
     * @return the vCantidad
     */
    public int getCantidad () {
        return vCantidad;
    }

    /**
     * @return the vProducto
     */
    public ModeloProducto getProducto () {
        return vProducto;
    }

    /**
     * @return the vPromocion
     */
    public ModeloPromocion getPromocion () {
        return vPromocion;
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
     * @param producto the producto to set
     */
    public void setProducto (
            ModeloProducto producto ) {
        this.vProducto = producto;
    }

    /**
     * @param promocion the promocion to set
     */
    public void setPromocion (
            ModeloPromocion promocion ) {
        this.vPromocion = promocion;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo ( String tipo ) {
        this.vTipo = tipo;
    }
}
