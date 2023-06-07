/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package system.software_engineering;

/**
 *
 * @author addie
 */
public class goodTimeMoral extends javax.swing.JFrame {

    /**
     * Creates new form goodTimeMoral
     */
    public goodTimeMoral() {
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

        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_login1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btn_goodMoral3 = new javax.swing.JButton();
        btn_goodMoral5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 53, 84));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\system\\images\\small_logo.png"));
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 110, 130));

        jPanel6.setBackground(new java.awt.Color(255, 250, 202));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel8.setForeground(java.awt.Color.black);
        jLabel8.setText("Good Morale Time Allowance");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 540, 110));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 680, 110));

        btn_login1.setBackground(new java.awt.Color(103, 146, 137));
        btn_login1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_login1.setForeground(new java.awt.Color(255, 255, 255));
        btn_login1.setText("List of Events");
        btn_login1.setFocusable(false);
        btn_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login1ActionPerformed(evt);
            }
        });
        jPanel5.add(btn_login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 220, 70));

        jButton6.setBackground(new java.awt.Color(103, 146, 137));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, 30));

        btn_goodMoral3.setBackground(new java.awt.Color(103, 146, 137));
        btn_goodMoral3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_goodMoral3.setForeground(new java.awt.Color(255, 255, 255));
        btn_goodMoral3.setText("<html>  <p style: text-align: center>Search<br>Prisoner Profile </p>  </html>");
        btn_goodMoral3.setFocusable(false);
        btn_goodMoral3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goodMoral3ActionPerformed(evt);
            }
        });
        jPanel5.add(btn_goodMoral3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 220, 70));

        btn_goodMoral5.setBackground(new java.awt.Color(103, 146, 137));
        btn_goodMoral5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_goodMoral5.setForeground(new java.awt.Color(255, 255, 255));
        btn_goodMoral5.setText("<html>  <p style: text-align: center>Add Prisoner</p>  </html>");
        btn_goodMoral5.setFocusable(false);
        btn_goodMoral5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goodMoral5ActionPerformed(evt);
            }
        });
        jPanel5.add(btn_goodMoral5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 220, 70));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login1ActionPerformed
        listOfEvents form = new listOfEvents();
        form.show();
        show(false);

    }//GEN-LAST:event_btn_login1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        welcome_form form = new welcome_form();
        form.show();
        show(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn_goodMoral3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goodMoral3ActionPerformed
        searchPrisoner form = new searchPrisoner();
        form.show();
        show(false);
    }//GEN-LAST:event_btn_goodMoral3ActionPerformed

    private void btn_goodMoral5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goodMoral5ActionPerformed
        Prisoner_Form form = new Prisoner_Form();
        form.show();
        show(false);
             
    }//GEN-LAST:event_btn_goodMoral5ActionPerformed

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
            java.util.logging.Logger.getLogger(goodTimeMoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(goodTimeMoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(goodTimeMoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(goodTimeMoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new goodTimeMoral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_goodMoral3;
    private javax.swing.JButton btn_goodMoral5;
    private javax.swing.JButton btn_login1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
