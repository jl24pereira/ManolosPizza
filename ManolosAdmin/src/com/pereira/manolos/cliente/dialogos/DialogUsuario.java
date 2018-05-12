package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.negocio.modelos.ModeloModulo;
import com.pereira.manolos.negocio.modelos.ModeloPermisos;
import com.pereira.manolos.negocio.modelos.ModeloUsuario;
import com.pereira.manolos.util.ComboUI;
import com.pereira.manolos.util.Encrypt;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.TabbedPanelUI;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.datos.database.Tables.MODULO;

/* @author Jose Luis */
@SuppressWarnings ( "serial" )
public class DialogUsuario extends javax.swing.JDialog {

    private ModeloUsuario usuario;
    private List<ModeloPermisos> permisos = new ArrayList<> ();
    private List<ModeloModulo> modulos = new ArrayList<> ();
    private final ModeloEmpleado empleado;
    private final DAOManager manager;
    private final boolean nuevo;

    public DialogUsuario ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager , ModeloEmpleado empleado ) {
        super ( parent , modal );
        this.manager = manager;
        initComponents ();
        this.setLocationRelativeTo ( null );
        nuevo = true;
        this.empleado = empleado;
        this.setTitle ( titulo );
        try {
            this.modulos = manager.getModuloDAO ().obtenerLista ( MODULO.IDMODULO.greaterOrEqual ( 1 ) );
            crearPermisos ();
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            this.dispose ();
        }
    }

    public DialogUsuario ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager , ModeloEmpleado empleado , boolean nuevo ) {
        super ( parent , modal );
        this.manager = manager;
        this.empleado = empleado;
        initComponents ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
        this.nuevo = false;
        try {
            this.usuario = manager.getUsuarioDAO ().getUsuarioByEmpleado ( empleado );
            this.permisos = manager.getPermisoDAO ().listaByEmpleado ( empleado );
            this.modulos = manager.getModuloDAO ().obtenerLista ( MODULO.IDMODULO.greaterOrEqual ( 1 ) );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            dispose ();
        }
        cargarFormulario ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pMain = new javax.swing.JPanel();
        pFormulario = new javax.swing.JPanel();
        tpCuenta = new javax.swing.JTabbedPane(){
            public Color getForegroundAt(int index){
                if(getSelectedIndex() == index) return colorBG;
                return colorUI;
            }};
            jPanel3 = new javax.swing.JPanel();
            chkUsuario = new javax.swing.JCheckBox();
            jLabel3 = new javax.swing.JLabel();
            jPanel7 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            txtUser = new javax.swing.JTextField();
            jLabel2 = new javax.swing.JLabel();
            txtPass = new javax.swing.JPasswordField();
            jPanel4 = new javax.swing.JPanel();
            cbxRol = new javax.swing.JComboBox<>();
            jPanel1 = new javax.swing.JPanel();
            jLabel4 = new javax.swing.JLabel();
            chkProductos = new javax.swing.JCheckBox();
            chkInsumos = new javax.swing.JCheckBox();
            chkFacturas = new javax.swing.JCheckBox();
            chkProveedores = new javax.swing.JCheckBox();
            chkEmpleados = new javax.swing.JCheckBox();
            chkInformacion = new javax.swing.JCheckBox();
            chkCostos = new javax.swing.JCheckBox();
            chkRespaldos = new javax.swing.JCheckBox();
            chkReportes = new javax.swing.JCheckBox();
            chkCajas = new javax.swing.JCheckBox();
            jPanel6 = new javax.swing.JPanel();
            jLabel5 = new javax.swing.JLabel();
            chkCotizaciones = new javax.swing.JCheckBox();
            chkPedidos = new javax.swing.JCheckBox();
            chkClientes = new javax.swing.JCheckBox();
            chkControlCajas = new javax.swing.JCheckBox();
            jLabel8 = new javax.swing.JLabel();
            jPanel2 = new javax.swing.JPanel();
            btnGuardar = new javax.swing.JButton();
            btnCancelar = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setBackground(new java.awt.Color(255, 255, 255));
            setMinimumSize(new java.awt.Dimension(650, 450));
            setPreferredSize(new java.awt.Dimension(650, 450));
            setResizable(false);
            getContentPane().setLayout(new java.awt.GridBagLayout());

            pMain.setBackground(colorBG);
            pMain.setLayout(new java.awt.GridBagLayout());

            pFormulario.setBackground(new java.awt.Color(255, 255, 255));
            pFormulario.setMinimumSize(new java.awt.Dimension(400, 600));
            pFormulario.setOpaque(false);
            pFormulario.setPreferredSize(new java.awt.Dimension(400, 600));
            pFormulario.setLayout(new java.awt.GridBagLayout());

            tpCuenta.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

            jPanel3.setBackground(colorBG);
            jPanel3.setLayout(new java.awt.GridBagLayout());

            chkUsuario.setBackground(new java.awt.Color(255, 255, 255));
            chkUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            chkUsuario.setText("Modificar Usuario y contraseña");
            chkUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
            chkUsuario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridwidth = 2;
            gridBagConstraints.insets = new java.awt.Insets(35, 0, 0, 0);
            jPanel3.add(chkUsuario, gridBagConstraints);

            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e853(0)_256.png"))); // NOI18N
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridheight = 3;
            gridBagConstraints.insets = new java.awt.Insets(25, 0, 20, 0);
            jPanel3.add(jLabel3, gridBagConstraints);

            jPanel7.setOpaque(false);
            jPanel7.setLayout(new java.awt.GridBagLayout());

            jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            jLabel1.setText("(*) Usuario:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
            gridBagConstraints.weighty = 0.1;
            jPanel7.add(jLabel1, gridBagConstraints);

            txtUser.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
            txtUser.setForeground(colorUI);
            txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            txtUser.setBorder(new javax.swing.border.LineBorder(colorUI, 2, true));
            txtUser.setMinimumSize(new java.awt.Dimension(200, 30));
            txtUser.setPreferredSize(new java.awt.Dimension(200, 40));
            txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    txtUserKeyReleased(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 0.1;
            gridBagConstraints.weighty = 0.1;
            gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
            jPanel7.add(txtUser, gridBagConstraints);

            jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            jLabel2.setText("(*) Contraseña:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
            gridBagConstraints.weighty = 0.1;
            jPanel7.add(jLabel2, gridBagConstraints);

            txtPass.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
            txtPass.setForeground(colorUI);
            txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            txtPass.setBorder(new javax.swing.border.LineBorder(colorUI, 2, true));
            txtPass.setMinimumSize(new java.awt.Dimension(200, 30));
            txtPass.setPreferredSize(new java.awt.Dimension(200, 40));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 0.1;
            gridBagConstraints.weighty = 0.1;
            gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
            jPanel7.add(txtPass, gridBagConstraints);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 0.1;
            jPanel3.add(jPanel7, gridBagConstraints);

            tpCuenta.addTab("Cuenta de Usuario", jPanel3);

            jPanel4.setBackground(colorBG);
            jPanel4.setLayout(new java.awt.GridBagLayout());

            cbxRol.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
            cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Ventas", "Administración" }));
            cbxRol.setMinimumSize(new java.awt.Dimension(200, 30));
            cbxRol.setPreferredSize(new java.awt.Dimension(200, 30));
            cbxRol.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    cbxRolItemStateChanged(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridwidth = 4;
            gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
            jPanel4.add(cbxRol, gridBagConstraints);
            cbxRol.setUI(new ComboUI(colorBG,colorUI, colorBG));

            jPanel1.setBorder(new javax.swing.border.LineBorder(colorUI, 1, true));
            jPanel1.setMinimumSize(new java.awt.Dimension(100, 100));
            jPanel1.setOpaque(false);
            jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));
            jPanel1.setLayout(new java.awt.GridBagLayout());

            jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
            jLabel4.setText("ADMINISTRACION");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
            gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
            jPanel1.add(jLabel4, gridBagConstraints);

            chkProductos.setBackground(new java.awt.Color(255, 255, 255));
            chkProductos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            chkProductos.setText("Productos");
            chkProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
            chkProductos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
            chkProductos.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    chkProductosItemStateChanged(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 4;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
            jPanel1.add(chkProductos, gridBagConstraints);

            chkInsumos.setBackground(new java.awt.Color(255, 255, 255));
            chkInsumos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            chkInsumos.setText("Insumos");
            chkInsumos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
            chkInsumos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
            chkInsumos.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    chkInsumosItemStateChanged(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
            jPanel1.add(chkInsumos, gridBagConstraints);

            chkFacturas.setBackground(new java.awt.Color(255, 255, 255));
            chkFacturas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            chkFacturas.setText("Facturas");
            chkFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
            chkFacturas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
            chkFacturas.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    chkFacturasItemStateChanged(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
            jPanel1.add(chkFacturas, gridBagConstraints);

            chkProveedores.setBackground(new java.awt.Color(255, 255, 255));
            chkProveedores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            chkProveedores.setText("Proveedores");
            chkProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
            chkProveedores.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
            chkProveedores.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    chkProveedoresItemStateChanged(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 3;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
            jPanel1.add(chkProveedores, gridBagConstraints);

            chkEmpleados.setBackground(new java.awt.Color(255, 255, 255));
            chkEmpleados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            chkEmpleados.setText("Empleados");
            chkEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
            chkEmpleados.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
            chkEmpleados.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    chkEmpleadosItemStateChanged(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
            jPanel1.add(chkEmpleados, gridBagConstraints);

            chkInformacion.setBackground(new java.awt.Color(255, 255, 255));
            chkInformacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            chkInformacion.setText("Mi Empresa");
            chkInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
            chkInformacion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
            chkInformacion.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    chkInformacionItemStateChanged(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 3;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
            jPanel1.add(chkInformacion, gridBagConstraints);

            chkCostos.setBackground(new java.awt.Color(255, 255, 255));
            chkCostos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            chkCostos.setText("Costos");
            chkCostos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
            chkCostos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
            chkCostos.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    chkCostosItemStateChanged(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 4;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
            jPanel1.add(chkCostos, gridBagConstraints);

            chkRespaldos.setBackground(new java.awt.Color(255, 255, 255));
            chkRespaldos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            chkRespaldos.setText("Respaldos");
            chkRespaldos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
            chkRespaldos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
            chkRespaldos.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    chkRespaldosItemStateChanged(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 5;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
            jPanel1.add(chkRespaldos, gridBagConstraints);

            chkReportes.setBackground(new java.awt.Color(255, 255, 255));
            chkReportes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            chkReportes.setText("Reportes");
            chkReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
            chkReportes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
            chkReportes.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    chkReportesItemStateChanged(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 5;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
            jPanel1.add(chkReportes, gridBagConstraints);

            chkCajas.setBackground(new java.awt.Color(255, 255, 255));
            chkCajas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            chkCajas.setText("Cajas");
            chkCajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
            chkCajas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
            chkCajas.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    chkCajasItemStateChanged(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
            jPanel1.add(chkCajas, gridBagConstraints);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(20, 5, 20, 5);
            jPanel4.add(jPanel1, gridBagConstraints);

            jPanel6.setBorder(new javax.swing.border.LineBorder(colorUI, 1, true));
            jPanel6.setMinimumSize(new java.awt.Dimension(100, 100));
            jPanel6.setOpaque(false);
            jPanel6.setPreferredSize(new java.awt.Dimension(100, 100));
            jPanel6.setLayout(new java.awt.GridBagLayout());

            jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
            jLabel5.setText("VENTAS");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
            jPanel6.add(jLabel5, gridBagConstraints);

            chkCotizaciones.setBackground(new java.awt.Color(255, 255, 255));
            chkCotizaciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            chkCotizaciones.setText("Ventas");
            chkCotizaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
            chkCotizaciones.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
            chkCotizaciones.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    chkCotizacionesItemStateChanged(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
            jPanel6.add(chkCotizaciones, gridBagConstraints);

            chkPedidos.setBackground(new java.awt.Color(255, 255, 255));
            chkPedidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            chkPedidos.setText("Cocina");
            chkPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
            chkPedidos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
            chkPedidos.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    chkPedidosItemStateChanged(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 3;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
            jPanel6.add(chkPedidos, gridBagConstraints);

            chkClientes.setBackground(new java.awt.Color(255, 255, 255));
            chkClientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            chkClientes.setText("Clientes");
            chkClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
            chkClientes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
            chkClientes.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    chkClientesItemStateChanged(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 4;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
            jPanel6.add(chkClientes, gridBagConstraints);

            chkControlCajas.setBackground(new java.awt.Color(255, 255, 255));
            chkControlCajas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            chkControlCajas.setText("Control de Cajas");
            chkControlCajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
            chkControlCajas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
            chkControlCajas.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    chkControlCajasItemStateChanged(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
            jPanel6.add(chkControlCajas, gridBagConstraints);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(20, 5, 20, 5);
            jPanel4.add(jPanel6, gridBagConstraints);

            jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            jLabel8.setText("ROL:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridwidth = 2;
            gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
            jPanel4.add(jLabel8, gridBagConstraints);

            tpCuenta.addTab("Permisos", jPanel4);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            pFormulario.add(tpCuenta, gridBagConstraints);
            tpCuenta.setUI(new TabbedPanelUI(colorUI,colorBG));

            jPanel2.setOpaque(false);
            jPanel2.setLayout(new java.awt.GridBagLayout());

            btnGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
            jPanel2.add(btnGuardar, gridBagConstraints);

            btnCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
            jPanel2.add(btnCancelar, gridBagConstraints);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            pFormulario.add(jPanel2, gridBagConstraints);

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
        char passArray[] = txtPass.getPassword ();
        String pass = new String ( passArray );
        try {
            if ( manager.getUsuarioDAO ().existeUsuario ( Encrypt.EncrypSHA ( Encrypt.EncrypMD5 ( pass ) ) ) ) {
                Mensajes.mensajeAlert ( "Esta Clave esta asignada a otro usuario" );
            } else if ( nuevo ) {
                agregarUsuario ( pass );
            } else {
                editarUsuario ( pass );
            }
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            dispose ();
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose ();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtPass.requestFocus ();
        }
    }//GEN-LAST:event_txtUserKeyReleased

    private void cbxRolItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxRolItemStateChanged
        // TODO add your handling code here:
        switch ( cbxRol.getSelectedIndex () ) {
            case 0:
                selectLibre ();
                break;
            case 1:
                selectVentas ();
                break;
            default:
                selectAdmin ();
                break;
        }
    }//GEN-LAST:event_cbxRolItemStateChanged

    private void chkCajasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkCajasItemStateChanged
        permisos.get ( 0 ).setPermiso ( chkCajas.isSelected () );
    }//GEN-LAST:event_chkCajasItemStateChanged

    private void chkEmpleadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkEmpleadosItemStateChanged
        permisos.get ( 1 ).setPermiso ( chkEmpleados.isSelected () );
    }//GEN-LAST:event_chkEmpleadosItemStateChanged

    private void chkInformacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkInformacionItemStateChanged
        permisos.get ( 2 ).setPermiso ( chkInformacion.isSelected () );
    }//GEN-LAST:event_chkInformacionItemStateChanged

    private void chkCostosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkCostosItemStateChanged
        permisos.get ( 3 ).setPermiso ( chkCostos.isSelected () );
    }//GEN-LAST:event_chkCostosItemStateChanged

    private void chkRespaldosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkRespaldosItemStateChanged
        permisos.get ( 4 ).setPermiso ( chkRespaldos.isSelected () );
    }//GEN-LAST:event_chkRespaldosItemStateChanged

    private void chkInsumosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkInsumosItemStateChanged
        permisos.get ( 5 ).setPermiso ( chkInsumos.isSelected () );
    }//GEN-LAST:event_chkInsumosItemStateChanged

    private void chkFacturasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkFacturasItemStateChanged
        permisos.get ( 6 ).setPermiso ( chkFacturas.isSelected () );
    }//GEN-LAST:event_chkFacturasItemStateChanged

    private void chkProveedoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkProveedoresItemStateChanged
        permisos.get ( 7 ).setPermiso ( chkProveedores.isSelected () );
    }//GEN-LAST:event_chkProveedoresItemStateChanged

    private void chkProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkProductosItemStateChanged
        permisos.get ( 8 ).setPermiso ( chkProductos.isSelected () );
    }//GEN-LAST:event_chkProductosItemStateChanged

    private void chkReportesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkReportesItemStateChanged
        permisos.get ( 9 ).setPermiso ( chkReportes.isSelected () );
    }//GEN-LAST:event_chkReportesItemStateChanged

    private void chkControlCajasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkControlCajasItemStateChanged
        permisos.get ( 10 ).setPermiso ( chkControlCajas.isSelected () );
    }//GEN-LAST:event_chkControlCajasItemStateChanged

    private void chkCotizacionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkCotizacionesItemStateChanged
        permisos.get ( 11 ).setPermiso ( chkCotizaciones.isSelected () );
    }//GEN-LAST:event_chkCotizacionesItemStateChanged

    private void chkPedidosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkPedidosItemStateChanged
        permisos.get ( 12 ).setPermiso ( chkPedidos.isSelected () );
    }//GEN-LAST:event_chkPedidosItemStateChanged

    private void chkClientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkClientesItemStateChanged
        permisos.get ( 13 ).setPermiso ( chkClientes.isSelected () );
    }//GEN-LAST:event_chkClientesItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxRol;
    private javax.swing.JCheckBox chkCajas;
    private javax.swing.JCheckBox chkClientes;
    private javax.swing.JCheckBox chkControlCajas;
    private javax.swing.JCheckBox chkCostos;
    private javax.swing.JCheckBox chkCotizaciones;
    private javax.swing.JCheckBox chkEmpleados;
    private javax.swing.JCheckBox chkFacturas;
    private javax.swing.JCheckBox chkInformacion;
    private javax.swing.JCheckBox chkInsumos;
    private javax.swing.JCheckBox chkPedidos;
    private javax.swing.JCheckBox chkProductos;
    private javax.swing.JCheckBox chkProveedores;
    private javax.swing.JCheckBox chkReportes;
    private javax.swing.JCheckBox chkRespaldos;
    private javax.swing.JCheckBox chkUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel pFormulario;
    private javax.swing.JPanel pMain;
    private javax.swing.JTabbedPane tpCuenta;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void cargarFormulario () {
        permisos.get ( 0 ).setModulo ( modulos.get ( 0 ) );
        permisos.get ( 1 ).setModulo ( modulos.get ( 1 ) );
        permisos.get ( 2 ).setModulo ( modulos.get ( 2 ) );
        permisos.get ( 3 ).setModulo ( modulos.get ( 3 ) );
        permisos.get ( 4 ).setModulo ( modulos.get ( 4 ) );
        permisos.get ( 5 ).setModulo ( modulos.get ( 5 ) );
        permisos.get ( 6 ).setModulo ( modulos.get ( 6 ) );
        permisos.get ( 7 ).setModulo ( modulos.get ( 7 ) );
        permisos.get ( 8 ).setModulo ( modulos.get ( 8 ) );
        permisos.get ( 9 ).setModulo ( modulos.get ( 9 ) );
        permisos.get ( 10 ).setModulo ( modulos.get ( 10 ) );
        permisos.get ( 11 ).setModulo ( modulos.get ( 11 ) );
        permisos.get ( 12 ).setModulo ( modulos.get ( 12 ) );
        permisos.get ( 13 ).setModulo ( modulos.get ( 13 ) );
        chkCajas.setSelected ( permisos.get ( 0 ).isPermiso () );
        chkEmpleados.setSelected ( permisos.get ( 1 ).isPermiso () );
        chkInformacion.setSelected ( permisos.get ( 2 ).isPermiso () );
        chkCostos.setSelected ( permisos.get ( 3 ).isPermiso () );
        chkRespaldos.setSelected ( permisos.get ( 4 ).isPermiso () );
        chkInsumos.setSelected ( permisos.get ( 5 ).isPermiso () );
        chkFacturas.setSelected ( permisos.get ( 6 ).isPermiso () );
        chkProveedores.setSelected ( permisos.get ( 7 ).isPermiso () );
        chkProductos.setSelected ( permisos.get ( 8 ).isPermiso () );
        chkReportes.setSelected ( permisos.get ( 9 ).isPermiso () );
        chkControlCajas.setSelected ( permisos.get ( 10 ).isPermiso () );
        chkCotizaciones.setSelected ( permisos.get ( 11 ).isPermiso () );
        chkPedidos.setSelected ( permisos.get ( 12 ).isPermiso () );
        chkClientes.setSelected ( permisos.get ( 13 ).isPermiso () );

    }

    private void selectAdmin () {
        /*esto es exclusivo de admin*/
        chkProductos.setSelected ( true );
        chkInsumos.setSelected ( true );
        chkFacturas.setSelected ( true );
        chkProveedores.setSelected ( true );
        chkEmpleados.setSelected ( true );
        chkInformacion.setSelected ( true );
        chkCostos.setSelected ( true );
        chkRespaldos.setSelected ( true );
        chkReportes.setSelected ( true );
        chkCajas.setSelected ( true );
        /*ventas*/
        chkPedidos.setSelected ( true );
        chkCotizaciones.setSelected ( true );
        chkClientes.setSelected ( true );
        chkControlCajas.setSelected ( true );
    }

    private void selectVentas () {
        /*esto es exclusivo de admin*/
        chkProductos.setSelected ( false );
        chkInsumos.setSelected ( false );
        chkFacturas.setSelected ( false );
        chkProveedores.setSelected ( false );
        chkEmpleados.setSelected ( false );
        chkInformacion.setSelected ( false );
        chkCostos.setSelected ( false );
        chkRespaldos.setSelected ( false );
        chkReportes.setSelected ( false );
        chkCajas.setSelected ( false );
        /*ventas*/
        chkPedidos.setSelected ( true );
        chkCotizaciones.setSelected ( true );
        chkClientes.setSelected ( true );
        chkControlCajas.setSelected ( true );
    }

    private void selectLibre () {
        /*esto es exclusivo de admin*/
        chkProductos.setSelected ( false );
        chkInsumos.setSelected ( false );
        chkFacturas.setSelected ( false );
        chkProveedores.setSelected ( false );
        chkEmpleados.setSelected ( false );
        chkInformacion.setSelected ( false );
        chkCostos.setSelected ( false );
        chkRespaldos.setSelected ( false );
        chkReportes.setSelected ( false );
        chkCajas.setSelected ( false );
        /*ventas*/
        chkPedidos.setSelected ( false );
        chkCotizaciones.setSelected ( false );
        chkClientes.setSelected ( false );
        chkControlCajas.setSelected ( false );
    }

    @SuppressWarnings ( "null" )
    private boolean validarForm ( String pass ) {
        return !( pass.isEmpty () || txtUser.getText ().isEmpty () || txtUser.getText () == null || pass == null );
    }

    private static final Logger LOG = Logger.getLogger ( DialogUsuario.class.getName () );

    private void agregarUsuario ( String pass ) {
        usuario = new ModeloUsuario ( empleado , Encrypt.EncrypSHA ( Encrypt.EncrypMD5 ( pass ) ) , Encrypt.EncrypSHA ( Encrypt.EncrypMD5 ( txtUser.
                                      getText () ) ) );
        if ( validarForm ( pass ) ) {
            try {
                manager.getUsuarioDAO ().insertar ( usuario );
                permisos.stream ().forEach ( permiso -> {
                    try {
                        manager.getPermisoDAO ().insertar ( permiso );
                    } catch ( Exception ex ) {
                        LOG.log ( Level.SEVERE , null , ex );
                        Mensajes.mensajeError ( "Error: " + ex.getMessage () );
                        dispose ();
                    }
                } );
                Mensajes.mensajeOk ( "Registro agregado exitosamente!" );
            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
                Mensajes.mensajeAlert ( "Error: " + ex.getMessage () );
            } finally {
                dispose ();
            }
        } else {
            Mensajes.mensajeAlert ( "Verificar campos requeridos!" );
        }

    }

    private void editarUsuario ( String pass ) {

        if ( chkUsuario.isSelected () ) {
            usuario.setUsuario ( Encrypt.EncrypSHA ( Encrypt.EncrypMD5 ( txtUser.getText () ) ) );
            usuario.setPassword ( Encrypt.EncrypSHA ( Encrypt.EncrypMD5 ( pass ) ) );
            if ( validarForm ( pass ) ) {
                try {
                    manager.getUsuarioDAO ().modificar ( usuario );
                    permisos.stream ().forEach ( permiso -> {
                        try {
                            manager.getPermisoDAO ().modificar ( permiso );
                        } catch ( Exception ex ) {
                            LOG.log ( Level.SEVERE , null , ex );
                            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
                        }
                    } );
                    Mensajes.mensajeOk ( "Registro editado exitosamente!" );
                } catch ( Exception ex ) {
                    LOG.log ( Level.SEVERE , null , ex );
                    Mensajes.mensajeError ( "Error: " + ex.getMessage () );
                } finally {
                    dispose ();
                }
            } else {
                Mensajes.mensajeAlert ( "Verificar campos requeridos!" );
            }
        } else {
            permisos.stream ().forEach ( permiso -> {
                try {
                    manager.getPermisoDAO ().modificar ( permiso );
                } catch ( Exception ex ) {
                    LOG.log ( Level.SEVERE , null , ex );
                    Mensajes.mensajeError ( "Error: " + ex.getMessage () );
                    dispose ();
                }
            } );
            Mensajes.mensajeOk ( "Registro editado exitosamente!" );
            dispose ();
        }
    }

    private void crearPermisos () {
        permisos.add ( new ModeloPermisos ( empleado , false , modulos.get ( 0 ) ) );
        permisos.add ( new ModeloPermisos ( empleado , false , modulos.get ( 1 ) ) );
        permisos.add ( new ModeloPermisos ( empleado , false , modulos.get ( 2 ) ) );
        permisos.add ( new ModeloPermisos ( empleado , false , modulos.get ( 3 ) ) );
        permisos.add ( new ModeloPermisos ( empleado , false , modulos.get ( 4 ) ) );
        permisos.add ( new ModeloPermisos ( empleado , false , modulos.get ( 5 ) ) );
        permisos.add ( new ModeloPermisos ( empleado , false , modulos.get ( 6 ) ) );
        permisos.add ( new ModeloPermisos ( empleado , false , modulos.get ( 7 ) ) );
        permisos.add ( new ModeloPermisos ( empleado , false , modulos.get ( 8 ) ) );
        permisos.add ( new ModeloPermisos ( empleado , false , modulos.get ( 9 ) ) );
        permisos.add ( new ModeloPermisos ( empleado , false , modulos.get ( 10 ) ) );
        permisos.add ( new ModeloPermisos ( empleado , false , modulos.get ( 11 ) ) );
        permisos.add ( new ModeloPermisos ( empleado , false , modulos.get ( 12 ) ) );
        permisos.add ( new ModeloPermisos ( empleado , false , modulos.get ( 13 ) ) );
    }

}
