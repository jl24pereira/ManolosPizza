package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCategoriaProducto;
import com.pereira.manolos.util.ImageConverter;
import com.pereira.manolos.util.Mensajes;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;

/* @author Jose Luis */
@SuppressWarnings ( "serial" )
public class DialogCategoriaProducto extends javax.swing.JDialog {

    private final DAOManager manager;
    private ModeloCategoriaProducto categoria;
    private File file = null;
    private boolean nuevo = true;
    private static final Logger LOG = Logger.getLogger ( DialogCategoriaProducto.class.getName () );

    public DialogCategoriaProducto ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager ) {
        super ( parent , modal );
        this.manager = manager;
        initComponents ();
        cargarFotoNoImage ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
    }

    public DialogCategoriaProducto ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager , ModeloCategoriaProducto categoria ) {
        super ( parent , modal );
        this.manager = manager;
        this.categoria = categoria;
        this.nuevo = false;
        initComponents ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
        cargarForm ();
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pMain = new javax.swing.JPanel();
        pComandos = new javax.swing.JPanel();
        btnGuardar1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        pForm = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        btnCargarLogo = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(350, 480));
        setPreferredSize(new java.awt.Dimension(350, 480));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(colorBG);
        pMain.setLayout(new java.awt.GridBagLayout());

        pComandos.setOpaque(false);
        pComandos.setLayout(new java.awt.GridBagLayout());

        btnGuardar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_N.png"))); // NOI18N
        btnGuardar1.setBorder(null);
        btnGuardar1.setBorderPainted(false);
        btnGuardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_P.png"))); // NOI18N
        btnGuardar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_O.png"))); // NOI18N
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pComandos.add(btnGuardar1, gridBagConstraints);

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
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pComandos.add(btnCancelar1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pMain.add(pComandos, gridBagConstraints);

        pForm.setOpaque(false);
        pForm.setLayout(new java.awt.GridBagLayout());

        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setBorder(new javax.swing.border.LineBorder(colorUI, 3, true));
        lblFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblFoto.setMaximumSize(new java.awt.Dimension(250, 250));
        lblFoto.setMinimumSize(new java.awt.Dimension(250, 250));
        lblFoto.setPreferredSize(new java.awt.Dimension(250, 250));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pForm.add(lblFoto, gridBagConstraints);

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
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        pForm.add(btnCargarLogo, gridBagConstraints);

        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setText("(*) Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        pForm.add(lblNombre, gridBagConstraints);

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
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        pForm.add(txtNombre, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pMain.add(pForm, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(pMain, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarLogoActionPerformed
        JFileChooser chooser = new javax.swing.JFileChooser ();
        chooser.setFileSelectionMode ( JFileChooser.FILES_ONLY );
        FileNameExtensionFilter filtro = new FileNameExtensionFilter ( "JPG" , "jpg" );
        chooser.setFileFilter ( filtro );
        int res = chooser.showOpenDialog ( DialogCategoriaProducto.this );
        if ( res == JFileChooser.APPROVE_OPTION ) {
            file = chooser.getSelectedFile ();
            ImageIcon image = new ImageIcon ( file.getAbsolutePath () );
            Rectangle rect = lblFoto.getBounds ();
            Image scaledImage = image.getImage ().getScaledInstance ( rect.width , rect.height , Image.SCALE_DEFAULT );
            image = new ImageIcon ( scaledImage );
            lblFoto.setIcon ( image );
        }
    }//GEN-LAST:event_btnCargarLogoActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased

    }//GEN-LAST:event_txtNombreKeyReleased

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        if ( nuevo ) {
            nuevaCategoria ();
        } else {
            editarCategoria ();
        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        dispose ();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCargarLogo;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pComandos;
    private javax.swing.JPanel pForm;
    private javax.swing.JPanel pMain;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarForm () {
        txtNombre.setText ( categoria.getNombre () );
        /*cargar imagen*/
        ImageIcon image;
        try {
            image = new ImageIcon ( ImageConverter.byteToImage ( categoria.getImagen () ) );
            Image scaledImage = image.getImage ().getScaledInstance ( 250 , 250 , Image.SCALE_DEFAULT );
            image = new ImageIcon ( scaledImage );
            lblFoto.setIcon ( image );
        } catch ( IOException ex ) {
            Logger.getLogger ( DialogPromociones.class.getName () ).log ( Level.SEVERE , null , ex );
        }
    }

    private void nuevaCategoria () {
        if ( file != null ) {
            try {
                categoria = new ModeloCategoriaProducto ( ImageConverter.imageToByte ( file ) , txtNombre.getText () );
                manager.getCategoriaProductoDAO ().insertar ( categoria );
                Mensajes.mensajeOk ( "Registro almacenado exitosamente!" );
            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
                Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            } finally {
                dispose ();
            }
        } else {
            Mensajes.mensajeAlert ( "No se encuentra ninguna imagen" );
        }
    }

    private void editarCategoria () {
        if ( file != null ) {
            try {
                categoria.setImagen ( ImageConverter.imageToByte ( file ) );
                categoria.setNombre ( txtNombre.getText () );
            } catch ( IOException ex ) {
                LOG.log ( Level.SEVERE , null , ex );
                Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            }
        } else {
            categoria.setNombre ( txtNombre.getText () );
        }
        try {
            manager.getCategoriaProductoDAO ().modificar ( categoria );
            Mensajes.mensajeOk ( "Registro editado exitosamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            dispose ();
        }
    }

    private void cargarFotoNoImage () {
        file = new File ( "images\\noimage.jpg" );
        ImageIcon image = new ImageIcon ( file.getAbsolutePath () );
        Rectangle rect = lblFoto.getBounds ();
        Image scaledImage = image.getImage ().getScaledInstance ( 250 , 250 ,
                                                                  Image.SCALE_DEFAULT );
        image = new ImageIcon ( scaledImage );
        lblFoto.setIcon ( image );
    }

}
