package com.pereira.manolos.negocio.modelos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.logging.Logger;

public class ModeloBitacoraCaja {

    private ModeloCaja vCaja;
    private String vEmplado;
    private Date vFecha;
    private String vMovimiento;
    private BigDecimal vValor;
    private String comentario;
    private static final Logger LOG = Logger.getLogger (
            ModeloBitacoraCaja.class.getName () );

    public ModeloBitacoraCaja ( ModeloCaja pCaja , String pEmplado , Date pFecha , String pMovimiento , BigDecimal pValor , String comentario ) {
        this.vCaja = pCaja;
        this.vEmplado = pEmplado;
        this.vFecha = pFecha;
        this.vMovimiento = pMovimiento;
        this.vValor = pValor;
        this.comentario = comentario;
    }

    public ModeloBitacoraCaja () {
    }

    /**
     * @return the vCaja
     */
    public ModeloCaja getCaja () {
        return vCaja;
    }

    /**
     * @return the comentario
     */
    public String getComentario () {
        return comentario;
    }

    /**
     * @return the vEmplado
     */
    public String getEmplado () {
        return vEmplado;
    }

    /**
     * @return the vFecha
     */
    public Date getFecha () {
        return vFecha;
    }

    /**
     * @return the vMovimiento
     */
    public String getMovimiento () {
        return vMovimiento;
    }

    /**
     * @return the vValor
     */
    public BigDecimal getValor () {
        return vValor;
    }

    /**
     * @param caja the caja to set
     */
    public void setCaja ( ModeloCaja caja ) {
        this.vCaja = caja;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario ( String comentario ) {
        this.comentario = comentario;
    }

    /**
     * @param emplado the emplado to set
     */
    public void setEmplado ( String emplado ) {
        this.vEmplado = emplado;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha ( Date fecha ) {
        this.vFecha = fecha;
    }

    /**
     * @param movimiento the movimiento to set
     */
    public void setMovimiento ( String movimiento ) {
        this.vMovimiento = movimiento;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor ( BigDecimal valor ) {
        this.vValor = valor;
    }

}
