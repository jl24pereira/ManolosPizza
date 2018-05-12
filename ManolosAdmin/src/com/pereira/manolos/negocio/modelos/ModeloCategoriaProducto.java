package com.pereira.manolos.negocio.modelos;

import java.util.logging.Logger;

public class ModeloCategoriaProducto {

    private int vIdcategoria;
    private byte[] vImagen;
    private String vNombre;
    private static final Logger LOG = Logger.getLogger (
            ModeloCategoriaProducto.class.getName () );

    public ModeloCategoriaProducto ( int pIdcategoria , byte[] pImagen ,
                                     String pNombre ) {
        this.vIdcategoria = pIdcategoria;
        this.vImagen = pImagen;
        this.vNombre = pNombre;
    }

    public ModeloCategoriaProducto ( byte[] pImagen , String pNombre ) {
        this.vImagen = pImagen;
        this.vNombre = pNombre;
    }

    /**
     * @return the vIdcategoria
     */
    public int getIdcategoria () {
        return vIdcategoria;
    }

    /**
     * @return the vImagen
     */
    public byte[] getImagen () {
        return vImagen;
    }

    /**
     * @return the vNombre
     */
    public String getNombre () {
        return vNombre;
    }

    /**
     * @param idcategoria the idcategoria to set
     */
    public void setIdcategoria ( int idcategoria ) {
        this.vIdcategoria = idcategoria;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen ( byte[] imagen ) {
        this.vImagen = imagen;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre ( String nombre ) {
        this.vNombre = nombre;
    }

    @Override
    public String toString () {
        return vNombre;
    }

}
