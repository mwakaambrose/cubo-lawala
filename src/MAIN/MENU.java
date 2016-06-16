package MAIN;

import circlespear.CircleSpear;

public class MENU extends javax.swing.JFrame {

    AUPlayer auPlayer = new AUPlayer("flute.au");

    public MENU() {
        initComponents();
        this.setLocationRelativeTo(null);
        auPlayer.playSound();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        start = new javax.swing.JLabel();
        aboutBtn = new javax.swing.JLabel();
        btn4 = new javax.swing.JLabel();
        btn3 = new javax.swing.JLabel();
        btn2 = new javax.swing.JLabel();
        btn1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        options = new javax.swing.JLabel();
        scores = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        help = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("START");
        jLabel2.setToolTipText("Start game");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 200, 30));

        start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/btn.png"))); // NOI18N
        start.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMouseClicked(evt);
            }
        });
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 240, 60));

        aboutBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        aboutBtn.setForeground(new java.awt.Color(255, 255, 255));
        aboutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aboutBtn.setText("ABOUT");
        aboutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutBtnMouseClicked(evt);
            }
        });
        getContentPane().add(aboutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 340, 170, 30));

        btn4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn4.setText("HELP");
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 200, 40));

        btn3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn3.setText("SCORES");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 200, 40));

        btn2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn2.setText("OPTIONS");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 250, 40));

        btn1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn1.setText("START");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 190, 30));

        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 90, 40));

        options.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/btn2.png"))); // NOI18N
        options.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        options.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optionsMouseClicked(evt);
            }
        });
        getContentPane().add(options, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 290, 70));

        scores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/btn3 (2).png"))); // NOI18N
        scores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scoresMouseClicked(evt);
            }
        });
        getContentPane().add(scores, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 270, 80));

        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/btn5.png"))); // NOI18N
        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        getContentPane().add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 250, 70));

        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/g3599.png"))); // NOI18N
        getContentPane().add(help, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 250, 90));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN/menu.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
        auPlayer.stopSound();
    }//GEN-LAST:event_exitMouseClicked

    private void optionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionsMouseClicked
        new OPTIONS().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_optionsMouseClicked

    private void scoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scoresMouseClicked
        new SCORES().setVisible(true);
    }//GEN-LAST:event_scoresMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        new ABOUT().setVisible(true);
        auPlayer.stopSound();
    }//GEN-LAST:event_aboutMouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        new HELP().setVisible(true);
    }//GEN-LAST:event_btn4MouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked

    }//GEN-LAST:event_btn1MouseClicked

    private void startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseClicked
        //new RUN().setVisible(true);
        new CircleSpear().setVisible(true);
        auPlayer.stopSound();
        this.dispose();
    }//GEN-LAST:event_startMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //new RUN().setVisible(true);
        new CircleSpear().setVisible(true);
        auPlayer.stopSound();
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void aboutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutBtnMouseClicked
        // TODO add your handling code here:
        new ABOUT().setVisible(true);
        auPlayer.stopSound();
    }//GEN-LAST:event_aboutBtnMouseClicked

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JLabel aboutBtn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btn1;
    private javax.swing.JLabel btn2;
    private javax.swing.JLabel btn3;
    private javax.swing.JLabel btn4;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel help;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel options;
    private javax.swing.JLabel scores;
    private javax.swing.JLabel start;
    // End of variables declaration//GEN-END:variables
}
