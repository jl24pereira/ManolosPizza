package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.cliente.listrenderer.ListaInsumoRenderer;
import com.pereira.manolos.cliente.listrenderer.ListaRecetaRenderer;
import com.pereira.manolos.datos.database.Tables;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCategoriaProducto;
import com.pereira.manolos.negocio.modelos.ModeloInsumo;
import com.pereira.manolos.negocio.modelos.ModeloProducto;
import com.pereira.manolos.negocio.modelos.ModeloReceta;
import com.pereira.manolos.util.ComboUI;
import com.pereira.manolos.util.ImageConverter;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.SpinnerUI;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.datos.database.Tables.INSUMO;
import static com.pereira.manolos.datos.database.Tables.RECETA;

/* @author Jose Luis */
@SuppressWarnings("serial")
public class DialogProducto extends javax.swing.JDialog {
    
    private final DAOManager manager;
    private ModeloProducto producto = new ModeloProducto();
    private final DefaultListModel<ModeloInsumo> dlmInsumos = new DefaultListModel<>();
    private final DefaultListModel<ModeloReceta> dlmReceta = new DefaultListModel<>();
    private final DefaultComboBoxModel<ModeloCategoriaProducto> dcmCategorias = new DefaultComboBoxModel<>();
    private File file = null;
    private boolean nuevo = true;
    private static final Logger LOG = Logger.getLogger(DialogProducto.class.getName());
    
    public DialogProducto(java.awt.Frame parent, boolean modal, String titulo, DAOManager manager) {
        super(parent, modal);
        this.manager = manager;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle(titulo);
        lRecetas.setCellRenderer(new ListaRecetaRenderer());
        lInsumos.setCellRenderer(new ListaInsumoRenderer());
        cargarRecetas();
        cargarInsumos();
        cargarCategorias();
        cargarFotoNoImage();
    }
    
    public DialogProducto(java.awt.Frame parent, boolean modal, String titulo, DAOManager manager, ModeloProducto producto) {
        super(parent, modal);
        this.manager = manager;
        this.producto = producto;
        this.nuevo = false;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle(titulo);
        lRecetas.setCellRenderer(new ListaRecetaRenderer());
        lInsumos.setCellRenderer(new ListaInsumoRenderer());
        cargarRecetas();
        cargarInsumos();
        cargarCategorias();
        cargarForm();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblTitulo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        lblCategoria = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        lblPorciones = new javax.swing.JLabel();
        spPorciones = new javax.swing.JSpinner();
        lblDescuento = new javax.swing.JLabel();
        spDescuento = new javax.swing.JSpinner();
        btnImagen = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        lblTipoVenta = new javax.swing.JLabel();
        cbxTipoVenta = new javax.swing.JComboBox<>();
        lblPrecio = new javax.swing.JLabel();
        spPrecio = new javax.swing.JSpinner();
        lblLista = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        spReceta = new javax.swing.JScrollPane();
        lRecetas = new javax.swing.JList<>();
        spInsumo = new javax.swing.JScrollPane();
        lInsumos = new javax.swing.JList<>();
        spStock = new javax.swing.JSpinner();
        lblPorciones1 = new javax.swing.JLabel();
        pComandos = new javax.swing.JPanel();
        btnGuardar1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblTitulo.setBackground(colorBG);
        lblTitulo.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(colorBG);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(lblNombre, gridBagConstraints);

        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setMinimumSize(new java.awt.Dimension(200, 35));
        txtNombre.setPreferredSize(new java.awt.Dimension(200, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        jPanel1.add(txtNombre, gridBagConstraints);

        lblDesc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDesc.setText("Descripcion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(lblDesc, gridBagConstraints);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(238, 98));

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        lblCategoria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCategoria.setText("Categoria:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(lblCategoria, gridBagConstraints);

        cbxCategoria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbxCategoria.setModel(dcmCategorias);
        cbxCategoria.setMinimumSize(new java.awt.Dimension(150, 35));
        cbxCategoria.setPreferredSize(new java.awt.Dimension(150, 35));
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(cbxCategoria, gridBagConstraints);
        cbxCategoria.setUI(new ComboUI(colorBG,colorUI, colorBG));

        lblPorciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPorciones.setText("Porciones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(lblPorciones, gridBagConstraints);

        spPorciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spPorciones.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spPorciones.setMinimumSize(new java.awt.Dimension(100, 35));
        spPorciones.setPreferredSize(new java.awt.Dimension(100, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(spPorciones, gridBagConstraints);
        spPorciones.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        lblDescuento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDescuento.setText("Descuento Inv:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(lblDescuento, gridBagConstraints);

        spDescuento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spDescuento.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        spDescuento.setMinimumSize(new java.awt.Dimension(100, 35));
        spDescuento.setPreferredSize(new java.awt.Dimension(100, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 10, 5);
        jPanel1.add(spDescuento, gridBagConstraints);
        spDescuento.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        btnImagen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_imagen_N.png"))); // NOI18N
        btnImagen.setBorder(null);
        btnImagen.setBorderPainted(false);
        btnImagen.setContentAreaFilled(false);
        btnImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImagen.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_imagen_P.png"))); // NOI18N
        btnImagen.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_imagen_O.png"))); // NOI18N
        btnImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        jPanel1.add(btnImagen, gridBagConstraints);

        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setBorder(new javax.swing.border.LineBorder(colorUI, 3, true));
        lblFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblFoto.setMaximumSize(new java.awt.Dimension(250, 250));
        lblFoto.setMinimumSize(new java.awt.Dimension(250, 250));
        lblFoto.setPreferredSize(new java.awt.Dimension(250, 250));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(lblFoto, gridBagConstraints);

        lblTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTipo.setText("Tipo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(lblTipo, gridBagConstraints);

        cbxTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPLETO", "PORCION", "UNIDAD" }));
        cbxTipo.setMinimumSize(new java.awt.Dimension(150, 35));
        cbxTipo.setPreferredSize(new java.awt.Dimension(150, 35));
        cbxTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoItemStateChanged(evt);
            }
        });
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(cbxTipo, gridBagConstraints);
        cbxTipo.setUI(new ComboUI(colorBG,colorUI, colorBG));

        lblTipoVenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTipoVenta.setText("Tipo de Venta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(lblTipoVenta, gridBagConstraints);

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
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(cbxTipoVenta, gridBagConstraints);
        cbxTipoVenta.setUI(new ComboUI(colorBG,colorUI, colorBG));

        lblPrecio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPrecio.setText("Precio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(lblPrecio, gridBagConstraints);

        spPrecio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spPrecio.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        spPrecio.setMinimumSize(new java.awt.Dimension(100, 35));
        spPrecio.setPreferredSize(new java.awt.Dimension(100, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 10, 5);
        jPanel1.add(spPrecio, gridBagConstraints);
        spPrecio.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        lblLista.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblLista.setText("INSUMOS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel1.add(lblLista, gridBagConstraints);

        txtFiltro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtFiltro.setMaximumSize(new java.awt.Dimension(150, 40));
        txtFiltro.setMinimumSize(new java.awt.Dimension(150, 40));
        txtFiltro.setPreferredSize(new java.awt.Dimension(150, 40));
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(txtFiltro, gridBagConstraints);
        /*txtFiltro.setUI(new TextFieldUI(
            " Buscar...", colorUIpressed5, colorUIpressed5, colorBG
        ));*/

        spReceta.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spReceta.setMinimumSize(new java.awt.Dimension(250, 130));
        spReceta.setPreferredSize(new java.awt.Dimension(250, 130));

        lRecetas.setBackground(colorBG);
        lRecetas.setModel(dlmReceta);
        lRecetas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lRecetas.setSelectionBackground(colorUI);
        lRecetas.setSelectionForeground(colorBG);
        lRecetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lRecetasMousePressed(evt);
            }
        });
        lRecetas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lRecetasValueChanged(evt);
            }
        });
        spReceta.setViewportView(lRecetas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 10, 10);
        jPanel1.add(spReceta, gridBagConstraints);

        spInsumo.setBorder(new javax.swing.border.LineBorder(colorUI, 2, true));
        spInsumo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spInsumo.setMinimumSize(new java.awt.Dimension(250, 130));
        spInsumo.setPreferredSize(new java.awt.Dimension(250, 130));

        lInsumos.setBackground(colorBG);
        lInsumos.setModel(dlmInsumos);
        lInsumos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lInsumos.setSelectionBackground(colorUI);
        lInsumos.setSelectionForeground(colorBG);
        lInsumos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lInsumosMousePressed(evt);
            }
        });
        lInsumos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lInsumosValueChanged(evt);
            }
        });
        spInsumo.setViewportView(lInsumos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 10, 10);
        jPanel1.add(spInsumo, gridBagConstraints);

        spStock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spStock.setModel(new javax.swing.SpinnerNumberModel(1.0d, null, null, 1.0d));
        spStock.setMinimumSize(new java.awt.Dimension(100, 35));
        spStock.setPreferredSize(new java.awt.Dimension(100, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(spStock, gridBagConstraints);
        spStock.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        lblPorciones1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPorciones1.setText("Stock");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(lblPorciones1, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(lblTitulo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lInsumosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lInsumosValueChanged
        if (lInsumos.getSelectedIndex() >= 0) {
            
        }
    }//GEN-LAST:event_lInsumosValueChanged

    private void lInsumosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lInsumosMousePressed
        lInsumos.setSelectedIndex(lInsumos.locationToIndex(evt.getPoint()));
    }//GEN-LAST:event_lInsumosMousePressed

    private void lRecetasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lRecetasValueChanged

    }//GEN-LAST:event_lRecetasValueChanged

    private void lRecetasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lRecetasMousePressed
        lRecetas.setSelectedIndex(lRecetas.locationToIndex(evt.getPoint()));
    }//GEN-LAST:event_lRecetasMousePressed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        cargarInsumos();
        cargarRecetas();
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void cbxTipoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoVentaActionPerformed

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoActionPerformed

    private void cbxTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoItemStateChanged
        if (cbxTipo.getSelectedIndex() == 2) {
            spInsumo.setVisible(true);
            spReceta.setVisible(false);
            lblLista.setText("Seleccione Insumo:");
            cargarInsumos();
        } else {
            spInsumo.setVisible(false);
            spReceta.setVisible(true);
            lblLista.setText("Seleccione Receta:");
            cargarRecetas();
        }
    }//GEN-LAST:event_cbxTipoItemStateChanged

    private void btnImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenActionPerformed
        JFileChooser chooser = new javax.swing.JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG", "jpg");
        chooser.setFileFilter(filtro);
        int res = chooser.showOpenDialog(DialogProducto.this);
        if (res == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
            ImageIcon image = new ImageIcon(file.getAbsolutePath());
            Rectangle rect = lblFoto.getBounds();
            Image scaledImage = image.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
            image = new ImageIcon(scaledImage);
            lblFoto.setIcon(image);
        }
    }//GEN-LAST:event_btnImagenActionPerformed

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoriaActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        if (nuevo) {
            guardarProducto();
        } else {
            editarProducto();
        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnImagen;
    private javax.swing.JComboBox<ModeloCategoriaProducto> cbxCategoria;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JComboBox<String> cbxTipoVenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<ModeloInsumo> lInsumos;
    private javax.swing.JList<ModeloReceta> lRecetas;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPorciones;
    private javax.swing.JLabel lblPorciones1;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipoVenta;
    private javax.swing.JPanel lblTitulo;
    private javax.swing.JPanel pComandos;
    private javax.swing.JSpinner spDescuento;
    private javax.swing.JScrollPane spInsumo;
    private javax.swing.JSpinner spPorciones;
    private javax.swing.JSpinner spPrecio;
    private javax.swing.JScrollPane spReceta;
    private javax.swing.JSpinner spStock;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarForm() {
        txtNombre.setText(producto.getNombre());
        txtDesc.setText(producto.getDetalle());
        /*CARGAR CATEGORIA*/
        for (int i = 0; i < cbxCategoria.getItemCount(); i++) {
            ModeloCategoriaProducto cat = cbxCategoria.getItemAt(i);
            if (producto.getCategoria() != null) {
                if (producto.getCategoria().getIdcategoria() == cat.getIdcategoria()) {
                    cbxCategoria.setSelectedIndex(i);
                }
            }
        }
        spPorciones.setValue(producto.getPorciones());
        spDescuento.setValue(producto.getDescuento());
        switch (producto.getTipo()) {
            case "U":
                cbxTipo.setSelectedIndex(2);
                txtFiltro.setText(producto.getInsumo().getNombre());
                cargarInsumos();
                break;
            case "P":
                cbxTipo.setSelectedIndex(1);
                txtFiltro.setText(producto.getReceta().getNombre());
                cargarRecetas();
                break;
            default:
                cbxTipo.setSelectedIndex(0);
                txtFiltro.setText(producto.getReceta().getNombre());
                cargarRecetas();
                break;
        }
        
        switch (producto.getTipoventa()) {
            case "G":
                cbxTipoVenta.setSelectedIndex(0);
                break;
            case "E":
                cbxTipoVenta.setSelectedIndex(1);
                break;
            default:
                cbxTipoVenta.setSelectedIndex(2);
                break;
        }
        spPrecio.setValue(producto.getPrecio().doubleValue());
        spStock.setValue(producto.getStock());
        /*cargar imagen*/
        ImageIcon image;
        try {
            image = new ImageIcon(ImageConverter.byteToImage(producto.getImagen()));
            Image scaledImage = image.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
            image = new ImageIcon(scaledImage);
            lblFoto.setIcon(image);
        } catch (IOException ex) {
            Logger.getLogger(DialogPromociones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void guardarProducto() {
        producto.setNombre(txtNombre.getText());
        producto.setDetalle(txtDesc.getText());
        producto.setCategoria((ModeloCategoriaProducto) cbxCategoria.getSelectedItem());
        producto.setPorciones((int) spPorciones.getValue());
        producto.setDescuento((double) spDescuento.getValue());
        try {
            producto.setImagen(ImageConverter.imageToByte(file));
        } catch (IOException ex) {
            Logger.getLogger(DialogProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        switch (cbxTipo.getSelectedItem().toString()) {
            case "COMPLETO":
                producto.setTipo("C");
                producto.setReceta(lRecetas.getSelectedValue());
                break;
            case "PORCION":
                producto.setTipo("P");
                producto.setReceta(lRecetas.getSelectedValue());
                break;
            case "UNIDAD":
                producto.setTipo("U");
                producto.setInsumo(lInsumos.getSelectedValue());
                break;
        }
        switch (cbxTipoVenta.getSelectedItem().toString()) {
            case "GRAVADA":
                producto.setTipoventa("G");
                break;
            case "EXENTA":
                producto.setTipoventa("E");
                break;
            case "NO SUJETA":
                producto.setTipoventa("NS");
                break;
        }
        producto.setPrecio(new BigDecimal((double) spPrecio.getValue()));
        producto.setStock((double) spStock.getValue());
        try {
            manager.getProductoDAO().insertar(producto);
            Mensajes.mensajeOk("Registro agregado exitosamente!");
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        } finally {
            dispose();
        }
    }
    
    private void editarProducto() {
        producto.setNombre(txtNombre.getText());
        producto.setDetalle(txtDesc.getText());
        producto.setCategoria((ModeloCategoriaProducto) cbxCategoria.getSelectedItem());
        producto.setPorciones((int) spPorciones.getValue());
        producto.setDescuento((double) spDescuento.getValue());
        if (file != null) {
            try {
                producto.setImagen(ImageConverter.imageToByte(file));
            } catch (IOException ex) {
                Logger.getLogger(DialogProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        switch (cbxTipo.getSelectedItem().toString()) {
            case "COMPLETO":
                producto.setTipo("C");
                producto.setReceta(lRecetas.getSelectedValue());
                break;
            case "PORCION":
                producto.setTipo("P");
                producto.setReceta(lRecetas.getSelectedValue());
                break;
            case "UNIDAD":
                producto.setTipo("U");
                producto.setInsumo(lInsumos.getSelectedValue());
                break;
        }
        switch (cbxTipoVenta.getSelectedItem().toString()) {
            case "GRAVADA":
                producto.setTipoventa("G");
                break;
            case "EXENTA":
                producto.setTipoventa("E");
                break;
            case "NO SUJETA":
                producto.setTipoventa("NS");
                break;
        }
        producto.setPrecio(new BigDecimal((double) spPrecio.getValue()));
        producto.setStock((double) spStock.getValue());
        try {
            manager.getProductoDAO().modificar(producto);
            Mensajes.mensajeOk("Registro editado exitosamente!");
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        } finally {
            dispose();
        }
    }
    
    private void cargarInsumos() {
        dlmInsumos.clear();
        Condition baja = INSUMO.BAJA.equal(false);
        Condition filtro = INSUMO.NOMBRE.likeIgnoreCase("%" + txtFiltro.getText() + "%");
        Condition tipo = INSUMO.PRODUCCION.eq(false);
        try {
            manager.getInsumoDAO().obtenerLista(filtro.and(baja).and(tipo)).forEach(insumo -> {
                dlmInsumos.addElement(insumo);
            });
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        }
        if (!dlmInsumos.isEmpty()) {
            lInsumos.setSelectedIndex(0);
        }
    }
    
    private void cargarRecetas() {
        dlmReceta.clear();
        Condition filtro = RECETA.NOMBRE.likeIgnoreCase("%" + txtFiltro.getText() + "%");
        Condition baja = RECETA.BAJA.eq(false);
        Condition tipo = RECETA.TIPORECETA.eq("RESTAURANTE");
        try {
            manager.getRecetaDAO().obtenerLista(filtro.and(baja).and(tipo)).forEach(r -> {
                dlmReceta.addElement(r);
            });
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        }
        if (!dlmReceta.isEmpty()) {
            lRecetas.setSelectedIndex(0);
        }
    }
    
    private void cargarCategorias() {
        dcmCategorias.removeAllElements();
        Condition c = Tables.CATEGORIA_PRODUCTO.IDCATEGORIA.greaterOrEqual(1);
        try {
            manager.getCategoriaProductoDAO().obtenerLista(c).forEach(cat -> {
                dcmCategorias.addElement(cat);
            });
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        }
        /*if ( dcmCategorias.getSize () > 0 ) {
            cbxCategoria.setSelectedIndex ( 0 );
        } else {
            Mensajes.mensajeError ( "Error: No existen Categorias!" );
            dispose ();
        }*/
    }
    
    private void cargarFotoNoImage() {
        file = new File("images\\noimage.jpg");
        ImageIcon image = new ImageIcon(file.getAbsolutePath());
        Rectangle rect = lblFoto.getBounds();
        Image scaledImage = image.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        image = new ImageIcon(scaledImage);
        lblFoto.setIcon(image);
    }
    
}
