package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.CotizacionDAO;
import com.pereira.manolos.negocio.modelos.ModeloCliente;
import com.pereira.manolos.negocio.modelos.ModeloCotizacion;
import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.negocio.modelos.ModeloPuesto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.CLIENTE;
import static com.pereira.manolos.datos.database.Tables.COTIZACION;
import static com.pereira.manolos.datos.database.Tables.EMPLEADO;
import static com.pereira.manolos.datos.database.Tables.PUESTO;
import static org.jooq.impl.DSL.count;

public class CotizacionIDAO extends Conexion implements CotizacionDAO {

    private static final Logger LOG = Logger.getLogger ( CotizacionIDAO.class.
            getName () );

    public CotizacionIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloCotizacion pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNumero () throws Exception {
        conectar ();
        int tickets = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ( count () ).from ( COTIZACION )
                .fetchOne ().getValue ( count () );
        tickets += 1;
        desconectar ();
        return "" + tickets;

    }

    @Override
    public void insertar ( ModeloCotizacion t ) throws Exception {
        conectar ();
        t.setIdcotizacion ( DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( COTIZACION )
                .set ( COTIZACION.NUMERO , t.getNumero () )
                .set ( COTIZACION.FECHA , new java.sql.Date ( t.getFecha ().getTime () ) )
                .set ( COTIZACION.IDCLIENTE , t.getCliente ().getIdcliente () )
                .set ( COTIZACION.IDEMPLEADO , t.getEmpleado ().getIdempleado () )
                .set ( COTIZACION.TOTAL , t.getTotal () )
                .set ( COTIZACION.ENLETRAS , t.getEnletras () )
                .returning ().fetchOne ().getValue ( COTIZACION.IDCOTIZACION )
        );
        desconectar ();
    }

    @Override
    public void insertarInformal ( ModeloCotizacion t ) throws Exception {
        conectar ();
        t.setIdcotizacion ( DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( COTIZACION )
                .set ( COTIZACION.NUMERO , t.getNumero () )
                .set ( COTIZACION.FECHA , new java.sql.Date ( t.getFecha ().getTime () ) )
                .set ( COTIZACION.IDCLIENTE , t.getCliente ().getIdcliente () )
                .set ( COTIZACION.IDEMPLEADO , t.getEmpleado ().getIdempleado () )
                .set ( COTIZACION.TOTAL , t.getTotal () )
                .set ( COTIZACION.ENLETRAS , t.getEnletras () )
                .returning ().fetchOne ().getValue ( COTIZACION.IDCOTIZACION )
        );
        desconectar ();
    }

    @Override
    public void modificar ( ModeloCotizacion pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloCotizacion> obtenerLista ( Condition c ) throws Exception {
        List<ModeloCotizacion> cotizaciones = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( COTIZACION )
                .where ( c )
                .orderBy ( COTIZACION.FECHA )
                .fetch ();
        records.stream ().forEach ( r -> {
            cotizaciones.add ( convertirCotizacion ( r ) );
        } );
        desconectar ();
        return cotizaciones;
    }

    private ModeloCliente convertirCliente ( Record r ) {
        return new ModeloCliente ( r.getValue ( CLIENTE.IDCLIENTE ) , r.getValue ( CLIENTE.NOMBRE ) , r.getValue ( CLIENTE.DIRECCION ) ,
                                   r.getValue ( CLIENTE.TELEFONO ) , r.getValue ( CLIENTE.EMAIL ) , r.getValue ( CLIENTE.TIPO ) ,
                                   r.getValue ( CLIENTE.BAJA ) , r.getValue ( CLIENTE.DUI ) );
    }

    private ModeloCotizacion convertirCotizacion ( Record r ) {
        return new ModeloCotizacion ( r.getValue ( COTIZACION.IDCOTIZACION ) , r.getValue ( COTIZACION.NUMERO ) , r.getValue ( COTIZACION.FECHA ) ,
                                      getCliente ( r.getValue ( COTIZACION.IDCLIENTE ) ) , getEmpleado ( r.getValue ( COTIZACION.IDEMPLEADO ) ) ,
                                      r.getValue ( COTIZACION.TOTAL ) , "" );
    }

    private ModeloEmpleado convertirEmpleado ( Record pR ) {
        return new ModeloEmpleado ( pR.getValue ( EMPLEADO.IDEMPLEADO ) , pR.getValue ( EMPLEADO.NOMBRE ) , pR.getValue ( EMPLEADO.TELEFONO ) ,
                                    pR.getValue ( EMPLEADO.DIRECCION ) , pR.getValue ( EMPLEADO.EMAIL ) , pR.getValue ( EMPLEADO.DUI ) ,
                                    pR.getValue ( EMPLEADO.NIT ) , getPuestoByID ( pR.getValue ( EMPLEADO.IDPUESTO ) ) , pR.getValue ( EMPLEADO.BAJA ) );
    }

    private ModeloPuesto convertirPuestos ( Record pR ) {
        return new ModeloPuesto ( pR.getValue ( PUESTO.IDPUESTO ) , pR.getValue ( PUESTO.NOMBRE ) , pR.getValue ( PUESTO.SALARIODIA ) ,
                                  pR.getValue ( PUESTO.DIASLABORALES ) , pR.getValue ( PUESTO.MOD ) );
    }

    private ModeloCliente getCliente ( Integer idcliente ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ()
                .from ( CLIENTE )
                .where ( CLIENTE.IDCLIENTE.eq ( idcliente ) )
                .fetchOne ();
        if ( r == null ) {
            return null;
        } else {
            return convertirCliente ( r );
        }
    }

    private ModeloEmpleado getEmpleado ( Integer idempleado ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ()
                .from ( EMPLEADO )
                .where ( EMPLEADO.IDEMPLEADO.eq ( idempleado ) )
                .fetchOne ();
        if ( r == null ) {
            return null;
        } else {
            return convertirEmpleado ( r );
        }
    }

    private ModeloPuesto getPuestoByID ( int pId ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( PUESTO )
                .where ( PUESTO.IDPUESTO.equal ( pId ) )
                .fetchOne ();
        return convertirPuestos ( r );
    }

}
