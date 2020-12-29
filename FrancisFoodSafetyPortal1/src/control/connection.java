package control;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class connection {
    
    


         public static Connection getConnectivity(){

                 Connection con=null;

                 try{

                           Class.forName("com.mysql.jdbc.Driver").newInstance();

 con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/food_safety_portal","root","root");
                         }catch(Exception e){

                         System.out.println(e);
                 }

                 return con;
         }
    
}
