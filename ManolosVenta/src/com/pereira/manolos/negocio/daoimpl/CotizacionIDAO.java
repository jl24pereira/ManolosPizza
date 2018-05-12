package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.CotizacionDAO;
import com.pereira.manolos.negocio.modelos.ModeloCotizacion;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.COTIZACION;
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
    public void insertar ( ModeloCotizacion pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
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
    public List<ModeloCotizacion> obtenerLista ( Condition pCondition ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

}
/*@Override
    public void insertar(ModeloCotizacion t) {
        Record r = this.contexto.insertInto(COTIZACION)
                .set(COTIZACION.NUMERO,t.getNumero())
                .set(COTIZACION.FECHA,new java.sql.Date (t.getFecha().getTime()))
                .set(COTIZACION.IDCLIENTE,t.getIdcliente())
                .set(COTIZACION.IDEMPLEADO,t.getIdempleado())
                .set(COTIZACION.TOTAL,t.getTotal())
                .set(COTIZACION.ENLETRAS,t.getEnletras())
                .set(COTIZACION.VALIDAPOR,t.getValidapor())
                .set(COTIZACION.VENCIMIENTO,new java.sql.Date(t.getVencimiento().getTime()))
                .returning(COTIZACION.IDCOTIZACION).fetchOne();
        t.setIdcotizacion(r.getValue(COTIZACION.IDCOTIZACION));
    }

    private ModeloCotizacion convertir(Record r){

        ModeloCotizacion m= new ModeloCotizacion(
                r.getValue(COTIZACION.IDCOTIZACION),
                r.getValue(COTIZACION.NUMERO),
                new java.util.Date(r.getValue(COTIZACION.FECHA).getTime()),
                r.getValue(COTIZACION.IDCLIENTE),
                r.getValue(COTIZACION.IDEMPLEADO),
                r.getValue(COTIZACION.TOTAL),
                r.getValue(COTIZACION.ENLETRAS)
        );
        return m;
    }

    @Override
    public List<ModeloCotizacion> obtenerLista(Condition condition) {
        List<ModeloCotizacion> cotizaciones = new ArrayList<>();
        Result<Record> result = contexto.select()
                .from(COTIZACION)
                .join(CLIENTE).on(CLIENTE.IDCLIENTE.equal(COTIZACION.IDCLIENTE))
                .where(condition)
                .orderBy(COTIZACION.FECHA.asc())
                .fetch();
        result.stream().forEach((r) -> {
            cotizaciones.add(convertir(r));
        });
        return cotizaciones;
    }

    @Override
    public void insertarInformal(ModeloCotizacion t) {
        Record r = this.contexto.insertInto(COTIZACION)
                .set(COTIZACION.NUMERO,t.getNumero())
                .set(COTIZACION.FECHA,new java.sql.Date (t.getFecha().getTime()))
                .set(COTIZACION.IDCLIENTE,t.getIdcliente())
                .set(COTIZACION.IDEMPLEADO,t.getIdempleado())
                .set(COTIZACION.TOTAL,t.getTotal())
                .set(COTIZACION.ENLETRAS,t.getEnletras())
                .returning(COTIZACION.IDCOTIZACION).fetchOne();
        t.setIdcotizacion(r.getValue(COTIZACION.IDCOTIZACION));
    }

    @Override
    public String getNumero() {
        int tickets = contexto.select(count()).from(COTIZACION).fetchOne().getValue(count());
        tickets+=1;
        return ""+tickets;
    }*/
