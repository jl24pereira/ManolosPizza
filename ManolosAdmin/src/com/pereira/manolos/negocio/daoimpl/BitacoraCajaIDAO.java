package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.modelos.ModeloBitacoraCaja;
import com.pereira.manolos.util.Fechero;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.BITACORA_CAJA;
import static org.jooq.impl.DSL.count;
import static org.jooq.impl.DSL.sum;

public class BitacoraCajaIDAO extends Conexion implements com.pereira.manolos.negocio.dao.BitacoraCajaDAO {

    private static final Logger LOG = Logger.getLogger ( BitacoraCajaIDAO.class.
            getName () );

    public BitacoraCajaIDAO () throws IOException , Exception {

    }

    @Override
    public BigDecimal buscarDevoluciones ( ModeloBitacoraCaja apertura ) throws Exception {
        conectar ();
        BigDecimal devoluciones = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ( sum ( BITACORA_CAJA.VALOR ) )
                .from ( BITACORA_CAJA )
                .where ( BITACORA_CAJA.MOVIMIENTO.like ( "%DEVOLUCION%" ) )
                .and ( BITACORA_CAJA.FECHA.between ( Fechero.realToBase ( apertura.getFecha () ) , Fechero.realToBase ( new Date () ) ) )
                .and ( BITACORA_CAJA.IDCAJA.equal ( apertura.getCaja ().getIdcaja () ) )
                .fetchOne ( sum ( BITACORA_CAJA.VALOR ) , BigDecimal.class );
        desconectar ();
        return devoluciones;
    }

    @Override
    public BigDecimal buscarEgresos ( ModeloBitacoraCaja apertura ) throws Exception {
        conectar ();
        BigDecimal egresos = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ( sum ( BITACORA_CAJA.VALOR ) )
                .from ( BITACORA_CAJA )
                .where ( BITACORA_CAJA.MOVIMIENTO.like ( "%EGRESO%" ) )
                .and ( BITACORA_CAJA.FECHA.between ( Fechero.realToBase ( apertura.getFecha () ) , Fechero.realToBase ( new Date () ) ) )
                .and ( BITACORA_CAJA.IDCAJA.equal ( apertura.getCaja ().getIdcaja () ) )
                .fetchOne ( sum ( BITACORA_CAJA.VALOR ) , BigDecimal.class );
        desconectar ();
        return egresos;
    }

    @Override
    public BigDecimal buscarVentas ( ModeloBitacoraCaja apertura ) throws Exception {
        conectar ();
        BigDecimal ventas = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ( sum ( BITACORA_CAJA.VALOR ) )
                .from ( BITACORA_CAJA )
                .where ( BITACORA_CAJA.MOVIMIENTO.like ( "%VENTA%" ) )
                .and ( BITACORA_CAJA.FECHA.between ( Fechero.realToBase ( apertura.getFecha () ) , Fechero.realToBase ( new Date () ) ) )
                .and ( BITACORA_CAJA.IDCAJA.equal ( apertura.getCaja ().getIdcaja () ) )
                .fetchOne ( sum ( BITACORA_CAJA.VALOR ) , BigDecimal.class );
        desconectar ();
        return ventas;
    }

    @Override
    public void eliminar ( ModeloBitacoraCaja pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModeloBitacoraCaja encuentraUltimaApertura ( int id ) throws Exception {
        conectar ();
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ()
                .from ( BITACORA_CAJA )
                .where ( BITACORA_CAJA.MOVIMIENTO.equal ( "APERTURA" ).and ( BITACORA_CAJA.IDCAJA.equal ( id ) ) )
                .orderBy ( BITACORA_CAJA.FECHA.desc () )
                .limit ( 1 )
                .fetchOne ();
        desconectar ();
        return convertir ( r );

    }

    @Override
    public boolean hayCorteGZ ( Condition c ) throws Exception {
        int contador = 0;
        conectar ();
        contador = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).selectCount ()
                .from ( BITACORA_CAJA ).where ( c ).fetchOne ().getValue ( count () );
        desconectar ();
        return contador != 0;
    }

    @Override
    public boolean hayCorteZ ( Condition c ) throws Exception {
        int contador = 0;
        conectar ();
        contador = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).selectCount ()
                .from ( BITACORA_CAJA ).where ( c ).fetchOne ().getValue ( count () );
        desconectar ();
        return contador != 0;
    }

    @Override
    public void insertar ( ModeloBitacoraCaja t ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( BITACORA_CAJA )
                .set ( BITACORA_CAJA.FECHA , Fechero.realToBase ( t.getFecha () ) )
                .set ( BITACORA_CAJA.EMPLEADO , t.getEmplado () )
                .set ( BITACORA_CAJA.VALOR , t.getValor () )
                .set ( BITACORA_CAJA.MOVIMIENTO , t.getMovimiento () )
                .set ( BITACORA_CAJA.COMENTARIO , t.getComentario () )
                .execute ();
        desconectar ();
    }

    @Override
    public void modificar ( ModeloBitacoraCaja pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloBitacoraCaja> obtenerLista ( Condition pCondition ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    private ModeloBitacoraCaja convertir ( Record r ) {
        if ( r == null ) {
            return null;
        } else {
            ModeloBitacoraCaja modelo = new ModeloBitacoraCaja ();
            modelo.setEmplado ( r.getValue ( BITACORA_CAJA.EMPLEADO ) );
            modelo.setFecha ( Fechero.baseToDateTimeStamp ( r.getValue ( BITACORA_CAJA.FECHA ) ) );
            modelo.setValor ( r.getValue ( BITACORA_CAJA.VALOR ) );
            modelo.setMovimiento ( r.getValue ( BITACORA_CAJA.MOVIMIENTO ) );
            return modelo;
        }
    }

}
