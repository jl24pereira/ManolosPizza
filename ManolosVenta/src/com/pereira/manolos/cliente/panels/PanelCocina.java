package com.pereira.manolos.cliente.panels;

import com.mrlonee.swing.animation.AnimatedPanel;
import com.pereira.manolos.cliente.listarenderer.PorcionRenderer;
import com.pereira.manolos.cliente.listarenderer.RecetaRenderer;
import com.pereira.manolos.cliente.main.PanelInicio;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloInsumo;
import com.pereira.manolos.negocio.modelos.ModeloProducto;
import com.pereira.manolos.negocio.modelos.ModeloReceta;
import com.pereira.manolos.util.AgregarPanel;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.SpinnerUI;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.Principal.pBody;
import static com.pereira.manolos.datos.database.Tables.DETALLE_RECETA;
import static com.pereira.manolos.datos.database.Tables.PRODUCTO;
import static com.pereira.manolos.datos.database.Tables.RECETA;

public class PanelCocina extends AnimatedPanel {

    private final DAOManager manager;
    private DefaultListModel<ModeloReceta> dlmRecetas = new DefaultListModel<> ();
    private DefaultListModel<ModeloProducto> dlmPorciones = new DefaultListModel<> ();
    private final AgregarPanel agregar = new AgregarPanel ();

    public PanelCocina ( DAOManager manager ) {
        this.manager = manager;
        initComponents ();
        lReceta.setCellRenderer ( new RecetaRenderer () );
        lPorciones.setCellRenderer ( new PorcionRenderer () );
        agregar.insertarPanel ( panelLista , panelReceta );
        lReceta.setModel ( dlmRecetas );
        lPorciones.setModel ( dlmPorciones );
        listarRecetas ();
        listarPorciones ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelReceta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lReceta = new javax.swing.JList<>();
        txtFiltroReceta = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        panelPorciones = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lPorciones = new javax.swing.JList<>();
        txtFiltroProducto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        chkReceta = new javax.swing.JRadioButton();
        chkPorciones = new javax.swing.JRadioButton();
        panelLista = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        spCantidad = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblUnidad3 = new javax.swing.JLabel();
        lblStockFinal = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        lblUnidad1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblRendimiento = new javax.swing.JLabel();
        lblUnidad4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        panelReceta.setBackground(new java.awt.Color(0, 153, 153));
        panelReceta.setOpaque(false);
        panelReceta.setLayout(new java.awt.GridBagLayout());

        lReceta.setSelectionBackground(new java.awt.Color(139, 195, 74));
        lReceta.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lRecetaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lReceta);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelReceta.add(jScrollPane1, gridBagConstraints);

        txtFiltroReceta.setMinimumSize(new java.awt.Dimension(200, 30));
        txtFiltroReceta.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        panelReceta.add(txtFiltroReceta, gridBagConstraints);

        panelPorciones.setBackground(new java.awt.Color(0, 153, 153));
        panelPorciones.setOpaque(false);
        panelPorciones.setLayout(new java.awt.GridBagLayout());

        lPorciones.setSelectionBackground(new java.awt.Color(139, 195, 74));
        lPorciones.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lPorcionesValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lPorciones);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelPorciones.add(jScrollPane3, gridBagConstraints);

        txtFiltroProducto.setMinimumSize(new java.awt.Dimension(200, 30));
        txtFiltroProducto.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        panelPorciones.add(txtFiltroProducto, gridBagConstraints);

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 195, 74), 10));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Preparar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        buttonGroup1.add(chkReceta);
        chkReceta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        chkReceta.setSelected(true);
        chkReceta.setText("Receta");
        chkReceta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Unchecked Checkbox-48.png"))); // NOI18N
        chkReceta.setRolloverEnabled(false);
        chkReceta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Checked Checkbox-48.png"))); // NOI18N
        chkReceta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkRecetaItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 0);
        jPanel1.add(chkReceta, gridBagConstraints);

        buttonGroup1.add(chkPorciones);
        chkPorciones.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        chkPorciones.setText("Porciones");
        chkPorciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Unchecked Checkbox-48.png"))); // NOI18N
        chkPorciones.setRolloverEnabled(false);
        chkPorciones.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Checked Checkbox-48.png"))); // NOI18N
        chkPorciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkPorcionesItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 0);
        jPanel1.add(chkPorciones, gridBagConstraints);

        panelLista.setOpaque(false);
        panelLista.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(panelLista, gridBagConstraints);

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_atras_normal.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_atras_pressed.png"))); // NOI18N
        btnAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_atras_over.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 0);
        jPanel1.add(btnAtras, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        add(jPanel1, gridBagConstraints);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        spCantidad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        spCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spCantidad.setMinimumSize(new java.awt.Dimension(125, 40));
        spCantidad.setPreferredSize(new java.awt.Dimension(125, 40));
        spCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spCantidadStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel2.add(spCantidad, gridBagConstraints);
        spCantidad.setUI(new SpinnerUI(Color.WHITE,new Color(139, 195, 74),Color.BLACK));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Preparar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        jPanel2.add(jLabel3, gridBagConstraints);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_preparar_normal.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(150, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_preparar_pressed.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_preparar_over.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        jPanel2.add(jButton1, gridBagConstraints);

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setText("Medida");
        lblNombre.setMaximumSize(new java.awt.Dimension(120, 22));
        lblNombre.setMinimumSize(new java.awt.Dimension(120, 22));
        lblNombre.setPreferredSize(new java.awt.Dimension(120, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 20);
        jPanel2.add(lblNombre, gridBagConstraints);

        lblUnidad3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUnidad3.setText("Medida");
        lblUnidad3.setMaximumSize(new java.awt.Dimension(120, 22));
        lblUnidad3.setMinimumSize(new java.awt.Dimension(120, 22));
        lblUnidad3.setPreferredSize(new java.awt.Dimension(120, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 20, 10);
        jPanel2.add(lblUnidad3, gridBagConstraints);

        lblStockFinal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblStockFinal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStockFinal.setText("##");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 0);
        jPanel2.add(lblStockFinal, gridBagConstraints);

        lblStock.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblStock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStock.setText("##");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 0);
        jPanel2.add(lblStock, gridBagConstraints);

        lblUnidad1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUnidad1.setText("Medida");
        lblUnidad1.setMaximumSize(new java.awt.Dimension(120, 22));
        lblUnidad1.setMinimumSize(new java.awt.Dimension(120, 22));
        lblUnidad1.setPreferredSize(new java.awt.Dimension(120, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 10, 20);
        jPanel2.add(lblUnidad1, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Stock Actual:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 10, 10);
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Stock Final:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 20, 10);
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Rendimiento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        jPanel2.add(jLabel6, gridBagConstraints);

        lblRendimiento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblRendimiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRendimiento.setText("##");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(lblRendimiento, gridBagConstraints);

        lblUnidad4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUnidad4.setText("Medida");
        lblUnidad4.setMaximumSize(new java.awt.Dimension(120, 22));
        lblUnidad4.setMinimumSize(new java.awt.Dimension(120, 22));
        lblUnidad4.setPreferredSize(new java.awt.Dimension(120, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 20);
        jPanel2.add(lblUnidad4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(139, 195, 74));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setText("Cocina");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 0);
        jPanel3.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(jPanel3, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void chkRecetaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkRecetaItemStateChanged
        if ( chkReceta.isSelected () ) {
            agregar.insertarPanel ( panelLista , panelReceta );
        }
        verificarSeleccion ();
    }//GEN-LAST:event_chkRecetaItemStateChanged

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        agregar.insertarPanelMain ( pBody , new PanelInicio ( manager ) );
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void chkPorcionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkPorcionesItemStateChanged
        if ( chkPorciones.isSelected () ) {
            agregar.insertarPanel ( panelLista , panelPorciones );
        }
        verificarSeleccion ();
    }//GEN-LAST:event_chkPorcionesItemStateChanged

    private void lRecetaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lRecetaValueChanged
        if ( chkReceta.isSelected () ) {
            if ( !dlmRecetas.isEmpty () ) {
                verStockReceta ();
            }
        }
    }//GEN-LAST:event_lRecetaValueChanged

    private void spCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spCantidadStateChanged
        calcularStock ();
    }//GEN-LAST:event_spCantidadStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ModeloReceta receta;
        if ( chkReceta.isSelected () ) {
            receta = lReceta.getSelectedValue ();
            try {
                receta.setStock ( Double.parseDouble ( lblStockFinal.getText () ) );
                manager.getRecetaDAO ().modificar ( receta );
                descontarReceta ( receta , ( int ) spCantidad.getValue () , 1 );
            } catch ( Exception ex ) {
                Logger.getLogger ( PanelCocina.class.getName () ).log ( Level.SEVERE , null , ex );
            }
            listarRecetas ();
        } else {
            try {
                descontarReceta ( lPorciones.getSelectedValue ().getReceta () , ( int ) spCantidad.getValue () , lPorciones.getSelectedValue ().
                                  getDescuento () );
                lPorciones.getSelectedValue ().setStock ( Double.parseDouble ( lblStockFinal.getText () ) );
                manager.getProductoDAO ().modificar ( lPorciones.getSelectedValue () );
            } catch ( Exception ex ) {
                Logger.getLogger ( PanelCocina.class.getName () ).log ( Level.SEVERE , null , ex );
            }
            listarPorciones ();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lPorcionesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lPorcionesValueChanged
        if ( chkPorciones.isSelected () ) {
            if ( !dlmPorciones.isEmpty () ) {
                verStockPorciones ();
            }
        }
    }//GEN-LAST:event_lPorcionesValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton chkPorciones;
    private javax.swing.JRadioButton chkReceta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<ModeloProducto> lPorciones;
    private javax.swing.JList<ModeloReceta> lReceta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRendimiento;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblStockFinal;
    private javax.swing.JLabel lblUnidad1;
    private javax.swing.JLabel lblUnidad3;
    private javax.swing.JLabel lblUnidad4;
    private javax.swing.JPanel panelLista;
    private javax.swing.JPanel panelPorciones;
    private javax.swing.JPanel panelReceta;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JTextField txtFiltroProducto;
    private javax.swing.JTextField txtFiltroReceta;
    // End of variables declaration//GEN-END:variables

    private void listarRecetas () {

        dlmRecetas.clear ();
        Condition filtro = RECETA.NOMBRE.likeIgnoreCase ( "%" + txtFiltroReceta.getText () + "%" );
        Condition baja = RECETA.BAJA.eq ( false );
        Condition c = RECETA.TIPORECETA.eq ( "COMPLEMENTARIA" );
        try {
            manager.getRecetaDAO ().obtenerLista ( filtro.and ( baja ).and ( c ) ).forEach ( receta -> {
                dlmRecetas.addElement ( receta );
            } );
        } catch ( Exception ex ) {
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
        if ( !dlmRecetas.isEmpty () ) {
            lReceta.setSelectedIndex ( 0 );
            verStockReceta ();
        }
    }

    private void listarPorciones () {
        dlmPorciones.clear ();
        Condition a = PRODUCTO.NOMBRE.likeIgnoreCase ( "%" + txtFiltroProducto.getText () + "%" );
        Condition b = PRODUCTO.TIPO.eq ( "P" );
        Condition c = PRODUCTO.BAJA.eq ( false );
        try {
            manager.getProductoDAO ().obtenerLista ( a.and ( b ).and ( c ) ).forEach ( p -> {
                dlmPorciones.addElement ( p );
            } );
        } catch ( Exception ex ) {
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
        if ( !dlmPorciones.isEmpty () ) {
            lPorciones.setSelectedIndex ( 0 );
        }

    }

    private void verStockReceta () {
        if ( !lReceta.isSelectionEmpty () ) {
            spCantidad.setValue ( 1 );
            lblStock.setText ( "" + lReceta.getSelectedValue ().getStock () );
            lblRendimiento.setText ( "" + lReceta.getSelectedValue ().getRendimiento () );
            calcularStock ();
            try {
                lblUnidad1.setText ( manager.getUnidadDAO ().getUnidadByID ( lReceta.getSelectedValue ().getUnidad ().getIdunidad () ) );
                lblNombre.setText ( lReceta.getSelectedValue ().getNombre () );
                lblUnidad3.setText ( lblUnidad1.getText () );
                lblUnidad4.setText ( lblUnidad1.getText () );
            } catch ( Exception ex ) {
                Logger.getLogger ( PanelCocina.class.getName () ).log ( Level.SEVERE , null , ex );
            }

        }
    }

    private void verStockPorciones () {
        if ( !lPorciones.isSelectionEmpty () ) {
            ModeloProducto producto = lPorciones.getSelectedValue ();
            spCantidad.setValue ( 1 );
            lblStock.setText ( "" + producto.getStock () );
            lblRendimiento.setText ( "" + producto.getPorciones () );
            calcularStock ();
            lblUnidad1.setText ( "PORCION/ES" );
            lblNombre.setText ( producto.getNombre () );
            lblUnidad3.setText ( lblUnidad1.getText () );
            lblUnidad4.setText ( lblUnidad1.getText () );
        }
    }

    private void calcularStock () {
        int cantidad = ( int ) spCantidad.getValue ();
        double rendimiento = Double.parseDouble ( lblRendimiento.getText () );
        double stock = Double.parseDouble ( lblStock.getText () );
        stock += ( cantidad * rendimiento );
        lblStockFinal.setText ( "" + stock );
    }

    private void verificarSeleccion () {
        if ( chkReceta.isSelected () ) {
            listarRecetas ();
        } else {
            listarPorciones ();
        }
    }

    private void descontarReceta ( ModeloReceta receta , int cantidad , double descuento ) throws Exception {
        Condition c = DETALLE_RECETA.IDRECETA.eq ( receta.getIdreceta () );
        manager.getDetalleRecetaDAO ().obtenerLista ( c ).forEach ( dReceta -> {
            if ( dReceta.getTipo ().equals ( "INSUMO" ) ) {
                try {
                    descontarInsumo ( dReceta.getIngredienteInsumo () , cantidad , dReceta.getDescargo () * descuento );
                } catch ( Exception ex ) {
                    //LOG.log ( Level.SEVERE , null , ex );
                }
            } else {
                double stock = dReceta.getIngredienteReceta ().getStock ();
                stock -= ( cantidad * descuento );
                dReceta.getIngredienteReceta ().setStock ( stock );
                try {
                    manager.getRecetaDAO ().modificar ( dReceta.getIngredienteReceta () );
                } catch ( Exception ex ) {
                    //LOG.log ( Level.SEVERE , null , ex );
                }
            }
        } );

    }

    private void descontarInsumo ( ModeloInsumo insumo , int cantidad , double descuento ) throws Exception {
        double stock = insumo.getStock () - ( cantidad * descuento );
        insumo.setStock ( stock );
        manager.getInsumoDAO ().modificar ( insumo );
    }

}
