package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCompra;
import com.pereira.manolos.util.CellRenderer;
import com.pereira.manolos.util.Fechero;
import com.pereira.manolos.util.HeaderCellRenderer;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI900;

/* @author Jose Luis */
@SuppressWarnings ( "serial" )
public class DialogDetalleCompra extends javax.swing.JDialog {

    private final DAOManager manager;
    private final ModeloCompra compra;
    private double abonos = 0;

    private boolean pagado = false;

    private final DefaultTableModel dtmDetalle;

    public DialogDetalleCompra ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager , ModeloCompra compra ) {
        super ( parent , modal );
        this.manager = manager;
        this.compra = compra;
        initComponents ();
        dtmDetalle = ( DefaultTableModel ) tDetalle.getModel ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
        dibujarTablaFacturas ();
        cargarForm ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pBody = new javax.swing.JPanel();
        pProveedor = new javax.swing.JPanel();
        lblProveedor = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        lblCondicion = new javax.swing.JLabel();
        txtCondicion = new javax.swing.JLabel();
        lblDocumento = new javax.swing.JLabel();
        txtDoc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDetalle = new javax.swing.JTable();
        pFoot = new javax.swing.JPanel();
        lblTotalFactura = new javax.swing.JLabel();
        txtTotalFactura = new javax.swing.JLabel();
        lblTotalPagos = new javax.swing.JLabel();
        txtTotalPagos = new javax.swing.JLabel();
        lblPendiente = new javax.swing.JLabel();
        txtPendiente = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(450, 600));
        setPreferredSize(new java.awt.Dimension(450, 600));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pBody.setBackground(colorBG);
        pBody.setLayout(new java.awt.GridBagLayout());

        pProveedor.setBackground(colorUI);
        pProveedor.setLayout(new java.awt.GridBagLayout());

        lblProveedor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblProveedor.setForeground(colorBG);
        lblProveedor.setText("Proveedor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pProveedor.add(lblProveedor, gridBagConstraints);

        txtProveedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtProveedor.setForeground(colorBG);
        txtProveedor.setText("nombre del proveedor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pProveedor.add(txtProveedor, gridBagConstraints);

        lblFecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFecha.setForeground(colorBG);
        lblFecha.setText("Fecha compra:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pProveedor.add(lblFecha, gridBagConstraints);

        txtFecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFecha.setForeground(colorBG);
        txtFecha.setText("fecha de compra");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pProveedor.add(txtFecha, gridBagConstraints);

        lblCondicion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCondicion.setForeground(colorBG);
        lblCondicion.setText("Condicion de pago:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pProveedor.add(lblCondicion, gridBagConstraints);

        txtCondicion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCondicion.setForeground(colorBG);
        txtCondicion.setText("credito o contado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pProveedor.add(txtCondicion, gridBagConstraints);

        lblDocumento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDocumento.setForeground(colorBG);
        lblDocumento.setText("Documento #:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pProveedor.add(lblDocumento, gridBagConstraints);

        txtDoc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDoc.setForeground(colorBG);
        txtDoc.setText("000000000x");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pProveedor.add(txtDoc, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pBody.add(pProveedor, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Detalle de Factura");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pBody.add(jLabel2, gridBagConstraints);

        tDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cantidad", "Detalle", "Precio", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tDetalle.setRowHeight(30);
        tDetalle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tDetalle);
        if (tDetalle.getColumnModel().getColumnCount() > 0) {
            tDetalle.getColumnModel().getColumn(0).setMinWidth(70);
            tDetalle.getColumnModel().getColumn(0).setPreferredWidth(70);
            tDetalle.getColumnModel().getColumn(0).setMaxWidth(70);
            tDetalle.getColumnModel().getColumn(2).setMinWidth(70);
            tDetalle.getColumnModel().getColumn(2).setPreferredWidth(70);
            tDetalle.getColumnModel().getColumn(2).setMaxWidth(70);
            tDetalle.getColumnModel().getColumn(3).setMinWidth(70);
            tDetalle.getColumnModel().getColumn(3).setPreferredWidth(70);
            tDetalle.getColumnModel().getColumn(3).setMaxWidth(70);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pBody.add(jScrollPane1, gridBagConstraints);

        pFoot.setOpaque(false);
        pFoot.setLayout(new java.awt.GridBagLayout());

        lblTotalFactura.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTotalFactura.setText("Total en Factura:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pFoot.add(lblTotalFactura, gridBagConstraints);

        txtTotalFactura.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtTotalFactura.setText("$.....");
        txtTotalFactura.setMinimumSize(new java.awt.Dimension(75, 30));
        txtTotalFactura.setPreferredSize(new java.awt.Dimension(75, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pFoot.add(txtTotalFactura, gridBagConstraints);

        lblTotalPagos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTotalPagos.setText("Total en Pagos:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pFoot.add(lblTotalPagos, gridBagConstraints);

        txtTotalPagos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtTotalPagos.setText("$......");
        txtTotalPagos.setMinimumSize(new java.awt.Dimension(75, 30));
        txtTotalPagos.setPreferredSize(new java.awt.Dimension(75, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pFoot.add(txtTotalPagos, gridBagConstraints);

        lblPendiente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPendiente.setText("Pendiente:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pFoot.add(lblPendiente, gridBagConstraints);

        txtPendiente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPendiente.setText("$........");
        txtPendiente.setMinimumSize(new java.awt.Dimension(75, 30));
        txtPendiente.setPreferredSize(new java.awt.Dimension(75, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pFoot.add(txtPendiente, gridBagConstraints);

        txtEstado.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        txtEstado.setText("CANCELADO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 10, 10);
        pFoot.add(txtEstado, gridBagConstraints);

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setText("Salir");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setMaximumSize(new java.awt.Dimension(100, 40));
        btnCancelar.setMinimumSize(new java.awt.Dimension(100, 40));
        btnCancelar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pFoot.add(btnCancelar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        pFoot.add(jSeparator2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pBody.add(pFoot, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(pBody, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose ();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCondicion;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblPendiente;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblTotalFactura;
    private javax.swing.JLabel lblTotalPagos;
    private javax.swing.JPanel pBody;
    private javax.swing.JPanel pFoot;
    private javax.swing.JPanel pProveedor;
    private javax.swing.JTable tDetalle;
    private javax.swing.JLabel txtCondicion;
    private javax.swing.JLabel txtDoc;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtPendiente;
    private javax.swing.JLabel txtProveedor;
    private javax.swing.JLabel txtTotalFactura;
    private javax.swing.JLabel txtTotalPagos;
    // End of variables declaration//GEN-END:variables

    private void cargarForm () {
        txtProveedor.setText ( compra.getProveedor ().getNombre () );
        txtDoc.setText ( compra.getNumeroDocumento () );
        txtFecha.setText ( Fechero.dateToString ( compra.getFecha () ) );
        txtCondicion.setText ( compra.getTipoDocumento () );
        cargarTablaDetalle ();
        txtTotalFactura.setText ( "$ " + compra.getTotal ().toString () );
        compra.getAbonos ().forEach ( abono -> {
            abonos += abono.getPago ().doubleValue ();
        } );
        txtTotalPagos.setText ( "$ " + abonos );
        txtPendiente.setText ( "$ " + ( compra.getTotal ().doubleValue () - abonos ) );
        if ( compra.getTotal ().doubleValue () == abonos ) {
            txtEstado.setForeground ( java.awt.Color.GREEN );
            txtEstado.setText ( "CANCELADA" );
        } else {
            txtEstado.setForeground ( java.awt.Color.RED );
            txtEstado.setText ( "PENDIENTE" );
        }
    }

    private void cargarTablaDetalle () {
        for ( int i = 0 ; i < tDetalle.getRowCount () ; i++ ) {
            dtmDetalle.removeRow ( i );
            i -= 1;
        }
        compra.getDetalle ().forEach ( detalle -> {
            Object[] row = { detalle.getCantidad () , detalle.getInsumo ().getNombre () , "$ " + detalle.getPrecio () ,
                             "$ " + String.format ( "%.4f" , ( detalle.getCantidad () * detalle.getPrecio ().doubleValue () ) ) };
            dtmDetalle.addRow ( row );
        } );
    }

    private void dibujarTablaFacturas () {
        tDetalle.setGridColor ( colorUI );

        JTableHeader jtableHeader = tDetalle.getTableHeader ();
        jtableHeader.setDefaultRenderer ( new HeaderCellRenderer ( colorUI900 ) );
        tDetalle.setTableHeader ( jtableHeader );
        tDetalle.getColumnModel ().getColumn ( 0 ).setCellRenderer ( new CellRenderer ( "text center" , colorUI ) );
        tDetalle.getColumnModel ().getColumn ( 1 ).setCellRenderer ( new CellRenderer ( "text" , colorUI ) );
        tDetalle.getColumnModel ().getColumn ( 2 ).setCellRenderer ( new CellRenderer ( "num" , colorUI ) );
        tDetalle.getColumnModel ().getColumn ( 3 ).setCellRenderer ( new CellRenderer ( "precio" , colorUI ) );
        tDetalle.repaint ();
    }

    private static final Logger LOG = Logger.getLogger ( DialogDetalleCompra.class.getName () );

}
