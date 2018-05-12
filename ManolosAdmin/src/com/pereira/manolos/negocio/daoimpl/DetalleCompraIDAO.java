/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.DetalleCompraDAO;
import com.pereira.manolos.negocio.modelos.ModeloDetalleCompra;
import com.pereira.manolos.negocio.modelos.ModeloInsumo;
import com.pereira.manolos.negocio.modelos.ModeloMedida;
import com.pereira.manolos.negocio.modelos.ModeloUnidad;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.DETALLE_COMPRA;
import static com.pereira.manolos.datos.database.Tables.INSUMO;
import static com.pereira.manolos.datos.database.Tables.MEDIDA;
import static com.pereira.manolos.datos.database.Tables.UNIDAD_MEDIDA;

/**
 *
 * @author Jose Luis
 */
public class DetalleCompraIDAO extends Conexion implements DetalleCompraDAO {

    private static final Logger LOG = Logger.getLogger ( DetalleCompraIDAO.class.getName () );

    public DetalleCompraIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloDetalleCompra pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar ( ModeloDetalleCompra pT ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .insertInto ( DETALLE_COMPRA )
                .set ( DETALLE_COMPRA.IDCOMPRA , pT.getCompra ().getIdcompra () )
                .set ( DETALLE_COMPRA.IDINSUMO , pT.getInsumo ().getIdinsumo () )
                .set ( DETALLE_COMPRA.CANTIDAD , pT.getCantidad () )
                .set ( DETALLE_COMPRA.PRECIO , pT.getPrecio () )
                .execute ();
        desconectar ();
    }

    @Override
    public void modificar ( ModeloDetalleCompra pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloDetalleCompra> obtenerLista ( Condition pCondition ) throws Exception {
        List<ModeloDetalleCompra> detalle = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ().from ( DETALLE_COMPRA ).where ( pCondition ).fetch ();
        records.forEach ( r -> {
            detalle.add ( convertirDetalle ( r ) );
        } );
        desconectar ();
        return detalle;
    }

    private ModeloDetalleCompra convertirDetalle ( Record r ) {
        return new ModeloDetalleCompra ( null , getInsumoByID ( r.getValue ( DETALLE_COMPRA.IDINSUMO ) ) , r.getValue ( DETALLE_COMPRA.CANTIDAD ) ,
                                         r.getValue ( DETALLE_COMPRA.PRECIO ) );
    }

    private ModeloInsumo convertirInsumo ( Record r ) {
        return new ModeloInsumo ( r.getValue ( INSUMO.IDINSUMO ) , r.getValue ( INSUMO.NOMBRE ) , r.getValue ( INSUMO.COSTO ) ,
                                  r.getValue ( INSUMO.MINIMO ) , r.getValue ( INSUMO.MAXIMO ) , r.getValue ( INSUMO.STOCK ) ,
                                  getUnidad ( r.getValue ( INSUMO.IDUNIDAD ) ) , r.getValue ( INSUMO.BAJA ) , r.getValue ( INSUMO.PRODUCCION ) );
    }

    private ModeloMedida convertirMedidas ( Record r ) {
        return new ModeloMedida ( r.getValue ( MEDIDA.IDMEDIDA ) , r.
                                  getValue ( MEDIDA.DETALLE ) );
    }

    private ModeloUnidad convertirUnidades ( Record r ) {
        Record medida = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( MEDIDA )
                .where ( MEDIDA.IDMEDIDA.equal ( r.getValue (
                        UNIDAD_MEDIDA.IDMEDIDA ) ) )
                .fetchOne ();
        if ( r.getValue ( UNIDAD_MEDIDA.UNIDADPADRE ) == null ) {
            return new ModeloUnidad (
                    r.getValue ( UNIDAD_MEDIDA.IDUNIDAD ) ,
                    r.getValue ( UNIDAD_MEDIDA.DETALLE ) ,
                    convertirMedidas ( medida ) ,
                    r.getValue ( UNIDAD_MEDIDA.EQUIVALENCIA ) );
        } else {
            Record unidadPadre = DSL.using ( getConexion () ,
                                             SQLDialect.POSTGRES_9_5 )
                    .select ()
                    .from ( UNIDAD_MEDIDA )
                    .where ( UNIDAD_MEDIDA.IDUNIDAD.equal ( r.getValue (
                            UNIDAD_MEDIDA.UNIDADPADRE ) ) )
                    .fetchOne ();
            return new ModeloUnidad (
                    r.getValue ( UNIDAD_MEDIDA.IDUNIDAD ) ,
                    r.getValue ( UNIDAD_MEDIDA.DETALLE ) ,
                    convertirMedidas ( medida ) ,
                    convertirUnidades ( unidadPadre ) ,
                    r.getValue ( UNIDAD_MEDIDA.EQUIVALENCIA ) );
        }

    }

    private ModeloInsumo getInsumoByID ( Integer id ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ().from ( INSUMO ).where ( INSUMO.IDINSUMO.eq ( id ) ).fetchOne ();
        return convertirInsumo ( r );
    }

    private ModeloUnidad getUnidad ( int id ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( UNIDAD_MEDIDA )
                .where ( UNIDAD_MEDIDA.IDUNIDAD.eq ( id ) )
                .fetchOne ();
        return convertirUnidades ( r );
    }
}
