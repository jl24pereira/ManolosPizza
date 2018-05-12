package com.pereira.manolos.cliente.listrenderer;

import com.pereira.manolos.negocio.modelos.ModeloProveedor;
import java.awt.Component;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

/**
 *
 * @author JL Desk
 */
@SuppressWarnings ( "serial" )
public class ListaProveedorRenderer extends JPanel implements ListCellRenderer<ModeloProveedor> {

    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private static final Logger LOG = Logger.getLogger ( ListaProveedorRenderer.class.getName () );

    public ListaProveedorRenderer () {
        initComponents ();
    }

    @Override
    public Component getListCellRendererComponent ( JList<? extends ModeloProveedor> jlist , ModeloProveedor pE , int pI , boolean isSelected ,
                                                    boolean pBln1 ) {
        lblNombre.setText ( pE.getNombre () );
        lblDireccion.setText ( pE.getDireccion () );
        lblTelefono.setText ( "Teléfono: " + pE.getTelefono () );
        if ( isSelected ) {
            this.setBackground ( jlist.getSelectionBackground () );
            lblNombre.setForeground ( jlist.getSelectionForeground () );
            lblDireccion.setForeground ( jlist.getSelectionForeground () );
            lblTelefono.setForeground ( jlist.getSelectionForeground () );
        } else {
            this.setBackground ( jlist.getBackground () );
            lblNombre.setForeground ( jlist.getForeground () );
            lblDireccion.setForeground ( jlist.getForeground () );
            lblTelefono.setForeground ( jlist.getForeground () );
        }
        return this;
    }

    private void initComponents () {
        java.awt.GridBagConstraints gridBagConstraints;

        lblNombre = new javax.swing.JLabel ();
        lblDireccion = new javax.swing.JLabel ();
        lblTelefono = new javax.swing.JLabel ();

        setLayout ( new java.awt.GridBagLayout () );

        lblNombre.setFont ( new java.awt.Font ( "Arial" , 1 , 14 ) ); // NOI18N
        lblNombre.setText ( "Nombre del Cliente" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 5 , 5 , 5 );
        add ( lblNombre , gridBagConstraints );

        lblDireccion.setFont ( new java.awt.Font ( "Arial" , 0 , 12 ) ); // NOI18N
        lblDireccion.setText ( "Direccion del Cliente" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets ( 0 , 10 , 0 , 5 );
        add ( lblDireccion , gridBagConstraints );

        lblTelefono.setFont ( new java.awt.Font ( "Arial" , 0 , 12 ) ); // NOI18N
        lblTelefono.setText ( "Telefono" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets ( 0 , 10 , 5 , 10 );
        add ( lblTelefono , gridBagConstraints );
    }

}
