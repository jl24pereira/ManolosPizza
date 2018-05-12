/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables.records;


import com.pereira.manolos.datos.database.tables.Usuario;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class UsuarioRecord extends TableRecordImpl<UsuarioRecord> implements Record3<String, String, Integer> {

    private static final long serialVersionUID = 1534573534;

    /**
     * Setter for <code>public.usuario.usuario</code>.
     */
    public void setUsuario(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.usuario.usuario</code>.
     */
    public String getUsuario() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.usuario.pass</code>.
     */
    public void setPass(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.usuario.pass</code>.
     */
    public String getPass() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.usuario.idempleado</code>.
     */
    public void setIdempleado(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.usuario.idempleado</code>.
     */
    public Integer getIdempleado() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Usuario.USUARIO.USUARIO_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Usuario.USUARIO.PASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Usuario.USUARIO.IDEMPLEADO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUsuario();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getIdempleado();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsuarioRecord value1(String value) {
        setUsuario(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsuarioRecord value2(String value) {
        setPass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsuarioRecord value3(Integer value) {
        setIdempleado(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsuarioRecord values(String value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsuarioRecord
     */
    public UsuarioRecord() {
        super(Usuario.USUARIO);
    }

    /**
     * Create a detached, initialised UsuarioRecord
     */
    public UsuarioRecord(String usuario, String pass, Integer idempleado) {
        super(Usuario.USUARIO);

        set(0, usuario);
        set(1, pass);
        set(2, idempleado);
    }
}
