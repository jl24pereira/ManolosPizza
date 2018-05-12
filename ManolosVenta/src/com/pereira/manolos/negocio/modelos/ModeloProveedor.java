package com.pereira.manolos.negocio.modelos;

import java.math.BigDecimal;
import java.util.logging.Logger;

/**
 *
 * @author Jose Luis
 */
public class ModeloProveedor {

    private String VNRC;
    private BigDecimal limite;
    private boolean vBaja;
    private String vDireccion;
    private String vEmail;
    private String vGiro;
    private int vIdproveedor;
    private String vNIT;
    private String vNombre;
    private int vPlazo;
    private String vRepresentante;
    private String vTelefono;
    private String vTipoproveedor;
    private static final Logger LOG = Logger.getLogger ( ModeloProveedor.class.
            getName () );

    public ModeloProveedor ( int pIdproveedor , String pNombre ,
                             String pDireccion , String pTelefono , String pGiro ,
                             String pNIT , String pVNRC , String pEmail ,
                             String pRepresentante , String pTipoproveedor ,
                             int pPlazo , BigDecimal pLimite , boolean pBaja ) {
        this.vIdproveedor = pIdproveedor;
        this.vNombre = pNombre;
        this.vDireccion = pDireccion;
        this.vTelefono = pTelefono;
        this.vGiro = pGiro;
        this.vNIT = pNIT;
        this.VNRC = pVNRC;
        this.vEmail = pEmail;
        this.vRepresentante = pRepresentante;
        this.vTipoproveedor = pTipoproveedor;
        this.vPlazo = pPlazo;
        this.limite = pLimite;
        this.vBaja = pBaja;
    }

    public ModeloProveedor ( String pNombre , String pDireccion ,
                             String pTelefono , String pGiro , String pNIT ,
                             String pVNRC , String pEmail ,
                             String pRepresentante , String pTipoproveedor ,
                             int pPlazo , BigDecimal pLimite ) {
        this.vNombre = pNombre;
        this.vDireccion = pDireccion;
        this.vTelefono = pTelefono;
        this.vGiro = pGiro;
        this.vNIT = pNIT;
        this.VNRC = pVNRC;
        this.vEmail = pEmail;
        this.vRepresentante = pRepresentante;
        this.vTipoproveedor = pTipoproveedor;
        this.vPlazo = pPlazo;
        this.limite = pLimite;
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
     * @return the vIdproveedor
     */
    public int getIdproveedor () {
        return vIdproveedor;
    }

    /**
     * @return the limite
     */
    public BigDecimal getLimite () {
        return limite;
    }

    /**
     * @return the vNIT
     */
    public String getNIT () {
        return vNIT;
    }

    /**
     * @return the vNombre
     */
    public String getNombre () {
        return vNombre;
    }

    /**
     * @return the vPlazo
     */
    public int getPlazo () {
        return vPlazo;
    }

    /**
     * @return the vRepresentante
     */
    public String getRepresentante () {
        return vRepresentante;
    }

    /**
     * @return the vTelefono
     */
    public String getTelefono () {
        return vTelefono;
    }

    /**
     * @return the vTipoproveedor
     */
    public String getTipoproveedor () {
        return vTipoproveedor;
    }

    /**
     * @return the VNRC
     */
    public String getVNRC () {
        return VNRC;
    }

    /**
     * @return the vBaja
     */
    public boolean isBaja () {
        return vBaja;
    }

    /**
     * @param baja the baja to set
     */
    public void setBaja ( boolean baja ) {
        this.vBaja = baja;
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
     * @param idproveedor the idproveedor to set
     */
    public void setIdproveedor ( int idproveedor ) {
        this.vIdproveedor = idproveedor;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite ( BigDecimal limite ) {
        this.limite = limite;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT ( String NIT ) {
        this.vNIT = NIT;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre ( String nombre ) {
        this.vNombre = nombre;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo ( int plazo ) {
        this.vPlazo = plazo;
    }

    /**
     * @param representante the representante to set
     */
    public void setRepresentante ( String representante ) {
        this.vRepresentante = representante;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono ( String telefono ) {
        this.vTelefono = telefono;
    }

    /**
     * @param tipoproveedor the tipoproveedor to set
     */
    public void setTipoproveedor ( String tipoproveedor ) {
        this.vTipoproveedor = tipoproveedor;
    }

    /**
     * @param VNRC the VNRC to set
     */
    public void setVNRC ( String VNRC ) {
        this.VNRC = VNRC;
    }

}
