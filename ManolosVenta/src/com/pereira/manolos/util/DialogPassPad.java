
package com.pereira.manolos.util;

import javax.swing.JOptionPane;

public class DialogPassPad extends javax.swing.JDialog {
    
    private String clave = null;

    public DialogPassPad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtPass = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnNN = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnSpace = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnMayus = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(0, 100));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 100));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        txtPass.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        jPanel2.add(txtPass, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("1");
        jButton1.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(jButton1, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("2");
        jButton2.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(jButton2, gridBagConstraints);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("3");
        jButton3.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(jButton3, gridBagConstraints);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("4");
        jButton4.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton4.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(jButton4, gridBagConstraints);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("5");
        jButton5.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton5.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton5.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(jButton5, gridBagConstraints);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("6");
        jButton6.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton6.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton6.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(jButton6, gridBagConstraints);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("7");
        jButton7.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton7.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton7.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(jButton7, gridBagConstraints);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("8");
        jButton8.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton8.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton8.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(jButton8, gridBagConstraints);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setText("9");
        jButton9.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton9.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton9.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(jButton9, gridBagConstraints);

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setText("0");
        jButton10.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton10.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton10.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(jButton10, gridBagConstraints);

        btnQ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQ.setText("Q");
        btnQ.setMaximumSize(new java.awt.Dimension(50, 50));
        btnQ.setMinimumSize(new java.awt.Dimension(50, 50));
        btnQ.setPreferredSize(new java.awt.Dimension(50, 50));
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnQ, gridBagConstraints);

        btnW.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnW.setText("W");
        btnW.setMaximumSize(new java.awt.Dimension(50, 50));
        btnW.setMinimumSize(new java.awt.Dimension(50, 50));
        btnW.setPreferredSize(new java.awt.Dimension(50, 50));
        btnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnW, gridBagConstraints);

        btnE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnE.setText("E");
        btnE.setMaximumSize(new java.awt.Dimension(50, 50));
        btnE.setMinimumSize(new java.awt.Dimension(50, 50));
        btnE.setPreferredSize(new java.awt.Dimension(50, 50));
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnE, gridBagConstraints);

        btnR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnR.setText("R");
        btnR.setMaximumSize(new java.awt.Dimension(50, 50));
        btnR.setMinimumSize(new java.awt.Dimension(50, 50));
        btnR.setPreferredSize(new java.awt.Dimension(50, 50));
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnR, gridBagConstraints);

        btnT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnT.setText("T");
        btnT.setMaximumSize(new java.awt.Dimension(50, 50));
        btnT.setMinimumSize(new java.awt.Dimension(50, 50));
        btnT.setPreferredSize(new java.awt.Dimension(50, 50));
        btnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnT, gridBagConstraints);

        btnY.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnY.setText("Y");
        btnY.setMaximumSize(new java.awt.Dimension(50, 50));
        btnY.setMinimumSize(new java.awt.Dimension(50, 50));
        btnY.setPreferredSize(new java.awt.Dimension(50, 50));
        btnY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnY, gridBagConstraints);

        btnU.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnU.setText("U");
        btnU.setMaximumSize(new java.awt.Dimension(50, 50));
        btnU.setMinimumSize(new java.awt.Dimension(50, 50));
        btnU.setPreferredSize(new java.awt.Dimension(50, 50));
        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnU, gridBagConstraints);

        btnI.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnI.setText("I");
        btnI.setMaximumSize(new java.awt.Dimension(50, 50));
        btnI.setMinimumSize(new java.awt.Dimension(50, 50));
        btnI.setPreferredSize(new java.awt.Dimension(50, 50));
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnI, gridBagConstraints);

        btnO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnO.setText("O");
        btnO.setMaximumSize(new java.awt.Dimension(50, 50));
        btnO.setMinimumSize(new java.awt.Dimension(50, 50));
        btnO.setPreferredSize(new java.awt.Dimension(50, 50));
        btnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnO, gridBagConstraints);

        btnP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnP.setText("P");
        btnP.setMaximumSize(new java.awt.Dimension(50, 50));
        btnP.setMinimumSize(new java.awt.Dimension(50, 50));
        btnP.setPreferredSize(new java.awt.Dimension(50, 50));
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnP, gridBagConstraints);

        btnA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnA.setText("A");
        btnA.setMaximumSize(new java.awt.Dimension(50, 50));
        btnA.setMinimumSize(new java.awt.Dimension(50, 50));
        btnA.setPreferredSize(new java.awt.Dimension(50, 50));
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnA, gridBagConstraints);

        btnS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnS.setText("S");
        btnS.setMaximumSize(new java.awt.Dimension(50, 50));
        btnS.setMinimumSize(new java.awt.Dimension(50, 50));
        btnS.setPreferredSize(new java.awt.Dimension(50, 50));
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnS, gridBagConstraints);

        btnD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnD.setText("D");
        btnD.setMaximumSize(new java.awt.Dimension(50, 50));
        btnD.setMinimumSize(new java.awt.Dimension(50, 50));
        btnD.setPreferredSize(new java.awt.Dimension(50, 50));
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnD, gridBagConstraints);

        btnF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnF.setText("F");
        btnF.setMaximumSize(new java.awt.Dimension(50, 50));
        btnF.setMinimumSize(new java.awt.Dimension(50, 50));
        btnF.setPreferredSize(new java.awt.Dimension(50, 50));
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnF, gridBagConstraints);

        btnG.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnG.setText("G");
        btnG.setMaximumSize(new java.awt.Dimension(50, 50));
        btnG.setMinimumSize(new java.awt.Dimension(50, 50));
        btnG.setPreferredSize(new java.awt.Dimension(50, 50));
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnG, gridBagConstraints);

        btnH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnH.setText("H");
        btnH.setMaximumSize(new java.awt.Dimension(50, 50));
        btnH.setMinimumSize(new java.awt.Dimension(50, 50));
        btnH.setPreferredSize(new java.awt.Dimension(50, 50));
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnH, gridBagConstraints);

        btnJ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnJ.setText("J");
        btnJ.setMaximumSize(new java.awt.Dimension(50, 50));
        btnJ.setMinimumSize(new java.awt.Dimension(50, 50));
        btnJ.setPreferredSize(new java.awt.Dimension(50, 50));
        btnJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnJ, gridBagConstraints);

        btnK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnK.setText("K");
        btnK.setMaximumSize(new java.awt.Dimension(50, 50));
        btnK.setMinimumSize(new java.awt.Dimension(50, 50));
        btnK.setPreferredSize(new java.awt.Dimension(50, 50));
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnK, gridBagConstraints);

        btnL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnL.setText("L");
        btnL.setMaximumSize(new java.awt.Dimension(50, 50));
        btnL.setMinimumSize(new java.awt.Dimension(50, 50));
        btnL.setPreferredSize(new java.awt.Dimension(50, 50));
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnL, gridBagConstraints);

        btnNN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNN.setText("Ñ");
        btnNN.setMaximumSize(new java.awt.Dimension(50, 50));
        btnNN.setMinimumSize(new java.awt.Dimension(50, 50));
        btnNN.setPreferredSize(new java.awt.Dimension(50, 50));
        btnNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNNActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnNN, gridBagConstraints);

        btnZ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnZ.setText("Z");
        btnZ.setMaximumSize(new java.awt.Dimension(50, 50));
        btnZ.setMinimumSize(new java.awt.Dimension(50, 50));
        btnZ.setPreferredSize(new java.awt.Dimension(50, 50));
        btnZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnZ, gridBagConstraints);

        btnX.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnX.setText("X");
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnX, gridBagConstraints);

        btnC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnC.setText("C");
        btnC.setMaximumSize(new java.awt.Dimension(50, 50));
        btnC.setMinimumSize(new java.awt.Dimension(50, 50));
        btnC.setPreferredSize(new java.awt.Dimension(50, 50));
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnC, gridBagConstraints);

        btnV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnV.setText("V");
        btnV.setMaximumSize(new java.awt.Dimension(50, 50));
        btnV.setMinimumSize(new java.awt.Dimension(50, 50));
        btnV.setPreferredSize(new java.awt.Dimension(50, 50));
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnV, gridBagConstraints);

        btnB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnB.setText("B");
        btnB.setMaximumSize(new java.awt.Dimension(50, 50));
        btnB.setMinimumSize(new java.awt.Dimension(50, 50));
        btnB.setPreferredSize(new java.awt.Dimension(50, 50));
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnB, gridBagConstraints);

        btnN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnN.setText("N");
        btnN.setMaximumSize(new java.awt.Dimension(50, 50));
        btnN.setMinimumSize(new java.awt.Dimension(50, 50));
        btnN.setPreferredSize(new java.awt.Dimension(50, 50));
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnN, gridBagConstraints);

        btnM.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnM.setText("M");
        btnM.setMaximumSize(new java.awt.Dimension(50, 50));
        btnM.setMinimumSize(new java.awt.Dimension(50, 50));
        btnM.setPreferredSize(new java.awt.Dimension(50, 50));
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnM, gridBagConstraints);

        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnAceptar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnAceptar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnAceptar, gridBagConstraints);

        btnSpace.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSpace.setText("ESPACIO");
        btnSpace.setMaximumSize(new java.awt.Dimension(50, 50));
        btnSpace.setMinimumSize(new java.awt.Dimension(50, 50));
        btnSpace.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpaceActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnSpace, gridBagConstraints);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        btnBack.setText("\u2190");
        btnBack.setMaximumSize(new java.awt.Dimension(50, 50));
        btnBack.setMinimumSize(new java.awt.Dimension(50, 50));
        btnBack.setPreferredSize(new java.awt.Dimension(50, 50));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnBack, gridBagConstraints);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnCancelar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnCancelar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnCancelar, gridBagConstraints);

        btnMayus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMayus.setSelected(true);
        btnMayus.setText("MAYUS");
        btnMayus.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnMayusStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(btnMayus, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMayusStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnMayusStateChanged
        if(btnMayus.isSelected()){
            btnQ.setText("Q");
            btnW.setText("W");
            btnE.setText("E");
            btnR.setText("R");
            btnT.setText("T");
            btnY.setText("Y");
            btnU.setText("U");
            btnI.setText("I");
            btnO.setText("O");
            btnP.setText("P");
            btnA.setText("A");
            btnS.setText("S");
            btnD.setText("D");
            btnF.setText("F");
            btnG.setText("G");
            btnH.setText("H");
            btnJ.setText("J");
            btnK.setText("K");
            btnL.setText("L");
            btnNN.setText("Ñ");
            btnZ.setText("Z");
            btnX.setText("X");
            btnC.setText("C");
            btnV.setText("V");
            btnB.setText("B");
            btnN.setText("N");
            btnM.setText("M");
        }else{
            btnQ.setText("q");
            btnW.setText("w");
            btnE.setText("e");
            btnR.setText("r");
            btnT.setText("t");
            btnY.setText("y");
            btnU.setText("u");
            btnI.setText("i");
            btnO.setText("o");
            btnP.setText("p");
            btnA.setText("a");
            btnS.setText("s");
            btnD.setText("d");
            btnF.setText("f");
            btnG.setText("g");
            btnH.setText("h");
            btnJ.setText("j");
            btnK.setText("k");
            btnL.setText("l");
            btnNN.setText("ñ");
            btnZ.setText("z");
            btnX.setText("x");
            btnC.setText("c");
            btnV.setText("v");
            btnB.setText("b");
            btnN.setText("n");
            btnM.setText("m");
        }
    }//GEN-LAST:event_btnMayusStateChanged

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+"1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+"2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+"3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+"4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+"5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+"6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+"7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+"8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+"9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+"0");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnQ.getText());
    }//GEN-LAST:event_btnQActionPerformed

    private void btnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnW.getText());
    }//GEN-LAST:event_btnWActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnE.getText());
    }//GEN-LAST:event_btnEActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnR.getText());
    }//GEN-LAST:event_btnRActionPerformed

    private void btnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnT.getText());
    }//GEN-LAST:event_btnTActionPerformed

    private void btnYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnY.getText());
    }//GEN-LAST:event_btnYActionPerformed

    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnU.getText());
    }//GEN-LAST:event_btnUActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnI.getText());
    }//GEN-LAST:event_btnIActionPerformed

    private void btnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnO.getText());
    }//GEN-LAST:event_btnOActionPerformed

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnP.getText());
    }//GEN-LAST:event_btnPActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnA.getText());
    }//GEN-LAST:event_btnAActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnS.getText());
    }//GEN-LAST:event_btnSActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnD.getText());
    }//GEN-LAST:event_btnDActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnF.getText());
    }//GEN-LAST:event_btnFActionPerformed

    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnG.getText());
    }//GEN-LAST:event_btnGActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnH.getText());
    }//GEN-LAST:event_btnHActionPerformed

    private void btnJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnJ.getText());
    }//GEN-LAST:event_btnJActionPerformed

    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnK.getText());
    }//GEN-LAST:event_btnKActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnL.getText());
    }//GEN-LAST:event_btnLActionPerformed

    private void btnNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNNActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnNN.getText());
    }//GEN-LAST:event_btnNNActionPerformed

    private void btnZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnZ.getText());
    }//GEN-LAST:event_btnZActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnX.getText());
    }//GEN-LAST:event_btnXActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnC.getText());
    }//GEN-LAST:event_btnCActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnV.getText());
    }//GEN-LAST:event_btnVActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnB.getText());
    }//GEN-LAST:event_btnBActionPerformed

    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnN.getText());
    }//GEN-LAST:event_btnNActionPerformed

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+btnM.getText());
    }//GEN-LAST:event_btnMActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        if(pass.length()>0){
            txtPass.setText(pass.substring(0,pass.length()-1));
        } 
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpaceActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        txtPass.setText(pass+" ");
    }//GEN-LAST:event_btnSpaceActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        char passArray[] = txtPass.getPassword();
        String pass = new String(passArray);
        if(pass==null || pass.equals("")){
            JOptionPane.showMessageDialog(null, "No envio nada");
        }else{
            this.setClave(pass);
        }
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JToggleButton btnMayus;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnNN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnSpace;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
