/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables.records;


import com.pereira.manolos.datos.database.tables.VVenta;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record21;
import org.jooq.Row21;
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
public class VVentaRecord extends TableRecordImpl<VVentaRecord> implements Record21<Integer, String, Timestamp, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, String, String, String, String, Integer, Integer, Integer, String, String> {

    private static final long serialVersionUID = 259123028;

    /**
     * Setter for <code>public.v_venta.idventa</code>.
     */
    public void setIdventa(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.v_venta.idventa</code>.
     */
    public Integer getIdventa() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.v_venta.numerofactura</code>.
     */
    public void setNumerofactura(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.v_venta.numerofactura</code>.
     */
    public String getNumerofactura() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.v_venta.fecha</code>.
     */
    public void setFecha(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.v_venta.fecha</code>.
     */
    public Timestamp getFecha() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.v_venta.cliente</code>.
     */
    public void setCliente(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.v_venta.cliente</code>.
     */
    public String getCliente() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.v_venta.direccion</code>.
     */
    public void setDireccion(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.v_venta.direccion</code>.
     */
    public String getDireccion() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.v_venta.telefono</code>.
     */
    public void setTelefono(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.v_venta.telefono</code>.
     */
    public String getTelefono() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.v_venta.dui</code>.
     */
    public void setDui(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.v_venta.dui</code>.
     */
    public String getDui() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.v_venta.total</code>.
     */
    public void setTotal(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.v_venta.total</code>.
     */
    public BigDecimal getTotal() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>public.v_venta.gravado</code>.
     */
    public void setGravado(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.v_venta.gravado</code>.
     */
    public BigDecimal getGravado() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>public.v_venta.exento</code>.
     */
    public void setExento(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.v_venta.exento</code>.
     */
    public BigDecimal getExento() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>public.v_venta.nosujeto</code>.
     */
    public void setNosujeto(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.v_venta.nosujeto</code>.
     */
    public BigDecimal getNosujeto() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>public.v_venta.tipodoc</code>.
     */
    public void setTipodoc(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.v_venta.tipodoc</code>.
     */
    public String getTipodoc() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.v_venta.tipoventa</code>.
     */
    public void setTipoventa(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.v_venta.tipoventa</code>.
     */
    public String getTipoventa() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.v_venta.empleado</code>.
     */
    public void setEmpleado(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.v_venta.empleado</code>.
     */
    public String getEmpleado() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.v_venta.caja</code>.
     */
    public void setCaja(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.v_venta.caja</code>.
     */
    public String getCaja() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.v_venta.resolucion</code>.
     */
    public void setResolucion(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.v_venta.resolucion</code>.
     */
    public String getResolucion() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.v_venta.tktinicial</code>.
     */
    public void setTktinicial(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.v_venta.tktinicial</code>.
     */
    public Integer getTktinicial() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>public.v_venta.tktfinal</code>.
     */
    public void setTktfinal(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.v_venta.tktfinal</code>.
     */
    public Integer getTktfinal() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>public.v_venta.tktactual</code>.
     */
    public void setTktactual(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.v_venta.tktactual</code>.
     */
    public Integer getTktactual() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>public.v_venta.serie</code>.
     */
    public void setSerie(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.v_venta.serie</code>.
     */
    public String getSerie() {
        return (String) get(19);
    }

    /**
     * Setter for <code>public.v_venta.enletras</code>.
     */
    public void setEnletras(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.v_venta.enletras</code>.
     */
    public String getEnletras() {
        return (String) get(20);
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, String, Timestamp, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, String, String, String, String, Integer, Integer, Integer, String, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, String, Timestamp, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, String, String, String, String, Integer, Integer, Integer, String, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return VVenta.V_VENTA.IDVENTA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return VVenta.V_VENTA.NUMEROFACTURA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return VVenta.V_VENTA.FECHA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return VVenta.V_VENTA.CLIENTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return VVenta.V_VENTA.DIRECCION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return VVenta.V_VENTA.TELEFONO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return VVenta.V_VENTA.DUI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return VVenta.V_VENTA.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return VVenta.V_VENTA.GRAVADO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return VVenta.V_VENTA.EXENTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return VVenta.V_VENTA.NOSUJETO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return VVenta.V_VENTA.TIPODOC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return VVenta.V_VENTA.TIPOVENTA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return VVenta.V_VENTA.EMPLEADO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return VVenta.V_VENTA.CAJA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return VVenta.V_VENTA.RESOLUCION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field17() {
        return VVenta.V_VENTA.TKTINICIAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return VVenta.V_VENTA.TKTFINAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field19() {
        return VVenta.V_VENTA.TKTACTUAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return VVenta.V_VENTA.SERIE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field21() {
        return VVenta.V_VENTA.ENLETRAS;
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
    public String value4() {
        return getCliente();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDireccion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTelefono();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDui();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getGravado();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getExento();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getNosujeto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getTipodoc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getTipoventa();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getEmpleado();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCaja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getResolucion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value17() {
        return getTktinicial();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getTktfinal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value19() {
        return getTktactual();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getSerie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value21() {
        return getEnletras();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value1(Integer value) {
        setIdventa(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value2(String value) {
        setNumerofactura(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value3(Timestamp value) {
        setFecha(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value4(String value) {
        setCliente(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value5(String value) {
        setDireccion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value6(String value) {
        setTelefono(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value7(String value) {
        setDui(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value8(BigDecimal value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value9(BigDecimal value) {
        setGravado(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value10(BigDecimal value) {
        setExento(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value11(BigDecimal value) {
        setNosujeto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value12(String value) {
        setTipodoc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value13(String value) {
        setTipoventa(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value14(String value) {
        setEmpleado(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value15(String value) {
        setCaja(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value16(String value) {
        setResolucion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value17(Integer value) {
        setTktinicial(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value18(Integer value) {
        setTktfinal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value19(Integer value) {
        setTktactual(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value20(String value) {
        setSerie(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord value21(String value) {
        setEnletras(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VVentaRecord values(Integer value1, String value2, Timestamp value3, String value4, String value5, String value6, String value7, BigDecimal value8, BigDecimal value9, BigDecimal value10, BigDecimal value11, String value12, String value13, String value14, String value15, String value16, Integer value17, Integer value18, Integer value19, String value20, String value21) {
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
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VVentaRecord
     */
    public VVentaRecord() {
        super(VVenta.V_VENTA);
    }

    /**
     * Create a detached, initialised VVentaRecord
     */
    public VVentaRecord(Integer idventa, String numerofactura, Timestamp fecha, String cliente, String direccion, String telefono, String dui, BigDecimal total, BigDecimal gravado, BigDecimal exento, BigDecimal nosujeto, String tipodoc, String tipoventa, String empleado, String caja, String resolucion, Integer tktinicial, Integer tktfinal, Integer tktactual, String serie, String enletras) {
        super(VVenta.V_VENTA);

        set(0, idventa);
        set(1, numerofactura);
        set(2, fecha);
        set(3, cliente);
        set(4, direccion);
        set(5, telefono);
        set(6, dui);
        set(7, total);
        set(8, gravado);
        set(9, exento);
        set(10, nosujeto);
        set(11, tipodoc);
        set(12, tipoventa);
        set(13, empleado);
        set(14, caja);
        set(15, resolucion);
        set(16, tktinicial);
        set(17, tktfinal);
        set(18, tktactual);
        set(19, serie);
        set(20, enletras);
    }
}