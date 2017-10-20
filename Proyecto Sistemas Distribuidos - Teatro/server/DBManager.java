/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * DBManager: Singleton pattern
 * 
*
 *
 */
public final class DBManager {

    private static DBManager _instance = null;
    private Connection _con = null;

    public DBManager() {
        _con = getMySQLConnection();

    }

    public static synchronized DBManager getInstance() {
        if (_instance == null) {
            _instance = new DBManager();
        }
        return _instance;
    }

    public Connection getConnection() {
        return _con;
    }

    /**
     * Connection to MySQL Database
     */
    private static Connection getMySQLConnection() {
        Connection con = null;
        
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            // test es mi base de datos en mysql. los otros dos parametros siguientes son el usuario y contraseña,los dejo en vacio
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","","");
        } catch (SQLException se) {
            System.out.println("error");
            System.out.println(se);
        }
        return con;
    }

    /**
     * Connection to Microsoft Access
     */
    
    /*
    private static Connection getMsAccessConnection() {
        Connection con = null;
        try {

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            con = DriverManager.getConnection("jdbc:ucanaccess://C:/Province.mdb");
 } catch (Exception se) {
            System.out.println(se);
        }
        return con;
    }
    */
    /*
    private static Connection getFirebirdDBConnection() {
        Connection con = null;
        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            con = DriverManager.getConnection("jdbc:firebirdsql://localhost:3050/D:/Programacion/mars/RMIServerSide/PROVINCE.FDB","SYSDBA", "masterkey");
} catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return con;

    }
    */

}
