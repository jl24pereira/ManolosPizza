/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.daoimpl;

import com.pereira.manolos.datos.conexion.Conexion;
import com.pereira.manolos.negocio.dao.ClienteCreditoFiscalDAO;
import com.pereira.manolos.negocio.modelos.ModeloClienteCreditoFiscal;
import java.io.IOException;
import java.util.List;
import org.jooq.Condition;

/**
 *
 * @author Jose Luis
 */
public class ClienteCreditoFiscalIDAO extends Conexion implements ClienteCreditoFiscalDAO {

    public ClienteCreditoFiscalIDAO () throws IOException {
    }

    @Override
    public void eliminar ( ModeloClienteCreditoFiscal pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar ( ModeloClienteCreditoFiscal pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar ( ModeloClienteCreditoFiscal pT ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModeloClienteCreditoFiscal> obtenerLista ( Condition pCondition ) throws Exception {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

}
