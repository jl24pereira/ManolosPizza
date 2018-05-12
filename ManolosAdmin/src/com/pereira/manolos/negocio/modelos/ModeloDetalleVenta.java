package com.pereira.manolos.negocio.modelos;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class ModeloDetalleVenta {

    private static final Logger LOG = Logger.getLogger (ModeloDetalleVenta.class.getName () );
    private ModeloVenta venta;
    private ModeloProducto producto;
    private ModeloPromocion promocion;
    private int cantidad;
    private BigDecimal precio;
    private String tipo;
    private boolean promo;

    public ModeloDetalleVenta () {
    }

    /**
     * @return the cantidad
     */
    public int getCantidad () {
        return cantidad;
    }

    /**
     * @return the venta
     */
    public ModeloVenta getVenta () {
        return venta;
    }

    /**
     * @return the precio
     */
    public BigDecimal getPrecio () {
        return precio;
    }

    /**
     * @return the producto
     */
    public ModeloProducto getProducto () {
        return producto;
    }

    /**
     * @return the promocion
     */
    public ModeloPromocion getPromocion () {
        return promocion;
    }

    /**
     * @return the tipo
     */
    public String getTipo () {
        return tipo;
    }

    /**
     * @return the promo
     */
    public boolean isPromo () {
        return promo;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad ( int cantidad ) {
        this.cantidad = cantidad;
    }

    /**
     * @param enta the enta to set
     */
    public void setVenta ( ModeloVenta enta ) {
        this.venta = enta;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio ( BigDecimal precio ) {
        this.precio = precio;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto ( ModeloProducto producto ) {
        this.producto = producto;
    }

    /**
     * @param promo the promo to set
     */
    public void setPromo ( boolean promo ) {
        this.promo = promo;
    }

    /**
     * @param promocion the promocion to set
     */
    public void setPromocion ( ModeloPromocion promocion ) {
        this.promocion = promocion;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo ( String tipo ) {
        this.tipo = tipo;
    }

}
