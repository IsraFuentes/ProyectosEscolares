/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import client.Province;
import java.sql.*;
import java.util.*;

/**
 * ProvinceRepository: data accessor
 *
 * @author http://lycog.com
 */
public class ProvinceRepository {

    public static int save(Province p) {
        int iRet = -1;
        try {
            Connection con = DBManager.getInstance().getConnection();
            String SQL = "INSERT INTO province (id_province, short_name, name) values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(SQL);
            pstmt.setInt(1, p.getId());
            pstmt.setString(2, p.getShortName());
            pstmt.setString(3, p.getName());
            iRet = pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException se) {
            System.out.println(se);
        }
        return iRet;
    }
    public static int[] obtenerListaEstadosSillas(){
        ResultSet re = null;
        int sillas[] = new int[100];
        try {
            Connection con = DBManager.getInstance().getConnection();
            String sql= "select * from sillas";
            PreparedStatement comando  = con.prepareCall(sql);
             re = comando.executeQuery();
            int cont = 0;
            while(re.next()){
                   // se usa getint 2 por que ese es el numero de la columna que contiene los estados de sillas
                    sillas[cont]= re.getInt(2);
                    cont++;
                    }
            re.close();
        } catch (SQLException se) {
            System.out.println("metodo obtener listas, falló"+ se);
        }
      return sillas;
        
    }
//    public static ArrayList MandarListaAsientosPedidos(ArrayList asientosSelecionados){
//        ArrayList Selecionados = new ArrayList();
//        Selecionados.notifyAll();
//       
//        return asientosSelecionados;
//    }
    public static synchronized int prereserva(int numAsiento, int user){
        int resultado =0;
        try {
            Connection con = DBManager.getInstance().getConnection();
            String Sql = "insert into prereservaciones (id_user,silla) values (?,?)";
            PreparedStatement pst1 = con.prepareStatement(Sql);
            //pst.setInt(1,id);
            pst1.setInt(1, user);
            pst1.setInt(2, numAsiento);
            resultado = pst1.executeUpdate();
            pst1.close();
            if (resultado > 0) {
                System.out.println("prereservado");
            }else
                System.out.println("error");
        } catch (SQLException se) {
            System.out.println(se);
        }
        
        
        
        return resultado;
    }
    
    
    public static synchronized int reservar(int numAsiento, int user){
        int iRet = -1;
        
        try {
            Connection con = DBManager.getInstance().getConnection();
            String Sql = "insert into reservaciones (No_Asiento,Id_usuario) values (?,?)";
            String sqlSillas = "update sillas set "+" estado = ?"+" WHERE id_silla = ?";
            PreparedStatement pst1 = con.prepareStatement(Sql);
            PreparedStatement pst2 = con.prepareStatement(sqlSillas);
            pst2.setInt(1, 4);
            pst2.setInt(2, numAsiento);
            //pst.setInt(1,id);
            pst1.setInt(1, numAsiento);
            pst1.setInt(2, user);
            iRet = pst1.executeUpdate();
            pst2.executeUpdate();
            pst1.close();
            pst2.close();
            if (iRet > 0) {
                System.out.println("reservaciones registradas");
            }else
                System.out.println("registro erroneo");
        } catch (SQLException se) {
            System.out.println(se);
        }
        
        
        return iRet;
    }
    
    public static int update( int silla, int estado) {
        int iRet = -1;
        try {
            Connection con = DBManager.getInstance().getConnection();
            String SQL = "UPDATE sillas SET estado=? WHERE id_silla =?";
            PreparedStatement pstmt = con.prepareStatement(SQL);
            pstmt.setInt(1, estado);
            pstmt.setInt(2, silla);
            iRet = pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException se) {
            System.out.println(se);
        }
        return iRet;
    }

    public static int delete(int username, int silla) {
        int iRet = -1;
        try {
            Connection con = DBManager.getInstance().getConnection();
            String SQL = "DELETE FROM prereservaciones WHERE id_user=? and silla=?";
            PreparedStatement pstmt = con.prepareStatement(SQL);
            pstmt.setInt(1, username);
            pstmt.setInt(2, silla);
            iRet = pstmt.executeUpdate();
            if (iRet > 0) {
                System.out.println("delete exitoso");
            }else{
                System.out.println("error en el delete");
            }
            pstmt.close();
        } catch (SQLException se) {
            System.out.println(se);
        }
        return iRet;
    }

    public static void deleteAll() {
        Connection con = DBManager.getInstance().getConnection();
        try {
            con.setAutoCommit(false);
            String SQL = "DELETE FROM Province";
            PreparedStatement pstmt = con.prepareStatement(SQL);
            pstmt.executeUpdate();
            con.commit();
        } catch (SQLException se) {
            try {
                con.rollback();
            } catch (SQLException ise) {
            }
        } finally {
            try {
                con.setAutoCommit(true);
            } catch (SQLException fse) {
            }
        }
    }

    public static ResultSet findAll() {
        ResultSet rs = null;
       try {
            Connection con = DBManager.getInstance().getConnection();
            String sql= "select * from prereservaciones";
            PreparedStatement comando  = con.prepareCall(sql);
             rs = comando.executeQuery();
            
            rs.close();
        } catch (SQLException se) {
            System.out.println("metodo find all, falló"+ se);
        }
        return rs;
    }

    public static ArrayList findByName(String name) {
        ArrayList arr = new ArrayList();
        try {
            String QRY = "SELECT * FROM Province WHERE name LIKE(?) ORDER BY id";
            Connection con = DBManager.getInstance().getConnection();
            PreparedStatement pstmt = con.prepareStatement(QRY);
            pstmt.setString(1, "%" + name + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Province p = new Province();
                p.setId(rs.getInt("Id"));
                p.setShortName(rs.getString("ShortName"));
                p.setName(rs.getString("Name"));
                arr.add(p);
            }
            pstmt.close();
        } catch (SQLException se) {
            System.out.println(se);
        }
        return arr;
    }
    
    public static boolean isEmpty( ){
        boolean status = true;
        try{
            
            Connection con = DBManager.getInstance().getConnection();
            String QRY = "SELECT * FROM province ORDEr BY id_province DESC LIMIT 1";
            PreparedStatement pstmt = con.prepareStatement(QRY);
            //status = pstmt.execute();
            
            
        } catch (SQLException se) {
            System.out.println(se);
        }
        return status;
    }
}
