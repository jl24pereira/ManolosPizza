/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables.records;


import com.pereira.manolos.datos.database.tables.VRecetas;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class VRecetasRecord extends TableRecordImpl<VRecetasRecord> implements Record13<Integer, String, String, BigDecimal, Integer, Integer, Double, Double, Integer, String, Boolean, Double, Double> {

    private static final long serialVersionUID = -1136034166;

    /**
     * Setter for <code>public.v_recetas.idreceta</code>.
     */
    public void setIdreceta(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.v_recetas.idreceta</code>.
     */
    public Integer getIdreceta() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.v_recetas.nombre</code>.
     */
    public void setNombre(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.v_recetas.nombre</code>.
     */
    public String getNombre() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.v_recetas.tiporeceta</code>.
     */
    public void setTiporeceta(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.v_recetas.tiporeceta</code>.
     */
    public String getTiporeceta() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.v_recetas.costo</code>.
     */
    public void setCosto(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.v_recetas.costo</code>.
     */
    public BigDecimal getCosto() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>public.v_recetas.horas</code>.
     */
    public void setHoras(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.v_recetas.horas</code>.
     */
    public Integer getHoras() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.v_recetas.minutos</code>.
     */
    public void setMinutos(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.v_recetas.minutos</code>.
     */
    public Integer getMinutos() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.v_recetas.stock</code>.
     */
    public void setStock(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.v_recetas.stock</code>.
     */
    public Double getStock() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>public.v_recetas.rendimiento</code>.
     */
    public void setRendimiento(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.v_recetas.rendimiento</code>.
     */
    public Double getRendimiento() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>public.v_recetas.idunidad</code>.
     */
    public void setIdunidad(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.v_recetas.idunidad</code>.
     */
    public Integer getIdunidad() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.v_recetas.unidad</code>.
     */
    public void setUnidad(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.v_recetas.unidad</code>.
     */
    public String getUnidad() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.v_recetas.baja</code>.
     */
    public void setBaja(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.v_recetas.baja</code>.
     */
    public Boolean getBaja() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>public.v_recetas.minimo</code>.
     */
    public void setMinimo(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.v_recetas.minimo</code>.
     */
    public Double getMinimo() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>public.v_recetas.maximo</code>.
     */
    public void setMaximo(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.v_recetas.maximo</code>.
     */
    public Double getMaximo() {
        return (Double) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, BigDecimal, Integer, Integer, Double, Double, Integer, String, Boolean, Double, Double> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, BigDecimal, Integer, Integer, Double, Double, Integer, String, Boolean, Double, Double> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return VRecetas.V_RECETAS.IDRECETA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return VRecetas.V_RECETAS.NOMBRE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return VRecetas.V_RECETAS.TIPORECETA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return VRecetas.V_RECETAS.COSTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return VRecetas.V_RECETAS.HORAS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return VRecetas.V_RECETAS.MINUTOS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return VRecetas.V_RECETAS.STOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return VRecetas.V_RECETAS.RENDIMIENTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return VRecetas.V_RECETAS.IDUNIDAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return VRecetas.V_RECETAS.UNIDAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return VRecetas.V_RECETAS.BAJA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field12() {
        return VRecetas.V_RECETAS.MINIMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field13() {
        return VRecetas.V_RECETAS.MAXIMO;
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
    public String value3() {
        return getTiporeceta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getCosto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getHoras();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getMinutos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getStock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getRendimiento();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getIdunidad();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getUnidad();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getBaja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value12() {
        return getMinimo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value13() {
        return getMaximo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VRecetasRecord value1(Integer value) {
        setIdreceta(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VRecetasRecord value2(String value) {
        setNombre(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VRecetasRecord value3(String value) {
        setTiporeceta(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VRecetasRecord value4(BigDecimal value) {
        setCosto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VRecetasRecord value5(Integer value) {
        setHoras(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VRecetasRecord value6(Integer value) {
        setMinutos(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VRecetasRecord value7(Double value) {
        setStock(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VRecetasRecord value8(Double value) {
        setRendimiento(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VRecetasRecord value9(Integer value) {
        setIdunidad(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VRecetasRecord value10(String value) {
        setUnidad(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VRecetasRecord value11(Boolean value) {
        setBaja(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VRecetasRecord value12(Double value) {
        setMinimo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VRecetasRecord value13(Double value) {
        setMaximo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VRecetasRecord values(Integer value1, String value2, String value3, BigDecimal value4, Integer value5, Integer value6, Double value7, Double value8, Integer value9, String value10, Boolean value11, Double value12, Double value13) {
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
     * Create a detached VRecetasRecord
     */
    public VRecetasRecord() {
        super(VRecetas.V_RECETAS);
    }

    /**
     * Create a detached, initialised VRecetasRecord
     */
    public VRecetasRecord(Integer idreceta, String nombre, String tiporeceta, BigDecimal costo, Integer horas, Integer minutos, Double stock, Double rendimiento, Integer idunidad, String unidad, Boolean baja, Double minimo, Double maximo) {
        super(VRecetas.V_RECETAS);

        set(0, idreceta);
        set(1, nombre);
        set(2, tiporeceta);
        set(3, costo);
        set(4, horas);
        set(5, minutos);
        set(6, stock);
        set(7, rendimiento);
        set(8, idunidad);
        set(9, unidad);
        set(10, baja);
        set(11, minimo);
        set(12, maximo);
    }
}
