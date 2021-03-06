/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables;


import com.pereira.manolos.datos.database.Public;
import com.pereira.manolos.datos.database.tables.records.VVentaRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;

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
public class VVenta extends TableImpl<VVentaRecord> {

    private static final long serialVersionUID = 1098210401;

    /**
     * The reference instance of <code>public.v_venta</code>
     */
    public static final VVenta V_VENTA = new VVenta();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VVentaRecord> getRecordType() {
        return VVentaRecord.class;
    }

    /**
     * The column <code>public.v_venta.idventa</code>.
     */
    public final TableField<VVentaRecord, Integer> IDVENTA = createField("idventa", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.v_venta.numerofactura</code>.
     */
    public final TableField<VVentaRecord, String> NUMEROFACTURA = createField("numerofactura", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.v_venta.fecha</code>.
     */
    public final TableField<VVentaRecord, Timestamp> FECHA = createField("fecha", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.v_venta.cliente</code>.
     */
    public final TableField<VVentaRecord, String> CLIENTE = createField("cliente", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.v_venta.direccion</code>.
     */
    public final TableField<VVentaRecord, String> DIRECCION = createField("direccion", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.v_venta.telefono</code>.
     */
    public final TableField<VVentaRecord, String> TELEFONO = createField("telefono", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.v_venta.dui</code>.
     */
    public final TableField<VVentaRecord, String> DUI = createField("dui", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.v_venta.total</code>.
     */
    public final TableField<VVentaRecord, BigDecimal> TOTAL = createField("total", org.jooq.impl.SQLDataType.NUMERIC.precision(6, 2), this, "");

    /**
     * The column <code>public.v_venta.gravado</code>.
     */
    public final TableField<VVentaRecord, BigDecimal> GRAVADO = createField("gravado", org.jooq.impl.SQLDataType.NUMERIC.precision(7, 2), this, "");

    /**
     * The column <code>public.v_venta.exento</code>.
     */
    public final TableField<VVentaRecord, BigDecimal> EXENTO = createField("exento", org.jooq.impl.SQLDataType.NUMERIC.precision(7, 2), this, "");

    /**
     * The column <code>public.v_venta.nosujeto</code>.
     */
    public final TableField<VVentaRecord, BigDecimal> NOSUJETO = createField("nosujeto", org.jooq.impl.SQLDataType.NUMERIC.precision(7, 2), this, "");

    /**
     * The column <code>public.v_venta.tipodoc</code>.
     */
    public final TableField<VVentaRecord, String> TIPODOC = createField("tipodoc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.v_venta.tipoventa</code>.
     */
    public final TableField<VVentaRecord, String> TIPOVENTA = createField("tipoventa", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.v_venta.empleado</code>.
     */
    public final TableField<VVentaRecord, String> EMPLEADO = createField("empleado", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.v_venta.caja</code>.
     */
    public final TableField<VVentaRecord, String> CAJA = createField("caja", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.v_venta.resolucion</code>.
     */
    public final TableField<VVentaRecord, String> RESOLUCION = createField("resolucion", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.v_venta.tktinicial</code>.
     */
    public final TableField<VVentaRecord, Integer> TKTINICIAL = createField("tktinicial", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.v_venta.tktfinal</code>.
     */
    public final TableField<VVentaRecord, Integer> TKTFINAL = createField("tktfinal", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.v_venta.tktactual</code>.
     */
    public final TableField<VVentaRecord, Integer> TKTACTUAL = createField("tktactual", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.v_venta.serie</code>.
     */
    public final TableField<VVentaRecord, String> SERIE = createField("serie", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.v_venta.enletras</code>.
     */
    public final TableField<VVentaRecord, String> ENLETRAS = createField("enletras", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.v_venta</code> table reference
     */
    public VVenta() {
        this("v_venta", null);
    }

    /**
     * Create an aliased <code>public.v_venta</code> table reference
     */
    public VVenta(String alias) {
        this(alias, V_VENTA);
    }

    private VVenta(String alias, Table<VVentaRecord> aliased) {
        this(alias, aliased, null);
    }

    private VVenta(String alias, Table<VVentaRecord> aliased, Field<?>[] parameters) {
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
    public VVenta as(String alias) {
        return new VVenta(alias, this);
    }

    /**
     * Rename this table
     */
    public VVenta rename(String name) {
        return new VVenta(name, null);
    }
}
