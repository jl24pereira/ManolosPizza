package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.datos.database.Tables;
import com.pereira.manolos.negocio.dao.DetalleVentaDAO;
import com.pereira.manolos.negocio.modelos.ModeloCategoriaProducto;
import com.pereira.manolos.negocio.modelos.ModeloDetalleVenta;
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

import static com.pereira.manolos.datos.database.Tables.DETALLE_VENTA;
import static com.pereira.manolos.datos.database.Tables.INSUMO;
import static com.pereira.manolos.datos.database.Tables.MEDIDA;
import static com.pereira.manolos.datos.database.Tables.PRODUCTO;
import static com.pereira.manolos.datos.database.Tables.PROMOCION;
import static com.pereira.manolos.datos.database.Tables.RECETA;
import static com.pereira.manolos.datos.database.Tables.UNIDAD_MEDIDA;
import static com.pereira.manolos.datos.database.Tables.V_CIF;
import static com.pereira.manolos.datos.database.Tables.V_DETALLE_RECETA;
import static com.pereira.manolos.datos.database.Tables.V_MOD_HORA;
import static org.jooq.impl.DSL.sum;

public class DetalleVentaIDAO extends Conexion implements DetalleVentaDAO {

    private static final Logger LOG = Logger.getLogger ( DetalleVentaIDAO.class.
            getName () );

    public DetalleVentaIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloDetalleVenta pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar ( ModeloDetalleVenta detalle ) throws Exception {
        conectar ();
        if ( detalle.isPromo () ) {
            DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( DETALLE_VENTA )
                    .set ( DETALLE_VENTA.IDVENTA , detalle.getVenta ().getIdventa () )
                    .set ( DETALLE_VENTA.CANTIDAD , detalle.getCantidad () )
                    .set ( DETALLE_VENTA.PRECIO , detalle.getPrecio () )
                    .set ( DETALLE_VENTA.TIPO , detalle.getTipo () )
                    .set ( DETALLE_VENTA.ESPROMO , detalle.isPromo () )
                    .set ( DETALLE_VENTA.IDPROMOCION , detalle.getPromocion ().getIdpromocion () )
                    .execute ();
        } else {
            DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( DETALLE_VENTA )
                    .set ( DETALLE_VENTA.IDVENTA , detalle.getVenta ().getIdventa () )
                    .set ( DETALLE_VENTA.IDPRODUCTO , detalle.getProducto ().getIdproducto () )
                    .set ( DETALLE_VENTA.CANTIDAD , detalle.getCantidad () )
                    .set ( DETALLE_VENTA.PRECIO , detalle.getPrecio () )
                    .set ( DETALLE_VENTA.TIPO , detalle.getTipo () )
                    .set ( DETALLE_VENTA.ESPROMO , detalle.isPromo () )
                    .execute ();
        }
        desconectar ();
    }

    @Override
    public void modificar ( ModeloDetalleVenta pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloDetalleVenta> obtenerLista ( Condition c ) throws Exception {
        List<ModeloDetalleVenta> detalle = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ()
                .from ( DETALLE_VENTA )
                .where ( c )
                .fetch ();
        records.forEach ( r -> {
            detalle.add ( convertirDetalle ( r ) );
        } );
        desconectar ();
        return detalle;
    }

    private ModeloDetalleVenta convertirDetalle ( Record r ) {
        ModeloDetalleVenta detalle = new ModeloDetalleVenta ();
        detalle.setCantidad ( r.getValue ( DETALLE_VENTA.CANTIDAD ) );
        detalle.setPrecio ( r.getValue ( DETALLE_VENTA.PRECIO ) );
        detalle.setTipo ( r.getValue ( DETALLE_VENTA.TIPO ) );
        if ( r.getValue ( DETALLE_VENTA.ESPROMO ) ) {
            detalle.setPromocion ( getPromocion ( r.getValue ( DETALLE_VENTA.IDPROMOCION ) ) );
        } else {
            detalle.setProducto ( getProducto ( r.getValue ( DETALLE_VENTA.IDPRODUCTO ) ) );
        }
        detalle.setPromo ( r.getValue ( DETALLE_VENTA.ESPROMO ) );
        return detalle;
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
        producto.setIdproducto ( r.getValue ( PRODUCTO.IDPRODUCTO ) );
        producto.setNombre ( r.getValue ( PRODUCTO.NOMBRE ) );
        producto.setDetalle ( r.getValue ( PRODUCTO.DETALLE ) );
        producto.setCategoria ( getCategoria ( r.getValue ( PRODUCTO.IDCATEGORIA ) ) );
        producto.setImagen ( r.getValue ( PRODUCTO.IMAGEN ) );
        producto.setBaja ( r.getValue ( PRODUCTO.BAJA ) );
        producto.setTipo ( r.getValue ( PRODUCTO.TIPO ) );
        producto.setTipoventa ( r.getValue ( PRODUCTO.TIPOVENTA ) );
        producto.setPrecio ( r.getValue ( PRODUCTO.PRECIO ) );
        switch ( producto.getTipo () ) {
            case "C":
                producto.setReceta ( getReceta ( r.getValue ( PRODUCTO.IDRECETA ) ) );
                break;
            case "P":
                producto.setReceta ( getReceta ( r.getValue ( PRODUCTO.IDRECETA ) ) );
                break;
            case "U":
                producto.setInsumo ( getInsumo ( r.getValue ( PRODUCTO.IDINSUMO ) ) );
        }
        producto.setPorciones ( r.getValue ( PRODUCTO.PORCIONES ) );
        producto.setDescuento ( r.getValue ( PRODUCTO.DESCUENTO ) );
        producto.setStock ( r.getValue ( PRODUCTO.STOCK ) );
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

    private ModeloProducto getProducto ( Integer idproducto ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ()
                .from ( PRODUCTO )
                .where ( PRODUCTO.IDPRODUCTO.eq ( idproducto ) )
                .fetchOne ();
        return convertirProducto ( r );
    }

    private ModeloPromocion getPromocion ( Integer id ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ()
                .from ( PROMOCION )
                .where ( PROMOCION.IDPROMOCION.eq ( id ) )
                .fetchOne ();
        return convertirPromocion ( r );
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
