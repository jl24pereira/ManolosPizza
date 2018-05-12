package com.pereira.manolos.cliente.panels;

import com.mrlonee.swing.animation.AnimatedPanel;
import com.pereira.manolos.cliente.dialogs.DialogCobro;
import com.pereira.manolos.cliente.dialogs.DialogSeleccionCliente;
import com.pereira.manolos.cliente.listarenderer.DetalleVentaRenderer;
import com.pereira.manolos.cliente.listarenderer.ProductoRenderer;
import com.pereira.manolos.cliente.listarenderer.PromocionRenderer;
import com.pereira.manolos.cliente.main.PanelInicio;
import com.pereira.manolos.datos.database.Tables;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCaja;
import com.pereira.manolos.negocio.modelos.ModeloCategoriaProducto;
import com.pereira.manolos.negocio.modelos.ModeloCliente;
import com.pereira.manolos.negocio.modelos.ModeloCotizacion;
import com.pereira.manolos.negocio.modelos.ModeloDetalleCotizacion;
import com.pereira.manolos.negocio.modelos.ModeloDetalleVenta;
import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.negocio.modelos.ModeloProducto;
import com.pereira.manolos.negocio.modelos.ModeloPromocion;
import com.pereira.manolos.negocio.modelos.ModeloResolucion;
import com.pereira.manolos.negocio.modelos.ModeloVenta;
import com.pereira.manolos.util.AgregarPanel;
import com.pereira.manolos.util.JKeyboardPane;
import com.pereira.manolos.util.JNumKeyboardPane;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.NumerosLetras;
import com.pereira.manolos.util.TabbedPanelUI;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.Principal.pBody;
import static com.pereira.manolos.datos.database.Tables.CATEGORIA_PRODUCTO;
import static com.pereira.manolos.datos.database.Tables.PRODUCTO;
import static com.pereira.manolos.datos.database.Tables.PROMOCION;

public class PanelVenta extends AnimatedPanel {

    private DefaultListModel<ModeloCategoriaProducto> dlmCategorias = new DefaultListModel<>();
    private final DefaultListModel<ModeloProducto> dlmProductos = new DefaultListModel<>();
    private final DefaultListModel<ModeloDetalleVenta> dlmDetalle = new DefaultListModel<>();
    private final DefaultListModel<ModeloPromocion> dlmPromociones = new DefaultListModel<>();
    private final DAOManager manager;
    private ModeloVenta venta;
    private final ModeloCaja caja;
    private final ModeloEmpleado empleado;
    private ModeloResolucion resolucion;
    private ModeloCliente cliente;
    private final AgregarPanel agregar = new AgregarPanel();
    private JPopupMenu pop = new JPopupMenu();
    private JKeyboardPane keyboard;
    private JNumKeyboardPane numpad;

    public PanelVenta(DAOManager manager, ModeloEmpleado empleado, ModeloCaja caja) {
        this.manager = manager;
        this.empleado = empleado;
        initComponents();
        cargarCategorias();
        cargarPromociones();
        //lCategorias.setCellRenderer ( new CategoriaProductoRenderer () );
        lProductos.setCellRenderer(new ProductoRenderer());
        lDetalle.setCellRenderer(new DetalleVentaRenderer());
        lPromociones.setCellRenderer(new PromocionRenderer());
        this.caja = caja;
        reiniciarVenta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        grupoVenta = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tp = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        pCategorias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lCategorias = new javax.swing.JList<>();
        txtFiltroCategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pProductos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lProductos = new javax.swing.JList<>();
        txtFiltroProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pProductos1 = new javax.swing.JPanel();
        txtFiltroPromo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lPromociones = new javax.swing.JList<>();
        pDetalle = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lDetalle = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        pVenta = new javax.swing.JPanel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        btnCobrar = new javax.swing.JButton();

        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        tp.setBackground(new java.awt.Color(255, 255, 255));
        tp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tp.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        pCategorias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 195, 74), 3, true));
        pCategorias.setMinimumSize(new java.awt.Dimension(250, 100));
        pCategorias.setOpaque(false);
        pCategorias.setPreferredSize(new java.awt.Dimension(250, 100));
        pCategorias.setRequestFocusEnabled(false);
        pCategorias.setLayout(new java.awt.GridBagLayout());

        lCategorias.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lCategorias.setModel(dlmCategorias);
        lCategorias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lCategorias.setFixedCellHeight(50);
        lCategorias.setSelectionBackground(new java.awt.Color(139, 195, 74));
        lCategorias.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lCategoriasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lCategorias);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        pCategorias.add(jScrollPane1, gridBagConstraints);

        txtFiltroCategoria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtFiltroCategoria.setMinimumSize(new java.awt.Dimension(250, 35));
        txtFiltroCategoria.setPreferredSize(new java.awt.Dimension(250, 35));
        txtFiltroCategoria.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFiltroCategoriaCaretUpdate(evt);
            }
        });
        txtFiltroCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFiltroCategoriaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFiltroCategoriaFocusLost(evt);
            }
        });
        txtFiltroCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFiltroCategoriaMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pCategorias.add(txtFiltroCategoria, gridBagConstraints);

        jLabel3.setBackground(new java.awt.Color(139, 195, 74));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CATEGORIAS");
        jLabel3.setMaximumSize(new java.awt.Dimension(159, 50));
        jLabel3.setMinimumSize(new java.awt.Dimension(159, 50));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(159, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pCategorias.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(pCategorias, gridBagConstraints);

        pProductos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 195, 74), 3, true));
        pProductos.setMinimumSize(new java.awt.Dimension(445, 104));
        pProductos.setOpaque(false);
        pProductos.setPreferredSize(new java.awt.Dimension(445, 104));
        pProductos.setLayout(new java.awt.GridBagLayout());

        lProductos.setModel(dlmProductos);
        lProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lProductos.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        lProductos.setSelectionBackground(new java.awt.Color(139, 195, 74));
        lProductos.setVisibleRowCount(-1);
        lProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lProductosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lProductosMousePressed(evt);
            }
        });
        lProductos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lProductosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lProductos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        pProductos.add(jScrollPane3, gridBagConstraints);

        txtFiltroProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtFiltroProducto.setMinimumSize(new java.awt.Dimension(250, 35));
        txtFiltroProducto.setPreferredSize(new java.awt.Dimension(250, 35));
        txtFiltroProducto.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFiltroProductoCaretUpdate(evt);
            }
        });
        txtFiltroProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFiltroProductoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFiltroProductoFocusLost(evt);
            }
        });
        txtFiltroProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFiltroProductoMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        pProductos.add(txtFiltroProducto, gridBagConstraints);

        jLabel4.setBackground(new java.awt.Color(139, 195, 74));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PRODUCTOS");
        jLabel4.setMaximumSize(new java.awt.Dimension(159, 50));
        jLabel4.setMinimumSize(new java.awt.Dimension(159, 50));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(159, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pProductos.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel2.add(pProductos, gridBagConstraints);

        tp.addTab("PRODUCTOS", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        pProductos1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 195, 74), 3, true));
        pProductos1.setMinimumSize(new java.awt.Dimension(445, 104));
        pProductos1.setOpaque(false);
        pProductos1.setPreferredSize(new java.awt.Dimension(445, 104));
        pProductos1.setLayout(new java.awt.GridBagLayout());

        txtFiltroPromo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtFiltroPromo.setMinimumSize(new java.awt.Dimension(250, 35));
        txtFiltroPromo.setPreferredSize(new java.awt.Dimension(250, 35));
        txtFiltroPromo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFiltroPromoCaretUpdate(evt);
            }
        });
        txtFiltroPromo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFiltroPromoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFiltroPromoFocusLost(evt);
            }
        });
        txtFiltroPromo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFiltroPromoMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        pProductos1.add(txtFiltroPromo, gridBagConstraints);

        jLabel6.setBackground(new java.awt.Color(139, 195, 74));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PROMOCIONES DEL DIA");
        jLabel6.setMaximumSize(new java.awt.Dimension(159, 50));
        jLabel6.setMinimumSize(new java.awt.Dimension(159, 50));
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(159, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pProductos1.add(jLabel6, gridBagConstraints);

        lPromociones.setModel(dlmPromociones);
        lPromociones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lPromociones.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        lPromociones.setSelectionBackground(new java.awt.Color(139, 195, 74));
        lPromociones.setVisibleRowCount(-1);
        lPromociones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lPromocionesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lPromocionesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lPromocionesMouseReleased(evt);
            }
        });
        lPromociones.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lPromocionesValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(lPromociones);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pProductos1.add(jScrollPane4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel3.add(pProductos1, gridBagConstraints);

        tp.addTab("PROMOCIONES", jPanel3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(tp, gridBagConstraints);
        tp.setUI(new TabbedPanelUI(new Color(139,195,74),Color.WHITE));

        pDetalle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 195, 74), 3, true));
        pDetalle.setOpaque(false);
        pDetalle.setLayout(new java.awt.GridBagLayout());

        btnAtras.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_atras_normal.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.setFocusPainted(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pDetalle.add(btnAtras, gridBagConstraints);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(23, 23));

        lDetalle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lDetalle.setModel(dlmDetalle);
        lDetalle.setSelectionBackground(new java.awt.Color(139, 195, 74));
        jScrollPane2.setViewportView(lDetalle);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pDetalle.add(jScrollPane2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Total");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        pDetalle.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        pDetalle.add(jLabel2, gridBagConstraints);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_eliminar_normal.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pDetalle.add(btnEliminar, gridBagConstraints);

        btnMas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_plus_normal.png"))); // NOI18N
        btnMas.setBorder(null);
        btnMas.setBorderPainted(false);
        btnMas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMas.setFocusPainted(false);
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pDetalle.add(btnMas, gridBagConstraints);

        btnMenos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_minus_normal.png"))); // NOI18N
        btnMenos.setBorder(null);
        btnMenos.setBorderPainted(false);
        btnMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenos.setFocusPainted(false);
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pDetalle.add(btnMenos, gridBagConstraints);

        lblTotal.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTotal.setText("00.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        pDetalle.add(lblTotal, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pDetalle.add(jSeparator1, gridBagConstraints);

        jLabel5.setBackground(new java.awt.Color(139, 195, 74));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DETALLE DE VENTA");
        jLabel5.setMaximumSize(new java.awt.Dimension(159, 50));
        jLabel5.setMinimumSize(new java.awt.Dimension(159, 50));
        jLabel5.setOpaque(true);
        jLabel5.setPreferredSize(new java.awt.Dimension(159, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        pDetalle.add(jLabel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel1.add(pDetalle, gridBagConstraints);

        pVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 195, 74), 2, true), "TIPO DE VENTA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 16), new java.awt.Color(139, 195, 74))); // NOI18N
        pVenta.setOpaque(false);
        pVenta.setLayout(new java.awt.GridBagLayout());

        grupoVenta.add(rb1);
        rb1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rb1.setSelected(true);
        rb1.setText("RESTAURANTE");
        rb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rb1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Unchecked Checkbox-48.png"))); // NOI18N
        rb1.setRolloverEnabled(false);
        rb1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Checked Checkbox-48.png"))); // NOI18N
        rb1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 10);
        pVenta.add(rb1, gridBagConstraints);

        grupoVenta.add(rb2);
        rb2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rb2.setText("LLEVAR");
        rb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rb2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Unchecked Checkbox-48.png"))); // NOI18N
        rb2.setRolloverEnabled(false);
        rb2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Checked Checkbox-48.png"))); // NOI18N
        rb2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 10);
        pVenta.add(rb2, gridBagConstraints);

        grupoVenta.add(rb3);
        rb3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rb3.setText("DOMICILIO");
        rb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rb3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Unchecked Checkbox-48.png"))); // NOI18N
        rb3.setRolloverEnabled(false);
        rb3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Checked Checkbox-48.png"))); // NOI18N
        rb3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rb3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb3ItemStateChanged(evt);
            }
        });
        rb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb3MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 10);
        pVenta.add(rb3, gridBagConstraints);

        grupoVenta.add(rb4);
        rb4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rb4.setText("COTIZACION");
        rb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rb4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Unchecked Checkbox-48.png"))); // NOI18N
        rb4.setRolloverEnabled(false);
        rb4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Checked Checkbox-48.png"))); // NOI18N
        rb4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb4MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 10);
        pVenta.add(rb4, gridBagConstraints);

        btnCobrar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_cobrar_normal.png"))); // NOI18N
        btnCobrar.setBorder(null);
        btnCobrar.setBorderPainted(false);
        btnCobrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCobrar.setFocusPainted(false);
        btnCobrar.setMaximumSize(new java.awt.Dimension(105, 70));
        btnCobrar.setMinimumSize(new java.awt.Dimension(105, 70));
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 10);
        pVenta.add(btnCobrar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel1.add(pVenta, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        cerrarPanel();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        if (!lDetalle.isSelectionEmpty()) {
            ModeloDetalleVenta detalle = lDetalle.getSelectedValue();
            int cantidad = detalle.getCantidad() - 1;
            if (cantidad <= 0) {
                //elimine de detalle
                dlmDetalle.remove(lDetalle.getSelectedIndex());
            } else {
                detalle.setCantidad(cantidad);
                double precio = detalle.getPrecio().doubleValue();
                double subtotal = precio * (double) cantidad;
                //detalle.setSubtotal ( new BigDecimal ( subtotal ) );
            }
            lDetalle.repaint();
            totalizar();
        }
    }//GEN-LAST:event_btnMenosActionPerformed

    private void lCategoriasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lCategoriasValueChanged
        if (!lCategorias.isSelectionEmpty()) {
            cargarProductos();
        }
    }//GEN-LAST:event_lCategoriasValueChanged

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        if (!lDetalle.isSelectionEmpty()) {
            ModeloDetalleVenta detalle = lDetalle.getSelectedValue();
            int cantidad = detalle.getCantidad() + 1;
            detalle.setCantidad(cantidad);
            double precio = detalle.getPrecio().doubleValue();
            double subtotal = precio * cantidad;
            //detalle.setSubtotal ( new BigDecimal ( subtotal ) );
            lDetalle.repaint();
            totalizar();
        }
    }//GEN-LAST:event_btnMasActionPerformed

    private void lProductosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lProductosValueChanged
        //System.out.println ( "producto=" + lProductos.getSelectedValue ().getNombre () );
    }//GEN-LAST:event_lProductosValueChanged

    private void lProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lProductosMouseClicked
        lProductos.setSelectedIndex(lProductos.locationToIndex(evt.getPoint()));
        agregarProducto();
        lDetalle.repaint();
    }//GEN-LAST:event_lProductosMouseClicked

    private void lProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lProductosMousePressed
        if (evt.getButton() == MouseEvent.BUTTON1) {
            lProductos.setSelectedIndex(lProductos.locationToIndex(evt.getPoint()));
        }
    }//GEN-LAST:event_lProductosMousePressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!lDetalle.isSelectionEmpty()) {
            dlmDetalle.remove(lDetalle.getSelectedIndex());
            lDetalle.repaint();
            totalizar();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        if (!dlmDetalle.isEmpty()) {
            if (rb4.isSelected()) {
                agregarCotizacion();
            } else {
                if (rb1.isSelected()) {
                    venta.setTipoventa("RESTAURANTE");
                } else if (rb2.isSelected()) {
                    venta.setTipoventa("LLEVAR");
                } else {
                    venta.setCliente(cliente);
                    venta.setTipoventa("DOMICILIO");
                }
                venta.setTotal(new BigDecimal(lblTotal.getText()));
                venta.setEnletras(NumerosLetras.convertNumberToLetter(Double.parseDouble(lblTotal.getText())));
                venta.setFecha(new Date());
                if (venta.getTotal().doubleValue() >= 200 && !rb3.isSelected()) {
                    Mensajes.mensajeInfo("Venta mayor o igual a $200, necesita seleccionar cliente o agregue uno nuevo!");
                    DialogSeleccionCliente dialogSeleccionCliente = new DialogSeleccionCliente(new JFrame(), true, "SELECCION DE CLIENTE",
                            manager);
                    dialogSeleccionCliente.setVisible(true);
                    if (dialogSeleccionCliente.getCliente() != null) {
                        venta.setCliente(dialogSeleccionCliente.getCliente());
                        DialogCobro dialogCobro = new DialogCobro(new JFrame(), true, manager, venta, Collections.
                                list(dlmDetalle.elements()),
                                this);
                        dialogCobro.setVisible(true);
                    } else {
                        Mensajes.mensajeAlert("Venta mayor o igual a $200, necesita seleccionar cliente o agregue uno nuevo!");
                    }
                } else {
                    DialogCobro dialogCobro = new DialogCobro(new JFrame(), true, manager, venta, Collections.list(dlmDetalle.elements()),
                            this);
                    dialogCobro.setVisible(true);
                }

            }
        } else {
            Mensajes.mensajeAlert("Agregue productos para poder facturar!");
        }
    }//GEN-LAST:event_btnCobrarActionPerformed

    private void rb3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb3ItemStateChanged

    }//GEN-LAST:event_rb3ItemStateChanged

    private void rb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb3MouseClicked
        if (rb3.isSelected()) {
            DialogSeleccionCliente dialog = new DialogSeleccionCliente(new javax.swing.JFrame(), true, "SELECCION DE CLIENTE", manager);
            dialog.setVisible(true);
            if (dialog.getCliente() == null) {
                rb1.setSelected(true);
            } else {
                cliente = dialog.getCliente();
            }
        }
    }//GEN-LAST:event_rb3MouseClicked

    private void rb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb4MouseClicked
        if (rb4.isSelected()) {
            DialogSeleccionCliente dialog = new DialogSeleccionCliente(new javax.swing.JFrame(), true, "SELECCION DE CLIENTE", manager);
            dialog.setVisible(true);
            if (dialog.getCliente() == null) {
                rb1.setSelected(true);
            } else {
                cliente = dialog.getCliente();
            }
        }
    }//GEN-LAST:event_rb4MouseClicked

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        if (resolucion == null) {
            new AgregarPanel().insertarPanelMain(pBody, new PanelInicio(manager));
        }
    }//GEN-LAST:event_formAncestorAdded

    private void lPromocionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lPromocionesMouseClicked
        lPromociones.setSelectedIndex(lPromociones.locationToIndex(evt.getPoint()));
        agregarPromocion();
        lDetalle.repaint();
    }//GEN-LAST:event_lPromocionesMouseClicked

    private void lPromocionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lPromocionesMousePressed
        if (evt.getButton() == MouseEvent.BUTTON1) {
            lPromociones.setSelectedIndex(lPromociones.locationToIndex(evt.getPoint()));
        }
    }//GEN-LAST:event_lPromocionesMousePressed

    private void lPromocionesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lPromocionesMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lPromocionesMouseReleased

    private void lPromocionesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lPromocionesValueChanged

    }//GEN-LAST:event_lPromocionesValueChanged

    private void txtFiltroCategoriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroCategoriaFocusLost
        pop.setVisible(false);
    }//GEN-LAST:event_txtFiltroCategoriaFocusLost

    private void txtFiltroCategoriaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFiltroCategoriaCaretUpdate
        cargarCategorias();
    }//GEN-LAST:event_txtFiltroCategoriaCaretUpdate

    private void txtFiltroProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroProductoFocusLost
        pop.setVisible(false);
    }//GEN-LAST:event_txtFiltroProductoFocusLost

    private void txtFiltroProductoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFiltroProductoCaretUpdate
        if (!lCategorias.isSelectionEmpty()) {
            cargarProductos();
        }
    }//GEN-LAST:event_txtFiltroProductoCaretUpdate

    private void txtFiltroProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltroProductoMouseClicked
        if (!pop.isVisible()) {
            //pop = new JPopupMenu ();
            if (keyboard != null) {
                pop.remove(keyboard);
            }
            keyboard = new JKeyboardPane(txtFiltroProducto);
            pop.add(keyboard);
            pop.requestFocus();
            //this.setModal ( false );
            pop.setVisible(true);
            pop.setLocation(txtFiltroProducto.getLocationOnScreen().x - 1,
                    txtFiltroProducto.getLocationOnScreen().y + txtFiltroProducto.getSize().height);
        }
    }//GEN-LAST:event_txtFiltroProductoMouseClicked

    private void txtFiltroCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltroCategoriaMouseClicked
        if (!pop.isVisible()) {
            if (keyboard != null) {
                pop.remove(keyboard);
            }
            keyboard = new JKeyboardPane(txtFiltroCategoria);
            pop.add(keyboard);
            pop.requestFocus();
            //this.setModal ( false );
            pop.setVisible(true);
            pop.setLocation(txtFiltroCategoria.getLocationOnScreen().x - 1,
                    txtFiltroCategoria.getLocationOnScreen().y + txtFiltroCategoria.getSize().height);
        }
    }//GEN-LAST:event_txtFiltroCategoriaMouseClicked

    private void txtFiltroCategoriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroCategoriaFocusGained
        if (!pop.isVisible()) {
            if (keyboard != null) {
                pop.remove(keyboard);
            }
            keyboard = new JKeyboardPane(txtFiltroCategoria);
            pop.add(keyboard);
            pop.requestFocus();
            //this.setModal ( false );
            pop.setVisible(true);
            pop.setLocation(txtFiltroCategoria.getLocationOnScreen().x - 1,
                    txtFiltroCategoria.getLocationOnScreen().y + txtFiltroCategoria.getSize().height);
        }
    }//GEN-LAST:event_txtFiltroCategoriaFocusGained

    private void txtFiltroProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroProductoFocusGained
        if (!pop.isVisible()) {
            //pop = new JPopupMenu ();
            if (keyboard != null) {
                pop.remove(keyboard);
            }
            keyboard = new JKeyboardPane(txtFiltroProducto);
            pop.add(keyboard);
            pop.requestFocus();
            //this.setModal ( false );
            pop.setVisible(true);
            pop.setLocation(txtFiltroProducto.getLocationOnScreen().x - 1,
                    txtFiltroProducto.getLocationOnScreen().y + txtFiltroProducto.getSize().height);
        }
    }//GEN-LAST:event_txtFiltroProductoFocusGained

    private void txtFiltroPromoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFiltroPromoCaretUpdate
        cargarPromociones();
    }//GEN-LAST:event_txtFiltroPromoCaretUpdate

    private void txtFiltroPromoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroPromoFocusGained
        if (!pop.isVisible()) {
            if (keyboard != null) {
                pop.remove(keyboard);
            }
            keyboard = new JKeyboardPane(txtFiltroPromo);
            pop.add(keyboard);
            pop.requestFocus();
            //this.setModal ( false );
            pop.setVisible(true);
            pop.setLocation(txtFiltroPromo.getLocationOnScreen().x - 1,
                    txtFiltroPromo.getLocationOnScreen().y + txtFiltroPromo.getSize().height);
        }
    }//GEN-LAST:event_txtFiltroPromoFocusGained

    private void txtFiltroPromoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroPromoFocusLost
        pop.setVisible(false);
    }//GEN-LAST:event_txtFiltroPromoFocusLost

    private void txtFiltroPromoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltroPromoMouseClicked
        if (!pop.isVisible()) {
            if (keyboard != null) {
                pop.remove(keyboard);
            }
            keyboard = new JKeyboardPane(txtFiltroPromo);
            pop.add(keyboard);
            pop.requestFocus();
            //this.setModal ( false );
            pop.setVisible(true);
            pop.setLocation(txtFiltroPromo.getLocationOnScreen().x - 1,
                    txtFiltroPromo.getLocationOnScreen().y + txtFiltroPromo.getSize().height);
        }
    }//GEN-LAST:event_txtFiltroPromoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.ButtonGroup grupoVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<ModeloCategoriaProducto> lCategorias;
    private javax.swing.JList<ModeloDetalleVenta> lDetalle;
    private javax.swing.JList<ModeloProducto> lProductos;
    private javax.swing.JList<ModeloPromocion> lPromociones;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pCategorias;
    private javax.swing.JPanel pDetalle;
    private javax.swing.JPanel pProductos;
    private javax.swing.JPanel pProductos1;
    private javax.swing.JPanel pVenta;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JTabbedPane tp;
    private javax.swing.JTextField txtFiltroCategoria;
    private javax.swing.JTextField txtFiltroProducto;
    private javax.swing.JTextField txtFiltroPromo;
    // End of variables declaration//GEN-END:variables

    private void cargarCategorias() {
        dlmCategorias.clear();
        dlmProductos.clear();
        Condition c = CATEGORIA_PRODUCTO.NOMBRE.likeIgnoreCase("%" + txtFiltroCategoria.getText() + "%");
        try {
            manager.getCategoriaProductoDAO().obtenerLista(c).forEach(categoria -> {
                dlmCategorias.addElement(categoria);
            });
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        }
        if (lCategorias.getModel().getSize() > 0) {
            lCategorias.setSelectedIndex(0);
        }
    }

    private void cargarProductos() {
        dlmProductos.clear();
        if (!lCategorias.isSelectionEmpty()) {
            Condition c = PRODUCTO.IDCATEGORIA.eq(lCategorias.getSelectedValue().getIdcategoria());
            Condition d = PRODUCTO.NOMBRE.likeIgnoreCase("%" + txtFiltroProducto.getText() + "%");
            Condition e = PRODUCTO.BAJA.eq(false);
            try {
                manager.getProductoDAO().obtenerLista(c.and(d).and(e)).forEach(producto -> {
                    dlmProductos.addElement(producto);
                });
            } catch (Exception ex) {
                LOG.log(Level.SEVERE, null, ex);
                Mensajes.mensajeError("Error: " + ex.getMessage());
            }
        }
    }

    private void cargarPromociones() {
        dlmPromociones.clear();
        Condition c = PROMOCION.NOMBRE.likeIgnoreCase("%" + txtFiltroPromo.getText() + "%");
        try {
            manager.getPromocionDAO().obtenerLista(c).forEach(promo -> {
                dlmPromociones.addElement(promo);
            });
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        }
    }

    private void agregarProducto() {
        boolean onDetalle = false;
        ModeloDetalleVenta producto = new ModeloDetalleVenta();
        if (dlmDetalle.isEmpty()) {
            producto.setProducto(lProductos.getSelectedValue());
            producto.setCantidad(1);
            producto.setPrecio(lProductos.getSelectedValue().getPrecio());
            producto.setTipo(lProductos.getSelectedValue().getTipoventa());
            producto.setPromo(false);
            dlmDetalle.addElement(producto);
        } else {
            for (int i = 0; i < dlmDetalle.getSize(); i++) {
                if (!dlmDetalle.get(i).isPromo()) {
                    if (dlmDetalle.get(i).getProducto().getIdproducto() == lProductos.getSelectedValue().getIdproducto()) {
                        onDetalle = true;
                        dlmDetalle.get(i).setCantidad(dlmDetalle.get(i).getCantidad() + 1);
                        break;
                    }
                }
            }
            if (!onDetalle) {
                producto.setProducto(lProductos.getSelectedValue());
                producto.setCantidad(1);
                producto.setPrecio(lProductos.getSelectedValue().getPrecio());
                producto.setTipo(lProductos.getSelectedValue().getTipoventa());
                producto.setPromo(false);
                dlmDetalle.addElement(producto);
            }
        }
        if (lDetalle.getModel().getSize() > 0) {
            lDetalle.setSelectedIndex(0);
        }
        totalizar();
    }

    private void agregarPromocion() {
        boolean onDetalle = false;
        ModeloDetalleVenta producto = new ModeloDetalleVenta();
        if (dlmDetalle.isEmpty()) {
            producto.setPromocion(lPromociones.getSelectedValue());
            producto.setCantidad(1);
            producto.setPrecio(lPromociones.getSelectedValue().getPrecio());
            producto.setTipo(lPromociones.getSelectedValue().getTipo());
            producto.setPromo(true);
            dlmDetalle.addElement(producto);
        } else {
            for (int i = 0; i < dlmDetalle.getSize(); i++) {
                if (dlmDetalle.get(i).isPromo()) {
                    if (dlmDetalle.get(i).getPromocion().getIdpromocion() == lPromociones.getSelectedValue().getIdpromocion()) {
                        onDetalle = true;
                        dlmDetalle.get(i).setCantidad(dlmDetalle.get(i).getCantidad() + 1);
                        break;
                    }
                }
            }
            if (!onDetalle) {
                producto.setPromocion(lPromociones.getSelectedValue());
                producto.setCantidad(1);
                producto.setPrecio(lPromociones.getSelectedValue().getPrecio());
                producto.setTipo(lPromociones.getSelectedValue().getTipo());
                producto.setPromo(true);
                dlmDetalle.addElement(producto);
            }
        }
        if (lDetalle.getModel().getSize() > 0) {
            lDetalle.setSelectedIndex(0);
        }
        totalizar();
    }

    private void totalizar() {
        double sumatoria = 0;
        if (dlmDetalle.isEmpty()) {
            lblTotal.setText("0.00");
        } else {
            for (int i = 0; i < dlmDetalle.size(); i++) {
                ModeloDetalleVenta modelo = dlmDetalle.getElementAt(i);
                int cantidad = modelo.getCantidad();
                double precio = modelo.getPrecio().doubleValue();
                sumatoria += (cantidad * precio);
            }
            lblTotal.setText(String.format("%.2f", sumatoria));
        }
    }

    private void agregarCotizacion() {
        try {
            ModeloCotizacion cotizacion = new ModeloCotizacion(manager.getCotizacionDAO().getNumero(), new Date(), cliente, empleado,
                    new BigDecimal(lblTotal.getText()),
                    NumerosLetras.convertNumberToLetter(Double.parseDouble(lblTotal.getText())));
            manager.getCotizacionDAO().insertarInformal(cotizacion);
            guardarDetalleCotizacion(cotizacion);
            manager.getReportes().tktCotizacion(cotizacion);
        } catch (Exception ex) {
            Logger.getLogger(PanelVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void guardarDetalleCotizacion(ModeloCotizacion cotizacion) {
        Collections.list(dlmDetalle.elements()).forEach(d -> {
            ModeloDetalleCotizacion detalleCotizacion;
            if(d.isPromo()){
                detalleCotizacion =new ModeloDetalleCotizacion(d.getCantidad(), cotizacion, d.getPrecio(), null, d.getPromocion(), d.getTipo(), d.isPromo());
            }else{
                detalleCotizacion =new ModeloDetalleCotizacion(d.getCantidad(), cotizacion, d.getPrecio(), d.getProducto(), null, d.getTipo(), d.isPromo());
            }
            try {
                manager.getDetalleCotizacionDAO().insertar(detalleCotizacion);
            } catch (Exception ex) {
                LOG.log(Level.SEVERE, null, ex);
                Mensajes.mensajeError("Error: " + ex.getMessage());
            }
        });

    }

    public void reiniciarVenta() {
        List<ModeloResolucion> resoluciones = new ArrayList<>();
        try {
            resolucion = manager.getResolucionDAO().getResolucionByCaja(caja);
            if (resolucion != null) {
                iniciarVenta();
            } else {
                resoluciones.clear();
                Condition activa = Tables.RESOLUCION.ACTIVA.eq(false);
                Condition ca = Tables.RESOLUCION.TKTACTUAL.eq(0).and(Tables.RESOLUCION.IDCAJA.eq(caja.getIdcaja()));
                resoluciones = manager.getResolucionDAO().obtenerLista(activa.and(ca));
                if (resoluciones.isEmpty()) {
                    Mensajes.mensajeAlert("No existen resoluciones activas para esta caja, consultar con Administrador!");
                } else {
                    activarResolucion(resoluciones.get(0));
                    resolucion = resoluciones.get(0);
                    iniciarVenta();
                }
            }

        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        }
    }

    public void cerrarPanel() {
        new AgregarPanel().insertarPanelMain(pBody, new PanelInicio(manager));
    }

    private void iniciarVenta() {
        try {
            dlmDetalle.clear();
            venta = new ModeloVenta();
            venta.setNumerofactura(manager.getVentaDAO().getTicket(resolucion));
            venta.setEmpleado(empleado);
            venta.setResolucion(resolucion);
            venta.setTipodoc("TKT");
        } catch (Exception ex) {
            Logger.getLogger(PanelVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void activarResolucion(ModeloResolucion resolucion) {
        resolucion.setActiva(true);
        try {
            manager.getResolucionDAO().modificar(resolucion);
            Mensajes.mensajeInfo("Nueva resolución activada: " + resolucion.getResolucion() + " Informe a su administrador!");
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        }
    }

    private static final Logger LOG = Logger.getLogger(PanelVenta.class.getName());
}
