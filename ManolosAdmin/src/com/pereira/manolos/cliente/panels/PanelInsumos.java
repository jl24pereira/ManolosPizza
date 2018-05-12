package com.pereira.manolos.cliente.panels;

import com.mrlonee.swing.animation.AnimatedPanel;
import com.pereira.manolos.cliente.dialogos.DialogInsumos;
import com.pereira.manolos.cliente.dialogos.DialogSumarInsumos;
import com.pereira.manolos.cliente.listrenderer.ListaInsumoRenderer;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloInsumo;
import com.pereira.manolos.util.Mensajes;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.datos.database.Tables.INSUMO;

/*@author Jose Luis */
@SuppressWarnings ( "serial" )
public class PanelInsumos extends AnimatedPanel {

    private final DAOManager manager;
    private final DefaultListModel<ModeloInsumo> dlmInsumos = new DefaultListModel<> ();

    public PanelInsumos ( DAOManager manager ) {
        this.manager = manager;
        this.setAnimationType ( AnimatedPanel.AnimationType.SlideAnimationFromTop );
        initComponents ();
        lInsumos.setCellRenderer ( new ListaInsumoRenderer () );
        cargarListaInsumos ();
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
        btnBaja = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnAgredrarMas = new javax.swing.JButton();
        pCentro = new javax.swing.JPanel();
        pBusqueda = new javax.swing.JPanel();
        chkBajoStock = new javax.swing.JCheckBox();
        chkBajas = new javax.swing.JCheckBox();
        txtFiltro = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lInsumos = new javax.swing.JList<>();
        pFormulario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtMaximo = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtMinimo = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        txtProduccion = new javax.swing.JLabel();
        txtDUI = new javax.swing.JLabel();

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
        jLabel1.setText("Insumos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 0);
        pTitulo.add(jLabel1, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e8cb(0)_64.png"))); // NOI18N
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
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pComandos.add(btnEditar, gridBagConstraints);

        btnBaja.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pComandos.add(btnBaja, gridBagConstraints);

        btnReportes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_reporte_normal.png"))); // NOI18N
        btnReportes.setBorder(null);
        btnReportes.setBorderPainted(false);
        btnReportes.setContentAreaFilled(false);
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setFocusable(false);
        btnReportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReportes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_reporte_pressed.png"))); // NOI18N
        btnReportes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_reporte_over.png"))); // NOI18N
        btnReportes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        pComandos.add(btnReportes, gridBagConstraints);

        btnAgredrarMas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAgredrarMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_agregar1.png"))); // NOI18N
        btnAgredrarMas.setBorder(null);
        btnAgredrarMas.setBorderPainted(false);
        btnAgredrarMas.setContentAreaFilled(false);
        btnAgredrarMas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgredrarMas.setFocusable(false);
        btnAgredrarMas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgredrarMas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_agregar3.png"))); // NOI18N
        btnAgredrarMas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_agregar2.png"))); // NOI18N
        btnAgredrarMas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgredrarMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgredrarMasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 0);
        pComandos.add(btnAgredrarMas, gridBagConstraints);

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

        chkBajoStock.setBackground(new java.awt.Color(255, 255, 255));
        chkBajoStock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkBajoStock.setText(" Bajo Stock");
        chkBajoStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkBajoStock.setFocusable(false);
        chkBajoStock.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkBajoStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
        chkBajoStock.setMaximumSize(new java.awt.Dimension(120, 25));
        chkBajoStock.setMinimumSize(new java.awt.Dimension(120, 25));
        chkBajoStock.setPreferredSize(new java.awt.Dimension(120, 25));
        chkBajoStock.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
        chkBajoStock.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBajoStockItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pBusqueda.add(chkBajoStock, gridBagConstraints);

        chkBajas.setBackground(new java.awt.Color(255, 255, 255));
        chkBajas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkBajas.setText("Ver Bajas");
        chkBajas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkBajas.setFocusable(false);
        chkBajas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
        chkBajas.setMaximumSize(new java.awt.Dimension(110, 25));
        chkBajas.setMinimumSize(new java.awt.Dimension(110, 25));
        chkBajas.setPreferredSize(new java.awt.Dimension(110, 25));
        chkBajas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
        chkBajas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBajasItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pBusqueda.add(chkBajas, gridBagConstraints);

        txtFiltro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtFiltro.setMaximumSize(new java.awt.Dimension(150, 40));
        txtFiltro.setMinimumSize(new java.awt.Dimension(150, 40));
        txtFiltro.setPreferredSize(new java.awt.Dimension(150, 40));
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        pBusqueda.add(txtFiltro, gridBagConstraints);
        /*txtFiltro.setUI(new TextFieldUI(
            " Buscar...", colorUIpressed5, colorUIpressed5, colorBG
        ));*/

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        pCentro.add(pBusqueda, gridBagConstraints);

        jScrollPane3.setBorder(new javax.swing.border.LineBorder(colorUI, 2, true));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setMinimumSize(new java.awt.Dimension(350, 130));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(350, 130));

        lInsumos.setBackground(colorBG);
        lInsumos.setModel(dlmInsumos);
        lInsumos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pCentro.add(jScrollPane3, gridBagConstraints);

        pFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(colorUI, 3, true), "Informacion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18), colorUI)); // NOI18N
        pFormulario.setMinimumSize(new java.awt.Dimension(400, 300));
        pFormulario.setOpaque(false);
        pFormulario.setPreferredSize(new java.awt.Dimension(400, 300));
        pFormulario.setLayout(new java.awt.GridBagLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e85d(0)_64.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pFormulario.add(jLabel2, gridBagConstraints);

        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre.setText("Seleccione Insumo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        pFormulario.add(txtNombre, gridBagConstraints);

        lblDireccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDireccion.setText("Maximo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblDireccion, gridBagConstraints);

        txtMaximo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMaximo.setMaximumSize(new java.awt.Dimension(0, 20));
        txtMaximo.setMinimumSize(new java.awt.Dimension(0, 20));
        txtMaximo.setPreferredSize(new java.awt.Dimension(0, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pFormulario.add(txtMaximo, gridBagConstraints);

        lblTelefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTelefono.setText("Minimo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblTelefono, gridBagConstraints);

        txtMinimo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMinimo.setMaximumSize(new java.awt.Dimension(0, 20));
        txtMinimo.setMinimumSize(new java.awt.Dimension(0, 20));
        txtMinimo.setPreferredSize(new java.awt.Dimension(0, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pFormulario.add(txtMinimo, gridBagConstraints);

        lblMail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMail.setText("Produccion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblMail, gridBagConstraints);

        txtProduccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtProduccion.setMaximumSize(new java.awt.Dimension(0, 20));
        txtProduccion.setMinimumSize(new java.awt.Dimension(0, 20));
        txtProduccion.setPreferredSize(new java.awt.Dimension(0, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pFormulario.add(txtProduccion, gridBagConstraints);

        txtDUI.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDUI.setMaximumSize(new java.awt.Dimension(0, 20));
        txtDUI.setMinimumSize(new java.awt.Dimension(0, 20));
        txtDUI.setPreferredSize(new java.awt.Dimension(0, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pFormulario.add(txtDUI, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pCentro.add(pFormulario, gridBagConstraints);

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
        if ( !chkBajas.isSelected () ) {
            if ( !dlmInsumos.isEmpty () ) {
                editarInsumo ();
                cargarListaInsumos ();
            } else {
                Mensajes.mensajeAlert ( "No se encuentran registros para editar!" );
            }
        } else {
            Mensajes.mensajeAlert ( "No se pueden editar registros con baja!" );
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void itemEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarActionPerformed
        // TODO add your handling code here:
        editarMaterial ();
    }//GEN-LAST:event_itemEditarActionPerformed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        cargarListaInsumos ();
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        DialogInsumos dialogInsumos = new DialogInsumos ( new JFrame () , true , "NUEVO INSUMO" , manager , true );
        dialogInsumos.setVisible ( true );
        cargarListaInsumos ();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        if ( dlmInsumos.isEmpty () ) {
            Mensajes.mensajeAlert ( "No hay elementos seleccionados en la lista" );
        } else if ( chkBajas.isSelected () ) {
            altaMaterial ();
        } else {
            bajaMaterial ();
        }
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        try {
            if ( chkBajoStock.isSelected () ) {
                manager.getReportes ().reporteInventariosBajoStock ();
            } else {
                manager.getReportes ().reporteInventarios ();
            }
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }

    }//GEN-LAST:event_btnReportesActionPerformed

    private void itemBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBajaActionPerformed
        // TODO add your handling code here:
        if ( chkBajas.isSelected () ) {
            altaMaterial ();
        } else {
            bajaMaterial ();
        }
    }//GEN-LAST:event_itemBajaActionPerformed

    private void chkBajoStockItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBajoStockItemStateChanged
        cargarListaInsumos ();
    }//GEN-LAST:event_chkBajoStockItemStateChanged

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
        cargarListaInsumos ();
    }//GEN-LAST:event_chkBajasItemStateChanged

    private void lInsumosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lInsumosMousePressed
        lInsumos.setSelectedIndex ( lInsumos.locationToIndex ( evt.getPoint () ) );
    }//GEN-LAST:event_lInsumosMousePressed

    private void lInsumosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lInsumosValueChanged
        if ( lInsumos.getSelectedIndex () >= 0 ) {
            txtNombre.setText ( lInsumos.getSelectedValue ().getNombre () );
            txtMaximo.setText ( "" + lInsumos.getSelectedValue ().getMaximo () + " " + lInsumos.getSelectedValue ().getUnidad ().getDetalle () );
            txtMinimo.setText ( "" + lInsumos.getSelectedValue ().getMinimo () + " " + lInsumos.getSelectedValue ().getUnidad ().getDetalle () );
            if ( lInsumos.getSelectedValue ().isProduccion () ) {
                txtProduccion.setForeground ( colorUI );
                txtProduccion.setText ( "APLICA" );
            } else {
                txtProduccion.setForeground ( Color.RED );
                txtProduccion.setText ( "NO APLICA" );
            }
        }
    }//GEN-LAST:event_lInsumosValueChanged

    private void btnAgredrarMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgredrarMasActionPerformed
        DialogSumarInsumos dlg = new DialogSumarInsumos(new JFrame(), true, "AGREGAR A STOCK DE INSUMOS", manager, lInsumos.getSelectedValue ());
        dlg.setVisible(true);
    }//GEN-LAST:event_btnAgredrarMasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgredrarMas;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReportes;
    private javax.swing.JCheckBox chkBajas;
    private javax.swing.JCheckBox chkBajoStock;
    private javax.swing.JMenuItem itemBaja;
    private javax.swing.JMenuItem itemEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<ModeloInsumo> lInsumos;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pBusqueda;
    private javax.swing.JPanel pCentro;
    private javax.swing.JPanel pComandos;
    private javax.swing.JPanel pFormulario;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JPopupMenu popInventario;
    private javax.swing.JLabel txtDUI;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JLabel txtMaximo;
    private javax.swing.JLabel txtMinimo;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtProduccion;
    // End of variables declaration//GEN-END:variables

    private void cargarListaInsumos () {
        dlmInsumos.clear ();
        Condition baja = INSUMO.BAJA.equal ( chkBajas.isSelected () );
        Condition filtro = INSUMO.NOMBRE.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
        Condition bajoStock;
        if ( chkBajoStock.isSelected () ) {
            bajoStock = INSUMO.STOCK.lessThan ( INSUMO.MINIMO );
            try {
                manager.getInsumoDAO ().obtenerLista ( filtro.and ( baja ).and ( bajoStock ) ).forEach ( insumo -> {
                    dlmInsumos.addElement ( insumo );
                } );
            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
            }
        } else {
            try {
                manager.getInsumoDAO ().obtenerLista ( filtro.and ( baja ) ).forEach ( insumo -> {
                    dlmInsumos.addElement ( insumo );
                } );
            } catch ( Exception ex ) {
                Logger.getLogger ( PanelInsumos.class.getName () ).log ( Level.SEVERE , null , ex );
            }
        }
        if ( !dlmInsumos.isEmpty () ) {
            lInsumos.setSelectedIndex ( 0 );
        }
    }

    private void editarMaterial () {
        /*int idmaterial = (int)tInventario.getValueAt(tInventario.getSelectedRow(), 0);
        String categoria = (String)tInventario.getValueAt(tInventario.getSelectedRow(), 2);
        DialogMateriaPrima dialog = new DialogMateriaPrima(new javax.swing.JFrame(), true,"Editar Material",idmaterial,categoria);
        dialog.setVisible(true);
        if(dialog.isGuardado()){
            cargarTablaInventario();
            new Mensajes().mensajeInfo("Registro editado exitosamente");
        }
        dialog.dispose();*/
    }

    private void bajaMaterial () {
        lInsumos.getSelectedValue ().setBaja ( true );
        try {
            manager.getInsumoDAO ().modificar ( lInsumos.getSelectedValue () );
            Mensajes.mensajeOk ( "Registro editado satisfactoriamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            cargarListaInsumos ();
        }
    }

    private void altaMaterial () {
        lInsumos.getSelectedValue ().setBaja ( false );
        try {
            manager.getInsumoDAO ().modificar ( lInsumos.getSelectedValue () );
            Mensajes.mensajeOk ( "Registro editado satisfactoriamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            cargarListaInsumos ();
        }
    }

    private void editarInsumo () {
        DialogInsumos dialogInsumos = new DialogInsumos ( new JFrame () , true , "EDITAR INSUMO" , manager , lInsumos.getSelectedValue () );
        dialogInsumos.setVisible ( true );
    }

    private static final Logger LOG = Logger.getLogger ( PanelInsumos.class.getName () );

}
