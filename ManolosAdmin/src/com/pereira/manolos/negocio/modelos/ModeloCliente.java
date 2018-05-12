package com.pereira.manolos.negocio.modelos;

import java.util.logging.Logger;

public class ModeloCliente {

    private boolean vBaja;
    private String vDireccion;
    private String vEmail;
    private int vIdcliente;
    private String vNombre;
    private String vTelefono;
    private String vTipo;
    private String dui;
    private static final Logger LOG = Logger.getLogger ( ModeloCliente.class.
            getName () );

    public ModeloCliente ( int pIdcliente , String pNombre , String pDireccion , String pTelefono , String pEmail , String pTipo , boolean pBaja ,
                           String dui ) {
        this.vIdcliente = pIdcliente;
        this.vNombre = pNombre;
        this.vDireccion = pDireccion;
        this.vTelefono = pTelefono;
        this.vEmail = pEmail;
        this.vTipo = pTipo;
        this.vBaja = pBaja;
        this.dui = dui;
    }

    public ModeloCliente ( String pNombre , String pDireccion , String pTelefono , String pEmail , String pTipo , String dui ) {
        this.vNombre = pNombre;
        this.vDireccion = pDireccion;
        this.vTelefono = pTelefono;
        this.vEmail = pEmail;
        this.vTipo = pTipo;
        this.dui = dui;
    }

    /**
     * @return the vDireccion
     */
    public String getDireccion () {
        return vDireccion;
    }

    /**
     * @return the dui
     */
    public String getDui () {
        return dui;
    }

    /**
     * @return the vEmail
     */
    public String getEmail () {
        return vEmail;
    }

    /**
     * @return the vIdcliente
     */
    public int getIdcliente () {
        return vIdcliente;
    }

    /**
     * @return the vNombre
     */
    public String getNombre () {
        return vNombre;
    }

    /**
     * @return the vTelefono
     */
    public String getTelefono () {
        return vTelefono;
    }

    /**
     * @return the vTipo
     */
    public String getTipo () {
        return vTipo;
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
     * @param dui the dui to set
     */
    public void setDui ( String dui ) {
        this.dui = dui;
    }

    /**
     * @param email the email to set
     */
    public void setEmail ( String email ) {
        this.vEmail = email;
    }

    /**
     * @param idcliente the idcliente to set
     */
    public void setIdcliente ( int idcliente ) {
        this.vIdcliente = idcliente;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre ( String nombre ) {
        this.vNombre = nombre;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono ( String telefono ) {
        this.vTelefono = telefono;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo ( String tipo ) {
        this.vTipo = tipo;
    }

}
