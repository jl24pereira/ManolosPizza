package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import static com.pereira.manolos.datos.database.Tables.MEDIDA;
import com.pereira.manolos.negocio.dao.MedidaDAO;
import com.pereira.manolos.negocio.modelos.ModeloMedida;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class MedidaIDAO extends Conexion implements MedidaDAO {

    public MedidaIDAO() throws IOException {
    }

    @Override
    public void eliminar(ModeloMedida pT) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar(ModeloMedida pT) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(ModeloMedida pT) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloMedida> obtenerLista(Condition pCondition) throws Exception {
        List<ModeloMedida> medidas = new ArrayList<>();
        conectar();
        Result<Record> records = DSL.using(getConexion(), SQLDialect.POSTGRES_9_5)
                .select()
                .from(MEDIDA)
                .orderBy(MEDIDA.DETALLE.asc())
                .fetch();
        records.stream().forEach(r -> {
            medidas.add(convertirMedidas(r));
        });
        desconectar();
        return medidas;
    }

    private ModeloMedida convertirMedidas(Record r) {
        return new ModeloMedida(r.getValue(MEDIDA.IDMEDIDA), r.getValue(MEDIDA.DETALLE));
    }
    private static final Logger LOG = Logger.getLogger(MedidaIDAO.class.
            getName());

}
