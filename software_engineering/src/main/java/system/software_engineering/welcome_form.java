/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package system.software_engineering;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author addie
 */
public class welcome_form extends javax.swing.JFrame {

    /**
     * Creates new form welcome_form
     */
    public welcome_form() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_goodMoral = new javax.swing.JButton();
        btn_login1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 53, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\system\\images\\small_logo.png"));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 110, 130));

        jPanel2.setBackground(new java.awt.Color(255, 250, 202));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("Welcome!");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 270, 110));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 680, 110));

        btn_goodMoral.setBackground(new java.awt.Color(103, 146, 137));
        btn_goodMoral.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btn_goodMoral.setForeground(new java.awt.Color(255, 255, 255));
        btn_goodMoral.setText("<html>\n\n<p styles: text-align: center>Good Moral Time<br>Allowance</p>\n\n</html>");
        btn_goodMoral.setFocusable(false);
        btn_goodMoral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goodMoralActionPerformed(evt);
            }
        });
        jPanel1.add(btn_goodMoral, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 260, 90));

        btn_login1.setBackground(new java.awt.Color(103, 146, 137));
        btn_login1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btn_login1.setForeground(new java.awt.Color(255, 255, 255));
        btn_login1.setText("Visiting Schedule");
        btn_login1.setFocusable(false);
        btn_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 260, 90));

        jButton6.setBackground(new java.awt.Color(103, 146, 137));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Logout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login1ActionPerformed
       Scheduling form = new Scheduling(); 
       form.show();
       show(false);
        
    }//GEN-LAST:event_btn_login1ActionPerformed

    private void btn_goodMoralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goodMoralActionPerformed
        goodTimeMoral form = new goodTimeMoral();
        form.show();
        show(false);
    }//GEN-LAST:event_btn_goodMoralActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        login_form form = new login_form();
        form.show();
        show(false);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(welcome_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_goodMoral;
    private javax.swing.JButton btn_login1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
