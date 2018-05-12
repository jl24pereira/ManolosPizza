/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.modelos;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author Jose Luis
 */
public class ModeloResolucion {

    private boolean activa;
    private ModeloCaja caja;
    private Date fecha;
    private int idresolucion;
    private String resolucion;
    private String serie;
    private int tktactual;
    private int tktalerta;
    private int tktfinal;
    private int tktinicial;
    private static final Logger LOG = Logger.getLogger ( ModeloResolucion.class.getName () );

    public ModeloResolucion ( int pIdresolucion , String pResolucion , int pTktinicial , int pTktfinal , int pTktactual , int pTktalerta ,
                              String pSerie , Date pFecha , ModeloCaja pCaja , boolean pActiva ) {
        this.idresolucion = pIdresolucion;
        this.resolucion = pResolucion;
        this.tktinicial = pTktinicial;
        this.tktfinal = pTktfinal;
        this.tktactual = pTktactual;
        this.tktalerta = pTktalerta;
        this.serie = pSerie;
        this.fecha = pFecha;
        this.caja = pCaja;
        this.activa = pActiva;
    }

    public ModeloResolucion ( String pResolucion , int pTktinicial , int pTktfinal , int pTktactual , int pTktalerta , String pSerie , Date pFecha ,
                              ModeloCaja pCaja , boolean pActiva ) {
        this.resolucion = pResolucion;
        this.tktinicial = pTktinicial;
        this.tktfinal = pTktfinal;
        this.tktactual = pTktactual;
        this.tktalerta = pTktalerta;
        this.serie = pSerie;
        this.fecha = pFecha;
        this.caja = pCaja;
    }

    public ModeloResolucion () {
    }

    /**
     * @return the caja
     */
    public ModeloCaja getCaja () {
        return caja;
    }

    /**
     * @return the fecha
     */
    public Date getFecha () {
        return fecha;
    }

    /**
     * @return the idresolucion
     */
    public int getIdresolucion () {
        return idresolucion;
    }

    /**
     * @return the resolucion
     */
    public String getResolucion () {
        return resolucion;
    }

    /**
     * @return the serie
     */
    public String getSerie () {
        return serie;
    }

    /**
     * @return the tktactual
     */
    public int getTktactual () {
        return tktactual;
    }

    /**
     * @return the tktalerta
     */
    public int getTktalerta () {
        return tktalerta;
    }

    /**
     * @return the tktfinal
     */
    public int getTktfinal () {
        return tktfinal;
    }

    /**
     * @return the tktinicial
     */
    public int getTktinicial () {
        return tktinicial;
    }

    /**
     * @return the activa
     */
    public boolean isActiva () {
        return activa;
    }

    /**
     * @param activa the activa to set
     */
    public void setActiva ( boolean activa ) {
        this.activa = activa;
    }

    /**
     * @param caja the caja to set
     */
    public void setCaja ( ModeloCaja caja ) {
        this.caja = caja;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha ( Date fecha ) {
        this.fecha = fecha;
    }

    /**
     * @param idresolucion the idresolucion to set
     */
    public void setIdresolucion ( int idresolucion ) {
        this.idresolucion = idresolucion;
    }

    /**
     * @param resolucion the resolucion to set
     */
    public void setResolucion ( String resolucion ) {
        this.resolucion = resolucion;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie ( String serie ) {
        this.serie = serie;
    }

    /**
     * @param tktactual the tktactual to set
     */
    public void setTktactual ( int tktactual ) {
        this.tktactual = tktactual;
    }

    /**
     * @param tktalerta the tktalerta to set
     */
    public void setTktalerta ( int tktalerta ) {
        this.tktalerta = tktalerta;
    }

    /**
     * @param tktfinal the tktfinal to set
     */
    public void setTktfinal ( int tktfinal ) {
        this.tktfinal = tktfinal;
    }

    /**
     * @param tktinicial the tktinicial to set
     */
    public void setTktinicial ( int tktinicial ) {
        this.tktinicial = tktinicial;
    }

}
