package com.pereira.manolos.cliente.listrenderer;

import com.pereira.manolos.negocio.modelos.ModeloCliente;
import java.awt.Color;
import java.awt.Component;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

/* @author JL Desk */
public class ListaClienteRenderer extends JPanel implements ListCellRenderer<ModeloCliente> {

    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;

    public ListaClienteRenderer () {
        initComponents ();
    }

    @Override
    public Component getListCellRendererComponent ( JList<? extends ModeloCliente> jlist , ModeloCliente e , int i , boolean isSelected , boolean bln1 ) {
        lblNombre.setText ( e.getNombre () );
        lblTelefono.setText ( e.getTelefono () );
        lblDireccion.setText ( e.getDireccion () );
        if ( isSelected ) {
            setBackground ( jlist.getSelectionBackground () );
            setBackground ( jlist.getSelectionBackground () );
        } else {
            setBackground ( Color.WHITE );
            setBackground ( jlist.getBackground () );
            //panel.lblNombre.setForeground(jlist.getForeground());
        }
        return this;
    }

    private void initComponents () {
        java.awt.GridBagConstraints gridBagConstraints;

        lblNombre = new javax.swing.JLabel ();
        lblTelefono = new javax.swing.JLabel ();
        lblDireccion = new javax.swing.JLabel ();

        setBackground ( java.awt.Color.white );
        setMinimumSize ( new java.awt.Dimension ( 350 , 75 ) );
        setPreferredSize ( new java.awt.Dimension ( 350 , 75 ) );
        setLayout ( new java.awt.GridBagLayout () );

        lblNombre.setFont ( new java.awt.Font ( "Arial" , 1 , 16 ) ); // NOI18N
        lblNombre.setText ( "" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 10 , 5 , 5 );
        add ( lblNombre , gridBagConstraints );

        lblTelefono.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        lblTelefono.setText ( "" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 20 , 5 , 5 );
        add ( lblTelefono , gridBagConstraints );

        lblDireccion.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        lblDireccion.setText ( "" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 20 , 5 , 5 );
        add ( lblDireccion , gridBagConstraints );
    }// </editor-fold>

    private static final Logger LOG = Logger.getLogger ( ListaClienteRenderer.class.getName () );
}
