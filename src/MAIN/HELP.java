
package MAIN;

import javax.swing.JOptionPane;

public class HELP extends javax.swing.JFrame {

    public HELP() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abtBtn = new javax.swing.JLabel();
        ok = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HELP");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abtBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abtBtnMouseClicked(evt);
            }
        });
        getContentPane().add(abtBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 180, 50));

        ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 100, 50));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/help.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abtBtnMouseClicked
        JOptionPane.showMessageDialog(null, "This Game was developed by \n"
                + "-GEOFFREY\n-BOSCO\n-BENJAMIN", "ABOUT US", WIDTH);
    }//GEN-LAST:event_abtBtnMouseClicked

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked
        this.dispose();
    }//GEN-LAST:event_okMouseClicked

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
            java.util.logging.Logger.getLogger(HELP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HELP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HELP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HELP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HELP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abtBtn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel ok;
    // End of variables declaration//GEN-END:variables
}
