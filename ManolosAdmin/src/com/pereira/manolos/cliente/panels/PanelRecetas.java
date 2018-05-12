package com.pereira.manolos.cliente.panels;

import com.mrlonee.swing.animation.AnimatedPanel;
import com.pereira.manolos.cliente.dialogos.DialogIngrediente;
import com.pereira.manolos.cliente.dialogos.DialogReceta;
import com.pereira.manolos.cliente.listrenderer.ListaDetalleRecetaRenderer;
import com.pereira.manolos.cliente.listrenderer.ListaRecetaRenderer;
import com.pereira.manolos.datos.database.Tables;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloDetalleReceta;
import com.pereira.manolos.negocio.modelos.ModeloReceta;
import com.pereira.manolos.util.ComboUI;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.SampleTableModel;
import com.pereira.manolos.util.TabbedPanelUI;
import java.awt.GridBagConstraints;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.Chart;
import javafx.scene.chart.NumberAxis;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.event.TableModelEvent;
import javax.swing.table.TableModel;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.datos.database.Tables.RECETA;

/*@author Jose Luis */
@SuppressWarnings ( "serial" )
public class PanelRecetas extends AnimatedPanel {

    private final DAOManager manager;
    private final DefaultListModel<ModeloReceta> dlmReceta;
    private final DefaultListModel<ModeloDetalleReceta> dlmDetalle;

    private final JFXPanel jfxPanel = new JFXPanel ();
    //private ObservableList<BarChart.Series> bcData;
    private Chart chart;
    private static SampleTableModel tableModel;

    public PanelRecetas ( DAOManager manager ) {
        this.manager = manager;
        dlmReceta = new DefaultListModel<> ();
        dlmDetalle = new DefaultListModel<> ();
        this.setAnimationType ( AnimatedPanel.AnimationType.SlideAnimationFromTop );
        tableModel = new SampleTableModel ();
        initComponents ();
        lRecetas.setCellRenderer ( new ListaRecetaRenderer () );
        lDetalle.setCellRenderer ( new ListaDetalleRecetaRenderer () );
        cargarRecetas ();
        GridBagConstraints gbcChart = new GridBagConstraints ();
        gbcChart.fill = java.awt.GridBagConstraints.BOTH;
        gbcChart.weightx = 1.0;
        gbcChart.weighty = 1.0;
        pGrafico.add ( jfxPanel , gbcChart );
        Platform.setImplicitExit ( false );
        Platform.runLater ( () -> {
            createScene ();
        } );
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        popReceta = new javax.swing.JPopupMenu();
        itemEditar = new javax.swing.JMenuItem();
        itemBaja = new javax.swing.JMenuItem();
        popIngrediente = new javax.swing.JPopupMenu();
        itemEditar1 = new javax.swing.JMenuItem();
        itemEliminar = new javax.swing.JMenuItem();
        pMain = new javax.swing.JPanel();
        pBody = new javax.swing.JPanel();
        tp = new javax.swing.JTabbedPane();
        pIngredientes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lDetalle = new javax.swing.JList<>();
        btnGuardar2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblCostoInv = new javax.swing.JLabel();
        pCostos = new javax.swing.JPanel();
        pGrafico = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCostos = new javax.swing.JTable();
        pBusqueda = new javax.swing.JPanel();
        txtFiltro = new javax.swing.JTextField();
        cbxFiltro = new javax.swing.JComboBox<>();
        chkBajas = new javax.swing.JCheckBox();
        chkBajoStock = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        lRecetas = new javax.swing.JList<>();
        pTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pComandos = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();

        itemEditar.setText("Editar Receta");
        itemEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarActionPerformed(evt);
            }
        });
        popReceta.add(itemEditar);

        itemBaja.setText("Baja Receta");
        itemBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBajaActionPerformed(evt);
            }
        });
        popReceta.add(itemBaja);

        itemEditar1.setText("Editar Receta");
        itemEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditar1ActionPerformed(evt);
            }
        });
        popIngrediente.add(itemEditar1);

        itemEliminar.setText("Eliminar Ingrediente");
        itemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarActionPerformed(evt);
            }
        });
        popIngrediente.add(itemEliminar);

        setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(new java.awt.Color(102, 102, 102));
        pMain.setOpaque(false);
        pMain.setLayout(new java.awt.GridBagLayout());

        pBody.setOpaque(false);
        pBody.setLayout(new java.awt.GridBagLayout());

        pIngredientes.setBackground(new java.awt.Color(255, 255, 255));
        pIngredientes.setLayout(new java.awt.GridBagLayout());

        jScrollPane2.setMinimumSize(new java.awt.Dimension(250, 166));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(250, 166));

        lDetalle.setBackground(colorBG);
        lDetalle.setBorder(new javax.swing.border.LineBorder(colorUI, 2, true));
        lDetalle.setModel(dlmDetalle);
        lDetalle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lDetalle.setComponentPopupMenu(popIngrediente);
        lDetalle.setSelectionBackground(colorUI);
        lDetalle.setSelectionForeground(colorBG);
        jScrollPane2.setViewportView(lDetalle);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        pIngredientes.add(jScrollPane2, gridBagConstraints);

        btnGuardar2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_agregar_N.png"))); // NOI18N
        btnGuardar2.setBorder(null);
        btnGuardar2.setBorderPainted(false);
        btnGuardar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar2.setMaximumSize(new java.awt.Dimension(100, 50));
        btnGuardar2.setMinimumSize(new java.awt.Dimension(100, 50));
        btnGuardar2.setPreferredSize(new java.awt.Dimension(100, 50));
        btnGuardar2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_agregar_P.png"))); // NOI18N
        btnGuardar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_agregar_O.png"))); // NOI18N
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        pIngredientes.add(btnGuardar2, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setText("Costo Total Inventarios:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 5);
        pIngredientes.add(jLabel7, gridBagConstraints);

        lblCostoInv.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblCostoInv.setText("$ 00.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 10, 10);
        pIngredientes.add(lblCostoInv, gridBagConstraints);

        tp.addTab("Ingredientes", pIngredientes);

        pCostos.setBackground(new java.awt.Color(255, 255, 255));
        pCostos.setLayout(new java.awt.GridBagLayout());

        pGrafico.setBackground(colorBG);
        pGrafico.setMinimumSize(new java.awt.Dimension(250, 0));
        pGrafico.setOpaque(false);
        pGrafico.setPreferredSize(new java.awt.Dimension(250, 0));
        pGrafico.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pCostos.add(pGrafico, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Costo Total:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pCostos.add(jLabel5, gridBagConstraints);

        lblCosto.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblCosto.setText("$ 00.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pCostos.add(lblCosto, gridBagConstraints);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(25, 85));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(25, 85));

        tCostos.setModel(tableModel);
        tCostos.setRowHeight(20);
        tCostos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tCostos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pCostos.add(jScrollPane1, gridBagConstraints);

        tp.addTab("Costos", pCostos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pBody.add(tp, gridBagConstraints);
        tp.setUI(new TabbedPanelUI(colorUI,colorBG));

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
        chkBajas.setOpaque(true);
        chkBajas.setPreferredSize(new java.awt.Dimension(115, 25));
        chkBajas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
        chkBajas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBajasItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pBusqueda.add(chkBajas, gridBagConstraints);

        chkBajoStock.setBackground(new java.awt.Color(255, 255, 255));
        chkBajoStock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkBajoStock.setForeground(colorUI);
        chkBajoStock.setText(" Bajo Stock");
        chkBajoStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkBajoStock.setFocusable(false);
        chkBajoStock.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkBajoStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
        chkBajoStock.setMaximumSize(new java.awt.Dimension(135, 25));
        chkBajoStock.setMinimumSize(new java.awt.Dimension(135, 25));
        chkBajoStock.setPreferredSize(new java.awt.Dimension(135, 25));
        chkBajoStock.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
        chkBajoStock.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBajoStockItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pBusqueda.add(chkBajoStock, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pBody.add(pBusqueda, gridBagConstraints);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setMinimumSize(new java.awt.Dimension(350, 134));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(350, 134));

        lRecetas.setBackground(colorBG);
        lRecetas.setBorder(new javax.swing.border.LineBorder(colorUI, 2, true));
        lRecetas.setModel(dlmReceta);
        lRecetas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lRecetas.setComponentPopupMenu(popReceta);
        lRecetas.setSelectionBackground(colorUI);
        lRecetas.setSelectionForeground(colorBG);
        lRecetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lRecetasMousePressed(evt);
            }
        });
        lRecetas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lRecetasValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lRecetas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pBody.add(jScrollPane3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pMain.add(pBody, gridBagConstraints);

        pTitulo.setBackground(colorUI);
        pTitulo.setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(colorBG);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(colorBG);
        jLabel1.setText("Recetas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 0);
        pTitulo.add(jLabel1, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e86d(0)_64.png"))); // NOI18N
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
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pComandos.add(btnEditar, gridBagConstraints);

        btnBaja.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_baja_normal.png"))); // NOI18N
        btnBaja.setBorder(null);
        btnBaja.setBorderPainted(false);
        btnBaja.setContentAreaFilled(false);
        btnBaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBaja.setFocusable(false);
        btnBaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBaja.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_baja_pressed.png"))); // NOI18N
        btnBaja.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_baja_over.png"))); // NOI18N
        btnBaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pComandos.add(btnBaja, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(pMain, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void itemEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarActionPerformed
        DialogReceta dialogReceta = new DialogReceta ( new JFrame () , true , "EDITAR RECETA" , manager , lRecetas.getSelectedValue () );
        dialogReceta.setVisible ( true );
        cargarRecetas ();
    }//GEN-LAST:event_itemEditarActionPerformed

    private void itemBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBajaActionPerformed

    }//GEN-LAST:event_itemBajaActionPerformed

    private void chkBajoStockItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBajoStockItemStateChanged
        cargarRecetas ();
    }//GEN-LAST:event_chkBajoStockItemStateChanged

    private void lRecetasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lRecetasMousePressed
        lRecetas.setSelectedIndex ( lRecetas.locationToIndex ( evt.getPoint () ) );
    }//GEN-LAST:event_lRecetasMousePressed

    private void itemEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditar1ActionPerformed

    private void itemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarActionPerformed
        try {
            manager.getDetalleRecetaDAO ().eliminar ( lDetalle.getSelectedValue () );
            manager.getRecetaDAO ().actualizarAllCosto ( Collections.list ( dlmReceta.elements () ) );
            Mensajes.mensajeOk ( "Registro eliminado exitosamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            cargarRecetas ();
        }
    }//GEN-LAST:event_itemEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        DialogReceta dialogReceta = new DialogReceta ( new JFrame () , true , "NUEVA RECETA" , manager );
        dialogReceta.setVisible ( true );
        cargarRecetas ();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        DialogReceta dialogReceta = new DialogReceta ( new JFrame () , true , "EDITAR RECETA" , manager , lRecetas.getSelectedValue () );
        dialogReceta.setVisible ( true );
        cargarRecetas ();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        if ( chkBajas.isSelected () ) {
            altaReceta ();
        } else {
            bajaReceta ();
        }
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        try {
            manager.getReportes ().receta ( lRecetas.getSelectedValue ().getIdreceta () );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        cargarRecetas ();
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void cbxFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFiltroItemStateChanged

    }//GEN-LAST:event_cbxFiltroItemStateChanged

    private void chkBajasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBajasItemStateChanged
        if ( chkBajas.isSelected () ) {
            btnBaja.setIcon ( new javax.swing.ImageIcon ( getClass ().getResource ( "/com/pereira/manolos/cliente/images/button_alta_normal.png" ) ) );
            btnBaja.setRolloverIcon ( new javax.swing.ImageIcon ( getClass ().
                    getResource ( "/com/pereira/manolos/cliente/images/button_alta_over.png" ) ) );
            btnBaja.setPressedIcon ( new javax.swing.ImageIcon ( getClass ().getResource (
                    "/com/pereira/manolos/cliente/images/button_alta_pressed.png" ) ) );
            itemBaja.setText ( "Dar Alta" );
        } else {
            btnBaja.setIcon ( new javax.swing.ImageIcon ( getClass ().getResource ( "/com/pereira/manolos/cliente/images/button_baja_normal.png" ) ) );
            btnBaja.setRolloverIcon ( new javax.swing.ImageIcon ( getClass ().
                    getResource ( "/com/pereira/manolos/cliente/images/button_baja_over.png" ) ) );
            btnBaja.setPressedIcon ( new javax.swing.ImageIcon ( getClass ().getResource (
                    "/com/pereira/manolos/cliente/images/button_baja_pressed.png" ) ) );
            itemBaja.setText ( "Dar Baja" );
        }
        cargarRecetas();
    }//GEN-LAST:event_chkBajasItemStateChanged

    private void lRecetasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lRecetasValueChanged
        if ( !lRecetas.isSelectionEmpty () ) {
            DecimalFormat df = new DecimalFormat ( "#.####" );
            df.setRoundingMode ( RoundingMode.CEILING );
            tCostos.setValueAt ( lRecetas.getSelectedValue ().getCostoCIF () , 0 , 1 );
            tCostos.setValueAt ( lRecetas.getSelectedValue ().getCostoMOD () , 1 , 1 );
            tCostos.setValueAt ( lRecetas.getSelectedValue ().getCostoINV () , 2 , 1 );
            lblCosto.setText ( "$ " + String.format ( "%.4f" , ( lRecetas.getSelectedValue ().getCostoCIF ()
                                                                 + lRecetas.getSelectedValue ().getCostoMOD ()
                                                                 + lRecetas.getSelectedValue ().getCostoINV () ) ) );
            lblCostoInv.setText ( "$ " + String.format ( "%.4f" , lRecetas.getSelectedValue ().getCostoINV () ) );
            cargarIngredientes ();
        }
    }//GEN-LAST:event_lRecetasValueChanged

    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2ActionPerformed
        DialogIngrediente dialogIngrediente = new DialogIngrediente ( new JFrame () , true , "AGREGAR INGREDIENTE" , manager ,
                                                                      lRecetas.getSelectedValue () , Collections.list ( dlmDetalle.elements () ) );
        dialogIngrediente.setVisible ( true );
        try {
            manager.getRecetaDAO ().actualizarAllCosto ( Collections.list ( dlmReceta.elements () ) );
        } catch ( Exception ex ) {
            Logger.getLogger ( PanelRecetas.class.getName () ).log ( Level.SEVERE , null , ex );
        }
        cargarIngredientes ();
    }//GEN-LAST:event_btnGuardar2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar2;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReporte;
    private javax.swing.JComboBox<String> cbxFiltro;
    private javax.swing.JCheckBox chkBajas;
    private javax.swing.JCheckBox chkBajoStock;
    private javax.swing.JMenuItem itemBaja;
    private javax.swing.JMenuItem itemEditar;
    private javax.swing.JMenuItem itemEditar1;
    private javax.swing.JMenuItem itemEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<ModeloDetalleReceta> lDetalle;
    private javax.swing.JList<ModeloReceta> lRecetas;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblCostoInv;
    private javax.swing.JPanel pBody;
    private javax.swing.JPanel pBusqueda;
    private javax.swing.JPanel pComandos;
    private javax.swing.JPanel pCostos;
    private javax.swing.JPanel pGrafico;
    private javax.swing.JPanel pIngredientes;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JPopupMenu popIngrediente;
    private javax.swing.JPopupMenu popReceta;
    private javax.swing.JTable tCostos;
    private javax.swing.JTabbedPane tp;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    private void cargarRecetas () {
        dlmReceta.clear ();
        Condition filtro = RECETA.NOMBRE.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
        Condition baja = RECETA.BAJA.eq ( chkBajas.isSelected () );
        try {
            manager.getRecetaDAO ().obtenerLista ( filtro.and ( baja ) ).forEach ( receta -> {
                dlmReceta.addElement ( receta );
            } );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
        if ( !dlmReceta.isEmpty () ) {
            lRecetas.setSelectedIndex ( 0 );
        }
    }

    private void cargarIngredientes () {
        dlmDetalle.clear ();
        Condition c = Tables.DETALLE_RECETA.IDRECETA.eq ( lRecetas.getSelectedValue ().getIdreceta () );
        try {
            List<ModeloDetalleReceta> ingredientes = manager.getDetalleRecetaDAO ().obtenerLista ( c );
            Collections.sort ( ingredientes , ( ModeloDetalleReceta i1 , ModeloDetalleReceta i2 ) -> i1.getNombre ().compareTo ( i2.getNombre () ) );
            ingredientes.forEach ( e -> {
                e.setReceta ( lRecetas.getSelectedValue () );
                dlmDetalle.addElement ( e );
            } );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }

    private void bajaReceta () {
        lRecetas.getSelectedValue().setBaja(true);
        try {
            manager.getRecetaDAO().modificar(lRecetas.getSelectedValue());
            Mensajes.mensajeOk ( "Registro editado satisfactoriamente!" );
            
        } catch (Exception ex) {
            Logger.getLogger(PanelRecetas.class.getName()).log(Level.SEVERE, null, ex);
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }finally{
            cargarRecetas();
        }
    }

    private void altaReceta () {
        lRecetas.getSelectedValue().setBaja(false);
        try {
            manager.getRecetaDAO().modificar(lRecetas.getSelectedValue());
            Mensajes.mensajeOk ( "Registro editado satisfactoriamente!" );
            
        } catch (Exception ex) {
            Logger.getLogger(PanelRecetas.class.getName()).log(Level.SEVERE, null, ex);
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }finally{
            cargarRecetas();
        }
    }

    private void createScene () {
        chart = createBarChart ();
        chart.setStyle ( "-fx-background-color: rgb(255, 255, 255);" );
        jfxPanel.setScene ( new Scene ( chart ) );
    }

    private BarChart createBarChart () {
        CategoryAxis xAxis = new CategoryAxis ();
        NumberAxis yAxis = new NumberAxis ();
        xAxis.setLabel ( "Costo" );
        yAxis.setLabel ( "Valor ($)" );
        final BarChart chart = new BarChart ( xAxis , yAxis , tableModel.getBarChartData () );
        tableModel.addTableModelListener ( ( TableModelEvent e ) -> {
            if ( e.getType () == TableModelEvent.UPDATE ) {
                final Object vCIF = ( ( TableModel ) e.getSource () ).getValueAt ( 0 , 1 );
                final Object vMOD = ( ( TableModel ) e.getSource () ).getValueAt ( 1 , 1 );
                final Object vINV = ( ( TableModel ) e.getSource () ).getValueAt ( 2 , 1 );
                Platform.runLater ( () -> {
                    BarChart.Series<String , Number> sCIF = ( BarChart.Series<String , Number> ) chart.getData ().get ( 0 );
                    BarChart.Series<String , Number> sMOD = ( BarChart.Series<String , Number> ) chart.getData ().get ( 1 );
                    BarChart.Series<String , Number> sINV = ( BarChart.Series<String , Number> ) chart.getData ().get ( 2 );
                    BarChart.Data dCIF = sCIF.getData ().get ( 0 );
                    BarChart.Data dMOD = sMOD.getData ().get ( 0 );
                    BarChart.Data dINV = sINV.getData ().get ( 0 );
                    dCIF.setYValue ( vCIF );
                    dMOD.setYValue ( vMOD );
                    dINV.setYValue ( vINV );
                } );
            }
        } );
        return chart;
    }

    private static final Logger LOG = Logger.getLogger ( PanelRecetas.class.getName () );

}
