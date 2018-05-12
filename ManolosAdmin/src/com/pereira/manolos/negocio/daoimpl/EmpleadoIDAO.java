package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.EmpleadoDAO;
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

import static com.pereira.manolos.datos.database.Tables.PUESTO;
import static com.pereira.manolos.datos.database.tables.Empleado.EMPLEADO;

public class EmpleadoIDAO extends Conexion implements EmpleadoDAO {

    private static final Logger LOG = Logger.getLogger ( EmpleadoIDAO.class.
            getName () );

    public EmpleadoIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloEmpleado pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModeloEmpleado findByIDUser ( int pId ) {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModeloEmpleado findById ( int pId ) {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar ( ModeloEmpleado pT ) throws Exception {
        conectar ();
        pT.setIdempleado ( DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .insertInto ( EMPLEADO )
                .set ( EMPLEADO.NOMBRE , pT.getNombre () )
                .set ( EMPLEADO.DIRECCION , pT.getDireccion () )
                .set ( EMPLEADO.TELEFONO , pT.getTelefono () )
                .set ( EMPLEADO.EMAIL , pT.getEmail () )
                .set ( EMPLEADO.IDPUESTO , pT.getPuesto ().getIdpuesto () )
                .set ( EMPLEADO.DUI , pT.getDUI () )
                .returning ().fetchOne ().getValue ( EMPLEADO.IDEMPLEADO )
        );
        desconectar ();
    }

    @Override
    public void modificar ( ModeloEmpleado pT ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .update ( EMPLEADO )
                .set ( EMPLEADO.NOMBRE , pT.getNombre () )
                .set ( EMPLEADO.DIRECCION , pT.getDireccion () )
                .set ( EMPLEADO.TELEFONO , pT.getTelefono () )
                .set ( EMPLEADO.EMAIL , pT.getEmail () )
                .set ( EMPLEADO.IDPUESTO , pT.getPuesto ().getIdpuesto () )
                .set ( EMPLEADO.DUI , pT.getDUI () )
                .set ( EMPLEADO.BAJA , pT.isBaja () )
                .where ( EMPLEADO.IDEMPLEADO.equal ( pT.getIdempleado () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloEmpleado> obtenerLista ( Condition pCondition ) throws Exception {
        List<ModeloEmpleado> empleados = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( EMPLEADO )
                .where ( pCondition )
                .orderBy ( EMPLEADO.NOMBRE.asc () )
                .fetch ();
        records.forEach ( r -> {
            empleados.add ( convertirEmpleado ( r ) );
        } );
        desconectar ();
        return empleados;
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

    private ModeloPuesto getPuestoByID ( int pId ) {
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( PUESTO )
                .where ( PUESTO.IDPUESTO.equal ( pId ) )
                .fetchOne ();
        return convertirPuestos ( r );
    }

}
