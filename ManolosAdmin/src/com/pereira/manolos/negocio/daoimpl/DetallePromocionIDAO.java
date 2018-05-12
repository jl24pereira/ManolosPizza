package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.datos.database.Tables;
import com.pereira.manolos.datos.database.tables.Producto;
import com.pereira.manolos.negocio.dao.DetallePromocionDAO;
import com.pereira.manolos.negocio.modelos.ModeloCategoriaProducto;
import com.pereira.manolos.negocio.modelos.ModeloDetallePromocion;
import com.pereira.manolos.negocio.modelos.ModeloInsumo;
import com.pereira.manolos.negocio.modelos.ModeloMedida;
import com.pereira.manolos.negocio.modelos.ModeloProducto;
import com.pereira.manolos.negocio.modelos.ModeloPromocion;
import com.pereira.manolos.negocio.modelos.ModeloReceta;
import com.pereira.manolos.negocio.modelos.ModeloUnidad;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.DETALLE_PROMOCION;
import static com.pereira.manolos.datos.database.Tables.INSUMO;
import static com.pereira.manolos.datos.database.Tables.MEDIDA;
import static com.pereira.manolos.datos.database.Tables.PRODUCTO;
import static com.pereira.manolos.datos.database.Tables.RECETA;
import static com.pereira.manolos.datos.database.Tables.UNIDAD_MEDIDA;
import static com.pereira.manolos.datos.database.Tables.V_CIF;
import static com.pereira.manolos.datos.database.Tables.V_DETALLE_RECETA;
import static com.pereira.manolos.datos.database.Tables.V_MOD_HORA;
import static org.jooq.impl.DSL.sum;

public class DetallePromocionIDAO extends Conexion implements DetallePromocionDAO {

    private static final Logger LOG = Logger.getLogger (
            DetallePromocionIDAO.class.getName () );

    public DetallePromocionIDAO () throws IOException {
        super ();
    }

    @Override
    public void eliminar ( ModeloDetallePromocion p ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).delete ( DETALLE_PROMOCION )
                .where ( DETALLE_PROMOCION.IDPROMOCION.eq ( p.getPromocion ().getIdpromocion () )
                        .and ( DETALLE_PROMOCION.IDPRODUCTO.eq ( p.getProducto ().getIdproducto () ) ) )
                .execute ();
        desconectar ();
    }

    @Override
    public void eliminarByPromocion ( ModeloPromocion promo ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).delete ( DETALLE_PROMOCION )
                .where ( DETALLE_PROMOCION.IDPROMOCION.eq ( promo.getIdpromocion () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public void insertar ( ModeloDetallePromocion t ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( DETALLE_PROMOCION )
                .set ( DETALLE_PROMOCION.IDPROMOCION , t.getPromocion ().getIdpromocion () )
                .set ( DETALLE_PROMOCION.IDPRODUCTO , t.getProducto ().getIdproducto () )
                .set ( DETALLE_PROMOCION.CANTIDAD , t.getCantidad () )
                .set ( DETALLE_PROMOCION.TIPO , t.getTipo () )
                .execute ();
        desconectar ();
    }

    @Override
    public void modificar ( ModeloDetallePromocion t ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).update ( DETALLE_PROMOCION )
                .set ( DETALLE_PROMOCION.IDPROMOCION , t.getPromocion ().getIdpromocion () )
                .set ( DETALLE_PROMOCION.IDPRODUCTO , t.getProducto ().getIdproducto () )
                .set ( DETALLE_PROMOCION.CANTIDAD , t.getCantidad () )
                .set ( DETALLE_PROMOCION.TIPO , t.getTipo () )
                .where ( DETALLE_PROMOCION.IDPROMOCION.eq ( t.getPromocion ().getIdpromocion () )
                        .and ( DETALLE_PROMOCION.IDPRODUCTO.eq ( t.getProducto ().getIdproducto () ) ) )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloDetallePromocion> obtenerLista ( Condition c ) throws Exception {
        List<ModeloDetallePromocion> detalle = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ().from ( DETALLE_PROMOCION )
                .where ( c )
                .fetch ();
        records.forEach ( r -> {
            detalle.add ( convertirDetalle ( r ) );
        } );
        desconectar ();
        return detalle;
    }

    private ModeloDetallePromocion convertirDetalle ( Record r ) {
        if ( r == null ) {
            return null;
        } else {
            return new ModeloDetallePromocion ( null , getProducto ( r.getValue ( DETALLE_PROMOCION.IDPRODUCTO ) ) ,
                                                r.getValue ( DETALLE_PROMOCION.CANTIDAD ) , "" );
        }
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

    private ModeloProducto convertirProducto ( Record r ) {
        ModeloProducto producto = new ModeloProducto ();
        producto.setIdproducto ( r.getValue ( Tables.PRODUCTO.IDPRODUCTO ) );
        producto.setNombre ( r.getValue ( Tables.PRODUCTO.NOMBRE ) );
        producto.setDetalle ( r.getValue ( Tables.PRODUCTO.DETALLE ) );
        producto.setCategoria ( getCategoria ( r.getValue ( Tables.PRODUCTO.IDCATEGORIA ) ) );
        producto.setImagen ( r.getValue ( Tables.PRODUCTO.IMAGEN ) );
        producto.setBaja ( r.getValue ( Tables.PRODUCTO.BAJA ) );
        producto.setTipo ( r.getValue ( Tables.PRODUCTO.TIPO ) );
        producto.setTipoventa ( r.getValue ( Tables.PRODUCTO.TIPOVENTA ) );
        producto.setPrecio ( r.getValue ( Producto.PRODUCTO.PRECIO ) );
        switch ( producto.getTipo () ) {
            case "C":
                producto.setReceta ( getReceta ( r.getValue ( Tables.PRODUCTO.IDRECETA ) ) );
                break;
            case "P":
                producto.setReceta ( getReceta ( r.getValue ( Tables.PRODUCTO.IDRECETA ) ) );
                break;
            case "U":
                producto.setInsumo ( getInsumo ( r.getValue ( Tables.PRODUCTO.IDINSUMO ) ) );
        }
        producto.setPorciones ( r.getValue ( Tables.PRODUCTO.PORCIONES ) );
        producto.setDescuento ( r.getValue ( Tables.PRODUCTO.DESCUENTO ) );
        producto.setStock ( r.getValue ( Producto.PRODUCTO.STOCK ) );
        return producto;
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

    private ModeloCategoriaProducto getCategoria ( Integer idCategoria ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ().from ( Tables.CATEGORIA_PRODUCTO )
                .where ( Tables.CATEGORIA_PRODUCTO.IDCATEGORIA.eq ( idCategoria ) )
                .fetchOne ();
        return new ModeloCategoriaProducto ( idCategoria , r.getValue ( Tables.CATEGORIA_PRODUCTO.IMAGEN ) ,
                                             r.getValue ( Tables.CATEGORIA_PRODUCTO.NOMBRE ) );
    }

    private ModeloInsumo getInsumo ( Integer idinsumo ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ().from ( Tables.INSUMO )
                .where ( Tables.INSUMO.IDINSUMO.eq ( idinsumo ) )
                .fetchOne ();
        return convertirInsumo ( r );
    }

    private ModeloProducto getProducto ( Integer id ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ()
                .from ( PRODUCTO )
                .where ( PRODUCTO.IDPRODUCTO.eq ( id ) )
                .fetchOne ();
        return convertirProducto ( r );
    }

    private ModeloReceta getReceta ( Integer idreceta ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ().from ( Tables.RECETA )
                .where ( Tables.RECETA.IDRECETA.eq ( idreceta ) )
                .fetchOne ();
        return convertirReceta ( r );
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
