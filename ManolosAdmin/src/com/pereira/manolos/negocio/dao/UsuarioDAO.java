package com.pereira.manolos.negocio.dao;

import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.negocio.modelos.ModeloUsuario;

public interface UsuarioDAO extends DAO<ModeloUsuario> {

    public ModeloUsuario getUsuarioByPass ( String pass ) throws Exception;

    public ModeloUsuario getUsuarioByEmpleado ( ModeloEmpleado empleado ) throws Exception;

    public void eliminarByEmpleado ( ModeloEmpleado empleado ) throws Exception;

    boolean existeUsuario ( String pass ) throws Exception;

    boolean existeUsuario ( ModeloEmpleado empleado ) throws Exception;

    boolean existeUsuario ( String user , String pass ) throws Exception;

    boolean loguearsesu ( String user , String pass );
}
