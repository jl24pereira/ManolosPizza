/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables.records;


import com.pereira.manolos.datos.database.tables.Permisos;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class PermisosRecord extends TableRecordImpl<PermisosRecord> implements Record3<Integer, Boolean, Integer> {

    private static final long serialVersionUID = -1148066240;

    /**
     * Setter for <code>public.permisos.idmodulo</code>.
     */
    public void setIdmodulo(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.permisos.idmodulo</code>.
     */
    public Integer getIdmodulo() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.permisos.permiso</code>.
     */
    public void setPermiso(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.permisos.permiso</code>.
     */
    public Boolean getPermiso() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>public.permisos.idempleado</code>.
     */
    public void setIdempleado(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.permisos.idempleado</code>.
     */
    public Integer getIdempleado() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Boolean, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Boolean, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Permisos.PERMISOS.IDMODULO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return Permisos.PERMISOS.PERMISO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Permisos.PERMISOS.IDEMPLEADO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdmodulo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value2() {
        return getPermiso();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getIdempleado();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PermisosRecord value1(Integer value) {
        setIdmodulo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PermisosRecord value2(Boolean value) {
        setPermiso(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PermisosRecord value3(Integer value) {
        setIdempleado(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PermisosRecord values(Integer value1, Boolean value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PermisosRecord
     */
    public PermisosRecord() {
        super(Permisos.PERMISOS);
    }

    /**
     * Create a detached, initialised PermisosRecord
     */
    public PermisosRecord(Integer idmodulo, Boolean permiso, Integer idempleado) {
        super(Permisos.PERMISOS);

        set(0, idmodulo);
        set(1, permiso);
        set(2, idempleado);
    }
}