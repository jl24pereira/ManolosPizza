package com.pereira.manolos.cliente.panels;

import com.mrlonee.swing.animation.AnimatedPanel;
import com.pereira.manolos.cliente.dialogos.DialogCategoriaProducto;
import com.pereira.manolos.cliente.dialogos.DialogProducto;
import com.pereira.manolos.cliente.dialogos.DialogSeleccionCategoria;
import com.pereira.manolos.cliente.listrenderer.ListaProductoRenderer;
import com.pereira.manolos.datos.database.Tables;
import com.pereira.manolos.datos.database.tables.Producto;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCategoriaProducto;
import com.pereira.manolos.negocio.modelos.ModeloProducto;
import com.pereira.manolos.util.CellRenderer;
import com.pereira.manolos.util.HeaderCellRenderer;
import com.pereira.manolos.util.ImageConverter;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.TabbedPanelUI;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI900;

/*@author Jose Luis */
@SuppressWarnings("serial")
public class PanelProductos extends AnimatedPanel {

    private final DAOManager manager;
    private final DefaultListModel<ModeloProducto> dlmProductos = new DefaultListModel<>();
    private DefaultTableModel dtmCategorias;
    private int numero = 0;

    public PanelProductos(DAOManager manager) {
        this.manager = manager;
        this.setAnimationType(AnimatedPanel.AnimationType.SlideAnimationFromTop);
        initComponents();
        dtmCategorias = (DefaultTableModel) tCategorias.getModel();
        lProductos.setCellRenderer(new ListaProductoRenderer());
        dibujarTabla();
        cargarCategorias();
        cargarProductos();
    }

    private void agregarCategoria() {
        DialogCategoriaProducto dialogCategoriaProducto = new DialogCategoriaProducto(new JFrame(), true, "NUEVA CATEGORIA", manager);
        dialogCategoriaProducto.setVisible(true);
        cargarCategorias();
    }

    private void agregarProducto() {
        DialogProducto dialogProducto = new DialogProducto(new JFrame(), true, "NUEVO PRODUCTO", manager);
        dialogProducto.setVisible(true);
        cargarProductos();
    }

    private void cargarCategorias() {
        for (int i = 0; i < tCategorias.getRowCount(); i++) {
            dtmCategorias.removeRow(i);
            i -= 1;
        }
        Condition c = Tables.CATEGORIA_PRODUCTO.IDCATEGORIA.greaterOrEqual(1);
        try {
            manager.getCategoriaProductoDAO().obtenerLista(c).forEach(categoria -> {
                numero++;
                Object[] row = {categoria, numero, categoria.getNombre()};
                dtmCategorias.addRow(row);
            });
            if (tCategorias.getRowCount() > 0) {
                tCategorias.changeSelection(0, 1, false, false);
                ModeloCategoriaProducto cat = (ModeloCategoriaProducto) tCategorias.getValueAt(0, 0);
                ImageIcon image = new ImageIcon(ImageConverter.byteToImage(cat.getImagen()));
                Image scaledImage = image.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
                lblFoto.setIcon(new ImageIcon(scaledImage));
            }
        } catch (Exception ex) {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarProductos() {
        dlmProductos.clear();
        Condition baja = Tables.PRODUCTO.BAJA.equal(chkBajas.isSelected());
        Condition filtro = Producto.PRODUCTO.NOMBRE.likeIgnoreCase("%" + txtFiltro.getText() + "%");
        try {
            manager.getProductoDAO().obtenerLista(filtro.and(baja)).forEach(p -> {
                dlmProductos.addElement(p);
            });
        } catch (Exception ex) {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        }
        if (!dlmProductos.isEmpty()) {
            lProductos.setSelectedIndex(0);
        }
    }

    private void editarCategoria() {
        DialogCategoriaProducto dialog = new DialogCategoriaProducto(new JFrame(), true, "EDITAR CATEGORIA", manager,
                (ModeloCategoriaProducto) tCategorias.getValueAt(tCategorias.
                        getSelectedRow(), 0));
        dialog.setVisible(true);
        cargarCategorias();
    }

    private void editarProducto() {
        DialogProducto dialog = new DialogProducto(new JFrame(), true, "EDITAR PRODUCTO", manager, lProductos.getSelectedValue());
        dialog.setVisible(true);
        cargarProductos();
    }

    private void dibujarTabla() {
        tCategorias.setGridColor(colorUI);

        JTableHeader jtableHeader = tCategorias.getTableHeader();
        jtableHeader.setDefaultRenderer(new HeaderCellRenderer(colorUI900));
        tCategorias.setTableHeader(jtableHeader);

        tCategorias.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("text center", colorUI));
        tCategorias.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer("text", colorUI));
        tCategorias.repaint();
    }

    private void eliminarCategoria() {
        try {
            ModeloCategoriaProducto categoria = (ModeloCategoriaProducto) tCategorias.getValueAt(tCategorias.getSelectedRow(), 0);
            if (manager.getProductoDAO().obtenerLista(Tables.PRODUCTO.IDCATEGORIA.eq(categoria.getIdcategoria())).isEmpty()) {
                manager.getCategoriaProductoDAO().eliminar(categoria);
            } else {
                int i = Mensajes.mensajeSiNo("La categoria tiene productos, no se puede eliminar \n Desea enviar productos a nueva Categoria y eliminar actual?");
                if (i == 0) {
                    DialogSeleccionCategoria dlg = new DialogSeleccionCategoria(new JFrame(), true, "NUEVA CATEGORIA", manager,categoria);
                    dlg.setVisible(true);
                    if(dlg.isGuardado()){
                        cargarCategorias();
                        cargarProductos();
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        popInventario = new javax.swing.JPopupMenu();
        itemEditar = new javax.swing.JMenuItem();
        itemBaja = new javax.swing.JMenuItem();
        pMain = new javax.swing.JPanel();
        pTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pComandos = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        pCentro = new javax.swing.JPanel();
        pBusqueda = new javax.swing.JPanel();
        chkBajas = new javax.swing.JCheckBox();
        txtFiltro = new javax.swing.JTextField();
        tpProductos = new JTabbedPane(){
            public Color getForegroundAt(int index){
                if(getSelectedIndex() == index) return colorBG;
                return colorUI;
            }
        };
        pGestion = new javax.swing.JPanel();
        pTabla = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lProductos = new javax.swing.JList<>();
        lblFotoProducto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCategorias = new javax.swing.JTable();
        lblFoto = new javax.swing.JLabel();

        itemEditar.setText("Editar Material");
        itemEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarActionPerformed(evt);
            }
        });
        popInventario.add(itemEditar);

        itemBaja.setText("Baja Material");
        itemBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBajaActionPerformed(evt);
            }
        });
        popInventario.add(itemBaja);

        setBorder(javax.swing.BorderFactory.createLineBorder(colorUI, 5));
        setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(new java.awt.Color(102, 102, 102));
        pMain.setOpaque(false);
        pMain.setLayout(new java.awt.GridBagLayout());

        pTitulo.setBackground(colorUI);
        pTitulo.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(colorBG);
        jLabel1.setText("Productos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 0);
        pTitulo.add(jLabel1, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e8cb(0)_64.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        pTitulo.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        pMain.add(pTitulo, gridBagConstraints);

        pComandos.setBackground(colorUI);
        pComandos.setMinimumSize(new java.awt.Dimension(120, 100));
        pComandos.setPreferredSize(new java.awt.Dimension(120, 100));
        pComandos.setLayout(new java.awt.GridBagLayout());

        btnNuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_nuevo_normal.png"))); // NOI18N
        btnNuevo.setBorder(null);
        btnNuevo.setBorderPainted(false);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_nuevo_pressed.png"))); // NOI18N
        btnNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_nuevo_over.png"))); // NOI18N
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 0);
        pComandos.add(btnNuevo, gridBagConstraints);

        btnEditar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_editar_normal.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_editar_pressed.png"))); // NOI18N
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_editar_over.png"))); // NOI18N
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pComandos.add(btnEditar, gridBagConstraints);

        btnBaja.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_baja_normal.png"))); // NOI18N
        btnBaja.setBorder(null);
        btnBaja.setBorderPainted(false);
        btnBaja.setContentAreaFilled(false);
        btnBaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBaja.setFocusable(false);
        btnBaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBaja.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_baja_pressed.png"))); // NOI18N
        btnBaja.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_baja_over.png"))); // NOI18N
        btnBaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pComandos.add(btnBaja, gridBagConstraints);

        btnReportes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_reporte_normal.png"))); // NOI18N
        btnReportes.setBorder(null);
        btnReportes.setBorderPainted(false);
        btnReportes.setContentAreaFilled(false);
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setFocusable(false);
        btnReportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReportes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_reporte_pressed.png"))); // NOI18N
        btnReportes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_reporte_over.png"))); // NOI18N
        btnReportes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        pComandos.add(btnReportes, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.1;
        pMain.add(pComandos, gridBagConstraints);

        pCentro.setOpaque(false);
        pCentro.setLayout(new java.awt.GridBagLayout());

        pBusqueda.setOpaque(false);
        pBusqueda.setLayout(new java.awt.GridBagLayout());

        chkBajas.setBackground(new java.awt.Color(255, 255, 255));
        chkBajas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkBajas.setText("Ver Bajas");
        chkBajas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkBajas.setFocusable(false);
        chkBajas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
        chkBajas.setMaximumSize(new java.awt.Dimension(110, 25));
        chkBajas.setMinimumSize(new java.awt.Dimension(110, 25));
        chkBajas.setPreferredSize(new java.awt.Dimension(110, 25));
        chkBajas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
        chkBajas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBajasItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pBusqueda.add(chkBajas, gridBagConstraints);

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
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        pBusqueda.add(txtFiltro, gridBagConstraints);
        /*txtFiltro.setUI(new TextFieldUI(
            " Buscar...", colorUIpressed5, colorUIpressed5, colorBG
        ));*/

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        pCentro.add(pBusqueda, gridBagConstraints);

        tpProductos.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tpProductos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tpProductos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tpProductosStateChanged(evt);
            }
        });

        pGestion.setBackground(colorBG);
        pGestion.setForeground(new java.awt.Color(153, 153, 0));
        pGestion.setLayout(new java.awt.GridBagLayout());

        pTabla.setMinimumSize(new java.awt.Dimension(300, 100));
        pTabla.setOpaque(false);
        pTabla.setPreferredSize(new java.awt.Dimension(450, 100));
        pTabla.setLayout(new java.awt.GridBagLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jScrollPane3.setBorder(new javax.swing.border.LineBorder(colorUI, 2, true));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setMinimumSize(new java.awt.Dimension(350, 130));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(350, 130));

        lProductos.setBackground(colorBG);
        lProductos.setModel(dlmProductos);
        lProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lProductos.setSelectionBackground(colorUI);
        lProductos.setSelectionForeground(colorBG);
        lProductos.addMouseListener(new java.awt.event.MouseAdapter() {
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
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel2.add(jScrollPane3, gridBagConstraints);

        lblFotoProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoProducto.setBorder(new javax.swing.border.LineBorder(colorUI, 3, true));
        lblFotoProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblFotoProducto.setMaximumSize(new java.awt.Dimension(250, 250));
        lblFotoProducto.setMinimumSize(new java.awt.Dimension(250, 250));
        lblFotoProducto.setPreferredSize(new java.awt.Dimension(250, 250));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 10);
        jPanel2.add(lblFotoProducto, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pTabla.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pGestion.add(pTabla, gridBagConstraints);

        tpProductos.addTab("Productos", pGestion);

        jPanel3.setBackground(colorBG);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setMinimumSize(new java.awt.Dimension(250, 406));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(250, 406));

        tCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "No.", "Categoria de Producto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tCategorias.setRowHeight(30);
        tCategorias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tCategorias.getTableHeader().setReorderingAllowed(false);
        tCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tCategoriasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tCategorias);
        if (tCategorias.getColumnModel().getColumnCount() > 0) {
            tCategorias.getColumnModel().getColumn(0).setMinWidth(0);
            tCategorias.getColumnModel().getColumn(0).setPreferredWidth(0);
            tCategorias.getColumnModel().getColumn(0).setMaxWidth(0);
            tCategorias.getColumnModel().getColumn(1).setMinWidth(75);
            tCategorias.getColumnModel().getColumn(1).setPreferredWidth(75);
            tCategorias.getColumnModel().getColumn(1).setMaxWidth(75);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel4.add(jScrollPane1, gridBagConstraints);

        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setBorder(new javax.swing.border.LineBorder(colorUI, 3, true));
        lblFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblFoto.setMaximumSize(new java.awt.Dimension(250, 250));
        lblFoto.setMinimumSize(new java.awt.Dimension(250, 250));
        lblFoto.setPreferredSize(new java.awt.Dimension(250, 250));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 10);
        jPanel4.add(lblFoto, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel3.add(jPanel4, gridBagConstraints);

        tpProductos.addTab("Categorias", jPanel3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pCentro.add(tpProductos, gridBagConstraints);
        tpProductos.setUI(new TabbedPanelUI(colorUI,colorBG));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pMain.add(pCentro, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(pMain, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tpProductos.getSelectedIndex() == 0) {
            editarProducto();
        } else {
            editarCategoria();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void itemEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarActionPerformed

    }//GEN-LAST:event_itemEditarActionPerformed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        cargarProductos();
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (tpProductos.getSelectedIndex() == 0) {
            agregarProducto();
        } else {
            agregarCategoria();
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        if (tpProductos.getSelectedIndex() == 0) {
            if (dlmProductos.isEmpty()) {
                Mensajes.mensajeAlert("No hay elementos seleccionados en la lista");
            } else if (chkBajas.isSelected()) {
                altaMaterial();
            } else {
                bajaMaterial();
            }
        } else {
            eliminarCategoria();
        }
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        try {
            manager.getReportes().reporteProductos();
        } catch (Exception ex) {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReportesActionPerformed

    private void itemBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBajaActionPerformed
        // TODO add your handling code here:
        if (chkBajas.isSelected()) {
            altaMaterial();
        } else {
            bajaMaterial();
        }
    }//GEN-LAST:event_itemBajaActionPerformed

    private void chkBajasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBajasItemStateChanged
        if (chkBajas.isSelected()) {
            btnBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_alta_normal.png")));
            btnBaja.setRolloverIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/com/pereira/manolos/cliente/images/button_alta_over.png")));
            btnBaja.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource(
                    "/com/pereira/manolos/cliente/images/button_alta_pressed.png")));
            itemBaja.setText("Dar Alta");
        } else {
            btnBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_baja_normal.png")));
            btnBaja.setRolloverIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/com/pereira/manolos/cliente/images/button_baja_over.png")));
            btnBaja.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource(
                    "/com/pereira/manolos/cliente/images/button_baja_pressed.png")));
            itemBaja.setText("Dar Baja");
        }
        cargarProductos();
    }//GEN-LAST:event_chkBajasItemStateChanged

    private void tCategoriasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCategoriasMousePressed
        Point point = evt.getPoint();
        int currentRow = tCategorias.rowAtPoint(point);
        tCategorias.setRowSelectionInterval(currentRow, currentRow);
        ModeloCategoriaProducto cat = (ModeloCategoriaProducto) tCategorias.getValueAt(currentRow, 0);
        ImageIcon image;
        try {
            image = new ImageIcon(ImageConverter.byteToImage(cat.getImagen()));
            Image scaledImage = image.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
            lblFoto.setIcon(new ImageIcon(scaledImage));
        } catch (IOException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tCategoriasMousePressed

    private void tpProductosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tpProductosStateChanged
        // TODO add your handling code here:
        /*cbxFiltro.removeAllItems ();
        if ( tpInventario.getSelectedIndex () == 0 ) {
            cbxFiltro.addItem ( "Buscar todo" );
            cbxFiltro.addItem ( "Codigo" );
            cbxFiltro.addItem ( "Nombre" );
            cbxFiltro.addItem ( "Categoria" );
            if ( chkBajas.isSelected () ) {
                btnBaja.setText ( "Alta" );
            } else {
                btnBaja.setText ( "Baja" );
            }
        } else {
            cbxFiltro.addItem ( "Buscar todo" );
            cbxFiltro.addItem ( "Nombre" );
            cbxFiltro.addItem ( "Codigo" );
            btnBaja.setText ( "Eliminar" );
        }*/
    }//GEN-LAST:event_tpProductosStateChanged

    private void lProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lProductosMousePressed
        lProductos.setSelectedIndex(lProductos.locationToIndex(evt.getPoint()));
    }//GEN-LAST:event_lProductosMousePressed

    private void lProductosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lProductosValueChanged
        if (lProductos.getSelectedIndex() >= 0) {
            /*cargar imagen*/
            ImageIcon image;
            try {
                image = new ImageIcon(ImageConverter.byteToImage(lProductos.getSelectedValue().getImagen()));
                Image scaledImage = image.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
                image = new ImageIcon(scaledImage);
                lblFotoProducto.setIcon(image);
            } catch (IOException ex) {
                LOG.log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lProductosValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReportes;
    private javax.swing.JCheckBox chkBajas;
    private javax.swing.JMenuItem itemBaja;
    private javax.swing.JMenuItem itemEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<ModeloProducto> lProductos;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblFotoProducto;
    private javax.swing.JPanel pBusqueda;
    private javax.swing.JPanel pCentro;
    private javax.swing.JPanel pComandos;
    private javax.swing.JPanel pGestion;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pTabla;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JPopupMenu popInventario;
    private javax.swing.JTable tCategorias;
    private javax.swing.JTabbedPane tpProductos;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    private void bajaMaterial() {
        lProductos.getSelectedValue().setBaja(true);
        try {
            System.out.println(lProductos.getSelectedValue().getNombre());
            manager.getProductoDAO().modificar(lProductos.getSelectedValue());
            Mensajes.mensajeOk("Registro editado satisfactoriamente!");
        } catch (Exception ex) {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        } finally {
            cargarProductos();
        }
    }

    private void altaMaterial() {
        lProductos.getSelectedValue().setBaja(false);
        try {
            manager.getProductoDAO().modificar(lProductos.getSelectedValue());
            Mensajes.mensajeOk("Registro editado satisfactoriamente!");
        } catch (Exception ex) {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
            Mensajes.mensajeError("Error: " + ex.getMessage());
        } finally {
            cargarProductos();
        }
    }

    private static final Logger LOG = Logger.getLogger(PanelProductos.class.getName());

}
