/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.negocio.dao;

import com.pereira.manolos.negocio.modelos.ModeloEmpresa;

/**
 *
 * @author Jose Luis
 */
public interface EmpresaDAO extends DAO<ModeloEmpresa> {

    public ModeloEmpresa cargarEmpresa(int id) throws Exception;
}
