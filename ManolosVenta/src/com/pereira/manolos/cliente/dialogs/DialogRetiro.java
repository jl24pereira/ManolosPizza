package com.pereira.manolos.cliente.dialogs;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloBitacoraCaja;
import com.pereira.manolos.negocio.modelos.ModeloCaja;
import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.util.DialogNumPad;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.SpinnerUI;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author Jose Luis */
@SuppressWarnings("serial")
public class DialogRetiro extends javax.swing.JDialog {

    private final DAOManager manager;
    private final ModeloCaja caja;
    private final ModeloEmpleado empleado;

    public DialogRetiro(java.awt.Frame parent, boolean modal, String titulo, DAOManager manager, ModeloCaja caja, ModeloEmpleado empleado) {
        super(parent, modal);
        this.manager = manager;
        this.caja = caja;
        this.empleado = empleado;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle(titulo);
        lblCaja.setText(caja.getDetalle());
        lblEmpleado.setText(empleado.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblTitulo = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        txtContador = new javax.swing.JLabel();
        lblCaja = new javax.swing.JLabel();
        lblEmpleado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spCantidad = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPADinicial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setLayout(new java.awt.GridBagLayout());

        jPanel5.setMinimumSize(new java.awt.Dimension(400, 201));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(286, 200));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jScrollPane3.setMinimumSize(new java.awt.Dimension(166, 100));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(166, 100));

        txtComentario.setColumns(20);
        txtComentario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtComentario.setLineWrap(true);
        txtComentario.setRows(5);
        txtComentario.setWrapStyleWord(true);
        txtComentario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtComentarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtComentarioKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(txtComentario);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel5.add(jScrollPane3, gridBagConstraints);

        txtContador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtContador.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtContador.setText("0/75 Caracteres");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel5.add(txtContador, gridBagConstraints);

        lblCaja.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblCaja.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        jPanel5.add(lblCaja, gridBagConstraints);

        lblEmpleado.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblEmpleado.setText("jLabel2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel5.add(lblEmpleado, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Monto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 5);
        jPanel5.add(jLabel3, gridBagConstraints);

        spCantidad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        spCantidad.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 5.0d));
        spCantidad.setMinimumSize(new java.awt.Dimension(150, 40));
        spCantidad.setPreferredSize(new java.awt.Dimension(150, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        jPanel5.add(spCantidad, gridBagConstraints);
        spCantidad.setUI(new SpinnerUI(Color.WHITE,new Color(139, 195, 74),Color.BLACK));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_guardar_normal.png"))); // NOI18N
        btnGuardar.setToolTipText("");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(btnGuardar, gridBagConstraints);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_cancelar_normal.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(btnCancelar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        jPanel5.add(jPanel1, gridBagConstraints);

        btnPADinicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_pad_normal.png"))); // NOI18N
        btnPADinicial.setBorder(null);
        btnPADinicial.setBorderPainted(false);
        btnPADinicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPADinicial.setFocusPainted(false);
        btnPADinicial.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_pad_pressed.png"))); // NOI18N
        btnPADinicial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_pad_over.png"))); // NOI18N
        btnPADinicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPADinicialActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel5.add(btnPADinicial, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        lblTitulo.add(jPanel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(lblTitulo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtComentarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComentarioKeyTyped
        if (txtComentario.getText().length() == 75) {
            evt.consume();
        }
    }//GEN-LAST:event_txtComentarioKeyTyped

    private void txtComentarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComentarioKeyReleased
        if (txtComentario.getText().length() <= 75) {
            txtContador.setText(
                    txtComentario.getText().length() + "/75 Caracteres"
            );
        }
    }//GEN-LAST:event_txtComentarioKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ModeloBitacoraCaja egreso = new ModeloBitacoraCaja(caja, empleado.getNombre(), new Date(), "EGRESO",
                new BigDecimal((double) spCantidad.getValue()), txtComentario.getText());
        try {
            manager.getBitacoraDAO().insertar(egreso);
            manager.getReportes().ticketEgreso(egreso);
            Mensajes.mensajeOk("Registro agregado exitosamente");
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        } finally {
            dispose();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPADinicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPADinicialActionPerformed
        // TODO add your handling code here:
        DialogNumPad dialog = new DialogNumPad(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        double numeroRecibido = dialog.getNumero();
        if (numeroRecibido > 0) {
            spCantidad.setValue(numeroRecibido);
        }
    }//GEN-LAST:event_btnPADinicialActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnPADinicial;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCaja;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JPanel lblTitulo;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JLabel txtContador;
    // End of variables declaration//GEN-END:variables

    private static final Logger LOG = Logger.getLogger(DialogRetiro.class.getName());

}
