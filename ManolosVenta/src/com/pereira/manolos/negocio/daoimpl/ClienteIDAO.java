package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.ClienteDAO;
import com.pereira.manolos.negocio.modelos.ModeloCliente;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.CLIENTE;

public class ClienteIDAO extends Conexion implements ClienteDAO {

    private static final Logger LOG = Logger.getLogger ( ClienteIDAO.class.
            getName () );

    public ClienteIDAO () throws IOException {
    }

    @Override
    public void darAlta ( ModeloCliente pM ) {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void darBaja ( ModeloCliente pM ) {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar ( ModeloCliente pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String findNombreByID ( int pId ) {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar ( ModeloCliente cliente ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).insertInto ( CLIENTE )
                .set ( CLIENTE.NOMBRE , cliente.getNombre () )
                .set ( CLIENTE.DIRECCION , cliente.getDireccion () )
                .set ( CLIENTE.TELEFONO , cliente.getTelefono () )
                .set ( CLIENTE.EMAIL , cliente.getEmail () )
                .set ( CLIENTE.DUI , cliente.getDui () )
                .execute ();
        desconectar ();
    }

    @Override
    public void modificar ( ModeloCliente t ) throws Exception {
        conectar ();
        DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).update ( CLIENTE )
                .set ( CLIENTE.NOMBRE , t.getNombre () )
                .set ( CLIENTE.DIRECCION , t.getDireccion () )
                .set ( CLIENTE.TELEFONO , t.getTelefono () )
                .set ( CLIENTE.EMAIL , t.getEmail () )
                .set ( CLIENTE.DUI , t.getDui () )
                .where ( CLIENTE.IDCLIENTE.equal ( t.getIdcliente () ) )
                .execute ();
        desconectar ();
    }

    @Override
    public List<ModeloCliente> obtenerLista ( Condition c ) throws Exception {
        List<ModeloCliente> clientes = new ArrayList<> ();
        conectar ();
        Result<Record> records = DSL.using ( getConexion () , SQLDialect.POSTGRES_9_5 ).select ().from ( CLIENTE )
                .where ( c )
                .orderBy ( CLIENTE.NOMBRE.asc () )
                .fetch ();
        records.forEach ( r -> {
            clientes.add ( convertirCliente ( r ) );
        } );
        desconectar ();
        return clientes;
    }

    private ModeloCliente convertirCliente ( Record r ) {
        return new ModeloCliente ( r.getValue ( CLIENTE.IDCLIENTE ) , r.getValue ( CLIENTE.NOMBRE ) , r.getValue ( CLIENTE.DIRECCION ) ,
                                   r.getValue ( CLIENTE.TELEFONO ) , r.getValue ( CLIENTE.EMAIL ) , r.getValue ( CLIENTE.TIPO ) ,
                                   r.getValue ( CLIENTE.BAJA ) , r.getValue ( CLIENTE.DUI ) );
    }

}
/*@Override
    public void insertar(ModeloCliente t) {
        Record r = this.contexto.insertInto(CLIENTE)
                .set(CLIENTE.NOMBRE,t.getNombre())
                .set(CLIENTE.DIRECCION,t.getDireccion())
                .set(CLIENTE.TELEFONO,t.getTelefono())
                .set(CLIENTE.EMAIL,t.getEmail())
                .returning(CLIENTE.IDCLIENTE).fetchOne();
        t.setIdcliente(r.getValue(CLIENTE.IDCLIENTE));
    }

    @Override
    public void modificar(ModeloCliente t) {
        this.contexto.update(CLIENTE)
                .set(CLIENTE.NOMBRE,t.getNombre())
                .set(CLIENTE.DIRECCION,t.getDireccion())
                .set(CLIENTE.TELEFONO,t.getTelefono())
                .set(CLIENTE.EMAIL,t.getEmail())
                .where(CLIENTE.IDCLIENTE.equal(t.getIdcliente()))
                .execute();
    }

    @Override
    public void eliminar(ModeloCliente t) {
    }

    @Override
    public void darBaja(ModeloCliente m) {
        this.contexto.update(CLIENTE)
                .set(CLIENTE.BAJA,true)
                .where(CLIENTE.IDCLIENTE.equal(m.getIdcliente()))
                .execute();
        m.setBaja(true);
    }

    @Override
    public void darAlta(ModeloCliente m) {
        this.contexto.update(CLIENTE)
                .set(CLIENTE.BAJA,false)
                .where(CLIENTE.IDCLIENTE.equal(m.getIdcliente()))
                .execute();
        m.setBaja(false);
    }

    private ModeloCliente convertir(Record r){
        ModeloCliente m = new ModeloCliente(
                r.getValue(CLIENTE.NOMBRE),
                r.getValue(CLIENTE.DIRECCION),
                r.getValue(CLIENTE.TELEFONO),
                r.getValue(CLIENTE.EMAIL),
                r.getValue(CLIENTE.BAJA)
        );
        m.setIdcliente(r.getValue(CLIENTE.IDCLIENTE));
        return m;
    }

    @Override
    public List<ModeloCliente> obtenerLista(Condition condition) {
        List<ModeloCliente> clientes = new ArrayList<>();
        SelectQuery<Record> query = this.contexto.selectQuery();
        query.addFrom(CLIENTE);
        query.addConditions(condition);
        query.addOrderBy(CLIENTE.NOMBRE.asc());
        Result<Record> result = query.fetch();
        result.stream().forEach((r) -> {
            clientes.add(convertir(r));
        });
        return clientes;
    }

    @Override
    public String findNombreByID(int id) {
        return contexto.select(CLIENTE.NOMBRE).from(CLIENTE).where(CLIENTE.IDCLIENTE.equal(id)).fetchOne().getValue(CLIENTE.NOMBRE);
    }*/
