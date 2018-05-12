package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.ClienteDAO;
import com.pereira.manolos.negocio.modelos.ModeloCliente;
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

public class ClienteIDAO extends Conexion implements ClienteDAO {

    private static final Logger LOG = Logger.getLogger ( ClienteIDAO.class.
            getName () );

    public ClienteIDAO () throws IOException {
    }

    @Override
    public void darAlta ( ModeloCliente pM ) {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void darBaja ( ModeloCliente pM ) {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar ( ModeloCliente pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String findNombreByID ( int pId ) {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar ( ModeloCliente cliente ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( CLIENTE )
                .set ( CLIENTE.NOMBRE , cliente.getNombre () )
                .set ( CLIENTE.DIRECCION , cliente.getDireccion () )
                .set ( CLIENTE.TELEFONO , cliente.getTelefono () )
                .set ( CLIENTE.EMAIL , cliente.getEmail () )
                .set ( CLIENTE.DUI , cliente.getDui () )
                .execute ();
        desconectar ();
    }

    @Override
    public void modificar ( ModeloCliente t ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).update ( CLIENTE )
                .set ( CLIENTE.NOMBRE , t.getNombre () )
                .set ( CLIENTE.DIRECCION , t.getDireccion () )
                .set ( CLIENTE.TELEFONO , t.getTelefono () )
                .set ( CLIENTE.EMAIL , t.getEmail () )
                .set ( CLIENTE.DUI , t.getDui () )
                .set ( CLIENTE.BAJA , t.isBaja () )
                .where ( CLIENTE.IDCLIENTE.equal ( t.getIdcliente () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloCliente> obtenerLista ( Condition c ) throws Exception {
        List<ModeloCliente> clientes = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ().from ( CLIENTE )
                .where ( c )
                .orderBy ( CLIENTE.NOMBRE.asc () )
                .fetch ();
        records.forEach ( r -> {
            clientes.add ( convertirCliente ( r ) );
        } );
        desconectar ();
        return clientes;
    }

    private ModeloCliente convertirCliente ( Record r ) {
        return new ModeloCliente ( r.getValue ( CLIENTE.IDCLIENTE ) , r.getValue ( CLIENTE.NOMBRE ) , r.getValue ( CLIENTE.DIRECCION ) ,
                                   r.getValue ( CLIENTE.TELEFONO ) , r.getValue ( CLIENTE.EMAIL ) , r.getValue ( CLIENTE.TIPO ) ,
                                   r.getValue ( CLIENTE.BAJA ) , r.getValue ( CLIENTE.DUI ) );
    }

}
