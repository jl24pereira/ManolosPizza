package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.datos.database.Tables;
import com.pereira.manolos.negocio.modelos.ModeloCategoriaProducto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class CategoriaProductoIDAO extends Conexion implements com.pereira.manolos.negocio.dao.CategoriaProductoDAO {

    private static final Logger LOG = Logger.getLogger (
            CategoriaProductoIDAO.class.getName () );

    public CategoriaProductoIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloCategoriaProducto pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar ( ModeloCategoriaProducto categoria ) throws Exception {
        conectar ();
        categoria.setIdcategoria ( DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( Tables.CATEGORIA_PRODUCTO )
                .set ( Tables.CATEGORIA_PRODUCTO.NOMBRE , categoria.getNombre () )
                .set ( Tables.CATEGORIA_PRODUCTO.IMAGEN , categoria.getImagen () )
                .returning ().fetchOne ().getValue ( Tables.CATEGORIA_PRODUCTO.IDCATEGORIA )
        );
        desconectar ();
    }

    @Override
    public void modificar ( ModeloCategoriaProducto categoria ) throws Exception {
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).update ( Tables.CATEGORIA_PRODUCTO )
                .set ( Tables.CATEGORIA_PRODUCTO.NOMBRE , categoria.getNombre () )
                .set ( Tables.CATEGORIA_PRODUCTO.IMAGEN , categoria.getImagen () )
                .where ( Tables.CATEGORIA_PRODUCTO.IDCATEGORIA.eq ( categoria.getIdcategoria () ) )
                .execute ();
    }

    @Override
    public List<ModeloCategoriaProducto> obtenerLista ( Condition c ) throws Exception {
        List<ModeloCategoriaProducto> categorias = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ().from ( Tables.CATEGORIA_PRODUCTO )
                .where ( c )
                .orderBy ( Tables.CATEGORIA_PRODUCTO.NOMBRE.asc () )
                .fetch ();
        records.forEach ( r -> {
            categorias.add ( convertirCategoria ( r ) );
        } );
        desconectar ();
        return categorias;
    }

    private ModeloCategoriaProducto convertirCategoria ( Record r ) {
        return new ModeloCategoriaProducto ( r.getValue ( Tables.CATEGORIA_PRODUCTO.IDCATEGORIA ) , r.getValue ( Tables.CATEGORIA_PRODUCTO.IMAGEN ) ,
                                             r.getValue ( Tables.CATEGORIA_PRODUCTO.NOMBRE ) );
    }

}
