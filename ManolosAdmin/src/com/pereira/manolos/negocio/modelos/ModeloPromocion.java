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
public class ModeloPromocion {

    private int idpromocion;
    private String nombre;
    private BigDecimal costo;
    private BigDecimal precio;
    private String tipo;
    private byte[] imagen;
    private boolean lunes;
    private boolean martes;
    private boolean miercoles;
    private boolean jueves;
    private boolean viernes;
    private boolean sabado;
    private boolean domingo;

    private static final Logger LOG = Logger.getLogger ( ModeloPromocion.class.getName () );

    public ModeloPromocion ( String pNombre , BigDecimal pCosto , BigDecimal pPrecio , String pTipo , byte[] imagen , boolean pLunes , boolean pMartes ,
                             boolean pMiercoles , boolean pJueves , boolean pIernes , boolean pSabado , boolean pDomingo ) {
        this.nombre = pNombre;
        this.costo = pCosto;
        this.precio = pPrecio;
        this.tipo = pTipo;
        this.imagen = imagen;
        this.lunes = pLunes;
        this.martes = pMartes;
        this.miercoles = pMiercoles;
        this.jueves = pJueves;
        this.viernes = pIernes;
        this.sabado = pSabado;
        this.domingo = pDomingo;
    }

    public ModeloPromocion ( int pIdpromocion , String pNombre , BigDecimal pCosto , BigDecimal pPrecio , String pTipo , byte[] imagen ,
                             boolean pLunes , boolean pMartes , boolean pMiercoles , boolean pJueves , boolean pIernes , boolean pSabado ,
                             boolean pDomingo ) {
        this.idpromocion = pIdpromocion;
        this.nombre = pNombre;
        this.costo = pCosto;
        this.precio = pPrecio;
        this.tipo = pTipo;
        this.imagen = imagen;
        this.lunes = pLunes;
        this.martes = pMartes;
        this.miercoles = pMiercoles;
        this.jueves = pJueves;
        this.viernes = pIernes;
        this.sabado = pSabado;
        this.domingo = pDomingo;
    }

    /**
     * @return the costo
     */
    public BigDecimal getCosto () {
        return costo;
    }

    /**
     * @return the idpromocion
     */
    public int getIdpromocion () {
        return idpromocion;
    }

    /**
     * @return the imagen
     */
    public byte[] getImagen () {
        return imagen;
    }

    /**
     * @return the nombre
     */
    public String getNombre () {
        return nombre;
    }

    /**
     * @return the precio
     */
    public BigDecimal getPrecio () {
        return precio;
    }

    /**
     * @return the tipo
     */
    public String getTipo () {
        return tipo;
    }

    /**
     * @return the domingo
     */
    public boolean isDomingo () {
        return domingo;
    }

    /**
     * @return the viernes
     */
    public boolean isViernes () {
        return viernes;
    }

    /**
     * @return the jueves
     */
    public boolean isJueves () {
        return jueves;
    }

    /**
     * @return the lunes
     */
    public boolean isLunes () {
        return lunes;
    }

    /**
     * @return the martes
     */
    public boolean isMartes () {
        return martes;
    }

    /**
     * @return the miercoles
     */
    public boolean isMiercoles () {
        return miercoles;
    }

    /**
     * @return the sabado
     */
    public boolean isSabado () {
        return sabado;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto ( BigDecimal costo ) {
        this.costo = costo;
    }

    /**
     * @param domingo the domingo to set
     */
    public void setDomingo ( boolean domingo ) {
        this.domingo = domingo;
    }

    /**
     * @param idpromocion the idpromocion to set
     */
    public void setIdpromocion ( int idpromocion ) {
        this.idpromocion = idpromocion;
    }

    /**
     * @param iernes the iernes to set
     */
    public void setViernes ( boolean iernes ) {
        this.viernes = iernes;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen ( byte[] imagen ) {
        this.imagen = imagen;
    }

    /**
     * @param jueves the jueves to set
     */
    public void setJueves ( boolean jueves ) {
        this.jueves = jueves;
    }

    /**
     * @param lunes the lunes to set
     */
    public void setLunes ( boolean lunes ) {
        this.lunes = lunes;
    }

    /**
     * @param martes the martes to set
     */
    public void setMartes ( boolean martes ) {
        this.martes = martes;
    }

    /**
     * @param miercoles the miercoles to set
     */
    public void setMiercoles ( boolean miercoles ) {
        this.miercoles = miercoles;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre ( String nombre ) {
        this.nombre = nombre;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio ( BigDecimal precio ) {
        this.precio = precio;
    }

    /**
     * @param sabado the sabado to set
     */
    public void setSabado ( boolean sabado ) {
        this.sabado = sabado;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo ( String tipo ) {
        this.tipo = tipo;
    }

}
