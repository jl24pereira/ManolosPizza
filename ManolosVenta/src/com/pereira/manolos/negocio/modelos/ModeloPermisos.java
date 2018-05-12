package com.pereira.manolos.negocio.modelos;

import java.util.logging.Logger;

public class ModeloPermisos {

    private boolean permiso;
    private ModeloEmpleado vEmpleado;
    private ModeloModulo vModulo;
    private static final Logger LOG = Logger.getLogger ( ModeloPermisos.class.
            getName () );

    public ModeloPermisos ( ModeloEmpleado pEmpleado , boolean pPermiso ,
                            ModeloModulo pModulo ) {
        this.vEmpleado = pEmpleado;
        this.permiso = pPermiso;
        this.vModulo = pModulo;
    }

    /**
     * @return the vEmpleado
     */
    public ModeloEmpleado getEmpleado () {
        return vEmpleado;
    }

    /**
     * @return the vModulo
     */
    public ModeloModulo getModulo () {
        return vModulo;
    }

    /**
     * @return the permiso
     */
    public boolean isPermiso () {
        return permiso;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado (
            ModeloEmpleado empleado ) {
        this.vEmpleado = empleado;
    }

    /**
     * @param modulo the modulo to set
     */
    public void setModulo (
            ModeloModulo modulo ) {
        this.vModulo = modulo;
    }

    /**
     * @param permiso the permiso to set
     */
    public void setPermiso ( boolean permiso ) {
        this.permiso = permiso;
    }

}
