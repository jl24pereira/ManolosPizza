/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables;


import com.pereira.manolos.datos.database.Keys;
import com.pereira.manolos.datos.database.Public;
import com.pereira.manolos.datos.database.tables.records.ClienteRecord;

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
public class Cliente extends TableImpl<ClienteRecord> {

    private static final long serialVersionUID = 1512533002;

    /**
     * The reference instance of <code>public.cliente</code>
     */
    public static final Cliente CLIENTE = new Cliente();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClienteRecord> getRecordType() {
        return ClienteRecord.class;
    }

    /**
     * The column <code>public.cliente.idcliente</code>.
     */
    public final TableField<ClienteRecord, Integer> IDCLIENTE = createField("idcliente", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval(('\"cliente_idcliente_seq\"'::text)::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.cliente.nombre</code>.
     */
    public final TableField<ClienteRecord, String> NOMBRE = createField("nombre", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.cliente.direccion</code>.
     */
    public final TableField<ClienteRecord, String> DIRECCION = createField("direccion", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.cliente.telefono</code>.
     */
    public final TableField<ClienteRecord, String> TELEFONO = createField("telefono", org.jooq.impl.SQLDataType.VARCHAR.length(9), this, "");

    /**
     * The column <code>public.cliente.email</code>.
     */
    public final TableField<ClienteRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.cliente.tipo</code>.
     */
    public final TableField<ClienteRecord, String> TIPO = createField("tipo", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.cliente.baja</code>.
     */
    public final TableField<ClienteRecord, Boolean> BAJA = createField("baja", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.cliente.dui</code>.
     */
    public final TableField<ClienteRecord, String> DUI = createField("dui", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

    /**
     * Create a <code>public.cliente</code> table reference
     */
    public Cliente() {
        this("cliente", null);
    }

    /**
     * Create an aliased <code>public.cliente</code> table reference
     */
    public Cliente(String alias) {
        this(alias, CLIENTE);
    }

    private Cliente(String alias, Table<ClienteRecord> aliased) {
        this(alias, aliased, null);
    }

    private Cliente(String alias, Table<ClienteRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ClienteRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLIENTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ClienteRecord> getPrimaryKey() {
        return Keys.PK_CLIENTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClienteRecord>> getKeys() {
        return Arrays.<UniqueKey<ClienteRecord>>asList(Keys.PK_CLIENTE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cliente as(String alias) {
        return new Cliente(alias, this);
    }

    /**
     * Rename this table
     */
    public Cliente rename(String name) {
        return new Cliente(name, null);
    }
}