package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloEmpresa;
import com.pereira.manolos.util.ImageConverter;
import com.pereira.manolos.util.Mensajes;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;

/*@author JL Desk */
@SuppressWarnings ( "serial" )
public class DialogMiEmpresa extends javax.swing.JDialog {

    private final DAOManager manager;
    private ModeloEmpresa miEmpresa;
    private FileInputStream fis;
    private int longitudBytes;
    private byte[] byteImage;
    private ByteArrayOutputStream bos;
    private File file = null;
    private String NIT;
    private boolean nuevo = false;

    public DialogMiEmpresa ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager ) {
        super ( parent , modal );
        this.manager = manager;
        this.setTitle ( titulo );
        initComponents ();
        this.setLocationRelativeTo ( null );
        cargarInfo ();
        txtNombre.requestFocusInWindow ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pBody = new javax.swing.JPanel();
        pTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        lblPropietario = new javax.swing.JLabel();
        txtPropietario = new javax.swing.JTextField();
        lblGiro = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        txtNrc = new javax.swing.JTextField();
        lblNit = new javax.swing.JLabel();
        txtGiro = new javax.swing.JTextField();
        txtNit = new javax.swing.JFormattedTextField();
        txtTelefono = new javax.swing.JFormattedTextField();
        btnCargarLogo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 525));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pBody.setBackground(colorBG);
        pBody.setMinimumSize(new java.awt.Dimension(100, 100));
        pBody.setPreferredSize(new java.awt.Dimension(100, 100));
        pBody.setLayout(new java.awt.GridBagLayout());

        pTitulo.setBackground(colorUI);
        pTitulo.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(colorBG);
        jLabel1.setText("Mi Empresa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 0);
        pTitulo.add(jLabel1, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/Material Icons_e7ee(0)_64.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        pTitulo.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pBody.add(pTitulo, gridBagConstraints);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setBorder(new javax.swing.border.LineBorder(colorUI, 3, true));
        lblFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblFoto.setMaximumSize(new java.awt.Dimension(250, 250));
        lblFoto.setMinimumSize(new java.awt.Dimension(250, 250));
        lblFoto.setPreferredSize(new java.awt.Dimension(250, 250));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 25);
        jPanel3.add(lblFoto, gridBagConstraints);

        jPanel1.setMinimumSize(new java.awt.Dimension(450, 350));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 350));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setText("(*) Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(lblNombre, gridBagConstraints);

        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setMinimumSize(new java.awt.Dimension(200, 30));
        txtNombre.setPreferredSize(new java.awt.Dimension(200, 30));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txtNombre, gridBagConstraints);

        lblDireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDireccion.setText("(*) Direccion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(lblDireccion, gridBagConstraints);

        txtDireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDireccion.setMinimumSize(new java.awt.Dimension(200, 30));
        txtDireccion.setPreferredSize(new java.awt.Dimension(200, 30));
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txtDireccion, gridBagConstraints);

        lblTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTelefono.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(lblTelefono, gridBagConstraints);

        lblMail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMail.setText("E-Mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(lblMail, gridBagConstraints);

        txtMail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMail.setMinimumSize(new java.awt.Dimension(200, 30));
        txtMail.setPreferredSize(new java.awt.Dimension(120, 30));
        txtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMailKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txtMail, gridBagConstraints);

        lblPropietario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPropietario.setText("Propietario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(lblPropietario, gridBagConstraints);

        txtPropietario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPropietario.setMinimumSize(new java.awt.Dimension(200, 30));
        txtPropietario.setPreferredSize(new java.awt.Dimension(200, 30));
        txtPropietario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPropietarioKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txtPropietario, gridBagConstraints);

        lblGiro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblGiro.setText("(*) NIT:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(lblGiro, gridBagConstraints);

        lblRegistro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRegistro.setText("(*) NRC:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(lblRegistro, gridBagConstraints);

        txtNrc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNrc.setMinimumSize(new java.awt.Dimension(150, 30));
        txtNrc.setPreferredSize(new java.awt.Dimension(150, 30));
        txtNrc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNrcKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txtNrc, gridBagConstraints);

        lblNit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNit.setText("Giro:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        jPanel1.add(lblNit, gridBagConstraints);

        txtGiro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtGiro.setMinimumSize(new java.awt.Dimension(6, 30));
        txtGiro.setPreferredSize(new java.awt.Dimension(6, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txtGiro, gridBagConstraints);

        try {
            txtNit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-######-###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNit.setMinimumSize(new java.awt.Dimension(150, 30));
        txtNit.setPreferredSize(new java.awt.Dimension(150, 30));
        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNitKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txtNit, gridBagConstraints);

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTelefono.setMinimumSize(new java.awt.Dimension(6, 30));
        txtTelefono.setPreferredSize(new java.awt.Dimension(6, 30));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        jPanel1.add(txtTelefono, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(jPanel1, gridBagConstraints);

        btnCargarLogo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCargarLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_imagen_N.png"))); // NOI18N
        btnCargarLogo.setBorder(null);
        btnCargarLogo.setBorderPainted(false);
        btnCargarLogo.setContentAreaFilled(false);
        btnCargarLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargarLogo.setMaximumSize(new java.awt.Dimension(100, 50));
        btnCargarLogo.setMinimumSize(new java.awt.Dimension(100, 50));
        btnCargarLogo.setPreferredSize(new java.awt.Dimension(100, 50));
        btnCargarLogo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_imagen_P.png"))); // NOI18N
        btnCargarLogo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_imagen_O.png"))); // NOI18N
        btnCargarLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarLogoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        jPanel3.add(btnCargarLogo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pBody.add(jPanel3, gridBagConstraints);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_N.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setMaximumSize(new java.awt.Dimension(150, 50));
        btnGuardar.setMinimumSize(new java.awt.Dimension(150, 50));
        btnGuardar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_P.png"))); // NOI18N
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_O.png"))); // NOI18N
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(btnGuardar, gridBagConstraints);

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_N.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFocusable(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setMaximumSize(new java.awt.Dimension(150, 50));
        btnCancelar.setMinimumSize(new java.awt.Dimension(150, 50));
        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_P.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_O.png"))); // NOI18N
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(btnCancelar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        pBody.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(pBody, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if ( isComplete () ) {
            if ( nuevo ) {
                insertarEmpresa ();
            } else {
                modificarEmpresa ();
            }
            nuevo = false;
        } else {
            Mensajes.mensajeAlert ( "Verificar los campos requeridos" );
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCargarLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarLogoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new javax.swing.JFileChooser ();
        chooser.setFileSelectionMode ( JFileChooser.FILES_ONLY );
        FileNameExtensionFilter filtro = new FileNameExtensionFilter ( "JPG" ,
                                                                       "jpg" );
        chooser.setFileFilter ( filtro );
        int res = chooser.showOpenDialog ( DialogMiEmpresa.this );
        if ( res == JFileChooser.APPROVE_OPTION ) {
            file = chooser.getSelectedFile ();
            ImageIcon image = new ImageIcon ( file.getAbsolutePath () );

            Rectangle rect = lblFoto.getBounds ();
            Image scaledImage = image.getImage ().
                    getScaledInstance ( rect.width , rect.height ,
                                        Image.SCALE_DEFAULT );
            image = new ImageIcon ( scaledImage );
            lblFoto.setIcon ( image );
            //System.out.println(file.getAbsolutePath());
            //System.out.println(file.getName());
        }
    }//GEN-LAST:event_btnCargarLogoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose ();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtDireccion.requestFocus ();
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtTelefono.requestFocus ();
        }
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtMail.requestFocus ();
        }
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtMailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtPropietario.requestFocus ();
        }
    }//GEN-LAST:event_txtMailKeyReleased

    private void txtPropietarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPropietarioKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtNit.requestFocus ();
        }
    }//GEN-LAST:event_txtPropietarioKeyReleased

    private void txtNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtNrc.requestFocus ();
        }
    }//GEN-LAST:event_txtNitKeyReleased

    private void txtNrcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNrcKeyReleased
        // TODO add your handling code here:
        if ( evt.getKeyCode () == KeyEvent.VK_ENTER ) {
            txtGiro.requestFocus ();
        }
    }//GEN-LAST:event_txtNrcKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargarLogo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblGiro;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNit;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPropietario;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pBody;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtGiro;
    private javax.swing.JTextField txtMail;
    private javax.swing.JFormattedTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNrc;
    private javax.swing.JTextField txtPropietario;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void cargarInfo () {
        try {
            miEmpresa = manager.getEmpresaDAO ().cargarEmpresa ( 1 );
            if ( miEmpresa == null ) {
                Mensajes.mensajeAlert ( "No hay Empresa Registrada" );
                nuevo = true;
                cargarFotoNoImage ();
            } else {
                txtNombre.setText ( miEmpresa.getNombre () );
                txtDireccion.setText ( miEmpresa.getDireccion () );
                txtTelefono.setText ( miEmpresa.getTelefono () );
                txtMail.setText ( miEmpresa.getEmail () );
                txtPropietario.setText ( miEmpresa.getPropietario () );
                txtGiro.setText ( miEmpresa.getGiro () );
                txtNit.setText ( miEmpresa.getNIT () );
                txtNrc.setText ( miEmpresa.getNRC () );
                ImageIcon image = new ImageIcon ( ImageConverter.byteToImage ( miEmpresa.getLogo () ) );
                Image scaledImage = image.getImage ().getScaledInstance ( 250 , 250 , Image.SCALE_DEFAULT );
                image = new ImageIcon ( scaledImage );
                lblFoto.setIcon ( image );
                nuevo = false;
            }
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            dispose ();
        }
    }

    private void cargarFotoNoImage () {
        file = new File ( "images\\noimage.jpg" );
        ImageIcon image = new ImageIcon ( file.getAbsolutePath () );
        Rectangle rect = lblFoto.getBounds ();
        Image scaledImage = image.getImage ().getScaledInstance ( 250 , 250 , Image.SCALE_DEFAULT );
        image = new ImageIcon ( scaledImage );
        lblFoto.setIcon ( image );
    }

    private void insertarEmpresa () {
        if ( file != null ) {
            try {
                miEmpresa = new ModeloEmpresa (
                        1 ,
                        txtNombre.getText () ,
                        txtDireccion.getText () ,
                        txtTelefono.getText () ,
                        txtMail.getText () ,
                        txtPropietario.getText () ,
                        txtGiro.getText () ,
                        txtNit.getText () ,
                        txtNrc.getText () ,
                        new BigDecimal ( 0.13 ) ,
                        8 ,
                        ImageConverter.imageToByte ( file ) );
                manager.getEmpresaDAO ().insertar ( miEmpresa );
                Mensajes.mensajeOk ( "Empresa registrada satisfactoriamente!" );
            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
                Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            } finally {
                dispose ();
            }
        }
    }

    private void modificarEmpresa () {
        if ( file != null ) {
            try {
                miEmpresa.setNombre ( txtNombre.getText () );
                miEmpresa.setDireccion ( txtDireccion.getText () );
                miEmpresa.setTelefono ( txtTelefono.getText () );
                miEmpresa.setEmail ( txtMail.getText () );
                miEmpresa.setPropietario ( txtPropietario.getText () );
                miEmpresa.setGiro ( txtGiro.getText () );
                miEmpresa.setNIT ( txtNit.getText () );
                miEmpresa.setNRC ( txtNrc.getText () );
                miEmpresa.setLogo ( ImageConverter.imageToByte ( file ) );
                manager.getEmpresaDAO ().modificar ( miEmpresa );
                Mensajes.mensajeOk ( "Empresa editada satisfactoriamente!" );
            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
                Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            } finally {
                dispose ();
            }
        } else {
            try {
                miEmpresa.setNombre ( txtNombre.getText () );
                miEmpresa.setDireccion ( txtDireccion.getText () );
                miEmpresa.setTelefono ( txtTelefono.getText () );
                miEmpresa.setEmail ( txtMail.getText () );
                miEmpresa.setPropietario ( txtPropietario.getText () );
                miEmpresa.setGiro ( txtGiro.getText () );
                miEmpresa.setNIT ( txtNit.getText () );
                miEmpresa.setNRC ( txtNrc.getText () );
                manager.getEmpresaDAO ().modificar ( miEmpresa );
                Mensajes.mensajeOk ( "Empresa editada satisfactoriamente!" );
            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
                Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            } finally {
                dispose ();
            }
        }
    }

    private boolean isComplete () {
        if ( txtNombre.getText () == null || txtNombre.getText ().isEmpty () ) {
            return false;
        } else if ( txtDireccion.getText () == null || txtDireccion.getText ().
                isEmpty () ) {
            return false;
        } else if ( txtNit.getText () == null || txtNit.getText ().isEmpty () ) {
            return false;
        } else {
            return !( txtNrc.getText () == null || txtNrc.getText ().isEmpty () );
        }
    }

    private static final Logger LOG = Logger.getLogger ( DialogMiEmpresa.class.
            getName () );

}
