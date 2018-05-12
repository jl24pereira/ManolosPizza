package com.pereira.manolos.negocio.modelos;

import java.util.logging.Logger;

public class ModeloDetalleReceta {

    private String nombre;
    private double vDescargo;
    private ModeloInsumo vIngredienteInsumo;
    private ModeloReceta vIngredienteReceta;
    private ModeloReceta vReceta;
    private String vTipo;
    private ModeloUnidad vUnidad;
    private static final Logger LOG = Logger.getLogger ( ModeloDetalleReceta.class.getName () );

    public ModeloDetalleReceta ( ModeloReceta pReceta , ModeloInsumo pIngredienteInsumo , double pDescargo , ModeloUnidad pUnidad , String pTipo ,
                                 ModeloReceta pIngredienteReceta ) {
        this.vReceta = pReceta;
        this.vIngredienteInsumo = pIngredienteInsumo;
        this.vDescargo = pDescargo;
        this.vUnidad = pUnidad;
        this.vTipo = pTipo;
        this.vIngredienteReceta = pIngredienteReceta;
    }

    public ModeloDetalleReceta () {
    }

    /**
     * @return the vDescargo
     */
    public double getDescargo () {
        return vDescargo;
    }

    /**
     * @return the vIngredienteInsumo
     */
    public ModeloInsumo getIngredienteInsumo () {
        return vIngredienteInsumo;
    }

    /**
     * @return the vIngredienteReceta
     */
    public ModeloReceta getIngredienteReceta () {
        return vIngredienteReceta;
    }

    /**
     * @return the nombre
     */
    public String getNombre () {
        return nombre;
    }

    /**
     * @return the vReceta
     */
    public ModeloReceta getReceta () {
        return vReceta;
    }

    /**
     * @return the vTipo
     */
    public String getTipo () {
        return vTipo;
    }

    /**
     * @return the vUnidad
     */
    public ModeloUnidad getUnidad () {
        return vUnidad;
    }

    /**
     * @param descargo the descargo to set
     */
    public void setDescargo ( double descargo ) {
        this.vDescargo = descargo;
    }

    /**
     * @param ingredienteInsumo the ingredienteInsumo to set
     */
    public void setIngredienteInsumo (
            ModeloInsumo ingredienteInsumo ) {
        this.vIngredienteInsumo = ingredienteInsumo;
    }

    /**
     * @param ingredienteReceta the ingredienteReceta to set
     */
    public void setIngredienteReceta (
            ModeloReceta ingredienteReceta ) {
        this.vIngredienteReceta = ingredienteReceta;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre ( String nombre ) {
        this.nombre = nombre;
    }

    /**
     * @param receta the receta to set
     */
    public void setReceta (
            ModeloReceta receta ) {
        this.vReceta = receta;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo ( String tipo ) {
        this.vTipo = tipo;
    }

    /**
     * @param unidad the unidad to set
     */
    public void setUnidad (
            ModeloUnidad unidad ) {
        this.vUnidad = unidad;
    }

}
