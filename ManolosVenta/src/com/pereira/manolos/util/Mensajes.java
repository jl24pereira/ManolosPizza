package com.pereira.manolos.util;

import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/* @author JL Vaio */
public class Mensajes {

    private static final Icon ALERT_ICON = new ImageIcon ( "images/Attention-64.png" );
    private static final Icon ERROR_ICON = new ImageIcon ( "images/Error-64.png" );
    private static final Icon INFO_ICON = new ImageIcon ( "images/Info-64.png" );

    private static final Logger LOG = Logger.getLogger ( Mensajes.class.
            getName () );
    private static final Icon OK_ICON = new ImageIcon ( "images/OK-64.png" );
    private static final Icon QUESTION_ICON = new ImageIcon (
            "images/Question Mark-64.png" );

    public static void mensajeAlert ( String Mensaje ) {
        JOptionPane.showMessageDialog ( null , Mensaje , "MANOLO'S PIZZA SYSTEM" , JOptionPane.ERROR_MESSAGE , ALERT_ICON );
    }

    public static void mensajeError ( String Mensaje ) {
        JOptionPane.showMessageDialog (
                null , //componente
                Mensaje , //mensaje
                "MANOLO'S PIZZA SYSTEM" , //titulo
                JOptionPane.ERROR_MESSAGE , //tipo de mensaje
                ERROR_ICON );
    }
    //private String Mensaje;

    public static void mensajeInfo ( String Mensaje ) {
        JOptionPane.showMessageDialog (
                null , //componente
                Mensaje , //mensaje
                "MANOLO'S PIZZA SYSTEM" , //titulo
                JOptionPane.INFORMATION_MESSAGE , //tipo de mensaje
                INFO_ICON );      //icono
    }

    public static void mensajeOk ( String Mensaje ) {
        JOptionPane.showMessageDialog (
                null , //componente
                Mensaje , //mensaje
                "MANOLO'S PIZZA SYSTEM" , //titulo
                JOptionPane.INFORMATION_MESSAGE ,
                OK_ICON );      //icono
    }

    public static int mensajeSiNo ( String Mensaje ) {
        int confirmado = JOptionPane.showOptionDialog (
                null , //componente
                Mensaje , //mensaje
                "MANOLO'S PIZZA SYSTEM" , //titulo
                JOptionPane.YES_NO_OPTION , //tipo de mensaje
                JOptionPane.WARNING_MESSAGE , //tipo de mensaje
                QUESTION_ICON , // icono
                null , // null para YES, NO y CANCEL
                null );
        return confirmado;
    }
}
