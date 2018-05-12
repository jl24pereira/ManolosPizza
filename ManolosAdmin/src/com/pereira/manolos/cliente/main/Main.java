package com.pereira.manolos.cliente.main;

import java.util.logging.Logger;

public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        InicioSesion inicioSesion = new InicioSesion();
        inicioSesion.setVisible(true);
    }
}
