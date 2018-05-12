package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.cliente.main.InicioSesion;
import com.pereira.manolos.datos.conexion.Conexion;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/* @author Jose Luis */
public class DialogPropiedades extends javax.swing.JDialog {

    Conexion conexion;

    public DialogPropiedades ( java.awt.Frame parent , boolean modal ) throws IOException {
        super ( parent , modal );
        initComponents ();
        this.setLocationRelativeTo ( null );
        conexion = new Conexion ();
        cargarPropiedades ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pContenido = new javax.swing.JPanel();
        pTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pForm = new javax.swing.JPanel();
        lblServidor = new javax.swing.JLabel();
        txtServidor = new javax.swing.JTextField();
        lblPuerto = new javax.swing.JLabel();
        txtPuerto = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lblDatabase = new javax.swing.JLabel();
        txtDatabase = new javax.swing.JTextField();
        pControles = new javax.swing.JPanel();
        btnTest = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(375, 550));
        setPreferredSize(new java.awt.Dimension(375, 550));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pContenido.setBackground(new java.awt.Color(255, 255, 255));
        pContenido.setLayout(new java.awt.GridBagLayout());

        pTitulo.setBackground(InicioSesion.colorUI);
        pTitulo.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Propiedades");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pTitulo.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pContenido.add(pTitulo, gridBagConstraints);

        pForm.setOpaque(false);
        pForm.setLayout(new java.awt.GridBagLayout());

        lblServidor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblServidor.setText("Servidor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        pForm.add(lblServidor, gridBagConstraints);

        txtServidor.setMinimumSize(new java.awt.Dimension(250, 20));
        txtServidor.setPreferredSize(new java.awt.Dimension(250, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 0);
        pForm.add(txtServidor, gridBagConstraints);

        lblPuerto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPuerto.setText("Puerto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        pForm.add(lblPuerto, gridBagConstraints);

        txtPuerto.setMinimumSize(new java.awt.Dimension(250, 20));
        txtPuerto.setPreferredSize(new java.awt.Dimension(250, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 0);
        pForm.add(txtPuerto, gridBagConstraints);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuario.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        pForm.add(lblUsuario, gridBagConstraints);

        txtUsuario.setMinimumSize(new java.awt.Dimension(250, 20));
        txtUsuario.setPreferredSize(new java.awt.Dimension(250, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 0);
        pForm.add(txtUsuario, gridBagConstraints);

        lblPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPass.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        pForm.add(lblPass, gridBagConstraints);

        txtPass.setMinimumSize(new java.awt.Dimension(250, 20));
        txtPass.setPreferredSize(new java.awt.Dimension(250, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 0);
        pForm.add(txtPass, gridBagConstraints);

        lblDatabase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDatabase.setText("Base de Datos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        pForm.add(lblDatabase, gridBagConstraints);

        txtDatabase.setMinimumSize(new java.awt.Dimension(250, 20));
        txtDatabase.setPreferredSize(new java.awt.Dimension(250, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 0);
        pForm.add(txtDatabase, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pContenido.add(pForm, gridBagConstraints);

        pControles.setOpaque(false);
        pControles.setLayout(new java.awt.GridBagLayout());

        btnTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_test_conexion_N.png"))); // NOI18N
        btnTest.setBorder(null);
        btnTest.setBorderPainted(false);
        btnTest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTest.setMaximumSize(new java.awt.Dimension(150, 50));
        btnTest.setMinimumSize(new java.awt.Dimension(150, 50));
        btnTest.setPreferredSize(new java.awt.Dimension(150, 50));
        btnTest.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_test_conexion_P.png"))); // NOI18N
        btnTest.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_test_conexion_O.png"))); // NOI18N
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        pControles.add(btnTest, gridBagConstraints);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_N.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setEnabled(false);
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
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        pControles.add(btnGuardar, gridBagConstraints);

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
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pControles.add(btnCancelar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pContenido.add(pControles, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(pContenido, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        char passArray[] = txtPass.getPassword ();
        String pass = new String ( passArray );
        conexion.setUser ( txtUsuario.getText () );
        conexion.setPass ( pass );
        conexion.setServer ( txtServidor.getText () );
        conexion.setPort ( txtPuerto.getText () );
        conexion.setDatabase ( txtDatabase.getText () );
        try {
            conexion.escribirPropiedades ();
            JOptionPane.showMessageDialog ( null , "Configuracion almacenada!" );
            dispose ();
        } catch ( IOException ex ) {
            Logger.getLogger ( DialogPropiedades.class.getName () ).log ( Level.SEVERE , null , ex );
            JOptionPane.showMessageDialog ( null , "Imposible acceder al archivo de configuracion" );
        }
        btnTest.setEnabled ( true );
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        try {
            char passArray[] = txtPass.getPassword ();
            String pass = new String ( passArray );
            conexion.setUser ( txtUsuario.getText () );
            conexion.setPass ( pass );
            conexion.setServer ( txtServidor.getText () );
            conexion.setPort ( txtPuerto.getText () );
            conexion.setDatabase ( txtDatabase.getText () );
            conexion.conectar ();
            if ( conexion.getConexion () != null ) {
                JOptionPane.showMessageDialog ( null , "Conexion exitosa" );
                btnGuardar.setEnabled ( true );
            }
        } catch ( Exception ex ) {
            Logger.getLogger ( DialogPropiedades.class.getName () ).log ( Level.SEVERE , null , ex );
        }
    }//GEN-LAST:event_btnTestActionPerformed

    private void btnTestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTestMouseExited
        // TODO add your handling code here:
        btnTest.setBackground ( new Color ( 73 , 190 , 240 ) );
    }//GEN-LAST:event_btnTestMouseExited

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDatabase;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPuerto;
    private javax.swing.JLabel lblServidor;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pContenido;
    private javax.swing.JPanel pControles;
    private javax.swing.JPanel pForm;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JTextField txtDatabase;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPuerto;
    private javax.swing.JTextField txtServidor;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void cargarPropiedades () {
        txtServidor.setText ( conexion.getServer () );
        txtUsuario.setText ( conexion.getUser () );
        txtPass.setText ( conexion.getPass () );
        txtDatabase.setText ( conexion.getDatabase () );
        txtPuerto.setText ( conexion.getPort () );
    }
}
