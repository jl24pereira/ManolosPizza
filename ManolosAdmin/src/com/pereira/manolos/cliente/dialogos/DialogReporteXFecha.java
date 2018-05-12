package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.negocio.dao.DAOManager;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;

/* @author Jose Luis */
public class DialogReporteXFecha extends javax.swing.JDialog {

    private final DAOManager manager;
    private final int tRep;

    public DialogReporteXFecha ( java.awt.Frame parent , boolean modal , String titulo , int treporte , DAOManager manager ) {
        super ( parent , modal );
        this.manager = manager;
        initComponents ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
        this.tRep = treporte;
        pasarFechas ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblTitulo = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFechaInicial = new com.toedter.calendar.JDateChooser();
        txtFechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(500, 250));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblTitulo.setBackground(colorBG);
        lblTitulo.setLayout(new java.awt.GridBagLayout());

        jPanel5.setMinimumSize(new java.awt.Dimension(400, 201));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(286, 200));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Desde:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        jPanel5.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Hasta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        jPanel5.add(jLabel4, gridBagConstraints);

        txtFechaInicial.setDateFormatString("dd-MM-yyyy");
        txtFechaInicial.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFechaInicial.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel5.add(txtFechaInicial, gridBagConstraints);

        txtFechaFinal.setDateFormatString("dd-MM-yyyy");
        txtFechaFinal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFechaFinal.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel5.add(txtFechaFinal, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e192(0)_128.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel5.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        lblTitulo.add(jPanel5, gridBagConstraints);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnGuardar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_aceptar_N.png"))); // NOI18N
        btnGuardar1.setBorder(null);
        btnGuardar1.setBorderPainted(false);
        btnGuardar1.setContentAreaFilled(false);
        btnGuardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_aceptar_P.png"))); // NOI18N
        btnGuardar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_aceptar_O.png"))); // NOI18N
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 10, 20);
        jPanel1.add(btnGuardar1, gridBagConstraints);

        btnCancelar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_N.png"))); // NOI18N
        btnCancelar1.setBorder(null);
        btnCancelar1.setBorderPainted(false);
        btnCancelar1.setContentAreaFilled(false);
        btnCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_P.png"))); // NOI18N
        btnCancelar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_O.png"))); // NOI18N
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 10, 20);
        jPanel1.add(btnCancelar1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        lblTitulo.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(lblTitulo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        try {
            java.util.Date dateInicio = txtFechaInicial.getDate ();
            java.util.Date dateFinal = txtFechaFinal.getDate ();
            java.sql.Date fechaInicio = new java.sql.Date ( dateInicio.getTime () );
            java.sql.Date fechaFinal = new java.sql.Date ( dateFinal.getTime () );
            this.dispose ();
            switch ( tRep ) {
                case 1:
                    manager.getReportes ().reporteCajasXRango ( fechaInicio , fechaFinal );
                    break;
                case 2:
                    manager.getReportes ().reporteComprasXRango ( fechaInicio , fechaFinal );
                    break;
                case 3:
                    manager.getReportes ().reporteCotizacionesXRango ( fechaInicio , fechaFinal );
                    break;
                case 4:
                    manager.getReportes ().reportePedidosXRango ( fechaInicio , fechaFinal );
                    break;
                case 5:
                    manager.getReportes ().reporteVentasXRango ( fechaInicio , fechaFinal );
                    break;
                case 6:
                    manager.getReportes ().reporteVentasXTipo ( fechaInicio , fechaFinal );
                    break;
                case 7:
                    //manager.getReportes ().reporteUtilidades ( fechaInicio , fechaFinal );
                    break;
            }
        } catch ( Exception ex ) {
            Logger.getLogger ( DialogReporteXFecha.class.getName () ).log ( Level.SEVERE , null , ex );
        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        // TODO add your handling code here:
        dispose ();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel lblTitulo;
    private com.toedter.calendar.JDateChooser txtFechaFinal;
    private com.toedter.calendar.JDateChooser txtFechaInicial;
    // End of variables declaration//GEN-END:variables

    private void pasarFechas () {
        Calendar fechaHoy = Calendar.getInstance ();
        Calendar fechaInicio = Calendar.getInstance ();
        Calendar fechaFinal = Calendar.getInstance ();
        fechaInicio.set ( Calendar.DAY_OF_MONTH , fechaHoy.getActualMinimum ( Calendar.DAY_OF_MONTH ) );
        fechaFinal.set ( Calendar.DAY_OF_MONTH , fechaHoy.getActualMaximum ( Calendar.DAY_OF_MONTH ) );
        txtFechaInicial.setCalendar ( fechaInicio );
        txtFechaFinal.setCalendar ( fechaFinal );
    }

    private void verificarMenor () {
        /*if ( txtFechaInicial.getCalendar ().compareTo ( txtFechaFinal.getCalendar () ) == 1 ) {
            new Mensajes ().mensajeAlert ( "La fecha inicial no puede ser mayor que fecha final" );
            Calendar fechaHoy = Calendar.getInstance ();
            Calendar fechaInicio = Calendar.getInstance ();
            fechaInicio.set ( Calendar.DAY_OF_MONTH , fechaHoy.getActualMinimum ( Calendar.DAY_OF_MONTH ) );
            txtFechaInicial.setCalendar ( fechaInicio );
        }*/
    }

    private void verificarMayor () {
        /*if ( txtFechaInicial.getCalendar ().compareTo ( txtFechaFinal.getCalendar () ) == 1 ) {
            new Mensajes ().mensajeAlert ( "La fecha final no puede ser menor que fecha inicial" );
            Calendar fechaHoy = Calendar.getInstance ();
            Calendar fechaFinal = Calendar.getInstance ();
            fechaFinal.set ( Calendar.DAY_OF_MONTH , fechaHoy.getActualMaximum ( Calendar.DAY_OF_MONTH ) );
            txtFechaFinal.setCalendar ( fechaFinal );
        }*/
    }

    private static final Logger LOG = Logger.getLogger ( DialogReporteXFecha.class.getName () );
}
