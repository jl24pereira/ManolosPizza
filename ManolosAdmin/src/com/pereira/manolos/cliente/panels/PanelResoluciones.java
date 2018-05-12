package com.pereira.manolos.cliente.panels;

import com.mrlonee.swing.animation.AnimatedPanel;
import com.pereira.manolos.cliente.dialogos.DialogResolucion;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloResolucion;
import com.pereira.manolos.util.CellRenderer;
import com.pereira.manolos.util.Fechero;
import com.pereira.manolos.util.HeaderCellRenderer;
import com.pereira.manolos.util.Mensajes;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI900;
import static com.pereira.manolos.datos.database.Tables.RESOLUCION;

/*@author Jose Luis */
@SuppressWarnings ( "serial" )
public class PanelResoluciones extends AnimatedPanel {

    private final DAOManager manager;
    private final DefaultTableModel dtmResoluciones;
    private DialogResolucion dialogResolucion;

    public PanelResoluciones ( DAOManager manager ) {
        this.manager = manager;
        this.setAnimationType ( AnimatedPanel.AnimationType.SlideAnimationFromTop );
        initComponents ();
        dtmResoluciones = ( DefaultTableModel ) tResoluciones.getModel ();
        dibujarTablas ();
        cargarResoluciones ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        popInventario = new javax.swing.JPopupMenu();
        itemEditar = new javax.swing.JMenuItem();
        itemBaja = new javax.swing.JMenuItem();
        pMain = new javax.swing.JPanel();
        pTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pComandos = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        pCentro = new javax.swing.JPanel();
        pBusqueda = new javax.swing.JPanel();
        chkActiva = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tResoluciones = new javax.swing.JTable();

        itemEditar.setText("Editar Material");
        itemEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarActionPerformed(evt);
            }
        });
        popInventario.add(itemEditar);

        itemBaja.setText("Baja Material");
        itemBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBajaActionPerformed(evt);
            }
        });
        popInventario.add(itemBaja);

        setBorder(javax.swing.BorderFactory.createLineBorder(colorUI, 5));
        setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(new java.awt.Color(102, 102, 102));
        pMain.setOpaque(false);
        pMain.setLayout(new java.awt.GridBagLayout());

        pTitulo.setBackground(colorUI);
        pTitulo.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(colorBG);
        jLabel1.setText("Resoluciones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 0);
        pTitulo.add(jLabel1, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e0b9(0)_64.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        pTitulo.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        pMain.add(pTitulo, gridBagConstraints);

        pComandos.setBackground(colorUI);
        pComandos.setMinimumSize(new java.awt.Dimension(120, 100));
        pComandos.setPreferredSize(new java.awt.Dimension(120, 100));
        pComandos.setLayout(new java.awt.GridBagLayout());

        btnNuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 0);
        pComandos.add(btnNuevo, gridBagConstraints);

        btnEditar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pComandos.add(btnEditar, gridBagConstraints);

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pComandos.add(btnEliminar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.1;
        pMain.add(pComandos, gridBagConstraints);

        pCentro.setOpaque(false);
        pCentro.setLayout(new java.awt.GridBagLayout());

        pBusqueda.setOpaque(false);
        pBusqueda.setLayout(new java.awt.GridBagLayout());

        chkActiva.setBackground(new java.awt.Color(255, 255, 255));
        chkActiva.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkActiva.setSelected(true);
        chkActiva.setText("Activas");
        chkActiva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkActiva.setFocusable(false);
        chkActiva.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkActiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
        chkActiva.setMaximumSize(new java.awt.Dimension(120, 25));
        chkActiva.setMinimumSize(new java.awt.Dimension(120, 25));
        chkActiva.setPreferredSize(new java.awt.Dimension(120, 25));
        chkActiva.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
        chkActiva.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkActivaItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pBusqueda.add(chkActiva, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        pCentro.add(pBusqueda, gridBagConstraints);

        tResoluciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "RESOLUCION", "FECHA", "TKT INICIAL ", "TKT FINAL ", "TKT ACTUAL ", "SERIE", "CAJA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tResoluciones.setRowHeight(30);
        tResoluciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tResoluciones.getTableHeader().setReorderingAllowed(false);
        tResoluciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tResolucionesMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tResoluciones);
        if (tResoluciones.getColumnModel().getColumnCount() > 0) {
            tResoluciones.getColumnModel().getColumn(0).setMinWidth(0);
            tResoluciones.getColumnModel().getColumn(0).setPreferredWidth(0);
            tResoluciones.getColumnModel().getColumn(0).setMaxWidth(0);
            tResoluciones.getColumnModel().getColumn(2).setMinWidth(80);
            tResoluciones.getColumnModel().getColumn(2).setPreferredWidth(80);
            tResoluciones.getColumnModel().getColumn(2).setMaxWidth(80);
            tResoluciones.getColumnModel().getColumn(3).setMinWidth(80);
            tResoluciones.getColumnModel().getColumn(3).setPreferredWidth(80);
            tResoluciones.getColumnModel().getColumn(3).setMaxWidth(80);
            tResoluciones.getColumnModel().getColumn(4).setMinWidth(80);
            tResoluciones.getColumnModel().getColumn(4).setPreferredWidth(80);
            tResoluciones.getColumnModel().getColumn(4).setMaxWidth(80);
            tResoluciones.getColumnModel().getColumn(5).setMinWidth(80);
            tResoluciones.getColumnModel().getColumn(5).setPreferredWidth(80);
            tResoluciones.getColumnModel().getColumn(5).setMaxWidth(80);
            tResoluciones.getColumnModel().getColumn(7).setMinWidth(120);
            tResoluciones.getColumnModel().getColumn(7).setPreferredWidth(120);
            tResoluciones.getColumnModel().getColumn(7).setMaxWidth(120);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pCentro.add(jScrollPane2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pMain.add(pCentro, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(pMain, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if ( tResoluciones.getRowCount () > 0 ) {
            ModeloResolucion res = ( ModeloResolucion ) tResoluciones.getValueAt ( tResoluciones.getSelectedRow () , 0 );
            if ( res.getTktactual () == 0 ) {
                dialogResolucion = new DialogResolucion ( new JFrame () , true , "EDITAR RESOLUCION" , manager , res );
                dialogResolucion.setVisible ( true );
                cargarResoluciones ();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void itemEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarActionPerformed

    }//GEN-LAST:event_itemEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        dialogResolucion = new DialogResolucion ( new JFrame () , true , "NUEVA RESOLUCION" , manager );
        dialogResolucion.setVisible ( true );
        cargarResoluciones ();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void itemBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBajaActionPerformed

    }//GEN-LAST:event_itemBajaActionPerformed

    private void chkActivaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkActivaItemStateChanged
        cargarResoluciones ();
    }//GEN-LAST:event_chkActivaItemStateChanged

    private void tResolucionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tResolucionesMousePressed
//        Point point = evt.getPoint ();
//        int currentRow = tCajas.rowAtPoint ( point );
//        tCajas.setRowSelectionInterval ( currentRow , currentRow );
//        if ( ( boolean ) tCajas.getValueAt ( tCajas.getSelectedRow () , 4 ) ) {
//            itemAltaCaja.setText ( "Desactivar Caja" );
//        } else {
//            itemAltaCaja.setText ( "Activar Caja" );
//        }
    }//GEN-LAST:event_tResolucionesMousePressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if ( tResoluciones.getRowCount () > 0 ) {
            ModeloResolucion res = ( ModeloResolucion ) tResoluciones.getValueAt ( tResoluciones.getSelectedRow () , 0 );
            if ( res.getTktactual () == 0 ) {
                try {
                    manager.getResolucionDAO ().eliminar ( res );
                    cargarResoluciones ();
                    Mensajes.mensajeOk ( "Registro eliminado satisfactoriamente!" );
                } catch ( Exception ex ) {
                    LOG.log ( Level.SEVERE , null , ex );
                    Mensajes.mensajeError ( "Error: " + ex.getMessage () );
                }
            } else {
                Mensajes.mensajeAlert ( "No se puede eliminar el registro \nEsta resolución ya esta siendo utilizada" );
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox chkActiva;
    private javax.swing.JMenuItem itemBaja;
    private javax.swing.JMenuItem itemEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pBusqueda;
    private javax.swing.JPanel pCentro;
    private javax.swing.JPanel pComandos;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JPopupMenu popInventario;
    private javax.swing.JTable tResoluciones;
    // End of variables declaration//GEN-END:variables
    private void cargarResoluciones () {
        for ( int i = 0 ; i < tResoluciones.getRowCount () ; i++ ) {
            dtmResoluciones.removeRow ( i );
            i -= 1;
        }
        Condition activas = RESOLUCION.ACTIVA.eq ( chkActiva.isSelected () );
        try {
            manager.getResolucionDAO ().obtenerLista ( activas ).forEach ( res -> {
                Object[] row = { res , res.getResolucion () , Fechero.dateToString ( res.getFecha () ) , res.getTktinicial () , res.getTktfinal () ,
                                 res.getTktactual () , res.getSerie () , res.getCaja ().getDetalle () };
                dtmResoluciones.addRow ( row );
            } );
            if ( tResoluciones.getRowCount () > 0 ) {
                tResoluciones.changeSelection ( 0 , 1 , false , false );
            }
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }

    private void dibujarTablas () {
        tResoluciones.setGridColor ( colorUI900 );
        JTableHeader jtableHeader = tResoluciones.getTableHeader ();
        jtableHeader.setDefaultRenderer ( new HeaderCellRenderer ( colorUI900 ) );
        tResoluciones.setTableHeader ( jtableHeader );

        tResoluciones.getColumnModel ().getColumn ( 1 ).setCellRenderer ( new CellRenderer ( "text" , colorUI ) );
        tResoluciones.getColumnModel ().getColumn ( 2 ).setCellRenderer ( new CellRenderer ( "text center" , colorUI ) );
        tResoluciones.getColumnModel ().getColumn ( 3 ).setCellRenderer ( new CellRenderer ( "num" , colorUI ) );
        tResoluciones.getColumnModel ().getColumn ( 4 ).setCellRenderer ( new CellRenderer ( "num" , colorUI ) );
        tResoluciones.getColumnModel ().getColumn ( 5 ).setCellRenderer ( new CellRenderer ( "num" , colorUI ) );
        tResoluciones.getColumnModel ().getColumn ( 6 ).setCellRenderer ( new CellRenderer ( "text" , colorUI ) );
        tResoluciones.getColumnModel ().getColumn ( 7 ).setCellRenderer ( new CellRenderer ( "text" , colorUI ) );
        tResoluciones.repaint ();

    }

    private static final Logger LOG = Logger.getLogger ( PanelResoluciones.class.getName () );

}
