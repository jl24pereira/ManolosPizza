package com.pereira.manolos.cliente.main;

import com.mrlonee.swing.animation.AnimatedPanel;
import com.pereira.manolos.cliente.dialogs.DialogCaja;
import com.pereira.manolos.cliente.dialogs.DialogPropiedades;
import com.pereira.manolos.cliente.panels.PanelClientes;
import com.pereira.manolos.cliente.panels.PanelCocina;
import com.pereira.manolos.cliente.panels.PanelVenta;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCaja;
import com.pereira.manolos.negocio.modelos.ModeloPermisos;
import com.pereira.manolos.negocio.modelos.ModeloUsuario;
import com.pereira.manolos.util.AgregarPanel;
import com.pereira.manolos.util.DialogPassPad;
import com.pereira.manolos.util.Mensajes;
import com.pereiracomputerservices.milancho.Reloj;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.Principal.pBody;
import static com.pereira.manolos.datos.database.Tables.PERMISOS;

/**
 *
 * @author Jose Luis
 */
public class PanelInicio extends AnimatedPanel {

    private final DAOManager manager;
    private final AgregarPanel agregar = new AgregarPanel ();

    public PanelInicio ( DAOManager manager ) {
        this.manager = manager;
        initComponents ();
        new Reloj ( lblFecha , false , true , true , false );
        new Reloj ( lblDia , true , false , false , false );
        new Reloj ( lblReloj , false , false , false , true );
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btnCaja = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnCocina = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnConexion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(139, 195, 74));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnCaja.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_caja_normal.png"))); // NOI18N
        btnCaja.setBorder(null);
        btnCaja.setBorderPainted(false);
        btnCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaja.setFocusPainted(false);
        btnCaja.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_caja_pressed.png"))); // NOI18N
        btnCaja.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_caja_over.png"))); // NOI18N
        btnCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 25, 10, 25);
        jPanel1.add(btnCaja, gridBagConstraints);

        btnVenta.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_venta_normal.png"))); // NOI18N
        btnVenta.setBorder(null);
        btnVenta.setBorderPainted(false);
        btnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenta.setFocusPainted(false);
        btnVenta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_venta_pressed.png"))); // NOI18N
        btnVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_venta_over.png"))); // NOI18N
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 25, 10, 25);
        jPanel1.add(btnVenta, gridBagConstraints);

        btnCocina.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnCocina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_cocina_normal.png"))); // NOI18N
        btnCocina.setBorder(null);
        btnCocina.setBorderPainted(false);
        btnCocina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCocina.setFocusPainted(false);
        btnCocina.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_cocina_pressed.png"))); // NOI18N
        btnCocina.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_cocina_over.png"))); // NOI18N
        btnCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCocinaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 25, 10, 25);
        jPanel1.add(btnCocina, gridBagConstraints);

        btnClientes.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_clientes_normal.png"))); // NOI18N
        btnClientes.setBorder(null);
        btnClientes.setBorderPainted(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setFocusPainted(false);
        btnClientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_clientes_pressed.png"))); // NOI18N
        btnClientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_clientes_over.png"))); // NOI18N
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 25, 10, 25);
        jPanel1.add(btnClientes, gridBagConstraints);

        btnSalir.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_salir_normal.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_salir_pressed.png"))); // NOI18N
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_salir_over.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 25, 20, 25);
        jPanel1.add(btnSalir, gridBagConstraints);

        btnConexion.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnConexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_conexion_normal.png"))); // NOI18N
        btnConexion.setBorder(null);
        btnConexion.setBorderPainted(false);
        btnConexion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConexion.setFocusPainted(false);
        btnConexion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_conexion_pressed.png"))); // NOI18N
        btnConexion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/button_conexion_over.png"))); // NOI18N
        btnConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConexionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 25, 10, 25);
        jPanel1.add(btnConexion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        add(jPanel1, gridBagConstraints);

        jPanel2.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanel2.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        lblFecha.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(139, 195, 74));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("DATE");
        lblFecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(100, 0, 0, 0);
        jPanel2.add(lblFecha, gridBagConstraints);

        lblDia.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N
        lblDia.setForeground(new java.awt.Color(139, 195, 74));
        lblDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDia.setText("DIA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(lblDia, gridBagConstraints);

        lblReloj.setBackground(new java.awt.Color(255, 204, 51));
        lblReloj.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(139, 195, 74));
        lblReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReloj.setText("08 : 00 pm");
        lblReloj.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 195, 74), 2, true));
        lblReloj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblReloj.setMaximumSize(new java.awt.Dimension(150, 25));
        lblReloj.setMinimumSize(new java.awt.Dimension(150, 25));
        lblReloj.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 50, 0);
        jPanel2.add(lblReloj, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Calendar 256 green.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        jPanel2.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        add(jPanel2, gridBagConstraints);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 195, 74), 3, true));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(139, 195, 74));
        jLabel2.setText("<html>\n<body align=\"center\">\nPVSYS\n<br>\nManolo's Pizza\n</body>\n</html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        add(jPanel3, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(174, 213, 129));
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 125));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Desarrollado por Pereira Computer Services - 2016");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel4.add(jLabel3, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Av. Fco Rivera # 15 Bo. El Calvario, Osicala, Morazán");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel4.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Tel: 2658-8265");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel4.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        add(jPanel4, gridBagConstraints);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/logo-adelmype.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(139, 195, 74), 3, true), "Con la colaboración de:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 24), new java.awt.Color(139, 195, 74)), javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10))); // NOI18N
        jPanel5.add(jLabel4, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jPanel5, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit ( 0 );
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        String ip = null;
        try {
            ip = InetAddress.getLocalHost ().getHostAddress ();
        } catch ( UnknownHostException ex ) {
            Logger.getLogger ( PanelInicio.class.getName () ).log ( Level.SEVERE , null , ex );
        }
        ModeloCaja caja = null;
        try {
            caja = manager.getCajaDAO ().findByIp ( ip );
            if ( !caja.isBaja () ) {
                Mensajes.mensajeAlert ( "Esta PC no se reconoce como caja, por favor contacte al Administrador" );
            } else if ( caja.isEstado () ) {
                DialogPassPad dialog = new DialogPassPad ( new javax.swing.JFrame () , true );
                dialog.setVisible ( true );
                String pass = dialog.getClave ();
                if ( pass != null ) {
                    if ( manager.getUsuarioDAO ().existeUsuario ( pass ) ) {
                        ModeloUsuario usuario = manager.getUsuarioDAO ().getUsuarioByPass ( pass );
                        Condition condition = PERMISOS.IDEMPLEADO.equal ( usuario.getEmpleado ().getIdempleado () );
                        List<ModeloPermisos> permisos = manager.getPermisoDAO ().obtenerLista ( condition );
                        if ( permisos.get ( 11 ).isPermiso () ) {
                            agregar.insertarPanelMain ( pBody , new PanelVenta ( manager , usuario.getEmpleado () , caja ) );
                        } else {
                            Mensajes.mensajeError ( "Usuario no válido!" );
                        }
                    }
                }
            } else {
                Mensajes.mensajeAlert ( "La caja no esta abierta!" );
            }
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }

    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCocinaActionPerformed
        DialogPassPad dialog = new DialogPassPad ( new javax.swing.JFrame () , true );
        dialog.setVisible ( true );
        String pass = dialog.getClave ();
        if ( pass != null ) {
            try {
                if ( manager.getUsuarioDAO ().existeUsuario ( pass ) ) {
                    ModeloUsuario usuario = manager.getUsuarioDAO ().getUsuarioByPass ( pass );
                    Condition condition = PERMISOS.IDEMPLEADO.equal ( usuario.getEmpleado ().getIdempleado () );
                    List<ModeloPermisos> permisos = manager.getPermisoDAO ().obtenerLista ( condition );
                    if ( permisos.get ( 11 ).isPermiso () ) {
                        agregar.insertarPanelMain ( pBody , new PanelCocina ( manager ) );
                    } else {
                        Mensajes.mensajeAlert ( "Usuario no válido!" );
                    }
                }
            } catch ( Exception ex ) {
                Logger.getLogger ( PanelInicio.class.getName () ).log ( Level.SEVERE , null , ex );
            }
        }
    }//GEN-LAST:event_btnCocinaActionPerformed

    private void btnCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajaActionPerformed
        DialogPassPad dialog = new DialogPassPad ( new javax.swing.JFrame () , true );
        dialog.setVisible ( true );
        String pass = dialog.getClave ();
        if ( pass != null ) {
            try {
                if ( manager.getUsuarioDAO ().existeUsuario ( pass ) ) {
                    ModeloUsuario usuario = manager.getUsuarioDAO ().getUsuarioByPass ( pass );
                    Condition condition = PERMISOS.IDEMPLEADO.equal ( usuario.getEmpleado ().getIdempleado () );
                    List<ModeloPermisos> permisos = manager.getPermisoDAO ().obtenerLista ( condition );
                    if ( permisos.get ( 10 ).isPermiso () ) {
                        DialogCaja dialogCaja = new DialogCaja ( new javax.swing.JFrame () , true , "Control de Caja" , manager ,
                                                                 usuario.getEmpleado () );
                        dialogCaja.setVisible ( true );
                    } else {
                        Mensajes.mensajeAlert ( "No tiene permisos de acceso" );
                    }
                } else {
                    Mensajes.mensajeAlert ( "Usuario no encontrado!" );
                }
            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
                Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            }
        }
    }//GEN-LAST:event_btnCajaActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        DialogPassPad dialog = new DialogPassPad ( new javax.swing.JFrame () , true );
        dialog.setVisible ( true );
        String pass = dialog.getClave ();
        if ( pass != null ) {
            try {
                if ( manager.getUsuarioDAO ().existeUsuario ( pass ) ) {
                    ModeloUsuario usuario = manager.getUsuarioDAO ().getUsuarioByPass ( pass );
                    Condition condition = PERMISOS.IDEMPLEADO.equal ( usuario.getEmpleado ().getIdempleado () );
                    List<ModeloPermisos> permisos = manager.getPermisoDAO ().obtenerLista ( condition );
                    if ( permisos.get ( 11 ).isPermiso () ) {
                        agregar.insertarPanelMain ( pBody , new PanelClientes ( manager ) );
                    } else {
                        Mensajes.mensajeAlert ( "Usuario no válido!" );
                    }
                }
            } catch ( Exception ex ) {
                Logger.getLogger ( PanelInicio.class.getName () ).log ( Level.SEVERE , null , ex );
            }
        }
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConexionActionPerformed
        try {
            DialogPropiedades dialog = new DialogPropiedades ( new javax.swing.JFrame () , true );
            dialog.setVisible ( true );
        } catch ( IOException ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        }
    }//GEN-LAST:event_btnConexionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaja;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCocina;
    private javax.swing.JButton btnConexion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblReloj;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = Logger.getLogger ( PanelInicio.class.getName () );
}
