/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables.records;


import com.pereira.manolos.datos.database.tables.VDetalleCompra;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VDetalleCompraRecord extends TableRecordImpl<VDetalleCompraRecord> implements Record5<Integer, String, Double, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = -1028574687;

    /**
     * Setter for <code>public.v_detalle_compra.idcompra</code>.
     */
    public void setIdcompra(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.v_detalle_compra.idcompra</code>.
     */
    public Integer getIdcompra() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.v_detalle_compra.nombre</code>.
     */
    public void setNombre(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.v_detalle_compra.nombre</code>.
     */
    public String getNombre() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.v_detalle_compra.cantidad</code>.
     */
    public void setCantidad(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.v_detalle_compra.cantidad</code>.
     */
    public Double getCantidad() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public.v_detalle_compra.precio</code>.
     */
    public void setPrecio(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.v_detalle_compra.precio</code>.
     */
    public BigDecimal getPrecio() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>public.v_detalle_compra.ventagravada</code>.
     */
    public void setVentagravada(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.v_detalle_compra.ventagravada</code>.
     */
    public BigDecimal getVentagravada() {
        return (BigDecimal) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Double, BigDecimal, BigDecimal> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Double, BigDecimal, BigDecimal> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return VDetalleCompra.V_DETALLE_COMPRA.IDCOMPRA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return VDetalleCompra.V_DETALLE_COMPRA.NOMBRE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return VDetalleCompra.V_DETALLE_COMPRA.CANTIDAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return VDetalleCompra.V_DETALLE_COMPRA.PRECIO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return VDetalleCompra.V_DETALLE_COMPRA.VENTAGRAVADA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdcompra();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNombre();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getCantidad();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getPrecio();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getVentagravada();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VDetalleCompraRecord value1(Integer value) {
        setIdcompra(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VDetalleCompraRecord value2(String value) {
        setNombre(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VDetalleCompraRecord value3(Double value) {
        setCantidad(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VDetalleCompraRecord value4(BigDecimal value) {
        setPrecio(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VDetalleCompraRecord value5(BigDecimal value) {
        setVentagravada(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VDetalleCompraRecord values(Integer value1, String value2, Double value3, BigDecimal value4, BigDecimal value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VDetalleCompraRecord
     */
    public VDetalleCompraRecord() {
        super(VDetalleCompra.V_DETALLE_COMPRA);
    }

    /**
     * Create a detached, initialised VDetalleCompraRecord
     */
    public VDetalleCompraRecord(Integer idcompra, String nombre, Double cantidad, BigDecimal precio, BigDecimal ventagravada) {
        super(VDetalleCompra.V_DETALLE_COMPRA);

        set(0, idcompra);
        set(1, nombre);
        set(2, cantidad);
        set(3, precio);
        set(4, ventagravada);
    }
}