package com.pereira.manolos.cliente.listrenderer;

import com.pereira.manolos.negocio.modelos.ModeloDetalleVenta;
import java.awt.Color;
import java.awt.Component;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

/* @author JL Desk */
public class DetalleVentaRenderer extends JPanel implements ListCellRenderer<ModeloDetalleVenta> {

    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCant;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTipo;
    private static final Logger LOG = Logger.getLogger ( DetalleVentaRenderer.class.getName () );

    public DetalleVentaRenderer () {
        initComponents ();
    }

    @Override
    public Component getListCellRendererComponent ( JList<? extends ModeloDetalleVenta> jlist , ModeloDetalleVenta e , int i , boolean isSelected ,
                                                    boolean bln1 ) {
        if ( e.isPromo () ) {
            lblProducto.setText ( e.getPromocion ().getNombre () );
            lblTipo.setText ( "PROMOCION" );
        } else {
            lblProducto.setText ( e.getProducto ().getNombre () );
            switch ( e.getProducto ().getTipo () ) {
                case "C":
                    lblTipo.setText ( "COMPLETO" );
                    break;
                case "P":
                    lblTipo.setText ( "PORCION" );
                    break;
                case "U":
                    lblTipo.setText ( "UNIDAD" );
                    break;
            }
        }
        lblCant.setText ( "" + e.getCantidad () );
        lblPrecio.setText ( e.getPrecio ().toString () );
        lblSubtotal.setText ( "" + e.getCantidad () * e.getPrecio ().doubleValue () );
        if ( isSelected ) {
            setBackground ( jlist.getSelectionBackground () );
        } else {
            setBackground ( Color.WHITE );
        }
        return this;
    }

    private void initComponents () {
        java.awt.GridBagConstraints gridBagConstraints;

        lblProducto = new javax.swing.JLabel ();
        jLabel2 = new javax.swing.JLabel ();
        lblCant = new javax.swing.JLabel ();
        jLabel4 = new javax.swing.JLabel ();
        jLabel5 = new javax.swing.JLabel ();
        lblPrecio = new javax.swing.JLabel ();
        jLabel7 = new javax.swing.JLabel ();
        jLabel8 = new javax.swing.JLabel ();
        lblSubtotal = new javax.swing.JLabel ();
        lblTipo = new javax.swing.JLabel ();

        setMinimumSize ( new java.awt.Dimension ( 240 , 80 ) );
        setPreferredSize ( new java.awt.Dimension ( 240 , 80 ) );
        setLayout ( new java.awt.GridBagLayout () );

        lblProducto.setFont ( new java.awt.Font ( "Arial" , 1 , 16 ) ); // NOI18N
        lblProducto.setText ( "Producto" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 5 , 5 , 5 );
        add ( lblProducto , gridBagConstraints );

        jLabel2.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        jLabel2.setText ( "Cant.:" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 10 , 5 , 5 );
        add ( jLabel2 , gridBagConstraints );

        lblCant.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        lblCant.setText ( "##" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 0 , 5 , 5 );
        add ( lblCant , gridBagConstraints );

        jLabel4.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        jLabel4.setText ( "P.V.:" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 5 , 5 , 5 );
        add ( jLabel4 , gridBagConstraints );

        jLabel5.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        jLabel5.setText ( "$" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 0 , 5 , 5 );
        add ( jLabel5 , gridBagConstraints );

        lblPrecio.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        lblPrecio.setText ( "00.00" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 0 , 5 , 5 );
        add ( lblPrecio , gridBagConstraints );

        jLabel7.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        jLabel7.setText ( "ST:" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 5 , 5 , 5 );
        add ( jLabel7 , gridBagConstraints );

        jLabel8.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        jLabel8.setText ( "$" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 0 , 5 , 5 );
        add ( jLabel8 , gridBagConstraints );

        lblSubtotal.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        lblSubtotal.setText ( "00.00" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 0 , 5 , 5 );
        add ( lblSubtotal , gridBagConstraints );

        lblTipo.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        lblTipo.setText ( "Cant.:" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 10 , 5 , 5 );
        add ( lblTipo , gridBagConstraints );
    }
}
