/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdteis1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;






/**
 *
 * @author luis.canal
 */
public class BdTeis1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String jdbcUrl = "jdbc:mariadb://localhost:3306/teis1";
            
            Connection con = DriverManager.getConnection(jdbcUrl, "root", "");
            
            Statement stmt = con.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT * FROM alumnos"); 
            while (rs.next()){ 
                System.out.println(rs.getString("id") + " " + 
                        rs.getString(2)+ " " + rs.getString("nombre")); 
            }           
            
 /*           int num = stmt.executeUpdate(
                    "INSERT INTO alumnos (nombre, dni) VALUES "
                            + "('MANOLO', '7654321A')");
           
            System.out.println("líneas afectadas " + num);
  */       
            String miNombre = "María López";
            String miDni = "1234568G";
            String sql="INSERT INTO alumnos (nombre, dni) VALUES ";
            sql = sql + "('"+miNombre+"',";
            sql = sql + "'"+miDni+"')";
            
            System.out.println(sql);
            
            int num = stmt.executeUpdate(sql);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BdTeis1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BdTeis1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  

} 

