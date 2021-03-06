/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables.records;


import com.pereira.manolos.datos.database.tables.Venta;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class VentaRecord extends UpdatableRecordImpl<VentaRecord> implements Record13<Integer, String, Timestamp, Integer, Integer, BigDecimal, String, String, String, Integer, BigDecimal, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = -1480117589;

    /**
     * Setter for <code>public.venta.idventa</code>.
     */
    public void setIdventa(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.venta.idventa</code>.
     */
    public Integer getIdventa() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.venta.numerofactura</code>.
     */
    public void setNumerofactura(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.venta.numerofactura</code>.
     */
    public String getNumerofactura() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.venta.fecha</code>.
     */
    public void setFecha(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.venta.fecha</code>.
     */
    public Timestamp getFecha() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.venta.idcliente</code>.
     */
    public void setIdcliente(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.venta.idcliente</code>.
     */
    public Integer getIdcliente() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.venta.idempleado</code>.
     */
    public void setIdempleado(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.venta.idempleado</code>.
     */
    public Integer getIdempleado() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.venta.total</code>.
     */
    public void setTotal(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.venta.total</code>.
     */
    public BigDecimal getTotal() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>public.venta.enletras</code>.
     */
    public void setEnletras(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.venta.enletras</code>.
     */
    public String getEnletras() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.venta.tipodoc</code>.
     */
    public void setTipodoc(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.venta.tipodoc</code>.
     */
    public String getTipodoc() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.venta.tipoventa</code>.
     */
    public void setTipoventa(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.venta.tipoventa</code>.
     */
    public String getTipoventa() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.venta.idresolucion</code>.
     */
    public void setIdresolucion(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.venta.idresolucion</code>.
     */
    public Integer getIdresolucion() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.venta.gravado</code>.
     */
    public void setGravado(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.venta.gravado</code>.
     */
    public BigDecimal getGravado() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>public.venta.exento</code>.
     */
    public void setExento(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.venta.exento</code>.
     */
    public BigDecimal getExento() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>public.venta.nosujeto</code>.
     */
    public void setNosujeto(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.venta.nosujeto</code>.
     */
    public BigDecimal getNosujeto() {
        return (BigDecimal) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, Timestamp, Integer, Integer, BigDecimal, String, String, String, Integer, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, Timestamp, Integer, Integer, BigDecimal, String, String, String, Integer, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Venta.VENTA.IDVENTA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Venta.VENTA.NUMEROFACTURA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Venta.VENTA.FECHA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Venta.VENTA.IDCLIENTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Venta.VENTA.IDEMPLEADO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return Venta.VENTA.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Venta.VENTA.ENLETRAS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Venta.VENTA.TIPODOC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Venta.VENTA.TIPOVENTA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Venta.VENTA.IDRESOLUCION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return Venta.VENTA.GRAVADO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field12() {
        return Venta.VENTA.EXENTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field13() {
        return Venta.VENTA.NOSUJETO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdventa();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNumerofactura();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getFecha();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getIdcliente();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getIdempleado();
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
    public String value7() {
        return getEnletras();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTipodoc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getTipoventa();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getIdresolucion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getGravado();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value12() {
        return getExento();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value13() {
        return getNosujeto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentaRecord value1(Integer value) {
        setIdventa(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentaRecord value2(String value) {
        setNumerofactura(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentaRecord value3(Timestamp value) {
        setFecha(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentaRecord value4(Integer value) {
        setIdcliente(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentaRecord value5(Integer value) {
        setIdempleado(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentaRecord value6(BigDecimal value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentaRecord value7(String value) {
        setEnletras(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentaRecord value8(String value) {
        setTipodoc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentaRecord value9(String value) {
        setTipoventa(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentaRecord value10(Integer value) {
        setIdresolucion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentaRecord value11(BigDecimal value) {
        setGravado(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentaRecord value12(BigDecimal value) {
        setExento(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentaRecord value13(BigDecimal value) {
        setNosujeto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VentaRecord values(Integer value1, String value2, Timestamp value3, Integer value4, Integer value5, BigDecimal value6, String value7, String value8, String value9, Integer value10, BigDecimal value11, BigDecimal value12, BigDecimal value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VentaRecord
     */
    public VentaRecord() {
        super(Venta.VENTA);
    }

    /**
     * Create a detached, initialised VentaRecord
     */
    public VentaRecord(Integer idventa, String numerofactura, Timestamp fecha, Integer idcliente, Integer idempleado, BigDecimal total, String enletras, String tipodoc, String tipoventa, Integer idresolucion, BigDecimal gravado, BigDecimal exento, BigDecimal nosujeto) {
        super(Venta.VENTA);

        set(0, idventa);
        set(1, numerofactura);
        set(2, fecha);
        set(3, idcliente);
        set(4, idempleado);
        set(5, total);
        set(6, enletras);
        set(7, tipodoc);
        set(8, tipoventa);
        set(9, idresolucion);
        set(10, gravado);
        set(11, exento);
        set(12, nosujeto);
    }
}
