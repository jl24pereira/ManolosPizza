/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables;


import com.pereira.manolos.datos.database.Public;
import com.pereira.manolos.datos.database.tables.records.VComprasRecord;

import java.math.BigDecimal;
import java.sql.Date;

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
public class VCompras extends TableImpl<VComprasRecord> {

    private static final long serialVersionUID = -1984180834;

    /**
     * The reference instance of <code>public.v_compras</code>
     */
    public static final VCompras V_COMPRAS = new VCompras();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VComprasRecord> getRecordType() {
        return VComprasRecord.class;
    }

    /**
     * The column <code>public.v_compras.idproveedor</code>.
     */
    public final TableField<VComprasRecord, Integer> IDPROVEEDOR = createField("idproveedor", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.v_compras.nombre</code>.
     */
    public final TableField<VComprasRecord, String> NOMBRE = createField("nombre", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.v_compras.fecha</code>.
     */
    public final TableField<VComprasRecord, Date> FECHA = createField("fecha", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>public.v_compras.tipodocumento</code>.
     */
    public final TableField<VComprasRecord, String> TIPODOCUMENTO = createField("tipodocumento", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.v_compras.numerodocumento</code>.
     */
    public final TableField<VComprasRecord, String> NUMERODOCUMENTO = createField("numerodocumento", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.v_compras.pagos</code>.
     */
    public final TableField<VComprasRecord, BigDecimal> PAGOS = createField("pagos", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.v_compras.pendiente</code>.
     */
    public final TableField<VComprasRecord, BigDecimal> PENDIENTE = createField("pendiente", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.v_compras.total</code>.
     */
    public final TableField<VComprasRecord, BigDecimal> TOTAL = createField("total", org.jooq.impl.SQLDataType.NUMERIC.precision(6, 2), this, "");

    /**
     * The column <code>public.v_compras.pagado</code>.
     */
    public final TableField<VComprasRecord, Boolean> PAGADO = createField("pagado", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.v_compras.idcompra</code>.
     */
    public final TableField<VComprasRecord, Integer> IDCOMPRA = createField("idcompra", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.v_compras</code> table reference
     */
    public VCompras() {
        this("v_compras", null);
    }

    /**
     * Create an aliased <code>public.v_compras</code> table reference
     */
    public VCompras(String alias) {
        this(alias, V_COMPRAS);
    }

    private VCompras(String alias, Table<VComprasRecord> aliased) {
        this(alias, aliased, null);
    }

    private VCompras(String alias, Table<VComprasRecord> aliased, Field<?>[] parameters) {
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
    public VCompras as(String alias) {
        return new VCompras(alias, this);
    }

    /**
     * Rename this table
     */
    public VCompras rename(String name) {
        return new VCompras(name, null);
    }
}
