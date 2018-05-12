package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.DetalleCotizacionDAO;
import com.pereira.manolos.negocio.modelos.ModeloDetalleCotizacion;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.pereira.manolos.datos.database.Tables.DETALLE_COTIZACION;

public class DetalleCotizacionIDAO extends Conexion implements DetalleCotizacionDAO {

    private static final Logger LOG = Logger.getLogger(
            DetalleCotizacionIDAO.class.getName());

    public DetalleCotizacionIDAO() throws IOException {
    }

    @Override
    public void eliminar(ModeloDetalleCotizacion detalle) throws Exception {

    }

    @Override
    public void insertar(ModeloDetalleCotizacion detalle) throws Exception {
        conectar();
        if (detalle.isPromo()) {
            DSL.using(getConexion(), SQLDialect.POSTGRES_9_5).insertInto(DETALLE_COTIZACION)
                    .set(DETALLE_COTIZACION.IDCOTIZACION, detalle.getCotizacion().getIdcotizacion())
                    .set(DETALLE_COTIZACION.IDPROMOCION, detalle.getPromocion().getIdpromocion())
                    .set(DETALLE_COTIZACION.CANTIDAD, detalle.getCantidad())
                    .set(DETALLE_COTIZACION.PRECIO, detalle.getPrecio())
                    .set(DETALLE_COTIZACION.TIPO, detalle.getTipo())
                    .set(DETALLE_COTIZACION.ESPROMO, detalle.isPromo())
                    .execute();
        } else {
            DSL.using(getConexion(), SQLDialect.POSTGRES_9_5).insertInto(DETALLE_COTIZACION)
                    .set(DETALLE_COTIZACION.IDCOTIZACION, detalle.getCotizacion().getIdcotizacion())
                    .set(DETALLE_COTIZACION.IDPRODUCTO, detalle.getProducto().getIdproducto())
                    .set(DETALLE_COTIZACION.CANTIDAD, detalle.getCantidad())
                    .set(DETALLE_COTIZACION.PRECIO, detalle.getPrecio())
                    .set(DETALLE_COTIZACION.TIPO, detalle.getTipo())
                    .set(DETALLE_COTIZACION.ESPROMO, detalle.isPromo())
                    .execute();
        }
        desconectar();
    }

    @Override
    public void modificar(ModeloDetalleCotizacion pT) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloDetalleCotizacion> obtenerLista(Condition pCondition) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
/*@Override
    public void insertar(ModeloDetalleCotizacion t) {
        this.contexto.insertInto(DETALLE_COTIZACION)
                .set(DETALLE_COTIZACION.IDCOTIZACION,t.getIdcotizacion())
                .set(DETALLE_COTIZACION.IDPRODUCTO,t.getIdproducto())
                .set(DETALLE_COTIZACION.CANTIDAD,t.getCantidad())
                .set(DETALLE_COTIZACION.PRECIO,t.getPrecio())
                .set(DETALLE_COTIZACION.TIPO,t.getTipo())
                .execute();
    }

    @Override
    public void modificar(ModeloDetalleCotizacion t) {

    }

    @Override
    public void eliminar(ModeloDetalleCotizacion t) {

    }

    private ModeloDetalleCotizacion convertir(Record r){
        ModeloDetalleCotizacion m= new ModeloDetalleCotizacion(
                r.getValue(DETALLE_COTIZACION.IDCOTIZACION),
                r.getValue(DETALLE_COTIZACION.IDPRODUCTO),
                r.getValue(DETALLE_COTIZACION.CANTIDAD),
                r.getValue(DETALLE_COTIZACION.PRECIO),
                r.getValue(DETALLE_COTIZACION.TIPO)
        );
        return m;
    }

    @Override
    public List<ModeloDetalleCotizacion> obtenerLista(Condition condition) {
        List<ModeloDetalleCotizacion> detalles = new ArrayList<>();
        SelectQuery<Record> query = this.contexto.selectQuery();
        query.addFrom(DETALLE_COTIZACION);
        query.addConditions(condition);
        Result<Record> result = query.fetch();
        result.stream().forEach((r) -> {
            detalles.add(convertir(r));
        });
        return detalles;
    }*/
