/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.MovimientoCajaDAO;
import com.pereira.manolos.negocio.modelos.ModeloMovimientoCaja;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import org.jooq.Condition;

/**
 *
 * @author Jose Luis
 */
public class MovimientoCajaIDAO extends Conexion implements MovimientoCajaDAO {

    private static final Logger LOG = Logger.getLogger (
            MovimientoCajaIDAO.class.getName () );

    public MovimientoCajaIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloMovimientoCaja pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar ( ModeloMovimientoCaja pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar ( ModeloMovimientoCaja pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloMovimientoCaja> obtenerLista ( Condition pCondition ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

}
