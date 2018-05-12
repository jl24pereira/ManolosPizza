package com.pereira.manolos.cliente.listarenderer;

import com.pereira.manolos.negocio.modelos.ModeloProducto;
import com.pereira.manolos.util.ImageConverter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

/* @author JL Desk */
public class ProductoRenderer extends JPanel implements ListCellRenderer<ModeloProducto> {

    private javax.swing.JLabel lblCategoria1;
    private javax.swing.JLabel lblCategoria3;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblTipo;
    private static final Logger LOG = Logger.getLogger ( ProductoRenderer.class.getName () );

    public ProductoRenderer () {
        initComponents ();
    }

    @Override
    public Component getListCellRendererComponent ( JList<? extends ModeloProducto> jlist , ModeloProducto e , int i , boolean isSelected ,
                                                    boolean bln1 ) {
        lblProducto.setText ( e.getNombre () );
        Image foto = null;
        try {
            foto = ImageConverter.byteToImage ( e.getImagen () );
            lblImagen.setIcon ( new ImageIcon ( foto.getScaledInstance ( 50 , 50 , Image.SCALE_DEFAULT ) ) );
        } catch ( IOException ex ) {
            LOG.log ( Level.SEVERE , null , ex );
        }
        switch ( e.getTipo () ) {
            case "U":
                lblTipo.setText ( "UNIDAD" );
                break;
            case "P":
                lblTipo.setText ( "PORCION" );
                break;
            case "C":
                lblTipo.setText ( "COMPLETA" );
                break;
        }
        lblPrecio.setText ( e.getPrecio ().toString () );
        if ( isSelected ) {
            setBackground ( jlist.getSelectionBackground () );
            setBackground ( jlist.getSelectionBackground () );
        } else {
            setBackground ( jlist.getBackground () );
            setBackground ( Color.WHITE );
        }
        return this;
    }

    private void initComponents () {
        java.awt.GridBagConstraints gridBagConstraints;

        lblImagen = new javax.swing.JLabel ();
        lblProducto = new javax.swing.JLabel ();
        lblCategoria1 = new javax.swing.JLabel ();
        lblPrecio = new javax.swing.JLabel ();
        lblCategoria3 = new javax.swing.JLabel ();
        lblTipo = new javax.swing.JLabel ();

        setMinimumSize ( new java.awt.Dimension ( 135 , 135 ) );
        setPreferredSize ( new java.awt.Dimension ( 135 , 135 ) );
        setLayout ( new java.awt.GridBagLayout () );

        lblImagen.setMaximumSize ( new java.awt.Dimension ( 50 , 50 ) );
        lblImagen.setMinimumSize ( new java.awt.Dimension ( 50 , 50 ) );
        lblImagen.setPreferredSize ( new java.awt.Dimension ( 50 , 50 ) );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 5 , 5 , 5 );
        add ( lblImagen , gridBagConstraints );

        lblProducto.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        lblProducto.setText ( "PIZZA DE PEPPERONI" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 5 , 5 , 5 );
        add ( lblProducto , gridBagConstraints );

        lblCategoria1.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        lblCategoria1.setText ( "Precio:" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 5 , 5 , 5 );
        add ( lblCategoria1 , gridBagConstraints );

        lblPrecio.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        lblPrecio.setText ( "00.00" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 5 , 5 , 5 );
        add ( lblPrecio , gridBagConstraints );

        lblCategoria3.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        lblCategoria3.setText ( "$" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 5 , 5 , 5 );
        add ( lblCategoria3 , gridBagConstraints );

        lblTipo.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        lblTipo.setText ( "Tipo" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 5 , 5 , 5 );
        add ( lblTipo , gridBagConstraints );
    }

}
