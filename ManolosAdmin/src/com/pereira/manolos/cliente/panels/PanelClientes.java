package com.pereira.manolos.cliente.panels;

import com.mrlonee.swing.animation.AnimatedPanel;
import com.pereira.manolos.cliente.dialogos.DialogCliente;
import com.pereira.manolos.cliente.listrenderer.ListaClienteRenderer;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCliente;
import com.pereira.manolos.util.ComboUI;
import com.pereira.manolos.util.Mensajes;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.datos.database.Tables.CLIENTE;

/* @author Jose Luis */
public class PanelClientes extends AnimatedPanel {

    private final DAOManager manager;
    private final DefaultListModel<ModeloCliente> dlmClientes;
    private DialogCliente dCliente;

    public PanelClientes ( DAOManager manager ) {
        this.setAnimationType ( AnimatedPanel.AnimationType.SlideAnimationFromTop );
        this.dlmClientes = new DefaultListModel<> ();
        this.manager = manager;
        initComponents ();
        lClientes.setCellRenderer ( new ListaClienteRenderer () );
        cargarClientes ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        popEmpleados = new javax.swing.JPopupMenu();
        itemEditarEmpleado = new javax.swing.JMenuItem();
        itemBaja = new javax.swing.JMenuItem();
        pMain = new javax.swing.JPanel();
        pTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pComandos = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        pBody = new javax.swing.JPanel();
        pBusqueda = new javax.swing.JPanel();
        txtFiltro = new javax.swing.JTextField();
        cbxFiltro = new javax.swing.JComboBox<>();
        chkBajas = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        lClientes = new javax.swing.JList<>();

        itemEditarEmpleado.setText("Editar Proveedor");
        itemEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarEmpleadoActionPerformed(evt);
            }
        });
        popEmpleados.add(itemEditarEmpleado);

        itemBaja.setText("Dar Baja");
        itemBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBajaActionPerformed(evt);
            }
        });
        popEmpleados.add(itemBaja);

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(new java.awt.Color(102, 102, 102));
        pMain.setOpaque(false);
        pMain.setLayout(new java.awt.GridBagLayout());

        pTitulo.setBackground(colorUI);
        pTitulo.setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(colorBG);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(colorBG);
        jLabel1.setText("Clientes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 0);
        pTitulo.add(jLabel1, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e7ef(0)_64.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        pTitulo.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pMain.add(pTitulo, gridBagConstraints);

        pComandos.setBackground(colorUI);
        pComandos.setMinimumSize(new java.awt.Dimension(120, 100));
        pComandos.setPreferredSize(new java.awt.Dimension(120, 100));
        pComandos.setLayout(new java.awt.GridBagLayout());

        btnNuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_nuevo_normal.png"))); // NOI18N
        btnNuevo.setToolTipText("");
        btnNuevo.setBorder(null);
        btnNuevo.setBorderPainted(false);
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
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 0);
        pComandos.add(btnNuevo, gridBagConstraints);

        btnEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        btnBaja.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        btnReporte.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_reporte_normal.png"))); // NOI18N
        btnReporte.setBorder(null);
        btnReporte.setBorderPainted(false);
        btnReporte.setContentAreaFilled(false);
        btnReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte.setFocusable(false);
        btnReporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporte.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_reporte_pressed.png"))); // NOI18N
        btnReporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_reporte_over.png"))); // NOI18N
        btnReporte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        pComandos.add(btnReporte, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pMain.add(pComandos, gridBagConstraints);

        pBody.setOpaque(false);
        pBody.setLayout(new java.awt.GridBagLayout());

        pBusqueda.setOpaque(false);
        pBusqueda.setLayout(new java.awt.GridBagLayout());

        txtFiltro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtFiltro.setMargin(new java.awt.Insets(2, 10, 2, 2));
        txtFiltro.setMaximumSize(new java.awt.Dimension(150, 40));
        txtFiltro.setMinimumSize(new java.awt.Dimension(150, 40));
        txtFiltro.setPreferredSize(new java.awt.Dimension(150, 40));
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        pBusqueda.add(txtFiltro, gridBagConstraints);
        /*txtFiltro.setUI(new TextFieldUI(
            " Buscar...", colorUI, colorUI, colorBG
        ));*/

        cbxFiltro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbxFiltro.setForeground(colorUI);
        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar todo", "Nombre", "Direccion", "Telefono" }));
        cbxFiltro.setMaximumSize(new java.awt.Dimension(150, 40));
        cbxFiltro.setMinimumSize(new java.awt.Dimension(150, 40));
        cbxFiltro.setPreferredSize(new java.awt.Dimension(150, 40));
        cbxFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxFiltroItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pBusqueda.add(cbxFiltro, gridBagConstraints);
        cbxFiltro.setUI(new ComboUI(colorBG,colorUI, colorBG));

        chkBajas.setBackground(new java.awt.Color(255, 255, 255));
        chkBajas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkBajas.setForeground(colorUI);
        chkBajas.setText("Ver Bajas");
        chkBajas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkBajas.setFocusable(false);
        chkBajas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chkBajas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e835(0)_24.png"))); // NOI18N
        chkBajas.setMaximumSize(new java.awt.Dimension(115, 25));
        chkBajas.setMinimumSize(new java.awt.Dimension(115, 25));
        chkBajas.setPreferredSize(new java.awt.Dimension(115, 25));
        chkBajas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e834(1)_24.png"))); // NOI18N
        chkBajas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBajasItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pBusqueda.add(chkBajas, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pBody.add(pBusqueda, gridBagConstraints);

        jScrollPane3.setBorder(new javax.swing.border.LineBorder(colorUI, 2, true));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setMinimumSize(new java.awt.Dimension(450, 130));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(450, 130));

        lClientes.setBackground(colorBG);
        lClientes.setModel(dlmClientes);
        lClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lClientes.setSelectionBackground(colorUI);
        lClientes.setSelectionForeground(colorBG);
        lClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lClientesMousePressed(evt);
            }
        });
        lClientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lClientesValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lClientes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pBody.add(jScrollPane3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pMain.add(pBody, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(pMain, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        dCliente = new DialogCliente ( new JFrame () , true , "Nuevo Cliente" , manager );
        dCliente.setVisible ( true );
        cargarClientes ();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if ( !chkBajas.isSelected () ) {
            editarCliente ();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        if ( !dlmClientes.isEmpty () ) {
            if ( chkBajas.isSelected () ) {
                altaCliente ();
            } else {
                bajaCliente ();
            }
            cargarClientes ();
        } else {
            Mensajes.mensajeAlert ( "Seleccione un cliente" );
        }
    }//GEN-LAST:event_btnBajaActionPerformed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        cargarClientes ();
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void cbxFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFiltroItemStateChanged
        cargarClientes ();
    }//GEN-LAST:event_cbxFiltroItemStateChanged

    private void chkBajasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBajasItemStateChanged
        if ( chkBajas.isSelected () ) {
            btnBaja.setIcon ( new javax.swing.ImageIcon ( getClass ().getResource ( "/com/pereira/manolos/cliente/images/button_alta_normal.png" ) ) );
            btnBaja.setRolloverIcon ( new javax.swing.ImageIcon ( getClass ().
                    getResource ( "/com/pereira/manolos/cliente/images/button_alta_over.png" ) ) );
            btnBaja.setPressedIcon ( new javax.swing.ImageIcon ( getClass ().getResource (
                    "/com/pereira/manolos/cliente/images/button_alta_pressed.png" ) ) );
            itemBaja.setText ( "Dar Alta" );
        } else {
            btnBaja.setIcon ( new javax.swing.ImageIcon ( getClass ().getResource ( "/com/pereira/manolos/cliente/images/button_baja_normal.png" ) ) );
            btnBaja.setRolloverIcon ( new javax.swing.ImageIcon ( getClass ().
                    getResource ( "/com/pereira/manolos/cliente/images/button_baja_over.png" ) ) );
            btnBaja.setPressedIcon ( new javax.swing.ImageIcon ( getClass ().getResource (
                    "/com/pereira/manolos/cliente/images/button_baja_pressed.png" ) ) );
            itemBaja.setText ( "Dar Baja" );
        }
        cargarClientes ();
    }//GEN-LAST:event_chkBajasItemStateChanged

    private void lClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lClientesMousePressed
        lClientes.setSelectedIndex ( lClientes.locationToIndex ( evt.getPoint () ) );
    }//GEN-LAST:event_lClientesMousePressed

    private void lClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lClientesValueChanged
        /*if ( lClientes.getSelectedIndex () >= 0 ) {
            txtNombre.setText ( lClientes.getSelectedValue ().getNombre () );
            txtEmail.setText ( lClientes.getSelectedValue ().getEmail () );
            txtLimite.setText ( "$ " + lClientes.getSelectedValue ().getLimite () );
            txtNit.setText ( lClientes.getSelectedValue ().getNIT () );
            txtNrc.setText ( lClientes.getSelectedValue ().getVNRC () );
            txtPlazo.setText ( lClientes.getSelectedValue ().getPlazo () + " Dias" );
            txtTipo.setText ( lClientes.getSelectedValue ().getTipoproveedor () );
            txtRepresentante.setText ( lClientes.getSelectedValue ().getRepresentante () );
        }*/
    }//GEN-LAST:event_lClientesValueChanged

    private void itemEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarEmpleadoActionPerformed
        if ( !chkBajas.isSelected () ) {
            editarCliente ();
        }
    }//GEN-LAST:event_itemEditarEmpleadoActionPerformed

    private void itemBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBajaActionPerformed
        /*if ( chkBajas.isSelected () ) {
            altaProveedor ();
        } else {
            bajaProveedor ();
        }
        cargarProveedores ();*/
    }//GEN-LAST:event_itemBajaActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        try {
            manager.getReportes ().reporteClientes ();
        } catch ( Exception ex ) {
            Logger.getLogger ( PanelClientes.class.getName () ).log ( Level.SEVERE , null , ex );
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReporte;
    private javax.swing.JComboBox<String> cbxFiltro;
    private javax.swing.JCheckBox chkBajas;
    private javax.swing.JMenuItem itemBaja;
    private javax.swing.JMenuItem itemEditarEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<ModeloCliente> lClientes;
    private javax.swing.JPanel pBody;
    private javax.swing.JPanel pBusqueda;
    private javax.swing.JPanel pComandos;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JPopupMenu popEmpleados;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    private void cargarClientes () {
        dlmClientes.clear ();
        Condition filtro;
        Condition baja = CLIENTE.BAJA.eq ( chkBajas.isSelected () );
        switch ( cbxFiltro.getSelectedIndex () ) {
            case 1:
                filtro = CLIENTE.NOMBRE.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
                break;
            case 2:
                filtro = CLIENTE.DIRECCION.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
                break;
            case 3:
                filtro = CLIENTE.TELEFONO.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
                break;
            default:
                filtro = CLIENTE.NOMBRE.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" )
                        .or ( CLIENTE.DIRECCION.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" ) )
                        .or ( CLIENTE.TELEFONO.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" ) );
                break;
        }
        try {
            manager.getClienteDAO ().obtenerLista ( filtro.and ( baja ) ).forEach ( cliente -> {
                dlmClientes.addElement ( cliente );
            } );
        } catch ( Exception ex ) {
            Logger.getLogger ( PanelClientes.class.getName () ).log ( Level.SEVERE , null , ex );
        }
        if ( !dlmClientes.isEmpty () ) {
            lClientes.setSelectedIndex ( 0 );
        }
    }

    private void editarCliente () {
        dCliente = new DialogCliente ( new javax.swing.JFrame () , true , "AGREGAR CLIENTE" , this.manager , lClientes.getSelectedValue () );
        dCliente.setVisible ( true );
        cargarClientes ();
    }

    private void bajaCliente () {
        ModeloCliente cliente = lClientes.getSelectedValue ();
        cliente.setBaja ( true );
        try {
            manager.getClienteDAO ().modificar ( cliente );
            Mensajes.mensajeOk ( "Registro editado exitosamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( ex.getMessage () );
        }
    }

    private void altaCliente () {
        ModeloCliente cliente = lClientes.getSelectedValue ();
        cliente.setBaja ( false );
        try {
            manager.getClienteDAO ().modificar ( cliente );
            Mensajes.mensajeOk ( "Registro editado exitosamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( ex.getMessage () );
        }
    }
    private static final Logger LOG = Logger.getLogger ( PanelClientes.class.getName () );
}
