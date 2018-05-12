package com.pereira.manolos.datos.conexion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private Connection conexion;
    private String database;
    private String pass;
    private String port;
    private final Properties prop;
    private String server;
    private String user;
    private static final Logger LOG = Logger.getLogger(Conexion.class.
            getName());

    public Conexion() throws IOException {
        this.prop = new Properties();
        leerPropiedades();
    }

    public Conexion(String user, String pass, String server, String port,
            String database, Connection conexion) {
        this.prop = new Properties();
        this.user = user;
        this.pass = pass;
        this.server = server;
        this.port = port;
        this.database = database;
        this.conexion = conexion;
    }

    public void conectar() throws Exception {
        Class.forName("org.postgresql.Driver");
        setConexion(DriverManager.getConnection(
                "jdbc:postgresql://" + getServer() + ":" + getPort() + "/" + getDatabase(),
                getUser(), getPass()));
    }

    public void desconectar() throws SQLException {
        getConexion().close();
    }

    public void escribirPropiedades() throws FileNotFoundException, IOException {
        Properties props = new Properties();
        props.setProperty("server", getServer());
        props.setProperty("user", getUser());
        props.setProperty("pass", getPass());
        props.setProperty("port", getPort());
        props.setProperty("database", getDatabase());
        File f = new File("Propiedades\\config.properties");
        OutputStream out = new FileOutputStream(f);
        props.store(out, "This is an optional header comment string");
    }

    /**
     * @return the conexion
     */
    public Connection getConexion() {
        return conexion;
    }

    /**
     * @return the database
     */
    public String getDatabase() {
        return database;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @return the port
     */
    public String getPort() {
        return port;
    }

    /**
     * @return the server
     */
    public String getServer() {
        return server;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param conexion the conexion to set
     */
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    /**
     * @param database the database to set
     */
    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @param port the port to set
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * @param server the server to set
     */
    public void setServer(String server) {
        this.server = server;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    private void leerPropiedades() throws IOException {
        prop.load(new FileInputStream("Propiedades\\config.properties"));
        setServer("" + prop.getProperty("server"));
        setUser("" + prop.getProperty("user"));
        setPass("" + prop.getProperty("pass"));
        setPort("" + prop.getProperty("port"));
        setDatabase("" + prop.getProperty("database"));
    }

    public void resetDB(String respaldo) {
        System.out.println("CREANDO DB");
        Runtime runTime;
        Process p = null;
        ProcessBuilder pb;
        String rutaServidor = "C:\\Program Files\\PostgreSQL\\9.5\\bin\\psql.exe";
        String source = "Reportes\\crearDB.sql";

        try {
            String[] atato = {rutaServidor, "-d", this.getDatabase(), "-f", source};
            pb = new ProcessBuilder(atato);
            runTime = Runtime.getRuntime();

            //Se asignan valores a las variables de PostgreSQL
            pb.environment().put("PGHOST", this.getServer());
            pb.environment().put("PGPORT", this.getPort());
            pb.environment().put("PGUSER", this.getUser());
            pb.environment().put("PGPASSWORD", this.getPass());
            pb.redirectErrorStream(true);
            p = pb.start();
            if (p.waitFor() == 0) {
                System.out.println("RESTAURANDO DB");
                Runtime r = Runtime.getRuntime();
                String rutaServidor2 = "C:\\Program Files\\PostgreSQL\\9.5\\bin\\pg_restore.exe";
                Process p2;
                ProcessBuilder pb2;
                String[] atato2 = {rutaServidor2, "-d", "puntocolordb", "-v", respaldo};
                pb2 = new ProcessBuilder(atato2);
                r = Runtime.getRuntime();
                //Se asignan valores a las variables de PostgreSQL
                pb.environment().put("PGHOST", this.getServer());
                pb.environment().put("PGPORT", this.getPort());
                pb.environment().put("PGUSER", this.getUser());
                pb.environment().put("PGPASSWORD", this.getPass());
                pb2.redirectErrorStream(true);
                p2 = pb2.start();
                InputStream is = p2.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String ll;
                while ((ll = br.readLine()) != null) {
                    System.out.println(ll);
                }
            }
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
