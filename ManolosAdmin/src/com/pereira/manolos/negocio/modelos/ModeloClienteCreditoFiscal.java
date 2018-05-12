package com.pereira.manolos.negocio.modelos;

import java.util.logging.Logger;

/**
 *
 * @author Jose Luis
 */
public class ModeloClienteCreditoFiscal {

    private ModeloCliente vCliente;
    private String vGiro;
    private String vNIT;
    private String vNRC;
    private String vRepresentante;
    private static final Logger LOG = Logger.getLogger (
            ModeloClienteCreditoFiscal.class.getName () );

    public ModeloClienteCreditoFiscal ( ModeloCliente pCliente , String pGiro ,
                                        String pNRC , String pNIT ,
                                        String pRepresentante ) {
        this.vCliente = pCliente;
        this.vGiro = pGiro;
        this.vNRC = pNRC;
        this.vNIT = pNIT;
        this.vRepresentante = pRepresentante;
    }

    /**
     * @return the vCliente
     */
    public ModeloCliente getCliente () {
        return vCliente;
    }

    /**
     * @return the vGiro
     */
    public String getGiro () {
        return vGiro;
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
     * @return the vRepresentante
     */
    public String getRepresentante () {
        return vRepresentante;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente (
            ModeloCliente cliente ) {
        this.vCliente = cliente;
    }

    /**
     * @param giro the giro to set
     */
    public void setGiro ( String giro ) {
        this.vGiro = giro;
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
     * @param representante the representante to set
     */
    public void setRepresentante ( String representante ) {
        this.vRepresentante = representante;
    }
}
