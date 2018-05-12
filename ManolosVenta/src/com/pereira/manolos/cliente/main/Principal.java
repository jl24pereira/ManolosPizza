/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pereira.manolos.cliente.main;

import com.pereira.manolos.negocio.dao.DAOManager;
import com.pereira.manolos.negocio.daoimpl.DAOManagerIMPL;
import com.pereira.manolos.util.AgregarPanel;
import java.util.logging.Logger;

@SuppressWarnings ( "serial" )
public class Principal extends javax.swing.JFrame {

    private final DAOManager manager;
    private final AgregarPanel agregar = new AgregarPanel ();

    public Principal () {
        manager = new DAOManagerIMPL ();
        this.setUndecorated ( true );
        //this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        this.setSize ( 1024 , 768 );
        initComponents ();
        this.setLocationRelativeTo ( null );
        agregar.insertarPanelMain ( pBody , new PanelInicio ( manager ) );
        /*Condition condition = CATEGORIA_PRODUCTO.NOMBRE.likeIgnoreCase("%"+""+"%");
        lCategorias.setCellRenderer(new CategoriaProductoRenderer());
        List<ModeloCategoriaProducto> lista = manager.getCategoriaProductoDAO().obtenerLista(condition);
        lista.stream().forEach((categoria) -> {
            modeloCategoriasProducto.addElement(categoria);
        });
        lCategorias.setModel(modeloCategoriasProducto);*/
    }

    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pBody.setBackground(new java.awt.Color(255, 255, 255));
        pBody.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(pBody, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel pBody;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = Logger.getLogger ( Principal.class.getName () );
}
