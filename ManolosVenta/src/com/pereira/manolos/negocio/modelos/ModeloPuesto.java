package com.pereira.manolos.negocio.modelos;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class ModeloPuesto {

    private int vDiaslaborales;

    private int vIdpuesto;
    private boolean vMOD;
    private String vNombre;
    private BigDecimal vSalariodia;
    private static final Logger LOG = Logger.getLogger ( ModeloPuesto.class.
            getName () );

    public ModeloPuesto ( int pIdpuesto , String pNombre ,
                          BigDecimal pSalariodia , int pDiaslaborales ,
                          boolean pMOD ) {
        this.vIdpuesto = pIdpuesto;
        this.vNombre = pNombre;
        this.vSalariodia = pSalariodia;
        this.vDiaslaborales = pDiaslaborales;
        this.vMOD = pMOD;
    }

    public ModeloPuesto ( String pNombre , BigDecimal pSalariodia ,
                          int pDiaslaborales , boolean pMOD ) {
        this.vNombre = pNombre;
        this.vSalariodia = pSalariodia;
        this.vDiaslaborales = pDiaslaborales;
        this.vMOD = pMOD;
    }

    /**
     * @return the vDiaslaborales
     */
    public int getDiaslaborales () {
        return vDiaslaborales;
    }

    /**
     * @return the vIdpuesto
     */
    public int getIdpuesto () {
        return vIdpuesto;
    }

    /**
     * @return the vNombre
     */
    public String getNombre () {
        return vNombre;
    }

    /**
     * @return the vSalariodia
     */
    public BigDecimal getSalariodia () {
        return vSalariodia;
    }

    /**
     * @return the vMOD
     */
    public boolean isMOD () {
        return vMOD;
    }

    /**
     * @param diaslaborales the diaslaborales to set
     */
    public void setDiaslaborales ( int diaslaborales ) {
        this.vDiaslaborales = diaslaborales;
    }

    /**
     * @param idpuesto the idpuesto to set
     */
    public void setIdpuesto ( int idpuesto ) {
        this.vIdpuesto = idpuesto;
    }

    /**
     * @param MOD the MOD to set
     */
    public void setMOD ( boolean MOD ) {
        this.vMOD = MOD;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre ( String nombre ) {
        this.vNombre = nombre;
    }

    /**
     * @param salariodia the salariodia to set
     */
    public void setSalariodia ( BigDecimal salariodia ) {
        this.vSalariodia = salariodia;
    }

    @Override
    public String toString () {
        return vNombre;
    }

}
