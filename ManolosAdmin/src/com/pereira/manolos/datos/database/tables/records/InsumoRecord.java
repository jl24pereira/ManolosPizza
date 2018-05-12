/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables.records;


import com.pereira.manolos.datos.database.tables.Insumo;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class InsumoRecord extends UpdatableRecordImpl<InsumoRecord> implements Record9<Integer, String, BigDecimal, Double, Double, Double, Integer, Boolean, Boolean> {

    private static final long serialVersionUID = 1039178998;

    /**
     * Setter for <code>public.insumo.idinsumo</code>.
     */
    public void setIdinsumo(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.insumo.idinsumo</code>.
     */
    public Integer getIdinsumo() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.insumo.nombre</code>.
     */
    public void setNombre(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.insumo.nombre</code>.
     */
    public String getNombre() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.insumo.costo</code>.
     */
    public void setCosto(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.insumo.costo</code>.
     */
    public BigDecimal getCosto() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>public.insumo.minimo</code>.
     */
    public void setMinimo(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.insumo.minimo</code>.
     */
    public Double getMinimo() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>public.insumo.maximo</code>.
     */
    public void setMaximo(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.insumo.maximo</code>.
     */
    public Double getMaximo() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>public.insumo.stock</code>.
     */
    public void setStock(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.insumo.stock</code>.
     */
    public Double getStock() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>public.insumo.idunidad</code>.
     */
    public void setIdunidad(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.insumo.idunidad</code>.
     */
    public Integer getIdunidad() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.insumo.baja</code>.
     */
    public void setBaja(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.insumo.baja</code>.
     */
    public Boolean getBaja() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>public.insumo.produccion</code>.
     */
    public void setProduccion(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.insumo.produccion</code>.
     */
    public Boolean getProduccion() {
        return (Boolean) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, BigDecimal, Double, Double, Double, Integer, Boolean, Boolean> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, BigDecimal, Double, Double, Double, Integer, Boolean, Boolean> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Insumo.INSUMO.IDINSUMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Insumo.INSUMO.NOMBRE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return Insumo.INSUMO.COSTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return Insumo.INSUMO.MINIMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return Insumo.INSUMO.MAXIMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return Insumo.INSUMO.STOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Insumo.INSUMO.IDUNIDAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return Insumo.INSUMO.BAJA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return Insumo.INSUMO.PRODUCCION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdinsumo();
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
    public BigDecimal value3() {
        return getCosto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getMinimo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getMaximo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getStock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getIdunidad();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getBaja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getProduccion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumoRecord value1(Integer value) {
        setIdinsumo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumoRecord value2(String value) {
        setNombre(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumoRecord value3(BigDecimal value) {
        setCosto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumoRecord value4(Double value) {
        setMinimo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumoRecord value5(Double value) {
        setMaximo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumoRecord value6(Double value) {
        setStock(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumoRecord value7(Integer value) {
        setIdunidad(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumoRecord value8(Boolean value) {
        setBaja(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumoRecord value9(Boolean value) {
        setProduccion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsumoRecord values(Integer value1, String value2, BigDecimal value3, Double value4, Double value5, Double value6, Integer value7, Boolean value8, Boolean value9) {
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
     * Create a detached InsumoRecord
     */
    public InsumoRecord() {
        super(Insumo.INSUMO);
    }

    /**
     * Create a detached, initialised InsumoRecord
     */
    public InsumoRecord(Integer idinsumo, String nombre, BigDecimal costo, Double minimo, Double maximo, Double stock, Integer idunidad, Boolean baja, Boolean produccion) {
        super(Insumo.INSUMO);

        set(0, idinsumo);
        set(1, nombre);
        set(2, costo);
        set(3, minimo);
        set(4, maximo);
        set(5, stock);
        set(6, idunidad);
        set(7, baja);
        set(8, produccion);
    }
}
