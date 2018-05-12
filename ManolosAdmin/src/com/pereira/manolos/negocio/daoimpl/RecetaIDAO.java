package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.dao.RecetaDAO;
import com.pereira.manolos.negocio.modelos.ModeloMedida;
import com.pereira.manolos.negocio.modelos.ModeloReceta;
import com.pereira.manolos.negocio.modelos.ModeloUnidad;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.MEDIDA;
import static com.pereira.manolos.datos.database.Tables.RECETA;
import static com.pereira.manolos.datos.database.Tables.UNIDAD_MEDIDA;
import static com.pereira.manolos.datos.database.Tables.V_CIF;
import static com.pereira.manolos.datos.database.Tables.V_DETALLE_RECETA;
import static com.pereira.manolos.datos.database.Tables.V_MOD_HORA;
import static org.jooq.impl.DSL.sum;

public class RecetaIDAO extends Conexion implements RecetaDAO {

    private static final Logger LOG = Logger.getLogger ( RecetaIDAO.class.
            getName () );

    public RecetaIDAO () throws IOException {
    }

    @Override
    public void actualizarAllCosto ( List<ModeloReceta> recetas ) throws Exception {
        recetas.forEach ( r -> {
            try {
                actualizarCosto ( r );
            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
            }
        } );
    }

    @Override
    public void actualizarCosto ( ModeloReceta receta ) throws Exception {
        conectar ();
        double costoTotal = 0;
        receta.setCostoCIF ( costoCIF ( receta.getIdreceta () ) );
        receta.setCostoINV ( costoINV ( receta.getIdreceta () ) );
        receta.setCostoMOD ( costoMOD ( receta.getIdreceta () ) );
        costoTotal = receta.getCostoCIF () + receta.getCostoINV () + receta.getCostoMOD ();
        receta.setCosto ( new BigDecimal ( costoTotal / receta.getRendimiento () ) );
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).update ( RECETA )
                .set ( RECETA.NOMBRE , receta.getNombre () )
                .set ( RECETA.TIPORECETA , receta.getTiporeceta () )
                .set ( RECETA.IDUNIDAD , receta.getUnidad ().getIdunidad () )
                .set ( RECETA.COSTO , receta.getCosto () )
                .set ( RECETA.RENDIMIENTO , receta.getRendimiento () )
                .set ( RECETA.ESTIMADOMENSUAL , receta.getEstimadomensual () )
                .set ( RECETA.STOCK , receta.getStock () )
                .set ( RECETA.MAXIMO , receta.getMaximo () )
                .set ( RECETA.MINIMO , receta.getMinimo () )
                .set ( RECETA.MINUTOS , receta.getMinutos () )
                .set ( RECETA.HORAS , receta.getHoras () )
                .set ( RECETA.BAJA , receta.isBaja () )
                .where ( RECETA.IDRECETA.eq ( receta.getIdreceta () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public void descontarReceta ( ModeloReceta pReceta , double pDescuento ) {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar ( ModeloReceta pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModeloReceta findById ( int pId ) {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar ( ModeloReceta receta ) throws Exception {
        conectar ();
        receta.setIdreceta ( DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .insertInto ( RECETA )
                .set ( RECETA.NOMBRE , receta.getNombre () )
                .set ( RECETA.TIPORECETA , receta.getTiporeceta () )
                .set ( RECETA.IDUNIDAD , receta.getUnidad ().getIdunidad () )
                .set ( RECETA.COSTO , receta.getCosto () )
                .set ( RECETA.RENDIMIENTO , receta.getRendimiento () )
                .set ( RECETA.ESTIMADOMENSUAL , receta.getEstimadomensual () )
                .set ( RECETA.STOCK , receta.getStock () )
                .set ( RECETA.MAXIMO , receta.getMaximo () )
                .set ( RECETA.MINIMO , receta.getMinimo () )
                .set ( RECETA.MINUTOS , receta.getMinutos () )
                .set ( RECETA.HORAS , receta.getHoras () )
                .returning ().fetchOne ().getValue ( RECETA.IDRECETA )
        );
        desconectar ();
    }

    @Override
    public void modificar ( ModeloReceta receta ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).update ( RECETA )
                .set ( RECETA.NOMBRE , receta.getNombre () )
                .set ( RECETA.TIPORECETA , receta.getTiporeceta () )
                .set ( RECETA.IDUNIDAD , receta.getUnidad ().getIdunidad () )
                .set ( RECETA.COSTO , receta.getCosto () )
                .set ( RECETA.RENDIMIENTO , receta.getRendimiento () )
                .set ( RECETA.ESTIMADOMENSUAL , receta.getEstimadomensual () )
                .set ( RECETA.STOCK , receta.getStock () )
                .set ( RECETA.MAXIMO , receta.getMaximo () )
                .set ( RECETA.MINIMO , receta.getMinimo () )
                .set ( RECETA.MINUTOS , receta.getMinutos () )
                .set ( RECETA.HORAS , receta.getHoras () )
                .set ( RECETA.BAJA , receta.isBaja () )
                .where ( RECETA.IDRECETA.eq ( receta.getIdreceta () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloReceta> obtenerLista ( Condition pCondition ) throws Exception {
        List<ModeloReceta> recetas = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( RECETA )
                .where ( pCondition )
                .orderBy ( RECETA.NOMBRE.asc () )
                .fetch ();
        records.forEach ( r -> {
            recetas.add ( convertirReceta ( r ) );
        } );
        desconectar ();
        return recetas;
    }

    @Override
    public void prepararReceta ( ModeloReceta pReceta , int pCantidad , DAOManager pManager ) {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    private ModeloMedida convertirMedidas ( Record r ) {
        return new ModeloMedida ( r.getValue ( MEDIDA.IDMEDIDA ) , r.
                                  getValue ( MEDIDA.DETALLE ) );
    }

    private ModeloReceta convertirReceta ( Record r ) {
        return new ModeloReceta ( r.getValue ( RECETA.IDRECETA ) , r.getValue ( RECETA.NOMBRE ) , r.getValue ( RECETA.TIPORECETA ) ,
                                  getUnidad ( r.getValue ( RECETA.IDUNIDAD ) ) , r.getValue ( RECETA.COSTO ) , r.getValue ( RECETA.STOCK ) ,
                                  r.getValue ( RECETA.RENDIMIENTO ) , r.getValue ( RECETA.ESTIMADOMENSUAL ) , r.getValue ( RECETA.MAXIMO ) ,
                                  r.getValue ( RECETA.MINIMO ) , r.getValue ( RECETA.MINUTOS ) , r.getValue ( RECETA.HORAS ) ,
                                  costoCIF ( r.getValue ( RECETA.IDRECETA ) ) , costoMOD ( r.getValue ( RECETA.IDRECETA ) ) ,
                                  costoINV ( r.getValue ( RECETA.IDRECETA ) ) , r.getValue ( RECETA.BAJA ) );
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

    private double costoCIF ( int idreceta ) {
        double costo = 0;
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( RECETA )
                .where ( RECETA.IDRECETA.equal ( idreceta ) )
                .fetchOne ();
        int horas = r.getValue ( RECETA.HORAS );
        int minutos = r.getValue ( RECETA.MINUTOS );
        double HHxReceta = ( double ) horas + ( ( double ) minutos / 60 );
        double tasacif = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ( V_CIF.TASACIF ).from ( V_CIF ).limit ( 1 ).fetchOne (
                V_CIF.TASACIF );
        costo = HHxReceta * tasacif;
        return costo;
    }

    private double costoINV ( int idreceta ) {
        double costo = 0;
        BigDecimal materiales = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ( sum ( V_DETALLE_RECETA.COSTO.mul ( V_DETALLE_RECETA.DESCARGO ) ) )
                .from ( V_DETALLE_RECETA )
                .where ( V_DETALLE_RECETA.IDRECETA.equal ( idreceta ) )
                .fetchOne ( sum ( V_DETALLE_RECETA.COSTO ) );
        if ( materiales != null ) {
            costo = materiales.doubleValue ();
        }
        return costo;
    }

    private double costoMOD ( int idreceta ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( RECETA )
                .where ( RECETA.IDRECETA.equal ( idreceta ) )
                .fetchOne ();
        int horas = r.getValue ( RECETA.HORAS );
        int minutos = r.getValue ( RECETA.MINUTOS );
        double HHxReceta = ( double ) horas + ( ( double ) minutos / 60 );
        //System.out.println ( "Min: " + minutos + " horas: " + horas );
        BigDecimal costoMOD = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ().from ( V_MOD_HORA ).limit ( 1 ).fetchOne (
                V_MOD_HORA.MOD );
        double costo = HHxReceta * costoMOD.doubleValue ();
        return costo;
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
