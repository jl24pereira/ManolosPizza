package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.PromocionDAO;
import com.pereira.manolos.negocio.modelos.ModeloPromocion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.PROMOCION;

public class PromocionIDAO extends Conexion implements PromocionDAO {

    private static final Logger LOG = Logger.getLogger ( PromocionIDAO.class.
            getName () );

    public PromocionIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloPromocion promo ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).delete ( PROMOCION )
                .where ( PROMOCION.IDPROMOCION.eq ( promo.getIdpromocion () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public void insertar ( ModeloPromocion promo ) throws Exception {
        conectar ();
        promo.setIdpromocion ( DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( PROMOCION )
                .set ( PROMOCION.NOMBRE , promo.getNombre () )
                .set ( PROMOCION.COSTO , promo.getCosto () )
                .set ( PROMOCION.PRECIO , promo.getPrecio () )
                .set ( PROMOCION.TIPOVENTA , promo.getTipo () )
                .set ( PROMOCION.IMAGEN , promo.getImagen () )
                .set ( PROMOCION.LUNES , promo.isLunes () )
                .set ( PROMOCION.MARTES , promo.isMartes () )
                .set ( PROMOCION.MIERCOLES , promo.isMiercoles () )
                .set ( PROMOCION.JUEVES , promo.isJueves () )
                .set ( PROMOCION.VIERNES , promo.isViernes () )
                .set ( PROMOCION.SABADO , promo.isSabado () )
                .set ( PROMOCION.DOMINGO , promo.isDomingo () )
                .returning ().fetchOne ().getValue ( PROMOCION.IDPROMOCION )
        );

        desconectar ();
    }

    @Override
    public void modificar ( ModeloPromocion promo ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).update ( PROMOCION )
                .set ( PROMOCION.NOMBRE , promo.getNombre () )
                .set ( PROMOCION.COSTO , promo.getCosto () )
                .set ( PROMOCION.PRECIO , promo.getPrecio () )
                .set ( PROMOCION.TIPOVENTA , promo.getTipo () )
                .set ( PROMOCION.IMAGEN , promo.getImagen () )
                .set ( PROMOCION.LUNES , promo.isLunes () )
                .set ( PROMOCION.MARTES , promo.isMartes () )
                .set ( PROMOCION.MIERCOLES , promo.isMiercoles () )
                .set ( PROMOCION.JUEVES , promo.isJueves () )
                .set ( PROMOCION.VIERNES , promo.isViernes () )
                .set ( PROMOCION.SABADO , promo.isSabado () )
                .set ( PROMOCION.DOMINGO , promo.isDomingo () )
                .where ( PROMOCION.IDPROMOCION.eq ( promo.getIdpromocion () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloPromocion> obtenerLista ( Condition c ) throws Exception {
        List<ModeloPromocion> promociones = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ().from ( PROMOCION )
                .where ( c )
                .orderBy ( PROMOCION.NOMBRE.asc () )
                .fetch ();
        records.forEach ( r -> {
            promociones.add ( convertirPromocion ( r ) );
        } );
        desconectar ();
        return promociones;
    }

    private ModeloPromocion convertirPromocion ( Record r ) {
        if ( r == null ) {
            return null;
        } else {
            return new ModeloPromocion ( r.getValue ( PROMOCION.IDPROMOCION ) , r.getValue ( PROMOCION.NOMBRE ) , r.getValue ( PROMOCION.COSTO ) ,
                                         r.getValue ( PROMOCION.PRECIO ) , r.getValue ( PROMOCION.TIPOVENTA ) , r.getValue ( PROMOCION.IMAGEN ) ,
                                         r.getValue ( PROMOCION.LUNES ) , r.getValue ( PROMOCION.MARTES ) , r.getValue ( PROMOCION.MIERCOLES ) ,
                                         r.getValue ( PROMOCION.JUEVES ) , r.getValue ( PROMOCION.VIERNES ) , r.getValue ( PROMOCION.SABADO ) ,
                                         r.getValue ( PROMOCION.DOMINGO ) );
        }
    }

}
