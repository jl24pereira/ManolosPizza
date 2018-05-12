package com.pereira.manolos.cliente.dialogos;

//import com.pereira.clientes.DialogCliente;
import com.pereira.manolos.cliente.listrenderer.ListaClienteRenderer;
import com.pereira.manolos.cliente.main.InicioSesion;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCliente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.datos.database.Tables.CLIENTE;

/* @author Jose Luis */
public class DialogSeleccionCliente extends javax.swing.JDialog {

    private final DAOManager manager;
    private final DefaultListModel<ModeloCliente> dlmClientes = new DefaultListModel<> ();
    private ModeloCliente cliente = null;

    public DialogSeleccionCliente ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager ) {
        super ( parent , modal );
        initComponents ();
        lClientes.setCellRenderer ( new ListaClienteRenderer () );
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
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pCategorias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lClientes = new javax.swing.JList<>();
        btnGuardar2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 650));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(java.awt.Color.white);
        pMain.setLayout(new java.awt.GridBagLayout());

        pFormulario.setBackground(new java.awt.Color(255, 255, 255));
        pFormulario.setMinimumSize(new java.awt.Dimension(400, 600));
        pFormulario.setPreferredSize(new java.awt.Dimension(400, 600));
        pFormulario.setLayout(new java.awt.GridBagLayout());

        lblMovimiento.setBackground(colorUI
        );
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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(txtFiltro, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Buscar Cliente:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel2.add(jLabel1, gridBagConstraints);

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
        lClientes.setSelectionBackground(colorUI);
        lClientes.setSelectionForeground(InicioSesion.colorBG);
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

        btnGuardar2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_agregar_N.png"))); // NOI18N
        btnGuardar2.setBorder(null);
        btnGuardar2.setBorderPainted(false);
        btnGuardar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_agregar_P.png"))); // NOI18N
        btnGuardar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_agregar_O.png"))); // NOI18N
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pCategorias.add(btnGuardar2, gridBagConstraints);

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

        btnGuardar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_aceptar_N.png"))); // NOI18N
        btnGuardar1.setBorder(null);
        btnGuardar1.setBorderPainted(false);
        btnGuardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_aceptar_P.png"))); // NOI18N
        btnGuardar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_aceptar_O.png"))); // NOI18N
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel3.add(btnGuardar1, gridBagConstraints);

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
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel3.add(btnCancelar1, gridBagConstraints);

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

    }//GEN-LAST:event_txtFiltroFocusGained

    private void txtFiltroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroFocusLost

    }//GEN-LAST:event_txtFiltroFocusLost

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        listarClientes ();
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        if ( !lClientes.isSelectionEmpty () ) {
            this.cliente = lClientes.getSelectedValue ();
            dispose ();
        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        dispose ();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2ActionPerformed
        this.setModal ( false );
        DialogCliente dialog = new DialogCliente ( new javax.swing.JFrame () , true , "AGREGAR CLIENTE" , this.manager );
        dialog.setVisible ( true );
        listarClientes ();
        this.setModal ( true );
    }//GEN-LAST:event_btnGuardar2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnGuardar2;
    private javax.swing.JLabel jLabel1;
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
