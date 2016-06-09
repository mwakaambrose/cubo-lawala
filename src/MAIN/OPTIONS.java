
package MAIN;

public class OPTIONS extends javax.swing.JFrame {

    public OPTIONS() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playerNameField = new javax.swing.JTextField();
        levels = new javax.swing.JComboBox();
        volumeSlider = new javax.swing.JSlider();
        save = new javax.swing.JComboBox();
        ringsAndSpears = new javax.swing.JComboBox();
        exit = new javax.swing.JLabel();
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
        getContentPane().add(playerNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 230, 30));

        levels.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Level 1", "Level 2", "Level 3", "Level 4", "Level 5" }));
        getContentPane().add(levels, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 250, 40));
        getContentPane().add(volumeSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 146, 250, 40));

        save.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Save", "Don't Sava" }));
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 250, 40));

        ringsAndSpears.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Spear and Ring 1", "Spear and Ring 2", "Spear and Ring 3", "Spear and Ring 4", "Spear and Ring 5" }));
        getContentPane().add(ringsAndSpears, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 200, 40));

        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 100, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/options.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

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
    private javax.swing.JComboBox levels;
    private javax.swing.JTextField playerNameField;
    private javax.swing.JComboBox ringsAndSpears;
    private javax.swing.JComboBox save;
    private javax.swing.JSlider volumeSlider;
    // End of variables declaration//GEN-END:variables
}
