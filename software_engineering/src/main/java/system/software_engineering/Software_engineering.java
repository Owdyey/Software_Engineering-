/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package system.software_engineering;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author addie
 */
public class Software_engineering {

    public static void main(String[] args) {
        login_form form = new login_form();
        form.show();
        sql_connect.db_connect();
        
        /*    
        try {
            PreparedStatement statement = (PreparedStatement) sql_connect.db_connect().prepareStatement(sql);  
            
            statement.setString(1,"christa marie");
            statement.setString(2,"montimor");
            statement.setString(3,"f");
            statement.setInt(4,22);
            statement.setString(5,"09614303055");
            statement.setString(6,"vicente cruz");
            
            int response = statement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Software_engineering.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("error");
        }
        */
    }
    
    
}
