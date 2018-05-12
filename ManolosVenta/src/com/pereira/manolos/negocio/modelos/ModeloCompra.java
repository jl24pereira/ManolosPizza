/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.modelos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Jose Luis
 */
public class ModeloCompra {

    private List<ModeloPagoCompra> abonos;
    private List<ModeloDetalleCompra> detalle;

    private Date vFecha;
    private int vIdcompra;
    private String vNumeroDocumento;
    private ModeloProveedor vProveedor;
    private String vTipoDocumento;
    private BigDecimal vTotal;
    private static final Logger LOG = Logger.getLogger ( ModeloCompra.class.
            getName () );

    public ModeloCompra ( int pIdcompra , ModeloProveedor pProveedor ,
                          String pNumeroDocumento , Date pFecha ,
                          String pTipoDocumento , BigDecimal pTotal ) {
        this.vIdcompra = pIdcompra;
        this.vProveedor = pProveedor;
        this.vNumeroDocumento = pNumeroDocumento;
        this.vFecha = pFecha;
        this.vTipoDocumento = pTipoDocumento;
        this.vTotal = pTotal;
    }

    public ModeloCompra ( ModeloProveedor pProveedor , String pNumeroDocumento ,
                          Date pFecha , String pTipoDocumento ,
                          BigDecimal pTotal ) {
        this.vProveedor = pProveedor;
        this.vNumeroDocumento = pNumeroDocumento;
        this.vFecha = pFecha;
        this.vTipoDocumento = pTipoDocumento;
        this.vTotal = pTotal;
    }

    public ModeloCompra ( int pIdcompra , String pNumeroDocumento , String pTipoDocumento , Date pFecha , ModeloProveedor pProveedor ,
                          List<ModeloPagoCompra> pAbonos , List<ModeloDetalleCompra> pDetalle , BigDecimal pTotal ) {
        this.abonos = pAbonos;
        this.detalle = pDetalle;
        this.vFecha = pFecha;
        this.vIdcompra = pIdcompra;
        this.vNumeroDocumento = pNumeroDocumento;
        this.vProveedor = pProveedor;
        this.vTipoDocumento = pTipoDocumento;
        this.vTotal = pTotal;
    }

    /**
     * @return the abonos
     */
    public List<ModeloPagoCompra> getAbonos () {
        return abonos;
    }

    /**
     * @return the detalle
     */
    public List<ModeloDetalleCompra> getDetalle () {
        return detalle;
    }

    /**
     * @return the vFecha
     */
    public Date getFecha () {
        return vFecha;
    }

    /**
     * @return the vIdcompra
     */
    public int getIdcompra () {
        return vIdcompra;
    }

    /**
     * @return the vNumeroDocumento
     */
    public String getNumeroDocumento () {
        return vNumeroDocumento;
    }

    /**
     * @return the vProveedor
     */
    public ModeloProveedor getProveedor () {
        return vProveedor;
    }

    /**
     * @return the vTipoDocumento
     */
    public String getTipoDocumento () {
        return vTipoDocumento;
    }

    /**
     * @return the vTotal
     */
    public BigDecimal getTotal () {
        return vTotal;
    }

    /**
     * @param abonos the abonos to set
     */
    public void setAbonos ( List<ModeloPagoCompra> abonos ) {
        this.abonos = abonos;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle ( List<ModeloDetalleCompra> detalle ) {
        this.detalle = detalle;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha ( Date fecha ) {
        this.vFecha = fecha;
    }

    /**
     * @param idcompra the idcompra to set
     */
    public void setIdcompra ( int idcompra ) {
        this.vIdcompra = idcompra;
    }

    /**
     * @param numeroDocumento the numeroDocumento to set
     */
    public void setNumeroDocumento ( String numeroDocumento ) {
        this.vNumeroDocumento = numeroDocumento;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor (
            ModeloProveedor proveedor ) {
        this.vProveedor = proveedor;
    }

    /**
     * @param tipoDocumento the tipoDocumento to set
     */
    public void setTipoDocumento ( String tipoDocumento ) {
        this.vTipoDocumento = tipoDocumento;
    }

    /**
     * @param total the total to set
     */
    public void setTotal ( BigDecimal total ) {
        this.vTotal = total;
    }

}
