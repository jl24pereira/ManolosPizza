package com.pereira.manolos.cliente.listrenderer;

import com.pereira.manolos.negocio.modelos.ModeloInsumo;
import java.awt.Component;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

/* @author JL Desk */
@SuppressWarnings ( "serial" )
public class ListaInsumoRenderer extends JPanel implements ListCellRenderer<ModeloInsumo> {

    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblExistencia;
    private javax.swing.JLabel lblNombre;
    private static final Logger LOG = Logger.getLogger ( ListaInsumoRenderer.class.getName () );

    public ListaInsumoRenderer () {
        initComponents ();
    }

    @Override
    public Component getListCellRendererComponent ( JList<? extends ModeloInsumo> jlist , ModeloInsumo e , int i , boolean isSelected , boolean bln1 ) {
        lblNombre.setText ( e.getNombre () );
        lblCosto.setText ( "Costo: $ " + String.format ( "%.4f" , e.getCosto ().doubleValue () ) );
        lblExistencia.setText ( "Stock: " + String.format ( "%.2f" , e.getStock () ) + " " + e.getUnidad ().getDetalle () );
        if ( isSelected ) {
            this.setBackground ( jlist.getSelectionBackground () );
            lblCosto.setForeground ( jlist.getSelectionForeground () );
            lblExistencia.setForeground ( jlist.getSelectionForeground () );
            lblNombre.setForeground ( jlist.getSelectionForeground () );
        } else {
            this.setBackground ( jlist.getBackground () );
            lblCosto.setForeground ( jlist.getForeground () );
            lblExistencia.setForeground ( jlist.getForeground () );
            lblNombre.setForeground ( jlist.getForeground () );
        }
        return this;
    }

    private void initComponents () {
        java.awt.GridBagConstraints gridBagConstraints;

        lblNombre = new javax.swing.JLabel ();
        lblExistencia = new javax.swing.JLabel ();
        lblCosto = new javax.swing.JLabel ();

        setLayout ( new java.awt.GridBagLayout () );

        lblNombre.setFont ( new java.awt.Font ( "Arial" , 1 , 14 ) ); // NOI18N
        lblNombre.setText ( "Nombre de Insumo" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 5 , 5 , 5 );
        add ( lblNombre , gridBagConstraints );

        lblExistencia.setFont ( new java.awt.Font ( "Arial" , 0 , 12 ) ); // NOI18N
        lblExistencia.setText ( "Stock: 00.00 Unidad/es" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 10 , 5 , 5 );
        add ( lblExistencia , gridBagConstraints );

        lblCosto.setFont ( new java.awt.Font ( "Arial" , 0 , 12 ) ); // NOI18N
        lblCosto.setText ( "Costo: $ 0000.00" );
        gridBagConstraints = new java.awt.GridBagConstraints ();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets ( 5 , 10 , 5 , 5 );
        add ( lblCosto , gridBagConstraints );
    }

}
