package com.pereira.manolos.cliente.panels;

import com.mrlonee.swing.animation.AnimatedPanel;
import com.pereira.manolos.cliente.dialogos.DialogCostos;
import com.pereira.manolos.cliente.dialogos.DialogHorasTrabajo;
import com.pereira.manolos.datos.database.tables.CostosIndirectos;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCostosIndirectos;
import com.pereira.manolos.util.CellRenderer;
import com.pereira.manolos.util.HeaderCellRenderer;
import com.pereira.manolos.util.Mensajes;
import java.awt.Color;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;

/*@author Jose Luis */
@SuppressWarnings ( "serial" )
public class PanelCostos extends AnimatedPanel {

    private final DAOManager manager;
    private final DefaultTableModel dtmCostos;
    private int numero = 0;
    private double sumatoria = 0.00;

    public PanelCostos ( DAOManager pManager ) {
        this.manager = pManager;
        this.setAnimationType ( AnimatedPanel.AnimationType.SlideAnimationFromTop );
        initComponents ();
        dtmCostos = ( DefaultTableModel ) tCostos.getModel ();
        dibujarTablas ();
        cargarTablaCostos ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        popCosto = new javax.swing.JPopupMenu();
        itemEditar = new javax.swing.JMenuItem();
        itemEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnHorasTrabajo = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        pTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pMain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCostos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();

        itemEditar.setText("Editar Costo");
        itemEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarActionPerformed(evt);
            }
        });
        popCosto.add(itemEditar);

        itemEliminar.setText("Eliminar Costo");
        itemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarActionPerformed(evt);
            }
        });
        popCosto.add(itemEliminar);

        setBorder(javax.swing.BorderFactory.createLineBorder(colorUI, 5));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(colorUI);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnNuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_nuevo_normal.png"))); // NOI18N
        btnNuevo.setBorder(null);
        btnNuevo.setBorderPainted(false);
        btnNuevo.setContentAreaFilled(false);
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
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 10, 10);
        jPanel1.add(btnNuevo, gridBagConstraints);

        btnEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_editar_normal.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
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
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(btnEditar, gridBagConstraints);

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_eliminar_normal.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_eliminar_pressed.png"))); // NOI18N
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_eliminar_over.png"))); // NOI18N
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(btnEliminar, gridBagConstraints);

        btnHorasTrabajo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnHorasTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_horas-t_normal.png"))); // NOI18N
        btnHorasTrabajo.setBorder(null);
        btnHorasTrabajo.setBorderPainted(false);
        btnHorasTrabajo.setContentAreaFilled(false);
        btnHorasTrabajo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHorasTrabajo.setFocusable(false);
        btnHorasTrabajo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHorasTrabajo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_horas-t_pressed.png"))); // NOI18N
        btnHorasTrabajo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_horas-t_over.png"))); // NOI18N
        btnHorasTrabajo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHorasTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorasTrabajoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(btnHorasTrabajo, gridBagConstraints);

        btnReporte.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_reporte_normal.png"))); // NOI18N
        btnReporte.setBorder(null);
        btnReporte.setBorderPainted(false);
        btnReporte.setContentAreaFilled(false);
        btnReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte.setFocusable(false);
        btnReporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporte.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_reporte_pressed.png"))); // NOI18N
        btnReporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_reporte_over.png"))); // NOI18N
        btnReporte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(btnReporte, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        add(jPanel1, gridBagConstraints);

        pTitulo.setBackground(colorUI);
        pTitulo.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(colorBG);
        jLabel1.setText("Costos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 0);
        pTitulo.add(jLabel1, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e227(0)_64.png"))); // NOI18N
        jLabel6.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 10);
        pTitulo.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(pTitulo, gridBagConstraints);

        pMain.setBackground(new java.awt.Color(102, 102, 102));
        pMain.setOpaque(false);
        pMain.setLayout(new java.awt.GridBagLayout());

        tCostos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "No.", "Rubro", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tCostos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tCostos.setRowHeight(30);
        tCostos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tCostos.getTableHeader().setReorderingAllowed(false);
        tCostos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tCostosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tCostos);
        if (tCostos.getColumnModel().getColumnCount() > 0) {
            tCostos.getColumnModel().getColumn(0).setMinWidth(0);
            tCostos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tCostos.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 20);
        pMain.add(jScrollPane1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("TOTAL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 20, 10);
        pMain.add(jLabel2, gridBagConstraints);

        lblTotal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTotal.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 20, 20);
        pMain.add(lblTotal, gridBagConstraints);

        txtFiltro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtFiltro.setMaximumSize(new java.awt.Dimension(250, 40));
        txtFiltro.setMinimumSize(new java.awt.Dimension(250, 40));
        txtFiltro.setPreferredSize(new java.awt.Dimension(250, 40));
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 10, 0);
        pMain.add(txtFiltro, gridBagConstraints);
        /*txtFiltro.setUI(new TextFieldUI(
            " Buscar...", colorUI, colorUI, colorBG
        ));*/

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(pMain, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if ( tCostos.getSelectedRow () != -1 ) {
            editarCosto ();
        } else {
            Mensajes.mensajeAlert ( "Seleccione un registro para editar" );
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevoCosto ();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int x = Mensajes.mensajeSiNo ( "Desea eliminar el registro?" );
        if ( x == 0 ) {
            if ( tCostos.getSelectedRow () != -1 ) {
                eliminarCosto ();
            } else {
                Mensajes.mensajeAlert ( "Seleccione un registro para aliminar" );
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void itemEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarActionPerformed
        // TODO add your handling code here:
        editarCosto ();
    }//GEN-LAST:event_itemEditarActionPerformed

    private void btnHorasTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorasTrabajoActionPerformed
        DialogHorasTrabajo dialog = new DialogHorasTrabajo ( new JFrame () , true , "Horas de Trabajo" , manager );
        dialog.setVisible ( true );
    }//GEN-LAST:event_btnHorasTrabajoActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        try {
            manager.getReportes ().reporteCostos ();
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void itemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarActionPerformed
        // TODO add your handling code here:
        eliminarCosto ();
    }//GEN-LAST:event_itemEliminarActionPerformed

    private void tCostosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCostosMousePressed
        // TODO add your handling code here:
        Point point = evt.getPoint ();
        int currentRow = tCostos.rowAtPoint ( point );
        tCostos.setRowSelectionInterval ( currentRow , currentRow );
    }//GEN-LAST:event_tCostosMousePressed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        cargarTablaCostos ();
    }//GEN-LAST:event_txtFiltroKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnHorasTrabajo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReporte;
    private javax.swing.JMenuItem itemEditar;
    private javax.swing.JMenuItem itemEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JPopupMenu popCosto;
    private javax.swing.JTable tCostos;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    @SuppressWarnings ( "AssignmentToForLoopParameter" )
    private void cargarTablaCostos () {

        for ( int i = 0 ; i < tCostos.getRowCount () ; i++ ) {
            dtmCostos.removeRow ( i );
            i -= 1;
        }
        Condition condition = CostosIndirectos.COSTOS_INDIRECTOS.RUBRO.
                likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
        try {
            numero = 0;
            sumatoria = 0;
            manager.getCostosIndirectosDAO ().obtenerLista ( condition ).forEach ( costo -> {
                numero++;
                Object[] row = { costo , numero , costo.getRubro () , costo.getCosto () };
                dtmCostos.addRow ( row );
                sumatoria += costo.getCosto ().doubleValue ();
            } );
            String total = String.format ( "%.2f" , sumatoria );
            lblTotal.setText ( "$ " + total );

        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }

    }

    private void dibujarTablas () {
        tCostos.setGridColor ( colorUI );

        JTableHeader jtableHeader = tCostos.getTableHeader ();
        jtableHeader.setDefaultRenderer ( new HeaderCellRenderer ( colorUI ) );
        tCostos.setTableHeader ( jtableHeader );
        tCostos.getColumnModel ().getColumn ( 0 ).setCellRenderer ( new CellRenderer ( "text center" , new Color ( 163 , 190 , 166 ) ) );
        tCostos.getColumnModel ().getColumn ( 1 ).setCellRenderer ( new CellRenderer ( "text center" , new Color ( 163 , 190 , 166 ) ) );
        tCostos.getColumnModel ().getColumn ( 2 ).setCellRenderer ( new CellRenderer ( "text" , new Color ( 163 , 190 , 166 ) ) );
        tCostos.getColumnModel ().getColumn ( 3 ).setCellRenderer ( new CellRenderer ( "precio" , new Color ( 163 , 190 , 166 ) ) );
        tCostos.repaint ();

    }

    private void nuevoCosto () {
        DialogCostos dialog = new DialogCostos ( new JFrame () , true , "Nuevo Costo Indirecto" , manager );
        dialog.setVisible ( true );
        cargarTablaCostos ();
    }

    private void editarCosto () {
        ModeloCostosIndirectos costoIndirecto = ( ModeloCostosIndirectos ) tCostos.getValueAt ( tCostos.getSelectedRow () , 0 );
        DialogCostos dialog = new DialogCostos ( new JFrame () , true , "Editar Costo Indirecto" , manager , costoIndirecto );
        dialog.setVisible ( true );
        cargarTablaCostos ();
    }

    private void eliminarCosto () {
        ModeloCostosIndirectos costoIndirecto = ( ModeloCostosIndirectos ) tCostos.getValueAt ( tCostos.getSelectedRow () , 0 );
        try {
            manager.getCostosIndirectosDAO ().eliminar ( costoIndirecto );
            Mensajes.mensajeOk ( "Registro eliminado exitosamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            cargarTablaCostos ();
        }
    }

    private static final Logger LOG = Logger.getLogger ( PanelCostos.class.getName () );
}
