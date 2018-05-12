package com.pereira.manolos.cliente.listrenderer;

import com.pereira.manolos.negocio.modelos.ModeloDetalleCotizacion;
import java.awt.Component;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

/* @author JL Desk */
@SuppressWarnings ( "serial" )
public class ListaDetalleCotizacionRenderer extends JPanel implements ListCellRenderer<ModeloDetalleCotizacion> {

    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblSubtotal;
    private static final Logger LOG = Logger.getLogger ( ListaDetalleCotizacionRenderer.class.getName () );

    public ListaDetalleCotizacionRenderer () {
        initComponents ();
    }

    @Override
    public Component getListCellRendererComponent ( JList<? extends ModeloDetalleCotizacion> lista , ModeloDetalleCotizacion e , int i ,
                                                    boolean isSelected , boolean pBln1 ) {
        lblCantidad.setText ( "Cantidad: " + e.getCantidad () );
        lblPrecio.setText ( "$ " + e.getPrecio () );
        lblProducto.setText ( e.getProducto ().getNombre () );
        double subtotal = e.getCantidad () * e.getPrecio ().doubleValue ();
        lblSubtotal.setText ( "$" + String.format ( "%.2f" , subtotal ) );
        if ( isSelected ) {
            setBackground ( lista.getSelectionBackground () );
            lblCantidad.setForeground ( lista.getSelectionForeground () );
            lblPrecio.setForeground ( lista.getSelectionForeground () );
            lblProducto.setForeground ( lista.getSelectionForeground () );
            lblSubtotal.setForeground ( lista.getSelectionForeground () );
        } else {
            setBackground ( lista.getBackground () );
            lblCantidad.setForeground ( lista.getForeground () );
            lblPrecio.setForeground ( lista.getForeground () );
            lblProducto.setForeground ( lista.getForeground () );
            lblSubtotal.setForeground ( lista.getForeground () );
        }
        return this;
    }

    private void initComponents () {
        java.awt.GridBagConstraints gridBagConstraints;

        lblProducto = new javax.swing.JLabel ();
        lblCantidad = new javax.swing.JLabel ();
        lblPrecio = new javax.swing.JLabel ();
        lblSubtotal = new javax.swing.JLabel ();

        setMinimumSize ( new java.awt.Dimension ( 300 , 54 ) );
        setPreferredSize ( new java.awt.Dimension ( 300 , 54 ) );
        setLayout ( new java.awt.GridBagLayout () );

        lblProducto.setFont ( new java.awt.Font ( "Arial" , 1 , 14 ) ); // NOI18N
        lblProducto.setText ( "jLabel1" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 10 , 5 , 5 );
        add ( lblProducto , gridBagConstraints );

        lblCantidad.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        lblCantidad.setText ( "Cantidad: ####" );
        lblCantidad.setMaximumSize ( new java.awt.Dimension ( 100 , 15 ) );
        lblCantidad.setMinimumSize ( new java.awt.Dimension ( 100 , 15 ) );
        lblCantidad.setPreferredSize ( new java.awt.Dimension ( 100 , 15 ) );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 20 , 5 , 5 );
        add ( lblCantidad , gridBagConstraints );

        lblPrecio.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        lblPrecio.setHorizontalAlignment ( javax.swing.SwingConstants.RIGHT );
        lblPrecio.setText ( "$ 0000.00" );
        lblPrecio.setMaximumSize ( new java.awt.Dimension ( 80 , 15 ) );
        lblPrecio.setMinimumSize ( new java.awt.Dimension ( 80 , 15 ) );
        lblPrecio.setPreferredSize ( new java.awt.Dimension ( 80 , 15 ) );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 20 , 5 , 5 );
        add ( lblPrecio , gridBagConstraints );

        lblSubtotal.setFont ( new java.awt.Font ( "Arial" , 1 , 12 ) ); // NOI18N
        lblSubtotal.setHorizontalAlignment ( javax.swing.SwingConstants.RIGHT );
        lblSubtotal.setText ( "$ 0000.00" );
        lblSubtotal.setMaximumSize ( new java.awt.Dimension ( 80 , 15 ) );
        lblSubtotal.setMinimumSize ( new java.awt.Dimension ( 80 , 15 ) );
        lblSubtotal.setPreferredSize ( new java.awt.Dimension ( 80 , 15 ) );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 20 , 5 , 5 );
        add ( lblSubtotal , gridBagConstraints );
    }

}
