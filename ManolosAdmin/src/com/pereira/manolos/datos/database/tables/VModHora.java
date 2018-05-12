/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables;


import com.pereira.manolos.datos.database.Public;
import com.pereira.manolos.datos.database.tables.records.VModHoraRecord;

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
public class VModHora extends TableImpl<VModHoraRecord> {

    private static final long serialVersionUID = 1590162448;

    /**
     * The reference instance of <code>public.v_mod_hora</code>
     */
    public static final VModHora V_MOD_HORA = new VModHora();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VModHoraRecord> getRecordType() {
        return VModHoraRecord.class;
    }

    /**
     * The column <code>public.v_mod_hora.mod</code>.
     */
    public final TableField<VModHoraRecord, BigDecimal> MOD = createField("mod", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * Create a <code>public.v_mod_hora</code> table reference
     */
    public VModHora() {
        this("v_mod_hora", null);
    }

    /**
     * Create an aliased <code>public.v_mod_hora</code> table reference
     */
    public VModHora(String alias) {
        this(alias, V_MOD_HORA);
    }

    private VModHora(String alias, Table<VModHoraRecord> aliased) {
        this(alias, aliased, null);
    }

    private VModHora(String alias, Table<VModHoraRecord> aliased, Field<?>[] parameters) {
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
    public VModHora as(String alias) {
        return new VModHora(alias, this);
    }

    /**
     * Rename this table
     */
    public VModHora rename(String name) {
        return new VModHora(name, null);
    }
}