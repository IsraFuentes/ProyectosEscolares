/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Modelo.*;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Isra
 */
public class PedidosDao {
    Conexion nuevaConexion;
    
    public PedidosDao(){
        nuevaConexion = new Conexion();
        
    }
    
    public String agregarPedido(String idCliente,String idChofer, String fecha, String lugarOrigen, String lugarDestino, String costo){
         String respuestaRegistro = null;
        try {
            Connection accesoBD = nuevaConexion.getConexion();
            String comandoInsertarUsuario = "INSERT INTO ordenes_trabajo"+
            "(id_cliente,"+"id_chofer,"+"fecha,"+"lugar_origen,"+"lugar_destino," +"costo)"+
            "VALUES(?,?,?,?,?,?) ";
            
            PreparedStatement sentencia = accesoBD.prepareStatement(comandoInsertarUsuario);
            sentencia.setString(1, idCliente);
            sentencia.setString(2,idChofer);
            sentencia.setString(3, fecha);
            sentencia.setString(4,lugarOrigen);
            sentencia.setString(5,lugarDestino);
            sentencia.setString(6, costo);
            
            int banderaBinaria = sentencia.executeUpdate();
            
            if (banderaBinaria > 0) {
                respuestaRegistro = "orden de trabajo añadida con exito";
            }
            
            
        } catch (SQLException | HeadlessException e) {
            
        }
        nuevaConexion.cerrarConexion();
        return respuestaRegistro;
        
        
    }
    
    
    
    
    
}
