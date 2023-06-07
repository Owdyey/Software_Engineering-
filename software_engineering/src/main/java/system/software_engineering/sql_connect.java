/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system.software_engineering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author addie
 */
public class sql_connect {
    
    public static Connection db_connect(){
        
        String hostname = "localhost";
        String port_num = "3306";
        String db_name = "system";
        
        String url = "jdbc:mysql://" + hostname + ":" + port_num + "/" + db_name;
        String username = "root";
        String password = "Admin_12345";
        
        try{    
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(url, username, password);
            return connect;
        
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            return null;
        }
        
    
    
    
    
    
    
    }
    
}
