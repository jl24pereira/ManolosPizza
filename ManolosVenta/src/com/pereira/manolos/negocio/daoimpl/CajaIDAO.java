package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.modelos.ModeloCaja;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.CAJA;
import static org.jooq.impl.DSL.count;

public class CajaIDAO extends Conexion implements com.pereira.manolos.negocio.dao.CajaDAO {

    private static final Logger LOG = Logger.getLogger ( CajaIDAO.class.
            getName () );

    public CajaIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloCaja pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModeloCaja findByIp ( String pIp ) throws Exception {
        conectar ();
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ().from ( CAJA )
                .where ( CAJA.IPCAJA.eq ( pIp ) )
                .fetchOne ();
        desconectar ();
        return convertirCaja ( r );
    }

    @Override
    public void insertar ( ModeloCaja pT ) throws Exception {
        conectar ();
        pT.setIdcaja ( DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .insertInto ( CAJA )
                .set ( CAJA.DETALLE , pT.getDetalle () )
                .set ( CAJA.ESTADO , false )
                .set ( CAJA.IPCAJA , pT.getIpCaja () )
                .returning ().fetchOne ().getValue ( CAJA.IDCAJA )
        );
        desconectar ();
    }

    @Override
    public boolean isCaja ( String ip ) throws Exception {
        conectar ();
        int cant = 0;
        cant = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ( count () )
                .from ( CAJA )
                .where ( CAJA.IPCAJA.eq ( ip ) )
                .fetchOne ().getValue ( count () );
        desconectar ();
        return cant != 0;
    }

    @Override
    public boolean isOpen ( ModeloCaja caja ) throws Exception {
        conectar ();
        boolean isOpen = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ( CAJA.ESTADO )
                .from ( CAJA )
                .where ( CAJA.IDCAJA.equal ( caja.getIdcaja () ) )
                .fetchOne ().getValue ( CAJA.ESTADO );
        desconectar ();
        return isOpen;
    }

    @Override
    public void modificar ( ModeloCaja pT ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .update ( CAJA )
                .set ( CAJA.DETALLE , pT.getDetalle () )
                .set ( CAJA.ESTADO , pT.isEstado () )
                .set ( CAJA.IPCAJA , pT.getIpCaja () )
                .set ( CAJA.BAJA , pT.isBaja () )
                .where ( CAJA.IDCAJA.equal ( pT.getIdcaja () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloCaja> obtenerLista ( Condition pCondition ) throws Exception {
        List<ModeloCaja> cajas = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( CAJA )
                .where ( pCondition )
                .orderBy ( CAJA.DETALLE.asc () )
                .fetch ();
        records.forEach ( r -> {
            cajas.add ( convertirCaja ( r ) );
        } );
        desconectar ();
        return cajas;
    }

    private ModeloCaja convertirCaja ( Record r ) {
        return new ModeloCaja (
                r.getValue ( CAJA.BAJA ) ,
                r.getValue ( CAJA.DETALLE ) ,
                r.getValue ( CAJA.ESTADO ) ,
                r.getValue ( CAJA.IDCAJA ) ,
                r.getValue ( CAJA.IPCAJA )
        );
    }

}
