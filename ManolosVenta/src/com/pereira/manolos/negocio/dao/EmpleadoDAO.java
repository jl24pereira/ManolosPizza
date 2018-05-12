package com.pereira.manolos.negocio.dao;

import com.pereira.manolos.negocio.modelos.ModeloEmpleado;

public interface EmpleadoDAO extends DAO<ModeloEmpleado> {

    ModeloEmpleado findById ( int id );

    ModeloEmpleado findByIDUser ( int id );
}
