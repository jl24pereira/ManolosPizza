/**
 * This class is generated by jOOQ
 */
package com.pereira.manolos.datos.database.tables.records;


import com.pereira.manolos.datos.database.tables.CategoriaProducto;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CategoriaProductoRecord extends UpdatableRecordImpl<CategoriaProductoRecord> implements Record3<Integer, String, byte[]> {

    private static final long serialVersionUID = -1080579530;

    /**
     * Setter for <code>public.categoria_producto.idcategoria</code>.
     */
    public void setIdcategoria(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.categoria_producto.idcategoria</code>.
     */
    public Integer getIdcategoria() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.categoria_producto.nombre</code>.
     */
    public void setNombre(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.categoria_producto.nombre</code>.
     */
    public String getNombre() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.categoria_producto.imagen</code>.
     */
    public void setImagen(byte[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.categoria_producto.imagen</code>.
     */
    public byte[] getImagen() {
        return (byte[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, byte[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, byte[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CategoriaProducto.CATEGORIA_PRODUCTO.IDCATEGORIA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CategoriaProducto.CATEGORIA_PRODUCTO.NOMBRE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field3() {
        return CategoriaProducto.CATEGORIA_PRODUCTO.IMAGEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdcategoria();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNombre();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value3() {
        return getImagen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoriaProductoRecord value1(Integer value) {
        setIdcategoria(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoriaProductoRecord value2(String value) {
        setNombre(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoriaProductoRecord value3(byte[] value) {
        setImagen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoriaProductoRecord values(Integer value1, String value2, byte[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CategoriaProductoRecord
     */
    public CategoriaProductoRecord() {
        super(CategoriaProducto.CATEGORIA_PRODUCTO);
    }

    /**
     * Create a detached, initialised CategoriaProductoRecord
     */
    public CategoriaProductoRecord(Integer idcategoria, String nombre, byte[] imagen) {
        super(CategoriaProducto.CATEGORIA_PRODUCTO);

        set(0, idcategoria);
        set(1, nombre);
        set(2, imagen);
    }
}
