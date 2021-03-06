/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables;


import com.pereira.manolos.datos.database.Keys;
import com.pereira.manolos.datos.database.Public;
import com.pereira.manolos.datos.database.tables.records.VentaRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Venta extends TableImpl<VentaRecord> {

    private static final long serialVersionUID = 1068272116;

    /**
     * The reference instance of <code>public.venta</code>
     */
    public static final Venta VENTA = new Venta();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VentaRecord> getRecordType() {
        return VentaRecord.class;
    }

    /**
     * The column <code>public.venta.idventa</code>.
     */
    public final TableField<VentaRecord, Integer> IDVENTA = createField("idventa", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval(('\"venta_idventa_seq\"'::text)::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.venta.numerofactura</code>.
     */
    public final TableField<VentaRecord, String> NUMEROFACTURA = createField("numerofactura", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.venta.fecha</code>.
     */
    public final TableField<VentaRecord, Timestamp> FECHA = createField("fecha", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.venta.idcliente</code>.
     */
    public final TableField<VentaRecord, Integer> IDCLIENTE = createField("idcliente", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.venta.idempleado</code>.
     */
    public final TableField<VentaRecord, Integer> IDEMPLEADO = createField("idempleado", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.venta.total</code>.
     */
    public final TableField<VentaRecord, BigDecimal> TOTAL = createField("total", org.jooq.impl.SQLDataType.NUMERIC.precision(6, 2), this, "");

    /**
     * The column <code>public.venta.enletras</code>.
     */
    public final TableField<VentaRecord, String> ENLETRAS = createField("enletras", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.venta.tipodoc</code>.
     */
    public final TableField<VentaRecord, String> TIPODOC = createField("tipodoc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.venta.tipoventa</code>.
     */
    public final TableField<VentaRecord, String> TIPOVENTA = createField("tipoventa", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.venta.idresolucion</code>.
     */
    public final TableField<VentaRecord, Integer> IDRESOLUCION = createField("idresolucion", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.venta.gravado</code>.
     */
    public final TableField<VentaRecord, BigDecimal> GRAVADO = createField("gravado", org.jooq.impl.SQLDataType.NUMERIC.precision(7, 2), this, "");

    /**
     * The column <code>public.venta.exento</code>.
     */
    public final TableField<VentaRecord, BigDecimal> EXENTO = createField("exento", org.jooq.impl.SQLDataType.NUMERIC.precision(7, 2), this, "");

    /**
     * The column <code>public.venta.nosujeto</code>.
     */
    public final TableField<VentaRecord, BigDecimal> NOSUJETO = createField("nosujeto", org.jooq.impl.SQLDataType.NUMERIC.precision(7, 2), this, "");

    /**
     * Create a <code>public.venta</code> table reference
     */
    public Venta() {
        this("venta", null);
    }

    /**
     * Create an aliased <code>public.venta</code> table reference
     */
    public Venta(String alias) {
        this(alias, VENTA);
    }

    private Venta(String alias, Table<VentaRecord> aliased) {
        this(alias, aliased, null);
    }

    private Venta(String alias, Table<VentaRecord> aliased, Field<?>[] parameters) {
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
    public Identity<VentaRecord, Integer> getIdentity() {
        return Keys.IDENTITY_VENTA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VentaRecord> getPrimaryKey() {
        return Keys.PK_VENTA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VentaRecord>> getKeys() {
        return Arrays.<UniqueKey<VentaRecord>>asList(Keys.PK_VENTA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<VentaRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VentaRecord, ?>>asList(Keys.VENTA__FK_VENTA_CLIENTE_1, Keys.VENTA__FK_VENTA_EMPLEADO_1, Keys.VENTA__FK_VENTA_RESOLUCION_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Venta as(String alias) {
        return new Venta(alias, this);
    }

    /**
     * Rename this table
     */
    public Venta rename(String name) {
        return new Venta(name, null);
    }
}
