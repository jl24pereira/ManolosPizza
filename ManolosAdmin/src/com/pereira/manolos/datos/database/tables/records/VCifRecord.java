/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables.records;


import com.pereira.manolos.datos.database.tables.VCif;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class VCifRecord extends TableRecordImpl<VCifRecord> implements Record2<BigDecimal, Double> {

    private static final long serialVersionUID = -39744450;

    /**
     * Setter for <code>public.v_cif.cif</code>.
     */
    public void setCif(BigDecimal value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.v_cif.cif</code>.
     */
    public BigDecimal getCif() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>public.v_cif.tasacif</code>.
     */
    public void setTasacif(Double value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.v_cif.tasacif</code>.
     */
    public Double getTasacif() {
        return (Double) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<BigDecimal, Double> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<BigDecimal, Double> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return VCif.V_CIF.CIF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field2() {
        return VCif.V_CIF.TASACIF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value1() {
        return getCif();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value2() {
        return getTasacif();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VCifRecord value1(BigDecimal value) {
        setCif(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VCifRecord value2(Double value) {
        setTasacif(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VCifRecord values(BigDecimal value1, Double value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VCifRecord
     */
    public VCifRecord() {
        super(VCif.V_CIF);
    }

    /**
     * Create a detached, initialised VCifRecord
     */
    public VCifRecord(BigDecimal cif, Double tasacif) {
        super(VCif.V_CIF);

        set(0, cif);
        set(1, tasacif);
    }
}