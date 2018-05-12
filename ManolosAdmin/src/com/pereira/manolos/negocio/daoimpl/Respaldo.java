/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.util.Mensajes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Luis
 */
public class Respaldo extends Conexion {

    private Process p = null;
    private ProcessBuilder pb;
    private Runtime runTime;
    private Statement stmt;

    public Respaldo () throws IOException {
    }

    public void hacerBackup ( String path ) {
        final List<String> comandos = new ArrayList<String> ();
        Calendar cal = GregorianCalendar.getInstance ();
        String file = "backup" + cal.get ( Calendar.DAY_OF_MONTH ) + cal.get ( Calendar.MONTH + 1 ) + cal.get ( Calendar.YEAR )
                      + cal.get ( Calendar.HOUR_OF_DAY ) + cal.get ( Calendar.MINUTE ) + cal.get ( Calendar.SECOND ) + ".sql";
        System.out.println ( path + "\\" + file );
        comandos.add ( "C:\\Program Files\\PostgreSQL\\9.5\\bin\\pg_dump.exe" );
        //comandos.add("-i");
        comandos.add ( "-h" );
        comandos.add ( getServer () );
        //comandos.add("192.168.0.25");
        comandos.add ( "-p" );
        comandos.add ( getPort () );
        comandos.add ( "-U" );
        comandos.add ( getUser () );
        comandos.add ( "-F" );
        comandos.add ( "c" );
        comandos.add ( "-b" );
        comandos.add ( "-v" );
        comandos.add ( "-f" );
        comandos.add ( path + "\\" + file );
        comandos.add ( getDatabase () );
        pb = new ProcessBuilder ( comandos );
        pb.environment ().put ( "PGPASSWORD" , getPass () );
        try {
            final Process process = pb.start ();
            final BufferedReader r = new BufferedReader ( new InputStreamReader ( process.getErrorStream () ) );
            String line = r.readLine ();
            while ( line != null ) {
                System.err.println ( line );
                line = r.readLine ();
            }
            r.close ();
            process.waitFor ();
            process.destroy ();
            Mensajes.mensajeInfo ( "Respaldo realziado exitosamente!" );
        } catch ( IOException | InterruptedException e ) {
            e.printStackTrace ();
        }
    }

    public void hacerRestore ( String path ) {
        final List<String> comandos = new ArrayList<String> ();
        comandos.add ( "C:\\Program Files\\PostgreSQL\\9.5\\bin\\pg_restore.exe" );
        comandos.add ( "-h" );
        comandos.add ( getServer () );
        comandos.add ( "-p" );
        comandos.add ( "5432" );
        comandos.add ( "-U" );
        comandos.add ( getUser () );
        comandos.add ( "-c" );
        comandos.add ( "-d" );
        comandos.add ( getDatabase () );
        comandos.add ( "-v" );
        comandos.add ( path );
        pb = new ProcessBuilder ( comandos );
        pb.environment ().put ( "PGPASSWORD" , getPass () );
        try {
            final Process process = pb.start ();
            try ( BufferedReader r = new BufferedReader (
                    new InputStreamReader ( process.getErrorStream () ) ) ) {
                String line = r.readLine ();
                while ( line != null ) {
                    System.err.println ( line );
                    line = r.readLine ();
                }
            }
            process.waitFor ();
            process.destroy ();
            Mensajes.mensajeInfo ( "Restauración realizada exitosamente!" );
        } catch ( IOException | InterruptedException e ) {
            e.printStackTrace ();
        }
    }

    public void resetDB () {
        try {
            String rutaServidor = "C:\\Program Files\\PostgreSQL\\9.5\\bin\\psql.exe";//VERIFICAR PARA VERSION DE POSTGRESQL
            String source = "Reportes\\dbcrear.sql";
            String[] atato = { rutaServidor , "-f" , source };
            pb = new ProcessBuilder ( atato );
            runTime = Runtime.getRuntime ();
            //Se asignan valores a las variables de PostgreSQL
            pb.environment ().put ( "PGHOST" , getServer () );
            pb.environment ().put ( "PGPORT" , getPort () );
            pb.environment ().put ( "PGUSER" , this.getUser () );
            pb.environment ().put ( "PGPASSWORD" , this.getPass () );
            pb.redirectErrorStream ( true );
            p = pb.start ();
            if ( p.waitFor () == 0 ) {
                hacerRestore ( "Reportes\\dbinicial.sql" );
                final List<String> comandos = new ArrayList<String> ();
                comandos.add ( "C:\\Program Files\\PostgreSQL\\9.5\\bin\\pg_restore.exe" );
                comandos.add ( "-h" );
                comandos.add ( getServer () );
                comandos.add ( "-p" );
                comandos.add ( "5432" );
                comandos.add ( "-U" );
                comandos.add ( getUser () );
                comandos.add ( "-c" );
                comandos.add ( "-d" );
                comandos.add ( "manolosdb" );
                comandos.add ( "-v" );
                comandos.add ( "Reportes\\dbinicial.sql" );
                pb = new ProcessBuilder ( comandos );
                pb.environment ().put ( "PGPASSWORD" , getPass () );
                try {
                    final Process process = pb.start ();
                    try ( BufferedReader r = new BufferedReader (
                            new InputStreamReader ( process.getErrorStream () ) ) ) {
                        String line = r.readLine ();
                        while ( line != null ) {
                            System.err.println ( line );
                            line = r.readLine ();
                        }
                    }
                    process.waitFor ();
                    process.destroy ();
                    Mensajes.mensajeInfo ( "Restauración realizada exitosamente!" );
                } catch ( IOException | InterruptedException e ) {
                    e.printStackTrace ();
                }
            }
        } catch ( Exception ex ) {
            Logger.getLogger ( Respaldo.class.getName () ).log ( Level.SEVERE , null , ex );
        }
    }

}
