package com.pereira.manolos.cliente.dialogs;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCliente;
import com.pereira.manolos.util.JKeyboardPane;
import com.pereira.manolos.util.JNumKeyboardPane;
import com.pereira.manolos.util.Mensajes;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPopupMenu;

/* @author Jose Luis */
public class DialogCliente extends javax.swing.JDialog {

    private ModeloCliente cliente;
    private DAOManager manager;
    private JPopupMenu pop;
    private JKeyboardPane keyboard;
    private JNumKeyboardPane numpad;
    private boolean nuevo = true;

    public DialogCliente ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager ) {
        super ( parent , modal );
        this.manager = manager;
        initComponents ();
        this.setTitle ( titulo );
    }

    public DialogCliente ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager , ModeloCliente cliente ) {
        super ( parent , modal );
        this.manager = manager;
        this.cliente = cliente;
        initComponents ();
        nuevo = false;
        this.setTitle ( titulo );
        cargarFormulario ();
    }

    private void editarCliente () {
        cliente.setNombre ( txtNombre.getText () );
        cliente.setDireccion ( txtDireccion.getText () );
        cliente.setTelefono ( txtTelefono.getText () );
        cliente.setEmail ( txtMail.getText () );
        cliente.setDui ( txtDui.getText () );
        try {
            manager.getClienteDAO ().modificar ( cliente );
            Mensajes.mensajeOk ( "Registro agregado exitosamente!" );
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
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblMail = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMail1 = new javax.swing.JLabel();
        txtDui = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(450, 500));
        setPreferredSize(new java.awt.Dimension(450, 500));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(new java.awt.Color(255, 255, 255));
        pMain.setLayout(new java.awt.GridBagLayout());

        pFormulario.setBackground(new java.awt.Color(255, 255, 255));
        pFormulario.setMinimumSize(new java.awt.Dimension(400, 600));
        pFormulario.setOpaque(false);
        pFormulario.setPreferredSize(new java.awt.Dimension(400, 600));
        pFormulario.setLayout(new java.awt.GridBagLayout());

        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblNombre, gridBagConstraints);

        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setMinimumSize(new java.awt.Dimension(6, 40));
        txtNombre.setPreferredSize(new java.awt.Dimension(6, 40));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 5, 10, 10);
        pFormulario.add(txtNombre, gridBagConstraints);

        lblDireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDireccion.setText("Direccion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblDireccion, gridBagConstraints);

        txtDireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDireccion.setMinimumSize(new java.awt.Dimension(6, 40));
        txtDireccion.setPreferredSize(new java.awt.Dimension(6, 40));
        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pFormulario.add(txtDireccion, gridBagConstraints);

        lblTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTelefono.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblTelefono, gridBagConstraints);

        txtTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono.setMinimumSize(new java.awt.Dimension(6, 40));
        txtTelefono.setPreferredSize(new java.awt.Dimension(6, 40));
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pFormulario.add(txtTelefono, gridBagConstraints);

        lblMail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMail.setText("DUI:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblMail, gridBagConstraints);

        txtMail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMail.setMinimumSize(new java.awt.Dimension(6, 40));
        txtMail.setPreferredSize(new java.awt.Dimension(6, 40));
        txtMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMailFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 20, 10);
        pFormulario.add(txtMail, gridBagConstraints);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_guardar_normal.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        jPanel1.add(btnGuardar, gridBagConstraints);

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_cancelar_normal.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        jPanel1.add(btnCancelar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weighty = 1.0;
        pFormulario.add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(139, 195, 74));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("CLIENTES");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 1.0;
        pFormulario.add(jPanel2, gridBagConstraints);

        lblMail1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMail1.setText("E-Mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pFormulario.add(lblMail1, gridBagConstraints);

        txtDui.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDui.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDui.setMinimumSize(new java.awt.Dimension(6, 40));
        txtDui.setPreferredSize(new java.awt.Dimension(6, 40));
        txtDui.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDuiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDuiFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pFormulario.add(txtDui, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
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
            nuevoCliente ();
        } else {
            editarCliente ();
        }
        dispose ();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void nuevoCliente () {
        cliente = new ModeloCliente ( txtNombre.getText () , txtDireccion.getText () , txtTelefono.getText () , txtMail.getText () , "CF" ,
                                      txtDui.getText () );
        try {
            manager.getClienteDAO ().insertar ( cliente );
            Mensajes.mensajeOk ( "Registro agregado exitosamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            dispose ();
        }
    }

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        pop = new JPopupMenu ();
        keyboard = new JKeyboardPane ( txtNombre );
        pop.add ( keyboard );
        pop.requestFocus ();
        this.setModal ( false );
        pop.setVisible ( true );
        pop.setLocation ( txtNombre.getLocationOnScreen ().x + txtNombre.getSize ().width , txtNombre.getLocationOnScreen ().y - 1 );
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        pop.setVisible ( false );
        this.setModal ( true );
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusGained
        pop = new JPopupMenu ();
        keyboard = new JKeyboardPane ( txtDireccion );
        pop.add ( keyboard );
        this.setModal ( false );
        pop.setVisible ( true );
        pop.setLocation ( txtDireccion.getLocationOnScreen ().x + txtDireccion.getSize ().width , txtDireccion.getLocationOnScreen ().y - 1 );
    }//GEN-LAST:event_txtDireccionFocusGained

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        pop.setVisible ( false );
        this.setModal ( true );
    }//GEN-LAST:event_txtDireccionFocusLost

    private void txtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusGained
        pop = new JPopupMenu ();
        numpad = new JNumKeyboardPane ( txtTelefono );
        pop.add ( numpad );
        this.setModal ( false );
        pop.setVisible ( true );
        pop.setLocation ( txtTelefono.getLocationOnScreen ().x + txtTelefono.getSize ().width , txtTelefono.getLocationOnScreen ().y - 1 );
    }//GEN-LAST:event_txtTelefonoFocusGained

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        pop.setVisible ( false );
        this.setModal ( true );
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusGained
        pop = new JPopupMenu ();
        keyboard = new JKeyboardPane ( txtMail );
        pop.add ( keyboard );
        this.setModal ( false );
        pop.setVisible ( true );
        pop.setLocation ( txtMail.getLocationOnScreen ().x + txtMail.getSize ().width , txtMail.getLocationOnScreen ().y - 1 );
    }//GEN-LAST:event_txtMailFocusGained

    private void txtMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusLost
        pop.setVisible ( false );
        this.setModal ( true );
    }//GEN-LAST:event_txtMailFocusLost

    private void txtDuiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDuiFocusGained
        pop = new JPopupMenu ();
        numpad = new JNumKeyboardPane ( txtDui );
        pop.add ( numpad );
        this.setModal ( false );
        pop.setVisible ( true );
        pop.setLocation ( txtDui.getLocationOnScreen ().x + txtDui.getSize ().width , txtDui.getLocationOnScreen ().y - 1 );
    }//GEN-LAST:event_txtDuiFocusGained

    private void txtDuiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDuiFocusLost
        pop.setVisible ( false );
        this.setModal ( true );
    }//GEN-LAST:event_txtDuiFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblMail1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pFormulario;
    private javax.swing.JPanel pMain;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void cargarFormulario () {
        txtNombre.setText ( cliente.getNombre () );
        txtDireccion.setText ( cliente.getDireccion () );
        txtTelefono.setText ( cliente.getTelefono () );
        txtMail.setText ( cliente.getEmail () );
        txtDui.setText ( cliente.getDui () );
    }
    private static final Logger LOG = Logger.getLogger ( DialogCliente.class.getName () );

}
