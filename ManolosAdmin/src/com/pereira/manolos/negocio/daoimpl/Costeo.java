package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.logging.Logger;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.RECETA;
import static com.pereira.manolos.datos.database.Tables.V_CIF;
import static com.pereira.manolos.datos.database.Tables.V_DETALLE_RECETA;
import static com.pereira.manolos.datos.database.Tables.V_MOD_HORA;
import static org.jooq.impl.DSL.sum;

/* @author Jose Luis */
public class Costeo extends Conexion {

    private static final Logger LOG = Logger.getLogger ( Costeo.class.getName () );

    public Costeo () throws IOException {
    }

    public void actualizarCosteos () throws Exception {
        conectar ();
        Result<Record> result = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ().from ( RECETA ).fetch ();
        desconectar ();
        for ( Record r : result ) {
            this.guardarCosteo ( r.getValue ( RECETA.IDRECETA ) );
        }
    }

    public double costeoIndividual ( int idreceta ) throws Exception {
        double costo = 0;
        costo = this.costoMateriales ( idreceta ) + this.costoMOD ( idreceta ) + this.costoCIF ( idreceta );
        return costo;
    }

    public double costoCIF ( int idreceta ) throws Exception {
        double costo = 0;
        conectar ();
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( RECETA )
                .where ( RECETA.IDRECETA.equal ( idreceta ) )
                .fetchOne ();
        int horas = r.getValue ( RECETA.HORAS );
        int minutos = r.getValue ( RECETA.MINUTOS );
        double HHxReceta = ( double ) horas + ( ( double ) minutos / 60 );
        double tasacif = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ( V_CIF.TASACIF ).from ( V_CIF ).limit ( 1 ).fetchOne (
                V_CIF.TASACIF );
        costo = HHxReceta * tasacif;
        desconectar ();
        return costo;
    }

    public double costoMOD ( int idreceta ) throws Exception {
        conectar ();
        Record r = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ()
                .from ( RECETA )
                .where ( RECETA.IDRECETA.equal ( idreceta ) )
                .fetchOne ();
        int horas = r.getValue ( RECETA.HORAS );
        int minutos = r.getValue ( RECETA.MINUTOS );
        double HHxReceta = ( double ) horas + ( ( double ) minutos / 60 );
        //System.out.println ( "Min: " + minutos + " horas: " + horas );
        BigDecimal costoMOD = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ().from ( V_MOD_HORA ).limit ( 1 ).fetchOne (
                V_MOD_HORA.MOD );
        double costo = HHxReceta * costoMOD.doubleValue ();
        desconectar ();
        return costo;
    }

    public double costoMateriales ( int idreceta ) throws Exception {
        double costo = 0;
        conectar ();
        BigDecimal materiales = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 )
                .select ( sum ( V_DETALLE_RECETA.COSTO.mul ( V_DETALLE_RECETA.DESCARGO ) ) )
                .from ( V_DETALLE_RECETA )
                .where ( V_DETALLE_RECETA.IDRECETA.equal ( idreceta ) )
                .fetchOne ( sum ( V_DETALLE_RECETA.COSTO ) );
        if ( materiales != null ) {
            costo = materiales.doubleValue ();
        }
        desconectar ();
        return costo;
    }

    public void guardarCosteo ( int idreceta ) throws Exception {
        double costo = 0;
        costo = this.costoMateriales ( idreceta ) + this.costoMOD ( idreceta ) + this.costoCIF ( idreceta );
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).update ( RECETA )
                .set ( RECETA.COSTO , new BigDecimal ( String.format ( "%.4f" , costo ) ) )
                .where ( RECETA.IDRECETA.equal ( idreceta ) )
                .execute ();
        desconectar ();
    }

}
