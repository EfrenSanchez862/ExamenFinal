/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class conexion {
    
    static Statement sentencia;
    
    static ResultSet resultado;
    
    private final String base = "mydb";
    
    private final String user = "root";
    
    private final String password = "";
    
    private final String url = "jdbc:mysql://localhost/"+base;
    
    private Connection con = null;
    
    public Connection getConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection(url, user, password);
            //JOptionPane.showMessageDialog(null,"Conectado al la Data Base");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return con;
    }

}

