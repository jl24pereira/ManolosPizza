/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables.records;


import com.pereira.manolos.datos.database.tables.Receta;

import java.math.BigDecimal;

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
public class RecetaRecord extends UpdatableRecordImpl<RecetaRecord> implements Record13<Integer, String, String, Integer, BigDecimal, Boolean, Double, Double, Double, Double, Double, Integer, Integer> {

    private static final long serialVersionUID = 2063667643;

    /**
     * Setter for <code>public.receta.idreceta</code>.
     */
    public void setIdreceta(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.receta.idreceta</code>.
     */
    public Integer getIdreceta() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.receta.nombre</code>.
     */
    public void setNombre(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.receta.nombre</code>.
     */
    public String getNombre() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.receta.tiporeceta</code>.
     */
    public void setTiporeceta(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.receta.tiporeceta</code>.
     */
    public String getTiporeceta() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.receta.idunidad</code>.
     */
    public void setIdunidad(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.receta.idunidad</code>.
     */
    public Integer getIdunidad() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.receta.costo</code>.
     */
    public void setCosto(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.receta.costo</code>.
     */
    public BigDecimal getCosto() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>public.receta.baja</code>.
     */
    public void setBaja(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.receta.baja</code>.
     */
    public Boolean getBaja() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.receta.stock</code>.
     */
    public void setStock(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.receta.stock</code>.
     */
    public Double getStock() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>public.receta.rendimiento</code>.
     */
    public void setRendimiento(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.receta.rendimiento</code>.
     */
    public Double getRendimiento() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>public.receta.estimadomensual</code>.
     */
    public void setEstimadomensual(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.receta.estimadomensual</code>.
     */
    public Double getEstimadomensual() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>public.receta.maximo</code>.
     */
    public void setMaximo(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.receta.maximo</code>.
     */
    public Double getMaximo() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>public.receta.minimo</code>.
     */
    public void setMinimo(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.receta.minimo</code>.
     */
    public Double getMinimo() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>public.receta.horas</code>.
     */
    public void setHoras(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.receta.horas</code>.
     */
    public Integer getHoras() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>public.receta.minutos</code>.
     */
    public void setMinutos(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.receta.minutos</code>.
     */
    public Integer getMinutos() {
        return (Integer) get(12);
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
    public Row13<Integer, String, String, Integer, BigDecimal, Boolean, Double, Double, Double, Double, Double, Integer, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, Integer, BigDecimal, Boolean, Double, Double, Double, Double, Double, Integer, Integer> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Receta.RECETA.IDRECETA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Receta.RECETA.NOMBRE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Receta.RECETA.TIPORECETA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Receta.RECETA.IDUNIDAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return Receta.RECETA.COSTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return Receta.RECETA.BAJA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return Receta.RECETA.STOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return Receta.RECETA.RENDIMIENTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field9() {
        return Receta.RECETA.ESTIMADOMENSUAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field10() {
        return Receta.RECETA.MAXIMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field11() {
        return Receta.RECETA.MINIMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Receta.RECETA.HORAS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return Receta.RECETA.MINUTOS;
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
    public Integer value4() {
        return getIdunidad();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getCosto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getBaja();
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
    public Double value9() {
        return getEstimadomensual();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value10() {
        return getMaximo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value11() {
        return getMinimo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getHoras();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getMinutos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecetaRecord value1(Integer value) {
        setIdreceta(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecetaRecord value2(String value) {
        setNombre(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecetaRecord value3(String value) {
        setTiporeceta(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecetaRecord value4(Integer value) {
        setIdunidad(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecetaRecord value5(BigDecimal value) {
        setCosto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecetaRecord value6(Boolean value) {
        setBaja(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecetaRecord value7(Double value) {
        setStock(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecetaRecord value8(Double value) {
        setRendimiento(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecetaRecord value9(Double value) {
        setEstimadomensual(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecetaRecord value10(Double value) {
        setMaximo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecetaRecord value11(Double value) {
        setMinimo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecetaRecord value12(Integer value) {
        setHoras(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecetaRecord value13(Integer value) {
        setMinutos(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecetaRecord values(Integer value1, String value2, String value3, Integer value4, BigDecimal value5, Boolean value6, Double value7, Double value8, Double value9, Double value10, Double value11, Integer value12, Integer value13) {
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
     * Create a detached RecetaRecord
     */
    public RecetaRecord() {
        super(Receta.RECETA);
    }

    /**
     * Create a detached, initialised RecetaRecord
     */
    public RecetaRecord(Integer idreceta, String nombre, String tiporeceta, Integer idunidad, BigDecimal costo, Boolean baja, Double stock, Double rendimiento, Double estimadomensual, Double maximo, Double minimo, Integer horas, Integer minutos) {
        super(Receta.RECETA);

        set(0, idreceta);
        set(1, nombre);
        set(2, tiporeceta);
        set(3, idunidad);
        set(4, costo);
        set(5, baja);
        set(6, stock);
        set(7, rendimiento);
        set(8, estimadomensual);
        set(9, maximo);
        set(10, minimo);
        set(11, horas);
        set(12, minutos);
    }
}
