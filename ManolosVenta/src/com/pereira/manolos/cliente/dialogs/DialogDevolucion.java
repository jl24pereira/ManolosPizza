package com.pereira.manolos.cliente.dialogs;

import com.pereira.manolos.datos.database.Tables;

import static com.pereira.manolos.datos.database.Tables.VENTA;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloBitacoraCaja;
import com.pereira.manolos.negocio.modelos.ModeloCaja;
import com.pereira.manolos.negocio.modelos.ModeloDetalleVenta;
import com.pereira.manolos.negocio.modelos.ModeloEmpleado;
import com.pereira.manolos.negocio.modelos.ModeloResolucion;
import com.pereira.manolos.negocio.modelos.ModeloVenta;
import com.pereira.manolos.util.CellRenderer;
import com.pereira.manolos.util.Fechero;
import com.pereira.manolos.util.HeaderCellRenderer;
import com.pereira.manolos.util.Mensajes;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.jooq.Condition;

@SuppressWarnings("serial")
public class DialogDevolucion extends javax.swing.JDialog {

    private final DAOManager manager;
    private ModeloVenta venta;
    private final ModeloCaja caja;
    private ModeloResolucion resolucion;
    private List<ModeloDetalleVenta> detalle = new ArrayList<>();
    private List<ModeloVenta> ventas = new ArrayList<>();
    private final DefaultTableModel dtmDetalle;
    private final DefaultTableModel dtmVentas;
    private final ModeloEmpleado empleado;

    public DialogDevolucion(java.awt.Frame parent, boolean modal, DAOManager manager, ModeloCaja caja, ModeloEmpleado empleado) {
        super(parent, modal);
        this.manager = manager;
        this.caja = caja;
        this.empleado = empleado;
        initComponents();
        this.setLocationRelativeTo(null);
        dtmVentas = (DefaultTableModel) tVentas.getModel();
        dtmDetalle = (DefaultTableModel) tDetalle.getModel();
        tVentas.getSelectionModel().addListSelectionListener((ListSelectionEvent pLse) -> {
            if (dtmVentas.getRowCount() > 0) {
                cargarDetalle();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTicket = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDetalle = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tVentas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnDevolucion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 700));
        setMinimumSize(new java.awt.Dimension(600, 700));
        setPreferredSize(new java.awt.Dimension(600, 700));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(139, 195, 74));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 75));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 75));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Buscar Ticket:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jLabel2, gridBagConstraints);

        txtTicket.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(txtTicket, gridBagConstraints);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(btnBuscar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        tDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Descripcion", "P. Unit.", "Total"
            }
        ));
        tDetalle.setRowHeight(30);
        jScrollPane1.setViewportView(tDetalle);
        tDetalle.setGridColor(new Color(51, 105, 30));
        JTableHeader headerDetalle = tDetalle.getTableHeader();
        headerDetalle.setDefaultRenderer(new HeaderCellRenderer(new Color(51, 105, 30)));
        tDetalle.setTableHeader(headerDetalle);
        tDetalle.getColumnModel().getColumn(0).setCellRenderer(new CellRenderer("num", new Color(139, 195, 74)));
        tDetalle.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("text", new Color(139, 195, 74)));
        tDetalle.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer("precio", new Color(139, 195, 74)));
        tDetalle.getColumnModel().getColumn(3).setCellRenderer(new CellRenderer("precio", new Color(139, 195, 74)));
        tDetalle.repaint();

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel3.add(jScrollPane1, gridBagConstraints);

        lblTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        jPanel3.add(lblTotal, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("Detalle:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 0);
        jPanel3.add(jLabel14, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setText("Total ($):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        jPanel3.add(jLabel15, gridBagConstraints);

        tVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "venta", "TKT #", "FECHA", "TOTAL", "CAJA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tVentas.setRowHeight(30);
        jScrollPane2.setViewportView(tVentas);
        if (tVentas.getColumnModel().getColumnCount() > 0) {
            tVentas.getColumnModel().getColumn(0).setMinWidth(0);
            tVentas.getColumnModel().getColumn(0).setPreferredWidth(0);
            tVentas.getColumnModel().getColumn(0).setMaxWidth(0);
            tVentas.getColumnModel().getColumn(3).setResizable(false);
        }
        tVentas.setGridColor(new Color(51, 105, 30));
        JTableHeader jtableHeader = tVentas.getTableHeader();
        jtableHeader.setDefaultRenderer(new HeaderCellRenderer(new Color(51, 105, 30)));
        tVentas.setTableHeader(jtableHeader);
        tVentas.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("text center", new Color(139, 195, 74)));
        tVentas.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer("text center", new Color(139, 195, 74)));
        tVentas.getColumnModel().getColumn(3).setCellRenderer(new CellRenderer("num", new Color(139, 195, 74)));
        tVentas.getColumnModel().getColumn(4).setCellRenderer(new CellRenderer("text", new Color(139, 195, 74)));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        jPanel3.add(jScrollPane2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridBagLayout());

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/BTN_CANCELAR_NORMAL.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel4.add(btnCancelar, gridBagConstraints);

        btnDevolucion.setText("Devolucion");
        btnDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel4.add(btnDevolucion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarTicket();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionActionPerformed
        if (tVentas.getRowCount() > 0 && tVentas.getSelectedRow() >= 0) {
            try {
                venta = (ModeloVenta) tVentas.getValueAt(tVentas.getSelectedRow(), 0);
                venta.setEnletras("DEVOLUCION");
                manager.getVentaDAO().modificar(venta);
                ModeloBitacoraCaja vVenta = new ModeloBitacoraCaja(caja, empleado.getNombre(), new Date(), "DEVOLUCION",
                        new BigDecimal(venta.getTotal().doubleValue() * -1),
                        "DEVOLUCION SEGUN TICKET #: " + venta.getNumerofactura());
                venta.setEnletras(venta.getNumerofactura());
                venta.setFecha(new Date());
                venta.setEmpleado(empleado);
                venta.setNumerofactura(manager.getVentaDAO().getTicket(resolucion));
                venta.setTipoventa("DEVOLUCION");
                venta.setResolucion(resolucion);
                venta.setGravado(new BigDecimal(venta.getGravado().doubleValue() * -1));
                venta.setExento(new BigDecimal(venta.getExento().doubleValue() * -1));
                venta.setNosujeto(new BigDecimal(venta.getNosujeto().doubleValue() * -1));
                venta.setTotal(new BigDecimal(venta.getTotal().doubleValue() * -1));
                manager.getVentaDAO().insertarSinCliente(venta);
                /*AGREGANDO EL DETALLE DE LA VENTA*/
                detalle.forEach(d -> {
                    try {
                        d.setVenta(venta);
                        d.setPrecio(new BigDecimal(d.getPrecio().doubleValue() * -1));
                        manager.getDetalleVentaDAO().insertar(d);
                    } catch (Exception ex) {
                        LOG.log(Level.SEVERE, null, ex);
                    }
                });
                /*INGRESO A LA BITACORA DE LA CAJA*/
                manager.getBitacoraDAO().insertar(vVenta);
                manager.getReportes().tktDevolucion(venta);
                resolucion.setTktactual(resolucion.getTktactual() + 1);
                if (resolucion.getTktactual() == resolucion.getTktfinal()) {
                    resolucion.setActiva(false);
                } else if (venta.getResolucion().getTktactual() >= (resolucion.getTktfinal() - resolucion.getTktalerta())) {
                    Mensajes.mensajeAlert("La resolución tiene: " + (resolucion.getTktfinal() - resolucion.getTktactual())
                            + " transacciones disponibles, contactar con Administrador");
                }
                manager.getResolucionDAO().modificar(resolucion);
            } catch (Exception ex) {
                LOG.log(Level.SEVERE, null, ex);
                Mensajes.mensajeError("Error: " + ex.getMessage());
            } finally {
                dispose();
            }
        } else {
            Mensajes.mensajeAlert("Seleccione una venta para realizar la devolución");
        }
    }//GEN-LAST:event_btnDevolucionActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDevolucion;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tDetalle;
    private javax.swing.JTable tVentas;
    private javax.swing.JTextField txtTicket;
    // End of variables declaration//GEN-END:variables

    private void buscarTicket() {
        if (txtTicket.getText() == null || "".equals(txtTicket.getText())) {
            Mensajes.mensajeAlert("Ingrese numero de ticket!");
        } else {
            Condition ticket = VENTA.NUMEROFACTURA.eq(txtTicket.getText())
                    .and("fecha between CURRENT_TIMESTAMP - CAST('7 days' AS INTERVAL) and CURRENT_TIMESTAMP")
                    .and(VENTA.ENLETRAS.notEqual("DEVOLUCION"));
            try {
                ventas.clear();
                for (int i = 0; i < tVentas.getRowCount(); i++) {
                    dtmVentas.removeRow(i);
                    i -= 1;
                }
                ventas = manager.getVentaDAO().obtenerLista(ticket);
                ventas.forEach(v -> {
                    Object row[] = {v, v.getNumerofactura(), Fechero.dateToString(v.getFecha()), v.getTotal().toString(),
                        v.getResolucion().getCaja().getDetalle()};
                    dtmVentas.addRow(row);
                });
                resolucion = manager.getResolucionDAO().getResolucionByCaja(caja);
            } catch (Exception ex) {
                Logger.getLogger(DialogDevolucion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void cargarDetalle() {
        detalle.clear();
        for (int i = 0; i < tDetalle.getRowCount(); i++) {
            dtmDetalle.removeRow(i);
            i -= 1;
        }
        if (tVentas.getSelectedRow() >= 0) {
            venta = (ModeloVenta) tVentas.getValueAt(tVentas.getSelectedRow(), 0);
            Condition c = Tables.DETALLE_VENTA.IDVENTA.eq(venta.getIdventa());
            try {
                detalle = manager.getDetalleVentaDAO().obtenerLista(c);
                detalle.forEach(d -> {
                    String p = "";
                    if (d.isPromo()) {
                        p = d.getPromocion().getNombre();
                    } else {
                        p = d.getProducto().getNombre();
                    }
                    Object[] row = {d.getCantidad(), p, d.getPrecio(), d.getPrecio().doubleValue() * d.getCantidad()};
                    dtmDetalle.addRow(row);
                });
            } catch (Exception ex) {
                Logger.getLogger(DialogDevolucion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void dibujarTablas() {

        tVentas.getColumnModel().getColumn(0).setCellRenderer(new CellRenderer("text center", new Color(139, 195, 74)));
        tVentas.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("text center", new Color(27, 94, 32)));
        tVentas.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer("text", new Color(27, 94, 32)));
        tVentas.getColumnModel().getColumn(3).setCellRenderer(new CellRenderer("text center", new Color(27, 94, 32)));
        tVentas.getColumnModel().getColumn(4).setCellRenderer(new CellRenderer("caja", new Color(27, 94, 32)));
        tVentas.repaint();

    }

    private static final Logger LOG = Logger.getLogger(DialogDevolucion.class.getName());
}
