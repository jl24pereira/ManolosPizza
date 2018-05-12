package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCostosIndirectos;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.SpinnerUI;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;

/* @author Jose Luis */
@SuppressWarnings ( "serial" )
public class DialogCostos extends javax.swing.JDialog {

    private final DAOManager manager;
    private ModeloCostosIndirectos vCostosIndirectos;
    private boolean nuevo = true;

    public DialogCostos ( java.awt.Frame parent , boolean modal , String titulo , DAOManager pManager ) {
        super ( parent , modal );
        this.manager = pManager;
        this.setTitle ( titulo );
        initComponents ();
        this.setLocationRelativeTo ( null );
    }

    public DialogCostos ( java.awt.Frame parent , boolean modal , String titulo , DAOManager pManager , ModeloCostosIndirectos pCostosIndirectos ) {
        super ( parent , modal );
        this.manager = pManager;
        this.vCostosIndirectos = pCostosIndirectos;
        this.setTitle ( titulo );
        this.nuevo = false;
        initComponents ();
        this.setLocationRelativeTo ( null );
        cargarForm ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtRubro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        spCosto = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(450, 250));
        setPreferredSize(new java.awt.Dimension(450, 250));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel5.setBackground(colorBG);
        jPanel5.setMinimumSize(new java.awt.Dimension(400, 201));
        jPanel5.setPreferredSize(new java.awt.Dimension(286, 200));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("(*) Rubro:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel5.add(jLabel3, gridBagConstraints);

        txtRubro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRubro.setMinimumSize(new java.awt.Dimension(200, 30));
        txtRubro.setPreferredSize(new java.awt.Dimension(200, 30));
        txtRubro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRubroKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel5.add(txtRubro, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Costo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel5.add(jLabel4, gridBagConstraints);

        spCosto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        spCosto.setModel(new javax.swing.SpinnerNumberModel(5.0d, 5.0d, 999.99d, 5.0d));
        spCosto.setBorder(javax.swing.BorderFactory.createLineBorder(colorUI, 2));
        spCosto.setMinimumSize(new java.awt.Dimension(100, 50));
        spCosto.setPreferredSize(new java.awt.Dimension(100, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel5.add(spCosto, gridBagConstraints);
        spCosto.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e53e(0)_128.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel5.add(jLabel1, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel5.add(jPanel1, gridBagConstraints);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_N.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_P.png"))); // NOI18N
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_O.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        jPanel2.add(btnGuardar, gridBagConstraints);

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_N.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_P.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_O.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        jPanel2.add(btnCancelar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        jPanel5.add(jPanel2, gridBagConstraints);

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

    private void txtRubroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRubroKeyReleased
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            spCosto.requestFocus ();
        }
    }//GEN-LAST:event_txtRubroKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if ( isComplete () ) {
            if ( nuevo ) {
                guardarNuevo ();
            } else {
                editarCosto ();
            }
        } else {
            Mensajes.mensajeAlert ( "Verificar campos requeridos! " );
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSpinner spCosto;
    private javax.swing.JTextField txtRubro;
    // End of variables declaration//GEN-END:variables

    private void cargarForm () {
        txtRubro.setText ( vCostosIndirectos.getRubro () );
        spCosto.setValue ( vCostosIndirectos.getCosto ().doubleValue () );
    }

    private void guardarNuevo () {
        vCostosIndirectos = new ModeloCostosIndirectos ( txtRubro.getText () , new BigDecimal ( ( double ) spCosto.getValue () ) );
        try {
            manager.getCostosIndirectosDAO ().insertar ( vCostosIndirectos );
            Mensajes.mensajeOk ( "Registro almacenado satisfactoriamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            dispose ();
        }
    }

    private void editarCosto () {
        vCostosIndirectos.setRubro ( txtRubro.getText () );
        vCostosIndirectos.setCosto ( new BigDecimal ( ( double ) spCosto.getValue () ) );
        try {
            manager.getCostosIndirectosDAO ().modificar ( vCostosIndirectos );
            Mensajes.mensajeOk ( "Registro editado satisfactoriamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            dispose ();
        }
    }

    private boolean isComplete () {
        return !( txtRubro.getText () == null || txtRubro.getText ().isEmpty () );
    }

    private static final Logger LOG = Logger.getLogger ( DialogCostos.class.
            getName () );

}
