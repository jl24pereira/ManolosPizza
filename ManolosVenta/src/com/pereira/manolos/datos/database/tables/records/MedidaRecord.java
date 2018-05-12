/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables.records;


import com.pereira.manolos.datos.database.tables.Medida;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class MedidaRecord extends UpdatableRecordImpl<MedidaRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -1821502512;

    /**
     * Setter for <code>public.medida.idmedida</code>.
     */
    public void setIdmedida(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.medida.idmedida</code>.
     */
    public Integer getIdmedida() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.medida.detalle</code>.
     */
    public void setDetalle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.medida.detalle</code>.
     */
    public String getDetalle() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Medida.MEDIDA.IDMEDIDA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Medida.MEDIDA.DETALLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdmedida();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDetalle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedidaRecord value1(Integer value) {
        setIdmedida(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedidaRecord value2(String value) {
        setDetalle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MedidaRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MedidaRecord
     */
    public MedidaRecord() {
        super(Medida.MEDIDA);
    }

    /**
     * Create a detached, initialised MedidaRecord
     */
    public MedidaRecord(Integer idmedida, String detalle) {
        super(Medida.MEDIDA);

        set(0, idmedida);
        set(1, detalle);
    }
}
