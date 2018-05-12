package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.cliente.listrenderer.ListaDetalleCotizacionRenderer;
import com.pereira.manolos.cliente.listrenderer.ListaProductoRenderer;
import com.pereira.manolos.cliente.panels.PanelProductos;
import com.pereira.manolos.datos.database.Tables;
import com.pereira.manolos.datos.database.tables.Producto;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCotizacion;
import com.pereira.manolos.negocio.modelos.ModeloDetalleCotizacion;
import com.pereira.manolos.negocio.modelos.ModeloProducto;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.NumerosLetras;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.cliente.main.Principal.empleado;

/* @author Jose Luis */
@SuppressWarnings ( "serial" )
public class DialogCotizacion extends javax.swing.JDialog {

    private final DAOManager manager;
    private ModeloProducto producto = new ModeloProducto ();
    private ModeloCotizacion cotizacion = new ModeloCotizacion ();
    private final DefaultListModel<ModeloProducto> dlmProductos = new DefaultListModel<> ();
    private DefaultListModel<ModeloDetalleCotizacion> dlmDetalleCotizacion = new DefaultListModel<> ();
    private static final Logger LOG = Logger.getLogger ( DialogCotizacion.class.getName () );
    private boolean enDetalle = false;
    private double total = 0;

    public DialogCotizacion ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager ) {
        super ( parent , modal );
        this.manager = manager;
        initComponents ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
        lProductos.setCellRenderer ( new ListaProductoRenderer () );
        lDetalle.setCellRenderer ( new ListaDetalleCotizacionRenderer () );
        cargarProductos ();
        try {
            cotizacion.setNumero ( this.manager.getCotizacionDAO ().getNumero () );
            lblCotizacion.setText ( cotizacion.getNumero () );
        } catch ( Exception ex ) {
            Logger.getLogger ( DialogCotizacion.class.getName () ).log ( Level.SEVERE , null , ex );
        }
        cotizacion.setEmpleado ( empleado );
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        popProductos = new javax.swing.JPopupMenu();
        itemAgregar = new javax.swing.JMenuItem();
        popDetalle = new javax.swing.JPopupMenu();
        itemEditarCantidad = new javax.swing.JMenuItem();
        itemEditarPrecio = new javax.swing.JMenuItem();
        itemEliminar = new javax.swing.JMenuItem();
        lblTitulo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lProductos = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lDetalle = new javax.swing.JList<>();
        lblCotizacion = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pComandos = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        itemAgregar.setText("Agregar");
        itemAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarActionPerformed(evt);
            }
        });
        popProductos.add(itemAgregar);

        itemEditarCantidad.setText("Editar Cantidad");
        itemEditarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarCantidadActionPerformed(evt);
            }
        });
        popDetalle.add(itemEditarCantidad);

        itemEditarPrecio.setText("Editar Precio");
        itemEditarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarPrecioActionPerformed(evt);
            }
        });
        popDetalle.add(itemEditarPrecio);

        itemEliminar.setText("Eliminar");
        itemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarActionPerformed(evt);
            }
        });
        popDetalle.add(itemEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblTitulo.setBackground(colorBG);
        lblTitulo.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(colorBG);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Cliente:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 5);
        jPanel1.add(jLabel1, gridBagConstraints);

        txtCliente.setMinimumSize(new java.awt.Dimension(12, 30));
        txtCliente.setPreferredSize(new java.awt.Dimension(12, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        jPanel1.add(txtCliente, gridBagConstraints);

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_buscar_N.png"))); // NOI18N
        btnBuscarCliente.setBorder(null);
        btnBuscarCliente.setBorderPainted(false);
        btnBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_buscar_P.png"))); // NOI18N
        btnBuscarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_buscar_O.png"))); // NOI18N
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(btnBuscarCliente, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Fecha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 5);
        jPanel1.add(jLabel2, gridBagConstraints);

        txtFecha.setDate(new Date());
        txtFecha.setDateFormatString("dd-MM-yyyy");
        txtFecha.setMinimumSize(new java.awt.Dimension(150, 30));
        txtFecha.setPreferredSize(new java.awt.Dimension(150, 30));
        txtFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtFechaPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        jPanel1.add(txtFecha, gridBagConstraints);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Detalle:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        jPanel2.add(jLabel10, gridBagConstraints);

        txtFiltro.setMinimumSize(new java.awt.Dimension(200, 30));
        txtFiltro.setPreferredSize(new java.awt.Dimension(200, 30));
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 10);
        jPanel2.add(txtFiltro, gridBagConstraints);

        jScrollPane3.setBorder(new javax.swing.border.LineBorder(colorUI, 2, true));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setMinimumSize(new java.awt.Dimension(250, 130));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(250, 130));

        lProductos.setBackground(colorBG);
        lProductos.setModel(dlmProductos);
        lProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lProductos.setComponentPopupMenu(popProductos);
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
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        jPanel2.add(jScrollPane3, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Productos:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 5);
        jPanel2.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Total:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 10, 0);
        jPanel2.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 10, 0);
        jPanel2.add(jLabel8, gridBagConstraints);

        lblTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTotal.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 10, 0);
        jPanel2.add(lblTotal, gridBagConstraints);

        jScrollPane4.setBorder(new javax.swing.border.LineBorder(colorUI, 2, true));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setMinimumSize(new java.awt.Dimension(250, 130));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(250, 130));

        lDetalle.setBackground(colorBG);
        lDetalle.setModel(dlmDetalleCotizacion);
        lDetalle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lDetalle.setComponentPopupMenu(popDetalle);
        lDetalle.setSelectionBackground(colorUI);
        lDetalle.setSelectionForeground(colorBG);
        lDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lDetalleMousePressed(evt);
            }
        });
        lDetalle.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lDetalleValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(lDetalle);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        jPanel2.add(jScrollPane4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jPanel2, gridBagConstraints);

        lblCotizacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCotizacion.setText("##");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(lblCotizacion, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Cotización #");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        jPanel1.add(jLabel9, gridBagConstraints);

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

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_N.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
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
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        pComandos.add(btnCancelar, gridBagConstraints);

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_N.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
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
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        pComandos.add(btnGuardar, gridBagConstraints);

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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if ( cotizacion.getCliente () == null ) {
            Mensajes.mensajeAlert ( "Seleccione un cliente para registrar la cotización" );
        } else if ( dlmDetalleCotizacion.size () < 1 ) {
            Mensajes.mensajeAlert ( "Seleccione los productos para registrar la cotización" );
        } else {
            try {
                manager.getCotizacionDAO ().insertar ( cotizacion );
                Collections.list ( dlmDetalleCotizacion.elements () ).forEach ( detalle -> {
                    detalle.setCotizacion ( cotizacion );
                    try {
                        manager.getDetalleCotizacionDAO ().insertar ( detalle );
                    } catch ( Exception ex ) {
                        LOG.log ( Level.SEVERE , null , ex );
                        Mensajes.mensajeError ( "Error: " + ex.getMessage () );
                    }
                } );
                Mensajes.mensajeOk ( "Registro guardado exitosamente!" );
            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
                Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            } finally {
                dispose ();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void lProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lProductosMousePressed
        lProductos.setSelectedIndex ( lProductos.locationToIndex ( evt.getPoint () ) );
    }//GEN-LAST:event_lProductosMousePressed

    private void lProductosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lProductosValueChanged
        if ( lProductos.getSelectedIndex () >= 0 ) {

        }
    }//GEN-LAST:event_lProductosValueChanged

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        DialogSeleccionCliente dialog = new DialogSeleccionCliente ( new JFrame () , true , "SELECCION DE CLIENTE" , manager );
        dialog.setVisible ( true );
        if ( dialog.getCliente () != null ) {
            cotizacion.setCliente ( dialog.getCliente () );
            txtCliente.setText ( dialog.getCliente ().getNombre () );
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void lDetalleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lDetalleMousePressed
        lDetalle.setSelectedIndex ( lDetalle.locationToIndex ( evt.getPoint () ) );
    }//GEN-LAST:event_lDetalleMousePressed

    private void lDetalleValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lDetalleValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lDetalleValueChanged

    private void itemAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarActionPerformed
        if ( enDetalle () ) {
            Mensajes.mensajeAlert ( "El producto ya esta dentro de la cotización" );
        } else {
            DialogCantidad dialog = new DialogCantidad ( new JFrame () , true , "CANTIDAD" );
            dialog.setVisible ( true );
            if ( dialog.getCantidad () != 0 ) {
                ModeloDetalleCotizacion detalle = new ModeloDetalleCotizacion ( lProductos.getSelectedValue () , dialog.getCantidad () ,
                                                                                lProductos.getSelectedValue ().getPrecio () ,
                                                                                lProductos.getSelectedValue ().getTipo () );
                dlmDetalleCotizacion.addElement ( detalle );
                actualziarTotal ();
            }
        }
    }//GEN-LAST:event_itemAgregarActionPerformed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        cargarProductos ();
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void txtFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtFechaPropertyChange
        cotizacion.setFecha ( txtFecha.getDate () );
    }//GEN-LAST:event_txtFechaPropertyChange

    private void itemEditarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarPrecioActionPerformed
        DialogPrecio dialog = new DialogPrecio ( new JFrame () , true , "EDITAR PRECIO" , lDetalle.getSelectedValue () );
        dialog.setVisible ( true );
        actualziarTotal ();
    }//GEN-LAST:event_itemEditarPrecioActionPerformed

    private void itemEditarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarCantidadActionPerformed
        DialogCantidad dialog = new DialogCantidad ( new JFrame () , true , "EDITAR CANTIDAD" , lDetalle.getSelectedValue () );
        dialog.setVisible ( true );
        actualziarTotal ();
    }//GEN-LAST:event_itemEditarCantidadActionPerformed

    private void itemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarActionPerformed
        dlmDetalleCotizacion.removeElementAt ( lDetalle.getSelectedIndex () );
    }//GEN-LAST:event_itemEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JMenuItem itemAgregar;
    private javax.swing.JMenuItem itemEditarCantidad;
    private javax.swing.JMenuItem itemEditarPrecio;
    private javax.swing.JMenuItem itemEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<ModeloDetalleCotizacion> lDetalle;
    private javax.swing.JList<ModeloProducto> lProductos;
    private javax.swing.JLabel lblCotizacion;
    private javax.swing.JPanel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pComandos;
    private javax.swing.JPopupMenu popDetalle;
    private javax.swing.JPopupMenu popProductos;
    private javax.swing.JTextField txtCliente;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    private void cargarForm () {

    }

    private void cargarProductos () {
        dlmProductos.clear ();
        Condition baja = Tables.PRODUCTO.BAJA.equal ( false );
        Condition filtro = Producto.PRODUCTO.NOMBRE.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
        try {
            manager.getProductoDAO ().obtenerLista ( filtro.and ( baja ) ).forEach ( p -> {
                dlmProductos.addElement ( p );
            } );
        } catch ( Exception ex ) {
            Logger.getLogger ( PanelProductos.class.getName () ).log ( Level.SEVERE , null , ex );
        }
        if ( !dlmProductos.isEmpty () ) {
            lProductos.setSelectedIndex ( 0 );
        }
    }

    private boolean enDetalle () {
        enDetalle = false;
        Collections.list ( dlmDetalleCotizacion.elements () ).forEach ( detalle -> {
            if ( detalle.getProducto ().getIdproducto () == lProductos.getSelectedValue ().getIdproducto () ) {
                enDetalle = true;
            }
        } );
        return enDetalle;
    }

    private void actualziarTotal () {
        total = 0;
        Collections.list ( dlmDetalleCotizacion.elements () ).forEach ( detalle -> {
            total += ( detalle.getCantidad () * detalle.getPrecio ().doubleValue () );
        } );
        cotizacion.setTotal ( new BigDecimal ( total ) );
        cotizacion.setEnletras ( NumerosLetras.convertNumberToLetter ( total ) );
        lblTotal.setText ( String.format ( "%.2f" , total ) );
    }

}
