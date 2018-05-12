package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.datos.database.Tables;
import com.pereira.manolos.negocio.dao.DetalleRecetaDAO;
import com.pereira.manolos.negocio.modelos.ModeloDetalleReceta;
import com.pereira.manolos.negocio.modelos.ModeloInsumo;
import com.pereira.manolos.negocio.modelos.ModeloMedida;
import com.pereira.manolos.negocio.modelos.ModeloReceta;
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

import static com.pereira.manolos.datos.database.Tables.DETALLE_RECETA;
import static com.pereira.manolos.datos.database.Tables.INSUMO;
import static com.pereira.manolos.datos.database.Tables.MEDIDA;
import static com.pereira.manolos.datos.database.Tables.RECETA;
import static com.pereira.manolos.datos.database.Tables.UNIDAD_MEDIDA;

public class DetalleRecetaIDAO extends Conexion implements DetalleRecetaDAO {

    public DetalleRecetaIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloDetalleReceta ingrediente ) throws Exception {
        conectar ();
        if ( ingrediente.getTipo ().equals ( "INSUMO" ) ) {
            DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).delete ( DETALLE_RECETA )
                    .where ( DETALLE_RECETA.IDRECETA.eq ( ingrediente.getReceta ().getIdreceta () ) )
                    .and ( DETALLE_RECETA.INGREDIENTE.eq ( ingrediente.getIngredienteInsumo ().getIdinsumo () ) )
                    .execute ();
        } else {
            DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).delete ( DETALLE_RECETA )
                    .where ( DETALLE_RECETA.IDRECETA.eq ( ingrediente.getReceta ().getIdreceta () ) )
                    .and ( DETALLE_RECETA.INGREDIENTERECETA.eq ( ingrediente.getIngredienteReceta ().getIdreceta () ) )
                    .execute ();
        }
        desconectar ();
    }

    @Override
    public void insertar ( ModeloDetalleReceta ingrediente ) throws Exception {
        conectar ();
        if ( ingrediente.getTipo ().equals ( "INSUMO" ) ) {
            DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( DETALLE_RECETA )
                    .set ( DETALLE_RECETA.IDRECETA , ingrediente.getReceta ().getIdreceta () )
                    .set ( DETALLE_RECETA.INGREDIENTE , ingrediente.getIngredienteInsumo ().getIdinsumo () )
                    .set ( DETALLE_RECETA.IDUNIDAD , ingrediente.getUnidad ().getIdunidad () )
                    .set ( DETALLE_RECETA.DESCARGO , ingrediente.getDescargo () )
                    .set ( DETALLE_RECETA.TIPO , ingrediente.getTipo () )
                    .execute ();
        } else {
            DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( DETALLE_RECETA )
                    .set ( DETALLE_RECETA.IDRECETA , ingrediente.getReceta ().getIdreceta () )
                    .set ( DETALLE_RECETA.INGREDIENTERECETA , ingrediente.getIngredienteReceta ().getIdreceta () )
                    .set ( DETALLE_RECETA.IDUNIDAD , ingrediente.getUnidad ().getIdunidad () )
                    .set ( DETALLE_RECETA.DESCARGO , ingrediente.getDescargo () )
                    .set ( DETALLE_RECETA.TIPO , ingrediente.getTipo () )
                    .execute ();
        }
        desconectar ();
    }

    @Override
    public void modificar ( ModeloDetalleReceta pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloDetalleReceta> obtenerLista ( Condition c ) throws Exception {
        List<ModeloDetalleReceta> detalles = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( DETALLE_RECETA )
                .where ( c )
                .fetch ();
        records.forEach ( r -> {
            detalles.add ( convertirDetalle ( r ) );
        } );
        desconectar ();
        return detalles;
    }

    private static final Logger LOG = Logger.getLogger ( DetalleRecetaIDAO.class.getName () );

    private ModeloDetalleReceta convertirDetalle ( Record r ) {
        ModeloDetalleReceta detalle = new ModeloDetalleReceta ();
        detalle.setTipo ( r.getValue ( DETALLE_RECETA.TIPO ) );
        if ( detalle.getTipo ().equals ( "INSUMO" ) ) {
            detalle.setIngredienteInsumo ( obtenerInsumo ( r.getValue ( DETALLE_RECETA.INGREDIENTE ) ) );
            detalle.setNombre ( detalle.getIngredienteInsumo ().getNombre () );
        } else {
            detalle.setIngredienteReceta ( obtenerReceta ( r.getValue ( DETALLE_RECETA.INGREDIENTERECETA ) ) );
            detalle.setNombre ( detalle.getIngredienteReceta ().getNombre () );
        }
        detalle.setUnidad ( getUnidad ( r.getValue ( DETALLE_RECETA.IDUNIDAD ) ) );
        detalle.setDescargo ( r.getValue ( DETALLE_RECETA.DESCARGO ) );
        return detalle;
    }

    private ModeloInsumo obtenerInsumo ( Integer idinsumo ) {
        Record record = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ()
                .from ( Tables.INSUMO )
                .where ( Tables.INSUMO.IDINSUMO.eq ( idinsumo ) )
                .fetchOne ();
        return convertirInsumo ( record );
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

    private ModeloReceta obtenerReceta ( Integer idreceta ) {
        Record record = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ()
                .from ( Tables.RECETA )
                .where ( Tables.RECETA.IDRECETA.eq ( idreceta ) )
                .fetchOne ();
        return convertirReceta ( record );
    }

    private ModeloReceta convertirReceta ( Record r ) {
        return new ModeloReceta ( r.getValue ( RECETA.IDRECETA ) , r.getValue ( RECETA.NOMBRE ) , r.getValue ( RECETA.TIPORECETA ) , getUnidad ( r.
                                  getValue ( RECETA.IDUNIDAD ) ) ,
                                  r.getValue ( RECETA.COSTO ) , r.getValue ( RECETA.STOCK ) , r.getValue ( RECETA.RENDIMIENTO ) , r.getValue (
                                  RECETA.ESTIMADOMENSUAL ) , r.getValue ( RECETA.MAXIMO ) ,
                                  r.getValue ( RECETA.MINIMO ) , r.getValue ( RECETA.HORAS ) , r.getValue ( RECETA.MINUTOS ) , 0.0 , 0.0 ,
                                  0.0 , r.getValue ( RECETA.BAJA ) );
    }
}
