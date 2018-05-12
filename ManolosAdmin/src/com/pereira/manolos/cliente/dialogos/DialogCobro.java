package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloBitacoraCaja;
import com.pereira.manolos.negocio.modelos.ModeloDetalleVenta;
import com.pereira.manolos.negocio.modelos.ModeloInsumo;
import com.pereira.manolos.negocio.modelos.ModeloProducto;
import com.pereira.manolos.negocio.modelos.ModeloPromocion;
import com.pereira.manolos.negocio.modelos.ModeloReceta;
import com.pereira.manolos.negocio.modelos.ModeloVenta;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.SpinnerUI;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jooq.Condition;

import static com.pereira.manolos.datos.database.Tables.DETALLE_PROMOCION;
import static com.pereira.manolos.datos.database.Tables.DETALLE_RECETA;

@SuppressWarnings ( "serial" )
public class DialogCobro extends javax.swing.JDialog {

    private final DAOManager manager;
    private final ModeloVenta venta;
    private final List<ModeloDetalleVenta> detalle;
    private final DialogVenta pv;

    public DialogCobro ( java.awt.Frame parent , boolean modal , DAOManager manager , ModeloVenta venta , List<ModeloDetalleVenta> detalle ,
                         DialogVenta pv ) {
        super ( parent , modal );
        this.manager = manager;
        this.venta = venta;
        this.detalle = detalle;
        this.pv = pv;
        initComponents ();
        this.setLocationRelativeTo ( null );
        cargarForm ();
    }

    private void cargarForm () {
        double sumaG = 0;
        double sumaE = 0;
        double sumaNS = 0;
        for ( int i = 0 ; i < detalle.size () ; i++ ) {
            switch ( detalle.get ( i ).getTipo () ) {
                case "G":
                    sumaG += detalle.get ( i ).getPrecio ().doubleValue () * detalle.get ( i ).getCantidad ();
                    break;
                case "E":
                    sumaE += detalle.get ( i ).getPrecio ().doubleValue () * detalle.get ( i ).getCantidad ();
                    break;
                default:
                    sumaNS += detalle.get ( i ).getPrecio ().doubleValue () * detalle.get ( i ).getCantidad ();
                    break;
            }
        }
        lblGravado.setText ( String.format ( "%.2f" , sumaG ) );
        lblExento.setText ( String.format ( "%.2f" , sumaE ) );
        lblNosujeto.setText ( String.format ( "%.2f" , sumaNS ) );
        lblTotal.setText ( ( String.format ( "%.2f" , venta.getTotal ().doubleValue () ) ) );
        lblCambio.setText ( getCambio () );
    }

    private String getCambio () {
        double total = venta.getTotal ().doubleValue ();
        double recibido = ( double ) sprEfectivo.getValue ();
        return String.format ( "%.2f" , ( total - recibido ) * -1 );
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblGravado = new javax.swing.JLabel();
        lblExento = new javax.swing.JLabel();
        lblNosujeto = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblCambio = new javax.swing.JLabel();
        sprEfectivo = new javax.swing.JSpinner();
        btnPADEfectivo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnPrint = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(139, 195, 74));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 75));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 75));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Cobro");
        jPanel2.add(jLabel1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Gravado: ($)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        jPanel3.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Exento: ($)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel3.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("No Sujeto: ($)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel3.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Total: ($)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel3.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Recibido: ($)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel3.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Cambio: ($)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        jPanel3.add(jLabel12, gridBagConstraints);

        lblGravado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblGravado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGravado.setText("Saldo Inicial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel3.add(lblGravado, gridBagConstraints);

        lblExento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblExento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblExento.setText("Saldo Inicial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel3.add(lblExento, gridBagConstraints);

        lblNosujeto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNosujeto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNosujeto.setText("Saldo Inicial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel3.add(lblNosujeto, gridBagConstraints);

        lblTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotal.setText("Saldo Inicial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel3.add(lblTotal, gridBagConstraints);

        lblCambio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCambio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCambio.setText("Saldo Inicial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel3.add(lblCambio, gridBagConstraints);

        sprEfectivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sprEfectivo.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 5.0d));
        sprEfectivo.setMinimumSize(new java.awt.Dimension(60, 40));
        sprEfectivo.setPreferredSize(new java.awt.Dimension(60, 40));
        sprEfectivo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sprEfectivoStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(sprEfectivo, gridBagConstraints);
        sprEfectivo.setUI(new SpinnerUI(Color.WHITE,new Color(139, 195, 74),Color.BLACK));

        btnPADEfectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_pad_normal.png"))); // NOI18N
        btnPADEfectivo.setBorder(null);
        btnPADEfectivo.setBorderPainted(false);
        btnPADEfectivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPADEfectivo.setFocusPainted(false);
        btnPADEfectivo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_pad_pressed.png"))); // NOI18N
        btnPADEfectivo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_pad_over.png"))); // NOI18N
        btnPADEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPADEfectivoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(btnPADEfectivo, gridBagConstraints);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridBagLayout());

        btnPrint.setText("Imprimir");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        jPanel4.add(btnPrint, gridBagConstraints);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        jPanel4.add(btnCancelar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel3.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sprEfectivoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sprEfectivoStateChanged
        //txtDiferencia.setText ( "" + carlcularDiferencia () );
        lblCambio.setText ( getCambio () );
    }//GEN-LAST:event_sprEfectivoStateChanged

    private void btnPADEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPADEfectivoActionPerformed
        /*DialogNumPad dialog = new DialogNumPad ( new javax.swing.JFrame () , true );
        dialog.setVisible ( true );
        double numeroRecibido = dialog.getNumero ();
        if ( numeroRecibido > 0 ) {
            sprEfectivo.setValue ( numeroRecibido );
        }*/
    }//GEN-LAST:event_btnPADEfectivoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        double cambio = Double.parseDouble ( lblCambio.getText () );
        if ( cambio < 0 ) {
            Mensajes.mensajeAlert ( "Recibido es menor que total, verificar..." );
        } else {
            venta.setFecha ( new Date () );
            venta.setGravado ( new BigDecimal ( lblGravado.getText () ) );
            venta.setExento ( new BigDecimal ( lblExento.getText () ) );
            venta.setNosujeto ( new BigDecimal ( lblNosujeto.getText () ) );
            try {
                /*INGRESO DE LA VENTA*/
                if ( venta.getTipoventa ().equals ( "DOMICILIO" ) ) {
                    manager.getVentaDAO ().insertar ( venta );
                } else if ( venta.getTotal ().doubleValue () >= 200 ) {
                    manager.getVentaDAO ().insertar ( venta );
                } else {
                    manager.getVentaDAO ().insertarSinCliente ( venta );
                }
                /*AGREGANDO EL DETALLE DE LA VENTA*/
                detalle.forEach ( d -> {
                    try {
                        d.setVenta ( venta );
                        manager.getDetalleVentaDAO ().insertar ( d );
                        descontarInventario ( d );
                    } catch ( Exception ex ) {
                        LOG.log ( Level.SEVERE , null , ex );
                    }
                } );
                /*INGRESO A LA BITACORA DE LA CAJA*/
                ModeloBitacoraCaja vVenta = new ModeloBitacoraCaja ( venta.getResolucion ().getCaja () , venta.getEmpleado ().getNombre () ,
                                                                     new Date () ,
                                                                     "VENTA" , new BigDecimal ( lblTotal.getText () ) , "VENTA SEGUN TICKET #: "
                                                                                                                        + venta.getNumerofactura () );
                manager.getBitacoraDAO ().insertar ( vVenta );
                /*IMPRESION DE EL TICKET CORRESPONDIENTE*/
                if ( venta.getTipoventa ().equals ( "DOMICILIO" ) ) {
                    //manager.getReportes ().tktVentaDomicilio ( venta );
                } else if ( venta.getTotal ().doubleValue () >= 200 ) {
                    //manager.getReportes ().tktVenta200 ( venta );
                } else {
                    //manager.getReportes ().tktVenta ( venta );
                }
                /*ACTUALIZANDO LA RESOLUCION*/
                venta.getResolucion ().setTktactual ( venta.getResolucion ().getTktactual () + 1 );
                if ( venta.getResolucion ().getTktactual () == venta.getResolucion ().getTktfinal () ) {
                    venta.getResolucion ().setActiva ( false );
                } else if ( venta.getResolucion ().getTktactual () >= ( venta.getResolucion ().getTktfinal () - venta.getResolucion ().getTktalerta () ) ) {
                    Mensajes.mensajeAlert (
                            "La resolución tiene: " + ( venta.getResolucion ().getTktfinal () - venta.getResolucion ().getTktactual () )
                            + " transacciones disponibles\n contactar con Administrador" );
                }
                manager.getResolucionDAO ().modificar ( venta.getResolucion () );
                /*VERICANDO RESOLUCION*/
                if ( venta.getResolucion ().getTktactual () == venta.getResolucion ().getTktfinal () ) {
                    Mensajes.mensajeAlert ( "Resolución terminada, informe al Administrador!" );
                    pv.cerrarPanel ();
                } else if ( venta.getResolucion ().isActiva () ) {
                    int x = Mensajes.mensajeSiNo ( "Venta Realizada Satisfactoriamente\n Desea Realizar Otra Venta?" );
                    if ( x == 1 ) {
                        pv.cerrarPanel ();
                    } else {
                        pv.reiniciarVenta ();
                    }
                }

            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
            } finally {
                dispose ();
            }
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPADEfectivo;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCambio;
    private javax.swing.JLabel lblExento;
    private javax.swing.JLabel lblGravado;
    private javax.swing.JLabel lblNosujeto;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner sprEfectivo;
    // End of variables declaration//GEN-END:variables

    private static final Logger LOG = Logger.getLogger ( DialogCobro.class.getName () );

    private void descontarInventario ( ModeloDetalleVenta detalle ) throws Exception {
        if ( detalle.isPromo () ) {
            descontarPromocion ( detalle.getPromocion () , detalle.getCantidad () );
        } else {
            switch ( detalle.getProducto ().getTipo () ) {
                case "U":
                    //descontar directamente de insumos
                    descontarInsumo ( detalle.getProducto ().getInsumo () , detalle.getCantidad () , detalle.getProducto ().getDescuento () );
                    break;
                case "C":
                    //descontar de la receta
                    descontarReceta ( detalle.getProducto ().getReceta () , detalle.getCantidad () , detalle.getProducto ().getDescuento () );
                    break;
                case "P":
                    descontarPorciones ( detalle.getProducto () , detalle.getCantidad () );
                    break;
            }
        }
    }

    private void descontarInsumo ( ModeloInsumo insumo , int cantidad , double descuento ) throws Exception {
        double stock = insumo.getStock () - ( cantidad * descuento );
        insumo.setStock ( stock );
        manager.getInsumoDAO ().modificar ( insumo );
    }

    private void descontarReceta ( ModeloReceta receta , int cantidad , double descuento ) throws Exception {
        Condition c = DETALLE_RECETA.IDRECETA.eq ( receta.getIdreceta () );
        manager.getDetalleRecetaDAO ().obtenerLista ( c ).forEach ( dReceta -> {
            if ( dReceta.getTipo ().equals ( "INSUMO" ) ) {
                try {
                    descontarInsumo ( dReceta.getIngredienteInsumo () , cantidad , dReceta.getDescargo () * descuento );
                } catch ( Exception ex ) {
                    LOG.log ( Level.SEVERE , null , ex );
                }
            } else {
                double stock = dReceta.getIngredienteReceta ().getStock ();
                stock -= ( cantidad * descuento );
                dReceta.getIngredienteReceta ().setStock ( stock );
                try {
                    manager.getRecetaDAO ().modificar ( dReceta.getIngredienteReceta () );
                } catch ( Exception ex ) {
                    LOG.log ( Level.SEVERE , null , ex );
                }
            }
        } );

    }

    private void descontarPorciones ( ModeloProducto producto , int cantidad ) throws Exception {
        double tengo = producto.getStock ();
        System.out.println ( "tengo1: " + tengo );
        tengo -= ( double ) cantidad;
        System.out.println ( "tengo: " + tengo );
        producto.setStock ( tengo );
        manager.getProductoDAO ().modificar ( producto );
    }

    private void descontarPromocion ( ModeloPromocion promo , int cantidad ) throws Exception {
        Condition c = DETALLE_PROMOCION.IDPROMOCION.eq ( promo.getIdpromocion () );
        manager.getDetallePromocionDAO ().obtenerLista ( c ).forEach ( detalle -> {
            switch ( detalle.getProducto ().getTipo () ) {
                case "U": {
                    try {
                        descontarInsumo ( detalle.getProducto ().getInsumo () , detalle.getCantidad () * cantidad , detalle.getProducto ().
                                          getDescuento () );
                    } catch ( Exception ex ) {
                        Logger.getLogger ( DialogCobro.class.getName () ).log ( Level.SEVERE , null , ex );
                    }
                }
                break;
                case "C": {
                    try {
                        descontarReceta ( detalle.getProducto ().getReceta () , detalle.getCantidad () * cantidad , detalle.getProducto ().
                                          getDescuento () );
                    } catch ( Exception ex ) {
                        Logger.getLogger ( DialogCobro.class.getName () ).log ( Level.SEVERE , null , ex );
                    }
                }
                break;
                case "P": {
                    try {
                        descontarPorciones ( detalle.getProducto () , detalle.getCantidad () );
                    } catch ( Exception ex ) {
                        Logger.getLogger ( DialogCobro.class.getName () ).log ( Level.SEVERE , null , ex );
                    }
                }
                break;
            }
        } );
    }
}
