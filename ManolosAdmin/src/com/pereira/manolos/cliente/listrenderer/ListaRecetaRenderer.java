package com.pereira.manolos.cliente.listrenderer;

import com.pereira.manolos.negocio.modelos.ModeloReceta;
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
public class ListaRecetaRenderer extends JPanel implements ListCellRenderer<ModeloReceta> {

    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTipo;
    private static final Logger LOG = Logger.getLogger ( ListaRecetaRenderer.class.getName () );

    public ListaRecetaRenderer () {
        initComponents ();
    }

    @Override
    public Component getListCellRendererComponent ( JList<? extends ModeloReceta> lista , ModeloReceta receta , int pI , boolean isSelected ,
                                                    boolean pBln1 ) {
        lblNombre.setText ( receta.getNombre () );
        lblStock.setText ( "Stock: " + receta.getStock () + " " + receta.getUnidad ().getDetalle () );
        lblTipo.setText ( "Tipo: " + receta.getTiporeceta () );
        if ( isSelected ) {
            this.setBackground ( lista.getSelectionBackground () );
            lblNombre.setForeground ( lista.getSelectionForeground () );
            lblStock.setForeground ( lista.getSelectionForeground () );
            lblTipo.setForeground ( lista.getSelectionForeground () );
        } else {
            this.setBackground ( lista.getBackground () );
            lblNombre.setForeground ( lista.getForeground () );
            lblStock.setForeground ( lista.getForeground () );
            lblTipo.setForeground ( lista.getForeground () );
        }
        return this;
    }

    private void initComponents () {
        java.awt.GridBagConstraints gridBagConstraints;

        lblNombre = new javax.swing.JLabel ();
        lblTipo = new javax.swing.JLabel ();
        lblStock = new javax.swing.JLabel ();

        setLayout ( new java.awt.GridBagLayout () );

        lblNombre.setFont ( new java.awt.Font ( "Arial" , 1 , 14 ) ); // NOI18N
        lblNombre.setText ( "Nombre de Insumo" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 5 , 5 , 5 );
        add ( lblNombre , gridBagConstraints );

        lblTipo.setFont ( new java.awt.Font ( "Arial" , 0 , 12 ) ); // NOI18N
        lblTipo.setText ( "Tipo: Complementaria" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 10 , 5 , 5 );
        add ( lblTipo , gridBagConstraints );

        lblStock.setFont ( new java.awt.Font ( "Arial" , 0 , 12 ) ); // NOI18N
        lblStock.setText ( "Stock: ##.##" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 10 , 5 , 5 );
        add ( lblStock , gridBagConstraints );
    }

}
