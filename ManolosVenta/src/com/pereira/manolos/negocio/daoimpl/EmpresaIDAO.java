/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.EmpresaDAO;
import com.pereira.manolos.negocio.modelos.ModeloEmpresa;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.tables.Empresa.EMPRESA;
import static org.jooq.impl.DSL.count;

/**
 *
 * @author Jose Luis
 */
public class EmpresaIDAO extends Conexion implements EmpresaDAO {

    private static final Logger LOG = Logger.getLogger ( EmpresaIDAO.class.
            getName () );

    public EmpresaIDAO () throws IOException {
    }

    @Override
    public ModeloEmpresa cargarEmpresa ( int id ) throws Exception {
        ModeloEmpresa miEmpresa = null;
        int c = 0;
        conectar ();
        c = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ( count () )
                .from ( EMPRESA )
                .where ( EMPRESA.IDEMPRESA.equal ( id ) )
                .fetchOne ()
                .getValue ( count () );
        if ( c > 0 ) {
            Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                    .select ()
                    .from ( EMPRESA )
                    .where ( EMPRESA.IDEMPRESA.equal ( id ) )
                    .fetchOne ();
            miEmpresa = new ModeloEmpresa (
                    r.getValue ( EMPRESA.IDEMPRESA ) ,
                    r.getValue ( EMPRESA.NOMBRE ) ,
                    r.getValue ( EMPRESA.DIRECCION ) ,
                    r.getValue ( EMPRESA.TELEFONO ) ,
                    r.getValue ( EMPRESA.EMAIL ) ,
                    r.getValue ( EMPRESA.PROPIETARIO ) ,
                    r.getValue ( EMPRESA.GIRO ) ,
                    r.getValue ( EMPRESA.NIT ) ,
                    r.getValue ( EMPRESA.NRC ) ,
                    r.getValue ( EMPRESA.IVA ) ,
                    r.getValue ( EMPRESA.HORASTRABAJO ) ,
                    r.getValue ( EMPRESA.LOGO ) );
        }
        desconectar ();
        return miEmpresa;
    }

    @Override
    public void eliminar ( ModeloEmpresa pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar ( ModeloEmpresa pT ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .insertInto ( EMPRESA )
                .set ( EMPRESA.IDEMPRESA , pT.getIdEmpresa () )
                .set ( EMPRESA.NOMBRE , pT.getNombre () )
                .set ( EMPRESA.DIRECCION , pT.getDireccion () )
                .set ( EMPRESA.TELEFONO , pT.getTelefono () )
                .set ( EMPRESA.EMAIL , pT.getEmail () )
                .set ( EMPRESA.PROPIETARIO , pT.getPropietario () )
                .set ( EMPRESA.GIRO , pT.getGiro () )
                .set ( EMPRESA.NIT , pT.getNIT () )
                .set ( EMPRESA.NRC , pT.getNRC () )
                .set ( EMPRESA.IVA , pT.getIVA () )
                .set ( EMPRESA.HORASTRABAJO , pT.getHorastrabajo () )
                .set ( EMPRESA.LOGO , pT.getLogo () ).execute ();
        desconectar ();
    }

    @Override
    public void modificar ( ModeloEmpresa pT ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .update ( EMPRESA )
                .set ( EMPRESA.NOMBRE , pT.getNombre () )
                .set ( EMPRESA.DIRECCION , pT.getDireccion () )
                .set ( EMPRESA.TELEFONO , pT.getTelefono () )
                .set ( EMPRESA.EMAIL , pT.getEmail () )
                .set ( EMPRESA.PROPIETARIO , pT.getPropietario () )
                .set ( EMPRESA.GIRO , pT.getGiro () )
                .set ( EMPRESA.NIT , pT.getNIT () )
                .set ( EMPRESA.NRC , pT.getNRC () )
                .set ( EMPRESA.IVA , pT.getIVA () )
                .set ( EMPRESA.HORASTRABAJO , pT.getHorastrabajo () )
                .set ( EMPRESA.LOGO , pT.getLogo () )
                .where ( EMPRESA.IDEMPRESA.equal ( pT.getIdEmpresa () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloEmpresa> obtenerLista ( Condition pCondition ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

}
