/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.datos.database.Tables;
import com.pereira.manolos.negocio.dao.ResolucionDAO;
import com.pereira.manolos.negocio.modelos.ModeloCaja;
import com.pereira.manolos.negocio.modelos.ModeloResolucion;
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

import static com.pereira.manolos.datos.database.Tables.CAJA;

/**
 *
 * @author Jose Luis
 */
public class ResolucionIDAO extends Conexion implements ResolucionDAO {

    private static final Logger LOG = Logger.getLogger ( ResolucionIDAO.class.getName () );

    public ResolucionIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloResolucion pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModeloResolucion getResolucionByCaja ( ModeloCaja pCaja ) throws Exception {
        ModeloResolucion res = null;
        conectar ();
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ().from ( Tables.RESOLUCION )
                .where ( Tables.RESOLUCION.IDCAJA.eq ( pCaja.getIdcaja () ).and ( Tables.RESOLUCION.ACTIVA.eq ( true ) ) )
                .fetchOne ();
        if ( r == null ) {
            desconectar ();
            return null;
        } else {
            res = convertirResolucion ( r );
        }
        desconectar ();
        return res;
    }

    @Override
    public void insertar ( ModeloResolucion resolucion ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( Tables.RESOLUCION )
                .set ( Tables.RESOLUCION.RESOLUCION_ , resolucion.getResolucion () )
                .set ( Tables.RESOLUCION.TKTINICIAL , resolucion.getTktinicial () )
                .set ( Tables.RESOLUCION.TKTFINAL , resolucion.getTktfinal () )
                .set ( Tables.RESOLUCION.TKTACTUAL , resolucion.getTktactual () )
                .set ( Tables.RESOLUCION.TKTALERTA , resolucion.getTktalerta () )
                .set ( Tables.RESOLUCION.SERIE , resolucion.getSerie () )
                .set ( Tables.RESOLUCION.FECHA , Fechero.dateToBase ( resolucion.getFecha () ) )
                .set ( Tables.RESOLUCION.IDCAJA , resolucion.getCaja ().getIdcaja () )
                .execute ();
        desconectar ();
    }

    @Override
    public void modificar ( ModeloResolucion resolucion ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).update ( Tables.RESOLUCION )
                .set ( Tables.RESOLUCION.RESOLUCION_ , resolucion.getResolucion () )
                .set ( Tables.RESOLUCION.TKTINICIAL , resolucion.getTktinicial () )
                .set ( Tables.RESOLUCION.TKTFINAL , resolucion.getTktfinal () )
                .set ( Tables.RESOLUCION.TKTACTUAL , resolucion.getTktactual () )
                .set ( Tables.RESOLUCION.TKTALERTA , resolucion.getTktalerta () )
                .set ( Tables.RESOLUCION.SERIE , resolucion.getSerie () )
                .set ( Tables.RESOLUCION.FECHA , Fechero.dateToBase ( resolucion.getFecha () ) )
                .set ( Tables.RESOLUCION.IDCAJA , resolucion.getCaja ().getIdcaja () )
                .set ( Tables.RESOLUCION.ACTIVA , resolucion.isActiva () )
                .where ( Tables.RESOLUCION.IDRESOLUCION.eq ( resolucion.getIdresolucion () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloResolucion> obtenerLista ( Condition c ) throws Exception {
        List<ModeloResolucion> resoluciones = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ().from ( Tables.RESOLUCION )
                .where ( c ).fetch ();
        records.forEach ( r -> {
            resoluciones.add ( convertirResolucion ( r ) );
        } );
        desconectar ();
        return resoluciones;
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

    private ModeloResolucion convertirResolucion ( Record r ) {
        return new ModeloResolucion ( r.getValue ( Tables.RESOLUCION.IDRESOLUCION ) , r.getValue ( Tables.RESOLUCION.RESOLUCION_ ) ,
                                      r.getValue ( Tables.RESOLUCION.TKTINICIAL ) , r.getValue ( Tables.RESOLUCION.TKTFINAL ) ,
                                      r.getValue ( Tables.RESOLUCION.TKTACTUAL ) , r.getValue ( Tables.RESOLUCION.TKTALERTA ) ,
                                      r.getValue ( Tables.RESOLUCION.SERIE ) , Fechero.baseToDate ( r.getValue ( Tables.RESOLUCION.FECHA ) ) ,
                                      getCaja ( r.getValue ( Tables.RESOLUCION.IDCAJA ) ) , r.getValue ( Tables.RESOLUCION.ACTIVA ) );
    }

    private ModeloCaja getCaja ( Integer idcaja ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ().from ( Tables.CAJA )
                .where ( Tables.CAJA.IDCAJA.eq ( idcaja ) )
                .fetchOne ();
        return convertirCaja ( r );
    }

}
