/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package system.software_engineering;

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
        idTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        genderTxt = new javax.swing.JComboBox<>();
        isAvail = new javax.swing.JToggleButton();
        ageTxt1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jPanel1.add(firstnameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 240, 40));

        surnameTxt.setEditable(false);
        surnameTxt.setBackground(new java.awt.Color(255, 250, 202));
        surnameTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        surnameTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(surnameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 240, 40));

        idTxt.setEditable(false);
        idTxt.setBackground(new java.awt.Color(255, 250, 202));
        idTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        idTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 61, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Surname :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Is Available :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 90, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        jButton1.setBackground(new java.awt.Color(103, 146, 137));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 70, 30));

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
        jPanel1.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 90, 38));

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
        jPanel1.add(genderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 100, 40));

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
        jPanel1.add(isAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 70, 40));

        ageTxt1.setEditable(false);
        ageTxt1.setBackground(new java.awt.Color(255, 250, 202));
        ageTxt1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ageTxt1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(ageTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 61, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Age :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 320, 240));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 810, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        searchProfile form = new searchProfile();
        form.show();
        show(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed

        boolean isActive = editBtn.getText().equals("Save");

        if (isActive) {
            // Save button is clicked, perform save action
            firstnameTxt.setEditable(false);
            middlenameTxt.setEditable(false);
            surnameTxt.setEditable(false);
            idTxt.setEditable(false);
            genderTxt.setEnabled(false);
            contactTxt.setEditable(false);
            addressTxt.setEditable(false);
            isAvail.setEnabled(false);

            if(firstnameTxt.getText().isBlank() || middlenameTxt.getText().isBlank() || surnameTxt.getText().isBlank() ||
                genderTxt.getSelectedItem().equals(null) || idTxt.getText().isBlank() || contactTxt.getText().isBlank() ||
                addressTxt.getText().isBlank()){
                JOptionPane.showMessageDialog(frame,
                    "Fields cannot be empty!",
                    "Empty Fields",
                    JOptionPane.ERROR_MESSAGE);
            }else{
                String sql = "UPDATE visitor SET first_name = ?, middle_name = ?, surname = ?, sex = ?, age = ?, contact = ?,"
                + "address = ?, isEligible = ?";

                try{
                    PreparedStatement statement = (PreparedStatement) sql_connect.db_connect().prepareStatement(sql);
                    statement.setString(1, firstnameTxt.getText().toUpperCase());
                    statement.setString(2, middlenameTxt.getText().toUpperCase());
                    statement.setString(3, surnameTxt.getText().toUpperCase());
                    statement.setString(4, (String) genderTxt.getSelectedItem());
                    statement.setString(5, idTxt.getText());
                    statement.setString(6, contactTxt.getText());
                    statement.setString(7, addressTxt.getText().toUpperCase());

                    if (isAvail.getText().equals("YES")){
                        statement.setBoolean(8, true);
                    }else{
                        statement.setBoolean(8, false);
                    }

                    statement.executeUpdate();

                    JOptionPane.showMessageDialog(frame,
                        "Information updated successfully!",
                        "Update Successful",
                        JOptionPane.INFORMATION_MESSAGE);

                }catch(SQLException e){
                    JOptionPane.showMessageDialog(frame,
                        "There's an error in the database!",
                        "Database Error",
                        JOptionPane.WARNING_MESSAGE);
                }
            }

            editBtn.setText("Edit");
        } else {
            // Edit button is clicked, enable editing
            firstnameTxt.setEditable(true);
            middlenameTxt.setEditable(true);
            surnameTxt.setEditable(true);
            idTxt.setEditable(true);
            genderTxt.setEnabled(true);
            contactTxt.setEditable(true);
            addressTxt.setEditable(true);
            isAvail.setEnabled(true);
            editBtn.setText("Save");
        }

    }//GEN-LAST:event_editBtnActionPerformed

    private void isAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isAvailActionPerformed
        if (isAvail.getText().equals("YES")) {
            isAvail.setText("NO");
            String hexCode = "#ff3333";
            Color color = Color.decode(hexCode);
            isAvail.setBackground(color);
            isAvail.setForeground(Color.WHITE);
        } else {
            isAvail.setText("YES");
            String hexCode = "#FFFACA";
            Color color = Color.decode(hexCode);
            isAvail.setBackground(color);
            isAvail.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_isAvailActionPerformed

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
    private javax.swing.JTextField ageTxt1;
    private javax.swing.JButton editBtn;
    private javax.swing.JTable eventTable;
    private javax.swing.JTextField firstnameTxt;
    private javax.swing.JComboBox<String> genderTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JToggleButton isAvail;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField surnameTxt;
    // End of variables declaration//GEN-END:variables
}
