package com.pereira.manolos.cliente.panels;

import com.mrlonee.swing.animation.AnimatedPanel;
import com.pereira.manolos.cliente.dialogs.DialogCliente;
import com.pereira.manolos.cliente.listarenderer.ClienteRenderer;
import com.pereira.manolos.cliente.main.PanelInicio;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCliente;
import com.pereira.manolos.util.AgregarPanel;
import com.pereira.manolos.util.JKeyboardPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JPopupMenu;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.Principal.pBody;
import static com.pereira.manolos.datos.database.Tables.CLIENTE;

public class PanelClientes extends AnimatedPanel {

    private final DefaultListModel<ModeloCliente> dlmClientes = new DefaultListModel<> ();
    private final DAOManager manager;
    private JPopupMenu pop;
    private JKeyboardPane keyboard;
    private final AgregarPanel agregar = new AgregarPanel ();

    public PanelClientes ( DAOManager manager ) {
        this.manager = manager;
        initComponents ();
        lClientes.setCellRenderer ( new ClienteRenderer () );
        cargarClientes ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        grupoVenta = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pCategorias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lClientes = new javax.swing.JList<>();
        txtFiltro = new javax.swing.JTextField();
        pVenta = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 195, 74), 10));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        pCategorias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 195, 74), 3, true));
        pCategorias.setMinimumSize(new java.awt.Dimension(550, 100));
        pCategorias.setOpaque(false);
        pCategorias.setPreferredSize(new java.awt.Dimension(550, 100));
        pCategorias.setRequestFocusEnabled(false);
        pCategorias.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        lClientes.setModel(dlmClientes);
        lClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lClientes.setSelectionBackground(new java.awt.Color(139, 195, 74));
        lClientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lClientesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lClientes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        pCategorias.add(jScrollPane1, gridBagConstraints);

        txtFiltro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtFiltro.setMinimumSize(new java.awt.Dimension(250, 35));
        txtFiltro.setPreferredSize(new java.awt.Dimension(250, 35));
        txtFiltro.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFiltroCaretUpdate(evt);
            }
        });
        txtFiltro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFiltroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFiltroFocusLost(evt);
            }
        });
        txtFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFiltroMouseClicked(evt);
            }
        });
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });
        txtFiltro.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                txtFiltroVetoableChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pCategorias.add(txtFiltro, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(pCategorias, gridBagConstraints);

        pVenta.setMinimumSize(new java.awt.Dimension(219, 100));
        pVenta.setOpaque(false);
        pVenta.setPreferredSize(new java.awt.Dimension(219, 100));
        pVenta.setLayout(new java.awt.GridBagLayout());

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_agregar_normal.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(30, 10, 15, 10);
        pVenta.add(btnAgregar, gridBagConstraints);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_editar_normal.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 10);
        pVenta.add(btnEditar, gridBagConstraints);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_atras_normal.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 5, 10);
        pVenta.add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 10, 10);
        jPanel1.add(pVenta, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(139, 195, 74));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setText("Clientes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        cargarClientes ();
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void lClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lClientesValueChanged

    }//GEN-LAST:event_lClientesValueChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        agregar.insertarPanelMain ( pBody , new PanelInicio ( manager ) );
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        DialogCliente dialog = new DialogCliente ( new javax.swing.JFrame () , true , "AGREGAR CLIENTE" , this.manager );
        dialog.setVisible ( true );
        cargarClientes ();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtFiltroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroFocusGained
        pop = new JPopupMenu ();
        keyboard = new JKeyboardPane ( txtFiltro );
        pop.add ( keyboard );
        pop.setVisible ( true );
        pop.setLocation ( txtFiltro.getLocationOnScreen ().x + txtFiltro.getSize ().width , txtFiltro.getLocationOnScreen ().y - 1 );
    }//GEN-LAST:event_txtFiltroFocusGained

    private void txtFiltroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroFocusLost
        pop.setVisible ( false );
    }//GEN-LAST:event_txtFiltroFocusLost

    private void txtFiltroVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_txtFiltroVetoableChange
        cargarClientes ();
    }//GEN-LAST:event_txtFiltroVetoableChange

    private void txtFiltroCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFiltroCaretUpdate
        cargarClientes ();
    }//GEN-LAST:event_txtFiltroCaretUpdate

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        DialogCliente dialog = new DialogCliente ( new javax.swing.JFrame () , true , "AGREGAR CLIENTE" , this.manager , lClientes.getSelectedValue () );
        dialog.setVisible ( true );
        cargarClientes ();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltroMouseClicked
        pop = new JPopupMenu ();
        keyboard = new JKeyboardPane ( txtFiltro );
        pop.add ( keyboard );
        pop.setVisible ( true );
        pop.setLocation ( txtFiltro.getLocationOnScreen ().x + txtFiltro.getSize ().width , txtFiltro.getLocationOnScreen ().y - 1 );
    }//GEN-LAST:event_txtFiltroMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.ButtonGroup grupoVenta;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<ModeloCliente> lClientes;
    private javax.swing.JPanel pCategorias;
    private javax.swing.JPanel pVenta;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    private void cargarClientes () {
        dlmClientes.clear ();
        Condition condition = CLIENTE.NOMBRE.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
        try {
            manager.getClienteDAO ().obtenerLista ( condition ).forEach ( cliente -> {
                dlmClientes.addElement ( cliente );
            } );
        } catch ( Exception ex ) {
            Logger.getLogger ( PanelClientes.class.getName () ).log ( Level.SEVERE , null , ex );
        }
        if ( !dlmClientes.isEmpty () ) {
            lClientes.setSelectedIndex ( 0 );
        }
    }

}
