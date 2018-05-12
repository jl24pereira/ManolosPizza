package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCaja;
import com.pereira.manolos.util.Mensajes;
import java.awt.event.KeyEvent;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;

/* @author Jose Luis */
public class DialogCajas extends javax.swing.JDialog {

    private static final Logger LOG = Logger.getLogger ( DialogCajas.class.getName () );
    private final DAOManager manager;
    private ModeloCaja caja;
    private boolean nuevo = true;

    public DialogCajas ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager , ModeloCaja caja ) {
        super ( parent , modal );
        this.manager = manager;
        this.caja = caja;
        this.nuevo = false;
        initComponents ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
        cargarForm ( titulo );
    }

    public DialogCajas ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager ) {
        super ( parent , modal );
        this.manager = manager;
        initComponents ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCaja = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIPcaja = new javax.swing.JTextField();
        btnCaja = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(500, 250));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMinimumSize(new java.awt.Dimension(400, 201));
        jPanel5.setPreferredSize(new java.awt.Dimension(286, 200));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("(*) Detalle:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel5.add(jLabel3, gridBagConstraints);

        txtCaja.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCaja.setMinimumSize(new java.awt.Dimension(200, 30));
        txtCaja.setPreferredSize(new java.awt.Dimension(200, 30));
        txtCaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCajaKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel5.add(txtCaja, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("(*) IP:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel5.add(jLabel4, gridBagConstraints);

        txtIPcaja.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtIPcaja.setMinimumSize(new java.awt.Dimension(200, 30));
        txtIPcaja.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel5.add(txtIPcaja, gridBagConstraints);

        btnCaja.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCaja.setForeground(colorBG);
        btnCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_verip_N.png"))); // NOI18N
        btnCaja.setBorder(null);
        btnCaja.setBorderPainted(false);
        btnCaja.setContentAreaFilled(false);
        btnCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaja.setMaximumSize(new java.awt.Dimension(90, 50));
        btnCaja.setMinimumSize(new java.awt.Dimension(90, 50));
        btnCaja.setPreferredSize(new java.awt.Dimension(90, 50));
        btnCaja.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_verip_P.png"))); // NOI18N
        btnCaja.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_verip_O.png"))); // NOI18N
        btnCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel5.add(btnCaja, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e30c(0)_128.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel5.add(jLabel1, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
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
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        jPanel1.add(btnCancelar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel5.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel5, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if ( isComplete () ) {
            try {
                if ( nuevo ) {
                    if ( manager.getCajaDAO ().isCaja ( txtIPcaja.getText () ) ) {
                        Mensajes.mensajeAlert ( "Esta IP esta registrada como caja!" );
                    } else {
                        nuevaCaja ();
                    }
                } else {
                    editarCaja ();
                }
            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
                Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            }
        } else {
            Mensajes.mensajeAlert ( "Verificar los campos requeridos!" );
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose ();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajaActionPerformed
        try {
            if ( manager.getCajaDAO ().isCaja ( InetAddress.getLocalHost ().getHostAddress () ) ) {
                Mensajes.mensajeAlert ( "Esta IP esta registrada como caja" );
            } else {
                txtIPcaja.setText ( InetAddress.getLocalHost ().getHostAddress () );
            }
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }//GEN-LAST:event_btnCajaActionPerformed

    private void txtCajaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtIPcaja.requestFocus ();
        }
    }//GEN-LAST:event_txtCajaKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaja;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtCaja;
    private javax.swing.JTextField txtIPcaja;
    // End of variables declaration//GEN-END:variables

    private void cargarForm ( String ipcaja ) {
        txtCaja.setText ( caja.getDetalle () );
        txtIPcaja.setText ( caja.getIpCaja () );
    }

    private boolean isComplete () {
        if ( txtCaja.getText () == null || txtCaja.getText ().equals ( "" ) ) {
            return false;
        } else {
            return !( txtIPcaja.getText () == null || txtIPcaja.getText ().equals ( "" ) );
        }
    }

    private void nuevaCaja () {
        caja = new ModeloCaja ( txtCaja.getText () , txtIPcaja.getText () );
        try {
            manager.getCajaDAO ().insertar ( caja );
            Mensajes.mensajeOk ( "Registro agregado exitosamente" );
        } catch ( Exception ex ) {
            Logger.getLogger ( DialogCajas.class.getName () ).log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            dispose ();
        }
    }

    private void editarCaja () {
        caja.setIpCaja ( txtIPcaja.getText () );
        caja.setDetalle ( txtCaja.getText () );
        try {
            manager.getCajaDAO ().modificar ( caja );
            Mensajes.mensajeOk ( "Registro editado exitosamente" );
        } catch ( Exception ex ) {
            Logger.getLogger ( DialogCajas.class.getName () ).log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            dispose ();
        }
    }

}
