package com.pereira.manolos.negocio.modelos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.logging.Logger;

public class ModeloVenta {

    private int idventa;
    private String numerofactura;//
    private Date fecha;
    private ModeloCliente cliente;//
    private ModeloEmpleado empleado;//
    private ModeloResolucion resolucion;//
    private String tipodoc;//
    private String tipoventa;//
    private BigDecimal gravado;
    private BigDecimal exento;
    private BigDecimal nosujeto;
    private BigDecimal total;
    private String enletras;

    public ModeloVenta ( String pNumerofactura , ModeloCliente pCliente , ModeloEmpleado pEmpleado , ModeloResolucion pResolucion , String pTipodoc ) {
        this.numerofactura = pNumerofactura;
        this.cliente = pCliente;
        this.empleado = pEmpleado;
        this.resolucion = pResolucion;
        this.tipodoc = pTipodoc;
    }

    public ModeloVenta ( int pIdventa , String pNumerofactura , Date pFecha , ModeloCliente pCliente , ModeloEmpleado pEmpleado ,
                         ModeloResolucion pResolucion , String pTipodoc , String pTipoventa , BigDecimal pGravado , BigDecimal pExento ,
                         BigDecimal pNosujeto , BigDecimal pTotal , String pEnletras ) {
        this.idventa = pIdventa;
        this.numerofactura = pNumerofactura;
        this.fecha = pFecha;
        this.cliente = pCliente;
        this.empleado = pEmpleado;
        this.resolucion = pResolucion;
        this.tipodoc = pTipodoc;
        this.tipoventa = pTipoventa;
        this.gravado = pGravado;
        this.exento = pExento;
        this.nosujeto = pNosujeto;
        this.total = pTotal;
        this.enletras = pEnletras;
    }

    public ModeloVenta () {
    }
    private static final Logger LOG = Logger.getLogger ( ModeloVenta.class.
            getName () );

    /**
     * @return the cliente
     */
    public ModeloCliente getCliente () {
        return cliente;
    }

    /**
     * @return the empleado
     */
    public ModeloEmpleado getEmpleado () {
        return empleado;
    }

    /**
     * @return the enletras
     */
    public String getEnletras () {
        return enletras;
    }

    /**
     * @return the exento
     */
    public BigDecimal getExento () {
        return exento;
    }

    /**
     * @return the fecha
     */
    public Date getFecha () {
        return fecha;
    }

    /**
     * @return the gravado
     */
    public BigDecimal getGravado () {
        return gravado;
    }

    /**
     * @return the idventa
     */
    public int getIdventa () {
        return idventa;
    }

    /**
     * @return the nosujeto
     */
    public BigDecimal getNosujeto () {
        return nosujeto;
    }

    /**
     * @return the numerofactura
     */
    public String getNumerofactura () {
        return numerofactura;
    }

    /**
     * @return the resolucion
     */
    public ModeloResolucion getResolucion () {
        return resolucion;
    }

    /**
     * @return the tipodoc
     */
    public String getTipodoc () {
        return tipodoc;
    }

    /**
     * @return the tipoventa
     */
    public String getTipoventa () {
        return tipoventa;
    }

    /**
     * @return the total
     */
    public BigDecimal getTotal () {
        return total;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente ( ModeloCliente cliente ) {
        this.cliente = cliente;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado ( ModeloEmpleado empleado ) {
        this.empleado = empleado;
    }

    /**
     * @param enletras the enletras to set
     */
    public void setEnletras ( String enletras ) {
        this.enletras = enletras;
    }

    /**
     * @param exento the exento to set
     */
    public void setExento ( BigDecimal exento ) {
        this.exento = exento;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha ( Date fecha ) {
        this.fecha = fecha;
    }

    /**
     * @param gravado the gravado to set
     */
    public void setGravado ( BigDecimal gravado ) {
        this.gravado = gravado;
    }

    /**
     * @param idventa the idventa to set
     */
    public void setIdventa ( int idventa ) {
        this.idventa = idventa;
    }

    /**
     * @param nosujeto the nosujeto to set
     */
    public void setNosujeto ( BigDecimal nosujeto ) {
        this.nosujeto = nosujeto;
    }

    /**
     * @param numerofactura the numerofactura to set
     */
    public void setNumerofactura ( String numerofactura ) {
        this.numerofactura = numerofactura;
    }

    /**
     * @param resolucion the resolucion to set
     */
    public void setResolucion ( ModeloResolucion resolucion ) {
        this.resolucion = resolucion;
    }

    /**
     * @param tipodoc the tipodoc to set
     */
    public void setTipodoc ( String tipodoc ) {
        this.tipodoc = tipodoc;
    }

    /**
     * @param tipoventa the tipoventa to set
     */
    public void setTipoventa ( String tipoventa ) {
        this.tipoventa = tipoventa;
    }

    /**
     * @param total the total to set
     */
    public void setTotal ( BigDecimal total ) {
        this.total = total;
    }

}
