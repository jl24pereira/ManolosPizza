package com.pereira.manolos.cliente.panels;

import com.mrlonee.swing.animation.AnimatedPanel;
import com.pereira.manolos.cliente.dialogos.DialogAbono;
import com.pereira.manolos.cliente.dialogos.DialogCompra;
import com.pereira.manolos.cliente.dialogos.DialogDetalleCompra;
import com.pereira.manolos.cliente.listrenderer.ListaProveedorRenderer;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCompra;
import com.pereira.manolos.negocio.modelos.ModeloProveedor;
import com.pereira.manolos.util.CellRenderer;
import com.pereira.manolos.util.ComboUI;
import com.pereira.manolos.util.Fechero;
import com.pereira.manolos.util.HeaderCellRenderer;
import com.pereira.manolos.util.Mensajes;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI900;
import static com.pereira.manolos.datos.database.Tables.COMPRA;
import static com.pereira.manolos.datos.database.Tables.DETALLE_COMPRA;
import static com.pereira.manolos.datos.database.Tables.PAGOS_COMPRA;
import static com.pereira.manolos.datos.database.Tables.PROVEEDOR;

/* @author Jose Luis */
@SuppressWarnings ( "serial" )
public class PanelCompras extends AnimatedPanel {

    private final DAOManager manager;
    private final DefaultListModel<ModeloProveedor> dlmProveedor;
    private final DefaultTableModel dtmFacturas;

    @SuppressWarnings ( "OverridableMethodCallInConstructor" )
    public PanelCompras ( DAOManager pManager ) {
        this.dlmProveedor = new DefaultListModel<> ();
        this.manager = pManager;
        this.setAnimationType ( AnimatedPanel.AnimationType.SlideAnimationFromTop );
        initComponents ();
        dtmFacturas = ( DefaultTableModel ) tFacturas.getModel ();
        lProveedores.setCellRenderer ( new ListaProveedorRenderer () );
        cargarProveedores ();
        dibujarTablaFacturas ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        popFacturas = new javax.swing.JPopupMenu();
        itemVerDetalle = new javax.swing.JMenuItem();
        itemPago = new javax.swing.JMenuItem();
        pMain = new javax.swing.JPanel();
        pTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pComandos = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        pBody = new javax.swing.JPanel();
        pBusqueda = new javax.swing.JPanel();
        txtFiltro = new javax.swing.JTextField();
        cbxFiltro = new javax.swing.JComboBox<>();
        chkBajas = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        lProveedores = new javax.swing.JList<>();
        pInfo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tFacturas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtFechaInicial = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtFechaFinal = new com.toedter.calendar.JDateChooser();

        itemVerDetalle.setText("Ver Detalle");
        itemVerDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerDetalleActionPerformed(evt);
            }
        });
        popFacturas.add(itemVerDetalle);

        itemPago.setText("Agregar Pago");
        itemPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPagoActionPerformed(evt);
            }
        });
        popFacturas.add(itemPago);

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(colorUI, 5));
        setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(new java.awt.Color(102, 102, 102));
        pMain.setOpaque(false);
        pMain.setLayout(new java.awt.GridBagLayout());

        pTitulo.setBackground(colorUI);
        pTitulo.setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(colorBG);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(colorBG);
        jLabel1.setText("Compras");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 0);
        pTitulo.add(jLabel1, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e547(0)_64.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        pTitulo.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pMain.add(pTitulo, gridBagConstraints);

        pComandos.setBackground(colorUI);
        pComandos.setMinimumSize(new java.awt.Dimension(120, 100));
        pComandos.setPreferredSize(new java.awt.Dimension(120, 100));
        pComandos.setLayout(new java.awt.GridBagLayout());

        btnNuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_nuevo_normal.png"))); // NOI18N
        btnNuevo.setToolTipText("");
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
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 0);
        pComandos.add(btnNuevo, gridBagConstraints);

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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        pComandos.add(btnReporte, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pMain.add(pComandos, gridBagConstraints);

        pBody.setOpaque(false);
        pBody.setLayout(new java.awt.GridBagLayout());

        pBusqueda.setOpaque(false);
        pBusqueda.setLayout(new java.awt.GridBagLayout());

        txtFiltro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtFiltro.setMargin(new java.awt.Insets(2, 10, 2, 2));
        txtFiltro.setMaximumSize(new java.awt.Dimension(150, 40));
        txtFiltro.setMinimumSize(new java.awt.Dimension(150, 40));
        txtFiltro.setPreferredSize(new java.awt.Dimension(150, 40));
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        pBusqueda.add(txtFiltro, gridBagConstraints);
        /*txtFiltro.setUI(new TextFieldUI(
            " Buscar...", colorUI, colorUI, colorBG
        ));*/

        cbxFiltro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbxFiltro.setForeground(colorUI);
        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar todo", "Nombre", "Direccion", "Telefono" }));
        cbxFiltro.setMaximumSize(new java.awt.Dimension(150, 40));
        cbxFiltro.setMinimumSize(new java.awt.Dimension(150, 40));
        cbxFiltro.setPreferredSize(new java.awt.Dimension(150, 40));
        cbxFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxFiltroItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pBusqueda.add(cbxFiltro, gridBagConstraints);
        cbxFiltro.setUI(new ComboUI(colorBG,colorUI, colorBG));

        chkBajas.setBackground(new java.awt.Color(255, 255, 255));
        chkBajas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkBajas.setForeground(colorUI);
        chkBajas.setText("Ver Bajas");
        chkBajas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkBajas.setFocusable(false);
        chkBajas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chkBajas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
        chkBajas.setMaximumSize(new java.awt.Dimension(115, 25));
        chkBajas.setMinimumSize(new java.awt.Dimension(115, 25));
        chkBajas.setPreferredSize(new java.awt.Dimension(115, 25));
        chkBajas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
        chkBajas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBajasItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pBusqueda.add(chkBajas, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pBody.add(pBusqueda, gridBagConstraints);

        jScrollPane3.setBorder(new javax.swing.border.LineBorder(colorUI, 2, true));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setMinimumSize(new java.awt.Dimension(350, 130));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(350, 130));

        lProveedores.setBackground(colorBG);
        lProveedores.setModel(dlmProveedor);
        lProveedores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lProveedores.setSelectionBackground(colorUI);
        lProveedores.setSelectionForeground(colorBG);
        lProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lProveedoresMousePressed(evt);
            }
        });
        lProveedores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lProveedoresValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lProveedores);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pBody.add(jScrollPane3, gridBagConstraints);

        pInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(colorUI, 3, true), "Facturas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18), colorUI)); // NOI18N
        pInfo.setMinimumSize(new java.awt.Dimension(500, 400));
        pInfo.setOpaque(false);
        pInfo.setPreferredSize(new java.awt.Dimension(500, 400));
        pInfo.setLayout(new java.awt.GridBagLayout());

        tFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "DOC #", "FECHA", "TOTAL", "ABONOS", "PENDIENTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tFacturas.setComponentPopupMenu(popFacturas);
        tFacturas.setRowHeight(30);
        jScrollPane1.setViewportView(tFacturas);
        if (tFacturas.getColumnModel().getColumnCount() > 0) {
            tFacturas.getColumnModel().getColumn(0).setMinWidth(0);
            tFacturas.getColumnModel().getColumn(0).setPreferredWidth(0);
            tFacturas.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pInfo.add(jScrollPane1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Fecha Inicial: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pInfo.add(jLabel3, gridBagConstraints);

        txtFechaInicial.setDate(new Date());
        txtFechaInicial.setDateFormatString("dd-MM-yyyy");
        txtFechaInicial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFechaInicial.setMaximumSize(new java.awt.Dimension(150, 40));
        txtFechaInicial.setMinimumSize(new java.awt.Dimension(150, 40));
        txtFechaInicial.setPreferredSize(new java.awt.Dimension(150, 40));
        txtFechaInicial.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtFechaInicialPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pInfo.add(txtFechaInicial, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Fecha Final: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pInfo.add(jLabel4, gridBagConstraints);

        txtFechaFinal.setDate(new Date());
        txtFechaFinal.setDateFormatString("dd-MM-yyyy");
        txtFechaFinal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFechaFinal.setMaximumSize(new java.awt.Dimension(150, 40));
        txtFechaFinal.setMinimumSize(new java.awt.Dimension(150, 40));
        txtFechaFinal.setPreferredSize(new java.awt.Dimension(150, 40));
        txtFechaFinal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtFechaFinalPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pInfo.add(txtFechaFinal, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pBody.add(pInfo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pMain.add(pBody, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(pMain, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        cargarProveedores ();
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        DialogCompra dialogCompra = new DialogCompra ( new JFrame () , true , manager , lProveedores.getSelectedValue () );
        dialogCompra.setVisible ( true );
        cargarCompras ();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        try {
            manager.getReportes ().reporteFacturasProveedor ( lProveedores.getSelectedValue ().getIdproveedor () ,
                                                              lProveedores.getSelectedValue ().getNombre () ,
                                                              new java.sql.Date ( txtFechaInicial.getDate ().getTime () ) ,
                                                              new java.sql.Date ( txtFechaFinal.getDate ().getTime () ) );
        } catch ( Exception ex ) {
            Logger.getLogger ( PanelCompras.class.getName () ).log ( Level.SEVERE , null , ex );
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void chkBajasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBajasItemStateChanged
        cargarProveedores ();
    }//GEN-LAST:event_chkBajasItemStateChanged

    private void cbxFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFiltroItemStateChanged
        cargarProveedores ();
    }//GEN-LAST:event_cbxFiltroItemStateChanged

    private void lProveedoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lProveedoresValueChanged
        if ( lProveedores.getSelectedIndex () >= 0 ) {
            cargarCompras ();
        }
    }//GEN-LAST:event_lProveedoresValueChanged

    private void lProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lProveedoresMousePressed
        lProveedores.setSelectedIndex ( lProveedores.locationToIndex ( evt.getPoint () ) );
    }//GEN-LAST:event_lProveedoresMousePressed

    private void txtFechaInicialPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtFechaInicialPropertyChange
        cargarCompras ();
    }//GEN-LAST:event_txtFechaInicialPropertyChange

    private void txtFechaFinalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtFechaFinalPropertyChange
        cargarCompras ();
    }//GEN-LAST:event_txtFechaFinalPropertyChange

    private void itemVerDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerDetalleActionPerformed
        ModeloCompra compra = ( ModeloCompra ) tFacturas.getValueAt ( tFacturas.getSelectedRow () , 0 );
        DialogDetalleCompra detalleCompra = new DialogDetalleCompra ( new JFrame () , true , "DETALLE DE COMPRA" , manager , compra );
        detalleCompra.setVisible ( true );
    }//GEN-LAST:event_itemVerDetalleActionPerformed

    private void itemPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPagoActionPerformed
        ModeloCompra compra = ( ModeloCompra ) tFacturas.getValueAt ( tFacturas.getSelectedRow () , 0 );
        double abonos = 0;
        for ( int i = 0 ; i < compra.getAbonos ().size () ; i++ ) {
            abonos += compra.getAbonos ().get ( i ).getPago ().doubleValue ();
        }
        if ( compra.getTotal ().doubleValue () > abonos ) {
            DialogAbono dialogAbono = new DialogAbono ( new JFrame () , true , "NUEVO ABONO" , manager , compra );
            dialogAbono.setVisible ( true );
            cargarCompras ();
        } else {
            Mensajes.mensajeAlert ( "No se pueden realizar mas abonos, factura totalmente pagada!" );
        }

    }//GEN-LAST:event_itemPagoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReporte;
    private javax.swing.JComboBox<String> cbxFiltro;
    private javax.swing.JCheckBox chkBajas;
    private javax.swing.JMenuItem itemPago;
    private javax.swing.JMenuItem itemVerDetalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<ModeloProveedor> lProveedores;
    private javax.swing.JPanel pBody;
    private javax.swing.JPanel pBusqueda;
    private javax.swing.JPanel pComandos;
    private javax.swing.JPanel pInfo;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JPopupMenu popFacturas;
    private javax.swing.JTable tFacturas;
    private com.toedter.calendar.JDateChooser txtFechaFinal;
    private com.toedter.calendar.JDateChooser txtFechaInicial;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    private void cargarProveedores () {
        dlmProveedor.clear ();
        Condition filtro;
        Condition baja;
        switch ( cbxFiltro.getSelectedIndex () ) {
            case 1:
                filtro = PROVEEDOR.NOMBRE.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
                break;
            case 2:
                filtro = PROVEEDOR.DIRECCION.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
                break;
            case 3:
                filtro = PROVEEDOR.TELEFONO.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
                break;
            default:
                filtro = PROVEEDOR.NOMBRE.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" )
                        .or ( PROVEEDOR.DIRECCION.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" ) )
                        .or ( PROVEEDOR.TELEFONO.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" ) );
                break;
        }
        baja = PROVEEDOR.BAJA.eq ( chkBajas.isSelected () );
        try {
            manager.getProveedorDAO ().obtenerLista ( filtro.and ( baja ) ).forEach ( proveedor -> {
                dlmProveedor.addElement ( proveedor );
            } );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
        }

        if ( !dlmProveedor.isEmpty () ) {
            lProveedores.setSelectedIndex ( 0 );
        }
    }

    private void cargarCompras () {
        for ( int i = 0 ; i < tFacturas.getRowCount () ; i++ ) {
            dtmFacturas.removeRow ( i );
            i -= 1;
        }
        java.sql.Date fechaInicio = new java.sql.Date ( txtFechaInicial.getDate ().getTime () );
        java.sql.Date fechaFin = new java.sql.Date ( txtFechaFinal.getDate ().getTime () );
        Condition c1 = COMPRA.IDPROVEEDOR.eq ( lProveedores.getSelectedValue ().getIdproveedor () ).and (
                COMPRA.FECHA.between ( fechaInicio , fechaFin ) );
        try {
            manager.getCompraDAO ().obtenerLista ( c1 ).forEach ( compra -> {
                compra.setProveedor ( lProveedores.getSelectedValue () );
                Condition c2 = DETALLE_COMPRA.IDCOMPRA.eq ( compra.getIdcompra () );
                Condition c3 = PAGOS_COMPRA.IDCOMPRA.eq ( compra.getIdcompra () );
                try {
                    compra.setDetalle ( manager.getDetalleCompraDAO ().obtenerLista ( c2 ) );
                    compra.setAbonos ( manager.getPagoCompraDAO ().obtenerLista ( c3 ) );
                } catch ( Exception ex ) {
                    LOG.log ( Level.SEVERE , null , ex );
                    Mensajes.mensajeError ( "Error: " + ex.getMessage () );
                }
                double abonos = 0;
                for ( int i = 0 ; i < compra.getAbonos ().size () ; i++ ) {
                    abonos += compra.getAbonos ().get ( i ).getPago ().doubleValue ();
                }
                Object[] row = { compra , compra.getNumeroDocumento () , Fechero.dateToString ( compra.getFecha () ) , "$ " + String.format (
                                 "%.2f" , compra.getTotal ().doubleValue () ) , "$ " + String.format ( "%.2f" , abonos ) ,
                                 "$ " + String.format ( "%.2f" , ( compra.getTotal ().doubleValue () - abonos ) ) };
                dtmFacturas.addRow ( row );
            } );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
        if ( tFacturas.getRowCount () > 0 ) {
            tFacturas.changeSelection ( 0 , 1 , false , false );
        }
    }

    private void dibujarTablaFacturas () {
        tFacturas.setGridColor ( colorUI );

        JTableHeader jtableHeader = tFacturas.getTableHeader ();
        jtableHeader.setDefaultRenderer ( new HeaderCellRenderer ( colorUI900 ) );
        tFacturas.setTableHeader ( jtableHeader );

        tFacturas.getColumnModel ().getColumn ( 1 ).setCellRenderer ( new CellRenderer ( "text center" , colorUI ) );
        tFacturas.getColumnModel ().getColumn ( 2 ).setCellRenderer ( new CellRenderer ( "text center" , colorUI ) );
        tFacturas.getColumnModel ().getColumn ( 3 ).setCellRenderer ( new CellRenderer ( "precio" , colorUI ) );
        tFacturas.getColumnModel ().getColumn ( 4 ).setCellRenderer ( new CellRenderer ( "precio" , colorUI ) );
        tFacturas.getColumnModel ().getColumn ( 5 ).setCellRenderer ( new CellRenderer ( "precio" , colorUI ) );
        tFacturas.repaint ();
    }

    private static final Logger LOG = Logger.getLogger ( PanelCompras.class.getName () );

}
