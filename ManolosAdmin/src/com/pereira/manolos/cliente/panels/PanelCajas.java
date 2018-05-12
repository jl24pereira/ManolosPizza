package com.pereira.manolos.cliente.panels;

import com.mrlonee.swing.animation.AnimatedPanel;
import com.pereira.manolos.cliente.dialogos.DialogCajas;
import com.pereira.manolos.datos.database.Tables;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCaja;
import com.pereira.manolos.util.CellRenderer;
import com.pereira.manolos.util.HeaderCellRenderer;
import com.pereira.manolos.util.Mensajes;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI900;

/*@author Jose Luis */
public class PanelCajas extends AnimatedPanel {

    private static final Logger LOG = Logger.getLogger ( PanelCajas.class.getName () );
    private final DAOManager manager;
    private final DefaultTableModel dtmCajas;
    private int numero = 0;

    public PanelCajas ( DAOManager manager ) {
        this.manager = manager;
        this.setAnimationType ( AnimatedPanel.AnimationType.SlideAnimationFromTop );
        initComponents ();
        dtmCajas = ( DefaultTableModel ) tCajas.getModel ();
        dibujarTablas ();
        cargarTablaCajas ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        popCaja = new javax.swing.JPopupMenu();
        itemEditarCaja = new javax.swing.JMenuItem();
        itemAltaCaja = new javax.swing.JMenuItem();
        pMain = new javax.swing.JPanel();
        pTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pTabs = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tCajas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        itemEditarCaja.setText("Editar Caja");
        itemEditarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarCajaActionPerformed(evt);
            }
        });
        popCaja.add(itemEditarCaja);

        itemAltaCaja.setText("Alta de Caja");
        itemAltaCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAltaCajaActionPerformed(evt);
            }
        });
        popCaja.add(itemAltaCaja);

        setBorder(javax.swing.BorderFactory.createLineBorder(colorUI, 5));
        setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(new java.awt.Color(102, 102, 102));
        pMain.setOpaque(false);
        pMain.setLayout(new java.awt.GridBagLayout());

        pTitulo.setBackground(colorUI);
        pTitulo.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(colorBG);
        jLabel1.setText("Cajas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 0);
        pTitulo.add(jLabel1, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e30c(0)_64.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 10);
        pTitulo.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pMain.add(pTitulo, gridBagConstraints);

        pTabs.setOpaque(false);
        pTabs.setLayout(new java.awt.GridBagLayout());

        tCajas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "No.", "Descripcion", "IP", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tCajas.setComponentPopupMenu(popCaja);
        tCajas.setRowHeight(30);
        tCajas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tCajas.getTableHeader().setReorderingAllowed(false);
        tCajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tCajasMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tCajas);
        if (tCajas.getColumnModel().getColumnCount() > 0) {
            tCajas.getColumnModel().getColumn(0).setMinWidth(0);
            tCajas.getColumnModel().getColumn(0).setPreferredWidth(0);
            tCajas.getColumnModel().getColumn(0).setMaxWidth(0);
            tCajas.getColumnModel().getColumn(1).setMinWidth(50);
            tCajas.getColumnModel().getColumn(1).setPreferredWidth(50);
            tCajas.getColumnModel().getColumn(1).setMaxWidth(50);
            tCajas.getColumnModel().getColumn(3).setMinWidth(150);
            tCajas.getColumnModel().getColumn(3).setPreferredWidth(150);
            tCajas.getColumnModel().getColumn(3).setMaxWidth(150);
            tCajas.getColumnModel().getColumn(4).setMinWidth(150);
            tCajas.getColumnModel().getColumn(4).setPreferredWidth(150);
            tCajas.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pTabs.add(jScrollPane2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pMain.add(pTabs, gridBagConstraints);

        jPanel1.setBackground(colorUI);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnNuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_nuevo_normal.png"))); // NOI18N
        btnNuevo.setBorder(null);
        btnNuevo.setBorderPainted(false);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_nuevo_pressed.png"))); // NOI18N
        btnNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_nuevo_over.png"))); // NOI18N
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        jPanel1.add(btnNuevo, gridBagConstraints);

        btnEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_editar_normal.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_editar_pressed.png"))); // NOI18N
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_editar_over.png"))); // NOI18N
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel1.add(btnEditar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        pMain.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(pMain, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editarCaja ();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tCajasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCajasMousePressed
        Point point = evt.getPoint ();
        int currentRow = tCajas.rowAtPoint ( point );
        tCajas.setRowSelectionInterval ( currentRow , currentRow );
        if ( ( boolean ) tCajas.getValueAt ( tCajas.getSelectedRow () , 4 ) ) {
            itemAltaCaja.setText ( "Desactivar Caja" );
        } else {
            itemAltaCaja.setText ( "Activar Caja" );
        }
    }//GEN-LAST:event_tCajasMousePressed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        DialogCajas dialogCajas = new DialogCajas ( new JFrame () , true , "NUEVA CAJA" , manager );
        dialogCajas.setVisible ( true );
        cargarTablaCajas ();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void itemEditarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarCajaActionPerformed
        editarCaja ();
    }//GEN-LAST:event_itemEditarCajaActionPerformed

    private void itemAltaCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAltaCajaActionPerformed
        cambiarEstadoCaja ();
    }//GEN-LAST:event_itemAltaCajaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JMenuItem itemAltaCaja;
    private javax.swing.JMenuItem itemEditarCaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pTabs;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JPopupMenu popCaja;
    private javax.swing.JTable tCajas;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaCajas () {
        for ( int i = 0 ; i < tCajas.getRowCount () ; i++ ) {
            dtmCajas.removeRow ( i );
            i -= 1;
        }
        Condition condition = Tables.CAJA.IDCAJA.greaterOrEqual ( 1 );
        try {
            manager.getCajaDAO ().obtenerLista ( condition ).forEach ( caja -> {
                numero++;
                Object[] row = { caja , numero , caja.getDetalle () , caja.getIpCaja () , caja.isBaja () };
                dtmCajas.addRow ( row );
            } );
            if ( tCajas.getRowCount () > 0 ) {
                tCajas.changeSelection ( 0 , 1 , false , false );
            }
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            numero = 0;
        }
    }

    private void dibujarTablas () {
        tCajas.setGridColor ( colorUI900 );
        JTableHeader jtableHeader = tCajas.getTableHeader ();
        jtableHeader.setDefaultRenderer ( new HeaderCellRenderer ( colorUI900 ) );
        tCajas.setTableHeader ( jtableHeader );

        tCajas.getColumnModel ().getColumn ( 0 ).setCellRenderer ( new CellRenderer ( "text center" , colorUI ) );
        tCajas.getColumnModel ().getColumn ( 1 ).setCellRenderer ( new CellRenderer ( "text center" , colorUI ) );
        tCajas.getColumnModel ().getColumn ( 2 ).setCellRenderer ( new CellRenderer ( "text" , colorUI ) );
        tCajas.getColumnModel ().getColumn ( 3 ).setCellRenderer ( new CellRenderer ( "text center" , colorUI ) );
        tCajas.getColumnModel ().getColumn ( 4 ).setCellRenderer ( new CellRenderer ( "caja" , colorUI ) );
        tCajas.repaint ();

    }

    private void editarCaja () {
        ModeloCaja caja = ( ModeloCaja ) tCajas.getValueAt ( tCajas.getSelectedRow () , 0 );
        DialogCajas dialogCajas = new DialogCajas ( new JFrame () , true , "EDITAR CAJA" , manager , caja );
        dialogCajas.setVisible ( true );
        cargarTablaCajas ();
    }

    private void cambiarEstadoCaja () {
        ModeloCaja caja = ( ModeloCaja ) tCajas.getValueAt ( tCajas.getSelectedRow () , 0 );
        if ( caja.isBaja () ) {
            if ( caja.isEstado () ) {
                Mensajes.mensajeAlert ( "No se puede desactivar, Caja abierta!" );
            } else {
                caja.setBaja ( false );
            }
        } else {
            caja.setBaja ( true );
        }
        try {
            if ( !caja.isEstado () ) {
                manager.getCajaDAO ().modificar ( caja );
                Mensajes.mensajeOk ( "Registro editado exitosamente" );
            }
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            cargarTablaCajas ();
        }
    }

}
