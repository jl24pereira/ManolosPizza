/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables.records;


import com.pereira.manolos.datos.database.tables.DetalleCompra;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class DetalleCompraRecord extends TableRecordImpl<DetalleCompraRecord> implements Record4<Integer, Integer, Double, BigDecimal> {

    private static final long serialVersionUID = -470708007;

    /**
     * Setter for <code>public.detalle_compra.idcompra</code>.
     */
    public void setIdcompra(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.detalle_compra.idcompra</code>.
     */
    public Integer getIdcompra() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.detalle_compra.idinsumo</code>.
     */
    public void setIdinsumo(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.detalle_compra.idinsumo</code>.
     */
    public Integer getIdinsumo() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.detalle_compra.cantidad</code>.
     */
    public void setCantidad(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.detalle_compra.cantidad</code>.
     */
    public Double getCantidad() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public.detalle_compra.precio</code>.
     */
    public void setPrecio(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.detalle_compra.precio</code>.
     */
    public BigDecimal getPrecio() {
        return (BigDecimal) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Double, BigDecimal> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Double, BigDecimal> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DetalleCompra.DETALLE_COMPRA.IDCOMPRA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return DetalleCompra.DETALLE_COMPRA.IDINSUMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return DetalleCompra.DETALLE_COMPRA.CANTIDAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return DetalleCompra.DETALLE_COMPRA.PRECIO;
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
    public Integer value2() {
        return getIdinsumo();
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
    public DetalleCompraRecord value1(Integer value) {
        setIdcompra(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleCompraRecord value2(Integer value) {
        setIdinsumo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleCompraRecord value3(Double value) {
        setCantidad(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleCompraRecord value4(BigDecimal value) {
        setPrecio(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleCompraRecord values(Integer value1, Integer value2, Double value3, BigDecimal value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DetalleCompraRecord
     */
    public DetalleCompraRecord() {
        super(DetalleCompra.DETALLE_COMPRA);
    }

    /**
     * Create a detached, initialised DetalleCompraRecord
     */
    public DetalleCompraRecord(Integer idcompra, Integer idinsumo, Double cantidad, BigDecimal precio) {
        super(DetalleCompra.DETALLE_COMPRA);

        set(0, idcompra);
        set(1, idinsumo);
        set(2, cantidad);
        set(3, precio);
    }
}
