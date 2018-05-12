package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloProveedor;
import com.pereira.manolos.util.ComboUI;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.SpinnerUI;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;

/* @author Jose Luis */
public class DialogProveedor extends javax.swing.JDialog {

    private final DAOManager manager;
    private ModeloProveedor proveedor;
    private static final Logger LOG = Logger.getLogger ( DialogProveedor.class.getName () );

    private boolean nuevo = true;

    public DialogProveedor ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager ) {
        super ( parent , modal );
        this.manager = manager;
        initComponents ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
    }

    public DialogProveedor ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager , ModeloProveedor proveedor ) {
        super ( parent , modal );
        this.manager = manager;
        this.proveedor = proveedor;
        this.nuevo = false;
        initComponents ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
        cargarForm ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pMain = new javax.swing.JPanel();
        pFormulario = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblGiro = new javax.swing.JLabel();
        txtGiro = new javax.swing.JTextField();
        lblNIT = new javax.swing.JLabel();
        txtNIT = new javax.swing.JFormattedTextField();
        lblIVA = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JFormattedTextField();
        lblMail = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblRepresentante = new javax.swing.JLabel();
        txtRepresentante = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblTipo = new javax.swing.JLabel();
        lblLimite = new javax.swing.JLabel();
        spPlazo = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        spLimite = new javax.swing.JSpinner();
        cbxTipo = new javax.swing.JComboBox<>();
        pComandos = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(450, 550));
        setPreferredSize(new java.awt.Dimension(450, 550));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(colorBG);
        pMain.setLayout(new java.awt.GridBagLayout());

        pFormulario.setBackground(new java.awt.Color(255, 255, 255));
        pFormulario.setMinimumSize(new java.awt.Dimension(400, 600));
        pFormulario.setOpaque(false);
        pFormulario.setPreferredSize(new java.awt.Dimension(400, 600));
        pFormulario.setLayout(new java.awt.GridBagLayout());

        lblNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombre.setText("(*) Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblNombre, gridBagConstraints);

        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setMinimumSize(new java.awt.Dimension(6, 30));
        txtNombre.setPreferredSize(new java.awt.Dimension(6, 30));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario.add(txtNombre, gridBagConstraints);

        lblGiro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblGiro.setText("Giro:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblGiro, gridBagConstraints);

        txtGiro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtGiro.setMinimumSize(new java.awt.Dimension(6, 30));
        txtGiro.setPreferredSize(new java.awt.Dimension(6, 30));
        txtGiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGiroKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario.add(txtGiro, gridBagConstraints);

        lblNIT.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNIT.setText("NIT:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblNIT, gridBagConstraints);

        try {
            txtNIT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-######-###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNIT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNIT.setMinimumSize(new java.awt.Dimension(100, 30));
        txtNIT.setPreferredSize(new java.awt.Dimension(6, 30));
        txtNIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNITKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario.add(txtNIT, gridBagConstraints);

        lblIVA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIVA.setText("NRC:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblIVA, gridBagConstraints);

        txtIVA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtIVA.setMinimumSize(new java.awt.Dimension(100, 30));
        txtIVA.setPreferredSize(new java.awt.Dimension(6, 30));
        txtIVA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIVAKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario.add(txtIVA, gridBagConstraints);

        lblDireccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDireccion.setText("(*) Direccion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblDireccion, gridBagConstraints);

        txtDireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDireccion.setMinimumSize(new java.awt.Dimension(6, 30));
        txtDireccion.setPreferredSize(new java.awt.Dimension(6, 30));
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario.add(txtDireccion, gridBagConstraints);

        lblTelefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTelefono.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblTelefono, gridBagConstraints);

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTelefono.setMinimumSize(new java.awt.Dimension(100, 30));
        txtTelefono.setPreferredSize(new java.awt.Dimension(6, 30));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario.add(txtTelefono, gridBagConstraints);

        lblMail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMail.setText("E-Mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblMail, gridBagConstraints);

        txtMail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMail.setMinimumSize(new java.awt.Dimension(6, 30));
        txtMail.setPreferredSize(new java.awt.Dimension(6, 30));
        txtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMailKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario.add(txtMail, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pFormulario.add(jSeparator5, gridBagConstraints);

        lblRepresentante.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRepresentante.setText("(*) Representante:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblRepresentante, gridBagConstraints);

        txtRepresentante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtRepresentante.setMinimumSize(new java.awt.Dimension(6, 30));
        txtRepresentante.setPreferredSize(new java.awt.Dimension(6, 30));
        txtRepresentante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRepresentanteKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario.add(txtRepresentante, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pFormulario.add(jSeparator8, gridBagConstraints);

        lblTipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTipo.setText("Tipo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblTipo, gridBagConstraints);

        lblLimite.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLimite.setText("Plazo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblLimite, gridBagConstraints);

        spPlazo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spPlazo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 5));
        spPlazo.setBorder(javax.swing.BorderFactory.createLineBorder(colorUI, 2));
        spPlazo.setEnabled(false);
        spPlazo.setMinimumSize(new java.awt.Dimension(100, 30));
        spPlazo.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario.add(spPlazo, gridBagConstraints);
        spPlazo.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Limite:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(jLabel5, gridBagConstraints);

        spLimite.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spLimite.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 9999.0d, 50.0d));
        spLimite.setBorder(javax.swing.BorderFactory.createLineBorder(colorUI, 2));
        spLimite.setEnabled(false);
        spLimite.setMinimumSize(new java.awt.Dimension(100, 30));
        spLimite.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario.add(spLimite, gridBagConstraints);
        spLimite.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        cbxTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbxTipo.setForeground(colorUI);
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONTADO", "CREDITO" }));
        cbxTipo.setMaximumSize(new java.awt.Dimension(150, 30));
        cbxTipo.setMinimumSize(new java.awt.Dimension(150, 30));
        cbxTipo.setPreferredSize(new java.awt.Dimension(150, 30));
        cbxTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 10);
        pFormulario.add(cbxTipo, gridBagConstraints);
        cbxTipo.setUI(new ComboUI(colorBG,colorUI, colorBG));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pMain.add(pFormulario, gridBagConstraints);

        pComandos.setOpaque(false);
        pComandos.setLayout(new java.awt.GridBagLayout());

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_N.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pComandos.add(btnCancelar, gridBagConstraints);

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_N.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setMaximumSize(new java.awt.Dimension(150, 50));
        btnGuardar.setMinimumSize(new java.awt.Dimension(150, 50));
        btnGuardar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_P.png"))); // NOI18N
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_O.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pComandos.add(btnGuardar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pMain.add(pComandos, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(pMain, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtGiro.requestFocus ();
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtGiroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGiroKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtNIT.requestFocus ();
        }
    }//GEN-LAST:event_txtGiroKeyReleased

    private void txtNITKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNITKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtIVA.requestFocus ();
        }
    }//GEN-LAST:event_txtNITKeyReleased

    private void txtIVAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIVAKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtDireccion.requestFocus ();
        }
    }//GEN-LAST:event_txtIVAKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtTelefono.requestFocus ();
        }
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtMail.requestFocus ();
        }
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtMailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtRepresentante.requestFocus ();
        }
    }//GEN-LAST:event_txtMailKeyReleased

    private void txtRepresentanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepresentanteKeyReleased

    }//GEN-LAST:event_txtRepresentanteKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if ( isComplete () ) {
            if ( nuevo ) {
                nuevoProveedor ();
            } else {
                editarProveedor ();
            }
        } else {
            Mensajes.mensajeAlert ( "Campos requeridos no validos!" );
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoItemStateChanged
        if ( cbxTipo.getSelectedIndex () == 0 ) {
            spLimite.setEnabled ( false );
            spPlazo.setEnabled ( false );
        } else {
            spLimite.setEnabled ( true );
            spPlazo.setEnabled ( true );
        }
    }//GEN-LAST:event_cbxTipoItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblGiro;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblLimite;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNIT;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRepresentante;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel pComandos;
    private javax.swing.JPanel pFormulario;
    private javax.swing.JPanel pMain;
    private javax.swing.JSpinner spLimite;
    private javax.swing.JSpinner spPlazo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtGiro;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtMail;
    private javax.swing.JFormattedTextField txtNIT;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRepresentante;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void cargarForm () {
        txtNombre.setText ( proveedor.getNombre () );
        txtGiro.setText ( proveedor.getGiro () );
        txtNIT.setText ( proveedor.getNIT () );
        txtIVA.setText ( proveedor.getVNRC () );
        txtDireccion.setText ( proveedor.getDireccion () );
        txtTelefono.setText ( proveedor.getTelefono () );
        txtMail.setText ( proveedor.getEmail () );
        txtRepresentante.setText ( proveedor.getRepresentante () );
        cbxTipo.setSelectedItem ( proveedor.getTipoproveedor () );
        spPlazo.setValue ( proveedor.getPlazo () );
        spLimite.setValue ( proveedor.getLimite ().doubleValue () );
    }

    private boolean isComplete () {
        if ( txtNombre.getText () == null || txtNombre.getText ().equals ( "" ) ) {
            return false;
        } else if ( txtDireccion.getText () == null || txtNombre.getText ().equals ( "" ) ) {
            return false;
        } else {
            return !( txtRepresentante.getText () == null || txtRepresentante.getText ().equals ( "" ) );
        }
    }

    private void nuevoProveedor () {
        proveedor = new ModeloProveedor ( txtNombre.getText () , txtDireccion.getText () , txtTelefono.getText () , txtGiro.getText () , txtNIT.
                                          getText () ,
                                          txtIVA.getText () , txtMail.getText () , txtRepresentante.getText () , cbxTipo.getSelectedItem ().
                                          toString () ,
                                          ( int ) spPlazo.getValue () , new BigDecimal ( ( double ) spLimite.getValue () ) );
        try {
            manager.getProveedorDAO ().insertar ( proveedor );
            Mensajes.mensajeOk ( "Registro agregado exitosamente! " );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            dispose ();
        }
    }

    private void editarProveedor () {
        proveedor.setNombre ( txtNombre.getText () );
        proveedor.setDireccion ( txtDireccion.getText () );
        proveedor.setTelefono ( txtTelefono.getText () );
        proveedor.setGiro ( txtGiro.getText () );
        proveedor.setNIT ( txtNIT.getText () );
        proveedor.setVNRC ( txtIVA.getText () );
        proveedor.setEmail ( txtMail.getText () );
        proveedor.setRepresentante ( txtRepresentante.getText () );
        proveedor.setTipoproveedor ( cbxTipo.getSelectedItem ().toString () );
        proveedor.setPlazo ( ( int ) spPlazo.getValue () );
        proveedor.setLimite ( new BigDecimal ( ( double ) spLimite.getValue () ) );
        try {
            manager.getProveedorDAO ().modificar ( proveedor );
            Mensajes.mensajeOk ( "Registro editado exitosamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            dispose ();
        }
    }

}
