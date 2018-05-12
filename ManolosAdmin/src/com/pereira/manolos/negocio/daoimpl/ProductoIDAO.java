package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.datos.database.Tables;
import com.pereira.manolos.datos.database.tables.Producto;
import com.pereira.manolos.negocio.dao.ProductoDAO;
import com.pereira.manolos.negocio.modelos.ModeloCategoriaProducto;
import com.pereira.manolos.negocio.modelos.ModeloInsumo;
import com.pereira.manolos.negocio.modelos.ModeloMedida;
import com.pereira.manolos.negocio.modelos.ModeloProducto;
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

import static com.pereira.manolos.datos.database.Tables.INSUMO;
import static com.pereira.manolos.datos.database.Tables.MEDIDA;
import static com.pereira.manolos.datos.database.Tables.RECETA;
import static com.pereira.manolos.datos.database.Tables.UNIDAD_MEDIDA;
import static com.pereira.manolos.datos.database.Tables.V_CIF;
import static com.pereira.manolos.datos.database.Tables.V_DETALLE_RECETA;
import static com.pereira.manolos.datos.database.Tables.V_MOD_HORA;
import static org.jooq.impl.DSL.sum;

public class ProductoIDAO extends Conexion implements ProductoDAO {

    private static final Logger LOG = Logger.getLogger ( ProductoIDAO.class.
            getName () );

    public ProductoIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloProducto pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar ( ModeloProducto producto ) throws Exception {
        conectar ();
        if ( producto.getTipo ().equals ( "U" ) ) {
            producto.setIdproducto ( DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( Tables.PRODUCTO )
                    .set ( Tables.PRODUCTO.NOMBRE , producto.getNombre () )
                    .set ( Tables.PRODUCTO.DETALLE , producto.getDetalle () )
                    .set ( Tables.PRODUCTO.IDCATEGORIA , producto.getCategoria ().getIdcategoria () )
                    .set ( Tables.PRODUCTO.PORCIONES , producto.getPorciones () )
                    .set ( Tables.PRODUCTO.DESCUENTO , producto.getDescuento () )
                    .set ( Tables.PRODUCTO.IMAGEN , producto.getImagen () )
                    .set ( Tables.PRODUCTO.TIPO , producto.getTipo () )
                    .set ( Tables.PRODUCTO.TIPOVENTA , producto.getTipoventa () )
                    .set ( Tables.PRODUCTO.PRECIO , producto.getPrecio () )
                    .set ( Tables.PRODUCTO.IDINSUMO , producto.getInsumo ().getIdinsumo () )
                    .set ( Tables.PRODUCTO.STOCK ,producto.getStock())
                    .returning ().fetchOne ().getValue ( Tables.PRODUCTO.IDPRODUCTO )
            );
        } else {
            producto.setIdproducto ( DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( Tables.PRODUCTO )
                    .set ( Tables.PRODUCTO.NOMBRE , producto.getNombre () )
                    .set ( Tables.PRODUCTO.DETALLE , producto.getDetalle () )
                    .set ( Tables.PRODUCTO.IDCATEGORIA , producto.getCategoria ().getIdcategoria () )
                    .set ( Tables.PRODUCTO.PORCIONES , producto.getPorciones () )
                    .set ( Tables.PRODUCTO.DESCUENTO , producto.getDescuento () )
                    .set ( Tables.PRODUCTO.IMAGEN , producto.getImagen () )
                    .set ( Tables.PRODUCTO.TIPO , producto.getTipo () )
                    .set ( Tables.PRODUCTO.TIPOVENTA , producto.getTipoventa () )
                    .set ( Tables.PRODUCTO.PRECIO , producto.getPrecio () )
                    .set ( Tables.PRODUCTO.IDRECETA , producto.getReceta ().getIdreceta () )
                    .set ( Tables.PRODUCTO.STOCK , producto.getStock() )
                    .returning ().fetchOne ().getValue ( Tables.PRODUCTO.IDPRODUCTO )
            );
        }
        desconectar ();
    }

    @Override
    public void modificar ( ModeloProducto producto ) throws Exception {
        conectar ();
        if ( producto.getTipo ().equals ( "U" ) ) {
            DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).update ( Tables.PRODUCTO )
                    .set ( Tables.PRODUCTO.NOMBRE , producto.getNombre () )
                    .set ( Tables.PRODUCTO.DETALLE , producto.getDetalle () )
                    .set ( Tables.PRODUCTO.IDCATEGORIA , producto.getCategoria ().getIdcategoria () )
                    .set ( Tables.PRODUCTO.PORCIONES , producto.getPorciones () )
                    .set ( Tables.PRODUCTO.DESCUENTO , producto.getDescuento () )
                    .set ( Tables.PRODUCTO.IMAGEN , producto.getImagen () )
                    .set ( Tables.PRODUCTO.TIPO , producto.getTipo () )
                    .set ( Tables.PRODUCTO.TIPOVENTA , producto.getTipoventa () )
                    .set ( Tables.PRODUCTO.PRECIO , producto.getPrecio () )
                    .set ( Tables.PRODUCTO.IDINSUMO , producto.getInsumo ().getIdinsumo () )
                    .set ( Tables.PRODUCTO.STOCK , producto.getStock() )
                    .set ( Tables.PRODUCTO.BAJA , producto.isBaja () )
                    .where ( Tables.PRODUCTO.IDPRODUCTO.eq ( producto.getIdproducto () ) )
                    .execute ();
        } else {
            DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).update ( Tables.PRODUCTO )
                    .set ( Tables.PRODUCTO.NOMBRE , producto.getNombre () )
                    .set ( Tables.PRODUCTO.DETALLE , producto.getDetalle () )
                    .set ( Tables.PRODUCTO.IDCATEGORIA , producto.getCategoria ().getIdcategoria () )
                    .set ( Tables.PRODUCTO.PORCIONES , producto.getPorciones () )
                    .set ( Tables.PRODUCTO.DESCUENTO , producto.getDescuento () )
                    .set ( Tables.PRODUCTO.IMAGEN , producto.getImagen () )
                    .set ( Tables.PRODUCTO.TIPO , producto.getTipo () )
                    .set ( Tables.PRODUCTO.TIPOVENTA , producto.getTipoventa () )
                    .set ( Tables.PRODUCTO.PRECIO , producto.getPrecio () )
                    .set ( Tables.PRODUCTO.IDRECETA , producto.getReceta ().getIdreceta () )
                    .set ( Tables.PRODUCTO.STOCK ,producto.getStock() )
                    .set ( Tables.PRODUCTO.BAJA , producto.isBaja () )
                    .where ( Tables.PRODUCTO.IDPRODUCTO.eq ( producto.getIdproducto () ) )
                    .execute ();
        }
        desconectar ();
    }

    @Override
    public List<ModeloProducto> obtenerLista ( Condition c ) throws Exception {
        List<ModeloProducto> productos = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ().from ( Tables.PRODUCTO )
                .where ( c )
                .orderBy ( Tables.PRODUCTO.NOMBRE )
                .fetch ();
        records.forEach ( r -> {
            productos.add ( convertirProducto ( r ) );
        } );
        desconectar ();
        return productos;
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
        if ( r != null ) {
            return new ModeloCategoriaProducto ( idCategoria , r.getValue ( Tables.CATEGORIA_PRODUCTO.IMAGEN ) ,
                                                 r.getValue ( Tables.CATEGORIA_PRODUCTO.NOMBRE ) );
        } else {
            return null;
        }
    }

    private ModeloInsumo getInsumo ( Integer idinsumo ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ().from ( Tables.INSUMO )
                .where ( Tables.INSUMO.IDINSUMO.eq ( idinsumo ) )
                .fetchOne ();
        return convertirInsumo ( r );
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
