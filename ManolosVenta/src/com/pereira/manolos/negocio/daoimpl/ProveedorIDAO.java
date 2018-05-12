/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.ProveedorDAO;
import com.pereira.manolos.negocio.modelos.ModeloProveedor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.PROVEEDOR;

/**
 *
 * @author Jose Luis
 */
public class ProveedorIDAO extends Conexion implements ProveedorDAO {

    private static final Logger LOG = Logger.getLogger ( ProveedorIDAO.class.
            getName () );

    public ProveedorIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloProveedor pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar ( ModeloProveedor pT ) throws Exception {
        conectar ();
        pT.setIdproveedor ( DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .insertInto ( PROVEEDOR )
                .set ( PROVEEDOR.NOMBRE , pT.getNombre () )
                .set ( PROVEEDOR.DIRECCION , pT.getDireccion () )
                .set ( PROVEEDOR.TELEFONO , pT.getTelefono () )
                .set ( PROVEEDOR.NIT , pT.getNIT () )
                .set ( PROVEEDOR.NRC , pT.getVNRC () )
                .set ( PROVEEDOR.GIRO , pT.getGiro () )
                .set ( PROVEEDOR.REPRESENTANTE , pT.getRepresentante () )
                .set ( PROVEEDOR.MAIL , pT.getEmail () )
                .set ( PROVEEDOR.TIPOPROVEEDOR , pT.getTipoproveedor () )
                .set ( PROVEEDOR.PLAZO , pT.getPlazo () )
                .set ( PROVEEDOR.LIMITE , pT.getLimite () )
                .returning ().fetchOne ().getValue ( PROVEEDOR.IDPROVEEDOR )
        );
        desconectar ();
    }

    @Override
    public void modificar ( ModeloProveedor pT ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .update ( PROVEEDOR )
                .set ( PROVEEDOR.NOMBRE , pT.getNombre () )
                .set ( PROVEEDOR.DIRECCION , pT.getDireccion () )
                .set ( PROVEEDOR.TELEFONO , pT.getTelefono () )
                .set ( PROVEEDOR.NIT , pT.getNIT () )
                .set ( PROVEEDOR.NRC , pT.getVNRC () )
                .set ( PROVEEDOR.GIRO , pT.getGiro () )
                .set ( PROVEEDOR.REPRESENTANTE , pT.getRepresentante () )
                .set ( PROVEEDOR.MAIL , pT.getEmail () )
                .set ( PROVEEDOR.TIPOPROVEEDOR , pT.getTipoproveedor () )
                .set ( PROVEEDOR.PLAZO , pT.getPlazo () )
                .set ( PROVEEDOR.LIMITE , pT.getLimite () )
                .set ( PROVEEDOR.BAJA , pT.isBaja () )
                .where ( PROVEEDOR.IDPROVEEDOR.eq ( pT.getIdproveedor () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloProveedor> obtenerLista ( Condition pCondition ) throws Exception {
        List<ModeloProveedor> proveedores = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ().from ( PROVEEDOR ).where ( pCondition ).fetch ();
        records.forEach ( r -> {
            proveedores.add ( convertirProveedor ( r ) );
        } );
        desconectar ();
        return proveedores;
    }

    private ModeloProveedor convertirProveedor ( Record r ) {
        return new ModeloProveedor ( r.getValue ( PROVEEDOR.IDPROVEEDOR ) , r.getValue ( PROVEEDOR.NOMBRE ) , r.getValue ( PROVEEDOR.DIRECCION ) ,
                                     r.getValue ( PROVEEDOR.TELEFONO ) , r.getValue ( PROVEEDOR.GIRO ) , r.getValue ( PROVEEDOR.NIT ) ,
                                     r.getValue ( PROVEEDOR.NRC ) , r.getValue ( PROVEEDOR.MAIL ) , r.getValue ( PROVEEDOR.REPRESENTANTE ) ,
                                     r.getValue ( PROVEEDOR.TIPOPROVEEDOR ) , r.getValue ( PROVEEDOR.PLAZO ) , r.getValue ( PROVEEDOR.LIMITE ) ,
                                     r.getValue ( PROVEEDOR.BAJA ) );
    }

}
