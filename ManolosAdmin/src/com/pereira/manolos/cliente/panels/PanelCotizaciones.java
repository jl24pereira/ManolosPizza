package com.pereira.manolos.cliente.panels;

import com.mrlonee.swing.animation.AnimatedPanel;
import com.pereira.manolos.cliente.dialogos.DialogCotizacion;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCotizacion;
import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.util.CellRenderer;
import com.pereira.manolos.util.Fechero;
import com.pereira.manolos.util.HeaderCellRenderer;
import com.pereira.manolos.util.Mensajes;
import java.awt.Color;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.datos.database.Tables.COTIZACION;

/*@author Jose Luis */
public class PanelCotizaciones extends AnimatedPanel {

    private final DAOManager manager;

    private final DefaultTableModel dtmCotizaciones;
    private ModeloEmpleado empleado;

    public PanelCotizaciones ( DAOManager manager , ModeloEmpleado empleado ) {
        this.setAnimationType ( AnimatedPanel.AnimationType.SlideAnimationFromTop );
        initComponents ();
        this.manager = manager;
        this.empleado = empleado;
        dtmCotizaciones = ( DefaultTableModel ) tCotizaciones.getModel ();
        dibujarTablas ();
        cargarTablaCotizaciones ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenu1 = new javax.swing.JMenu();
        itemCancelar = new javax.swing.JMenuItem();
        pMain = new javax.swing.JPanel();
        pTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pTabs = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tCotizaciones = new javax.swing.JTable();
        txtFiltroFecha = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        itemCancelar.setText("Cancelar");
        jMenu1.add(itemCancelar);

        setBorder(javax.swing.BorderFactory.createLineBorder(colorUI, 10));
        setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(new java.awt.Color(102, 102, 102));
        pMain.setOpaque(false);
        pMain.setLayout(new java.awt.GridBagLayout());

        pTitulo.setBackground(colorUI);
        pTitulo.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(colorBG);
        jLabel1.setText("Cotizaciones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        pTitulo.add(jLabel1, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e14f(0)_64.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 10);
        pTitulo.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pMain.add(pTitulo, gridBagConstraints);

        pTabs.setOpaque(false);
        pTabs.setLayout(new java.awt.GridBagLayout());

        tCotizaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "No.", "Fecha", "Cliente", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tCotizaciones.setRowHeight(30);
        tCotizaciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tCotizaciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tCotizaciones);
        if (tCotizaciones.getColumnModel().getColumnCount() > 0) {
            tCotizaciones.getColumnModel().getColumn(0).setMinWidth(0);
            tCotizaciones.getColumnModel().getColumn(0).setPreferredWidth(0);
            tCotizaciones.getColumnModel().getColumn(0).setMaxWidth(0);
            tCotizaciones.getColumnModel().getColumn(1).setMinWidth(50);
            tCotizaciones.getColumnModel().getColumn(1).setPreferredWidth(50);
            tCotizaciones.getColumnModel().getColumn(1).setMaxWidth(50);
            tCotizaciones.getColumnModel().getColumn(2).setMinWidth(100);
            tCotizaciones.getColumnModel().getColumn(2).setPreferredWidth(100);
            tCotizaciones.getColumnModel().getColumn(2).setMaxWidth(100);
            tCotizaciones.getColumnModel().getColumn(4).setMinWidth(100);
            tCotizaciones.getColumnModel().getColumn(4).setPreferredWidth(100);
            tCotizaciones.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 20, 20);
        pTabs.add(jScrollPane2, gridBagConstraints);

        txtFiltroFecha.setDate(new Date());
        txtFiltroFecha.setDateFormatString("dd-MM-yyyy");
        txtFiltroFecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFiltroFecha.setMaximumSize(new java.awt.Dimension(150, 40));
        txtFiltroFecha.setMinimumSize(new java.awt.Dimension(200, 40));
        txtFiltroFecha.setPreferredSize(new java.awt.Dimension(200, 40));
        txtFiltroFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtFiltroFechaPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 10, 0);
        pTabs.add(txtFiltroFecha, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
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

        btnVer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_ver_normal.png"))); // NOI18N
        btnVer.setBorder(null);
        btnVer.setBorderPainted(false);
        btnVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVer.setFocusable(false);
        btnVer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVer.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_ver_pressed.png"))); // NOI18N
        btnVer.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_ver_over.png"))); // NOI18N
        btnVer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel1.add(btnVer, gridBagConstraints);

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

    private void txtFiltroFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtFiltroFechaPropertyChange
        cargarTablaCotizaciones ();
    }//GEN-LAST:event_txtFiltroFechaPropertyChange

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        DialogCotizacion dialog = new DialogCotizacion ( new javax.swing.JFrame () , true , "NUEVA COTIZACION" , manager );
        dialog.setVisible ( true );
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        /*int idcotizacion = ( int ) tCotizaciones.getValueAt ( tCotizaciones.getSelectedRow () , 0 );
        Reportes.Reportes.cotizacionOnline ( idcotizacion );*/
        ModeloCotizacion cotizacion = ( ModeloCotizacion ) tCotizaciones.getValueAt ( tCotizaciones.getSelectedRow () , 0 );
        try {
            manager.getReportes ().cotizacionOnline ( cotizacion );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }//GEN-LAST:event_btnVerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVer;
    private javax.swing.JMenuItem itemCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pTabs;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JTable tCotizaciones;
    private com.toedter.calendar.JDateChooser txtFiltroFecha;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaCotizaciones () {
        for ( int i = 0 ; i < tCotizaciones.getRowCount () ; i++ ) {
            dtmCotizaciones.removeRow ( i );
            i -= 1;
        }
        Condition fecha = COTIZACION.FECHA.equal ( new java.sql.Date ( txtFiltroFecha.getDate ().getTime () ) );

        try {
            manager.getCotizacionDAO ().obtenerLista ( fecha ).forEach ( cotizacion -> {
                Object[] row = {
                    cotizacion ,
                    cotizacion.getNumero () ,
                    Fechero.dateToString ( cotizacion.getFecha () ) ,
                    cotizacion.getCliente ().getNombre () ,
                    cotizacion.getTotal ()
                };
                dtmCotizaciones.addRow ( row );
            } );
        } catch ( Exception ex ) {
            Logger.getLogger ( PanelCotizaciones.class.getName () ).log ( Level.SEVERE , null , ex );
        }

        if ( tCotizaciones.getRowCount () > 0 ) {
            tCotizaciones.changeSelection ( 0 , 1 , false , false );
        }
    }

    private void dibujarTablas () {
        tCotizaciones.setGridColor ( colorUI );
        JTableHeader jtableHeader = tCotizaciones.getTableHeader ();
        jtableHeader.setDefaultRenderer ( new HeaderCellRenderer ( colorUI ) );
        tCotizaciones.setTableHeader ( jtableHeader );

        tCotizaciones.getColumnModel ().getColumn ( 1 ).setCellRenderer ( new CellRenderer ( "text center" , new Color ( 163 , 190 , 166 ) ) );
        tCotizaciones.getColumnModel ().getColumn ( 2 ).setCellRenderer ( new CellRenderer ( "text center" , new Color ( 163 , 190 , 166 ) ) );
        tCotizaciones.getColumnModel ().getColumn ( 3 ).setCellRenderer ( new CellRenderer ( "text" , new Color ( 163 , 190 , 166 ) ) );
        tCotizaciones.getColumnModel ().getColumn ( 4 ).setCellRenderer ( new CellRenderer ( "precio" , new Color ( 163 , 190 , 166 ) ) );
        tCotizaciones.repaint ();

    }

    private static final Logger LOG = Logger.getLogger ( PanelCotizaciones.class.getName () );

}
