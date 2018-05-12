package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloMedida;
import com.pereira.manolos.negocio.modelos.ModeloReceta;
import com.pereira.manolos.negocio.modelos.ModeloUnidad;
import com.pereira.manolos.util.ComboUI;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.SpinnerUI;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.datos.database.Tables.MEDIDA;
import static com.pereira.manolos.datos.database.Tables.UNIDAD_MEDIDA;

/* @author Jose Luis */
@SuppressWarnings("serial")
public class DialogReceta extends javax.swing.JDialog {

    private final DAOManager manager;
    private ModeloReceta receta;
    private final DefaultComboBoxModel<ModeloUnidad> dcmUnidad = new DefaultComboBoxModel<>();
    private final DefaultComboBoxModel<ModeloMedida> dcmMedida = new DefaultComboBoxModel<>();
    private boolean nuevo = true;
    private static final Logger LOG = Logger.getLogger(DialogReceta.class.getName());

    public DialogReceta(java.awt.Frame parent, boolean modal, String titulo, DAOManager manager) {
        super(parent, modal);
        this.manager = manager;
        initComponents();
        cargarMedidas();
        this.setLocationRelativeTo(null);
        this.setTitle(titulo);
        cbxMedida.setSelectedIndex(0);
    }

    public DialogReceta(java.awt.Frame parent, boolean modal, String titulo, DAOManager manager, ModeloReceta receta) {
        super(parent, modal);
        this.manager = manager;
        this.receta = receta;
        this.nuevo = false;
        initComponents();
        cargarMedidas();
        this.setLocationRelativeTo(null);
        this.setTitle(titulo);
        cargarForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblTitulo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spRendimiento = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        spEstimado = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spMax = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        spMin = new javax.swing.JSpinner();
        cbxMedida = new javax.swing.JComboBox<>();
        cbxUnidad = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        spHoras = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        spMinutos = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        spStock = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        pComandos = new javax.swing.JPanel();
        btnCancelar1 = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(600, 550));
        setPreferredSize(new java.awt.Dimension(600, 550));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblTitulo.setBackground(colorBG);
        lblTitulo.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(colorBG);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel1, gridBagConstraints);

        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setMinimumSize(new java.awt.Dimension(200, 35));
        txtNombre.setPreferredSize(new java.awt.Dimension(200, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txtNombre, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Tipo de Receta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel2, gridBagConstraints);

        cbxTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RESTAURANTE", "COMPLEMENTARIA" }));
        cbxTipo.setMinimumSize(new java.awt.Dimension(150, 35));
        cbxTipo.setPreferredSize(new java.awt.Dimension(150, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(cbxTipo, gridBagConstraints);
        cbxTipo.setUI(new ComboUI(colorBG,colorUI, colorBG));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Medida:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Unidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Rendimiento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel5, gridBagConstraints);

        spRendimiento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spRendimiento.setModel(new javax.swing.SpinnerNumberModel(1.0d, 0.0d, null, 1.0d));
        spRendimiento.setMinimumSize(new java.awt.Dimension(100, 35));
        spRendimiento.setPreferredSize(new java.awt.Dimension(100, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(spRendimiento, gridBagConstraints);
        spRendimiento.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Stock Minimo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel6, gridBagConstraints);

        spEstimado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spEstimado.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));
        spEstimado.setMinimumSize(new java.awt.Dimension(100, 35));
        spEstimado.setPreferredSize(new java.awt.Dimension(100, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(spEstimado, gridBagConstraints);
        spEstimado.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Tiempo de Preparacion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Stock Maximo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel10, gridBagConstraints);

        spMax.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spMax.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));
        spMax.setMinimumSize(new java.awt.Dimension(100, 35));
        spMax.setPreferredSize(new java.awt.Dimension(100, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(spMax, gridBagConstraints);
        spMax.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Produccion Est. Mes:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel11, gridBagConstraints);

        spMin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spMin.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));
        spMin.setMinimumSize(new java.awt.Dimension(100, 35));
        spMin.setPreferredSize(new java.awt.Dimension(100, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(spMin, gridBagConstraints);
        spMin.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        cbxMedida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbxMedida.setModel(dcmMedida);
        cbxMedida.setMinimumSize(new java.awt.Dimension(150, 35));
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
        jPanel1.add(cbxMedida, gridBagConstraints);
        cbxMedida.setUI(new ComboUI(colorBG,colorUI, colorBG));

        cbxUnidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbxUnidad.setModel(dcmUnidad);
        cbxUnidad.setMinimumSize(new java.awt.Dimension(150, 35));
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
        jPanel1.add(cbxUnidad, gridBagConstraints);
        cbxUnidad.setUI(new ComboUI(colorBG,colorUI, colorBG));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        spHoras.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spHoras.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        spHoras.setMinimumSize(new java.awt.Dimension(100, 35));
        spHoras.setPreferredSize(new java.awt.Dimension(100, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        jPanel2.add(spHoras, gridBagConstraints);
        spHoras.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("MM:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel2.add(jLabel8, gridBagConstraints);

        spMinutos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spMinutos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spMinutos.setMinimumSize(new java.awt.Dimension(100, 35));
        spMinutos.setPreferredSize(new java.awt.Dimension(100, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        jPanel2.add(spMinutos, gridBagConstraints);
        spMinutos.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("HH:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel2.add(jLabel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jPanel2, gridBagConstraints);

        spStock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spStock.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));
        spStock.setMinimumSize(new java.awt.Dimension(100, 35));
        spStock.setPreferredSize(new java.awt.Dimension(100, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(spStock, gridBagConstraints);
        spStock.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Stock:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel12, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        lblTitulo.add(jPanel1, gridBagConstraints);

        pComandos.setOpaque(false);
        pComandos.setLayout(new java.awt.GridBagLayout());

        btnCancelar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_N.png"))); // NOI18N
        btnCancelar1.setBorder(null);
        btnCancelar1.setBorderPainted(false);
        btnCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_P.png"))); // NOI18N
        btnCancelar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_O.png"))); // NOI18N
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pComandos.add(btnCancelar1, gridBagConstraints);

        btnGuardar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_N.png"))); // NOI18N
        btnGuardar1.setBorder(null);
        btnGuardar1.setBorderPainted(false);
        btnGuardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_P.png"))); // NOI18N
        btnGuardar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_O.png"))); // NOI18N
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pComandos.add(btnGuardar1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        lblTitulo.add(pComandos, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(lblTitulo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxMedidaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxMedidaItemStateChanged
        cargarUnidades();
    }//GEN-LAST:event_cbxMedidaItemStateChanged

    private void cbxMedidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxMedidaKeyReleased

    }//GEN-LAST:event_cbxMedidaKeyReleased

    private void cbxUnidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxUnidadItemStateChanged

    }//GEN-LAST:event_cbxUnidadItemStateChanged

    private void cbxUnidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxUnidadKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbxMedida.requestFocus();
        }
    }//GEN-LAST:event_cbxUnidadKeyReleased

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        if (nuevo) {
            nuevaReceta();
        } else {
            editarReceta();
        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JComboBox<ModeloMedida> cbxMedida;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JComboBox<ModeloUnidad> cbxUnidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel lblTitulo;
    private javax.swing.JPanel pComandos;
    private javax.swing.JSpinner spEstimado;
    private javax.swing.JSpinner spHoras;
    private javax.swing.JSpinner spMax;
    private javax.swing.JSpinner spMin;
    private javax.swing.JSpinner spMinutos;
    private javax.swing.JSpinner spRendimiento;
    private javax.swing.JSpinner spStock;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarMedidas() {
        dcmMedida.removeAllElements();
        Condition c = MEDIDA.IDMEDIDA.greaterOrEqual(1);
        try {
            manager.getMedidaDAO().obtenerLista(c).stream().forEach(medida -> {
                dcmMedida.addElement(medida);
            });
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
            dispose();
        }
        if (dcmMedida.getSize() > 0) {
            cbxMedida.setSelectedIndex(0);
        } else {
            Mensajes.mensajeError("Error: No existen Medidas!");
            dispose();
        }
    }

    private void cargarUnidades() {
        dcmUnidad.removeAllElements();
        ModeloMedida medida = (ModeloMedida) cbxMedida.getSelectedItem();
        Condition c = UNIDAD_MEDIDA.IDMEDIDA.equal(medida.getIdmedida());
        try {
            manager.getUnidadDAO().obtenerLista(c).stream().forEach(unidad -> {
                dcmUnidad.addElement(unidad);
            });
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
            dispose();
        }
        if (dcmUnidad.getSize() > 0) {
            cbxUnidad.setSelectedIndex(0);
        } else {
            Mensajes.mensajeError("Error: No existen Unidades!");
            dispose();
        }
    }

    private void cargarForm() {
        txtNombre.setText(receta.getNombre());
        cbxTipo.setSelectedItem(receta.getTiporeceta());
        boolean seleccion = false;
        for (int i = 0; i < dcmMedida.getSize(); i++) {
            cbxMedida.setSelectedIndex(i);
            for (int j = 0; j < dcmUnidad.getSize(); j++) {
                if (dcmUnidad.getElementAt(j).getIdunidad() == receta.getUnidad().getIdunidad()) {
                    cbxUnidad.setSelectedIndex(j);
                    seleccion = true;
                    break;
                }
            }
            if (seleccion) {
                break;
            }
        }
        spStock.setValue(receta.getStock());
        spRendimiento.setValue(receta.getRendimiento());
        spEstimado.setValue(receta.getEstimadomensual());
        spMax.setValue(receta.getMaximo());
        spMin.setValue(receta.getMinimo());
        spHoras.setValue(receta.getHoras());
        spMinutos.setValue(receta.getMinutos());
    }

    private void nuevaReceta() {
        receta = new ModeloReceta(txtNombre.getText(), cbxTipo.getSelectedItem().toString(), (ModeloUnidad) cbxUnidad.getSelectedItem(),
                new BigDecimal(0), (double) spStock.getValue(), (double) spRendimiento.getValue(), (double) spEstimado.getValue(), (double) spMin.getValue(),
                (double) spMax.getValue(), (int) spMinutos.getValue(),
                (int) spHoras.getValue());
        try {
            manager.getRecetaDAO().insertar(receta);
            Mensajes.mensajeOk("Registro almacenado exitosamente!");
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        } finally {
            dispose();
        }

    }

    private void editarReceta() {
        receta.setNombre(txtNombre.getText());
        receta.setTiporeceta(cbxTipo.getSelectedItem().toString());
        receta.setUnidad((ModeloUnidad) cbxUnidad.getSelectedItem());
        receta.setRendimiento((double) spRendimiento.getValue());
        receta.setEstimadomensual((double) spEstimado.getValue());
        receta.setMaximo((double) spMax.getValue());
        receta.setMinimo((double) spMin.getValue());
        receta.setMinutos((int) spMinutos.getValue());
        receta.setHoras((int) spHoras.getValue());
        receta.setStock((double) spStock.getValue());
        try {
            manager.getRecetaDAO().modificar(receta);
            manager.getRecetaDAO().actualizarCosto(receta);
            Mensajes.mensajeOk("Registro editado exitosamente!");
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        } finally {
            dispose();
        }
    }

}
