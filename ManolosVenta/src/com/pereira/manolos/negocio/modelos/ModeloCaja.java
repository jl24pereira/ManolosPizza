package com.pereira.manolos.negocio.modelos;

import java.util.logging.Logger;

public class ModeloCaja {

    private boolean vBaja;
    private String vDetalle;
    private boolean vEstado;
    private int vIdcaja;

    private String vIpCaja;
    private static final Logger LOG = Logger.getLogger(ModeloCaja.class.
            getName());

    public ModeloCaja(boolean pBaja, String pDetalle, boolean pEstado,
            String pIpCaja) {
        this.vBaja = pBaja;
        this.vDetalle = pDetalle;
        this.vEstado = pEstado;
        this.vIpCaja = pIpCaja;
    }

    public ModeloCaja(boolean pBaja, String pDetalle, boolean pEstado,
            int pIdcaja, String pIpCaja) {
        this.vBaja = pBaja;
        this.vDetalle = pDetalle;
        this.vEstado = pEstado;
        this.vIdcaja = pIdcaja;
        this.vIpCaja = pIpCaja;
    }

    public ModeloCaja(String vDetalle, String vIpCaja) {
        this.vDetalle = vDetalle;
        this.vIpCaja = vIpCaja;
    }

    /**
     * @return the vDetalle
     */
    public String getDetalle() {
        return vDetalle;
    }

    /**
     * @return the vIdcaja
     */
    public int getIdcaja() {
        return vIdcaja;
    }

    /**
     * @return the vIpCaja
     */
    public String getIpCaja() {
        return vIpCaja;
    }

    /**
     * @return the vBaja
     */
    public boolean isBaja() {
        return vBaja;
    }

    /**
     * @return the vEstado
     */
    public boolean isEstado() {
        return vEstado;
    }

    /**
     * @param baja the baja to set
     */
    public void setBaja(boolean baja) {
        this.vBaja = baja;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(String detalle) {
        this.vDetalle = detalle;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.vEstado = estado;
    }

    /**
     * @param idcaja the idcaja to set
     */
    public void setIdcaja(int idcaja) {
        this.vIdcaja = idcaja;
    }

    /**
     * @param ipCaja the ipCaja to set
     */
    public void setIpCaja(String ipCaja) {
        this.vIpCaja = ipCaja;
    }

    @Override
    public String toString() {
        return vDetalle;
    }
}
