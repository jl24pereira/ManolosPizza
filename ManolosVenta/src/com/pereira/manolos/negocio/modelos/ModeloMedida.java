package com.pereira.manolos.negocio.modelos;

import java.util.logging.Logger;

public class ModeloMedida {

    private String vDetalle;
    private int vIdmedida;
    private static final Logger LOG = Logger.getLogger ( ModeloMedida.class.
            getName () );

    public ModeloMedida ( int pIdmedida , String pDetalle ) {
        this.vIdmedida = pIdmedida;
        this.vDetalle = pDetalle;
    }

    /**
     * @return the vDetalle
     */
    public String getDetalle () {
        return vDetalle;
    }

    /**
     * @return the vIdmedida
     */
    public int getIdmedida () {
        return vIdmedida;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle ( String detalle ) {
        this.vDetalle = detalle;
    }

    /**
     * @param idmedida the idmedida to set
     */
    public void setIdmedida ( int idmedida ) {
        this.vIdmedida = idmedida;
    }

    @Override
    public String toString () {
        return vDetalle;
    }

}
