/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package system.software_engineering;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author addie
 */
public class prisonerProfile extends javax.swing.JFrame {

    /**
     * Creates new form prisonerProfile
     */
    public prisonerProfile() {
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
        firstnameTxt = new javax.swing.JTextField();
        surnameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        genderTxt = new javax.swing.JComboBox<>();
        isAvail = new javax.swing.JToggleButton();
        remainingDays = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        isReady = new javax.swing.JToggleButton();
        eventList = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 53, 84));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstnameTxt.setEditable(false);
        firstnameTxt.setBackground(new java.awt.Color(255, 250, 202));
        firstnameTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        firstnameTxt.setForeground(new java.awt.Color(0, 0, 0));
        firstnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(firstnameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 240, 40));

        surnameTxt.setEditable(false);
        surnameTxt.setBackground(new java.awt.Color(255, 250, 202));
        surnameTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        surnameTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(surnameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 240, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("List of Events :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, 20));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Surname :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html> <p text-align: center>Is<br>Available: </p> </html>");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 70, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        jButton1.setBackground(new java.awt.Color(103, 146, 137));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 70, 30));

        editBtn.setBackground(new java.awt.Color(103, 146, 137));
        editBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("Edit");
        editBtn.setToolTipText("");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        jPanel1.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 90, 38));

        jLabel10.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\system\\images\\small_logo.png"));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 120, 140));

        jPanel4.setBackground(new java.awt.Color(255, 250, 202));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Prisoner Profile");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 680, 110));

        genderTxt.setBackground(new java.awt.Color(255, 250, 202));
        genderTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        genderTxt.setForeground(new java.awt.Color(0, 0, 0));
        genderTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        genderTxt.setSelectedIndex(-1);
        genderTxt.setEnabled(false);
        jPanel1.add(genderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 100, 40));

        isAvail.setBackground(new java.awt.Color(255, 250, 202));
        isAvail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        isAvail.setForeground(new java.awt.Color(0, 0, 0));
        isAvail.setText("YES");
        isAvail.setBorderPainted(false);
        isAvail.setEnabled(false);
        isAvail.setFocusable(false);
        isAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isAvailActionPerformed(evt);
            }
        });
        jPanel1.add(isAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 70, 40));

        remainingDays.setEditable(false);
        remainingDays.setBackground(new java.awt.Color(255, 250, 202));
        remainingDays.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        remainingDays.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(remainingDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 80, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ready to be released :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 170, 40));

        eventTable.setBackground(new java.awt.Color(255, 250, 202));
        eventTable.setForeground(new java.awt.Color(0, 0, 0));
        eventTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Event/s Attended"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eventTable.setMinimumSize(new java.awt.Dimension(225, 20));
        eventTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(eventTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 320, 170));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Age :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        ageTxt.setEditable(false);
        ageTxt.setBackground(new java.awt.Color(255, 250, 202));
        ageTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ageTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(ageTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 61, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("<html> <p text-align: center>Remaining<br>Days :</p> </html>");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 40));

        isReady.setBackground(new java.awt.Color(255, 250, 202));
        isReady.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        isReady.setForeground(new java.awt.Color(0, 0, 0));
        isReady.setText("YES");
        isReady.setBorderPainted(false);
        isReady.setEnabled(false);
        isReady.setFocusable(false);
        isReady.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isReadyActionPerformed(evt);
            }
        });
        jPanel1.add(isReady, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 70, 40));

        eventList.setBackground(new java.awt.Color(255, 250, 202));
        eventList.setForeground(new java.awt.Color(0, 0, 0));
        eventList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        eventList.setSelectedIndex(-1);
        eventList.setEnabled(false);
        jPanel1.add(eventList, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 320, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First Name :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        addBtn.setBackground(new java.awt.Color(103, 146, 137));
        addBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.setToolTipText("");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 810, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        searchPrisoner form = new searchPrisoner();
        form.show();
        show(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void isAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isAvailActionPerformed
        if (isAvail.getText().equals("YES")) {
            isAvail.setText("NO");
            String hexCode = "#ff3333";
            Color color = Color.decode(hexCode);
            isAvail.setBackground(color);
            isAvail.setForeground(Color.WHITE);
        } else {
            isAvail.setText("YES");
            String hexCode = "#66FF66";
            Color color = Color.decode(hexCode);
            isAvail.setBackground(color);
            isAvail.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_isAvailActionPerformed

    private void isReadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isReadyActionPerformed
        if (isReady.getText().equals("YES")) {
            isReady.setText("NO");
            String hexCode = "#ff3333";
            Color color = Color.decode(hexCode);
            isReady.setBackground(color);
            isReady.setForeground(Color.WHITE);
        } else {
            isReady.setText("YES");
            String hexCode = "#66FF66";
            Color color = Color.decode(hexCode);
            isReady.setBackground(color);
            isReady.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_isReadyActionPerformed

    DefaultTableModel tableModel;
    
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        int option = JOptionPane.showConfirmDialog(null, 
                "Confirm adding this to the prisoner.", 
                "Confirmation", 
                JOptionPane.YES_NO_OPTION);
        
        if(option == 0){
            String sql = "UPDATE prisoners SET events_attended = ? WHERE prisoner_first_name = ? AND prisoner_surname = ?";
        
            try {
                PreparedStatement statement = (PreparedStatement) sql_connect.db_connect().prepareStatement(sql);
                statement.setString(2, firstnameTxt.getText());
                statement.setString(3, surnameTxt.getText());

                // Retrieve the current value of events_attended column
                String currentEvents = "";
               
                String sql2 = "SELECT * FROM prisoners WHERE prisoner_first_name = ? AND prisoner_surname = ?";
               
                PreparedStatement statement2 = (PreparedStatement) sql_connect.db_connect().prepareStatement(sql2);
               
                statement2.setString(1, firstnameTxt.getText());
                statement2.setString(2, surnameTxt.getText());
                    
                ResultSet result = statement2.executeQuery();
                
                if (result.next()) {
                    currentEvents = result.getString("events_attended");
                }

                if(currentEvents.contains((String)eventList.getSelectedItem())){
                    JOptionPane.showMessageDialog(null, 
                        "Event already in the list.",
                        "Error",
                        JOptionPane.INFORMATION_MESSAGE);
                }else{
                    // Append the new data to the current value
                    String newEvents = currentEvents + ", " + (String) eventList.getSelectedItem();
                    statement.setString(1, newEvents);

                    // Update the table with the new value
                    int rowsAffected = statement.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, 
                                "Event added to the prisoner successfully.",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);

                        eventList.setEnabled(false);
                        addBtn.setEnabled(false);

                    } else {
                        JOptionPane.showMessageDialog(null, 
                                "Prisoner not found or no updates made.",
                                "Warning",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }
                
                
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, 
                        "There's an error in the database!",
                        "Database Error",
                        JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }

        }else{
            JOptionPane.showMessageDialog(null, 
                "Adding of event to the prisoner was cancelled.",
                "Cancelled",
                JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        addBtn.setEnabled(false);
        firstnameTxt.setText(variable.firstName);
        surnameTxt.setText(variable.surname);
        ageTxt.setText(variable.age);
        genderTxt.setSelectedItem(variable.gender);
        remainingDays.setText(Integer.toString(variable.remainingDays));
        
        if(variable.isAvailable == true){
            isAvail.setText("YES");
        }else{
            isAvail.setText("NO");
        }
        
        if(variable.isReady == true){
            isReady.setText("YES");
        }else{
            isReady.setText("NO");
        }
        
        
        String sql = "SELECT * FROM events";
        DefaultComboBoxModel<String> models = new DefaultComboBoxModel<>();
        
        try {
            PreparedStatement statement = (PreparedStatement) sql_connect.db_connect().prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                String events = result.getString("event_title");
                models.addElement(events);
            }
            
            eventList.setModel(models);
            
        }catch (SQLException e) {
            
        }
        
        try {
            String sql2 = "SELECT * FROM prisoners WHERE prisoner_first_name = ? AND prisoner_surname = ?";
               
            PreparedStatement statement2 = (PreparedStatement) sql_connect.db_connect().prepareStatement(sql2);

            statement2.setString(1, firstnameTxt.getText());
            statement2.setString(2, surnameTxt.getText());

            ResultSet result = statement2.executeQuery();

            while(result.next()){
                String events = result.getString("events_attended");
                
                String[] eventNames = events.split(", ");

                tableModel = (DefaultTableModel) eventTable.getModel();
                tableModel.setRowCount(0);

                for (String eventName : eventNames) {
                    Object[] rowData = { eventName };
                    tableModel.addRow(rowData);
                }
            }
        }catch (SQLException e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        boolean isActive = editBtn.getText().equals("Save");
        
        if(isActive){
            addBtn.setEnabled(false);
            isAvail.setEnabled(false);
            isReady.setEnabled(false);
            eventList.setEnabled(false);
            
            String sql = "UPDATE prisoners SET isAvailable = ?, is_ready = ? WHERE prisoner_first_name = ? AND prisoner_surname = ?";
            
            try {
                PreparedStatement statement = (PreparedStatement) sql_connect.db_connect().prepareStatement(sql);
                statement.setString(3, firstnameTxt.getText());
                statement.setString(4, surnameTxt.getText());
                
                if(isAvail.getText().equals("YES")){
                    statement.setBoolean(1, true);
                }else{
                    statement.setBoolean(1, false);
                }
                
                if(isReady.getText().equals("YES")){
                    statement.setBoolean(2, true);
                }else{
                    statement.setBoolean(2, false);
                }
                
                statement.executeUpdate();
                
                JOptionPane.showMessageDialog(null, 
                    "Information updated successfully!",
                    "Successful",
                    JOptionPane.INFORMATION_MESSAGE);
                
                try {
                    String sql2 = "SELECT * FROM prisoners WHERE prisoner_first_name = ? AND prisoner_surname = ?";

                    PreparedStatement statement2 = (PreparedStatement) sql_connect.db_connect().prepareStatement(sql2);

                    statement2.setString(1, firstnameTxt.getText());
                    statement2.setString(2, surnameTxt.getText());

                    ResultSet result = statement2.executeQuery();

                    while(result.next()){
                        String events = result.getString("events_attended");

                        String[] eventNames = events.split(", ");

                        tableModel = (DefaultTableModel) eventTable.getModel();
                        tableModel.setRowCount(0);

                        for (String eventName : eventNames) {
                            Object[] rowData = { eventName };
                            tableModel.addRow(rowData);
                        }
                    }
                }catch (SQLException e) {
                    System.out.println(e);
                }
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, 
                    "There's an error in the database!",
                    "Database Error",
                    JOptionPane.WARNING_MESSAGE);
            }
            
            editBtn.setText("Edit");
        } else{
            addBtn.setEnabled(true);
            isAvail.setEnabled(true);
            isReady.setEnabled(true);
            eventList.setEnabled(true);
            editBtn.setText("Save");
        }
    }//GEN-LAST:event_editBtnActionPerformed

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
            java.util.logging.Logger.getLogger(prisonerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prisonerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prisonerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prisonerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prisonerProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton editBtn;
    private javax.swing.JComboBox<String> eventList;
    private javax.swing.JTable eventTable;
    private javax.swing.JTextField firstnameTxt;
    private javax.swing.JComboBox<String> genderTxt;
    private javax.swing.JToggleButton isAvail;
    private javax.swing.JToggleButton isReady;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField remainingDays;
    private javax.swing.JTextField surnameTxt;
    // End of variables declaration//GEN-END:variables
}
