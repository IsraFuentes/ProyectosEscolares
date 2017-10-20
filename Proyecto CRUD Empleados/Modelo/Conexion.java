/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isra
 */
public class Conexion {
   private static final String nombreBD = "prueba";
   private static final String adminBD = "root";
   private static final String contraseñaBD = "";
   private Connection conexion = null; 
   
    public Conexion(){
        
    }
    
    public Connection getConexion(){
     //Connection conexion = null; 
        conectar();
        return conexion;
    }
    
    public void conectar(){
    
        try  {
            //cargar el driver para manejar la base de datos
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/"+ nombreBD,adminBD,contraseñaBD);
          
        }
             catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            System.out.println("error de conexion"+e);
        }
        
    }
    
    
    
    public Connection cerrarConexion(){
       try {
           conexion.close();
       } catch (Exception ex) {
           System.out.println("Error al cerrar de conexion " +ex);
       }
        
        return conexion;
    }
    
}
