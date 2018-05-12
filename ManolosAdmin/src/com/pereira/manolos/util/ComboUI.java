package com.pereira.manolos.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;

/*@author JL Desk */
public class ComboUI extends BasicComboBoxUI {

    private final Color colorUI;
    private Color fondo = new Color ( 245 , 79 , 41 );
    private Color texto = Color.BLACK;
    private static final Logger LOG = Logger.getLogger ( ComboUI.class.getName () );

    public ComboUI ( Color fondo , Color colorUI ) {
        this.fondo = fondo;
        this.colorUI = colorUI;
    }

    public ComboUI ( Color fondo , Color colorUI , Color texto ) {
        this.fondo = fondo;
        this.colorUI = colorUI;
        this.texto = texto;
    }

    @Override
    public void installUI ( JComponent c ) {
        super.installUI ( c );
        if ( c instanceof JComboBox ) {
            comboBox = ( JComboBox ) c;
            comboBox.setOpaque ( true );
            comboBox.setLayout ( createLayoutManager () );
            comboBox.setBorder ( new javax.swing.border.LineBorder ( colorUI , 2 , true ) );
            installDefaults ();
            installComponents ();
            installListeners ();
            installKeyboardActions ();
        }
    }

    @Override
    public void paintCurrentValueBackground ( Graphics g , Rectangle bounds , boolean hasFocus ) {
        g.setColor ( fondo );
        g.fillRect ( bounds.x , bounds.y , bounds.width , bounds.height );
    }

    @Override
    protected JButton createArrowButton () {
        BasicArrowButton basicArrowButton = new BasicArrowButton (
                BasicArrowButton.SOUTH , //Direccion de la flecha
                colorUI , //Color de fondo
                fondo ,//sombra
                fondo ,//darkShadow
                fondo //highlight
        );
        basicArrowButton.setBorder ( BorderFactory.createLineBorder ( colorUI , 2 ) );
        basicArrowButton.setContentAreaFilled ( false );
        return basicArrowButton;
    }

    @Override
    protected ListCellRenderer createRenderer () {
        return new DefaultListCellRenderer () {
            @Override
            public Component getListCellRendererComponent ( JList list , Object value , int index , boolean isSelected , boolean cellHasFocus ) {
                super.getListCellRendererComponent ( list , value , index , isSelected , cellHasFocus );
                list.setSelectionBackground ( fondo );
                if ( isSelected ) {
                    setBackground ( colorUI );
                    setForeground ( texto );
                } else {
                    setBackground ( fondo );
                    setForeground ( colorUI );
                }
                if ( index != -1 ) {
                    //setIcon( espacio );
                }
                return this;
            }
        };
    }

}
