/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package system.software_engineering;

import com.toedter.calendar.JDateChooser;
import java.awt.im.InputContext;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author addie
 */
public class visitor_list extends javax.swing.JFrame {

    /**
     * Creates new form visitor_list
     */
    public visitor_list() {
        
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
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                openWindow(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 53, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\system\\images\\small_logo.png"));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 120, 140));

        jPanel2.setBackground(new java.awt.Color(255, 250, 202));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Visitor List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 680, 90));

        dataTable.setBackground(new java.awt.Color(255, 250, 202));
        dataTable.setForeground(new java.awt.Color(0, 0, 0));
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Name", "In Mate to Visit", "Relationship", "Date of Visit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dataTable.setMinimumSize(new java.awt.Dimension(225, 20));
        jScrollPane1.setViewportView(dataTable);
        if (dataTable.getColumnModel().getColumnCount() > 0) {
            dataTable.getColumnModel().getColumn(0).setResizable(false);
            dataTable.getColumnModel().getColumn(1).setResizable(false);
            dataTable.getColumnModel().getColumn(2).setResizable(false);
            dataTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 710, 240));

        jButton6.setBackground(new java.awt.Color(103, 146, 137));
        jButton6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, -1, 40));

        dateChooser.setBackground(new java.awt.Color(103, 146, 137));
        dateChooser.setForeground(new java.awt.Color(0, 0, 0));
        dateChooser.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                dateInput(evt);
            }
        });
        jPanel1.add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 160, 40));

        jButton1.setBackground(new java.awt.Color(103, 146, 137));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void openWindow(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_openWindow
        showDataFromDatabase();
    }//GEN-LAST:event_openWindow

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Scheduling form = new Scheduling();
        form.show();
        show(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void dateInput(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_dateInput

    }//GEN-LAST:event_dateInput

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(dateChooser.getDate() != null){
            Date selectedDate = new Date(dateChooser.getDate().getTime());
            showDataFromDatabaseWithDate(selectedDate);
        }else{
            showDataFromDatabase();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showDataFromDatabase() {
        String sql = "SELECT * FROM visitor";
        try {
            PreparedStatement statement = sql_connect.db_connect().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            DefaultTableModel tableModel = (DefaultTableModel) dataTable.getModel();

            // Clear existing rows in the table model
            tableModel.setRowCount(0);

            while (resultSet.next()) {
                Object[] rowData = {
                    resultSet.getString("first_name") + " " + resultSet.getString("surname"),
                    resultSet.getString("inmate_first_name") + " " + resultSet.getString("inmate_surname"),
                    resultSet.getString("relationship"),
                    resultSet.getDate("date_of_visit")
                };
                tableModel.addRow(rowData);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    private void showDataFromDatabaseWithDate(Date selectedDate) {
    String sql = "SELECT * FROM visitor WHERE date_of_visit = ?";
    try {
        PreparedStatement statement = sql_connect.db_connect().prepareStatement(sql);
        statement.setDate(1, selectedDate);
        ResultSet resultSet = statement.executeQuery();

        DefaultTableModel tableModel = (DefaultTableModel) dataTable.getModel();

        // Clear existing rows in the table model
        tableModel.setRowCount(0);

        boolean hasRecords = false; // Flag to track if there are any records for the selected date

        while (resultSet.next()) {
            Object[] rowData = {
                resultSet.getString("first_name") + " " + resultSet.getString("surname"),
                resultSet.getString("inmate_first_name") + " " + resultSet.getString("inmate_surname"),
                resultSet.getString("relationship"),
                resultSet.getDate("date_of_visit")
            };
            tableModel.addRow(rowData);
            hasRecords = true; // Set the flag to true if there are any records
        }

        if (!hasRecords) {
            JOptionPane.showMessageDialog(this, "No Visit Record for the selected date.", "No Record Found", JOptionPane.INFORMATION_MESSAGE);
        }

    } catch (SQLException ex) {
        System.out.println(ex);
    }
}

    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(visitor_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(visitor_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(visitor_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(visitor_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new visitor_list().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dataTable;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
