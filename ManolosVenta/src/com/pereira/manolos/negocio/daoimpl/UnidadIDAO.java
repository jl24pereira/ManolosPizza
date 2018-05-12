package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.UnidadDAO;
import com.pereira.manolos.negocio.modelos.ModeloMedida;
import com.pereira.manolos.negocio.modelos.ModeloUnidad;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.MEDIDA;
import static com.pereira.manolos.datos.database.Tables.UNIDAD_MEDIDA;

public class UnidadIDAO extends Conexion implements UnidadDAO {

    private static final Logger LOG = Logger.getLogger ( UnidadIDAO.class.
            getName () );

    public UnidadIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloUnidad pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUnidadByID ( int pId ) throws Exception {
        conectar ();
        Record unidad = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( UNIDAD_MEDIDA )
                .where ( UNIDAD_MEDIDA.IDUNIDAD.eq ( pId ) )
                .fetchOne ();
        desconectar ();
        return unidad.getValue ( UNIDAD_MEDIDA.DETALLE );
    }

    @Override
    public void insertar ( ModeloUnidad pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar ( ModeloUnidad pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloUnidad> obtenerLista ( Condition pCondition ) throws Exception {
        List<ModeloUnidad> unidades = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( UNIDAD_MEDIDA )
                .where ( pCondition )
                .orderBy ( UNIDAD_MEDIDA.DETALLE.asc () )
                .fetch ();
        records.stream ().forEach ( r -> {
            unidades.add ( convertirUnidades ( r ) );
        } );
        desconectar ();
        return unidades;
    }

    private ModeloUnidad convertirUnidades ( Record r ) {
        Record medida = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( MEDIDA )
                .where ( MEDIDA.IDMEDIDA.equal ( r.getValue ( UNIDAD_MEDIDA.IDMEDIDA ) ) )
                .fetchOne ();
        if ( r.getValue ( UNIDAD_MEDIDA.UNIDADPADRE ) == null ) {
            return new ModeloUnidad (
                    r.getValue ( UNIDAD_MEDIDA.IDUNIDAD ) ,
                    r.getValue ( UNIDAD_MEDIDA.DETALLE ) ,
                    convertirMedidas ( medida ) ,
                    r.getValue ( UNIDAD_MEDIDA.EQUIVALENCIA ) );
        } else {
            Record unidadPadre = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                    .select ()
                    .from ( UNIDAD_MEDIDA )
                    .where ( UNIDAD_MEDIDA.IDUNIDAD.equal ( r.getValue ( UNIDAD_MEDIDA.UNIDADPADRE ) ) )
                    .fetchOne ();
            return new ModeloUnidad (
                    r.getValue ( UNIDAD_MEDIDA.IDUNIDAD ) ,
                    r.getValue ( UNIDAD_MEDIDA.DETALLE ) ,
                    convertirMedidas ( medida ) ,
                    convertirUnidades ( unidadPadre ) ,
                    r.getValue ( UNIDAD_MEDIDA.EQUIVALENCIA ) );
        }

    }

    private ModeloMedida convertirMedidas ( Record r ) {
        return new ModeloMedida ( r.getValue ( MEDIDA.IDMEDIDA ) , r.getValue ( MEDIDA.DETALLE ) );
    }

}
/*@Override
    public void insertar(ModeloUnidadMedida t) {    }

    @Override
    public void modificar(ModeloUnidadMedida t) {    }

    @Override
    public void eliminar(ModeloUnidadMedida t) {    }

    @Override
    public List<ModeloUnidadMedida> obtenerLista(Condition condition) {
        List<ModeloUnidadMedida> unidades = new ArrayList<>();
        SelectQuery<Record> query = this.contexto.selectQuery();
        query.addFrom(UNIDAD_MEDIDA);
        query.addConditions(condition);
        query.addOrderBy(UNIDAD_MEDIDA.DETALLE.asc());
        Result<Record> result = query.fetch();
        result.stream().forEach((r) -> {
            unidades.add(convertir(r));
        });
        return unidades;
    }

    private ModeloUnidadMedida convertir(Record r) {
        ModeloUnidadMedida m = new ModeloUnidadMedida(
                r.getValue(UNIDAD_MEDIDA.IDUNIDAD),
                r.getValue(UNIDAD_MEDIDA.DETALLE),
                r.getValue(UNIDAD_MEDIDA.IDMEDIDA),
                r.getValue(UNIDAD_MEDIDA.UNIDADPADRE),
                r.getValue(UNIDAD_MEDIDA.EQUIVALENCIA)
        );
        return m;
    }

    @Override
    public String getUnidadByID(int id) {
        return contexto.select(UNIDAD_MEDIDA.DETALLE).from(UNIDAD_MEDIDA).where(UNIDAD_MEDIDA.IDUNIDAD.equal(id)).fetchOne().getValue(UNIDAD_MEDIDA.DETALLE);
    }*/
