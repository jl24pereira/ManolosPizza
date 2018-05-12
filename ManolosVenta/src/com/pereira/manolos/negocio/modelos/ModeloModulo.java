/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.modelos;

import java.util.logging.Logger;

/**
 *
 * @author Jose Luis
 */
public class ModeloModulo {

    private int vIdmodulo;
    private String vModulo;
    private static final Logger LOG = Logger.getLogger(ModeloModulo.class.
            getName());

    public ModeloModulo(int vIdmodulo, String vModulo) {
        this.vIdmodulo = vIdmodulo;
        this.vModulo = vModulo;
    }

    /**
     * @return the vIdmodulo
     */
    public int getIdmodulo() {
        return vIdmodulo;
    }

    /**
     * @return the vModulo
     */
    public String getModulo() {
        return vModulo;
    }

    /**
     * @param idmodulo the idmodulo to set
     */
    public void setIdmodulo(int idmodulo) {
        this.vIdmodulo = idmodulo;
    }

    /**
     * @param modulo the modulo to set
     */
    public void setModulo(String modulo) {
        this.vModulo = modulo;
    }

}
