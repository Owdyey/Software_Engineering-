/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system.software_engineering;

import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author addie
 */
public class checkPrisonersAvailability {
    
    public boolean exists() {
    String sql = "SELECT * FROM prisoners WHERE prisoner_first_name = ? AND prisoner_surname = ?";
    boolean present = false;

    try {
        PreparedStatement statement = sql_connect.db_connect().prepareStatement(sql);
        statement.setString(1, variable.inmateFname.toUpperCase());
        statement.setString(2, variable.inmateSurname.toUpperCase());

        ResultSet resultSet = statement.executeQuery();
        present = resultSet.next();

        resultSet.close();
        statement.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,
                    "There's a problem in the database.",
                    "Database Error",
                    JOptionPane.WARNING_MESSAGE);
    }

    return present;
}

    
    
    
    public boolean check(){
        String sql = "SELECT isAvailable FROM prisoners WHERE prisoner_first_name = ? AND prisoner_surname = ?";
        boolean result = true;
        try {
            PreparedStatement statement = sql_connect.db_connect().prepareStatement(sql);
            statement.setString(1, variable.inmateFname.toUpperCase());
            statement.setString(2, variable.inmateSurname.toUpperCase());
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                result = resultSet.getBoolean("isAvailable");
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "There's a problem in the database.",
                    "Database Error",
                    JOptionPane.WARNING_MESSAGE);
        }

        return result;
    }
    
    
//    public boolean isEligible(){
//     String sql = "SELECT isEligible FROM visitor WHERE first_name = ? AND middle_name = ? AND surname = ?";
//     boolean result = true;
//     try{
//          PreparedStatement statement = sql_connect.db_connect().prepareStatement(sql);
//          
//          statement.setString(1, variable.firstName);
//          statement.setString(2,variable.middleName);
//          statement.setString(3,variable.surname);
//          
//          ResultSet resultSet = statement.executeQuery();
//          
//          if(resultSet.next()){
//              result = resultSet.getBoolean("isEligible");
//          }
//          resultSet.close();
//          statement.close();
//          
//     }catch(SQLException e){
//         System.out.println(e);
//     }
//     return result;
//    }
}
