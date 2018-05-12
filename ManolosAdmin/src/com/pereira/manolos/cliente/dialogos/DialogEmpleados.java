package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.negocio.modelos.ModeloPuesto;
import com.pereira.manolos.util.ComboUI;
import com.pereira.manolos.util.Mensajes;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.datos.database.Tables.PUESTO;

/* @author Jose Luis */
@SuppressWarnings ( "serial" )
public class DialogEmpleados extends javax.swing.JDialog {

    private final DefaultComboBoxModel<ModeloPuesto> vDcbmPuestos;
    private ModeloEmpleado empleado;
    private final DAOManager manager;
    private final boolean nuevo;

    public DialogEmpleados ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager ) {
        super ( parent , modal );
        this.vDcbmPuestos = new DefaultComboBoxModel<> ();
        this.manager = manager;
        initComponents ();
        cargarCargos ();
        this.setLocationRelativeTo ( null );
        nuevo = true;
        this.setTitle ( titulo );
    }

    public DialogEmpleados ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager , ModeloEmpleado empleado ) {
        super ( parent , modal );
        this.vDcbmPuestos = new DefaultComboBoxModel<> ();
        this.manager = manager;
        this.empleado = empleado;
        initComponents ();
        cargarCargos ();
        this.setLocationRelativeTo ( null );
        nuevo = false;
        this.setTitle ( titulo );
        cargarFormulario ();
    }

    private void agregarEmpleado () {
        empleado = new ModeloEmpleado ( txtNombre.getText () , txtTelefono.getText () , txtDireccion.getText () , txtMail.getText () ,
                                        txtDUI.getText () , "-" , ( ModeloPuesto ) cbxCargo.getSelectedItem () );
        try {
            manager.getEmpleadoDAO ().insertar ( empleado );
            Mensajes.mensajeOk ( "Registro agregado exitosamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            dispose ();
        }
    }

    private void editarEmpleado () {
        empleado.setNombre ( txtNombre.getText () );
        empleado.setDireccion ( txtDireccion.getText () );
        empleado.setTelefono ( txtTelefono.getText () );
        empleado.setDUI ( txtDUI.getText () );
        empleado.setEmail ( txtMail.getText () );
        empleado.setPuesto ( ( ModeloPuesto ) cbxCargo.getSelectedItem () );
        try {
            manager.getEmpleadoDAO ().modificar ( empleado );
            Mensajes.mensajeOk ( "Registro editado exitosamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            dispose ();
        }
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pMain = new javax.swing.JPanel();
        pFormulario = new javax.swing.JPanel();
        pFormulario1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cbxCargo = new javax.swing.JComboBox<>();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNIT = new javax.swing.JLabel();
        txtDUI = new javax.swing.JFormattedTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JFormattedTextField();
        lblMail = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        lblSueldo = new javax.swing.JLabel();
        txtSalario = new javax.swing.JLabel();
        lblMail3 = new javax.swing.JLabel();
        txtDias = new javax.swing.JLabel();
        lblSueldo1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 550));
        setPreferredSize(new java.awt.Dimension(400, 550));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(colorBG);
        pMain.setLayout(new java.awt.GridBagLayout());

        pFormulario.setBackground(new java.awt.Color(255, 255, 255));
        pFormulario.setMinimumSize(new java.awt.Dimension(400, 600));
        pFormulario.setOpaque(false);
        pFormulario.setPreferredSize(new java.awt.Dimension(400, 600));
        pFormulario.setLayout(new java.awt.GridBagLayout());

        pFormulario1.setBackground(new java.awt.Color(255, 255, 255));
        pFormulario1.setMinimumSize(new java.awt.Dimension(350, 500));
        pFormulario1.setOpaque(false);
        pFormulario1.setPreferredSize(new java.awt.Dimension(350, 500));
        pFormulario1.setLayout(new java.awt.GridBagLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e85e(0)_128.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pFormulario1.add(jLabel9, gridBagConstraints);

        cbxCargo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbxCargo.setForeground(colorUI);
        cbxCargo.setModel(vDcbmPuestos);
        cbxCargo.setBorder(javax.swing.BorderFactory.createLineBorder(colorUI, 2));
        cbxCargo.setMinimumSize(new java.awt.Dimension(150, 30));
        cbxCargo.setPreferredSize(new java.awt.Dimension(150, 35));
        cbxCargo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCargoItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 10);
        pFormulario1.add(cbxCargo, gridBagConstraints);
        cbxCargo.setUI(new ComboUI(colorBG,colorUI, colorBG));

        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setText("(*) Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario1.add(lblNombre, gridBagConstraints);

        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setMinimumSize(new java.awt.Dimension(6, 35));
        txtNombre.setPreferredSize(new java.awt.Dimension(150, 35));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pFormulario1.add(txtNombre, gridBagConstraints);

        lblNIT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNIT.setText("DUI:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario1.add(lblNIT, gridBagConstraints);

        try {
            txtDUI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDUI.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDUI.setMinimumSize(new java.awt.Dimension(6, 35));
        txtDUI.setPreferredSize(new java.awt.Dimension(150, 35));
        txtDUI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDUIKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pFormulario1.add(txtDUI, gridBagConstraints);

        lblDireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDireccion.setText("(*) Direccion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario1.add(lblDireccion, gridBagConstraints);

        txtDireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDireccion.setMinimumSize(new java.awt.Dimension(6, 35));
        txtDireccion.setPreferredSize(new java.awt.Dimension(150, 35));
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pFormulario1.add(txtDireccion, gridBagConstraints);

        lblTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTelefono.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario1.add(lblTelefono, gridBagConstraints);

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTelefono.setMinimumSize(new java.awt.Dimension(6, 35));
        txtTelefono.setPreferredSize(new java.awt.Dimension(150, 35));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pFormulario1.add(txtTelefono, gridBagConstraints);

        lblMail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMail.setText("E-Mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario1.add(lblMail, gridBagConstraints);

        txtMail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMail.setMinimumSize(new java.awt.Dimension(6, 35));
        txtMail.setPreferredSize(new java.awt.Dimension(150, 35));
        txtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMailKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pFormulario1.add(txtMail, gridBagConstraints);

        lblSueldo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSueldo.setText("Salario Diario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario1.add(lblSueldo, gridBagConstraints);

        txtSalario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSalario.setMaximumSize(new java.awt.Dimension(6, 30));
        txtSalario.setMinimumSize(new java.awt.Dimension(6, 30));
        txtSalario.setPreferredSize(new java.awt.Dimension(6, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario1.add(txtSalario, gridBagConstraints);

        lblMail3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMail3.setText("Dias Laborales Semana:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario1.add(lblMail3, gridBagConstraints);

        txtDias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDias.setMaximumSize(new java.awt.Dimension(6, 30));
        txtDias.setMinimumSize(new java.awt.Dimension(6, 30));
        txtDias.setPreferredSize(new java.awt.Dimension(6, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario1.add(txtDias, gridBagConstraints);

        lblSueldo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSueldo1.setText("Cargo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario1.add(lblSueldo1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pFormulario.add(pFormulario1, gridBagConstraints);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_N.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
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
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(btnGuardar, gridBagConstraints);

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_N.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
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
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(btnCancelar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        pFormulario.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pMain.add(pFormulario, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(pMain, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if ( nuevo ) {
            agregarEmpleado ();
        } else {
            editarEmpleado ();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbxCargoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCargoItemStateChanged
        ModeloPuesto puesto = ( ModeloPuesto ) cbxCargo.getSelectedItem ();
        txtSalario.setText ( "$ " + puesto.getSalariodia () );
        txtDias.setText ( puesto.getDiaslaborales () + "" );
    }//GEN-LAST:event_cbxCargoItemStateChanged

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtDUI.requestFocus ();
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtDUIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDUIKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDUIKeyReleased

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
            cbxCargo.requestFocus ();
        }
    }//GEN-LAST:event_txtMailKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<ModeloPuesto> cbxCargo;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblMail3;
    private javax.swing.JLabel lblNIT;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblSueldo1;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pFormulario;
    private javax.swing.JPanel pFormulario1;
    private javax.swing.JPanel pMain;
    private javax.swing.JFormattedTextField txtDUI;
    private javax.swing.JLabel txtDias;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtSalario;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void cargarFormulario () {
        txtNombre.setText ( empleado.getNombre () );
        txtDireccion.setText ( empleado.getDireccion () );
        txtTelefono.setText ( empleado.getTelefono () );
        txtMail.setText ( empleado.getEmail () );
        txtDUI.setText ( empleado.getDUI () );
        vDcbmPuestos.setSelectedItem ( empleado.getPuesto () );
    }

    private void cargarCargos () {
        vDcbmPuestos.removeAllElements ();
        Condition c = PUESTO.IDPUESTO.greaterOrEqual ( 1 );
        try {
            manager.getPuestoDAO ().obtenerLista ( c ).stream ().forEach ( cargo -> {
                vDcbmPuestos.addElement ( cargo );
            } );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
        if ( vDcbmPuestos.getSize () == 0 ) {
            Mensajes.mensajeAlert ( "No hay puestos registrados!" );
            dispose ();
        } else {
            cbxCargo.setSelectedIndex ( 0 );
        }
    }

    private static final Logger LOG = Logger.getLogger ( DialogEmpleados.class.getName () );

}
