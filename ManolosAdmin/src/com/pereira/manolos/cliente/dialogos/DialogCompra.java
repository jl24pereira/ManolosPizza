package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.cliente.listrenderer.ListaInsumoRenderer;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCompra;
import com.pereira.manolos.negocio.modelos.ModeloDetalleCompra;
import com.pereira.manolos.negocio.modelos.ModeloInsumo;
import com.pereira.manolos.negocio.modelos.ModeloPagoCompra;
import com.pereira.manolos.negocio.modelos.ModeloProveedor;
import com.pereira.manolos.util.CellRenderer;
import com.pereira.manolos.util.ComboUI;
import com.pereira.manolos.util.CostoPromedio;
import com.pereira.manolos.util.HeaderCellRenderer;
import com.pereira.manolos.util.Mensajes;
import java.awt.Component;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractCellEditor;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI900;
import static com.pereira.manolos.datos.database.Tables.INSUMO;

/* @author JL Desk */
@SuppressWarnings ( "serial" )
public class DialogCompra extends javax.swing.JDialog {

    private final DAOManager manager;
    private final ModeloProveedor proveedor;
    private ModeloCompra compra;
    private final List<ModeloDetalleCompra> detalle = new ArrayList<> ();
    private final DefaultListModel<ModeloInsumo> dlmInsumos = new DefaultListModel<> ();

    private final DefaultTableModel dtmDetalleFactura;

    public DialogCompra ( java.awt.Frame parent , boolean modal , DAOManager manager , ModeloProveedor proveedor ) {
        super ( parent , modal );
        this.manager = manager;
        this.proveedor = proveedor;
        initComponents ();
        lInsumos.setCellRenderer ( new ListaInsumoRenderer () );
        this.setLocationRelativeTo ( null );
        dtmDetalleFactura = ( DefaultTableModel ) tDetalleFactura.getModel ();
        dibujarTablas ();
        cargarInsumos ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        popMateriales = new javax.swing.JPopupMenu();
        itemAgregarMaterial = new javax.swing.JMenuItem();
        popDetalleFact = new javax.swing.JPopupMenu();
        itemEliminarMaterial = new javax.swing.JMenuItem();
        pBody = new javax.swing.JPanel();
        pMov = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDetalleFactura = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        lblNumDoc = new javax.swing.JLabel();
        txtNumDoc = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNuevoMaterial = new javax.swing.JButton();
        txtFiltro = new javax.swing.JTextField();
        cbxFiltro = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lInsumos = new javax.swing.JList<>();
        jPanel11 = new javax.swing.JPanel();
        btnFinalizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        itemAgregarMaterial.setText("Agregar a Detalle");
        itemAgregarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarMaterialActionPerformed(evt);
            }
        });
        popMateriales.add(itemAgregarMaterial);

        itemEliminarMaterial.setText("Eliminar de Detalle");
        itemEliminarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarMaterialActionPerformed(evt);
            }
        });
        popDetalleFact.add(itemEliminarMaterial);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 500));
        setPreferredSize(new java.awt.Dimension(850, 500));
        setResizable(false);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                formComponentRemoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pBody.setBackground(colorBG);
        pBody.setLayout(new java.awt.GridBagLayout());

        pMov.setOpaque(false);
        pMov.setLayout(new java.awt.GridBagLayout());

        jPanel4.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridBagLayout());

        tDetalleFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Detalle", "Cantidad", "Precio", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tDetalleFactura.setComponentPopupMenu(popDetalleFact);
        tDetalleFactura.setRowHeight(30);
        tDetalleFactura.getTableHeader().setReorderingAllowed(false);
        tDetalleFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tDetalleFacturaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tDetalleFactura);
        if (tDetalleFactura.getColumnModel().getColumnCount() > 0) {
            tDetalleFactura.getColumnModel().getColumn(0).setMinWidth(0);
            tDetalleFactura.getColumnModel().getColumn(0).setPreferredWidth(0);
            tDetalleFactura.getColumnModel().getColumn(0).setMaxWidth(0);
            tDetalleFactura.getColumnModel().getColumn(2).setMinWidth(100);
            tDetalleFactura.getColumnModel().getColumn(2).setPreferredWidth(100);
            tDetalleFactura.getColumnModel().getColumn(2).setMaxWidth(100);
            tDetalleFactura.getColumnModel().getColumn(2).setCellEditor(new SpinnerEditor());
            tDetalleFactura.getColumnModel().getColumn(2).setCellRenderer(new SpinnerRenderer());
            tDetalleFactura.getColumnModel().getColumn(3).setMinWidth(100);
            tDetalleFactura.getColumnModel().getColumn(3).setPreferredWidth(100);
            tDetalleFactura.getColumnModel().getColumn(3).setMaxWidth(100);
            tDetalleFactura.getColumnModel().getColumn(3).setCellEditor(new SpinnerEditor());
            tDetalleFactura.getColumnModel().getColumn(3).setCellRenderer(new SpinnerRenderer());
            tDetalleFactura.getColumnModel().getColumn(4).setMinWidth(100);
            tDetalleFactura.getColumnModel().getColumn(4).setPreferredWidth(100);
            tDetalleFactura.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel4.add(jScrollPane1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Total");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(jLabel1, gridBagConstraints);

        lblTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTotal.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel4.add(lblTotal, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Tipo de Compra:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 10);
        jPanel4.add(jLabel3, gridBagConstraints);

        txtFecha.setDate(new Date());
        txtFecha.setDateFormatString("dd-MM-yyyy");
        txtFecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFecha.setMinimumSize(new java.awt.Dimension(150, 29));
        txtFecha.setOpaque(false);
        txtFecha.setPreferredSize(new java.awt.Dimension(150, 29));
        txtFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtFechaPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 15);
        jPanel4.add(txtFecha, gridBagConstraints);

        lblNumDoc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNumDoc.setText("(*) Documento #:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 10);
        jPanel4.add(lblNumDoc, gridBagConstraints);

        txtNumDoc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNumDoc.setMinimumSize(new java.awt.Dimension(150, 29));
        txtNumDoc.setPreferredSize(new java.awt.Dimension(150, 29));
        txtNumDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumDocKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 15);
        jPanel4.add(txtNumDoc, gridBagConstraints);

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CREDITO", "CONTADO" }));
        cbxTipo.setMinimumSize(new java.awt.Dimension(150, 30));
        cbxTipo.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 15);
        jPanel4.add(cbxTipo, gridBagConstraints);
        cbxTipo.setUI(new ComboUI(colorBG,colorUI, colorBG));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Fecha de Compra:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 10);
        jPanel4.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pMov.add(jPanel4, gridBagConstraints);

        jPanel1.setMinimumSize(new java.awt.Dimension(380, 144));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 144));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnNuevoMaterial.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNuevoMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_agregar_insumo_N.png"))); // NOI18N
        btnNuevoMaterial.setBorder(null);
        btnNuevoMaterial.setBorderPainted(false);
        btnNuevoMaterial.setContentAreaFilled(false);
        btnNuevoMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoMaterial.setFocusable(false);
        btnNuevoMaterial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoMaterial.setMaximumSize(new java.awt.Dimension(100, 50));
        btnNuevoMaterial.setMinimumSize(new java.awt.Dimension(100, 50));
        btnNuevoMaterial.setPreferredSize(new java.awt.Dimension(100, 50));
        btnNuevoMaterial.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_agregar_insumo_P.png"))); // NOI18N
        btnNuevoMaterial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_agregar_insumo_O.png"))); // NOI18N
        btnNuevoMaterial.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevoMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoMaterialActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel1.add(btnNuevoMaterial, gridBagConstraints);

        txtFiltro.setMaximumSize(new java.awt.Dimension(125, 40));
        txtFiltro.setMinimumSize(new java.awt.Dimension(125, 40));
        txtFiltro.setPreferredSize(new java.awt.Dimension(125, 40));
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel1.add(txtFiltro, gridBagConstraints);

        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar Todo", "Codigo", "Nombre", "Categoria" }));
        cbxFiltro.setMaximumSize(new java.awt.Dimension(125, 40));
        cbxFiltro.setMinimumSize(new java.awt.Dimension(125, 40));
        cbxFiltro.setPreferredSize(new java.awt.Dimension(125, 40));
        cbxFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxFiltroItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel1.add(cbxFiltro, gridBagConstraints);
        cbxFiltro.setUI(new ComboUI(colorBG,colorUI, colorBG));

        jScrollPane3.setBorder(new javax.swing.border.LineBorder(colorUI, 2, true));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setMinimumSize(new java.awt.Dimension(350, 130));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(350, 130));

        lInsumos.setBackground(colorBG);
        lInsumos.setModel(dlmInsumos);
        lInsumos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lInsumos.setComponentPopupMenu(popMateriales);
        lInsumos.setSelectionBackground(colorUI);
        lInsumos.setSelectionForeground(colorBG);
        lInsumos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lInsumosMousePressed(evt);
            }
        });
        lInsumos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lInsumosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lInsumos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(jScrollPane3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pMov.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pBody.add(pMov, gridBagConstraints);

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.GridBagLayout());

        btnFinalizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_N.png"))); // NOI18N
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar.setMaximumSize(new java.awt.Dimension(150, 50));
        btnFinalizar.setMinimumSize(new java.awt.Dimension(150, 50));
        btnFinalizar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnFinalizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_P.png"))); // NOI18N
        btnFinalizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_O.png"))); // NOI18N
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        jPanel11.add(btnFinalizar, gridBagConstraints);

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_N.png"))); // NOI18N
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setMaximumSize(new java.awt.Dimension(150, 50));
        btnCancelar.setMinimumSize(new java.awt.Dimension(150, 50));
        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_P.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_O.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        jPanel11.add(btnCancelar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pBody.add(jPanel11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(pBody, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        guardarCompra ();
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        /*try {
            database.getConexion().rollback();
            database.getConexion().setAutoCommit(true);
            System.out.println("FINALIZANDO TRANSACCION");
        } catch (SQLException ex) {
            Logger.getLogger(DialogCompra.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_formWindowClosing

    private void formComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentRemoved
        // TODO add your handling code here:

    }//GEN-LAST:event_formComponentRemoved

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void txtNumDocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDocKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumDocKeyReleased

    private void txtFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtFechaPropertyChange
        /*try {
            actualizarFechaCompra();
            //txtFechaPago.setDate(txtFecha.getDate());
        } catch (Exception ex) {
            Logger.getLogger(DialogCompra.class.getName()).log(Level.SEVERE, null, ex);
            new Mensajes().mensajeError("Ha ocurrido un error con la transacción!");
        }*/
    }//GEN-LAST:event_txtFechaPropertyChange

    private void tDetalleFacturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDetalleFacturaMousePressed
        // TODO add your handling code here:
        Point point = evt.getPoint ();
        int currentRow = tDetalleFactura.rowAtPoint ( point );
        tDetalleFactura.setRowSelectionInterval ( currentRow , currentRow );
    }//GEN-LAST:event_tDetalleFacturaMousePressed

    private void btnNuevoMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoMaterialActionPerformed
        DialogInsumos dialogInsumos = new DialogInsumos ( new JFrame () , true , "NUEVO INSUMO" , manager , false );
        dialogInsumos.setVisible ( true );
        cargarInsumos ();
    }//GEN-LAST:event_btnNuevoMaterialActionPerformed

    private void cbxFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFiltroItemStateChanged
        // TODO add your handling code here:
        cargarInsumos ();
    }//GEN-LAST:event_cbxFiltroItemStateChanged

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        // TODO add your handling code here:
        cargarInsumos ();
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void itemAgregarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarMaterialActionPerformed
        BigDecimal precio = lInsumos.getSelectedValue ().getCosto ();
        Object[] row = {
            lInsumos.getSelectedValue () ,
            lInsumos.getSelectedValue ().getNombre () ,
            new SpinnerNumberModel ( 1 , 1 , 9999.99 , 1 ) ,
            new SpinnerNumberModel ( precio.doubleValue () , 0.00 , 9999.99 , .1 ) };
        if ( isOnDetalle ( lInsumos.getSelectedValue () ) ) {
            Mensajes.mensajeAlert ( "El material ya se encuentra en detalle de factura!" );
        } else {
            dtmDetalleFactura.addRow ( row );
            calcularTotal ();
        }
    }//GEN-LAST:event_itemAgregarMaterialActionPerformed

    private void itemEliminarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarMaterialActionPerformed
        if ( tDetalleFactura.getSelectedRow () != -1 ) {
            dtmDetalleFactura.removeRow ( tDetalleFactura.getSelectedRow () );
        } else {
            Mensajes.mensajeAlert ( "Seleccione un insumo a eliminar de detalle!" );
        }
    }//GEN-LAST:event_itemEliminarMaterialActionPerformed

    private void lInsumosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lInsumosMousePressed
        lInsumos.setSelectedIndex ( lInsumos.locationToIndex ( evt.getPoint () ) );
        int row = lInsumos.locationToIndex ( evt.getPoint () );
        lInsumos.setSelectedIndex ( row );
    }//GEN-LAST:event_lInsumosMousePressed

    private void lInsumosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lInsumosValueChanged

    }//GEN-LAST:event_lInsumosValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnNuevoMaterial;
    private javax.swing.JComboBox<String> cbxFiltro;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JMenuItem itemAgregarMaterial;
    private javax.swing.JMenuItem itemEliminarMaterial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<ModeloInsumo> lInsumos;
    private javax.swing.JLabel lblNumDoc;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pBody;
    private javax.swing.JPanel pMov;
    private javax.swing.JPopupMenu popDetalleFact;
    private javax.swing.JPopupMenu popMateriales;
    private static javax.swing.JTable tDetalleFactura;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtNumDoc;
    // End of variables declaration//GEN-END:variables

    private void cargarInsumos () {
        dlmInsumos.clear ();
        Condition filtro = INSUMO.NOMBRE.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
        Condition baja = INSUMO.BAJA.equal(false);
        try {
            manager.getInsumoDAO ().obtenerLista ( filtro.and(baja) ).stream ().forEach ( dldmInsumos -> {
                dlmInsumos.addElement ( dldmInsumos );
            } );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            dispose ();
        }
        if ( !dlmInsumos.isEmpty () ) {
            lInsumos.setSelectedIndex ( 0 );
        }
    }

    private void cargarTablaAbonos () {
        /*for (int i = 0; i < tAbonos.getRowCount(); i++) {
            dtmAbonos.removeRow(i);
            i -= 1;
        }

        SelectQuery<Record> query = create.selectQuery();
        query.addFrom(PAGOS_COMPRA);
        query.addConditions(PAGOS_COMPRA.IDCOMPRA.equal(idfactura));
        query.addOrderBy(PAGOS_COMPRA.FECHA.asc());
        Result<Record> result = query.fetch();
        int n = 0;
        for (Record r : result) {
            n++;
            Object[] row = {r.getValue(PAGOS_COMPRA.IDCOMPRA), n, r.getValue(PAGOS_COMPRA.FECHA), r.getValue(PAGOS_COMPRA.PAGO)};
            dtmAbonos.addRow(row);
        }

        if (tAbonos.getRowCount() > 0) {
            tAbonos.changeSelection(0, 1, false, false);
        }
    }

    private void dibujarTablas() {
        tDetalleFactura.setGridColor(colorUI);
        JTableHeader headerDetalle = tDetalleFactura.getTableHeader();
        headerDetalle.setDefaultRenderer(new HeaderCellRenderer(colorUI));
        tDetalleFactura.setTableHeader(headerDetalle);

        tDetalleFactura.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("text", new Color(163, 190, 166)));
        tDetalleFactura.getColumnModel().getColumn(4).setCellRenderer(new CellRenderer("text center", new Color(163, 190, 166)));

        tDetalleFactura.repaint();

        tAbonos.setGridColor(colorUI);
        JTableHeader headerAbonos = tAbonos.getTableHeader();
        headerAbonos.setDefaultRenderer(new HeaderCellRenderer(colorUI));
        tAbonos.setTableHeader(headerAbonos);

        tAbonos.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("text center", new Color(163, 190, 166)));
        tAbonos.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer("text center", new Color(163, 190, 166)));
        tAbonos.getColumnModel().getColumn(3).setCellRenderer(new CellRenderer("precio", new Color(163, 190, 166)));*/

    }

    private void pasarNuevoMaterial ( int idinventario ) throws Exception {
        /*Record record = create.select(
                INVENTARIO.IDINVENTARIO,
                INVENTARIO.CODIGO,
                INVENTARIO.NOMBRE,
                INVENTARIO.PRECIOCOMPRA,
                INVENTARIO.EXISTENCIA)
                .from(INVENTARIO)
                .where(INVENTARIO.IDINVENTARIO.equal(idinventario))
                .fetchOne();
        BigDecimal precio = (BigDecimal) record.getValue(INVENTARIO.PRECIOCOMPRA);
        Object [] row = {
            record.getValue(INVENTARIO.IDINVENTARIO),
            record.getValue(INVENTARIO.CODIGO),
            record.getValue(INVENTARIO.NOMBRE),
            new SpinnerNumberModel(1, 1, 999.99, 1),
            new SpinnerNumberModel(precio.doubleValue(), 0.00, 9999.99, .1)};
        if(isOnDetalle(idinventario)){
            new Mensajes().mensajeAlert("El material ya se encuentra en detalle de factura!");
        }else{
            dtmDetalleFactura.addRow(row);
            agregarMaterialADetalle(idinventario,new BigDecimal(0.00));
        }*/
    }

    private boolean isOnDetalle ( ModeloInsumo insumo ) {
        boolean encuentra = false;
        for ( int i = 0 ; i < tDetalleFactura.getRowCount () ; i++ ) {
            ModeloInsumo enTabla = ( ModeloInsumo ) tDetalleFactura.getValueAt ( i , 0 );
            if ( enTabla == insumo ) {
                encuentra = true;
            }
        }
        return encuentra;
    }

    private void eliminarMaterialADetalle () throws Exception {
        /*int idmaterial = (int) tDetalleFactura.getValueAt(tDetalleFactura.getSelectedRow(), 0);
        create.delete(DETALLE_COMPRA)
                .where((DETALLE_COMPRA.IDCOMPRA.equal(idfactura)).and(DETALLE_COMPRA.IDINSUMO.equal(idmaterial)))
                .execute();
        dtmDetalleFactura.removeRow(tDetalleFactura.getSelectedRow());
        calcularTotal();*/
    }

    private void calcularTotal () {
        double cantUnit = 0;
        double precioUnit = 0;
        double sumatoria = 0.00;
        for ( int i = 0 ; i < tDetalleFactura.getRowCount () ; i++ ) {
            SpinnerNumberModel cantidad = ( SpinnerNumberModel ) tDetalleFactura.getValueAt ( i , 2 );
            SpinnerNumberModel precio = ( SpinnerNumberModel ) tDetalleFactura.getValueAt ( i , 3 );
            cantUnit = ( double ) cantidad.getValue ();
            precioUnit = ( double ) precio.getValue ();
            dtmDetalleFactura.setValueAt ( ( String.format ( "%.4f" , ( cantUnit * precioUnit ) ) ) , i , 4 );
            sumatoria = sumatoria + ( cantUnit * precioUnit );
        }
        String total = String.format ( "%.2f" , sumatoria );
        lblTotal.setText ( total );
    }

    private boolean isFacturaRepetida () {
        /*if (!TRANSACCION.equals(txtNumDoc.getText())) {
            int existe = create.select(count())
                    .from(COMPRA)
                    .where(COMPRA.NUMERODOCUMENTO.equal(txtNumDoc.getText()).and(COMPRA.IDPROVEEDOR.equal(this.idproveedor)))
                    .fetchOne(count(), int.class);
            System.out.println("pedidos: " + existe);
            return existe != 0;
        } else {
            return false;
        }*/
        return false;
    }

    private void dibujarTablas () {
        tDetalleFactura.setGridColor ( colorUI900 );
        JTableHeader jtableHeader = tDetalleFactura.getTableHeader ();
        jtableHeader.setDefaultRenderer ( new HeaderCellRenderer ( colorUI900 ) );
        tDetalleFactura.setTableHeader ( jtableHeader );
        tDetalleFactura.getColumnModel ().getColumn ( 1 ).setCellRenderer ( new CellRenderer ( "text" , colorUI ) );
        tDetalleFactura.getColumnModel ().getColumn ( 4 ).setCellRenderer ( new CellRenderer ( "precio" , colorUI ) );
        tDetalleFactura.repaint ();

    }

    private void guardarCompra () {
        for ( int i = 0 ; i < tDetalleFactura.getRowCount () ; i++ ) {
            SpinnerNumberModel cantidad = ( SpinnerNumberModel ) tDetalleFactura.getValueAt ( i , 2 );
            SpinnerNumberModel precio = ( SpinnerNumberModel ) tDetalleFactura.getValueAt ( i , 3 );
            double cantUnit = ( double ) cantidad.getValue ();
            double precioUnit = ( double ) precio.getValue ();
            detalle.add ( new ModeloDetalleCompra ( compra , ( ModeloInsumo ) tDetalleFactura.getValueAt ( i , 0 ) , cantUnit , new BigDecimal (
                                                    precioUnit ) ) );
        }
        compra = new ModeloCompra ( proveedor , txtNumDoc.getText () , txtFecha.getDate () , cbxTipo.getSelectedItem ().toString () ,
                                    new BigDecimal ( lblTotal.getText () ) );
        if ( detalle.isEmpty () ) {
            Mensajes.mensajeAlert ( "No hay detalle!" );
        } else {
            try {
                manager.getCompraDAO ().insertar ( compra );
                if ( compra.getTipoDocumento ().equals ( "CONTADO" ) ) {
                    ModeloPagoCompra abono = new ModeloPagoCompra ( compra , compra.getFecha () , compra.getTotal () );
                    manager.getPagoCompraDAO ().insertar ( abono );
                }
                compra.setDetalle ( detalle );
                compra.getDetalle ().stream ().forEach ( detalleCompra -> {
                    try {
                        detalleCompra.setCompra ( compra );
                        manager.getDetalleCompraDAO ().insertar ( detalleCompra ); //Almacenando cada detalle de compra
                        ModeloInsumo insumo = detalleCompra.getInsumo ();
                        CostoPromedio costoPromedio = new CostoPromedio ( detalleCompra.getCantidad () , detalleCompra.getPrecio ().doubleValue () ,
                                                                          insumo.getStock () , insumo.getCosto ().doubleValue () );
                        insumo.setStock ( costoPromedio.getTotalStock () );
                        insumo.setCosto ( new BigDecimal ( costoPromedio.calcularCosto () ) );
                        System.out.println ( "Stock actual: " + insumo.getStock () );
                        manager.getInsumoDAO ().modificar ( insumo );
                    } catch ( Exception ex ) {
                        Logger.getLogger ( DialogCompra.class.getName () ).log ( Level.SEVERE , null , ex );
                        Mensajes.mensajeError ( "Error: " + ex.getMessage () );
                        dispose ();
                    }
                } );
                Mensajes.mensajeOk ( "Registro almacenado correctamente!" );
            } catch ( Exception ex ) {
                Logger.getLogger ( DialogCompra.class.getName () ).log ( Level.SEVERE , null , ex );
                Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            } finally {
                dispose ();
            }
        }

    }

    @SuppressWarnings ( "PublicInnerClass" )
    public class SpinnerEditor extends AbstractCellEditor implements TableCellEditor {

        protected JSpinner spinner;

        public SpinnerEditor () {
            spinner = new JSpinner ();
            spinner.setOpaque ( true );
            spinner.addChangeListener ( new ChangeListener () {
                @Override
                public void stateChanged ( ChangeEvent ce ) {
                    calcularTotal ();
                }
            } );
        }

        @Override
        public Object getCellEditorValue () {
            SpinnerModel sm = spinner.getModel ();
            return sm;
        }

        @Override
        public Component getTableCellEditorComponent ( JTable jtable , Object value , boolean bln , int i , int i1 ) {
            spinner.setModel ( ( SpinnerModel ) value );
            return spinner;
        }

    }

    @SuppressWarnings ( "PublicInnerClass" )
    public class SpinnerRenderer extends JSpinner implements TableCellRenderer {

        public SpinnerRenderer () {
            //setUI(new SpinnerUI(colorUI, colorUIpressed, colorBG));
        }

        @Override
        public Component getTableCellRendererComponent ( JTable jtable , Object value , boolean bln , boolean bln1 , int i , int i1 ) {
            setModel ( ( SpinnerModel ) value );
            return this;
        }

    }

    private static final Logger LOG = Logger.getLogger ( DialogCompra.class.getName () );
    /*int row = lInsumos.locationToIndex ( evt.getPoint () );
        lInsumos.setSelectedIndex ( row );*/
}
