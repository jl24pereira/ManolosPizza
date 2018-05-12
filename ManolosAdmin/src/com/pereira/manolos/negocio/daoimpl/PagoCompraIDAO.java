/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.PagoCompraDAO;
import com.pereira.manolos.negocio.modelos.ModeloPagoCompra;
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

import static com.pereira.manolos.datos.database.Tables.PAGOS_COMPRA;

/**
 *
 * @author Jose Luis
 */
public class PagoCompraIDAO extends Conexion implements PagoCompraDAO {

    private static final Logger LOG = Logger.getLogger ( PagoCompraIDAO.class.
            getName () );

    public PagoCompraIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloPagoCompra pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar ( ModeloPagoCompra pT ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .insertInto ( PAGOS_COMPRA )
                .set ( PAGOS_COMPRA.IDCOMPRA , pT.getCompra ().getIdcompra () )
                .set ( PAGOS_COMPRA.FECHA , Fechero.dateToBase ( pT.getFecha () ) )
                .set ( PAGOS_COMPRA.PAGO , pT.getPago () )
                .execute ();
        desconectar ();
    }

    @Override
    public void modificar ( ModeloPagoCompra pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloPagoCompra> obtenerLista ( Condition pCondition ) throws Exception {
        List<ModeloPagoCompra> abonos = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ().from ( PAGOS_COMPRA ).where ( pCondition ).fetch ();
        records.forEach ( r -> {
            abonos.add ( convertirAbono ( r ) );
        } );
        desconectar ();
        return abonos;
    }

    private ModeloPagoCompra convertirAbono ( Record r ) {
        return new ModeloPagoCompra ( null , Fechero.baseToDate ( r.getValue ( PAGOS_COMPRA.FECHA ) ) , r.getValue ( PAGOS_COMPRA.PAGO ) );
    }

}
