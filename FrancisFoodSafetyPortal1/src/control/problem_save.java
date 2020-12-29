/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.admin_edit;


public class problem_save {
    
     public void insertProb(String n,String name,String email,String mobile,String problem)
    {
        Connection con=null;
        con=connection.getConnectivity();
        try {    
            PreparedStatement pstmt=con.prepareStatement("INSERT INTO `food_safety_portal`.`problems`\n" +
"(`prob_no`,`name`,`email`,`mobile`,`problem`)" +
"VALUES(?,?,?,?,?)");
                        pstmt.setInt(1,Integer.parseInt(n));
            pstmt.setString(2,name);
            pstmt.setString(3,email);
            pstmt.setDouble(4,Double.parseDouble(mobile));
            pstmt.setString(5,problem);
                        pstmt.executeUpdate();
                        return;
            } catch (SQLException ex) {
            Logger.getLogger(admin_edit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public boolean emailCheck(String s)
     {
         Connection con=null;
        con=connection.getConnectivity();
        try {    
            PreparedStatement pstmt=con.prepareStatement("select email from `food_safety_portal`.`problems`");
            ResultSet rs=pstmt.executeQuery();
            while(rs.next())
            {
                if(s.equals(rs.getString(1)))
                {
                    return true;
                }
                
            }
            } catch (SQLException ex) {
            Logger.getLogger(admin_edit.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
         
     }
    
}
