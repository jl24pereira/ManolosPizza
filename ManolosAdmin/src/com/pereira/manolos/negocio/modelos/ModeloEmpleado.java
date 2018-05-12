package com.pereira.manolos.negocio.modelos;

import java.util.logging.Logger;

public class ModeloEmpleado {

    private boolean baja;
    private String vDUI;
    private String vDireccion;
    private String vEmail;
    private int vIdempleado;
    private String vNIT;
    private String vNombre;
    private ModeloPuesto vPuesto;
    private String vTelefono;
    private static final Logger LOG = Logger.getLogger ( ModeloEmpleado.class.
            getName () );

    public ModeloEmpleado ( int pIdempleado , String pNombre , String pTelefono , String pDireccion , String pEmail , String pDUI , String pNIT ,
                            ModeloPuesto pPuesto , boolean pBaja ) {
        this.vIdempleado = pIdempleado;
        this.vNombre = pNombre;
        this.vTelefono = pTelefono;
        this.vDireccion = pDireccion;
        this.vEmail = pEmail;
        this.vDUI = pDUI;
        this.vNIT = pNIT;
        this.vPuesto = pPuesto;
        this.baja = pBaja;
    }

    public ModeloEmpleado ( String pNombre , String pTelefono , String pDireccion , String pEmail , String pDUI , String pNIT , ModeloPuesto pPuesto ) {
        this.vNombre = pNombre;
        this.vTelefono = pTelefono;
        this.vDireccion = pDireccion;
        this.vEmail = pEmail;
        this.vDUI = pDUI;
        this.vNIT = pNIT;
        this.vPuesto = pPuesto;
    }

    /**
     * @return the vDUI
     */
    public String getDUI () {
        return vDUI;
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
     * @return the vIdempleado
     */
    public int getIdempleado () {
        return vIdempleado;
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
     * @return the vPuesto
     */
    public ModeloPuesto getPuesto () {
        return vPuesto;
    }

    /**
     * @return the vTelefono
     */
    public String getTelefono () {
        return vTelefono;
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
     * @param DUI the DUI to set
     */
    public void setDUI ( String DUI ) {
        this.vDUI = DUI;
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
     * @param idempleado the idempleado to set
     */
    public void setIdempleado ( int idempleado ) {
        this.vIdempleado = idempleado;
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
     * @param puesto the puesto to set
     */
    public void setPuesto (
            ModeloPuesto puesto ) {
        this.vPuesto = puesto;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono ( String telefono ) {
        this.vTelefono = telefono;
    }

}
