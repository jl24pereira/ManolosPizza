package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import static com.pereira.manolos.datos.database.Tables.MODULO;
import com.pereira.manolos.negocio.dao.ModuloDAO;
import com.pereira.manolos.negocio.modelos.ModeloModulo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

/**
 *
 * @author Jose Luis
 */
public class ModuloIDAO extends Conexion implements ModuloDAO {

    public ModuloIDAO() throws IOException {
    }

    @Override
    public void eliminar(ModeloModulo pT) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar(ModeloModulo pT) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(ModeloModulo pT) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloModulo> obtenerLista(Condition pCondition) throws Exception {
        List<ModeloModulo> modulos = new ArrayList<>();
        conectar();
        Result<Record> records = DSL.using(getConexion(), SQLDialect.POSTGRES_9_5)
                .select()
                .from(MODULO)
                .where(pCondition)
                .fetch();
        records.forEach(r -> {
            modulos.add(convertirModulo(r));
        });
        desconectar();
        return modulos;
    }

    private static final Logger LOG = Logger.getLogger(ModuloIDAO.class.
            getName());

    private ModeloModulo convertirModulo(Record r) {
        return new ModeloModulo(r.getValue(MODULO.IDMODULO), r.getValue(MODULO.MODULO_));
    }

}
