package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.PermisoDAO;
import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.negocio.modelos.ModeloPermisos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.PERMISOS;

public class PermisosIDAO extends Conexion implements PermisoDAO {

    private static final Logger LOG = Logger.getLogger ( PermisosIDAO.class.
            getName () );

    public PermisosIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloPermisos pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarByEmpleado ( ModeloEmpleado pEmpleado ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .delete ( PERMISOS )
                .where ( PERMISOS.IDEMPLEADO.eq ( pEmpleado.getIdempleado () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public void insertar ( ModeloPermisos pT ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .insertInto ( PERMISOS )
                .set ( PERMISOS.IDEMPLEADO , pT.getEmpleado ().getIdempleado () )
                .set ( PERMISOS.IDMODULO , pT.getModulo ().getIdmodulo () )
                .set ( PERMISOS.PERMISO , pT.isPermiso () )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloPermisos> listaByEmpleado ( ModeloEmpleado empleado ) throws Exception {
        List<ModeloPermisos> permisos = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( PERMISOS )
                .where ( PERMISOS.IDEMPLEADO.eq ( empleado.getIdempleado () ) )
                .fetch ();
        records.forEach ( r -> {
            permisos.add ( new ModeloPermisos ( empleado , r.getValue ( PERMISOS.PERMISO ) , null ) );
        } );
        desconectar ();
        return permisos;
    }

    @Override
    public void modificar ( ModeloPermisos pT ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .update ( PERMISOS )
                .set ( PERMISOS.PERMISO , pT.isPermiso () )
                .where ( PERMISOS.IDEMPLEADO.eq ( pT.getEmpleado ().getIdempleado () )
                        .and ( PERMISOS.IDMODULO.eq ( pT.getModulo ().getIdmodulo () ) ) )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloPermisos> obtenerLista ( Condition pCondition ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

}
