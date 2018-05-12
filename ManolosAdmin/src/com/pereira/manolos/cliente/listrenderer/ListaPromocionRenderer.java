package com.pereira.manolos.cliente.listrenderer;

import com.pereira.manolos.negocio.modelos.ModeloPromocion;
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
public class ListaPromocionRenderer extends JPanel implements ListCellRenderer<ModeloPromocion> {

    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTipo;
    private static final Logger LOG = Logger.getLogger ( ListaPromocionRenderer.class.getName () );

    public ListaPromocionRenderer () {
        initComponents ();
    }

    @Override
    public Component getListCellRendererComponent ( JList<? extends ModeloPromocion> lista , ModeloPromocion promo , int pI , boolean isSelected ,
                                                    boolean pBln1 ) {
        lblNombre.setText ( promo.getNombre () );
        lblTipo.setText ( "Costo: $" + promo.getCosto () );
        lblCategoria.setText ( "Precio: $ " + promo.getPrecio () );
        //lblStock.setText (  );
        //lblPrecio.setText ( "Precio: $ " + promo.getPrecio () );
        if ( isSelected ) {
            this.setBackground ( lista.getSelectionBackground () );
            lblNombre.setForeground ( lista.getSelectionForeground () );
            lblStock.setForeground ( lista.getSelectionForeground () );
            lblTipo.setForeground ( lista.getSelectionForeground () );
            lblCategoria.setForeground ( lista.getSelectionForeground () );
            lblPrecio.setForeground ( lista.getSelectionForeground () );
        } else {
            this.setBackground ( lista.getBackground () );
            lblNombre.setForeground ( lista.getForeground () );
            lblStock.setForeground ( lista.getForeground () );
            lblTipo.setForeground ( lista.getForeground () );
            lblCategoria.setForeground ( lista.getForeground () );
            lblPrecio.setForeground ( lista.getForeground () );
        }
        return this;
    }

    private void initComponents () {
        java.awt.GridBagConstraints gridBagConstraints;

        lblNombre = new javax.swing.JLabel ();
        lblCategoria = new javax.swing.JLabel ();
        lblTipo = new javax.swing.JLabel ();
        lblStock = new javax.swing.JLabel ();
        lblPrecio = new javax.swing.JLabel ();

        setLayout ( new java.awt.GridBagLayout () );

        lblNombre.setFont ( new java.awt.Font ( "Arial" , 1 , 14 ) ); // NOI18N
        lblNombre.setText ( "Nombre de Insumo" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 5 , 5 , 5 );
        add ( lblNombre , gridBagConstraints );

        lblCategoria.setFont ( new java.awt.Font ( "Arial" , 0 , 12 ) ); // NOI18N
        lblCategoria.setText ( "" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 5 , 5 , 5 );
        add ( lblCategoria , gridBagConstraints );

        lblTipo.setFont ( new java.awt.Font ( "Arial" , 0 , 12 ) ); // NOI18N
        lblTipo.setText ( "" );
        lblTipo.setMaximumSize ( new java.awt.Dimension ( 100 , 15 ) );
        lblTipo.setMinimumSize ( new java.awt.Dimension ( 100 , 15 ) );
        lblTipo.setPreferredSize ( new java.awt.Dimension ( 100 , 15 ) );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 10 , 5 , 5 );
        add ( lblTipo , gridBagConstraints );

        lblStock.setFont ( new java.awt.Font ( "Arial" , 0 , 12 ) ); // NOI18N
        lblStock.setText ( "" );
        lblStock.setMaximumSize ( new java.awt.Dimension ( 85 , 15 ) );
        lblStock.setMinimumSize ( new java.awt.Dimension ( 85 , 15 ) );
        lblStock.setPreferredSize ( new java.awt.Dimension ( 85 , 15 ) );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 5 , 5 , 5 );
        add ( lblStock , gridBagConstraints );

        lblPrecio.setFont ( new java.awt.Font ( "Arial" , 0 , 12 ) ); // NOI18N
        lblPrecio.setText ( "" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 5 , 5 , 5 );
        add ( lblPrecio , gridBagConstraints );
    }

}
