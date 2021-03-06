/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables;


import com.pereira.manolos.datos.database.Public;
import com.pereira.manolos.datos.database.tables.records.VAsociadoRecetaRecord;

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
public class VAsociadoReceta extends TableImpl<VAsociadoRecetaRecord> {

    private static final long serialVersionUID = -491597325;

    /**
     * The reference instance of <code>public.v_asociado_receta</code>
     */
    public static final VAsociadoReceta V_ASOCIADO_RECETA = new VAsociadoReceta();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VAsociadoRecetaRecord> getRecordType() {
        return VAsociadoRecetaRecord.class;
    }

    /**
     * The column <code>public.v_asociado_receta.idreceta</code>.
     */
    public final TableField<VAsociadoRecetaRecord, Integer> IDRECETA = createField("idreceta", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.v_asociado_receta.receta</code>.
     */
    public final TableField<VAsociadoRecetaRecord, String> RECETA = createField("receta", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.v_asociado_receta.ingrediente</code>.
     */
    public final TableField<VAsociadoRecetaRecord, Integer> INGREDIENTE = createField("ingrediente", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.v_asociado_receta.nombre</code>.
     */
    public final TableField<VAsociadoRecetaRecord, String> NOMBRE = createField("nombre", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.v_asociado_receta</code> table reference
     */
    public VAsociadoReceta() {
        this("v_asociado_receta", null);
    }

    /**
     * Create an aliased <code>public.v_asociado_receta</code> table reference
     */
    public VAsociadoReceta(String alias) {
        this(alias, V_ASOCIADO_RECETA);
    }

    private VAsociadoReceta(String alias, Table<VAsociadoRecetaRecord> aliased) {
        this(alias, aliased, null);
    }

    private VAsociadoReceta(String alias, Table<VAsociadoRecetaRecord> aliased, Field<?>[] parameters) {
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
    public VAsociadoReceta as(String alias) {
        return new VAsociadoReceta(alias, this);
    }

    /**
     * Rename this table
     */
    public VAsociadoReceta rename(String name) {
        return new VAsociadoReceta(name, null);
    }
}
