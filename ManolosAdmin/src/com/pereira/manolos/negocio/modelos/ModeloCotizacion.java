package com.pereira.manolos.negocio.modelos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.logging.Logger;

public class ModeloCotizacion {

    private String enletras;
    private Date fecha;
    private int idcotizacion;
    private String numero;
    private BigDecimal total;
    private ModeloCliente vCliente;
    private ModeloEmpleado vEmpleado;
    private int validapor;
    private Date vencimiento;
    private static final Logger LOG = Logger.getLogger ( ModeloCotizacion.class.
            getName () );

    public ModeloCotizacion ( int pIdcotizacion , String pNumero , Date pFecha , ModeloCliente pCliente , ModeloEmpleado pEmpleado , Date pEncimiento ,
                              BigDecimal pTotal , String pEnletras , int pAlidapor ) {
        this.idcotizacion = pIdcotizacion;
        this.numero = pNumero;
        this.fecha = pFecha;
        this.vCliente = pCliente;
        this.vEmpleado = pEmpleado;
        this.vencimiento = pEncimiento;
        this.total = pTotal;
        this.enletras = pEnletras;
        this.validapor = pAlidapor;
    }

    public ModeloCotizacion ( int pIdcotizacion , String pNumero , Date pFecha , ModeloCliente pCliente , ModeloEmpleado pEmpleado , BigDecimal pTotal ,
                              String pEnletras ) {
        this.idcotizacion = pIdcotizacion;
        this.numero = pNumero;
        this.fecha = pFecha;
        this.vCliente = pCliente;
        this.vEmpleado = pEmpleado;
        this.total = pTotal;
        this.enletras = pEnletras;
    }

    public ModeloCotizacion ( String pNumero , Date pFecha , ModeloCliente pCliente , ModeloEmpleado pEmpleado , BigDecimal pTotal , String pEnletras ) {
        this.numero = pNumero;
        this.fecha = pFecha;
        this.vCliente = pCliente;
        this.vEmpleado = pEmpleado;
        this.total = pTotal;
        this.enletras = pEnletras;
    }

    public ModeloCotizacion ( String pNumero , Date pFecha , ModeloEmpleado pEmpleado ) {
        this.numero = pNumero;
        this.fecha = pFecha;
        this.vEmpleado = pEmpleado;
    }

    public ModeloCotizacion () {
    }

    /**
     * @return the validapor
     */
    public int getAlidapor () {
        return validapor;
    }

    /**
     * @return the vCliente
     */
    public ModeloCliente getCliente () {
        return vCliente;
    }

    /**
     * @return the vEmpleado
     */
    public ModeloEmpleado getEmpleado () {
        return vEmpleado;
    }

    /**
     * @return the vencimiento
     */
    public Date getEncimiento () {
        return vencimiento;
    }

    /**
     * @return the enletras
     */
    public String getEnletras () {
        return enletras;
    }

    /**
     * @return the fecha
     */
    public Date getFecha () {
        return fecha;
    }

    /**
     * @return the idcotizacion
     */
    public int getIdcotizacion () {
        return idcotizacion;
    }

    /**
     * @return the numero
     */
    public String getNumero () {
        return numero;
    }

    /**
     * @return the total
     */
    public BigDecimal getTotal () {
        return total;
    }

    /**
     * @param alidapor the alidapor to set
     */
    public void setAlidapor ( int alidapor ) {
        this.validapor = alidapor;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente (
            ModeloCliente cliente ) {
        this.vCliente = cliente;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado (
            ModeloEmpleado empleado ) {
        this.vEmpleado = empleado;
    }

    /**
     * @param encimiento the encimiento to set
     */
    public void setEncimiento ( Date encimiento ) {
        this.vencimiento = encimiento;
    }

    /**
     * @param enletras the enletras to set
     */
    public void setEnletras ( String enletras ) {
        this.enletras = enletras;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha ( Date fecha ) {
        this.fecha = fecha;
    }

    /**
     * @param idcotizacion the idcotizacion to set
     */
    public void setIdcotizacion ( int idcotizacion ) {
        this.idcotizacion = idcotizacion;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero ( String numero ) {
        this.numero = numero;
    }

    /**
     * @param total the total to set
     */
    public void setTotal ( BigDecimal total ) {
        this.total = total;
    }

}
