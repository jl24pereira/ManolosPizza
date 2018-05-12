/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables;


import com.pereira.manolos.datos.database.Public;
import com.pereira.manolos.datos.database.tables.records.VCifRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class VCif extends TableImpl<VCifRecord> {

    private static final long serialVersionUID = -1780621364;

    /**
     * The reference instance of <code>public.v_cif</code>
     */
    public static final VCif V_CIF = new VCif();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VCifRecord> getRecordType() {
        return VCifRecord.class;
    }

    /**
     * The column <code>public.v_cif.cif</code>.
     */
    public final TableField<VCifRecord, BigDecimal> CIF = createField("cif", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.v_cif.tasacif</code>.
     */
    public final TableField<VCifRecord, Double> TASACIF = createField("tasacif", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>public.v_cif</code> table reference
     */
    public VCif() {
        this("v_cif", null);
    }

    /**
     * Create an aliased <code>public.v_cif</code> table reference
     */
    public VCif(String alias) {
        this(alias, V_CIF);
    }

    private VCif(String alias, Table<VCifRecord> aliased) {
        this(alias, aliased, null);
    }

    private VCif(String alias, Table<VCifRecord> aliased, Field<?>[] parameters) {
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
    public VCif as(String alias) {
        return new VCif(alias, this);
    }

    /**
     * Rename this table
     */
    public VCif rename(String name) {
        return new VCif(name, null);
    }
}
