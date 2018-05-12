/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables.records;


import com.pereira.manolos.datos.database.tables.DetalleCotizacion;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class DetalleCotizacionRecord extends TableRecordImpl<DetalleCotizacionRecord> implements Record7<Integer, Integer, Integer, BigDecimal, String, Integer, Boolean> {

    private static final long serialVersionUID = 674464451;

    /**
     * Setter for <code>public.detalle_cotizacion.idcotizacion</code>.
     */
    public void setIdcotizacion(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.detalle_cotizacion.idcotizacion</code>.
     */
    public Integer getIdcotizacion() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.detalle_cotizacion.idproducto</code>.
     */
    public void setIdproducto(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.detalle_cotizacion.idproducto</code>.
     */
    public Integer getIdproducto() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.detalle_cotizacion.cantidad</code>.
     */
    public void setCantidad(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.detalle_cotizacion.cantidad</code>.
     */
    public Integer getCantidad() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.detalle_cotizacion.precio</code>.
     */
    public void setPrecio(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.detalle_cotizacion.precio</code>.
     */
    public BigDecimal getPrecio() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>public.detalle_cotizacion.tipo</code>.
     */
    public void setTipo(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.detalle_cotizacion.tipo</code>.
     */
    public String getTipo() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.detalle_cotizacion.idpromocion</code>.
     */
    public void setIdpromocion(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.detalle_cotizacion.idpromocion</code>.
     */
    public Integer getIdpromocion() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.detalle_cotizacion.espromo</code>.
     */
    public void setEspromo(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.detalle_cotizacion.espromo</code>.
     */
    public Boolean getEspromo() {
        return (Boolean) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, BigDecimal, String, Integer, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, BigDecimal, String, Integer, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DetalleCotizacion.DETALLE_COTIZACION.IDCOTIZACION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return DetalleCotizacion.DETALLE_COTIZACION.IDPRODUCTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return DetalleCotizacion.DETALLE_COTIZACION.CANTIDAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return DetalleCotizacion.DETALLE_COTIZACION.PRECIO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DetalleCotizacion.DETALLE_COTIZACION.TIPO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return DetalleCotizacion.DETALLE_COTIZACION.IDPROMOCION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return DetalleCotizacion.DETALLE_COTIZACION.ESPROMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdcotizacion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getIdproducto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
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
    public String value5() {
        return getTipo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getIdpromocion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getEspromo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleCotizacionRecord value1(Integer value) {
        setIdcotizacion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleCotizacionRecord value2(Integer value) {
        setIdproducto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleCotizacionRecord value3(Integer value) {
        setCantidad(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleCotizacionRecord value4(BigDecimal value) {
        setPrecio(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleCotizacionRecord value5(String value) {
        setTipo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleCotizacionRecord value6(Integer value) {
        setIdpromocion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleCotizacionRecord value7(Boolean value) {
        setEspromo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetalleCotizacionRecord values(Integer value1, Integer value2, Integer value3, BigDecimal value4, String value5, Integer value6, Boolean value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DetalleCotizacionRecord
     */
    public DetalleCotizacionRecord() {
        super(DetalleCotizacion.DETALLE_COTIZACION);
    }

    /**
     * Create a detached, initialised DetalleCotizacionRecord
     */
    public DetalleCotizacionRecord(Integer idcotizacion, Integer idproducto, Integer cantidad, BigDecimal precio, String tipo, Integer idpromocion, Boolean espromo) {
        super(DetalleCotizacion.DETALLE_COTIZACION);

        set(0, idcotizacion);
        set(1, idproducto);
        set(2, cantidad);
        set(3, precio);
        set(4, tipo);
        set(5, idpromocion);
        set(6, espromo);
    }
}