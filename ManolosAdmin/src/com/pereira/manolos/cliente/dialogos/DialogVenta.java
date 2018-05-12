package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.cliente.listrenderer.DetalleVentaRenderer;
import com.pereira.manolos.cliente.listrenderer.ProductoRenderer;
import com.pereira.manolos.cliente.listrenderer.PromocionRenderer;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloBitacoraCaja;
import com.pereira.manolos.negocio.modelos.ModeloCaja;
import com.pereira.manolos.negocio.modelos.ModeloCategoriaProducto;
import com.pereira.manolos.negocio.modelos.ModeloCliente;
import com.pereira.manolos.negocio.modelos.ModeloCotizacion;
import com.pereira.manolos.negocio.modelos.ModeloDetalleCotizacion;
import com.pereira.manolos.negocio.modelos.ModeloDetalleVenta;
import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.negocio.modelos.ModeloInsumo;
import com.pereira.manolos.negocio.modelos.ModeloProducto;
import com.pereira.manolos.negocio.modelos.ModeloPromocion;
import com.pereira.manolos.negocio.modelos.ModeloReceta;
import com.pereira.manolos.negocio.modelos.ModeloResolucion;
import com.pereira.manolos.negocio.modelos.ModeloVenta;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.NumerosLetras;
import com.pereira.manolos.util.TabbedPanelUI;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.datos.database.Tables.CATEGORIA_PRODUCTO;
import static com.pereira.manolos.datos.database.Tables.DETALLE_PROMOCION;
import static com.pereira.manolos.datos.database.Tables.DETALLE_RECETA;
import static com.pereira.manolos.datos.database.Tables.PRODUCTO;
import static com.pereira.manolos.datos.database.Tables.PROMOCION;

/* @author Jose Luis */
@SuppressWarnings ( "serial" )
public class DialogVenta extends javax.swing.JDialog {

    private DefaultListModel<ModeloCategoriaProducto> dlmCategorias = new DefaultListModel<> ();
    private final DefaultListModel<ModeloProducto> dlmProductos = new DefaultListModel<> ();
    private final DefaultListModel<ModeloDetalleVenta> dlmDetalle = new DefaultListModel<> ();
    private final DefaultListModel<ModeloPromocion> dlmPromociones = new DefaultListModel<> ();
    private final DAOManager manager;
    private ModeloVenta venta;
    private final ModeloCaja caja;
    private final ModeloEmpleado empleado;
    private ModeloResolucion resolucion;
    private ModeloCliente cliente;
    //private final AgregarPanel agregar = new AgregarPanel ();

    public DialogVenta ( java.awt.Frame parent , boolean modal , DAOManager manager , ModeloEmpleado empleado , ModeloCaja caja ) {
        this.manager = manager;
        this.empleado = empleado;
        initComponents ();
        cargarCategorias ();
        cargarPromociones ();
        //lCategorias.setCellRenderer ( new CategoriaProductoRenderer () );
        lProductos.setCellRenderer ( new ProductoRenderer () );
        lDetalle.setCellRenderer ( new DetalleVentaRenderer () );
        lPromociones.setCellRenderer ( new PromocionRenderer () );
        this.caja = caja;
        reiniciarVenta ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblTitulo = new javax.swing.JPanel();
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
        btnCobrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 314));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblTitulo.setBackground(colorBG);
        lblTitulo.setLayout(new java.awt.GridBagLayout());

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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Total");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        pDetalle.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
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

        lblTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
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
        lblTitulo.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(lblTitulo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lCategoriasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lCategoriasValueChanged
        if ( !lCategorias.isSelectionEmpty () ) {
            cargarProductos ();
        }
    }//GEN-LAST:event_lCategoriasValueChanged

    private void txtFiltroCategoriaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFiltroCategoriaCaretUpdate
        cargarCategorias ();
    }//GEN-LAST:event_txtFiltroCategoriaCaretUpdate

    private void txtFiltroCategoriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroCategoriaFocusGained

    }//GEN-LAST:event_txtFiltroCategoriaFocusGained

    private void txtFiltroCategoriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroCategoriaFocusLost
        //pop.setVisible ( false );
    }//GEN-LAST:event_txtFiltroCategoriaFocusLost

    private void txtFiltroCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltroCategoriaMouseClicked

    }//GEN-LAST:event_txtFiltroCategoriaMouseClicked

    private void lProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lProductosMouseClicked
        lProductos.setSelectedIndex ( lProductos.locationToIndex ( evt.getPoint () ) );
        agregarProducto ();
        lDetalle.repaint ();
    }//GEN-LAST:event_lProductosMouseClicked

    private void lProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lProductosMousePressed
        if ( evt.getButton () == MouseEvent.BUTTON1 ) {
            lProductos.setSelectedIndex ( lProductos.locationToIndex ( evt.getPoint () ) );
        }
    }//GEN-LAST:event_lProductosMousePressed

    private void lProductosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lProductosValueChanged
        //System.out.println ( "producto=" + lProductos.getSelectedValue ().getNombre () );
    }//GEN-LAST:event_lProductosValueChanged

    private void txtFiltroProductoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFiltroProductoCaretUpdate
        if ( !lCategorias.isSelectionEmpty () ) {
            cargarProductos ();
        }
    }//GEN-LAST:event_txtFiltroProductoCaretUpdate

    private void txtFiltroProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroProductoFocusGained

    }//GEN-LAST:event_txtFiltroProductoFocusGained

    private void txtFiltroProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroProductoFocusLost

    }//GEN-LAST:event_txtFiltroProductoFocusLost

    private void txtFiltroProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltroProductoMouseClicked

    }//GEN-LAST:event_txtFiltroProductoMouseClicked

    private void txtFiltroPromoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFiltroPromoCaretUpdate
        cargarPromociones ();
    }//GEN-LAST:event_txtFiltroPromoCaretUpdate

    private void txtFiltroPromoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroPromoFocusGained

    }//GEN-LAST:event_txtFiltroPromoFocusGained

    private void txtFiltroPromoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroPromoFocusLost

    }//GEN-LAST:event_txtFiltroPromoFocusLost

    private void txtFiltroPromoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltroPromoMouseClicked

    }//GEN-LAST:event_txtFiltroPromoMouseClicked

    private void lPromocionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lPromocionesMouseClicked
        lPromociones.setSelectedIndex ( lPromociones.locationToIndex ( evt.getPoint () ) );
        agregarPromocion ();
        lDetalle.repaint ();
    }//GEN-LAST:event_lPromocionesMouseClicked

    private void lPromocionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lPromocionesMousePressed
        if ( evt.getButton () == MouseEvent.BUTTON1 ) {
            lPromociones.setSelectedIndex ( lPromociones.locationToIndex ( evt.getPoint () ) );
        }
    }//GEN-LAST:event_lPromocionesMousePressed

    private void lPromocionesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lPromocionesMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lPromocionesMouseReleased

    private void lPromocionesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lPromocionesValueChanged

    }//GEN-LAST:event_lPromocionesValueChanged

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        cerrarPanel ();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if ( !lDetalle.isSelectionEmpty () ) {
            dlmDetalle.remove ( lDetalle.getSelectedIndex () );
            lDetalle.repaint ();
            totalizar ();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        if ( !lDetalle.isSelectionEmpty () ) {
            ModeloDetalleVenta detalle = lDetalle.getSelectedValue ();
            int cantidad = detalle.getCantidad () + 1;
            detalle.setCantidad ( cantidad );
            double precio = detalle.getPrecio ().doubleValue ();
            double subtotal = precio * cantidad;
            //detalle.setSubtotal ( new BigDecimal ( subtotal ) );
            lDetalle.repaint ();
            totalizar ();
        }
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        if ( !lDetalle.isSelectionEmpty () ) {
            ModeloDetalleVenta detalle = lDetalle.getSelectedValue ();
            int cantidad = detalle.getCantidad () - 1;
            if ( cantidad <= 0 ) {
                //elimine de detalle
                dlmDetalle.remove ( lDetalle.getSelectedIndex () );
            } else {
                detalle.setCantidad ( cantidad );
                double precio = detalle.getPrecio ().doubleValue ();
                double subtotal = precio * ( double ) cantidad;
                //detalle.setSubtotal ( new BigDecimal ( subtotal ) );
            }
            lDetalle.repaint ();
            totalizar ();
        }
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        if ( !dlmDetalle.isEmpty () ) {
            venta.setFecha ( new Date () );
            venta.setGravado ( new BigDecimal ( lblTotal.getText () ) );
            venta.setTotal ( new BigDecimal ( lblTotal.getText () ) );
            venta.setEnletras ( NumerosLetras.convertNumberToLetter ( Double.parseDouble ( lblTotal.getText () ) ) );
            venta.setTipoventa ( "RESTAURANTE" );
            venta.setExento ( BigDecimal.ZERO );
            venta.setNosujeto ( BigDecimal.ZERO );
            try {
                manager.getVentaDAO ().insertarSinCliente ( venta );
                /*AGREGANDO EL DETALLE DE LA VENTA*/
                Collections.list ( dlmDetalle.elements () ).forEach ( d -> {
                    try {
                        d.setVenta ( venta );
                        manager.getDetalleVentaDAO ().insertar ( d );
                        descontarInventario ( d );
                    } catch ( Exception ex ) {
                        LOG.log ( Level.SEVERE , null , ex );
                    }
                } );
                /*INGRESO A LA BITACORA DE LA CAJA*/
                ModeloBitacoraCaja vVenta = new ModeloBitacoraCaja ( null , venta.getEmpleado ().getNombre () ,
                                                                     new Date () ,
                                                                     "VENTA" , new BigDecimal ( lblTotal.getText () ) , "VENTA NT "
                                                                                                                        + venta.getNumerofactura () );
                manager.getBitacoraDAO ().insertar ( vVenta );

                int x = Mensajes.mensajeSiNo ( "Venta Realizada Satisfactoriamente\n Desea Realizar Otra Venta?" );
                if ( x == 1 ) {
                    dispose ();
                } else {
                    reiniciarVenta ();
                }

            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
            }
        } else {
            Mensajes.mensajeAlert ( "Agregue productos para poder facturar!" );
        }
    }//GEN-LAST:event_btnCobrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
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
    private javax.swing.JList<com.pereira.manolos.negocio.modelos.ModeloDetalleVenta> lDetalle;
    private javax.swing.JList<ModeloProducto> lProductos;
    private javax.swing.JList<ModeloPromocion> lPromociones;
    private javax.swing.JPanel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pCategorias;
    private javax.swing.JPanel pDetalle;
    private javax.swing.JPanel pProductos;
    private javax.swing.JPanel pProductos1;
    private javax.swing.JPanel pVenta;
    private javax.swing.JTabbedPane tp;
    private javax.swing.JTextField txtFiltroCategoria;
    private javax.swing.JTextField txtFiltroProducto;
    private javax.swing.JTextField txtFiltroPromo;
    // End of variables declaration//GEN-END:variables

    private void cargarCategorias () {
        dlmCategorias.clear ();
        dlmProductos.clear ();
        Condition c = CATEGORIA_PRODUCTO.NOMBRE.likeIgnoreCase ( "%" + txtFiltroCategoria.getText () + "%" );
        try {
            manager.getCategoriaProductoDAO ().obtenerLista ( c ).forEach ( categoria -> {
                dlmCategorias.addElement ( categoria );
            } );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
        if ( lCategorias.getModel ().getSize () > 0 ) {
            lCategorias.setSelectedIndex ( 0 );
        }
    }

    private void cargarProductos () {
        dlmProductos.clear ();
        if ( !lCategorias.isSelectionEmpty () ) {
            Condition c = PRODUCTO.IDCATEGORIA.eq ( lCategorias.getSelectedValue ().getIdcategoria () );
            Condition d = PRODUCTO.NOMBRE.likeIgnoreCase ( "%" + txtFiltroProducto.getText () + "%" );
            Condition e = PRODUCTO.BAJA.eq ( false );
            try {
                manager.getProductoDAO ().obtenerLista ( c.and ( d ).and ( e ) ).forEach ( producto -> {
                    dlmProductos.addElement ( producto );
                } );
            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
                Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            }
        }
    }

    private void cargarPromociones () {
        dlmPromociones.clear ();
        Condition c = PROMOCION.NOMBRE.likeIgnoreCase ( "%" + txtFiltroPromo.getText () + "%" );
        try {
            manager.getPromocionDAO ().obtenerLista ( c ).forEach ( promo -> {
                dlmPromociones.addElement ( promo );
            } );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }

    private void agregarProducto () {
        boolean onDetalle = false;
        ModeloDetalleVenta producto = new ModeloDetalleVenta ();
        if ( dlmDetalle.isEmpty () ) {
            producto.setProducto ( lProductos.getSelectedValue () );
            producto.setCantidad ( 1 );
            producto.setPrecio ( lProductos.getSelectedValue ().getPrecio () );
            producto.setTipo ( lProductos.getSelectedValue ().getTipoventa () );
            producto.setPromo ( false );
            dlmDetalle.addElement ( producto );
        } else {
            for ( int i = 0 ; i < dlmDetalle.getSize () ; i++ ) {
                if ( !dlmDetalle.get ( i ).isPromo () ) {
                    if ( dlmDetalle.get ( i ).getProducto ().getIdproducto () == lProductos.getSelectedValue ().getIdproducto () ) {
                        onDetalle = true;
                        dlmDetalle.get ( i ).setCantidad ( dlmDetalle.get ( i ).getCantidad () + 1 );
                        break;
                    }
                }
            }
            if ( !onDetalle ) {
                producto.setProducto ( lProductos.getSelectedValue () );
                producto.setCantidad ( 1 );
                producto.setPrecio ( lProductos.getSelectedValue ().getPrecio () );
                producto.setTipo ( lProductos.getSelectedValue ().getTipoventa () );
                producto.setPromo ( false );
                dlmDetalle.addElement ( producto );
            }
        }
        if ( lDetalle.getModel ().getSize () > 0 ) {
            lDetalle.setSelectedIndex ( 0 );
        }
        totalizar ();
    }

    private void agregarPromocion () {
        boolean onDetalle = false;
        ModeloDetalleVenta producto = new ModeloDetalleVenta ();
        if ( dlmDetalle.isEmpty () ) {
            producto.setPromocion ( lPromociones.getSelectedValue () );
            producto.setCantidad ( 1 );
            producto.setPrecio ( lPromociones.getSelectedValue ().getPrecio () );
            producto.setTipo ( lPromociones.getSelectedValue ().getTipo () );
            producto.setPromo ( true );
            dlmDetalle.addElement ( producto );
        } else {
            for ( int i = 0 ; i < dlmDetalle.getSize () ; i++ ) {
                if ( dlmDetalle.get ( i ).isPromo () ) {
                    if ( dlmDetalle.get ( i ).getPromocion ().getIdpromocion () == lPromociones.getSelectedValue ().getIdpromocion () ) {
                        onDetalle = true;
                        dlmDetalle.get ( i ).setCantidad ( dlmDetalle.get ( i ).getCantidad () + 1 );
                        break;
                    }
                }
            }
            if ( !onDetalle ) {
                producto.setPromocion ( lPromociones.getSelectedValue () );
                producto.setCantidad ( 1 );
                producto.setPrecio ( lPromociones.getSelectedValue ().getPrecio () );
                producto.setTipo ( lPromociones.getSelectedValue ().getTipo () );
                producto.setPromo ( true );
                dlmDetalle.addElement ( producto );
            }
        }
        if ( lDetalle.getModel ().getSize () > 0 ) {
            lDetalle.setSelectedIndex ( 0 );
        }
        totalizar ();
    }

    private void totalizar () {
        double sumatoria = 0;
        if ( dlmDetalle.isEmpty () ) {
            lblTotal.setText ( "0.00" );
        } else {
            for ( int i = 0 ; i < dlmDetalle.size () ; i++ ) {
                ModeloDetalleVenta modelo = dlmDetalle.getElementAt ( i );
                int cantidad = modelo.getCantidad ();
                double precio = modelo.getPrecio ().doubleValue ();
                sumatoria += ( cantidad * precio );
            }
            lblTotal.setText ( String.format ( "%.2f" , sumatoria ) );
        }
    }

    private void agregarCotizacion () {
        try {
            ModeloCotizacion cotizacion = new ModeloCotizacion ( manager.getCotizacionDAO ().getNumero () , new Date () , cliente , empleado ,
                                                                 new BigDecimal ( lblTotal.getText () ) ,
                                                                 NumerosLetras.convertNumberToLetter ( Double.parseDouble ( lblTotal.getText () ) ) );
            manager.getCotizacionDAO ().insertarInformal ( cotizacion );
            guardarDetalleCotizacion ( cotizacion );
            //manager.getReportes ().tktCotizacion ( cotizacion );
        } catch ( Exception ex ) {
            Logger.getLogger ( DialogVenta.class.getName () ).log ( Level.SEVERE , null , ex );
        }
    }

    private void guardarDetalleCotizacion ( ModeloCotizacion cotizacion ) {
        Collections.list ( dlmDetalle.elements () ).forEach ( d -> {
            ModeloDetalleCotizacion detalleCotizacion = new ModeloDetalleCotizacion ( cotizacion , d.getProducto () , d.getCantidad () ,
                                                                                      d.getPrecio () , d.getTipo () );
            try {
                manager.getDetalleCotizacionDAO ().insertar ( detalleCotizacion );
            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
                Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            }
        } );

    }

    public void reiniciarVenta () {
        iniciarVenta ();
    }

    public void cerrarPanel () {
        dispose ();
    }

    private void iniciarVenta () {
        try {
            dlmDetalle.clear ();
            venta = new ModeloVenta ();
            venta.setNumerofactura ( "NT" );
            venta.setEmpleado ( empleado );
            venta.setTipodoc ( "TKT" );
        } catch ( Exception ex ) {
            Logger.getLogger ( DialogVenta.class.getName () ).log ( Level.SEVERE , null , ex );
        }
    }

    private void activarResolucion ( ModeloResolucion resolucion ) {
        resolucion.setActiva ( true );
        try {
            manager.getResolucionDAO ().modificar ( resolucion );
            Mensajes.mensajeInfo ( "Nueva resolución activada: " + resolucion.getResolucion () + " Informe a su administrador!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }

    private void descontarInventario ( ModeloDetalleVenta detalle ) throws Exception {
        if ( detalle.isPromo () ) {
            descontarPromocion ( detalle.getPromocion () , detalle.getCantidad () );
        } else {
            switch ( detalle.getProducto ().getTipo () ) {
                case "U":
                    //descontar directamente de insumos
                    descontarInsumo ( detalle.getProducto ().getInsumo () , detalle.getCantidad () , detalle.getProducto ().getDescuento () );
                    break;
                case "C":
                    //descontar de la receta
                    descontarReceta ( detalle.getProducto ().getReceta () , detalle.getCantidad () , detalle.getProducto ().getDescuento () );
                    break;
                case "P":
                    descontarPorciones ( detalle.getProducto () , detalle.getCantidad () );
                    break;
            }
        }
    }

    private void descontarInsumo ( ModeloInsumo insumo , int cantidad , double descuento ) throws Exception {
        double stock = insumo.getStock () - ( cantidad * descuento );
        insumo.setStock ( stock );
        manager.getInsumoDAO ().modificar ( insumo );
    }

    private void descontarReceta ( ModeloReceta receta , int cantidad , double descuento ) throws Exception {
        Condition c = DETALLE_RECETA.IDRECETA.eq ( receta.getIdreceta () );
        manager.getDetalleRecetaDAO ().obtenerLista ( c ).forEach ( dReceta -> {
            if ( dReceta.getTipo ().equals ( "INSUMO" ) ) {
                try {
                    descontarInsumo ( dReceta.getIngredienteInsumo () , cantidad , dReceta.getDescargo () * descuento );
                } catch ( Exception ex ) {
                    LOG.log ( Level.SEVERE , null , ex );
                }
            } else {
                double stock = dReceta.getIngredienteReceta ().getStock ();
                stock -= ( cantidad * descuento );
                dReceta.getIngredienteReceta ().setStock ( stock );
                try {
                    manager.getRecetaDAO ().modificar ( dReceta.getIngredienteReceta () );
                } catch ( Exception ex ) {
                    LOG.log ( Level.SEVERE , null , ex );
                }
            }
        } );

    }

    private void descontarPorciones ( ModeloProducto producto , int cantidad ) throws Exception {
        double tengo = producto.getStock ();
        System.out.println ( "tengo1: " + tengo );
        tengo -= ( double ) cantidad;
        System.out.println ( "tengo: " + tengo );
        producto.setStock ( tengo );
        manager.getProductoDAO ().modificar ( producto );
    }

    private void descontarPromocion ( ModeloPromocion promo , int cantidad ) throws Exception {
        Condition c = DETALLE_PROMOCION.IDPROMOCION.eq ( promo.getIdpromocion () );
        manager.getDetallePromocionDAO ().obtenerLista ( c ).forEach ( detalle -> {
            switch ( detalle.getProducto ().getTipo () ) {
                case "U": {
                    try {
                        descontarInsumo ( detalle.getProducto ().getInsumo () , detalle.getCantidad () * cantidad , detalle.getProducto ().
                                          getDescuento () );
                    } catch ( Exception ex ) {
                        Logger.getLogger ( DialogCobro.class.getName () ).log ( Level.SEVERE , null , ex );
                    }
                }
                break;
                case "C": {
                    try {
                        descontarReceta ( detalle.getProducto ().getReceta () , detalle.getCantidad () * cantidad , detalle.getProducto ().
                                          getDescuento () );
                    } catch ( Exception ex ) {
                        Logger.getLogger ( DialogCobro.class.getName () ).log ( Level.SEVERE , null , ex );
                    }
                }
                break;
                case "P": {
                    try {
                        descontarPorciones ( detalle.getProducto () , detalle.getCantidad () );
                    } catch ( Exception ex ) {
                        Logger.getLogger ( DialogCobro.class.getName () ).log ( Level.SEVERE , null , ex );
                    }
                }
                break;
            }
        } );
    }

    private static final Logger LOG = Logger.getLogger ( DialogVenta.class.getName () );
}
