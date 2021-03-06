/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables.records;


import com.pereira.manolos.datos.database.tables.Compra;

import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CompraRecord extends UpdatableRecordImpl<CompraRecord> implements Record6<Integer, Integer, Date, String, String, BigDecimal> {

    private static final long serialVersionUID = 1598553074;

    /**
     * Setter for <code>public.compra.idcompra</code>.
     */
    public void setIdcompra(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.compra.idcompra</code>.
     */
    public Integer getIdcompra() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.compra.idproveedor</code>.
     */
    public void setIdproveedor(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.compra.idproveedor</code>.
     */
    public Integer getIdproveedor() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.compra.fecha</code>.
     */
    public void setFecha(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.compra.fecha</code>.
     */
    public Date getFecha() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>public.compra.numerodocumento</code>.
     */
    public void setNumerodocumento(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.compra.numerodocumento</code>.
     */
    public String getNumerodocumento() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.compra.tipodocumento</code>.
     */
    public void setTipodocumento(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.compra.tipodocumento</code>.
     */
    public String getTipodocumento() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.compra.total</code>.
     */
    public void setTotal(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.compra.total</code>.
     */
    public BigDecimal getTotal() {
        return (BigDecimal) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Date, String, String, BigDecimal> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Date, String, String, BigDecimal> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Compra.COMPRA.IDCOMPRA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Compra.COMPRA.IDPROVEEDOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return Compra.COMPRA.FECHA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Compra.COMPRA.NUMERODOCUMENTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Compra.COMPRA.TIPODOCUMENTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return Compra.COMPRA.TOTAL;
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
        return getIdproveedor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value3() {
        return getFecha();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getNumerodocumento();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTipodocumento();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompraRecord value1(Integer value) {
        setIdcompra(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompraRecord value2(Integer value) {
        setIdproveedor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompraRecord value3(Date value) {
        setFecha(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompraRecord value4(String value) {
        setNumerodocumento(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompraRecord value5(String value) {
        setTipodocumento(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompraRecord value6(BigDecimal value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompraRecord values(Integer value1, Integer value2, Date value3, String value4, String value5, BigDecimal value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CompraRecord
     */
    public CompraRecord() {
        super(Compra.COMPRA);
    }

    /**
     * Create a detached, initialised CompraRecord
     */
    public CompraRecord(Integer idcompra, Integer idproveedor, Date fecha, String numerodocumento, String tipodocumento, BigDecimal total) {
        super(Compra.COMPRA);

        set(0, idcompra);
        set(1, idproveedor);
        set(2, fecha);
        set(3, numerodocumento);
        set(4, tipodocumento);
        set(5, total);
    }
}
