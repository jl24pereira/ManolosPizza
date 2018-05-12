package com.pereira.manolos.negocio.modelos;

import java.util.logging.Logger;

public class ModeloUnidad {

    private String vDetalle;
    private double vEquivalencia;
    private int vIdunidad;
    private ModeloMedida vMedida;
    private ModeloUnidad vUnidadPadre;
    private static final Logger LOG = Logger.getLogger ( ModeloUnidad.class.
            getName () );

    public ModeloUnidad ( int idunidad , String unidad , ModeloMedida medida , ModeloUnidad unidadpadre , double equivalencia ) {
        this.vIdunidad = idunidad;
        this.vDetalle = unidad;
        this.vMedida = medida;
        this.vUnidadPadre = unidadpadre;
        this.vEquivalencia = equivalencia;
    }

    public ModeloUnidad ( int idunidad , String unidad , ModeloMedida medida , double equivalencia ) {
        this.vIdunidad = idunidad;
        this.vDetalle = unidad;
        this.vMedida = medida;
        this.vEquivalencia = equivalencia;
    }

    /**
     * @return the vDetalle
     */
    public String getDetalle () {
        return vDetalle;
    }

    /**
     * @return the vEquivalencia
     */
    public double getEquivalencia () {
        return vEquivalencia;
    }

    /**
     * @return the vIdunidad
     */
    public int getIdunidad () {
        return vIdunidad;
    }

    /**
     * @return the vMedida
     */
    public ModeloMedida getMedida () {
        return vMedida;
    }

    /**
     * @return the vUnidadPadre
     */
    public ModeloUnidad getUnidadPadre () {
        return vUnidadPadre;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle ( String detalle ) {
        this.vDetalle = detalle;
    }

    /**
     * @param equivalencia the equivalencia to set
     */
    public void setEquivalencia ( double equivalencia ) {
        this.vEquivalencia = equivalencia;
    }

    /**
     * @param idunidad the idunidad to set
     */
    public void setIdunidad ( int idunidad ) {
        this.vIdunidad = idunidad;
    }

    /**
     * @param medida the medida to set
     */
    public void setMedida (
            ModeloMedida medida ) {
        this.vMedida = medida;
    }

    /**
     * @param unidadPadre the unidadPadre to set
     */
    public void setUnidadPadre (
            ModeloUnidad unidadPadre ) {
        this.vUnidadPadre = unidadPadre;
    }

    @Override
    public String toString () {
        return vDetalle;
    }

}
