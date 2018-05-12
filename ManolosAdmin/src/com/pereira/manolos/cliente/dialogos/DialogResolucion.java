package com.pereira.manolos.cliente.dialogos;

import com.pereira.manolos.datos.database.Tables;
import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.modelos.ModeloCaja;
import com.pereira.manolos.negocio.modelos.ModeloResolucion;
import com.pereira.manolos.util.ComboUI;
import com.pereira.manolos.util.Mensajes;
import com.pereira.manolos.util.SpinnerUI;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import org.jooq.Condition;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;
import static com.pereira.manolos.cliente.main.InicioSesion.colorUI;

/* @author Jose Luis */
@SuppressWarnings ( "serial" )
public class DialogResolucion extends javax.swing.JDialog {

    private final DefaultComboBoxModel<ModeloCaja> dcmCajas = new DefaultComboBoxModel<> ();
    private ModeloResolucion resolucion;
    private final DAOManager manager;
    private final boolean nuevo;

    public DialogResolucion ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager ) {
        super ( parent , modal );
        this.manager = manager;
        initComponents ();
        this.setLocationRelativeTo ( null );
        nuevo = true;
        this.setTitle ( titulo );
        cargarCajas ();
    }

    public DialogResolucion ( java.awt.Frame parent , boolean modal , String titulo , DAOManager manager , ModeloResolucion resolucion ) {
        super ( parent , modal );
        this.manager = manager;
        this.resolucion = resolucion;
        initComponents ();
        this.setLocationRelativeTo ( null );
        nuevo = false;
        this.setTitle ( titulo );
        cargarCajas ();
        cargarFormulario ();
    }

    private void agregarResolucion () {
        if ( !isActiva ( ( ModeloCaja ) cbxCaja.getSelectedItem () ) ) {
            int m = Mensajes.mensajeSiNo ( "Esta Caja posee una resolucion activa, agregar resolución para activar en un futuro?" );
            if ( m == 0 ) {
                resolucion = new ModeloResolucion ( txtRsolucion.getText () , ( int ) spInical.getValue () , ( int ) spFinal.getValue () , 0 ,
                                                    ( int ) spAlerta.getValue () , txtSerie.getText () , txtFecha.getDate () ,
                                                    ( ModeloCaja ) cbxCaja.getSelectedItem () , false );
            }
        } else {
            resolucion = new ModeloResolucion ( txtRsolucion.getText () , ( int ) spInical.getValue () , ( int ) spFinal.getValue () , 0 ,
                                                ( int ) spAlerta.getValue () , txtSerie.getText () , txtFecha.getDate () ,
                                                ( ModeloCaja ) cbxCaja.getSelectedItem () , true );
        }
        if ( resolucion != null ) {
            try {
                manager.getResolucionDAO ().insertar ( resolucion );
                Mensajes.mensajeInfo ( "Registro agregado exitosamente!" );
            } catch ( Exception ex ) {
                LOG.log ( Level.SEVERE , null , ex );
                Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            } finally {
                dispose ();
            }
        }
    }

    private void editarResolucion () {
        resolucion.setResolucion ( txtRsolucion.getText () );
        resolucion.setTktinicial ( ( int ) spInical.getValue () );
        resolucion.setTktfinal ( ( int ) spFinal.getValue () );
        resolucion.setTktalerta ( ( int ) spAlerta.getValue () );
        resolucion.setSerie ( txtSerie.getText () );
        resolucion.setFecha ( txtFecha.getDate () );
        resolucion.setCaja ( ( ModeloCaja ) cbxCaja.getSelectedItem () );
        try {
            manager.getResolucionDAO ().modificar ( resolucion );
            Mensajes.mensajeOk ( "Registro Editado Satisfactoriamente!" );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
        } finally {
            dispose ();
        }

    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pMain = new javax.swing.JPanel();
        pFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRsolucion = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        spInical = new javax.swing.JSpinner();
        spFinal = new javax.swing.JSpinner();
        spAlerta = new javax.swing.JSpinner();
        txtSerie = new javax.swing.JTextField();
        cbxCaja = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(350, 450));
        setPreferredSize(new java.awt.Dimension(350, 450));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(colorBG);
        pMain.setLayout(new java.awt.GridBagLayout());

        pFormulario.setBackground(new java.awt.Color(255, 255, 255));
        pFormulario.setMinimumSize(new java.awt.Dimension(400, 600));
        pFormulario.setOpaque(false);
        pFormulario.setPreferredSize(new java.awt.Dimension(400, 600));
        pFormulario.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Resolución #:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 5);
        pFormulario.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Serie:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        pFormulario.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Fecha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        pFormulario.add(jLabel3, gridBagConstraints);

        jLabel4.setText("TXT Inicial:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        pFormulario.add(jLabel4, gridBagConstraints);

        jLabel5.setText("TKT Final:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        pFormulario.add(jLabel5, gridBagConstraints);

        jLabel6.setText("TKT Alerta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        pFormulario.add(jLabel6, gridBagConstraints);

        jLabel7.setText("Caja:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 5);
        pFormulario.add(jLabel7, gridBagConstraints);

        txtRsolucion.setMinimumSize(new java.awt.Dimension(150, 35));
        txtRsolucion.setPreferredSize(new java.awt.Dimension(150, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 10);
        pFormulario.add(txtRsolucion, gridBagConstraints);

        txtFecha.setMinimumSize(new java.awt.Dimension(150, 35));
        txtFecha.setPreferredSize(new java.awt.Dimension(150, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario.add(txtFecha, gridBagConstraints);

        spInical.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 100));
        spInical.setMinimumSize(new java.awt.Dimension(150, 35));
        spInical.setPreferredSize(new java.awt.Dimension(150, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario.add(spInical, gridBagConstraints);
        spInical.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        spFinal.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 100));
        spFinal.setMinimumSize(new java.awt.Dimension(150, 35));
        spFinal.setPreferredSize(new java.awt.Dimension(150, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario.add(spFinal, gridBagConstraints);
        spFinal.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        spAlerta.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 100));
        spAlerta.setMinimumSize(new java.awt.Dimension(150, 35));
        spAlerta.setPreferredSize(new java.awt.Dimension(150, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario.add(spAlerta, gridBagConstraints);
        spAlerta.setUI(new SpinnerUI(colorBG,colorUI,colorUI));

        txtSerie.setMinimumSize(new java.awt.Dimension(150, 35));
        txtSerie.setPreferredSize(new java.awt.Dimension(150, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pFormulario.add(txtSerie, gridBagConstraints);

        cbxCaja.setModel(dcmCajas);
        cbxCaja.setMinimumSize(new java.awt.Dimension(150, 35));
        cbxCaja.setPreferredSize(new java.awt.Dimension(150, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 10, 10);
        pFormulario.add(cbxCaja, gridBagConstraints);
        cbxCaja.setUI(new ComboUI(colorBG,colorUI, colorBG));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pMain.add(pFormulario, gridBagConstraints);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_N.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setMaximumSize(new java.awt.Dimension(150, 50));
        btnGuardar.setMinimumSize(new java.awt.Dimension(150, 50));
        btnGuardar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_P.png"))); // NOI18N
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_guardar_O.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(btnGuardar, gridBagConstraints);

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_N.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setMaximumSize(new java.awt.Dimension(150, 50));
        btnCancelar.setMinimumSize(new java.awt.Dimension(150, 50));
        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_P.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pereira/manolos/cliente/images/btn_cancelar_O.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(btnCancelar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        pMain.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(pMain, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int tktFinal = ( int ) spFinal.getValue ();
        int tktInicial = ( int ) spInical.getValue ();
        int tktAlerta = ( int ) spAlerta.getValue ();
        if ( tktFinal > tktInicial && tktAlerta >= tktInicial ) {
            if ( nuevo ) {
                agregarResolucion ();
            } else {
                editarResolucion ();
            }
        } else {
            Mensajes.mensajeAlert ( "Rangos de ticket inválidos!" );
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<ModeloCaja> cbxCaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pFormulario;
    private javax.swing.JPanel pMain;
    private javax.swing.JSpinner spAlerta;
    private javax.swing.JSpinner spFinal;
    private javax.swing.JSpinner spInical;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtRsolucion;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables

    private void cargarFormulario () {
        txtRsolucion.setText ( resolucion.getResolucion () );
        txtFecha.setDate ( resolucion.getFecha () );
        txtSerie.setText ( resolucion.getSerie () );
        spInical.setValue ( resolucion.getTktinicial () );
        spFinal.setValue ( resolucion.getTktfinal () );
        spAlerta.setValue ( resolucion.getTktalerta () );
        cbxCaja.setSelectedItem ( resolucion.getCaja () );
    }

    private void cargarCajas () {
        dcmCajas.removeAllElements ();
        Condition baja = Tables.CAJA.BAJA.eq ( true );
        //Condition activa = Tables.CAJA.ESTADO.eq ( true );
        try {
            manager.getCajaDAO ().obtenerLista ( baja ).forEach ( dcmCajas::addElement );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            dispose ();
        }
    }

    private static final Logger LOG = Logger.getLogger ( DialogResolucion.class.getName () );

    private boolean isActiva ( ModeloCaja pCaja ) {
        Condition caja = Tables.RESOLUCION.IDCAJA.eq ( pCaja.getIdcaja () );
        Condition activa = Tables.RESOLUCION.ACTIVA.eq ( true );
        List<ModeloResolucion> resoluciones = new ArrayList<> ();
        try {
            resoluciones = manager.getResolucionDAO ().obtenerLista ( caja.and ( activa ) );
        } catch ( Exception ex ) {
            LOG.log ( Level.SEVERE , null , ex );
            Mensajes.mensajeError ( "Error: " + ex.getMessage () );
            dispose ();
        }
        return resoluciones.isEmpty ();
    }

}
