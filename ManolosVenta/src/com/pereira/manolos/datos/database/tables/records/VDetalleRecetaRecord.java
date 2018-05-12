/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables.records;


import com.pereira.manolos.datos.database.tables.VDetalleReceta;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class VDetalleRecetaRecord extends TableRecordImpl<VDetalleRecetaRecord> implements Record9<Integer, String, Integer, String, Double, Integer, String, BigDecimal, String> {

    private static final long serialVersionUID = -91900845;

    /**
     * Setter for <code>public.v_detalle_receta.idreceta</code>.
     */
    public void setIdreceta(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.v_detalle_receta.idreceta</code>.
     */
    public Integer getIdreceta() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.v_detalle_receta.nombre</code>.
     */
    public void setNombre(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.v_detalle_receta.nombre</code>.
     */
    public String getNombre() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.v_detalle_receta.idingrediente</code>.
     */
    public void setIdingrediente(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.v_detalle_receta.idingrediente</code>.
     */
    public Integer getIdingrediente() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.v_detalle_receta.ingrediente</code>.
     */
    public void setIngrediente(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.v_detalle_receta.ingrediente</code>.
     */
    public String getIngrediente() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.v_detalle_receta.descargo</code>.
     */
    public void setDescargo(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.v_detalle_receta.descargo</code>.
     */
    public Double getDescargo() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>public.v_detalle_receta.idunidad</code>.
     */
    public void setIdunidad(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.v_detalle_receta.idunidad</code>.
     */
    public Integer getIdunidad() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.v_detalle_receta.detalle</code>.
     */
    public void setDetalle(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.v_detalle_receta.detalle</code>.
     */
    public String getDetalle() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.v_detalle_receta.costo</code>.
     */
    public void setCosto(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.v_detalle_receta.costo</code>.
     */
    public BigDecimal getCosto() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>public.v_detalle_receta.tipo</code>.
     */
    public void setTipo(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.v_detalle_receta.tipo</code>.
     */
    public String getTipo() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, Integer, String, Double, Integer, String, BigDecimal, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, Integer, String, Double, Integer, String, BigDecimal, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return VDetalleReceta.V_DETALLE_RECETA.IDRECETA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return VDetalleReceta.V_DETALLE_RECETA.NOMBRE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return VDetalleReceta.V_DETALLE_RECETA.IDINGREDIENTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return VDetalleReceta.V_DETALLE_RECETA.INGREDIENTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return VDetalleReceta.V_DETALLE_RECETA.DESCARGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return VDetalleReceta.V_DETALLE_RECETA.IDUNIDAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return VDetalleReceta.V_DETALLE_RECETA.DETALLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return VDetalleReceta.V_DETALLE_RECETA.COSTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return VDetalleReceta.V_DETALLE_RECETA.TIPO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdreceta();
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
    public Integer value3() {
        return getIdingrediente();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getIngrediente();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getDescargo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getIdunidad();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDetalle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getCosto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getTipo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VDetalleRecetaRecord value1(Integer value) {
        setIdreceta(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VDetalleRecetaRecord value2(String value) {
        setNombre(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VDetalleRecetaRecord value3(Integer value) {
        setIdingrediente(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VDetalleRecetaRecord value4(String value) {
        setIngrediente(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VDetalleRecetaRecord value5(Double value) {
        setDescargo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VDetalleRecetaRecord value6(Integer value) {
        setIdunidad(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VDetalleRecetaRecord value7(String value) {
        setDetalle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VDetalleRecetaRecord value8(BigDecimal value) {
        setCosto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VDetalleRecetaRecord value9(String value) {
        setTipo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VDetalleRecetaRecord values(Integer value1, String value2, Integer value3, String value4, Double value5, Integer value6, String value7, BigDecimal value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VDetalleRecetaRecord
     */
    public VDetalleRecetaRecord() {
        super(VDetalleReceta.V_DETALLE_RECETA);
    }

    /**
     * Create a detached, initialised VDetalleRecetaRecord
     */
    public VDetalleRecetaRecord(Integer idreceta, String nombre, Integer idingrediente, String ingrediente, Double descargo, Integer idunidad, String detalle, BigDecimal costo, String tipo) {
        super(VDetalleReceta.V_DETALLE_RECETA);

        set(0, idreceta);
        set(1, nombre);
        set(2, idingrediente);
        set(3, ingrediente);
        set(4, descargo);
        set(5, idunidad);
        set(6, detalle);
        set(7, costo);
        set(8, tipo);
    }
}