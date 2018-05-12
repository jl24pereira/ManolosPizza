package com.pereira.manolos.cliente.dialogs;

//import com.pereira.clientes.DialogCliente;
import com.pereira.manolos.cliente.listarenderer.ClienteRenderer;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCliente;
import com.pereira.manolos.util.JKeyboardPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JPopupMenu;
import org.jooq.Condition;

import static com.pereira.manolos.datos.database.Tables.CLIENTE;

/* @author Jose Luis */
public class DialogSeleccionCliente extends javax.swing.JDialog {

    private final DAOManager manager;
    private DefaultListModel<ModeloCliente> dlmClientes = new DefaultListModel<> ();
    private JPopupMenu pop;
    private JKeyboardPane keyboard;
    private ModeloCliente cliente = null;

    public DialogSeleccionCliente ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager ) {
        super ( parent , modal );
        initComponents ();
        lClientes.setCellRenderer ( new ClienteRenderer () );
        btnGuardar.requestFocus ();
        this.manager = manager;
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
        listarClientes ();
        lClientes.setModel ( dlmClientes );
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pMain = new javax.swing.JPanel();
        pFormulario = new javax.swing.JPanel();
        lblMovimiento = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtFiltro = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        pCategorias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lClientes = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 650));
        setPreferredSize(new java.awt.Dimension(400, 650));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(java.awt.Color.white);
        pMain.setLayout(new java.awt.GridBagLayout());

        pFormulario.setBackground(new java.awt.Color(255, 255, 255));
        pFormulario.setMinimumSize(new java.awt.Dimension(400, 600));
        pFormulario.setPreferredSize(new java.awt.Dimension(400, 600));
        pFormulario.setLayout(new java.awt.GridBagLayout());

        lblMovimiento.setBackground(new java.awt.Color(139, 195, 74));
        lblMovimiento.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblMovimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMovimiento.setText("Selección de Cliente");
        lblMovimiento.setOpaque(true);
        lblMovimiento.setPreferredSize(new java.awt.Dimension(212, 70));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pFormulario.add(lblMovimiento, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(197, 225, 165));
        jPanel2.setLayout(new java.awt.GridBagLayout());

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
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(txtFiltro, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pFormulario.add(jPanel2, gridBagConstraints);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        pCategorias.setMinimumSize(new java.awt.Dimension(100, 100));
        pCategorias.setOpaque(false);
        pCategorias.setPreferredSize(new java.awt.Dimension(100, 100));
        pCategorias.setRequestFocusEnabled(false);
        pCategorias.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

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
        pCategorias.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(pCategorias, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pFormulario.add(jPanel1, gridBagConstraints);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_seleccionar_normal.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        jPanel3.add(btnGuardar, gridBagConstraints);

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_cancelar_normal.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        jPanel3.add(btnCancelar, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        jPanel3.add(btnAgregar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        pFormulario.add(jPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pMain.add(pFormulario, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(pMain, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lClientesValueChanged

    }//GEN-LAST:event_lClientesValueChanged

    private void txtFiltroCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFiltroCaretUpdate
        listarClientes ();
    }//GEN-LAST:event_txtFiltroCaretUpdate

    private void txtFiltroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroFocusGained
        pop = new JPopupMenu ();
        keyboard = new JKeyboardPane ( txtFiltro );
        pop.add ( keyboard );
        this.setModal ( false );
        pop.setVisible ( true );
        pop.setLocation ( ( ( txtFiltro.getSize ().width ) / 2 ) + ( ( keyboard.getSize ().width ) / 2 ) ,
                          txtFiltro.getLocationOnScreen ().y + txtFiltro.getSize ().height );
    }//GEN-LAST:event_txtFiltroFocusGained

    private void txtFiltroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroFocusLost
        pop.setVisible ( false );
        this.setModal ( true );
    }//GEN-LAST:event_txtFiltroFocusLost

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        listarClientes ();
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if ( !lClientes.isSelectionEmpty () ) {
            this.cliente = lClientes.getSelectedValue ();
            dispose ();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        this.setModal ( false );
        DialogCliente dialog = new DialogCliente ( new javax.swing.JFrame () , true , "AGREGAR CLIENTE" , this.manager );
        dialog.setVisible ( true );
        listarClientes ();
        this.setModal ( true );
    }//GEN-LAST:event_btnAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<ModeloCliente> lClientes;
    private javax.swing.JLabel lblMovimiento;
    private javax.swing.JPanel pCategorias;
    private javax.swing.JPanel pFormulario;
    private javax.swing.JPanel pMain;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    private void listarClientes () {
        dlmClientes.clear ();
        Condition condition = CLIENTE.NOMBRE.likeIgnoreCase ( "%" + txtFiltro.getText () + "%" );
        try {
            manager.getClienteDAO ().obtenerLista ( condition ).forEach ( ( cliente ) -> {
                dlmClientes.addElement ( cliente );
            } );
        } catch ( Exception ex ) {
            Logger.getLogger ( DialogSeleccionCliente.class.getName () ).log ( Level.SEVERE , null , ex );
        }
    }

    /**
     * @return the cliente
     */
    public ModeloCliente getCliente () {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente ( ModeloCliente cliente ) {
        this.cliente = cliente;
    }
    private static final Logger LOG = Logger.getLogger ( DialogSeleccionCliente.class.getName () );

}
