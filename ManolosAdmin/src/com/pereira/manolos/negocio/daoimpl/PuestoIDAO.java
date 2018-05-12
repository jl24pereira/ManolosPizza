package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.PuestoDAO;
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

public class PuestoIDAO extends Conexion implements PuestoDAO {

    private static final Logger LOG = Logger.getLogger ( PuestoIDAO.class.
            getName () );

    public PuestoIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloPuesto pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String findPuestoByEmpleado ( ModeloEmpleado pEmpleado ) {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar ( ModeloPuesto pT ) throws Exception {
        conectar ();
        pT.setIdpuesto ( DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .insertInto ( PUESTO )
                .set ( PUESTO.NOMBRE , pT.getNombre () )
                .set ( PUESTO.DIASLABORALES , pT.getDiaslaborales () )
                .set ( PUESTO.SALARIODIA , pT.getSalariodia () )
                .set ( PUESTO.MOD , pT.isMOD () )
                .returning ().fetchOne ().getValue ( PUESTO.IDPUESTO )
        );
        desconectar ();
    }

    @Override
    public void modificar ( ModeloPuesto pT ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .update ( PUESTO )
                .set ( PUESTO.NOMBRE , pT.getNombre () )
                .set ( PUESTO.DIASLABORALES , pT.getDiaslaborales () )
                .set ( PUESTO.SALARIODIA , pT.getSalariodia () )
                .set ( PUESTO.MOD , pT.isMOD () )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloPuesto> obtenerLista ( Condition pCondition ) throws Exception {
        List<ModeloPuesto> puestos = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( PUESTO )
                .where ( pCondition )
                .fetch ();
        records.forEach ( r -> {
            puestos.add ( convertirPuestos ( r ) );
        } );
        desconectar ();
        return puestos;
    }

    private ModeloPuesto convertirPuestos ( Record pR ) {
        return new ModeloPuesto ( pR.getValue ( PUESTO.IDPUESTO ) , pR.getValue ( PUESTO.NOMBRE ) , pR.getValue ( PUESTO.SALARIODIA ) ,
                                  pR.getValue ( PUESTO.DIASLABORALES ) , pR.getValue ( PUESTO.MOD ) );
    }

}
