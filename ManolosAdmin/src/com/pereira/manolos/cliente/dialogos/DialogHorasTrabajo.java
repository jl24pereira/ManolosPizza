package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloEmpresa;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.SpinnerUI;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;

/* @author Jose Luis */
public class DialogHorasTrabajo extends javax.swing.JDialog {

    private static final Logger LOG = Logger.getLogger ( DialogHorasTrabajo.class.getName () );
    DAOManager manager;
    ModeloEmpresa miEmpresa;
    private boolean guardado = false;

    public DialogHorasTrabajo ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager ) {
        super ( parent , modal );
        this.manager = manager;
        initComponents ();
        cargarForm ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblTitulo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        spHoras = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(380, 230));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblTitulo.setBackground(colorBG);
        lblTitulo.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(colorBG);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Horas de Trabajo Semanales:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jLabel3, gridBagConstraints);

        spHoras.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        spHoras.setModel(new javax.swing.SpinnerNumberModel(1, 1, 168, 1));
        spHoras.setMinimumSize(new java.awt.Dimension(100, 50));
        spHoras.setPreferredSize(new java.awt.Dimension(100, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(spHoras, gridBagConstraints);
        spHoras.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        jPanel2.add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e192(0)_128.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel2.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        lblTitulo.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(lblTitulo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        dispose ();
        miEmpresa.setHorastrabajo ( ( int ) spHoras.getValue () );
        try {
            manager.getEmpresaDAO ().modificar ( miEmpresa );
            Mensajes.mensajeOk ( "Registro editado exitosamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            dispose ();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose ();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel lblTitulo;
    private javax.swing.JSpinner spHoras;
    // End of variables declaration//GEN-END:variables

    private void cargarForm () {
        try {
            miEmpresa = manager.getEmpresaDAO ().cargarEmpresa ( 1 );
            if ( miEmpresa == null ) {
                Mensajes.mensajeAlert ( "No hay Empresa Registrada" );
                dispose ();
            } else {
                spHoras.setValue ( miEmpresa.getHorastrabajo () );
            }
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            dispose ();
        }
    }

}
