package com.pereira.manolos.cliente.dialogs;

import com.pereira.manolos.datos.database.Tables;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloBitacoraCaja;
import com.pereira.manolos.negocio.modelos.ModeloCaja;
import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.negocio.modelos.ModeloResolucion;
import com.pereira.manolos.negocio.modelos.ModeloVenta;
import com.pereira.manolos.util.DialogNumPad;
import com.pereira.manolos.util.Fechero;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.SpinnerUI;
import java.awt.Color;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.jooq.Condition;

import static com.pereira.manolos.datos.database.Tables.BITACORA_CAJA;

/* @author Jose Luis */
@SuppressWarnings("serial")
public class DialogCaja extends javax.swing.JDialog {

    private DAOManager manager;
    private ModeloCaja caja;
    private ModeloEmpleado empleado;

    public DialogCaja(java.awt.Frame parent, boolean modal, String titulo, DAOManager manager, ModeloEmpleado empleado) {
        super(parent, modal);
        this.manager = manager;
        this.empleado = empleado;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle(titulo);
        String ip = null;
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
            dispose();
        }
        try {
            caja = manager.getCajaDAO().findByIp(ip);
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pMain = new javax.swing.JPanel();
        pFormulario = new javax.swing.JPanel();
        pForm = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sprInicial = new javax.swing.JSpinner();
        txtVentas = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtTotalIngresos = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtTotalCaja = new javax.swing.JTextField();
        sprEfectivo = new javax.swing.JSpinner();
        jSeparator5 = new javax.swing.JSeparator();
        txtDiferencia = new javax.swing.JTextField();
        btnPADinicial = new javax.swing.JButton();
        btnPADEfectivo = new javax.swing.JButton();
        txtTotalEgresos = new javax.swing.JTextField();
        txtDevoluciones = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pControles = new javax.swing.JPanel();
        btnCorteX = new javax.swing.JButton();
        btnAperura = new javax.swing.JButton();
        btnCorteProductos = new javax.swing.JButton();
        btnVentasDia = new javax.swing.JButton();
        btnCierre = new javax.swing.JButton();
        btnCorteZ = new javax.swing.JButton();
        btnCorteGZ = new javax.swing.JButton();
        btnRetiros = new javax.swing.JButton();
        btnDevoluciones = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblMovimiento = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCaja = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(java.awt.Color.white);
        pMain.setLayout(new java.awt.GridBagLayout());

        pFormulario.setBackground(new java.awt.Color(255, 255, 255));
        pFormulario.setMinimumSize(new java.awt.Dimension(400, 600));
        pFormulario.setOpaque(false);
        pFormulario.setPreferredSize(new java.awt.Dimension(400, 600));
        pFormulario.setLayout(new java.awt.GridBagLayout());

        pForm.setMinimumSize(new java.awt.Dimension(200, 0));
        pForm.setOpaque(false);
        pForm.setPreferredSize(new java.awt.Dimension(200, 0));
        pForm.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Saldo Inicial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pForm.add(jLabel7, gridBagConstraints);
        jLabel7.getAccessibleContext().setAccessibleName("");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("+ Ventas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pForm.add(jLabel8, gridBagConstraints);
        jLabel8.getAccessibleContext().setAccessibleName("");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("<html><body>= Total de<br>Ingresos</body></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pForm.add(jLabel9, gridBagConstraints);
        jLabel9.getAccessibleContext().setAccessibleName("");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("<html><body>- Total de<br>Egresos</body></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pForm.add(jLabel10, gridBagConstraints);
        jLabel10.getAccessibleContext().setAccessibleName("");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("<html><body>= Total<br>en Caja</body></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pForm.add(jLabel11, gridBagConstraints);
        jLabel11.getAccessibleContext().setAccessibleName("");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("<html><body>- Efectivo<br>en Caja</body></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pForm.add(jLabel12, gridBagConstraints);
        jLabel12.getAccessibleContext().setAccessibleName("");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("<html><body>= Diferencia de<br> Efectivo</body></html>");
        jLabel13.setMinimumSize(new java.awt.Dimension(94, 34));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pForm.add(jLabel13, gridBagConstraints);
        jLabel13.getAccessibleContext().setAccessibleName("");

        sprInicial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sprInicial.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 10.0d));
        sprInicial.setMinimumSize(new java.awt.Dimension(60, 40));
        sprInicial.setPreferredSize(new java.awt.Dimension(60, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pForm.add(sprInicial, gridBagConstraints);
        sprInicial.setUI(new SpinnerUI(Color.WHITE,new Color(139, 195, 74),Color.BLACK));

        txtVentas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtVentas.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtVentas.setEnabled(false);
        txtVentas.setMinimumSize(new java.awt.Dimension(60, 40));
        txtVentas.setPreferredSize(new java.awt.Dimension(60, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pForm.add(txtVentas, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pForm.add(jSeparator3, gridBagConstraints);

        txtTotalIngresos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTotalIngresos.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtTotalIngresos.setEnabled(false);
        txtTotalIngresos.setMinimumSize(new java.awt.Dimension(60, 40));
        txtTotalIngresos.setPreferredSize(new java.awt.Dimension(60, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pForm.add(txtTotalIngresos, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pForm.add(jSeparator4, gridBagConstraints);

        txtTotalCaja.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTotalCaja.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtTotalCaja.setEnabled(false);
        txtTotalCaja.setMinimumSize(new java.awt.Dimension(60, 40));
        txtTotalCaja.setPreferredSize(new java.awt.Dimension(60, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pForm.add(txtTotalCaja, gridBagConstraints);

        sprEfectivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sprEfectivo.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 10.0d));
        sprEfectivo.setMinimumSize(new java.awt.Dimension(60, 40));
        sprEfectivo.setPreferredSize(new java.awt.Dimension(60, 40));
        sprEfectivo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sprEfectivoStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pForm.add(sprEfectivo, gridBagConstraints);
        sprEfectivo.setUI(new SpinnerUI(Color.WHITE,new Color(139, 195, 74),Color.BLACK));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pForm.add(jSeparator5, gridBagConstraints);

        txtDiferencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDiferencia.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtDiferencia.setEnabled(false);
        txtDiferencia.setMinimumSize(new java.awt.Dimension(60, 40));
        txtDiferencia.setPreferredSize(new java.awt.Dimension(60, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pForm.add(txtDiferencia, gridBagConstraints);

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
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pForm.add(btnPADinicial, gridBagConstraints);

        btnPADEfectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_pad_normal.png"))); // NOI18N
        btnPADEfectivo.setBorder(null);
        btnPADEfectivo.setBorderPainted(false);
        btnPADEfectivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPADEfectivo.setFocusPainted(false);
        btnPADEfectivo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_pad_pressed.png"))); // NOI18N
        btnPADEfectivo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_pad_over.png"))); // NOI18N
        btnPADEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPADEfectivoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pForm.add(btnPADEfectivo, gridBagConstraints);

        txtTotalEgresos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTotalEgresos.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtTotalEgresos.setEnabled(false);
        txtTotalEgresos.setMinimumSize(new java.awt.Dimension(60, 40));
        txtTotalEgresos.setPreferredSize(new java.awt.Dimension(60, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pForm.add(txtTotalEgresos, gridBagConstraints);

        txtDevoluciones.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDevoluciones.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtDevoluciones.setEnabled(false);
        txtDevoluciones.setMinimumSize(new java.awt.Dimension(60, 40));
        txtDevoluciones.setPreferredSize(new java.awt.Dimension(60, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pForm.add(txtDevoluciones, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("- Devoluciones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pForm.add(jLabel14, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        pFormulario.add(pForm, gridBagConstraints);

        pControles.setMaximumSize(new java.awt.Dimension(300, 75));
        pControles.setMinimumSize(new java.awt.Dimension(300, 75));
        pControles.setOpaque(false);
        pControles.setPreferredSize(new java.awt.Dimension(300, 75));
        pControles.setLayout(new java.awt.GridBagLayout());

        btnCorteX.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCorteX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/BTN_CORTEX_NORMAL.png"))); // NOI18N
        btnCorteX.setBorder(null);
        btnCorteX.setBorderPainted(false);
        btnCorteX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCorteX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorteXActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pControles.add(btnCorteX, gridBagConstraints);

        btnAperura.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAperura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/BTN_APERTURA_NORMAL.png"))); // NOI18N
        btnAperura.setBorder(null);
        btnAperura.setBorderPainted(false);
        btnAperura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAperura.setFocusPainted(false);
        btnAperura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAperuraActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pControles.add(btnAperura, gridBagConstraints);

        btnCorteProductos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCorteProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/BTN_CORTEPX_NORMAL.png"))); // NOI18N
        btnCorteProductos.setBorder(null);
        btnCorteProductos.setBorderPainted(false);
        btnCorteProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCorteProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorteProductosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pControles.add(btnCorteProductos, gridBagConstraints);

        btnVentasDia.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnVentasDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/BTN_VTASDIARIAS_NORMAL.png"))); // NOI18N
        btnVentasDia.setBorder(null);
        btnVentasDia.setBorderPainted(false);
        btnVentasDia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentasDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasDiaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pControles.add(btnVentasDia, gridBagConstraints);

        btnCierre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCierre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/BTN_CIERRE_NORMAL.png"))); // NOI18N
        btnCierre.setBorder(null);
        btnCierre.setBorderPainted(false);
        btnCierre.setContentAreaFilled(false);
        btnCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCierreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pControles.add(btnCierre, gridBagConstraints);

        btnCorteZ.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCorteZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/BTN_CORTEZ_NORMAL.png"))); // NOI18N
        btnCorteZ.setBorder(null);
        btnCorteZ.setBorderPainted(false);
        btnCorteZ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCorteZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorteZActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pControles.add(btnCorteZ, gridBagConstraints);

        btnCorteGZ.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCorteGZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/BTN_CORTEGZ_NORMAL.png"))); // NOI18N
        btnCorteGZ.setBorder(null);
        btnCorteGZ.setBorderPainted(false);
        btnCorteGZ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCorteGZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorteGZActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pControles.add(btnCorteGZ, gridBagConstraints);

        btnRetiros.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRetiros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/BTN_RETIROS_NORMAL.png"))); // NOI18N
        btnRetiros.setBorder(null);
        btnRetiros.setBorderPainted(false);
        btnRetiros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pControles.add(btnRetiros, gridBagConstraints);

        btnDevoluciones.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDevoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/BTN_DEVOLUCIONES_NORMAL.png"))); // NOI18N
        btnDevoluciones.setBorder(null);
        btnDevoluciones.setBorderPainted(false);
        btnDevoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pControles.add(btnDevoluciones, gridBagConstraints);

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/BTN_CANCELAR_NORMAL.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pControles.add(btnCancelar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        pFormulario.add(pControles, gridBagConstraints);

        lblMovimiento.setBackground(new java.awt.Color(139, 195, 74));
        lblMovimiento.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblMovimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMovimiento.setText("Movimiento");
        lblMovimiento.setOpaque(true);
        lblMovimiento.setPreferredSize(new java.awt.Dimension(212, 70));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pFormulario.add(lblMovimiento, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(197, 225, 165));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Caja:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        jPanel2.add(jLabel3, gridBagConstraints);

        txtCaja.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtCaja.setText("txtCaja");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel2.add(txtCaja, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Cajero:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        jPanel2.add(jLabel5, gridBagConstraints);

        txtEmpleado.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtEmpleado.setText("txtEmpleado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel2.add(txtEmpleado, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pFormulario.add(jPanel2, gridBagConstraints);

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

    private void btnAperuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAperuraActionPerformed
        List<ModeloResolucion> resoluciones = new ArrayList<>();
        Condition activa = Tables.RESOLUCION.ACTIVA.eq(true);
        Condition ca = Tables.RESOLUCION.IDCAJA.eq(this.caja.getIdcaja());
        try {
            resoluciones = manager.getResolucionDAO().obtenerLista(activa.and(ca));
            if (resoluciones.isEmpty()) {
                activa = Tables.RESOLUCION.ACTIVA.eq(false);
                ca = Tables.RESOLUCION.TKTACTUAL.eq(0).and(Tables.RESOLUCION.IDCAJA.eq(caja.getIdcaja()));
                resoluciones.clear();
                resoluciones = manager.getResolucionDAO().obtenerLista(activa.and(ca));
                if (resoluciones.isEmpty()) {
                    Mensajes.mensajeAlert("No existen resoluciones activas para esta caja, consultar con Administrador!");
                } else {
                    activarResolucion(resoluciones.get(0));
                }
            } else {
                registrarApertura();
            }
        } catch (Exception ex) {
            Logger.getLogger(DialogCaja.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAperuraActionPerformed

    private void btnCorteXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorteXActionPerformed
        //registrarCorteX ();
        if (Double.parseDouble(txtDiferencia.getText()) != 0) {
            int i = Mensajes.mensajeSiNo("Se realizara el cierre de caja, hay diferencia de efectivo\nRealizar Corte Parcial X?");
            if (i == 0) {
                registrarCorteX();
            }
        } else {
            registrarCorteX();
        }
    }//GEN-LAST:event_btnCorteXActionPerformed

    private void sprEfectivoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sprEfectivoStateChanged
        // TODO add your handling code here:
        txtDiferencia.setText("" + carlcularDiferencia());
    }//GEN-LAST:event_sprEfectivoStateChanged

    private void btnPADinicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPADinicialActionPerformed
        // TODO add your handling code here:
        DialogNumPad dialog = new DialogNumPad(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        double numeroRecibido = dialog.getNumero();
        if (numeroRecibido > 0) {
            sprInicial.setValue(numeroRecibido);
        }
    }//GEN-LAST:event_btnPADinicialActionPerformed

    private void btnPADEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPADEfectivoActionPerformed
        DialogNumPad dialog = new DialogNumPad(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        double numeroRecibido = dialog.getNumero();
        if (numeroRecibido > 0) {
            sprEfectivo.setValue(numeroRecibido);
        }
    }//GEN-LAST:event_btnPADEfectivoActionPerformed

    private void btnCorteProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorteProductosActionPerformed
        try {
            manager.getReportes().reporteCierreStock();
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
            dispose();
        }
    }//GEN-LAST:event_btnCorteProductosActionPerformed

    private void btnVentasDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasDiaActionPerformed
        try {
            //Reportes.reporteVentasDiarias ();
            manager.getReportes().reporteVentasDiarias();
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
            dispose();
        }
    }//GEN-LAST:event_btnVentasDiaActionPerformed

    private void btnCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCierreActionPerformed
        if (Double.parseDouble(txtDiferencia.getText()) != 0) {
            int i = Mensajes.mensajeSiNo("Hay diferencia de efectivo, \n desea realizar el cierre?");
            if (i == 0) {
                registrarCierre();
            }
        } else {
            registrarCierre();
        }
    }//GEN-LAST:event_btnCierreActionPerformed

    private void btnCorteZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorteZActionPerformed
        if (caja.isEstado()) {
            if (Double.parseDouble(txtDiferencia.getText()) != 0) {
                int i = Mensajes.mensajeSiNo("Se realizara el cierre de caja, hay diferencia de efectivo\nRealizar Corte Diario Z?");
                if (i == 0) {
                    registrarCorteZ();
                }
            } else {
                registrarCorteZ();
            }
        } else {
            int i = Mensajes.mensajeSiNo("Se realizara el Corte Diario Z, no se podrá efectuar ninguna venta durante el presente día"
                    + "\nRealizar Corte Diario Z?");
            if (i == 0) {
                registrarCorteZ();
            }
        }
    }//GEN-LAST:event_btnCorteZActionPerformed

    private void btnCorteGZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorteGZActionPerformed
        int i = Mensajes.mensajeSiNo("Se realizara el Corte Mensual Gran Z, no se permite realizarse mas de una vez al mes"
                + "\nRealizar Corte Mensual Gran Z?");
        if (i == 0) {
            registrarCorteGZ();
        }
    }//GEN-LAST:event_btnCorteGZActionPerformed

    private void btnRetirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirosActionPerformed
        DialogRetiro dialogRetiro = new DialogRetiro(new JFrame(), true, "RETIRO DE EFECTIVO", manager, caja, empleado);
        dialogRetiro.setVisible(true);
        cargarCierre();
    }//GEN-LAST:event_btnRetirosActionPerformed

    private void btnDevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionesActionPerformed
        DialogDevolucion devolucion = new DialogDevolucion(new JFrame(), true, manager, caja, empleado);
        devolucion.setVisible(true);
        cargarCierre();
    }//GEN-LAST:event_btnDevolucionesActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (!caja.isBaja()) {
            dispose();
        } else {
            cargarForm();
        }
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAperura;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCierre;
    private javax.swing.JButton btnCorteGZ;
    private javax.swing.JButton btnCorteProductos;
    private javax.swing.JButton btnCorteX;
    private javax.swing.JButton btnCorteZ;
    private javax.swing.JButton btnDevoluciones;
    private javax.swing.JButton btnPADEfectivo;
    private javax.swing.JButton btnPADinicial;
    private javax.swing.JButton btnRetiros;
    private javax.swing.JButton btnVentasDia;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblMovimiento;
    private javax.swing.JPanel pControles;
    private javax.swing.JPanel pForm;
    private javax.swing.JPanel pFormulario;
    private javax.swing.JPanel pMain;
    private javax.swing.JSpinner sprEfectivo;
    private javax.swing.JSpinner sprInicial;
    private javax.swing.JLabel txtCaja;
    private javax.swing.JTextField txtDevoluciones;
    private javax.swing.JTextField txtDiferencia;
    private javax.swing.JLabel txtEmpleado;
    private javax.swing.JTextField txtTotalCaja;
    private javax.swing.JTextField txtTotalEgresos;
    private javax.swing.JTextField txtTotalIngresos;
    private javax.swing.JTextField txtVentas;
    // End of variables declaration//GEN-END:variables

    private void cargarForm() {
        validarForm();
        txtEmpleado.setText(empleado.getNombre());
        btnCorteGZ.setEnabled(!isCorteGZ());
        if (isCorteZ()) {
            Mensajes.mensajeAlert("El Corte Z ha sido realizado\n no puede abrir caja durante la presente fecha!");
            btnCorteZ.setEnabled(false);
            btnAperura.setEnabled(false);
            btnCorteX.setEnabled(false);
            btnCierre.setEnabled(false);
            btnDevoluciones.setEnabled(false);
            btnRetiros.setEnabled(false);
        } else if (caja.isEstado()) {
            lblMovimiento.setText("CIERRE DE CAJA");
            cargarCierre();
        } else {
            lblMovimiento.setText("APERTURA DE CAJA");
            cargarApertura();
        }
        txtCaja.setText(caja.getDetalle());
    }

    private void validarForm() {
        if (caja.isEstado()) {
            sprInicial.setEnabled(false);
            btnPADinicial.setEnabled(false);
            sprEfectivo.setEnabled(true);
            btnPADEfectivo.setEnabled(true);
        } else {
            sprInicial.setEnabled(true);
            btnPADinicial.setEnabled(true);
            sprEfectivo.setEnabled(false);
            btnPADEfectivo.setEnabled(false);
        }
    }

    private void activarResolucion(ModeloResolucion resolucion) {
        resolucion.setActiva(true);
        try {
            manager.getResolucionDAO().modificar(resolucion);
            Mensajes.mensajeInfo("Nueva resolución activada: " + resolucion.getResolucion() + " Informe a su administrador!");
            registrarApertura();
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
            dispose();
        }
    }

    private void registrarApertura() {
        ModeloBitacoraCaja apertura = new ModeloBitacoraCaja(caja, empleado.getNombre(), new Date(), "APERTURA",
                new BigDecimal((double) sprInicial.getValue()), "");
        try {
            manager.getBitacoraDAO().insertar(apertura);
            caja.setEstado(true);
            manager.getReportes().aperturaCaja(empleado.getNombre(), new BigDecimal((double) sprInicial.getValue()));
            manager.getCajaDAO().modificar(caja);
            Mensajes.mensajeOk("Apertura realizada!");
            cargarForm();
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
            dispose();
        }
    }

    private void cargarApertura() {
        btnCierre.setEnabled(false);
        //btnCorteGZ.setEnabled ( false );
        //btnCorteProductos.setEnabled ( false );
        btnCorteX.setEnabled(false);
        //btnCorteZ.setEnabled ( false );
        btnDevoluciones.setEnabled(false);
        btnRetiros.setEnabled(false);
        btnAperura.setEnabled(true);
        //btnVentasDia.setEnabled ( false );
    }

    private void registrarCierre() {
        ModeloBitacoraCaja efectivo = new ModeloBitacoraCaja(caja, empleado.getNombre(), new Date(), "EFECTIVO",
                new BigDecimal((double) sprEfectivo.getValue()), "");

        ModeloBitacoraCaja cierre = new ModeloBitacoraCaja(caja, empleado.getNombre(), new Date(), "CIERRE",
                new BigDecimal(txtDiferencia.getText()), "");
        try {
            ModeloBitacoraCaja apertura = manager.getBitacoraDAO().encuentraUltimaApertura(caja.getIdcaja());
            apertura.setCaja(caja);
            manager.getBitacoraDAO().insertar(efectivo);
            manager.getBitacoraDAO().insertar(cierre);
            caja.setEstado(false);
            manager.getCajaDAO().modificar(caja);
            manager.getReportes().cierreCaja(empleado.getNombre(), Fechero.realToBase(apertura.getFecha()),
                    Fechero.realToBase(cierre.getFecha()), caja);
            Mensajes.mensajeInfo("Cierre de caja realizado!");
            cargarForm();
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
            dispose();
        }
    }

    private void cargarCierre() {
        ModeloBitacoraCaja apertura = null;
        try {
            apertura = manager.getBitacoraDAO().encuentraUltimaApertura(caja.getIdcaja());
            apertura.setCaja(caja);
        } catch (Exception ex) {
            Logger.getLogger(DialogCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
        sprInicial.setValue(apertura.getValor().doubleValue());
        java.sql.Timestamp fecha = Fechero.realToBase(new Date());
        BigDecimal ventas = null;
        BigDecimal egresos = null;
        BigDecimal devoluciones = null;
        try {
            ventas = manager.getBitacoraDAO().buscarVentas(apertura);
            egresos = manager.getBitacoraDAO().buscarEgresos(apertura);
            devoluciones = manager.getBitacoraDAO().buscarDevoluciones(apertura);
        } catch (Exception ex) {
            Logger.getLogger(DialogCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (ventas == null) {
            ventas = new BigDecimal(0.00);
        }
        if (egresos == null) {
            egresos = new BigDecimal(0.00);
        }
        if (devoluciones == null) {
            devoluciones = new BigDecimal(0.00);
        }
        txtVentas.setText("" + (ventas.doubleValue() + devoluciones.doubleValue()));
        txtTotalEgresos.setText("" + egresos);
        txtTotalIngresos.setText("" + totalIngresos());
        txtTotalCaja.setText("" + totalCaja());
        txtDiferencia.setText("" + carlcularDiferencia());
        btnAperura.setEnabled(false);
        btnCierre.setEnabled(true);
        btnCorteX.setEnabled(true);
    }

    private double totalIngresos() {
        double inicial = (double) sprInicial.getValue();
        double ventas = Double.parseDouble(txtVentas.getText());
        return inicial + ventas;
    }

    private double totalCaja() {
        double egresos = Double.parseDouble(txtTotalEgresos.getText());
        return totalIngresos() - egresos;
    }

    private double carlcularDiferencia() {
        double efectivo = (double) sprEfectivo.getValue();
        return efectivo - totalCaja();
    }

    private void registrarCorteX() {
        try {
            /*REGISTRANDO CORTE X EN VENTAS*/
            ModeloResolucion resolucion = manager.getResolucionDAO().getResolucionByCaja(caja);
            ModeloVenta corteX = new ModeloVenta();
            corteX.setNumerofactura(manager.getVentaDAO().getTicket(resolucion));
            corteX.setEmpleado(empleado);
            corteX.setResolucion(resolucion);
            corteX.setTipodoc("TKT");
            corteX.setFecha(new Date());
            corteX.setTotal(BigDecimal.ZERO);
            corteX.setGravado(BigDecimal.ZERO);
            corteX.setExento(BigDecimal.ZERO);
            corteX.setNosujeto(BigDecimal.ZERO);
            corteX.setTipoventa("CORTE X");
            corteX.setEnletras("CORTE X");
            manager.getVentaDAO().insertarSinCliente(corteX);
            /*ACTUALIZANDO LA RESOLUCION*/
            corteX.getResolucion().setTktactual(corteX.getResolucion().getTktactual() + 1);
            if (corteX.getResolucion().getTktactual() == corteX.getResolucion().getTktfinal()) {
                corteX.getResolucion().setActiva(false);
            } else if (corteX.getResolucion().getTktactual() >= (corteX.getResolucion().getTktfinal() - corteX.getResolucion().getTktalerta())) {
                Mensajes.mensajeAlert("La resolución tiene: " + (corteX.getResolucion().getTktfinal() - corteX.getResolucion().getTktactual())
                        + " transacciones disponibles\n contactar con Administrador");
            }
            manager.getResolucionDAO().modificar(corteX.getResolucion());
            /*REGISTRANDO MOVIMIENTO EN BITACORA DE CAJA*/
            ModeloBitacoraCaja corteXBit = new ModeloBitacoraCaja(caja, empleado.getNombre(), new Date(), "CORTE X", BigDecimal.ZERO,
                    corteX.getNumerofactura());
            manager.getBitacoraDAO().insertar(corteXBit);
            /*IMPRIMIENDO REPORTE CORTE X*/
            ModeloBitacoraCaja apertura = manager.getBitacoraDAO().encuentraUltimaApertura(caja.getIdcaja());
            manager.getReportes().corteX(Fechero.realToBase(apertura.getFecha()), Fechero.realToBase(new Date()), caja.getIdcaja());
            registrarCierre();
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        } finally {
            dispose();
        }
    }

    private void registrarCorteZ() {
        try {
            /*REGISTRANDO CORTE Z EN VENTAS*/
            ModeloResolucion resolucion = manager.getResolucionDAO().getResolucionByCaja(caja);
            ModeloVenta corteZ = new ModeloVenta();
            corteZ.setNumerofactura(manager.getVentaDAO().getTicket(resolucion));
            corteZ.setEmpleado(empleado);
            corteZ.setResolucion(resolucion);
            corteZ.setTipodoc("TKT");
            corteZ.setFecha(new Date());
            corteZ.setTotal(BigDecimal.ZERO);
            corteZ.setGravado(BigDecimal.ZERO);
            corteZ.setExento(BigDecimal.ZERO);
            corteZ.setNosujeto(BigDecimal.ZERO);
            corteZ.setTipoventa("CORTE Z");
            corteZ.setEnletras("CORTE Z");
            manager.getVentaDAO().insertarSinCliente(corteZ);
            /*ACTUALIZANDO LA RESOLUCION*/
            corteZ.getResolucion().setTktactual(corteZ.getResolucion().getTktactual() + 1);
            if (corteZ.getResolucion().getTktactual() == corteZ.getResolucion().getTktfinal()) {
                corteZ.getResolucion().setActiva(false);
            } else if (corteZ.getResolucion().getTktactual() >= (corteZ.getResolucion().getTktfinal() - corteZ.getResolucion().getTktalerta())) {
                Mensajes.mensajeAlert("La resolución tiene: " + (corteZ.getResolucion().getTktfinal() - corteZ.getResolucion().getTktactual())
                        + " transacciones disponibles\n contactar con Administrador");
            }
            manager.getResolucionDAO().modificar(corteZ.getResolucion());
            /*REGISTRANDO MOVIMIENTO EN BITACORA DE CAJA*/
            ModeloBitacoraCaja corteZBit = new ModeloBitacoraCaja(caja, empleado.getNombre(), new Date(), "CORTE Z", BigDecimal.ZERO,
                    corteZ.getNumerofactura());
            manager.getBitacoraDAO().insertar(corteZBit);
            /*IMPRIMIENDO REPORTE CORTE Z*/
            Calendar calendarI = Calendar.getInstance();
            calendarI.set(Calendar.AM_PM, Calendar.AM);
            calendarI.set(Calendar.HOUR, 0);
            calendarI.set(Calendar.MINUTE, 0);
            calendarI.set(Calendar.SECOND, 1);
            Calendar calendarF = Calendar.getInstance();
            calendarF.set(Calendar.HOUR, 23);
            calendarF.set(Calendar.MINUTE, 59);
            calendarF.set(Calendar.SECOND, 59);
            //System.out.println("la fecha es: " + calendarI.getTime());
            manager.getReportes().corteZ(Fechero.realToBase(calendarI.getTime()), Fechero.realToBase(calendarF.getTime()),
                    caja.getIdcaja());
            if (caja.isEstado()) {
                registrarCierre();
            } else {
                cargarForm();
            }
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        }
    }

    private void registrarCorteGZ() {
        try {
            /*REGISTRANDO CORTE GZ EN VENTAS*/
            ModeloResolucion resolucion = manager.getResolucionDAO().getResolucionByCaja(caja);
            ModeloVenta corteGZ = new ModeloVenta();
            corteGZ.setNumerofactura(manager.getVentaDAO().getTicket(resolucion));
            corteGZ.setEmpleado(empleado);
            corteGZ.setResolucion(resolucion);
            corteGZ.setTipodoc("TKT");
            corteGZ.setFecha(new Date());
            corteGZ.setTotal(BigDecimal.ZERO);
            corteGZ.setGravado(BigDecimal.ZERO);
            corteGZ.setExento(BigDecimal.ZERO);
            corteGZ.setNosujeto(BigDecimal.ZERO);
            corteGZ.setTipoventa("CORTE GRAN Z");
            corteGZ.setEnletras("CORTE GRAN Z");
            manager.getVentaDAO().insertarSinCliente(corteGZ);
            /*ACTUALIZANDO LA RESOLUCION*/
            corteGZ.getResolucion().setTktactual(corteGZ.getResolucion().getTktactual() + 1);
            if (corteGZ.getResolucion().getTktactual() == corteGZ.getResolucion().getTktfinal()) {
                corteGZ.getResolucion().setActiva(false);
            } else if (corteGZ.getResolucion().getTktactual() >= (corteGZ.getResolucion().getTktfinal() - corteGZ.getResolucion().
                    getTktalerta())) {
                Mensajes.mensajeAlert(
                        "La resolución tiene: " + (corteGZ.getResolucion().getTktfinal() - corteGZ.getResolucion().getTktactual())
                        + " transacciones disponibles\n contactar con Administrador");
            }
            manager.getResolucionDAO().modificar(corteGZ.getResolucion());
            /*REGISTRANDO MOVIMIENTO EN BITACORA DE CAJA*/
            ModeloBitacoraCaja corteGZBit = new ModeloBitacoraCaja(caja, empleado.getNombre(), new Date(), "CORTE GRAN Z", BigDecimal.ZERO,
                    corteGZ.getNumerofactura());
            manager.getBitacoraDAO().insertar(corteGZBit);
            /*IMPRIMIENDO REPORTE CORTE Z*/
            Calendar calendarI = Calendar.getInstance();
            calendarI.set(Calendar.AM_PM, Calendar.AM);
            calendarI.set(Calendar.DATE, 1);
            calendarI.set(Calendar.HOUR, 0);
            calendarI.set(Calendar.MINUTE, 0);
            calendarI.set(Calendar.SECOND, 1);
            Calendar calendarF = Calendar.getInstance();
            calendarF.set(Calendar.DATE, calendarF.getActualMaximum(Calendar.DATE) - 1);
            calendarF.set(Calendar.HOUR, 23);
            calendarF.set(Calendar.MINUTE, 59);
            calendarF.set(Calendar.SECOND, 59);
            manager.getReportes().corteGZ(Fechero.realToBase(calendarI.getTime()), Fechero.realToBase(calendarF.getTime()),
                    caja.getIdcaja());
            cargarForm();
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        }
    }

    private boolean isCorteZ() {
        Condition c = BITACORA_CAJA.MOVIMIENTO.eq("CORTE Z")
                .and("\"bitacora_caja\".\"fecha\"::date = current_date")
                .and(BITACORA_CAJA.IDCAJA.eq(caja.getIdcaja()));
        try {
            return manager.getBitacoraDAO().hayCorteZ(c);
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
            return false;
        }
    }

    private boolean isCorteGZ() {
        Condition c = BITACORA_CAJA.MOVIMIENTO.eq("CORTE GRAN Z")
                .and(BITACORA_CAJA.IDCAJA.eq(caja.getIdcaja()))
                .and("EXTRACT(month FROM fecha) = EXTRACT(month FROM CURRENT_DATE)");
        try {
            return manager.getBitacoraDAO().hayCorteGZ(c);
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
            return true;
        }
    }

    private static final Logger LOG = Logger.getLogger(DialogCaja.class.getName());

}
