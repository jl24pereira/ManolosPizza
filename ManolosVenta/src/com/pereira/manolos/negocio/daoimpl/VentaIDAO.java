package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.VentaDAO;
import com.pereira.manolos.negocio.modelos.ModeloCaja;
import com.pereira.manolos.negocio.modelos.ModeloCliente;
import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.negocio.modelos.ModeloResolucion;
import com.pereira.manolos.negocio.modelos.ModeloVenta;
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

import static com.pereira.manolos.datos.database.Tables.CAJA;
import static com.pereira.manolos.datos.database.Tables.CLIENTE;
import static com.pereira.manolos.datos.database.Tables.EMPLEADO;
import static com.pereira.manolos.datos.database.Tables.RESOLUCION;
import static com.pereira.manolos.datos.database.Tables.VENTA;

public class VentaIDAO extends Conexion implements VentaDAO {

    private static final Logger LOG = Logger.getLogger ( VentaIDAO.class.
            getName () );

    public VentaIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloVenta pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTicket ( ModeloResolucion resolucion ) {
        String ticket = "000000";
        if ( resolucion.getTktactual () + 1 < 10 ) {
            ticket = "00000" + ( resolucion.getTktactual () + 1 );
        } else if ( resolucion.getTktactual () + 1 < 100 ) {
            ticket = "0000" + ( resolucion.getTktactual () + 1 );
        } else if ( resolucion.getTktactual () + 1 < 1000 ) {
            ticket = "000" + ( resolucion.getTktactual () + 1 );
        } else if ( resolucion.getTktactual () + 1 < 10000 ) {
            ticket = "00" + ( resolucion.getTktactual () + 1 );
        } else if ( resolucion.getTktactual () + 1 < 100000 ) {
            ticket = "0" + ( resolucion.getTktactual () + 1 );
        } else {
            ticket = "" + ( resolucion.getTktactual () + 1 );
        }
        return ticket;
    }

    @Override
    public ModeloVenta getVentaByTicket ( String pTicket ) throws Exception {
        ModeloVenta venta = null;
        conectar ();
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ()
                .from ( VENTA )
                .where ( VENTA.NUMEROFACTURA.eq ( pTicket ) )
                .and ( "fecha between CURRENT_TIMESTAMP - CAST('7 days' AS INTERVAL) and CURRENT_TIMESTAMP" )
                .fetchOne ();
        venta = convertirVenta ( r );
        desconectar ();
        return venta;
    }

    @Override
    public void insertar ( ModeloVenta venta ) throws Exception {
        conectar ();
        venta.setIdventa ( DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .insertInto ( VENTA )
                .set ( VENTA.NUMEROFACTURA , venta.getNumerofactura () )
                .set ( VENTA.FECHA , Fechero.realToBase ( venta.getFecha () ) )
                .set ( VENTA.IDCLIENTE , venta.getCliente ().getIdcliente () )
                .set ( VENTA.IDEMPLEADO , venta.getEmpleado ().getIdempleado () )
                .set ( VENTA.TOTAL , venta.getTotal () )
                .set ( VENTA.ENLETRAS , venta.getEnletras () )
                .set ( VENTA.TIPODOC , venta.getTipodoc () )
                .set ( VENTA.TIPOVENTA , venta.getTipoventa () )
                .set ( VENTA.IDRESOLUCION , venta.getResolucion ().getIdresolucion () )
                .set ( VENTA.GRAVADO , venta.getGravado () )
                .set ( VENTA.EXENTO , venta.getExento () )
                .set ( VENTA.NOSUJETO , venta.getNosujeto () )
                .returning ().fetchOne ().getValue ( VENTA.IDVENTA )
        );
        desconectar ();
    }

    @Override
    public void insertarSinCliente ( ModeloVenta venta ) throws Exception {
        conectar ();
        venta.setIdventa ( DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .insertInto ( VENTA )
                .set ( VENTA.NUMEROFACTURA , venta.getNumerofactura () )
                .set ( VENTA.FECHA , Fechero.realToBase ( venta.getFecha () ) )
                .set ( VENTA.IDEMPLEADO , venta.getEmpleado ().getIdempleado () )
                .set ( VENTA.TOTAL , venta.getTotal () )
                .set ( VENTA.ENLETRAS , venta.getEnletras () )
                .set ( VENTA.TIPODOC , venta.getTipodoc () )
                .set ( VENTA.TIPOVENTA , venta.getTipoventa () )
                .set ( VENTA.IDRESOLUCION , venta.getResolucion ().getIdresolucion () )
                .set ( VENTA.GRAVADO , venta.getGravado () )
                .set ( VENTA.EXENTO , venta.getExento () )
                .set ( VENTA.NOSUJETO , venta.getNosujeto () )
                .returning ().fetchOne ().getValue ( VENTA.IDVENTA )
        );
        desconectar ();
    }

    @Override
    public void modificar ( ModeloVenta venta ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).update ( VENTA )
                .set ( VENTA.NUMEROFACTURA , venta.getNumerofactura () )
                .set ( VENTA.FECHA , Fechero.realToBase ( venta.getFecha () ) )
                .set ( VENTA.IDEMPLEADO , venta.getEmpleado ().getIdempleado () )
                .set ( VENTA.TOTAL , venta.getTotal () )
                .set ( VENTA.ENLETRAS , venta.getEnletras () )
                .set ( VENTA.TIPODOC , venta.getTipodoc () )
                .set ( VENTA.TIPOVENTA , venta.getTipoventa () )
                .set ( VENTA.IDRESOLUCION , venta.getResolucion ().getIdresolucion () )
                .set ( VENTA.GRAVADO , venta.getGravado () )
                .set ( VENTA.EXENTO , venta.getExento () )
                .set ( VENTA.NOSUJETO , venta.getNosujeto () )
                .where ( VENTA.IDVENTA.eq ( venta.getIdventa () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloVenta> obtenerLista ( Condition c ) throws Exception {
        List<ModeloVenta> ventas = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ()
                .from ( VENTA )
                .where ( c )
                .fetch ();
        records.forEach ( r -> {
            ventas.add ( convertirVenta ( r ) );
        } );
        desconectar ();
        return ventas;
    }

    private ModeloCaja convertirCaja ( Record r ) {
        if ( r == null ) {
            return null;
        } else {
            return new ModeloCaja ( r.getValue ( CAJA.BAJA ) , r.getValue ( CAJA.DETALLE ) , r.getValue ( CAJA.ESTADO ) , r.getValue ( CAJA.IDCAJA ) ,
                                    r.getValue ( CAJA.IPCAJA ) );
        }
    }

    private ModeloCliente convertirCliente ( Record r ) {
        if ( r == null ) {
            return null;
        } else {
            return new ModeloCliente ( r.getValue ( CLIENTE.IDCLIENTE ) , r.getValue ( CLIENTE.NOMBRE ) , r.getValue ( CLIENTE.DIRECCION ) , r.
                                       getValue ( CLIENTE.TELEFONO ) , r.getValue ( CLIENTE.EMAIL ) , r.getValue ( CLIENTE.TIPO ) ,
                                       r.getValue ( CLIENTE.BAJA ) , r.getValue ( CLIENTE.DUI ) );
        }

    }

    private ModeloResolucion convertirResolucion ( Record r ) {
        return new ModeloResolucion ( r.getValue ( RESOLUCION.IDRESOLUCION ) , r.getValue ( RESOLUCION.RESOLUCION_ ) ,
                                      r.getValue ( RESOLUCION.TKTINICIAL ) , r.getValue ( RESOLUCION.TKTFINAL ) , r.getValue ( RESOLUCION.TKTACTUAL ) ,
                                      r.getValue ( RESOLUCION.TKTALERTA ) , r.getValue ( RESOLUCION.SERIE ) ,
                                      Fechero.baseToDate ( r.getValue ( RESOLUCION.FECHA ) ) , getCaja ( r.getValue ( RESOLUCION.IDCAJA ) ) , r.
                                      getValue ( RESOLUCION.ACTIVA ) );
    }

    private ModeloVenta convertirVenta ( Record r ) {
        if ( r == null ) {
            return null;
        } else {
            return new ModeloVenta ( r.getValue ( VENTA.IDVENTA ) , r.getValue ( VENTA.NUMEROFACTURA ) ,
                                     Fechero.baseToDateTimeStamp ( r.getValue ( VENTA.FECHA ) ) , getCliente ( r.getValue ( VENTA.IDCLIENTE ) ) ,
                                     getEmpleado ( r.getValue ( VENTA.IDEMPLEADO ) ) , getResolucion ( r.getValue ( VENTA.IDRESOLUCION ) ) ,
                                     r.getValue ( VENTA.TIPODOC ) , r.getValue ( VENTA.TIPOVENTA ) , r.getValue ( VENTA.GRAVADO ) ,
                                     r.getValue ( VENTA.EXENTO ) , r.getValue ( VENTA.NOSUJETO ) , r.getValue ( VENTA.TOTAL ) , null );
        }
    }

    private ModeloEmpleado covertirEmpleado ( Record r ) {
        return new ModeloEmpleado ( r.getValue ( EMPLEADO.IDEMPLEADO ) , r.getValue ( EMPLEADO.NOMBRE ) , r.getValue ( EMPLEADO.TELEFONO ) , r.
                                    getValue ( EMPLEADO.DIRECCION ) , r.getValue ( EMPLEADO.EMAIL ) , r.getValue ( EMPLEADO.DUI ) , null , null ,
                                    r.getValue ( EMPLEADO.BAJA ) );
    }

    private ModeloCaja getCaja ( Integer idcaja ) {
        if ( idcaja == null ) {
            return null;
        } else {
            Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ()
                    .from ( CAJA )
                    .where ( CAJA.IDCAJA.eq ( idcaja ) )
                    .fetchOne ();
            return convertirCaja ( r );
        }
    }

    private ModeloCliente getCliente ( Integer idcliente ) {
        if ( idcliente == null ) {
            return null;
        } else {
            Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ()
                    .from ( CLIENTE )
                    .where ( CLIENTE.IDCLIENTE.eq ( idcliente ) )
                    .fetchOne ();
            return convertirCliente ( r );
        }
    }

    private ModeloEmpleado getEmpleado ( Integer idempleado ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ()
                .from ( EMPLEADO )
                .where ( EMPLEADO.IDEMPLEADO.eq ( idempleado ) )
                .fetchOne ();
        return covertirEmpleado ( r );
    }

    private ModeloResolucion getResolucion ( Integer pValue ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ()
                .from ( RESOLUCION )
                .where ( RESOLUCION.IDRESOLUCION.eq ( pValue ) )
                .fetchOne ();
        return convertirResolucion ( r );
    }

}
