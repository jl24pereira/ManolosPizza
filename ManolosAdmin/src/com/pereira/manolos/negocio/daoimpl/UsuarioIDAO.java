package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.datos.database.Tables;
import com.pereira.manolos.negocio.dao.UsuarioDAO;
import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.negocio.modelos.ModeloPuesto;
import com.pereira.manolos.negocio.modelos.ModeloUsuario;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.EMPLEADO;
import static com.pereira.manolos.datos.database.Tables.PUESTO;
import static com.pereira.manolos.datos.database.Tables.USUARIO;
import static org.jooq.impl.DSL.count;

public class UsuarioIDAO extends Conexion implements UsuarioDAO {

    private static final Logger LOG = Logger.getLogger ( UsuarioIDAO.class.
            getName () );

    public UsuarioIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloUsuario pT ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .delete ( USUARIO )
                .where ( USUARIO.IDEMPLEADO.eq ( pT.getEmpleado ().getIdempleado () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public void eliminarByEmpleado ( ModeloEmpleado pEmpleado ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .delete ( USUARIO )
                .where ( USUARIO.IDEMPLEADO.eq ( pEmpleado.getIdempleado () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public boolean existeUsuario ( String pass ) throws Exception {
        conectar ();
        int contador = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ( count () ).from ( USUARIO ).where ( USUARIO.PASS.equal ( pass ) )
                .fetchOne ().getValue ( count () );
        desconectar ();
        return contador > 0;
    }

    @Override
    public boolean existeUsuario ( ModeloEmpleado pEmpleado ) throws Exception {
        conectar ();
        int contador = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ( count () ).from ( USUARIO ).where ( USUARIO.IDEMPLEADO.equal ( pEmpleado.getIdempleado () ) )
                .fetchOne ().getValue ( count () );
        desconectar ();
        return contador > 0;
    }

    @Override
    public boolean existeUsuario ( String user , String pass ) throws Exception {
        conectar ();
        int contador = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ( count () ).from ( USUARIO ).where ( USUARIO.USUARIO_.eq ( user ).and ( USUARIO.PASS.eq ( pass ) ) )
                .fetchOne ().getValue ( count () );
        desconectar ();
        return contador > 0;
    }

    @Override
    public ModeloUsuario getUsuarioByEmpleado ( ModeloEmpleado pEmpleado ) throws Exception {
        conectar ();
        Record record = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( USUARIO )
                .where ( USUARIO.IDEMPLEADO.eq ( pEmpleado.getIdempleado () ) )
                .fetchOne ();
        desconectar ();
        return new ModeloUsuario ( pEmpleado , record.getValue ( USUARIO.PASS ) , record.getValue ( USUARIO.USUARIO_ ) );
    }

    @Override
    public ModeloUsuario getUsuarioByPass ( String pass ) throws Exception {
        ModeloUsuario usuario = null;
        conectar ();
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ().from ( USUARIO )
                .where ( USUARIO.PASS.eq ( pass ) ).fetchOne ();
        usuario = new ModeloUsuario ( getEmpleado ( r.getValue ( USUARIO.IDEMPLEADO ) ) , r.getValue ( USUARIO.PASS ) ,
                                      r.getValue ( USUARIO.USUARIO_ ) );
        desconectar ();
        return usuario;
    }

    @Override
    public void insertar ( ModeloUsuario pT ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .insertInto ( USUARIO )
                .set ( USUARIO.IDEMPLEADO , pT.getEmpleado ().getIdempleado () )
                .set ( USUARIO.USUARIO_ , pT.getUsuario () )
                .set ( USUARIO.PASS , pT.getPassword () )
                .execute ();
        desconectar ();
    }

    @Override
    public boolean loguearsesu ( String user , String pass ) {
        if ( user.equals ( "38e949f6df1c376f702a2221b1448fbfcd742bc951a11bcc401b1be1aab8d79a" )
             && pass.equals ( "8ae2d37ec94a77d12011a1948740f462bd206770f4915fdcda318f4caad45240" ) ) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void modificar ( ModeloUsuario pT ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .update ( USUARIO )
                .set ( USUARIO.USUARIO_ , pT.getUsuario () )
                .set ( USUARIO.PASS , pT.getPassword () )
                .where ( USUARIO.IDEMPLEADO.eq ( pT.getEmpleado ().getIdempleado () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloUsuario> obtenerLista ( Condition pCondition ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
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

    private ModeloEmpleado getEmpleado ( Integer idempleado ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ()
                .from ( Tables.EMPLEADO ).where ( Tables.EMPLEADO.IDEMPLEADO.eq ( idempleado ) ).fetchOne ();
        return convertirEmpleado ( r );
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
