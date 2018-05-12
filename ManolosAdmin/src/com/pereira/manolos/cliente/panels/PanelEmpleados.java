package com.pereira.manolos.cliente.panels;

import com.mrlonee.swing.animation.AnimatedPanel;
import com.pereira.manolos.cliente.dialogos.DialogEmpleados;
import com.pereira.manolos.cliente.dialogos.DialogUsuario;
import com.pereira.manolos.cliente.listrenderer.ListaEmpleadoRenderer;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.util.ComboUI;
import com.pereira.manolos.util.Mensajes;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.datos.database.Tables.EMPLEADO;

/* @author Jose Luis */
@SuppressWarnings ( "serial" )
public class PanelEmpleados extends AnimatedPanel {

    private final DAOManager manager;
    private final DefaultListModel<ModeloEmpleado> dlmEmpleados;

    public PanelEmpleados ( DAOManager pManager ) {
        this.dlmEmpleados = new DefaultListModel<> ();
        this.manager = pManager;
        this.setAnimationType ( AnimatedPanel.AnimationType.SlideAnimationFromTop );
        initComponents ();
        lEmpleados.setCellRenderer ( new ListaEmpleadoRenderer () );
        cargarEmpleados ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        popEmpleados = new javax.swing.JPopupMenu();
        itemCrearUsuario = new javax.swing.JMenuItem();
        itemEditarUsuario = new javax.swing.JMenuItem();
        itemEmilimarUsuario = new javax.swing.JMenuItem();
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
        lEmpleados = new javax.swing.JList<>();
        pInfo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        txtMail = new javax.swing.JLabel();
        lblDUI = new javax.swing.JLabel();
        txtDUI = new javax.swing.JLabel();

        itemCrearUsuario.setText("Crear Usuario");
        itemCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearUsuarioActionPerformed(evt);
            }
        });
        popEmpleados.add(itemCrearUsuario);

        itemEditarUsuario.setText("Editar Usuario");
        itemEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarUsuarioActionPerformed(evt);
            }
        });
        popEmpleados.add(itemEditarUsuario);

        itemEmilimarUsuario.setText("Eliminar Usuario");
        itemEmilimarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEmilimarUsuarioActionPerformed(evt);
            }
        });
        popEmpleados.add(itemEmilimarUsuario);

        itemEditarEmpleado.setText("Editar Empleado");
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
        jLabel1.setText("Empleados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 0);
        pTitulo.add(jLabel1, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e0ba(0)_64.png"))); // NOI18N
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
        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar todo", "Nombre", "Direccion" }));
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

        lEmpleados.setBackground(colorBG);
        lEmpleados.setModel(dlmEmpleados);
        lEmpleados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lEmpleados.setComponentPopupMenu(popEmpleados);
        lEmpleados.setSelectionBackground(colorUI);
        lEmpleados.setSelectionForeground(colorBG);
        lEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lEmpleadosMousePressed(evt);
            }
        });
        lEmpleados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lEmpleadosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lEmpleados);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pBody.add(jScrollPane3, gridBagConstraints);

        pInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(colorUI, 3, true), "Informacion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18), colorUI)); // NOI18N
        pInfo.setMinimumSize(new java.awt.Dimension(400, 300));
        pInfo.setOpaque(false);
        pInfo.setPreferredSize(new java.awt.Dimension(400, 300));
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
        txtNombre.setText("Seleccione Empleado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        pInfo.add(txtNombre, gridBagConstraints);

        txtPuesto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPuesto.setText("Puesto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 10, 5);
        pInfo.add(txtPuesto, gridBagConstraints);

        lblDireccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDireccion.setText("Direccion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pInfo.add(lblDireccion, gridBagConstraints);

        txtDireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDireccion.setMaximumSize(new java.awt.Dimension(0, 20));
        txtDireccion.setMinimumSize(new java.awt.Dimension(0, 20));
        txtDireccion.setPreferredSize(new java.awt.Dimension(0, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pInfo.add(txtDireccion, gridBagConstraints);

        lblTelefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTelefono.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pInfo.add(lblTelefono, gridBagConstraints);

        txtTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTelefono.setMaximumSize(new java.awt.Dimension(0, 20));
        txtTelefono.setMinimumSize(new java.awt.Dimension(0, 20));
        txtTelefono.setPreferredSize(new java.awt.Dimension(0, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pInfo.add(txtTelefono, gridBagConstraints);

        lblMail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMail.setText("E-Mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pInfo.add(lblMail, gridBagConstraints);

        txtMail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMail.setMaximumSize(new java.awt.Dimension(0, 20));
        txtMail.setMinimumSize(new java.awt.Dimension(0, 20));
        txtMail.setPreferredSize(new java.awt.Dimension(0, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pInfo.add(txtMail, gridBagConstraints);

        lblDUI.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDUI.setText("DUI:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pInfo.add(lblDUI, gridBagConstraints);

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
        pInfo.add(txtDUI, gridBagConstraints);

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
        cargarEmpleados ();
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        DialogEmpleados dialogEmpleados = new DialogEmpleados ( new JFrame () , true , "NUEVO EMPLEADO" , manager );
        dialogEmpleados.setVisible ( true );
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if ( chkBajas.isSelected () ) {
            Mensajes.mensajeAlert ( "No de puede editar un registro con " );
        } else if ( dlmEmpleados.isEmpty () ) {
            Mensajes.mensajeAlert ( "Seleccione un Empleado para editar" );
        } else {
            editarEmpleado ();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        if ( !dlmEmpleados.isEmpty () ) {
            if ( chkBajas.isSelected () ) {
                altaEmpleado ();
            } else {
                bajaEmpleado ();
            }
            cargarEmpleados ();
        } else {
            Mensajes.mensajeAlert ( "Seleccione un empleado" );
        }
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        try {
            manager.getReportes ().reporteEmpleados ();
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void chkBajasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBajasItemStateChanged
        // TODO add your handling code here:
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
        cargarEmpleados ();
    }//GEN-LAST:event_chkBajasItemStateChanged

    private void cbxFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFiltroItemStateChanged
        cargarEmpleados ();
    }//GEN-LAST:event_cbxFiltroItemStateChanged

    private void lEmpleadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lEmpleadosValueChanged
        if ( lEmpleados.getSelectedIndex () >= 0 ) {
            txtNombre.setText ( lEmpleados.getSelectedValue ().getNombre () );
            txtDireccion.setText ( lEmpleados.getSelectedValue ().getDireccion () );
            txtTelefono.setText ( lEmpleados.getSelectedValue ().getTelefono () );
            txtMail.setText ( lEmpleados.getSelectedValue ().getEmail () );
            txtDUI.setText ( lEmpleados.getSelectedValue ().getDUI () );
            txtPuesto.setText ( lEmpleados.getSelectedValue ().getPuesto ().getNombre () );
        }
    }//GEN-LAST:event_lEmpleadosValueChanged

    private void itemEmilimarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEmilimarUsuarioActionPerformed
        try {
            if ( manager.getUsuarioDAO ().existeUsuario ( lEmpleados.getSelectedValue () ) ) {
                int m = Mensajes.mensajeSiNo ( "Desea eliminar la cuenta de usuario? " );
                if ( m == 1 ) {
                    manager.getPermisoDAO ().eliminarByEmpleado ( lEmpleados.getSelectedValue () );
                    manager.getUsuarioDAO ().eliminarByEmpleado ( lEmpleados.getSelectedValue () );
                    Mensajes.mensajeOk ( "Cuenta de usuario eliminada" );
                }
            } else {
                Mensajes.mensajeAlert ( "Este Empleado no posee cuenta de usuario" );
            }
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }//GEN-LAST:event_itemEmilimarUsuarioActionPerformed

    private void itemCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearUsuarioActionPerformed
        try {
            if ( manager.getUsuarioDAO ().existeUsuario ( lEmpleados.getSelectedValue () ) ) {
                Mensajes.mensajeAlert ( "Este Empleado ya posee una cuenta de usuario" );
            } else {
                DialogUsuario dialogUsuario = new DialogUsuario ( new JFrame () , true , "NUEVO USUARIO" , manager , lEmpleados.getSelectedValue () );
                dialogUsuario.setVisible ( true );
            }
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }//GEN-LAST:event_itemCrearUsuarioActionPerformed

    private void lEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lEmpleadosMousePressed
        lEmpleados.setSelectedIndex ( lEmpleados.locationToIndex ( evt.getPoint () ) );
    }//GEN-LAST:event_lEmpleadosMousePressed

    private void itemEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarUsuarioActionPerformed
        try {
            if ( manager.getUsuarioDAO ().existeUsuario ( lEmpleados.getSelectedValue () ) ) {
                DialogUsuario dialogUsuario = new DialogUsuario ( new JFrame () , true , "EDITAR USUARIO" , manager , lEmpleados.getSelectedValue () ,
                                                                  false );
                dialogUsuario.setVisible ( true );
            } else {
                Mensajes.mensajeAlert ( "Este Empleado no posee cuenta de usuario" );
            }
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }//GEN-LAST:event_itemEditarUsuarioActionPerformed

    private void itemEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarEmpleadoActionPerformed
        /*if ( chkBajas.isSelected () ) {
            new Mensajes ().mensajeAlert ( "No se puede editar una baja de registro" );
        } else {
            DialogEmpleados dialog = new DialogEmpleados ( new javax.swing.JFrame () , true , "Nuevo Empleado" , manager , lEmpleados.
                                                           getSelectedValue () );
            dialog.setVisible ( true );
            if ( dialog.isGuardado () ) {
                new Mensajes ().mensajeOk ( "Registro Editado Exitosamente" );
                cargarEmpleados ();
            }
            dialog.dispose ();
        }*/
    }//GEN-LAST:event_itemEditarEmpleadoActionPerformed

    private void itemBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBajaActionPerformed
        if ( chkBajas.isSelected () ) {
            altaEmpleado ();
        } else {
            bajaEmpleado ();
        }
        cargarEmpleados ();
    }//GEN-LAST:event_itemBajaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReporte;
    private javax.swing.JComboBox<String> cbxFiltro;
    private javax.swing.JCheckBox chkBajas;
    private javax.swing.JMenuItem itemBaja;
    private javax.swing.JMenuItem itemCrearUsuario;
    private javax.swing.JMenuItem itemEditarEmpleado;
    private javax.swing.JMenuItem itemEditarUsuario;
    private javax.swing.JMenuItem itemEmilimarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<ModeloEmpleado> lEmpleados;
    private javax.swing.JLabel lblDUI;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pBody;
    private javax.swing.JPanel pBusqueda;
    private javax.swing.JPanel pComandos;
    private javax.swing.JPanel pInfo;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JPopupMenu popEmpleados;
    private javax.swing.JLabel txtDUI;
    private javax.swing.JLabel txtDireccion;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JLabel txtMail;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtPuesto;
    private javax.swing.JLabel txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void editarEmpleado () {
        DialogEmpleados dialogEmpleados = new DialogEmpleados ( new JFrame () , true , "EDITAR EMPLEADO" , manager , lEmpleados.getSelectedValue () );
        dialogEmpleados.setVisible ( true );
    }

    private void bajaEmpleado () {
        int m = Mensajes.mensajeSiNo ( "Se eliminará la cuenta de usuario, desea continuar? " );
        if ( m == 0 ) {
            ModeloEmpleado empleado = lEmpleados.getSelectedValue ();
            empleado.setBaja ( true );
            try {
                manager.getEmpleadoDAO ().modificar ( empleado );
                Mensajes.mensajeOk ( "Registro editado satisfactoriamente!" );
            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
                Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            }
        }
    }

    private void altaEmpleado () {
        ModeloEmpleado empleado = lEmpleados.getSelectedValue ();
        empleado.setBaja ( false );
        try {
            manager.getEmpleadoDAO ().modificar ( empleado );
            Mensajes.mensajeOk ( "Registro editado satisfactoriamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }

    private void nuevoPuesto () {
        /*DialogPuesto dialog = new DialogPuesto ( new javax.swing.JFrame () , true , "Nuevo Puesto" );
        dialog.setVisible ( true );
        if ( dialog.isGuardado () ) {
            new Mensajes ().mensajeOk ( "Registro Agregado Exitosamente" );
            cargarTablaPuestos ();
        }
        dialog.dispose ();*/
    }

    private void editarPuesto () {
        /*int idpuesto = ( int ) tPuestos.getValueAt ( tPuestos.getSelectedRow () , 0 );
        DialogPuesto dialog = new DialogPuesto ( new javax.swing.JFrame () , true , "Nuevo Puesto" , idpuesto );
        dialog.setVisible ( true );
        if ( dialog.isGuardado () ) {
            new Mensajes ().mensajeOk ( "Registro Editado Exitosamente" );
            cargarTablaPuestos ();
        }
        dialog.dispose ();*/
    }

    private void cargarEmpleados () {
        dlmEmpleados.clear ();
        Condition filtro;
        Condition baja;
        switch ( cbxFiltro.getSelectedIndex () ) {
            case 1:
                filtro = EMPLEADO.NOMBRE.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
                break;
            case 2:
                filtro = EMPLEADO.DIRECCION.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
                break;
            case 3:
                filtro = EMPLEADO.TELEFONO.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
                break;
            default:
                filtro = EMPLEADO.NOMBRE.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" )
                        .or ( EMPLEADO.DIRECCION.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" ) )
                        .or ( EMPLEADO.TELEFONO.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" ) );
                break;
        }
        baja = EMPLEADO.BAJA.eq ( chkBajas.isSelected () );
        try {
            manager.getEmpleadoDAO ().obtenerLista ( filtro.and ( baja ) ).forEach ( empleado -> {
                dlmEmpleados.addElement ( empleado );
            } );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
        }

        if ( !dlmEmpleados.isEmpty () ) {
            lEmpleados.setSelectedIndex ( 0 );
        }
    }

    private static final Logger LOG = Logger.getLogger ( PanelEmpleados.class.getName () );

}
