package com.pereira.manolos.cliente.panels;

import com.mrlonee.swing.animation.AnimatedPanel;
import com.pereira.manolos.cliente.dialogos.DialogProveedor;
import com.pereira.manolos.cliente.listrenderer.ListaProveedorRenderer;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloProveedor;
import com.pereira.manolos.util.ComboUI;
import com.pereira.manolos.util.Mensajes;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.datos.database.Tables.PROVEEDOR;

/* @author Jose Luis */
@SuppressWarnings ( "serial" )
public class PanelProveedores extends AnimatedPanel {

    private final DAOManager manager;
    private final DefaultListModel<ModeloProveedor> dlmProveedor;

    @SuppressWarnings ( "OverridableMethodCallInConstructor" )
    public PanelProveedores ( DAOManager pManager ) {
        this.setAnimationType ( AnimatedPanel.AnimationType.SlideAnimationFromTop );
        this.dlmProveedor = new DefaultListModel<> ();
        this.manager = pManager;
        initComponents ();
        lProveedores.setCellRenderer ( new ListaProveedorRenderer () );
        cargarProveedores ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        popEmpleados = new javax.swing.JPopupMenu();
        itemEditarEmpleado = new javax.swing.JMenuItem();
        itemBaja = new javax.swing.JMenuItem();
        pMain = new javax.swing.JPanel();
        pTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pComandos = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        pBody = new javax.swing.JPanel();
        pBusqueda = new javax.swing.JPanel();
        txtFiltro = new javax.swing.JTextField();
        cbxFiltro = new javax.swing.JComboBox<>();
        chkBajas = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        lProveedores = new javax.swing.JList<>();
        pInfo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtTipo = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        lblDUI = new javax.swing.JLabel();
        txtNrc = new javax.swing.JLabel();
        txtRepresentante = new javax.swing.JLabel();
        lblDUI1 = new javax.swing.JLabel();
        txtNit = new javax.swing.JLabel();
        lblDUI2 = new javax.swing.JLabel();
        txtPlazo = new javax.swing.JLabel();
        lblDUI3 = new javax.swing.JLabel();
        lblDUI4 = new javax.swing.JLabel();
        txtLimite = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        itemEditarEmpleado.setText("Editar Proveedor");
        itemEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarEmpleadoActionPerformed(evt);
            }
        });
        popEmpleados.add(itemEditarEmpleado);

        itemBaja.setText("Dar Baja");
        itemBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBajaActionPerformed(evt);
            }
        });
        popEmpleados.add(itemBaja);

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
        jLabel1.setText("Proveedores");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 0);
        pTitulo.add(jLabel1, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e558(0)_64.png"))); // NOI18N
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
        lProveedores.setComponentPopupMenu(popEmpleados);
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
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pBody.add(jScrollPane3, gridBagConstraints);

        pInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(colorUI, 3, true), "Informacion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18), colorUI)); // NOI18N
        pInfo.setMinimumSize(new java.awt.Dimension(400, 400));
        pInfo.setOpaque(false);
        pInfo.setPreferredSize(new java.awt.Dimension(400, 400));
        pInfo.setLayout(new java.awt.GridBagLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e85d(0)_64.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pInfo.add(jLabel2, gridBagConstraints);

        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre.setText("Seleccione Proveedor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        pInfo.add(txtNombre, gridBagConstraints);

        txtTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTipo.setText("Tipo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 10, 5);
        pInfo.add(txtTipo, gridBagConstraints);

        lblMail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMail.setText("E-Mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pInfo.add(lblMail, gridBagConstraints);

        txtEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEmail.setMaximumSize(new java.awt.Dimension(0, 20));
        txtEmail.setMinimumSize(new java.awt.Dimension(0, 20));
        txtEmail.setPreferredSize(new java.awt.Dimension(0, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pInfo.add(txtEmail, gridBagConstraints);

        lblDUI.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDUI.setText("NRC");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pInfo.add(lblDUI, gridBagConstraints);

        txtNrc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNrc.setMaximumSize(new java.awt.Dimension(0, 20));
        txtNrc.setMinimumSize(new java.awt.Dimension(0, 20));
        txtNrc.setPreferredSize(new java.awt.Dimension(0, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pInfo.add(txtNrc, gridBagConstraints);

        txtRepresentante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRepresentante.setMaximumSize(new java.awt.Dimension(0, 20));
        txtRepresentante.setMinimumSize(new java.awt.Dimension(0, 20));
        txtRepresentante.setPreferredSize(new java.awt.Dimension(0, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        pInfo.add(txtRepresentante, gridBagConstraints);

        lblDUI1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDUI1.setText("Representante:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        pInfo.add(lblDUI1, gridBagConstraints);

        txtNit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNit.setMaximumSize(new java.awt.Dimension(0, 20));
        txtNit.setMinimumSize(new java.awt.Dimension(0, 20));
        txtNit.setPreferredSize(new java.awt.Dimension(0, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pInfo.add(txtNit, gridBagConstraints);

        lblDUI2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDUI2.setText("NIT:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pInfo.add(lblDUI2, gridBagConstraints);

        txtPlazo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPlazo.setMaximumSize(new java.awt.Dimension(0, 20));
        txtPlazo.setMinimumSize(new java.awt.Dimension(0, 20));
        txtPlazo.setPreferredSize(new java.awt.Dimension(0, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pInfo.add(txtPlazo, gridBagConstraints);

        lblDUI3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDUI3.setText("Plazo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pInfo.add(lblDUI3, gridBagConstraints);

        lblDUI4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDUI4.setText("Limite:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        pInfo.add(lblDUI4, gridBagConstraints);

        txtLimite.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtLimite.setMaximumSize(new java.awt.Dimension(0, 20));
        txtLimite.setMinimumSize(new java.awt.Dimension(0, 20));
        txtLimite.setPreferredSize(new java.awt.Dimension(0, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        pInfo.add(txtLimite, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pInfo.add(jSeparator1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pInfo.add(jSeparator2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
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
        DialogProveedor dialogProveedor = new DialogProveedor ( new JFrame () , false , "NUEVO PROVEEDOR" , manager );
        dialogProveedor.setVisible ( true );
        cargarProveedores ();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if ( chkBajas.isSelected () ) {
            Mensajes.mensajeAlert ( "No de puede editar un registro con " );
        } else if ( dlmProveedor.isEmpty () ) {
            Mensajes.mensajeAlert ( "Seleccione un Empleado para editar" );
        } else {
            editarProveedor ();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        if ( !dlmProveedor.isEmpty () ) {
            if ( chkBajas.isSelected () ) {
                altaProveedor ();
            } else {
                bajaProveedor ();
            }
            cargarProveedores ();
        } else {
            Mensajes.mensajeAlert ( "Seleccione un empleado" );
        }
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        try {
            manager.getReportes ().reporteProveedores ();
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeAlert ( "Error: " + ex.getMessage () );
        }
    }//GEN-LAST:event_btnReporteActionPerformed

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
        cargarProveedores ();
    }//GEN-LAST:event_chkBajasItemStateChanged

    private void cbxFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFiltroItemStateChanged
        cargarProveedores ();
    }//GEN-LAST:event_cbxFiltroItemStateChanged

    private void lProveedoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lProveedoresValueChanged
        if ( lProveedores.getSelectedIndex () >= 0 ) {
            txtNombre.setText ( lProveedores.getSelectedValue ().getNombre () );
            txtEmail.setText ( lProveedores.getSelectedValue ().getEmail () );
            txtLimite.setText ( "$ " + lProveedores.getSelectedValue ().getLimite () );
            txtNit.setText ( lProveedores.getSelectedValue ().getNIT () );
            txtNrc.setText ( lProveedores.getSelectedValue ().getVNRC () );
            txtPlazo.setText ( lProveedores.getSelectedValue ().getPlazo () + " Dias" );
            txtTipo.setText ( lProveedores.getSelectedValue ().getTipoproveedor () );
            txtRepresentante.setText ( lProveedores.getSelectedValue ().getRepresentante () );
        }
    }//GEN-LAST:event_lProveedoresValueChanged

    private void lProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lProveedoresMousePressed
        lProveedores.setSelectedIndex ( lProveedores.locationToIndex ( evt.getPoint () ) );
    }//GEN-LAST:event_lProveedoresMousePressed

    private void itemEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarEmpleadoActionPerformed
        editarProveedor ();
    }//GEN-LAST:event_itemEditarEmpleadoActionPerformed

    private void itemBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBajaActionPerformed
        if ( chkBajas.isSelected () ) {
            altaProveedor ();
        } else {
            bajaProveedor ();
        }
        cargarProveedores ();
    }//GEN-LAST:event_itemBajaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReporte;
    private javax.swing.JComboBox<String> cbxFiltro;
    private javax.swing.JCheckBox chkBajas;
    private javax.swing.JMenuItem itemBaja;
    private javax.swing.JMenuItem itemEditarEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JList<ModeloProveedor> lProveedores;
    private javax.swing.JLabel lblDUI;
    private javax.swing.JLabel lblDUI1;
    private javax.swing.JLabel lblDUI2;
    private javax.swing.JLabel lblDUI3;
    private javax.swing.JLabel lblDUI4;
    private javax.swing.JLabel lblMail;
    private javax.swing.JPanel pBody;
    private javax.swing.JPanel pBusqueda;
    private javax.swing.JPanel pComandos;
    private javax.swing.JPanel pInfo;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JPopupMenu popEmpleados;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JLabel txtLimite;
    private javax.swing.JLabel txtNit;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtNrc;
    private javax.swing.JLabel txtPlazo;
    private javax.swing.JLabel txtRepresentante;
    private javax.swing.JLabel txtTipo;
    // End of variables declaration//GEN-END:variables

    private void editarProveedor () {
        DialogProveedor dialogProveedor = new DialogProveedor ( new JFrame () , true , "EDITAR PROVEEDOR" , manager , lProveedores.getSelectedValue () );
        dialogProveedor.setVisible ( true );
        cargarProveedores ();
    }

    private void bajaProveedor () {
        ModeloProveedor proveedor = lProveedores.getSelectedValue ();
        proveedor.setBaja ( true );
        try {
            manager.getProveedorDAO ().modificar ( proveedor );
            Mensajes.mensajeOk ( "Registro editado satisfactoriamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }

    private void altaProveedor () {
        ModeloProveedor proveedor = lProveedores.getSelectedValue ();
        proveedor.setBaja ( false );
        try {
            manager.getProveedorDAO ().modificar ( proveedor );
            Mensajes.mensajeOk ( "Registro editado satisfactoriamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }

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

    private static final Logger LOG = Logger.getLogger ( PanelProveedores.class.getName () );

}
