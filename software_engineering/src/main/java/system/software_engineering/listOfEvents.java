/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package system.software_engineering;

import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicListUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author addie
 */
public class listOfEvents extends javax.swing.JFrame {

    /**
     * Creates new form listOfEvents
     */
    public listOfEvents() {
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
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAddEvent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventTable = new javax.swing.JTable();
        month = new com.toedter.calendar.JMonthChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 53, 84));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\system\\images\\small_logo.png"));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 120, 140));

        jButton6.setBackground(new java.awt.Color(103, 146, 137));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, 30));

        jPanel2.setBackground(new java.awt.Color(255, 250, 202));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("List of Events");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 680, 110));

        jButton1.setBackground(new java.awt.Color(103, 146, 137));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 90, 40));

        btnAddEvent.setBackground(new java.awt.Color(103, 146, 137));
        btnAddEvent.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAddEvent.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEvent.setText("Add Event");
        btnAddEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEventActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 140, 40));

        eventTable.setBackground(new java.awt.Color(255, 250, 202));
        eventTable.setForeground(new java.awt.Color(0, 0, 0));
        eventTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Event Title", "Date", "Duration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eventTable.setMinimumSize(new java.awt.Dimension(225, 20));
        eventTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(eventTable);
        if (eventTable.getColumnModel().getColumnCount() > 0) {
            eventTable.getColumnModel().getColumn(0).setMinWidth(500);
            eventTable.getColumnModel().getColumn(0).setMaxWidth(500);
            eventTable.getColumnModel().getColumn(1).setMinWidth(150);
            eventTable.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 720, 230));

        month.setBackground(new java.awt.Color(103, 146, 137));
        month.setFocusable(false);
        month.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        month.setMonth(0);
        jPanel1.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 190, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Component frame;
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        goodTimeMoral form = new goodTimeMoral();
        form.show();
        show(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    String myMonth;
    DefaultTableModel tableModel;
    String desc;
    String title;
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        myMonth = String.format("%02d", month.getMonth() + 1);
        
        String sql = "SELECT * FROM events WHERE SUBSTRING(event_date, 6, 2) = ?";

        try {
            PreparedStatement statement = sql_connect.db_connect().prepareStatement(sql);
            statement.setString(1, myMonth);
            
            ResultSet resultSet = statement.executeQuery();

            tableModel = (DefaultTableModel) eventTable.getModel();
            tableModel.setRowCount(0);
            
            
            boolean hasData = false;
            
            while (resultSet.next()) {
                hasData = true;
                
                desc = resultSet.getString("event_desc");
                
                Object[] rowData = {
                resultSet.getString("event_title"),
                resultSet.getString("event_date"),
                resultSet.getString("event_duration")
                };

                tableModel.addRow(rowData);
            }
            eventTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                boolean showDialog = true;
                
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (!e.getValueIsAdjusting() && showDialog) {
                        showDialog = false;
                        
                        int selectedRow = eventTable.getSelectedRow();
                        if (selectedRow != -1) { 
                            String evTitle = eventTable.getValueAt(selectedRow, 0).toString();
                            String date = eventTable.getValueAt(selectedRow, 1).toString();
                            int duration = Integer.parseInt(eventTable.getValueAt(selectedRow, 2).toString());
                            int hours = duration / 60;
                            int mins = duration % 60;

                            JOptionPane.showMessageDialog(null ,"Event Title: " + evTitle + "\n" +
                                    "Description: " + desc + "\n\nDate: " + date + "\nDuration: " + hours + " hr/s and " + mins + " min/s", 
                                    "Event Information", 
                                    JOptionPane.INFORMATION_MESSAGE );
                            showDialog = true;
                        }
                    }
                }
            });
            
            if(!hasData){
                JOptionPane.showMessageDialog(null,
                    "There is no event this month.",
                    "No Event",
                    JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "There's an error in the database!",
                    "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    private void btnAddEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEventActionPerformed
        addEvent form = new addEvent();
        form.show();
        show(false);
    }//GEN-LAST:event_btnAddEventActionPerformed

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
            java.util.logging.Logger.getLogger(listOfEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listOfEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listOfEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listOfEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listOfEvents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEvent;
    private javax.swing.JTable eventTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JMonthChooser month;
    // End of variables declaration//GEN-END:variables
}
