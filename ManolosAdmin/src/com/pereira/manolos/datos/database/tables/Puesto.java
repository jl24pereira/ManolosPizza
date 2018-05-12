/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables;


import com.pereira.manolos.datos.database.Keys;
import com.pereira.manolos.datos.database.Public;
import com.pereira.manolos.datos.database.tables.records.PuestoRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Puesto extends TableImpl<PuestoRecord> {

    private static final long serialVersionUID = -1597575389;

    /**
     * The reference instance of <code>public.puesto</code>
     */
    public static final Puesto PUESTO = new Puesto();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PuestoRecord> getRecordType() {
        return PuestoRecord.class;
    }

    /**
     * The column <code>public.puesto.idpuesto</code>.
     */
    public final TableField<PuestoRecord, Integer> IDPUESTO = createField("idpuesto", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('puesto_idpuesto_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.puesto.nombre</code>.
     */
    public final TableField<PuestoRecord, String> NOMBRE = createField("nombre", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.puesto.salariodia</code>.
     */
    public final TableField<PuestoRecord, BigDecimal> SALARIODIA = createField("salariodia", org.jooq.impl.SQLDataType.NUMERIC.precision(6, 2), this, "");

    /**
     * The column <code>public.puesto.diaslaborales</code>.
     */
    public final TableField<PuestoRecord, Integer> DIASLABORALES = createField("diaslaborales", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.puesto.mod</code>.
     */
    public final TableField<PuestoRecord, Boolean> MOD = createField("mod", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>public.puesto</code> table reference
     */
    public Puesto() {
        this("puesto", null);
    }

    /**
     * Create an aliased <code>public.puesto</code> table reference
     */
    public Puesto(String alias) {
        this(alias, PUESTO);
    }

    private Puesto(String alias, Table<PuestoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Puesto(String alias, Table<PuestoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PuestoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PUESTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PuestoRecord> getPrimaryKey() {
        return Keys.PUESTO_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PuestoRecord>> getKeys() {
        return Arrays.<UniqueKey<PuestoRecord>>asList(Keys.PUESTO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Puesto as(String alias) {
        return new Puesto(alias, this);
    }

    /**
     * Rename this table
     */
    public Puesto rename(String name) {
        return new Puesto(name, null);
    }
}
