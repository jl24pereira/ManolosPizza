/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.cliente.main;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Jose Luis
 */
public class Main {

    private static final Logger LOG = Logger.getLogger ( Main.class.getName () );

    public static void main ( String[] args ) {
        try {
            UIManager.setLookAndFeel ( "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel" );
        } catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex ) {
            Logger.getLogger ( Main.class.getName () ).log ( Level.SEVERE , null , ex );
        }
        Principal principal = new Principal ();
        principal.setVisible ( true );
    }
}
