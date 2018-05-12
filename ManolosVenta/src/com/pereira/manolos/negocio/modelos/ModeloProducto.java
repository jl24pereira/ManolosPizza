package com.pereira.manolos.negocio.modelos;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class ModeloProducto {

    private int idproducto;
    private String nombre;
    private String detalle;
    private ModeloCategoriaProducto categoria;
    private byte[] imagen;
    private boolean baja;
    private String tipo;
    private String tipoventa;
    private BigDecimal precio;
    private ModeloReceta receta;
    private ModeloInsumo insumo;
    private int porciones;
    private double descuento;
    private double stock;

    public ModeloProducto () {
    }

    public ModeloProducto ( int pIdproducto , String pNombre , String pDetalle , ModeloCategoriaProducto pCategoria , byte[] pImagen , boolean pBaja ,
                            String pTipo , String pTipoventa , BigDecimal pPrecio , ModeloReceta pReceta , ModeloInsumo pInsumo , int pPorciones ,
                            double pDescuento , double pStock ) {
        this.idproducto = pIdproducto;
        this.nombre = pNombre;
        this.detalle = pDetalle;
        this.categoria = pCategoria;
        this.imagen = pImagen;
        this.baja = pBaja;
        this.tipo = pTipo;
        this.tipoventa = pTipoventa;
        this.precio = pPrecio;
        this.receta = pReceta;
        this.insumo = pInsumo;
        this.porciones = pPorciones;
        this.descuento = pDescuento;
        this.stock = pStock;
    }

    public ModeloProducto ( String pNombre , String pDetalle , ModeloCategoriaProducto pCategoria , byte[] pImagen , boolean pBaja , String pTipo ,
                            String pTipoventa , BigDecimal pPrecio , ModeloReceta pReceta , ModeloInsumo pInsumo , int pPorciones , double pDescuento ,
                            double pStock ) {
        this.nombre = pNombre;
        this.detalle = pDetalle;
        this.categoria = pCategoria;
        this.imagen = pImagen;
        this.baja = pBaja;
        this.tipo = pTipo;
        this.tipoventa = pTipoventa;
        this.precio = pPrecio;
        this.receta = pReceta;
        this.insumo = pInsumo;
        this.porciones = pPorciones;
        this.descuento = pDescuento;
        this.stock = pStock;
    }

    /**
     * @return the categoria
     */
    public ModeloCategoriaProducto getCategoria () {
        return categoria;
    }

    /**
     * @return the descuento
     */
    public double getDescuento () {
        return descuento;
    }

    /**
     * @return the detalle
     */
    public String getDetalle () {
        return detalle;
    }

    /**
     * @return the idproducto
     */
    public int getIdproducto () {
        return idproducto;
    }

    /**
     * @return the imagen
     */
    public byte[] getImagen () {
        return imagen;
    }

    /**
     * @return the insumo
     */
    public ModeloInsumo getInsumo () {
        return insumo;
    }

    /**
     * @return the nombre
     */
    public String getNombre () {
        return nombre;
    }

    /**
     * @return the porciones
     */
    public int getPorciones () {
        return porciones;
    }

    /**
     * @return the precio
     */
    public BigDecimal getPrecio () {
        return precio;
    }

    /**
     * @return the receta
     */
    public ModeloReceta getReceta () {
        return receta;
    }

    /**
     * @return the stock
     */
    public double getStock () {
        return stock;
    }

    /**
     * @return the tipo
     */
    public String getTipo () {
        return tipo;
    }

    /**
     * @return the tipoventa
     */
    public String getTipoventa () {
        return tipoventa;
    }

    /**
     * @return the baja
     */
    public boolean isBaja () {
        return baja;
    }

    /**
     * @param baja the baja to set
     */
    public void setBaja ( boolean baja ) {
        this.baja = baja;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria ( ModeloCategoriaProducto categoria ) {
        this.categoria = categoria;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento ( double descuento ) {
        this.descuento = descuento;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle ( String detalle ) {
        this.detalle = detalle;
    }

    /**
     * @param idproducto the idproducto to set
     */
    public void setIdproducto ( int idproducto ) {
        this.idproducto = idproducto;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen ( byte[] imagen ) {
        this.imagen = imagen;
    }

    /**
     * @param insumo the insumo to set
     */
    public void setInsumo ( ModeloInsumo insumo ) {
        this.insumo = insumo;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre ( String nombre ) {
        this.nombre = nombre;
    }

    /**
     * @param porciones the porciones to set
     */
    public void setPorciones ( int porciones ) {
        this.porciones = porciones;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio ( BigDecimal precio ) {
        this.precio = precio;
    }

    /**
     * @param receta the receta to set
     */
    public void setReceta ( ModeloReceta receta ) {
        this.receta = receta;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock ( double stock ) {
        this.stock = stock;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo ( String tipo ) {
        this.tipo = tipo;
    }

    /**
     * @param tipoventa the tipoventa to set
     */
    public void setTipoventa ( String tipoventa ) {
        this.tipoventa = tipoventa;
    }

    private static final Logger LOG = Logger.getLogger ( ModeloProducto.class.getName () );

}
