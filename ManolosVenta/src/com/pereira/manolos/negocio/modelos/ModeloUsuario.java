package com.pereira.manolos.negocio.modelos;

import java.util.logging.Logger;

public class ModeloUsuario {

    private ModeloEmpleado vEmpleado;
    private String vPassword;
    private String vUsuario;
    private static final Logger LOG = Logger.getLogger ( ModeloUsuario.class.
            getName () );

    public ModeloUsuario ( ModeloEmpleado pEmpleado , String pPassword , String pUsuario ) {
        this.vEmpleado = pEmpleado;
        this.vPassword = pPassword;
        this.vUsuario = pUsuario;
    }

    /**
     * @return the vEmpleado
     */
    public ModeloEmpleado getEmpleado () {
        return vEmpleado;
    }

    /**
     * @return the vPassword
     */
    public String getPassword () {
        return vPassword;
    }

    /**
     * @return the vUsuario
     */
    public String getUsuario () {
        return vUsuario;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado (
            ModeloEmpleado empleado ) {
        this.vEmpleado = empleado;
    }

    /**
     * @param password the password to set
     */
    public void setPassword ( String password ) {
        this.vPassword = password;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario ( String usuario ) {
        this.vUsuario = usuario;
    }

}
