package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.cliente.listrenderer.ListaInsumoRenderer;
import com.pereira.manolos.cliente.listrenderer.ListaRecetaRenderer;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloDetalleReceta;
import com.pereira.manolos.negocio.modelos.ModeloInsumo;
import com.pereira.manolos.negocio.modelos.ModeloReceta;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.SpinnerUI;
import com.pereira.manolos.util.TabbedPanelUI;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.datos.database.Tables.INSUMO;
import static com.pereira.manolos.datos.database.Tables.RECETA;

/* @author Jose Luis */
@SuppressWarnings ( "serial" )
public class DialogIngrediente extends javax.swing.JDialog {

    private final DAOManager manager;
    private final ModeloReceta receta;
    private ModeloDetalleReceta detalle = new ModeloDetalleReceta ();
    private final DefaultListModel<ModeloReceta> dlmReceta = new DefaultListModel<> ();
    private final DefaultListModel<ModeloInsumo> dlmInsumos = new DefaultListModel<> ();
    private final List<ModeloDetalleReceta> ingredientes;
    private static final Logger LOG = Logger.getLogger ( DialogIngrediente.class.getName () );

    public DialogIngrediente ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager , ModeloReceta receta ,
                               List<ModeloDetalleReceta> ingredientes ) {
        super ( parent , modal );
        this.manager = manager;
        this.receta = receta;
        this.ingredientes = ingredientes;
        initComponents ();
        lRecetas.setCellRenderer ( new ListaRecetaRenderer () );
        lInsumos.setCellRenderer ( new ListaInsumoRenderer () );
        cargarRecetas ();
        cargarInsumos ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblTitulo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtFiltro = new javax.swing.JTextField();
        tpIngrediente = new javax.swing.JTabbedPane();
        pInsumos = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lInsumos = new javax.swing.JList<>();
        pRecetas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lRecetas = new javax.swing.JList<>();
        lblUnidad = new javax.swing.JLabel();
        spDescargo = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        pComandos = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblTitulo.setBackground(colorBG);
        lblTitulo.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(colorBG);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        txtFiltro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtFiltro.setMargin(new java.awt.Insets(2, 10, 2, 2));
        txtFiltro.setMaximumSize(new java.awt.Dimension(250, 40));
        txtFiltro.setMinimumSize(new java.awt.Dimension(250, 40));
        txtFiltro.setPreferredSize(new java.awt.Dimension(250, 40));
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        jPanel1.add(txtFiltro, gridBagConstraints);

        tpIngrediente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tpIngredienteStateChanged(evt);
            }
        });

        pInsumos.setBackground(new java.awt.Color(255, 255, 255));
        pInsumos.setLayout(new java.awt.GridBagLayout());

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setMinimumSize(new java.awt.Dimension(350, 130));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(350, 130));

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
        jScrollPane4.setViewportView(lInsumos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pInsumos.add(jScrollPane4, gridBagConstraints);

        tpIngrediente.addTab("Insumos", pInsumos);

        pRecetas.setBackground(new java.awt.Color(255, 255, 255));
        pRecetas.setLayout(new java.awt.GridBagLayout());

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setMinimumSize(new java.awt.Dimension(350, 134));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(350, 134));

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
        jScrollPane3.setViewportView(lRecetas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pRecetas.add(jScrollPane3, gridBagConstraints);

        tpIngrediente.addTab("Recetas", pRecetas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel1.add(tpIngrediente, gridBagConstraints);
        tpIngrediente.setUI(new TabbedPanelUI(colorUI,colorBG));

        lblUnidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUnidad.setText("Unidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel1.add(lblUnidad, gridBagConstraints);

        spDescargo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spDescargo.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        spDescargo.setMinimumSize(new java.awt.Dimension(100, 35));
        spDescargo.setPreferredSize(new java.awt.Dimension(100, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        jPanel1.add(spDescargo, gridBagConstraints);
        spDescargo.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Descargo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pComandos.add(btnCancelar, gridBagConstraints);

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_aceptar_N.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_aceptar_P.png"))); // NOI18N
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_aceptar_O.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
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
        boolean enlista = false;
        if ( tpIngrediente.getSelectedIndex () == 0 ) {
            for ( int i = 0 ; i < ingredientes.size () ; i++ ) {
                if ( ingredientes.get ( i ).getTipo ().equals ( "INSUMO" ) ) {
                    if ( ingredientes.get ( i ).getIngredienteInsumo ().getIdinsumo () == lInsumos.getSelectedValue ().getIdinsumo () ) {
                        enlista = true;
                    }
                }
            }
        } else {
            for ( int i = 0 ; i < ingredientes.size () ; i++ ) {
                if ( ingredientes.get ( i ).getTipo ().equals ( "RECETA" ) ) {
                    if ( ingredientes.get ( i ).getIngredienteReceta ().getIdreceta () == lRecetas.getSelectedValue ().getIdreceta () ) {
                        enlista = true;
                    }
                }
            }
        }
        if ( enlista ) {
            Mensajes.mensajeAlert ( "El ingrediente ya se encuentra dentro de la receta!" );
        } else if ( ( double ) spDescargo.getValue () == 0.0 ) {
            Mensajes.mensajeAlert ( "Ingrese cantidad de descargo!" );
        } else {
            guardarDetalleReceta ();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        cargarInsumos ();
        cargarRecetas ();
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void lRecetasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lRecetasMousePressed
        lRecetas.setSelectedIndex ( lRecetas.locationToIndex ( evt.getPoint () ) );
    }//GEN-LAST:event_lRecetasMousePressed

    private void lRecetasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lRecetasValueChanged
        if(!lRecetas.isSelectionEmpty()){
            lblUnidad.setText ( lRecetas.getSelectedValue ().getUnidad ().getDetalle () );
        }else{
            lblUnidad.setText("");
        }
    }//GEN-LAST:event_lRecetasValueChanged

    private void lInsumosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lInsumosMousePressed
        lInsumos.setSelectedIndex ( lInsumos.locationToIndex ( evt.getPoint () ) );
    }//GEN-LAST:event_lInsumosMousePressed

    private void lInsumosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lInsumosValueChanged
        if(!lInsumos.isSelectionEmpty()){
            lblUnidad.setText ( lInsumos.getSelectedValue ().getUnidad ().getDetalle () );
        }else{
            lblUnidad.setText("");
        }
    }//GEN-LAST:event_lInsumosValueChanged

    private void tpIngredienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tpIngredienteStateChanged
        if ( tpIngrediente.getSelectedIndex () == 0 ) {
            if ( !dlmInsumos.isEmpty () ) {
                lblUnidad.setText ( lInsumos.getSelectedValue ().getUnidad ().getDetalle () );
            } else {
                lblUnidad.setText ( "" );
            }
        } else if ( !dlmReceta.isEmpty () ) {
            lblUnidad.setText ( lRecetas.getSelectedValue ().getUnidad ().getDetalle () );
        } else {
            lblUnidad.setText ( "" );
        }
    }//GEN-LAST:event_tpIngredienteStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<ModeloInsumo> lInsumos;
    private javax.swing.JList<ModeloReceta> lRecetas;
    private javax.swing.JPanel lblTitulo;
    private javax.swing.JLabel lblUnidad;
    private javax.swing.JPanel pComandos;
    private javax.swing.JPanel pInsumos;
    private javax.swing.JPanel pRecetas;
    private javax.swing.JSpinner spDescargo;
    private javax.swing.JTabbedPane tpIngrediente;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    private void cargarRecetas () {
        dlmReceta.clear ();
        Condition filtro = RECETA.NOMBRE.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
        Condition baja = RECETA.BAJA.eq ( false );
        Condition tipo = RECETA.TIPORECETA.eq ( "COMPLEMENTARIA" );
        Condition sinReceta = RECETA.IDRECETA.notEqual ( this.receta.getIdreceta () );
        try {
            manager.getRecetaDAO ().obtenerLista ( filtro.and ( baja ).and ( tipo ).and ( sinReceta ) ).forEach ( r -> {
                dlmReceta.addElement ( r );
            } );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
        if ( !dlmReceta.isEmpty () ) {
            lRecetas.setSelectedIndex ( 0 );
        }
    }

    private void cargarInsumos () {
        dlmInsumos.clear ();
        Condition baja = INSUMO.BAJA.equal ( false );
        Condition filtro = INSUMO.NOMBRE.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
        Condition tipo = INSUMO.PRODUCCION.eq ( true );
        try {
            manager.getInsumoDAO ().obtenerLista ( filtro.and ( baja ).and ( tipo ) ).forEach ( insumo -> {
                dlmInsumos.addElement ( insumo );
            } );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
        if ( !dlmInsumos.isEmpty () ) {
            lInsumos.setSelectedIndex ( 0 );
        }
    }

    private void guardarDetalleReceta () {        
        if ( tpIngrediente.getSelectedIndex () == 0 ) {
            detalle.setIngredienteInsumo ( lInsumos.getSelectedValue () );
            detalle.setUnidad ( lInsumos.getSelectedValue ().getUnidad () );
            detalle.setTipo ( "INSUMO" );
        } else {
            detalle.setIngredienteReceta ( lRecetas.getSelectedValue () );
            detalle.setUnidad ( lRecetas.getSelectedValue ().getUnidad () );
            detalle.setTipo ( "RECETA" );
        }
        detalle.setDescargo ( ( double ) spDescargo.getValue () );
        detalle.setReceta ( receta );
        try {
            manager.getDetalleRecetaDAO ().insertar ( detalle );
            Mensajes.mensajeOk ( "Registro agregado exitosamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            dispose ();
        }
    }
}
