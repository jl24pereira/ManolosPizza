/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.CompraDAO;
import com.pereira.manolos.negocio.modelos.ModeloCompra;
import com.pereira.manolos.util.Fechero;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.COMPRA;

/**
 *
 * @author Jose Luis
 */
public class CompraIDAO extends Conexion implements CompraDAO {

    private static final Logger LOG = Logger.getLogger ( CompraIDAO.class.
            getName () );

    public CompraIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloCompra pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar ( ModeloCompra pT ) throws Exception {
        conectar ();
        pT.setIdcompra ( DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( COMPRA )
                .set ( COMPRA.NUMERODOCUMENTO , pT.getNumeroDocumento () )
                .set ( COMPRA.FECHA , Fechero.dateToBase ( pT.getFecha () ) )
                .set ( COMPRA.IDPROVEEDOR , pT.getProveedor ().getIdproveedor () )
                .set ( COMPRA.TIPODOCUMENTO , pT.getTipoDocumento () )
                .set ( COMPRA.TOTAL , pT.getTotal () )
                .returning ().fetchOne ().getValue ( COMPRA.IDCOMPRA )
        );
        desconectar ();
    }

    @Override
    public void modificar ( ModeloCompra pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloCompra> obtenerLista ( Condition pCondition ) throws Exception {
        List<ModeloCompra> compras = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( COMPRA )
                .where ( pCondition )
                .orderBy ( COMPRA.FECHA.asc () )
                .fetch ();
        records.forEach ( r -> {
            compras.add ( convertirCompra ( r ) );
        } );
        desconectar ();
        return compras;
    }

    private ModeloCompra convertirCompra ( Record r ) {
        return new ModeloCompra ( r.getValue ( COMPRA.IDCOMPRA ) , null , r.getValue ( COMPRA.NUMERODOCUMENTO ) ,
                                  Fechero.baseToDate ( r.getValue ( COMPRA.FECHA ) ) , r.getValue ( COMPRA.TIPODOCUMENTO ) ,
                                  r.getValue ( COMPRA.TOTAL ) );
    }

}
