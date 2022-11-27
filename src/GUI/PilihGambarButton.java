/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;

/**
 *
 * @author LENOVO
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel = new javax.swing.JPanel();
        LbAnime2 = new javax.swing.JLabel();
        LbAnime3 = new javax.swing.JLabel();
        LbAnime1 = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        BtnAnime1 = new javax.swing.JButton();
        BtnAnime2 = new javax.swing.JButton();
        BtnAnime3 = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        imagePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imagePanel.setLayout(new java.awt.CardLayout());

        LbAnime2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbAnime2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/eren-2.jpg"))); // NOI18N
        imagePanel.add(LbAnime2, "1");

        LbAnime3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbAnime3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/eren-3.jpg"))); // NOI18N
        imagePanel.add(LbAnime3, "2");

        LbAnime1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbAnime1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/eren-1.jpg"))); // NOI18N
        LbAnime1.setToolTipText("");
        LbAnime1.setPreferredSize(new java.awt.Dimension(316, 400));
        imagePanel.add(LbAnime1, "0");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        BtnAnime1.setText("Anime-1");
        BtnAnime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnime1ActionPerformed(evt);
            }
        });
        buttonPanel.add(BtnAnime1);

        BtnAnime2.setText("Anime-2");
        BtnAnime2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnime2ActionPerformed(evt);
            }
        });
        buttonPanel.add(BtnAnime2);

        BtnAnime3.setText("Anime-3");
        BtnAnime3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnime3ActionPerformed(evt);
            }
        });
        buttonPanel.add(BtnAnime3);

        BtnExit.setText("Exit");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });
        buttonPanel.add(BtnExit);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAnime2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnime2ActionPerformed
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel,"1");
    }//GEN-LAST:event_BtnAnime2ActionPerformed

    private void BtnAnime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnime1ActionPerformed
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel,"0");
    }//GEN-LAST:event_BtnAnime1ActionPerformed

    private void BtnAnime3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnime3ActionPerformed
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel,"2");
    }//GEN-LAST:event_BtnAnime3ActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnExitActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnime1;
    private javax.swing.JButton BtnAnime2;
    private javax.swing.JButton BtnAnime3;
    private javax.swing.JButton BtnExit;
    private javax.swing.JLabel LbAnime1;
    private javax.swing.JLabel LbAnime2;
    private javax.swing.JLabel LbAnime3;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel imagePanel;
    // End of variables declaration//GEN-END:variables
}
