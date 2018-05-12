package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloInsumo;
import com.pereira.manolos.negocio.modelos.ModeloMedida;
import com.pereira.manolos.negocio.modelos.ModeloUnidad;
import com.pereira.manolos.util.ComboUI;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.SpinnerUI;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.datos.database.Tables.MEDIDA;
import static com.pereira.manolos.datos.database.Tables.UNIDAD_MEDIDA;

/* @author Jose Luis */
@SuppressWarnings ( "serial" )
public class DialogInsumos extends javax.swing.JDialog {

    private final DAOManager manager;
    private ModeloInsumo insumo;
    private final DefaultComboBoxModel<ModeloUnidad> dcmUnidad = new DefaultComboBoxModel<> ();
    private final DefaultComboBoxModel<ModeloMedida> dcmMedida = new DefaultComboBoxModel<> ();
    private boolean nuevo = true;

    public DialogInsumos ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager , boolean isNormal ) {
        super ( parent , modal );
        this.manager = manager;
        initComponents ();
        cargarMedidas ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
        spExist.setEnabled ( isNormal );
        spPrecio.setEnabled ( isNormal );
    }

    public DialogInsumos ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager , ModeloInsumo insumo ) {
        super ( parent , modal );
        this.manager = manager;
        this.insumo = insumo;
        this.nuevo = false;
        initComponents ();
        cargarMedidas ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
        cargarForm ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pMain = new javax.swing.JPanel();
        pForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxUnidad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbxMedida = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        spPrecio = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spMax = new javax.swing.JSpinner();
        spMin = new javax.swing.JSpinner();
        spExist = new javax.swing.JSpinner();
        chkProduccion = new javax.swing.JCheckBox();
        pComandos = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(colorBG);
        pMain.setLayout(new java.awt.GridBagLayout());

        pForm.setOpaque(false);
        pForm.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("(*) Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pForm.add(jLabel1, gridBagConstraints);

        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setMinimumSize(new java.awt.Dimension(200, 35));
        txtNombre.setPreferredSize(new java.awt.Dimension(200, 35));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pForm.add(txtNombre, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Medida:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pForm.add(jLabel5, gridBagConstraints);

        cbxUnidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbxUnidad.setModel(dcmUnidad);
        cbxUnidad.setMinimumSize(new java.awt.Dimension(150, 30));
        cbxUnidad.setPreferredSize(new java.awt.Dimension(150, 35));
        cbxUnidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxUnidadItemStateChanged(evt);
            }
        });
        cbxUnidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbxUnidadKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pForm.add(cbxUnidad, gridBagConstraints);
        cbxUnidad.setUI(new ComboUI(colorBG,colorUI, colorBG));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Unidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pForm.add(jLabel6, gridBagConstraints);

        cbxMedida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbxMedida.setModel(dcmMedida);
        cbxMedida.setMinimumSize(new java.awt.Dimension(150, 30));
        cbxMedida.setPreferredSize(new java.awt.Dimension(150, 35));
        cbxMedida.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxMedidaItemStateChanged(evt);
            }
        });
        cbxMedida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbxMedidaKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pForm.add(cbxMedida, gridBagConstraints);
        cbxMedida.setUI(new ComboUI(colorBG,colorUI, colorBG));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("P. Compra:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pForm.add(jLabel7, gridBagConstraints);

        spPrecio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spPrecio.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 999.99d, 0.05d));
        spPrecio.setMinimumSize(new java.awt.Dimension(100, 35));
        spPrecio.setPreferredSize(new java.awt.Dimension(100, 35));
        spPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spPrecioKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        pForm.add(spPrecio, gridBagConstraints);
        JSpinner.NumberEditor numberEditor = new JSpinner.NumberEditor(spPrecio,"0.0000");
        spPrecio.setEditor(numberEditor);
        spPrecio.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Minimo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pForm.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Maximo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pForm.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Existencia:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pForm.add(jLabel10, gridBagConstraints);

        spMax.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spMax.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 999.0d, 1.0d));
        spMax.setMinimumSize(new java.awt.Dimension(100, 35));
        spMax.setPreferredSize(new java.awt.Dimension(100, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        pForm.add(spMax, gridBagConstraints);
        spMax.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        spMin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spMin.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 999.0d, 1.0d));
        spMin.setMinimumSize(new java.awt.Dimension(100, 35));
        spMin.setPreferredSize(new java.awt.Dimension(100, 35));
        spMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spMinKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        pForm.add(spMin, gridBagConstraints);
        spMin.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        spExist.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spExist.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 9999.0d, 1.0d));
        spExist.setMinimumSize(new java.awt.Dimension(100, 35));
        spExist.setPreferredSize(new java.awt.Dimension(100, 35));
        spExist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spExistKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        pForm.add(spExist, gridBagConstraints);
        spExist.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        chkProduccion.setBackground(colorBG);
        chkProduccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkProduccion.setText("Producción:");
        chkProduccion.setBorder(null);
        chkProduccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkProduccion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkProduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
        chkProduccion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pForm.add(chkProduccion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pMain.add(pForm, gridBagConstraints);

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

    private void cbxUnidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxUnidadItemStateChanged

    }//GEN-LAST:event_cbxUnidadItemStateChanged

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if ( nuevo ) {
            nuevoInsumo ();
        } else {
            editarInsumo ();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            cbxUnidad.requestFocus ();
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void cbxUnidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxUnidadKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            cbxMedida.requestFocus ();
        }
    }//GEN-LAST:event_cbxUnidadKeyReleased

    private void cbxMedidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxMedidaKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            spPrecio.requestFocus ();
        }
    }//GEN-LAST:event_cbxMedidaKeyReleased

    private void spPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spPrecioKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            spExist.requestFocus ();
        }
    }//GEN-LAST:event_spPrecioKeyReleased

    private void spExistKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spExistKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            spMin.requestFocus ();
        }
    }//GEN-LAST:event_spExistKeyReleased

    private void spMinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spMinKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            spMax.requestFocus ();
        }
    }//GEN-LAST:event_spMinKeyReleased

    private void cbxMedidaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxMedidaItemStateChanged
        cargarUnidades ();
    }//GEN-LAST:event_cbxMedidaItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<ModeloMedida> cbxMedida;
    private javax.swing.JComboBox<ModeloUnidad> cbxUnidad;
    private javax.swing.JCheckBox chkProduccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pComandos;
    private javax.swing.JPanel pForm;
    private javax.swing.JPanel pMain;
    private javax.swing.JSpinner spExist;
    private javax.swing.JSpinner spMax;
    private javax.swing.JSpinner spMin;
    private javax.swing.JSpinner spPrecio;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarMedidas () {
        dcmMedida.removeAllElements ();
        Condition c = MEDIDA.IDMEDIDA.greaterOrEqual ( 1 );
        try {
            manager.getMedidaDAO ().obtenerLista ( c ).stream ().forEach ( medida -> {
                dcmMedida.addElement ( medida );
            } );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            dispose ();
        }
        if ( dcmMedida.getSize () > 0 ) {
            cbxMedida.setSelectedIndex ( 0 );
        } else {
            Mensajes.mensajeError ( "Error: No existen Medidas!" );
            dispose ();
        }
    }

    private void cargarUnidades () {
        dcmUnidad.removeAllElements ();
        ModeloMedida medida = ( ModeloMedida ) cbxMedida.getSelectedItem ();
        Condition c = UNIDAD_MEDIDA.IDMEDIDA.equal ( medida.getIdmedida () );
        try {
            manager.getUnidadDAO ().obtenerLista ( c ).stream ().forEach ( unidad -> {
                dcmUnidad.addElement ( unidad );
            } );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            dispose ();
        }
        if ( dcmUnidad.getSize () > 0 ) {
            cbxUnidad.setSelectedIndex ( 0 );
        } else {
            Mensajes.mensajeError ( "Error: No existen Unidades!" );
            dispose ();
        }
    }

    private void cargarForm () {
        txtNombre.setText ( insumo.getNombre () );
        boolean seleccion = false;
        for ( int i = 0 ; i < dcmMedida.getSize () ; i++ ) {
            cbxMedida.setSelectedIndex ( i );
            for ( int j = 0 ; j < dcmUnidad.getSize () ; j++ ) {
                if ( dcmUnidad.getElementAt ( j ).getIdunidad () == insumo.getUnidad ().getIdunidad () ) {
                    cbxUnidad.setSelectedIndex ( j );
                    seleccion = true;
                    break;
                }
            }
            if ( seleccion ) {
                break;
            }
        }
        spMax.setValue ( insumo.getMaximo () );
        spMin.setValue ( insumo.getMinimo () );
        spExist.setValue ( insumo.getStock () );
        spPrecio.setValue ( insumo.getCosto ().doubleValue () );
        chkProduccion.setSelected ( insumo.isProduccion () );
    }

    private void nuevoInsumo () {
        insumo = new ModeloInsumo ( chkProduccion.isSelected () , new BigDecimal ( ( double ) spPrecio.getValue () ) , ( double ) spMax.getValue () ,
                                    ( double ) spMin.getValue () , txtNombre.getText () , ( double ) spExist.getValue () , ( ModeloUnidad ) cbxUnidad.
                                    getSelectedItem () );
        if ( isComplete () ) {
            try {
                manager.getInsumoDAO ().insertar ( insumo );
                Mensajes.mensajeOk ( "Registro agregado exitosamente! " );
            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
                Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            } finally {
                dispose ();
            }
        } else {
            Mensajes.mensajeAlert ( "Campos requeridos no validos!" );
        }
    }

    private void editarInsumo () {
        insumo.setNombre ( txtNombre.getText () );
        insumo.setMaximo ( ( double ) spMax.getValue () );
        insumo.setMinimo ( ( double ) spMin.getValue () );
        insumo.setStock ( ( double ) spExist.getValue () );
        insumo.setCosto ( new BigDecimal ( ( double ) spPrecio.getValue () ) );
        insumo.setUnidad ( ( ModeloUnidad ) cbxUnidad.getSelectedItem () );
        insumo.setProduccion ( chkProduccion.isSelected () );
        if ( isComplete () ) {
            try {
                manager.getInsumoDAO ().modificar ( insumo );
                Mensajes.mensajeOk ( "Registro editado exitosamente!" );
            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
                Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            } finally {
                dispose ();
            }
        } else {
            Mensajes.mensajeAlert ( "Campos requeridos no validos!" );
        }
    }

    private boolean isComplete () {
        return !( txtNombre.getText () == null || txtNombre.getText ().isEmpty () );
    }

    private static final Logger LOG = Logger.getLogger ( DialogInsumos.class.getName () );

}
