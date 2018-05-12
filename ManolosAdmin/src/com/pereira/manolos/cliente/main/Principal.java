package com.pereira.manolos.cliente.main;

import com.pereira.manolos.cliente.dialogos.DialogMiEmpresa;
import com.pereira.manolos.cliente.dialogos.DialogReporteXFecha;
import com.pereira.manolos.cliente.dialogos.DialogVenta;
import com.pereira.manolos.cliente.panels.PanelCajas;
import com.pereira.manolos.cliente.panels.PanelClientes;
import com.pereira.manolos.cliente.panels.PanelCompras;
import com.pereira.manolos.cliente.panels.PanelCostos;
import com.pereira.manolos.cliente.panels.PanelCotizaciones;
import com.pereira.manolos.cliente.panels.PanelEmpleados;
import com.pereira.manolos.cliente.panels.PanelInicio;
import com.pereira.manolos.cliente.panels.PanelInsumos;
import com.pereira.manolos.cliente.panels.PanelProductos;
import com.pereira.manolos.cliente.panels.PanelPromociones;
import com.pereira.manolos.cliente.panels.PanelProveedores;
import com.pereira.manolos.cliente.panels.PanelRecetas;
import com.pereira.manolos.cliente.panels.PanelResoluciones;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.negocio.modelos.ModeloPermisos;
import com.pereira.manolos.util.AgregarPanel;
import com.pereira.manolos.util.Fechero;
import com.pereira.manolos.util.Mensajes;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI100;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI900;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUIpressed;

/* @author Jose Luis */
@SuppressWarnings ( "serial" )
public class Principal extends javax.swing.JFrame {

    private final DAOManager manager;
    public static ModeloEmpleado empleado;
    @SuppressWarnings ( "CollectionWithoutInitialCapacity" )
    private List<ModeloPermisos> permisos;
    private final AgregarPanel agregar = new AgregarPanel ();
    private final boolean superuser = false;

    public Principal ( ModeloEmpleado empleado , DAOManager manager , List<ModeloPermisos> permisos ) {
        this.permisos = new ArrayList<> ();
        Principal.empleado = empleado;
        this.manager = manager;
        this.permisos = permisos;
        cargarForm ();
        initComponents ();
        this.setTitle ( "MANOLO'S PIZZA SYSTEM" );
        setIconImage ( Toolkit.getDefaultToolkit ().getImage ( this.getClass ().getResource ( "/com/pereira/manolos/cliente/images/icono.png" ) ) );
        this.setLocationRelativeTo ( null );
        agregar.insertarPanelMain ( pBody , new PanelInicio ( this.manager ) );
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pPrincipal = new javax.swing.JPanel();
        pBody = new javax.swing.JPanel();
        pFooter = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        lblEmpleado = new javax.swing.JLabel();
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            //javax.swing.UIManager.setLookAndFeel(info.getClassName());
            UIManager.put("MenuItem.selectionBackground", colorUI);
            UIManager.put("MenuItem.selectionForeground", Color.BLACK);
            UIManager.put("MenuItem.background", colorUI100);
            UIManager.put("MenuItem.foreground", Color.BLACK);
            UIManager.put("MenuItem.disabledForeground", colorBG);
            UIManager.put("Menu.selectionBackground", colorUIpressed);
            UIManager.put("Menu.selectionForeground", colorBG);
            UIManager.put("Menu.background", colorUI100);
            UIManager.put("Menu.foreground", Color.BLACK);
            UIManager.put("MenuBar.selectionBackground", colorUIpressed);
            UIManager.put("MenuBar.selectionForeground", colorBG);
            UIManager.put("MenuBar.background", colorUI100);
            UIManager.put("MenuBar.foreground", Color.BLACK);
            /*Bordes*/
            UIManager.put("MenuBar.border", BorderFactory.createLineBorder(colorUI100, 1));
            UIManager.put("Menu.border", BorderFactory.createLineBorder(colorUI100, 1));
            UIManager.put("MenuItem.border", BorderFactory.createLineBorder(colorUI100, 1));
            UIManager.put("PopupMenu.border", BorderFactory.createLineBorder(colorUI900, 2));
        }
        Menu = new javax.swing.JMenuBar();
        mSistema = new javax.swing.JMenu();
        itemInicio = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        itemCerrar = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();
        mAdmon = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        itemCajas = new javax.swing.JMenuItem();
        itemResoluciones = new javax.swing.JMenuItem();
        itemCotizaciones = new javax.swing.JMenuItem();
        itemEmpleados = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        itemInformacion = new javax.swing.JMenuItem();
        itemImpuestos = new javax.swing.JMenuItem();
        itemCostos = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        itemRespaldar = new javax.swing.JMenuItem();
        itemRestaurar = new javax.swing.JMenuItem();
        itemClientes = new javax.swing.JMenuItem();
        mCompras = new javax.swing.JMenu();
        itemInventario = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        itemFacturas = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        itemProveedores = new javax.swing.JMenuItem();
        mProduccion = new javax.swing.JMenu();
        itemRecetas = new javax.swing.JMenuItem();
        itemProductos = new javax.swing.JMenuItem();
        itemPromociones = new javax.swing.JMenuItem();
        itemVentas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        itemCajaxRango = new javax.swing.JMenuItem();
        itemReportes = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        itemVtasAnual = new javax.swing.JMenuItem();
        itemVtasxRango = new javax.swing.JMenuItem();
        itemVtasxTipo = new javax.swing.JMenuItem();
        itemUtilidades = new javax.swing.JMenuItem();
        mAyuda = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        itemDocumentacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 700));
        setPreferredSize(new java.awt.Dimension(950, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pPrincipal.setBackground(colorBG);
        pPrincipal.setLayout(new java.awt.GridBagLayout());

        pBody.setBackground(colorBG);
        pBody.setOpaque(false);
        pBody.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pPrincipal.add(pBody, gridBagConstraints);

        pFooter.setMinimumSize(new java.awt.Dimension(100, 50));
        pFooter.setOpaque(false);
        pFooter.setPreferredSize(new java.awt.Dimension(100, 50));
        pFooter.setLayout(new java.awt.GridBagLayout());

        lblBienvenido.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblBienvenido.setText("Bienvenido:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        pFooter.add(lblBienvenido, gridBagConstraints);

        lblEmpleado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblEmpleado.setText(empleado.getNombre());
        lblEmpleado.setMaximumSize(new java.awt.Dimension(250, 14));
        lblEmpleado.setMinimumSize(new java.awt.Dimension(250, 14));
        lblEmpleado.setPreferredSize(new java.awt.Dimension(250, 14));
        pFooter.add(lblEmpleado, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pPrincipal.add(pFooter, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(pPrincipal, gridBagConstraints);

        Menu.setBorder(null);
        Menu.setPreferredSize(new java.awt.Dimension(504, 35));

        mSistema.setText("Sistema");
        mSistema.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        itemInicio.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemInicio.setText("Inicio");
        itemInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInicioActionPerformed(evt);
            }
        });
        mSistema.add(itemInicio);

        jSeparator11.setBackground(colorUIpressed);
        jSeparator11.setForeground(colorUIpressed);
        jSeparator11.setOpaque(true);
        jSeparator11.setPreferredSize(new java.awt.Dimension(0, 1));
        mSistema.add(jSeparator11);

        itemCerrar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemCerrar.setText("Cerrar Sesion");
        itemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarActionPerformed(evt);
            }
        });
        mSistema.add(itemCerrar);

        itemSalir.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        mSistema.add(itemSalir);

        Menu.add(mSistema);

        mAdmon.setText("Administración");
        mAdmon.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        mAdmon.setOpaque(true);

        jMenu5.setText("Autorizaciones - DGII");
        jMenu5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenu5.setOpaque(true);

        itemCajas.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemCajas.setText("Cajas");
        itemCajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCajasActionPerformed(evt);
            }
        });
        jMenu5.add(itemCajas);
        if(permisos==null){
            itemCajas.setEnabled (false);
        }else{
            itemCajas.setEnabled (permisos.get (0).isPermiso ());
        }

        itemResoluciones.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemResoluciones.setText("Resoluciones");
        itemResoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemResolucionesActionPerformed(evt);
            }
        });
        jMenu5.add(itemResoluciones);
        if(permisos==null){
            itemResoluciones.setEnabled (false);
        }else{
            itemResoluciones.setEnabled (permisos.get (0).isPermiso ());
        }

        mAdmon.add(jMenu5);

        itemCotizaciones.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemCotizaciones.setText("Cotizaciones");
        itemCotizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCotizacionesActionPerformed(evt);
            }
        });
        mAdmon.add(itemCotizaciones);

        itemEmpleados.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemEmpleados.setText("Empleados");
        itemEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEmpleadosActionPerformed(evt);
            }
        });
        mAdmon.add(itemEmpleados);
        if(permisos==null){
            itemEmpleados.setEnabled (true);
        }else{
            itemEmpleados.setEnabled (permisos.get (1).isPermiso ());
        }

        jSeparator5.setBackground(colorUIpressed);
        jSeparator5.setForeground(colorUIpressed);
        jSeparator5.setOpaque(true);
        jSeparator5.setPreferredSize(new java.awt.Dimension(0, 1));
        mAdmon.add(jSeparator5);

        jMenu1.setText("Mi Empresa");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenu1.setOpaque(true);

        itemInformacion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemInformacion.setText("Información");
        itemInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInformacionActionPerformed(evt);
            }
        });
        jMenu1.add(itemInformacion);
        if(permisos==null){
            itemInformacion.setEnabled (false);
        }else{
            itemInformacion.setEnabled (permisos.get (2).isPermiso ());
        }

        itemImpuestos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemImpuestos.setText("Impuestos");
        itemImpuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemImpuestosActionPerformed(evt);
            }
        });
        jMenu1.add(itemImpuestos);
        itemImpuestos.setVisible(false);

        itemCostos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemCostos.setText("Costos");
        itemCostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCostosActionPerformed(evt);
            }
        });
        jMenu1.add(itemCostos);
        if(permisos==null){
            itemCostos.setEnabled (false);
        }else{
            itemCostos.setEnabled (permisos.get (3).isPermiso ());
        }

        mAdmon.add(jMenu1);

        jSeparator4.setBackground(colorUIpressed);
        jSeparator4.setForeground(colorUIpressed);
        jSeparator4.setOpaque(true);
        jSeparator4.setPreferredSize(new java.awt.Dimension(0, 1));
        mAdmon.add(jSeparator4);

        jMenu4.setText("Respaldos");
        jMenu4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenu4.setOpaque(true);

        itemRespaldar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemRespaldar.setText("Respaldar");
        itemRespaldar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRespaldarActionPerformed(evt);
            }
        });
        jMenu4.add(itemRespaldar);
        if(permisos==null){
            itemRespaldar.setEnabled (false);
        }else{
            itemRespaldar.setEnabled (permisos.get (4).isPermiso ());
        }

        itemRestaurar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemRestaurar.setText("Restaurar");
        itemRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRestaurarActionPerformed(evt);
            }
        });
        jMenu4.add(itemRestaurar);
        if(permisos==null){
            itemRestaurar.setEnabled (false);
        }else{
            itemRestaurar.setEnabled (permisos.get (4).isPermiso ());
        }

        mAdmon.add(jMenu4);

        itemClientes.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemClientes.setText("Clientes");
        itemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClientesActionPerformed(evt);
            }
        });
        mAdmon.add(itemClientes);
        if(permisos==null){
            itemClientes.setEnabled (false);
        }else{
            itemClientes.setEnabled (permisos.get (13).isPermiso ());
        }

        Menu.add(mAdmon);

        mCompras.setText("Compras");
        mCompras.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        itemInventario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemInventario.setText("Insumos");
        itemInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInventarioActionPerformed(evt);
            }
        });
        mCompras.add(itemInventario);
        if(permisos==null){
            itemInventario.setEnabled (false);
        }else{
            itemInventario.setEnabled (permisos.get (5).isPermiso ());
        }

        jSeparator9.setBackground(colorUIpressed);
        jSeparator9.setForeground(colorUIpressed);
        jSeparator9.setOpaque(true);
        jSeparator9.setPreferredSize(new java.awt.Dimension(0, 1));
        mCompras.add(jSeparator9);

        itemFacturas.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemFacturas.setText("Facturas");
        itemFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFacturasActionPerformed(evt);
            }
        });
        mCompras.add(itemFacturas);
        if(permisos==null){
            itemFacturas.setEnabled (false);
        }else{
            itemFacturas.setEnabled (permisos.get (6).isPermiso ());
        }

        jSeparator10.setBackground(colorUIpressed);
        jSeparator10.setForeground(colorUIpressed);
        jSeparator10.setOpaque(true);
        jSeparator10.setPreferredSize(new java.awt.Dimension(0, 1));
        mCompras.add(jSeparator10);

        itemProveedores.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemProveedores.setText("Proveedores");
        itemProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProveedoresActionPerformed(evt);
            }
        });
        mCompras.add(itemProveedores);
        if(permisos==null){
            itemProveedores.setEnabled (false);
        }else{
            itemProveedores.setEnabled (permisos.get (7).isPermiso ());
        }

        Menu.add(mCompras);

        mProduccion.setText("Producción");
        mProduccion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        itemRecetas.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemRecetas.setText("Recetas");
        itemRecetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRecetasActionPerformed(evt);
            }
        });
        mProduccion.add(itemRecetas);
        if(permisos==null){
            itemRecetas.setEnabled (false);
        }else{
            itemRecetas.setEnabled (permisos.get (8).isPermiso ());
        }

        itemProductos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemProductos.setText("Productos");
        itemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProductosActionPerformed(evt);
            }
        });
        mProduccion.add(itemProductos);
        if(permisos==null){
            itemProductos.setEnabled (false);
        }else{
            itemProductos.setEnabled (permisos.get (8).isPermiso ());
        }

        itemPromociones.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemPromociones.setText("Promociones");
        itemPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPromocionesActionPerformed(evt);
            }
        });
        mProduccion.add(itemPromociones);
        if(permisos==null){
            itemPromociones.setEnabled (false);
        }else{
            itemPromociones.setEnabled (permisos.get (8).isPermiso ());
        }

        itemVentas.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemVentas.setText("Ventas");
        itemVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVentasActionPerformed(evt);
            }
        });
        mProduccion.add(itemVentas);
        if(permisos==null){
            itemVentas.setEnabled (false);
        }else{
            itemVentas.setEnabled (permisos.get (8).isPermiso ());
        }

        Menu.add(mProduccion);

        jMenu2.setText("Reportes");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenu2.setOpaque(true);

        jMenu3.setText("Cajas");
        jMenu3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenu3.setOpaque(true);

        itemCajaxRango.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemCajaxRango.setText("Rango de Fechas");
        itemCajaxRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCajaxRangoActionPerformed(evt);
            }
        });
        jMenu3.add(itemCajaxRango);
        if(permisos==null){
            itemCajaxRango.setEnabled (false);
        }else{
            itemCajaxRango.setEnabled (permisos.get (9).isPermiso ());
        }

        jMenu2.add(jMenu3);

        itemReportes.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemReportes.setText("Compras");
        itemReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportesActionPerformed(evt);
            }
        });
        jMenu2.add(itemReportes);
        if(permisos==null){
            itemReportes.setEnabled (false);
        }else{
            itemReportes.setEnabled (permisos.get (9).isPermiso ());
        }

        jMenu7.setText("Ventas");
        jMenu7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenu7.setOpaque(true);

        itemVtasAnual.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemVtasAnual.setText("Anual");
        itemVtasAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVtasAnualActionPerformed(evt);
            }
        });
        jMenu7.add(itemVtasAnual);
        if(permisos==null){
            itemVtasAnual.setEnabled (false);
        }else{
            itemVtasAnual.setEnabled (permisos.get (9).isPermiso ());
        }

        itemVtasxRango.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemVtasxRango.setText("Rango de Fechas");
        itemVtasxRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVtasxRangoActionPerformed(evt);
            }
        });
        jMenu7.add(itemVtasxRango);
        if(permisos==null){
            itemVtasxRango.setEnabled (false);
        }else{
            itemVtasxRango.setEnabled (permisos.get (9).isPermiso ());
        }

        itemVtasxTipo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemVtasxTipo.setText("Por Tipo");
        itemVtasxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVtasxTipoActionPerformed(evt);
            }
        });
        jMenu7.add(itemVtasxTipo);
        if(permisos==null){
            itemVtasxTipo.setEnabled (false);
        }else{
            itemVtasxRango.setEnabled (permisos.get (9).isPermiso ());
        }

        jMenu2.add(jMenu7);

        itemUtilidades.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemUtilidades.setText("Utilidades");
        itemUtilidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUtilidadesActionPerformed(evt);
            }
        });
        jMenu2.add(itemUtilidades);
        if(permisos==null){
            itemUtilidades.setEnabled (false);
        }else{
            itemUtilidades.setEnabled (permisos.get (9).isPermiso ());
        }

        Menu.add(jMenu2);

        mAyuda.setText("Ayuda");
        mAyuda.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenuItem7.setText("Acerca de");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        mAyuda.add(jMenuItem7);

        itemDocumentacion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        itemDocumentacion.setText("Documentación");
        itemDocumentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDocumentacionActionPerformed(evt);
            }
        });
        mAyuda.add(itemDocumentacion);

        Menu.add(mAyuda);

        setJMenuBar(Menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProveedoresActionPerformed
        agregar.insertarPanelMain ( pBody , new PanelProveedores ( manager ) );
    }//GEN-LAST:event_itemProveedoresActionPerformed

    private void itemEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEmpleadosActionPerformed
        agregar.insertarPanelMain ( pBody , new PanelEmpleados ( manager ) );
    }//GEN-LAST:event_itemEmpleadosActionPerformed

    private void itemInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInformacionActionPerformed
        DialogMiEmpresa dialog = new DialogMiEmpresa ( new javax.swing.JFrame () ,
                                                       true ,
                                                       "Mi Empresa" ,
                                                       manager );
        dialog.setVisible ( true );
    }//GEN-LAST:event_itemInformacionActionPerformed

    private void itemInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInventarioActionPerformed
        agregar.insertarPanelMain ( pBody , new PanelInsumos ( manager ) );
    }//GEN-LAST:event_itemInventarioActionPerformed

    private void itemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProductosActionPerformed
        agregar.insertarPanelMain ( pBody , new PanelProductos ( manager ) );
    }//GEN-LAST:event_itemProductosActionPerformed

    private void itemCostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCostosActionPerformed
        agregar.insertarPanelMain ( pBody , new PanelCostos ( manager ) );
    }//GEN-LAST:event_itemCostosActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        System.exit ( 0 );
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarActionPerformed
        InicioSesion s = new InicioSesion ();
        this.dispose ();
        s.setVisible ( true );
    }//GEN-LAST:event_itemCerrarActionPerformed

    private void itemCajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCajasActionPerformed
        agregar.insertarPanelMain ( pBody , new PanelCajas ( manager ) );
    }//GEN-LAST:event_itemCajasActionPerformed

    private void itemDocumentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDocumentacionActionPerformed
        Runtime run = Runtime.getRuntime ();
        String fileName = "Ayuda\\manoloshelp.chm";
        String[] commands = { "cmd" , "/c" , fileName };
        try {
            Process child = Runtime.getRuntime ().exec ( commands );
        } catch ( IOException ex ) {
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }//GEN-LAST:event_itemDocumentacionActionPerformed

    private void itemFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFacturasActionPerformed
        agregar.insertarPanelMain ( pBody , new PanelCompras ( manager ) );
    }//GEN-LAST:event_itemFacturasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        //eliminarLogeo();
        //server.finalizarServer();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        /*consultarCaja();
        if(this.conectada){
            new Mensajes().mensajeAlert("Esta caja esta abierta");
        }
        server.iniciarServer();*/
    }//GEN-LAST:event_formWindowOpened

    private void itemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInicioActionPerformed
        agregar.insertarPanelMain ( pBody , new PanelInicio ( manager ) );
    }//GEN-LAST:event_itemInicioActionPerformed

    private void itemImpuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemImpuestosActionPerformed
        /*DialogImpuestos dialog = new DialogImpuestos(new javax.swing.JFrame(),
                true,
                "Impuestos");
        dialog.setVisible(true);*/
    }//GEN-LAST:event_itemImpuestosActionPerformed

    private void itemVtasAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVtasAnualActionPerformed
        try {
            int year = Calendar.getInstance ().get ( Calendar.YEAR );
            manager.getReportes ().reporteVentasAnuales ( "" + year );
        } catch ( Exception ex ) {
            Logger.getLogger ( Principal.class.getName () ).log ( Level.SEVERE , null , ex );
        }
    }//GEN-LAST:event_itemVtasAnualActionPerformed

    private void itemReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReportesActionPerformed
        DialogReporteXFecha dialog = new DialogReporteXFecha ( new javax.swing.JFrame () , true , "Compras por rango de fecha" , 2 , manager );
        dialog.setVisible ( true );
    }//GEN-LAST:event_itemReportesActionPerformed

    private void itemCajaxRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCajaxRangoActionPerformed
        DialogReporteXFecha dialog = new DialogReporteXFecha ( new javax.swing.JFrame () , true , "Movimientos de Cajas" , 1 , manager );
        dialog.setVisible ( true );
    }//GEN-LAST:event_itemCajaxRangoActionPerformed

    private void itemVtasxRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVtasxRangoActionPerformed
        DialogReporteXFecha dialog = new DialogReporteXFecha ( new javax.swing.JFrame () , true , "Ventas por rango de fechas" , 5 , manager );
        dialog.setVisible ( true );
    }//GEN-LAST:event_itemVtasxRangoActionPerformed

    private void itemRespaldarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRespaldarActionPerformed
        try {
            // TODO add your handling code here:
            JFileChooser chooser = new JFileChooser ();
            //chooser.setCurrentDirectory ( new java.io.File ( "." ) );
            chooser.setDialogTitle ( "Selección de dirección" );
            chooser.setFileSelectionMode ( JFileChooser.DIRECTORIES_ONLY );
            chooser.setAcceptAllFileFilterUsed ( false );
            if ( chooser.showOpenDialog ( null ) == JFileChooser.APPROVE_OPTION ) {
                manager.getRespaldo ().hacerBackup ( chooser.getSelectedFile ().toString () );
            }
            //manager.getRespaldo ().resetDB ();
        } catch ( Exception ex ) {
            Logger.getLogger ( Principal.class.getName () ).log ( Level.SEVERE , null , ex );
        }
    }//GEN-LAST:event_itemRespaldarActionPerformed

    private void itemRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRestaurarActionPerformed
        JFileChooser chooser = new javax.swing.JFileChooser ();
        chooser.setFileSelectionMode ( JFileChooser.FILES_ONLY );
        FileNameExtensionFilter filtro = new FileNameExtensionFilter ( "SQL" , "sql" );
        chooser.setFileFilter ( filtro );
        int res = chooser.showOpenDialog ( this );
        if ( res == JFileChooser.APPROVE_OPTION ) {
            File file = chooser.getSelectedFile ();
            try {
                manager.getRespaldo ().hacerRestore ( file.getAbsolutePath () );
            } catch ( Exception ex ) {
                Logger.getLogger ( Principal.class.getName () ).log ( Level.SEVERE , null , ex );
            }
        }
    }//GEN-LAST:event_itemRestaurarActionPerformed

    private void itemRecetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRecetasActionPerformed
        agregar.insertarPanelMain ( pBody , new PanelRecetas ( manager ) );
    }//GEN-LAST:event_itemRecetasActionPerformed

    private void itemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClientesActionPerformed
        agregar.insertarPanelMain ( pBody , new PanelClientes ( manager ) );
    }//GEN-LAST:event_itemClientesActionPerformed

    private void itemVtasxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVtasxTipoActionPerformed
        DialogReporteXFecha dialog = new DialogReporteXFecha ( new javax.swing.JFrame () , true , "Movimientos de Cajas" , 6 , manager );
        dialog.setVisible ( true );
    }//GEN-LAST:event_itemVtasxTipoActionPerformed

    private void itemCotizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCotizacionesActionPerformed
        agregar.insertarPanelMain ( pBody , new PanelCotizaciones ( manager , empleado ) );
    }//GEN-LAST:event_itemCotizacionesActionPerformed

    private void itemUtilidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUtilidadesActionPerformed
        Calendar calendarI = Calendar.getInstance ();
        calendarI.set ( Calendar.DATE , 1 );
        calendarI.set ( Calendar.HOUR , 0 );
        calendarI.set ( Calendar.MINUTE , 0 );
        calendarI.set ( Calendar.SECOND , 1 );
        Calendar calendarF = Calendar.getInstance ();
        calendarF.set ( Calendar.DATE , calendarF.getActualMaximum ( Calendar.DATE ) );
        calendarF.set ( Calendar.HOUR , 23 );
        calendarF.set ( Calendar.MINUTE , 59 );
        calendarF.set ( Calendar.SECOND , 59 );
        try {
            manager.getReportes ().reporteUtilidades ( Fechero.realToBase ( calendarI.getTime () ) , Fechero.realToBase ( calendarF.getTime () ) );
        } catch ( Exception ex ) {
            Logger.getLogger ( Principal.class.getName () ).log ( Level.SEVERE , null , ex );
        }
    }//GEN-LAST:event_itemUtilidadesActionPerformed

    private void itemResolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemResolucionesActionPerformed
        agregar.insertarPanel ( pBody , new PanelResoluciones ( manager ) );
    }//GEN-LAST:event_itemResolucionesActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void itemPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPromocionesActionPerformed
        agregar.insertarPanelMain ( pBody , new PanelPromociones ( manager ) );
    }//GEN-LAST:event_itemPromocionesActionPerformed

    private void itemVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVentasActionPerformed
        DialogVenta dialog = new DialogVenta ( this , true , manager , empleado , null );
        dialog.setVisible ( true );
    }//GEN-LAST:event_itemVentasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem itemCajas;
    private javax.swing.JMenuItem itemCajaxRango;
    private javax.swing.JMenuItem itemCerrar;
    private javax.swing.JMenuItem itemClientes;
    private javax.swing.JMenuItem itemCostos;
    private javax.swing.JMenuItem itemCotizaciones;
    private javax.swing.JMenuItem itemDocumentacion;
    private javax.swing.JMenuItem itemEmpleados;
    private javax.swing.JMenuItem itemFacturas;
    private javax.swing.JMenuItem itemImpuestos;
    private javax.swing.JMenuItem itemInformacion;
    private javax.swing.JMenuItem itemInicio;
    private javax.swing.JMenuItem itemInventario;
    private javax.swing.JMenuItem itemProductos;
    private javax.swing.JMenuItem itemPromociones;
    private javax.swing.JMenuItem itemProveedores;
    private javax.swing.JMenuItem itemRecetas;
    private javax.swing.JMenuItem itemReportes;
    private javax.swing.JMenuItem itemResoluciones;
    private javax.swing.JMenuItem itemRespaldar;
    private javax.swing.JMenuItem itemRestaurar;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuItem itemUtilidades;
    private javax.swing.JMenuItem itemVentas;
    private javax.swing.JMenuItem itemVtasAnual;
    private javax.swing.JMenuItem itemVtasxRango;
    private javax.swing.JMenuItem itemVtasxTipo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JMenu mAdmon;
    private javax.swing.JMenu mAyuda;
    private javax.swing.JMenu mCompras;
    private javax.swing.JMenu mProduccion;
    private javax.swing.JMenu mSistema;
    private javax.swing.JPanel pBody;
    private javax.swing.JPanel pFooter;
    private javax.swing.JPanel pPrincipal;
    // End of variables declaration//GEN-END:variables

    private void cargarForm () {
        /*Condition condition = PERMISOS.IDUSUARIO.equal(this.idusuario);
        permisos = manager.getPermisoDAO().obtenerLista(condition);*/
    }

    private static final Logger LOG = Logger.getLogger ( Principal.class.
            getName () );

}
