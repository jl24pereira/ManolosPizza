/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.modelos.ModeloCostosIndirectos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.COSTOS_INDIRECTOS;

/**
 *
 * @author Jose Luis
 */
public class CostosIndirectosIDAO extends Conexion implements com.pereira.manolos.negocio.dao.CostosIndirectosDAO {

    private static final Logger LOG = Logger.getLogger (CostosIndirectosIDAO.class.getName () );

    public CostosIndirectosIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloCostosIndirectos pT ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .delete ( COSTOS_INDIRECTOS )
                .where ( COSTOS_INDIRECTOS.IDCOSTO.equal ( pT.getIdcosto () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public void insertar ( ModeloCostosIndirectos pT ) throws Exception {
        conectar ();
        pT.setIdcosto ( DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .insertInto ( COSTOS_INDIRECTOS )
                .set ( COSTOS_INDIRECTOS.RUBRO , pT.getRubro () )
                .set ( COSTOS_INDIRECTOS.VALOR , pT.getCosto () )
                .returning ().fetchOne ().getValue ( COSTOS_INDIRECTOS.IDCOSTO )
        );
        desconectar ();
    }

    @Override
    public void modificar ( ModeloCostosIndirectos pT ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .update ( COSTOS_INDIRECTOS )
                .set ( COSTOS_INDIRECTOS.RUBRO , pT.getRubro () )
                .set ( COSTOS_INDIRECTOS.VALOR , pT.getCosto () )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloCostosIndirectos> obtenerLista ( Condition pCondition ) throws Exception {
        List<ModeloCostosIndirectos> costos = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () ,
                                             SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( COSTOS_INDIRECTOS )
                .where ( pCondition )
                .orderBy ( COSTOS_INDIRECTOS.RUBRO.asc () )
                .fetch ();
        records.forEach ( r -> {
            costos.add ( convertirCosto ( r ) );
        } );
        desconectar ();
        return costos;
    }

    private ModeloCostosIndirectos convertirCosto ( Record pR ) {
        return new ModeloCostosIndirectos (
                pR.getValue ( COSTOS_INDIRECTOS.IDCOSTO ) ,
                pR.getValue ( COSTOS_INDIRECTOS.RUBRO ) ,
                pR.getValue ( COSTOS_INDIRECTOS.VALOR )
        );
    }

}
