package com.pereira.manolos.negocio.dao;

import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.negocio.modelos.ModeloPermisos;
import java.util.List;

public interface PermisoDAO extends DAO<ModeloPermisos> {

    public List<ModeloPermisos> listaByEmpleado ( ModeloEmpleado empleado ) throws Exception;

    public void eliminarByEmpleado ( ModeloEmpleado pEmpleado ) throws Exception;
}
