package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.InsumoDAO;
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

import static com.pereira.manolos.datos.database.Tables.INSUMO;
import static com.pereira.manolos.datos.database.Tables.MEDIDA;
import static com.pereira.manolos.datos.database.Tables.UNIDAD_MEDIDA;

public class InsumoIDAO extends Conexion implements InsumoDAO {

    private static final Logger LOG = Logger.getLogger ( InsumoIDAO.class.
            getName () );

    public InsumoIDAO () throws IOException {
        super ();
    }

    @Override
    public void descontarInsumo ( ModeloInsumo pInsumo , double pDescuento ) throws Exception {
        conectar ();
        double stock = pInsumo.getStock ();
        stock -= pDescuento;
        pInsumo.setStock ( stock );
        modificar ( pInsumo );
        desconectar ();
    }

    @Override
    public void eliminar ( ModeloInsumo pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModeloInsumo findByID ( int pId ) throws Exception {
        conectar ();
        Record record = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ().from ().where (
                        INSUMO.IDINSUMO.equal ( pId ) ).fetchOne ();
        desconectar ();
        return convertirInsumo ( record );
    }

    @Override
    public void insertar ( ModeloInsumo pT ) throws Exception {
        conectar ();
        pT.setIdinsumo ( DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( INSUMO )
                .set ( INSUMO.NOMBRE , pT.getNombre () )
                .set ( INSUMO.IDUNIDAD , pT.getUnidad ().getIdunidad () )
                .set ( INSUMO.MAXIMO , pT.getMaximo () )
                .set ( INSUMO.MINIMO , pT.getMinimo () )
                .set ( INSUMO.STOCK , pT.getStock () )
                .set ( INSUMO.COSTO , pT.getCosto () )
                .set ( INSUMO.PRODUCCION , pT.isProduccion () )
                .returning ().fetchOne ().getValue ( INSUMO.IDINSUMO )
        );
        desconectar ();
    }

    @Override
    public void modificar ( ModeloInsumo pT ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .update ( INSUMO )
                .set ( INSUMO.NOMBRE , pT.getNombre () )
                .set ( INSUMO.IDUNIDAD , pT.getUnidad ().getIdunidad () )
                .set ( INSUMO.MAXIMO , pT.getMaximo () )
                .set ( INSUMO.MINIMO , pT.getMinimo () )
                .set ( INSUMO.STOCK , pT.getStock () )
                .set ( INSUMO.COSTO , pT.getCosto () )
                .set ( INSUMO.PRODUCCION , pT.isProduccion () )
                .set ( INSUMO.BAJA , pT.isBaja () )
                .where ( INSUMO.IDINSUMO.equal ( pT.getIdinsumo () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloInsumo> obtenerLista ( Condition pCondition ) throws Exception {
        List<ModeloInsumo> insumos = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( INSUMO )
                .where ( pCondition )
                .orderBy ( INSUMO.NOMBRE.asc () )
                .fetch ();
        records.stream ().forEach ( r -> {
            insumos.add ( convertirInsumo ( r ) );
        } );
        desconectar ();
        return insumos;
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

    private ModeloUnidad getUnidad ( int id ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( UNIDAD_MEDIDA )
                .where ( UNIDAD_MEDIDA.IDUNIDAD.eq ( id ) )
                .fetchOne ();
        return convertirUnidades ( r );
    }

}
