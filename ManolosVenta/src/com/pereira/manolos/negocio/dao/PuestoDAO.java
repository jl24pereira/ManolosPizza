package com.pereira.manolos.negocio.dao;

import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.negocio.modelos.ModeloPuesto;

public interface PuestoDAO extends DAO<ModeloPuesto> {

    String findPuestoByEmpleado ( ModeloEmpleado empleado );
}
