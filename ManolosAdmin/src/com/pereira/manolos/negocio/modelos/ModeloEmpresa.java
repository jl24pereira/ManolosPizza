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
public class ModeloEmpresa {

    private int idEmpresa;
    private String vDireccion;
    private String vEmail;
    private String vGiro;
    private int vHorastrabajo;
    private BigDecimal vIVA;
    private byte[] vLogo;
    private String vNIT;
    private String vNRC;
    private String vNombre;
    private String vPropietario;
    private String vTelefono;
    private static final Logger LOG = Logger.getLogger ( ModeloEmpresa.class.
            getName () );

    public ModeloEmpresa ( int pIdEmpresa , String pNombre , String pDireccion ,
                           String pTelefono , String pEmail ,
                           String pPropietario , String pGiro , String pNRC ,
                           String pNIT , BigDecimal pIVA , int pHorastrabajo ,
                           byte[] pLogo ) {
        this.idEmpresa = pIdEmpresa;
        this.vNombre = pNombre;
        this.vDireccion = pDireccion;
        this.vTelefono = pTelefono;
        this.vEmail = pEmail;
        this.vPropietario = pPropietario;
        this.vGiro = pGiro;
        this.vNRC = pNRC;
        this.vNIT = pNIT;
        this.vIVA = pIVA;
        this.vHorastrabajo = pHorastrabajo;
        this.vLogo = pLogo;
    }

    /**
     * @return the vDireccion
     */
    public String getDireccion () {
        return vDireccion;
    }

    /**
     * @return the vEmail
     */
    public String getEmail () {
        return vEmail;
    }

    /**
     * @return the vGiro
     */
    public String getGiro () {
        return vGiro;
    }

    /**
     * @return the vHorastrabajo
     */
    public int getHorastrabajo () {
        return vHorastrabajo;
    }

    /**
     * @return the vIVA
     */
    public BigDecimal getIVA () {
        return vIVA;
    }

    /**
     * @return the idEmpresa
     */
    public int getIdEmpresa () {
        return idEmpresa;
    }

    /**
     * @return the vLogo
     */
    public byte[] getLogo () {
        return vLogo;
    }

    /**
     * @return the vNIT
     */
    public String getNIT () {
        return vNIT;
    }

    /**
     * @return the vNRC
     */
    public String getNRC () {
        return vNRC;
    }

    /**
     * @return the vNombre
     */
    public String getNombre () {
        return vNombre;
    }

    /**
     * @return the vPropietario
     */
    public String getPropietario () {
        return vPropietario;
    }

    /**
     * @return the vTelefono
     */
    public String getTelefono () {
        return vTelefono;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion ( String direccion ) {
        this.vDireccion = direccion;
    }

    /**
     * @param email the email to set
     */
    public void setEmail ( String email ) {
        this.vEmail = email;
    }

    /**
     * @param giro the giro to set
     */
    public void setGiro ( String giro ) {
        this.vGiro = giro;
    }

    /**
     * @param horastrabajo the horastrabajo to set
     */
    public void setHorastrabajo ( int horastrabajo ) {
        this.vHorastrabajo = horastrabajo;
    }

    /**
     * @param IVA the IVA to set
     */
    public void setIVA ( BigDecimal IVA ) {
        this.vIVA = IVA;
    }

    /**
     * @param idEmpresa the idEmpresa to set
     */
    public void setIdEmpresa ( int idEmpresa ) {
        this.idEmpresa = idEmpresa;
    }

    /**
     * @param logo the logo to set
     */
    public void setLogo ( byte[] logo ) {
        this.vLogo = logo;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT ( String NIT ) {
        this.vNIT = NIT;
    }

    /**
     * @param NRC the NRC to set
     */
    public void setNRC ( String NRC ) {
        this.vNRC = NRC;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre ( String nombre ) {
        this.vNombre = nombre;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario ( String propietario ) {
        this.vPropietario = propietario;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono ( String telefono ) {
        this.vTelefono = telefono;
    }

}
