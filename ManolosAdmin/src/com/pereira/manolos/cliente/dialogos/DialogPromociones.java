package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloDetallePromocion;
import com.pereira.manolos.negocio.modelos.ModeloProducto;
import com.pereira.manolos.negocio.modelos.ModeloPromocion;
import com.pereira.manolos.util.CellRenderer;
import com.pereira.manolos.util.ComboUI;
import com.pereira.manolos.util.HeaderCellRenderer;
import com.pereira.manolos.util.ImageConverter;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.SpinnerUI;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI900;
import static com.pereira.manolos.datos.database.Tables.DETALLE_PROMOCION;

/* @author Jose Luis */
@SuppressWarnings ( "serial" )
public class DialogPromociones extends javax.swing.JDialog {

    private final DAOManager manager;
    private ModeloPromocion promocion;
    private File file = null;
    private boolean nuevo = true;
    private final DefaultTableModel dtmDetalle;
    private List<ModeloDetallePromocion> lDetallePromo = new ArrayList<> ();
    private static final Logger LOG = Logger.getLogger ( DialogPromociones.class.getName () );

    public DialogPromociones ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager ) {
        super ( parent , modal );
        this.manager = manager;
        initComponents ();
        dtmDetalle = ( DefaultTableModel ) tDetalle.getModel ();
        dibujarTablas ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
        cargarFotoNoImage ();
    }

    public DialogPromociones ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager , ModeloPromocion promo ) {
        super ( parent , modal );
        this.manager = manager;
        this.promocion = promo;
        this.nuevo = false;
        initComponents ();
        dtmDetalle = ( DefaultTableModel ) tDetalle.getModel ();
        dibujarTablas ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
        cargarForm ();
        //cargarFotoNoImage ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        popDetalle = new javax.swing.JPopupMenu();
        itemEliminar = new javax.swing.JMenuItem();
        lblTitulo = new javax.swing.JPanel();
        pComandos = new javax.swing.JPanel();
        btnGuardar1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        chkLunes = new javax.swing.JCheckBox();
        chkMartes = new javax.swing.JCheckBox();
        chkMiercoles = new javax.swing.JCheckBox();
        chkJueves = new javax.swing.JCheckBox();
        chkSabado = new javax.swing.JCheckBox();
        chkViernes = new javax.swing.JCheckBox();
        chkDomingo = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        cbxTipoVenta = new javax.swing.JComboBox<>();
        lblTipoVenta = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tDetalle = new javax.swing.JTable();
        lblTipoVenta2 = new javax.swing.JLabel();
        spPrecio = new javax.swing.JSpinner();
        lblPrecio = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lblTipoVenta4 = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        lblTipoVenta5 = new javax.swing.JLabel();
        btnImagen1 = new javax.swing.JButton();

        itemEliminar.setText("Eliminar Producto");
        itemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarActionPerformed(evt);
            }
        });
        popDetalle.add(itemEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblTitulo.setBackground(colorBG);
        lblTitulo.setLayout(new java.awt.GridBagLayout());

        pComandos.setOpaque(false);
        pComandos.setLayout(new java.awt.GridBagLayout());

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        lblTitulo.add(pComandos, gridBagConstraints);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridBagLayout());

        chkLunes.setBackground(colorBG);
        chkLunes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkLunes.setText("Lunes");
        chkLunes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
        chkLunes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        jPanel4.add(chkLunes, gridBagConstraints);

        chkMartes.setBackground(colorBG);
        chkMartes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkMartes.setText("Martes");
        chkMartes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
        chkMartes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        jPanel4.add(chkMartes, gridBagConstraints);

        chkMiercoles.setBackground(colorBG);
        chkMiercoles.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkMiercoles.setText("Miercoles");
        chkMiercoles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
        chkMiercoles.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        jPanel4.add(chkMiercoles, gridBagConstraints);

        chkJueves.setBackground(colorBG);
        chkJueves.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkJueves.setText("Jueves");
        chkJueves.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
        chkJueves.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        jPanel4.add(chkJueves, gridBagConstraints);

        chkSabado.setBackground(colorBG);
        chkSabado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkSabado.setText("Sabado");
        chkSabado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
        chkSabado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        jPanel4.add(chkSabado, gridBagConstraints);

        chkViernes.setBackground(colorBG);
        chkViernes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkViernes.setText("Viernes");
        chkViernes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
        chkViernes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        jPanel4.add(chkViernes, gridBagConstraints);

        chkDomingo.setBackground(colorBG);
        chkDomingo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkDomingo.setText("Domingo");
        chkDomingo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
        chkDomingo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        jPanel4.add(chkDomingo, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Aplicar Dia:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        jPanel4.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel3.add(jPanel4, gridBagConstraints);

        cbxTipoVenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbxTipoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GRAVADA", "EXENTA", "NO SUJETA" }));
        cbxTipoVenta.setMinimumSize(new java.awt.Dimension(150, 35));
        cbxTipoVenta.setPreferredSize(new java.awt.Dimension(150, 35));
        cbxTipoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoVentaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        jPanel3.add(cbxTipoVenta, gridBagConstraints);
        cbxTipoVenta.setUI(new ComboUI(colorBG,colorUI, colorBG));

        lblTipoVenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTipoVenta.setText("Detalle de Promoción:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 0);
        jPanel3.add(lblTipoVenta, gridBagConstraints);

        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setMinimumSize(new java.awt.Dimension(200, 35));
        txtNombre.setPreferredSize(new java.awt.Dimension(200, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        jPanel3.add(txtNombre, gridBagConstraints);

        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel3.add(lblNombre, gridBagConstraints);

        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setBorder(new javax.swing.border.LineBorder(colorUI, 3, true));
        lblFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblFoto.setMaximumSize(new java.awt.Dimension(200, 200));
        lblFoto.setMinimumSize(new java.awt.Dimension(200, 200));
        lblFoto.setPreferredSize(new java.awt.Dimension(200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel3.add(lblFoto, gridBagConstraints);

        tDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Producto", "Precio Vta.", "Cantidad", "Costo Un.", "Costo Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tDetalle.setComponentPopupMenu(popDetalle);
        tDetalle.setRowHeight(30);
        tDetalle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tDetalle.getTableHeader().setReorderingAllowed(false);
        tDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tDetalleMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tDetalle);
        if (tDetalle.getColumnModel().getColumnCount() > 0) {
            tDetalle.getColumnModel().getColumn(0).setMinWidth(0);
            tDetalle.getColumnModel().getColumn(0).setPreferredWidth(0);
            tDetalle.getColumnModel().getColumn(0).setMaxWidth(0);
            tDetalle.getColumnModel().getColumn(2).setMinWidth(100);
            tDetalle.getColumnModel().getColumn(2).setPreferredWidth(100);
            tDetalle.getColumnModel().getColumn(2).setMaxWidth(100);
            tDetalle.getColumnModel().getColumn(3).setMinWidth(100);
            tDetalle.getColumnModel().getColumn(3).setPreferredWidth(100);
            tDetalle.getColumnModel().getColumn(3).setMaxWidth(100);
            tDetalle.getColumnModel().getColumn(4).setMinWidth(100);
            tDetalle.getColumnModel().getColumn(4).setPreferredWidth(100);
            tDetalle.getColumnModel().getColumn(4).setMaxWidth(100);
            tDetalle.getColumnModel().getColumn(5).setMinWidth(100);
            tDetalle.getColumnModel().getColumn(5).setPreferredWidth(100);
            tDetalle.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 5);
        jPanel3.add(jScrollPane2, gridBagConstraints);

        lblTipoVenta2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTipoVenta2.setText("Costo Total:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 0);
        jPanel3.add(lblTipoVenta2, gridBagConstraints);

        spPrecio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spPrecio.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        spPrecio.setMinimumSize(new java.awt.Dimension(100, 35));
        spPrecio.setPreferredSize(new java.awt.Dimension(100, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 10, 5);
        jPanel3.add(spPrecio, gridBagConstraints);
        spPrecio.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        lblPrecio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPrecio.setText("Precio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        jPanel3.add(lblPrecio, gridBagConstraints);

        lblCosto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCosto.setText("00.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 0);
        jPanel3.add(lblCosto, gridBagConstraints);

        lblTipoVenta4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTipoVenta4.setText("Tipo de Venta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel3.add(lblTipoVenta4, gridBagConstraints);

        btnAgregarProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_agregar_producto_N.png"))); // NOI18N
        btnAgregarProducto.setBorder(null);
        btnAgregarProducto.setBorderPainted(false);
        btnAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProducto.setMaximumSize(new java.awt.Dimension(100, 50));
        btnAgregarProducto.setMinimumSize(new java.awt.Dimension(100, 50));
        btnAgregarProducto.setPreferredSize(new java.awt.Dimension(100, 50));
        btnAgregarProducto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_agregar_producto_P.png"))); // NOI18N
        btnAgregarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_agregar_producto_O.png"))); // NOI18N
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        jPanel3.add(btnAgregarProducto, gridBagConstraints);

        lblTipoVenta5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTipoVenta5.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 0);
        jPanel3.add(lblTipoVenta5, gridBagConstraints);

        btnImagen1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_imagen_N.png"))); // NOI18N
        btnImagen1.setBorder(null);
        btnImagen1.setBorderPainted(false);
        btnImagen1.setContentAreaFilled(false);
        btnImagen1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImagen1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_imagen_P.png"))); // NOI18N
        btnImagen1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_imagen_O.png"))); // NOI18N
        btnImagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagen1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        jPanel3.add(btnImagen1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        lblTitulo.add(jPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(lblTitulo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tDetalleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDetalleMousePressed
        if ( tDetalle.getRowCount () > 0 ) {
            Point point = evt.getPoint ();
            int currentRow = tDetalle.rowAtPoint ( point );
            tDetalle.setRowSelectionInterval ( currentRow , currentRow );
        }
    }//GEN-LAST:event_tDetalleMousePressed

    private void cbxTipoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoVentaActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        DialogSeleccionProducto dialog = new DialogSeleccionProducto ( new JFrame () , true , "SELECCIONAR PRODUCTO" , manager );
        dialog.setVisible ( true );
        ModeloProducto producto = dialog.getProducto ();
        if ( producto != null ) {
            if ( onTabla ( producto ) ) {
                Mensajes.mensajeAlert ( "El producto ya se encuentra dentro de la promoción!" );
            } else {
                int cantidad = dialog.getCantidad ();
                BigDecimal costo = BigDecimal.ZERO;
                switch ( producto.getTipo () ) {
                    case "U":
                        costo = producto.getInsumo ().getCosto ();
                        break;
                    case "C":
                        costo = producto.getReceta ().getCosto ();
                        break;
                    case "P":
                        costo = new BigDecimal ( ( producto.getReceta ().getCosto ().doubleValue () ) / producto.getPorciones () );
                }
                Object[] row = { producto , producto.getNombre () , producto.getPrecio () , cantidad , String.format ( "%.4f" , costo.doubleValue () ) ,
                                 String.format ( "%.4f" , ( costo.doubleValue () * cantidad ) ) };
                dtmDetalle.addRow ( row );
                sumarCosto ();
            }
        }

    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void itemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarActionPerformed
        dtmDetalle.removeRow ( tDetalle.getSelectedRow () );
        sumarCosto ();
    }//GEN-LAST:event_itemEliminarActionPerformed

    private void btnImagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagen1ActionPerformed
        JFileChooser chooser = new javax.swing.JFileChooser ();
        chooser.setFileSelectionMode ( JFileChooser.FILES_ONLY );
        FileNameExtensionFilter filtro = new FileNameExtensionFilter ( "JPG" , "jpg" );
        chooser.setFileFilter ( filtro );
        int res = chooser.showOpenDialog ( DialogPromociones.this );
        if ( res == JFileChooser.APPROVE_OPTION ) {
            file = chooser.getSelectedFile ();
            ImageIcon image = new ImageIcon ( file.getAbsolutePath () );
            Rectangle rect = lblFoto.getBounds ();
            Image scaledImage = image.getImage ().getScaledInstance ( rect.width , rect.height , Image.SCALE_DEFAULT );
            image = new ImageIcon ( scaledImage );
            lblFoto.setIcon ( image );
        }
    }//GEN-LAST:event_btnImagen1ActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        if ( tDetalle.getRowCount () > 0 ) {
            if ( nuevo ) {
                agregarPromocion ();
            } else {
                editarPromocion ();
            }
        } else {
            Mensajes.mensajeAlert ( "Agregue productos a la promoción" );
        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        dispose ();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnImagen1;
    private javax.swing.JComboBox<String> cbxTipoVenta;
    private javax.swing.JCheckBox chkDomingo;
    private javax.swing.JCheckBox chkJueves;
    private javax.swing.JCheckBox chkLunes;
    private javax.swing.JCheckBox chkMartes;
    private javax.swing.JCheckBox chkMiercoles;
    private javax.swing.JCheckBox chkSabado;
    private javax.swing.JCheckBox chkViernes;
    private javax.swing.JMenuItem itemEliminar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipoVenta;
    private javax.swing.JLabel lblTipoVenta2;
    private javax.swing.JLabel lblTipoVenta4;
    private javax.swing.JLabel lblTipoVenta5;
    private javax.swing.JPanel lblTitulo;
    private javax.swing.JPanel pComandos;
    private javax.swing.JPopupMenu popDetalle;
    private javax.swing.JSpinner spPrecio;
    private javax.swing.JTable tDetalle;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarForm () {
        txtNombre.setText ( promocion.getNombre () );
        switch ( promocion.getTipo () ) {
            case "G":
                cbxTipoVenta.setSelectedIndex ( 0 );
                break;
            case "E":
                cbxTipoVenta.setSelectedIndex ( 1 );
                break;
            case "NS":
                cbxTipoVenta.setSelectedIndex ( 2 );
                break;
        }
        chkLunes.setSelected ( promocion.isLunes () );
        chkMartes.setSelected ( promocion.isMartes () );
        chkMiercoles.setSelected ( promocion.isMiercoles () );
        chkJueves.setSelected ( promocion.isJueves () );
        chkViernes.setSelected ( promocion.isViernes () );
        chkSabado.setSelected ( promocion.isSabado () );
        chkDomingo.setSelected ( promocion.isDomingo () );
        
        spPrecio.setValue ( promocion.getPrecio ().doubleValue () );
        ImageIcon image;
        try {
            image = new ImageIcon ( ImageConverter.byteToImage ( promocion.getImagen () ) );
            Image scaledImage = image.getImage ().getScaledInstance ( 200 , 200 , Image.SCALE_DEFAULT );
            image = new ImageIcon ( scaledImage );
            lblFoto.setIcon ( image );
        } catch ( IOException ex ) {
            Logger.getLogger ( DialogPromociones.class.getName () ).log ( Level.SEVERE , null , ex );
        }

        Condition c = DETALLE_PROMOCION.IDPROMOCION.eq ( promocion.getIdpromocion () );
        try {
            manager.getDetallePromocionDAO ().obtenerLista ( c ).forEach ( d -> {
                BigDecimal costo = BigDecimal.ZERO;
                switch ( d.getProducto ().getTipo () ) {
                    case "U":
                        costo = d.getProducto ().getInsumo ().getCosto ();
                        break;
                    case "C":
                        costo = d.getProducto ().getReceta ().getCosto ();
                        break;
                    case "P":
                        costo = new BigDecimal ( ( d.getProducto ().getReceta ().getCosto ().doubleValue () ) / d.getProducto ().getPorciones () );
                }
                Object[] row = { d.getProducto () , d.getProducto ().getNombre () , d.getProducto ().getPrecio () , d.getCantidad () , String.
                                 format ( "%.4f" , costo.doubleValue () ) , String.format ( "%.4f" , ( costo.doubleValue () * d.getCantidad () ) ) };
                dtmDetalle.addRow ( row );
            } );
            sumarCosto();
        } catch ( Exception ex ) {
            Logger.getLogger ( DialogPromociones.class.getName () ).log ( Level.SEVERE , null , ex );
        }
    }

    private void cargarFotoNoImage () {
        file = new File ( "images\\noimage.jpg" );
        ImageIcon image = new ImageIcon ( file.getAbsolutePath () );
        Rectangle rect = lblFoto.getBounds ();
        Image scaledImage = image.getImage ().getScaledInstance ( 200 , 200 , Image.SCALE_DEFAULT );
        image = new ImageIcon ( scaledImage );
        lblFoto.setIcon ( image );
    }

    private void agregarPromocion () {
        try {
            promocion = new ModeloPromocion ( txtNombre.getText () , new BigDecimal ( lblCosto.getText () ) , new BigDecimal ( ( double ) spPrecio.
                                              getValue () ) , null , ImageConverter.imageToByte ( file ) , chkLunes.isSelected () ,
                                              chkMartes.isSelected () , chkMiercoles.isSelected () , chkJueves.isSelected () , chkViernes.
                                              isSelected () , chkSabado.isSelected () , chkDomingo.isSelected () );
            switch ( cbxTipoVenta.getSelectedItem ().toString () ) {
                case "GRAVADA":
                    promocion.setTipo ( "G" );
                    break;
                case "EXENTA":
                    promocion.setTipo ( "E" );
                    break;
                case "NO SUJETA":
                    promocion.setTipo ( "NS" );
                    break;
            }
            manager.getPromocionDAO ().insertar ( promocion );
            for ( int i = 0 ; i < tDetalle.getRowCount () ; i++ ) {
                ModeloProducto producto = ( ModeloProducto ) tDetalle.getValueAt ( i , 0 );
                int cant = ( int ) tDetalle.getValueAt ( i , 3 );
                ModeloDetallePromocion detallePromocion = new ModeloDetallePromocion ( promocion , producto , cant , "" );
                manager.getDetallePromocionDAO ().insertar ( detallePromocion );
            }
        } catch ( IOException ex ) {
            LOG.log ( Level.SEVERE , null , ex );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
        } finally {
            dispose ();
        }
    }

    private void editarPromocion () {
        promocion.setNombre ( txtNombre.getText () );
        promocion.setLunes ( chkLunes.isSelected () );
        promocion.setMartes ( chkMartes.isSelected () );
        promocion.setMiercoles ( chkMiercoles.isSelected () );
        promocion.setJueves ( chkJueves.isSelected () );
        promocion.setViernes ( chkViernes.isSelected () );
        promocion.setSabado ( chkSabado.isSelected () );
        promocion.setDomingo ( chkDomingo.isSelected () );
        switch ( cbxTipoVenta.getSelectedItem ().toString () ) {
            case "GRAVADA":
                promocion.setTipo ( "G" );
                break;
            case "EXENTA":
                promocion.setTipo ( "E" );
                break;
            case "NO SUJETA":
                promocion.setTipo ( "NS" );
                break;
        }
        if ( file != null ) {
            try {
                promocion.setImagen ( ImageConverter.imageToByte ( file ) );
            } catch ( IOException ex ) {
                Logger.getLogger ( DialogPromociones.class.getName () ).log ( Level.SEVERE , null , ex );
            }
        }
        try {
            manager.getPromocionDAO ().modificar ( promocion );
            manager.getDetallePromocionDAO ().eliminarByPromocion ( promocion );
            for ( int i = 0 ; i < tDetalle.getRowCount () ; i++ ) {
                ModeloProducto producto = ( ModeloProducto ) tDetalle.getValueAt ( i , 0 );
                int cant = ( int ) tDetalle.getValueAt ( i , 3 );
                ModeloDetallePromocion detallePromocion = new ModeloDetallePromocion ( promocion , producto , cant , "" );
                manager.getDetallePromocionDAO ().insertar ( detallePromocion );
            }
            Mensajes.mensajeOk ( "Registro editado exitosamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            dispose ();
        }

    }

    private void sumarCosto () {
        double total = 0;
        if ( tDetalle.getRowCount () > 0 ) {
            for ( int i = 0 ; i < tDetalle.getRowCount () ; i++ ) {
                double costo = Double.parseDouble ( ( String ) tDetalle.getValueAt ( i , 4 ) );
                int cant = ( int ) tDetalle.getValueAt ( i , 3 );
                total += ( costo * cant );
            }
        }
        lblCosto.setText ( String.format ( "%.4f" , total ) );
    }

    private boolean onTabla ( ModeloProducto producto ) {
        boolean b = false;
        for ( int i = 0 ; i < tDetalle.getRowCount () ; i++ ) {
            ModeloProducto p = ( ModeloProducto ) tDetalle.getValueAt ( i , 0 );
            if ( p.getIdproducto () == producto.getIdproducto () ) {
                b = true;
                break;
            }
        }
        return b;
    }

    private void dibujarTablas () {
        tDetalle.setGridColor ( colorUI900 );
        JTableHeader jtableHeader = tDetalle.getTableHeader ();
        jtableHeader.setDefaultRenderer ( new HeaderCellRenderer ( colorUI900 ) );
        tDetalle.setTableHeader ( jtableHeader );

        tDetalle.getColumnModel ().getColumn ( 1 ).setCellRenderer ( new CellRenderer ( "text" , colorUI ) );
        tDetalle.getColumnModel ().getColumn ( 2 ).setCellRenderer ( new CellRenderer ( "precio" , colorUI ) );
        tDetalle.getColumnModel ().getColumn ( 3 ).setCellRenderer ( new CellRenderer ( "num" , colorUI ) );
        tDetalle.getColumnModel ().getColumn ( 4 ).setCellRenderer ( new CellRenderer ( "precio" , colorUI ) );
        tDetalle.getColumnModel ().getColumn ( 5 ).setCellRenderer ( new CellRenderer ( "precio" , colorUI ) );
        tDetalle.repaint ();

    }

}
