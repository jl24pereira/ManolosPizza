/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables;


import com.pereira.manolos.datos.database.Keys;
import com.pereira.manolos.datos.database.Public;
import com.pereira.manolos.datos.database.tables.records.CotizacionRecord;

import java.math.BigDecimal;
import java.sql.Date;
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
public class Cotizacion extends TableImpl<CotizacionRecord> {

    private static final long serialVersionUID = -211696335;

    /**
     * The reference instance of <code>public.cotizacion</code>
     */
    public static final Cotizacion COTIZACION = new Cotizacion();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CotizacionRecord> getRecordType() {
        return CotizacionRecord.class;
    }

    /**
     * The column <code>public.cotizacion.idcotizacion</code>.
     */
    public final TableField<CotizacionRecord, Integer> IDCOTIZACION = createField("idcotizacion", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval(('\"cotizacion_idcotizacion_seq\"'::text)::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.cotizacion.numero</code>.
     */
    public final TableField<CotizacionRecord, String> NUMERO = createField("numero", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

    /**
     * The column <code>public.cotizacion.fecha</code>.
     */
    public final TableField<CotizacionRecord, Date> FECHA = createField("fecha", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>public.cotizacion.idcliente</code>.
     */
    public final TableField<CotizacionRecord, Integer> IDCLIENTE = createField("idcliente", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.cotizacion.idempleado</code>.
     */
    public final TableField<CotizacionRecord, Integer> IDEMPLEADO = createField("idempleado", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.cotizacion.vencimiento</code>.
     */
    public final TableField<CotizacionRecord, Date> VENCIMIENTO = createField("vencimiento", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>public.cotizacion.total</code>.
     */
    public final TableField<CotizacionRecord, BigDecimal> TOTAL = createField("total", org.jooq.impl.SQLDataType.NUMERIC.precision(6, 2), this, "");

    /**
     * The column <code>public.cotizacion.enletras</code>.
     */
    public final TableField<CotizacionRecord, String> ENLETRAS = createField("enletras", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.cotizacion.validapor</code>.
     */
    public final TableField<CotizacionRecord, Integer> VALIDAPOR = createField("validapor", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.cotizacion</code> table reference
     */
    public Cotizacion() {
        this("cotizacion", null);
    }

    /**
     * Create an aliased <code>public.cotizacion</code> table reference
     */
    public Cotizacion(String alias) {
        this(alias, COTIZACION);
    }

    private Cotizacion(String alias, Table<CotizacionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Cotizacion(String alias, Table<CotizacionRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CotizacionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COTIZACION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CotizacionRecord> getPrimaryKey() {
        return Keys.PK_COTIZACION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CotizacionRecord>> getKeys() {
        return Arrays.<UniqueKey<CotizacionRecord>>asList(Keys.PK_COTIZACION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CotizacionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CotizacionRecord, ?>>asList(Keys.COTIZACION__FK_COTIZACION_CLIENTE_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cotizacion as(String alias) {
        return new Cotizacion(alias, this);
    }

    /**
     * Rename this table
     */
    public Cotizacion rename(String name) {
        return new Cotizacion(name, null);
    }
}