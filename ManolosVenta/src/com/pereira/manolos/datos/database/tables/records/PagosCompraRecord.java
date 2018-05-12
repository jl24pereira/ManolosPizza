/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables.records;


import com.pereira.manolos.datos.database.tables.PagosCompra;

import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class PagosCompraRecord extends TableRecordImpl<PagosCompraRecord> implements Record3<Integer, Date, BigDecimal> {

    private static final long serialVersionUID = 1772736002;

    /**
     * Setter for <code>public.pagos_compra.idcompra</code>.
     */
    public void setIdcompra(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.pagos_compra.idcompra</code>.
     */
    public Integer getIdcompra() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.pagos_compra.fecha</code>.
     */
    public void setFecha(Date value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.pagos_compra.fecha</code>.
     */
    public Date getFecha() {
        return (Date) get(1);
    }

    /**
     * Setter for <code>public.pagos_compra.pago</code>.
     */
    public void setPago(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.pagos_compra.pago</code>.
     */
    public BigDecimal getPago() {
        return (BigDecimal) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Date, BigDecimal> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Date, BigDecimal> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PagosCompra.PAGOS_COMPRA.IDCOMPRA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field2() {
        return PagosCompra.PAGOS_COMPRA.FECHA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return PagosCompra.PAGOS_COMPRA.PAGO;
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
    public Date value2() {
        return getFecha();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getPago();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PagosCompraRecord value1(Integer value) {
        setIdcompra(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PagosCompraRecord value2(Date value) {
        setFecha(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PagosCompraRecord value3(BigDecimal value) {
        setPago(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PagosCompraRecord values(Integer value1, Date value2, BigDecimal value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PagosCompraRecord
     */
    public PagosCompraRecord() {
        super(PagosCompra.PAGOS_COMPRA);
    }

    /**
     * Create a detached, initialised PagosCompraRecord
     */
    public PagosCompraRecord(Integer idcompra, Date fecha, BigDecimal pago) {
        super(PagosCompra.PAGOS_COMPRA);

        set(0, idcompra);
        set(1, fecha);
        set(2, pago);
    }
}