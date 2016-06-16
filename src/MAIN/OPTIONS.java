package MAIN;

import javax.swing.JOptionPane;

public class OPTIONS extends javax.swing.JFrame {

    PlayerPrefferences configs;

    public OPTIONS() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        configs = new PlayerPrefferences();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playerNameField = new javax.swing.JTextField();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        saveName = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OPTIONS");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playerNameField.setBackground(new java.awt.Color(111, 207, 238));
        playerNameField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        playerNameField.setForeground(new java.awt.Color(255, 255, 255));
        playerNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerNameField.setBorder(null);
        playerNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(playerNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 230, 30));

        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 100, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/patch.PNG"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 260, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/patch.PNG"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/patch.PNG"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 260, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/patch.PNG"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 260, 60));

        saveName.setText("Save Name");
        saveName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNameActionPerformed(evt);
            }
        });
        getContentPane().add(saveName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/options.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
        new MENU().setVisible(true);
    }//GEN-LAST:event_exitMouseClicked

    private void playerNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerNameFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_playerNameFieldActionPerformed

    private void saveNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNameActionPerformed
        if (!playerNameField.getText().isEmpty()) {
            configs.setPlayerName(playerNameField.getText());
            configs.setPlayerScore("0");
            JOptionPane.showMessageDialog(rootPane, playerNameField.getText() + " Added succesfully..");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Please Enter a name before you save.");
        }
    }//GEN-LAST:event_saveNameActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OPTIONS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OPTIONS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OPTIONS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OPTIONS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OPTIONS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField playerNameField;
    private javax.swing.JButton saveName;
    // End of variables declaration//GEN-END:variables
}
