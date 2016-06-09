
package MAIN;

public class RUN extends javax.swing.JFrame {

    Game game = new Game();
    public RUN() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new TimerClass(), 0, 1000);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shoot = new javax.swing.JButton();
        start = new javax.swing.JButton();
        back = new javax.swing.JButton();
        ring = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        sp1 = new javax.swing.JLabel();
        sp2 = new javax.swing.JLabel();
        sp3 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("LEVEL 1");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shoot.setText("shoot");
        getContentPane().add(shoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, -1, -1));

        start.setText("Start");
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        ring.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/ring.gif"))); // NOI18N
        getContentPane().add(ring, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 100, 100));

        h.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        h.setText("00");
        getContentPane().add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setText("TIME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText(":");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 63, -1, 30));

        m.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        m.setText("00");
        getContentPane().add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 64, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText(":");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 63, 20, 30));

        s.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        s.setText("00");
        getContentPane().add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 63, -1, 30));

        sp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/spear1.png"))); // NOI18N
        getContentPane().add(sp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, 470));

        sp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/spear2.png"))); // NOI18N
        getContentPane().add(sp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, -1, 450));

        sp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/spear3.png"))); // NOI18N
        getContentPane().add(sp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, 450));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/bg2.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new MENU().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(RUN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RUN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RUN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RUN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RUN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    public static javax.swing.JLabel bg;
    public static javax.swing.JLabel h;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel m;
    public static javax.swing.JLabel ring;
    public static javax.swing.JLabel s;
    private javax.swing.JButton shoot;
    private javax.swing.JLabel sp1;
    private javax.swing.JLabel sp2;
    private javax.swing.JLabel sp3;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
