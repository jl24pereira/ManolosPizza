/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables;


import com.pereira.manolos.datos.database.Public;
import com.pereira.manolos.datos.database.tables.records.VRecetasRecord;

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
public class VRecetas extends TableImpl<VRecetasRecord> {

    private static final long serialVersionUID = 1461465461;

    /**
     * The reference instance of <code>public.v_recetas</code>
     */
    public static final VRecetas V_RECETAS = new VRecetas();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VRecetasRecord> getRecordType() {
        return VRecetasRecord.class;
    }

    /**
     * The column <code>public.v_recetas.idreceta</code>.
     */
    public final TableField<VRecetasRecord, Integer> IDRECETA = createField("idreceta", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.v_recetas.nombre</code>.
     */
    public final TableField<VRecetasRecord, String> NOMBRE = createField("nombre", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.v_recetas.tiporeceta</code>.
     */
    public final TableField<VRecetasRecord, String> TIPORECETA = createField("tiporeceta", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.v_recetas.costo</code>.
     */
    public final TableField<VRecetasRecord, BigDecimal> COSTO = createField("costo", org.jooq.impl.SQLDataType.NUMERIC.precision(7, 4), this, "");

    /**
     * The column <code>public.v_recetas.horas</code>.
     */
    public final TableField<VRecetasRecord, Integer> HORAS = createField("horas", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.v_recetas.minutos</code>.
     */
    public final TableField<VRecetasRecord, Integer> MINUTOS = createField("minutos", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.v_recetas.stock</code>.
     */
    public final TableField<VRecetasRecord, Double> STOCK = createField("stock", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.v_recetas.rendimiento</code>.
     */
    public final TableField<VRecetasRecord, Double> RENDIMIENTO = createField("rendimiento", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.v_recetas.idunidad</code>.
     */
    public final TableField<VRecetasRecord, Integer> IDUNIDAD = createField("idunidad", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.v_recetas.unidad</code>.
     */
    public final TableField<VRecetasRecord, String> UNIDAD = createField("unidad", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>public.v_recetas.baja</code>.
     */
    public final TableField<VRecetasRecord, Boolean> BAJA = createField("baja", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.v_recetas.minimo</code>.
     */
    public final TableField<VRecetasRecord, Double> MINIMO = createField("minimo", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.v_recetas.maximo</code>.
     */
    public final TableField<VRecetasRecord, Double> MAXIMO = createField("maximo", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>public.v_recetas</code> table reference
     */
    public VRecetas() {
        this("v_recetas", null);
    }

    /**
     * Create an aliased <code>public.v_recetas</code> table reference
     */
    public VRecetas(String alias) {
        this(alias, V_RECETAS);
    }

    private VRecetas(String alias, Table<VRecetasRecord> aliased) {
        this(alias, aliased, null);
    }

    private VRecetas(String alias, Table<VRecetasRecord> aliased, Field<?>[] parameters) {
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
    public VRecetas as(String alias) {
        return new VRecetas(alias, this);
    }

    /**
     * Rename this table
     */
    public VRecetas rename(String name) {
        return new VRecetas(name, null);
    }
}
