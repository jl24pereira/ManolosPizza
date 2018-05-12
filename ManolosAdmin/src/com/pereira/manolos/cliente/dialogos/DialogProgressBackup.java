package com.pereira.manolos.cliente.dialogos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import static com.pereira.manolos.cliente.main.InicioSesion.colorBG;

/* @author Jose Luis */
@SuppressWarnings ( "serial" )
public class DialogProgressBackup extends javax.swing.JDialog {

    int progress = 0;
    Random random = new Random ();

    public DialogProgressBackup ( java.awt.Frame parent , boolean modal , String titulo ) {
        super ( parent , modal );
        initComponents ();
        this.setLocationRelativeTo ( null );
        this.setTitle ( titulo );
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pMain = new javax.swing.JPanel();
        progresbar = new javax.swing.JProgressBar();
        txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(450, 250));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pMain.setBackground(colorBG);
        pMain.setLayout(new java.awt.GridBagLayout());

        progresbar.setPreferredSize(new java.awt.Dimension(150, 40));
        progresbar.setStringPainted(true);
        pMain.add(progresbar, new java.awt.GridBagConstraints());

        txt.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        pMain.add(txt, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(pMain, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        realizaBackup ();
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pMain;
    private javax.swing.JProgressBar progresbar;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables

    private static final Logger LOG = Logger.getLogger ( DialogProgressBackup.class.getName () );

    private void realizaBackup () {
        final List<String> comandos = new ArrayList<String> ();
        String dir = "C:/";
        //comandos.add("C:\\Program Files (x86)\\PostgreSQL\\9.4\\bin\\pg_dump.exe"); //cecom
        //comandos.add("C:\\Arquivos de programas\\PostgreSQL\\9.2\\bin\\pg_dump.exe");
        comandos.add ( "C:\\Program Files\\PostgreSQL\\9.5\\bin\\pg_dump.exe" );
        //comandos.add("-i");
        comandos.add ( "-h" );
        comandos.add ( "192.168.1.50" );
        //comandos.add("192.168.0.25");
        comandos.add ( "-p" );
        comandos.add ( "5432" );
        comandos.add ( "-U" );
        comandos.add ( "postgres" );
        comandos.add ( "-F" );
        comandos.add ( "c" );
        comandos.add ( "-b" );
        comandos.add ( "-v" );
        comandos.add ( "-f" );

        //comandos.add("C:\\TesteHib4\\Backups do Banco de Dados\\"+JOptionPane.showInputDialog(null,"Digite o nome do Backup")+".backup");   // eu utilizei meu C:\ e D:\ para os testes e gravei o backup com sucesso.
        //comandos.add("C:\\TesteHib4\\Backups do Banco de Dados\\"+(Character.getNumericValue(recebe)+1)+" "+getDateTime()+".backup");   // eu utilizei meu C:\ e D:\ para os testes e gravei o backup com sucesso.
        comandos.add ( "E:\\test.sql" );   // eu utilizei meu C:\ e D:\ para os testes e gravei o backup com sucesso.
        comandos.add ( "manolosdb_" );
        ProcessBuilder pb = new ProcessBuilder ( comandos );
        pb.environment ().put ( "PGPASSWORD" , "root" );
        try {
            final Process process = pb.start ();
            final BufferedReader r = new BufferedReader ( new InputStreamReader ( process.getErrorStream () ) );
            String line = r.readLine ();
            int i = 0;

            while ( line != null ) {
                txt.setText ( line );
                progress += random.nextInt ( 10 );
                System.err.println ( line );
                line = r.readLine ();
                //process.wait ( 10 );
            }
            r.close ();
            process.waitFor ();
            process.destroy ();
            JOptionPane.showMessageDialog ( null , "backup realizado com sucesso." );
        } catch ( IOException e ) {
            e.printStackTrace ();
        } catch ( InterruptedException ie ) {
            ie.printStackTrace ();
        }

    }

}
