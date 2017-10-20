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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Isra
 */
public class ChoferDao{
    Conexion nuevaConexion;
    
    public ChoferDao(){
        nuevaConexion = new Conexion();
    }
    
    public String agregarChofer(String datos[]){
        String respuestaRegistro = null;
        try {
            Connection accesoBD = nuevaConexion.getConexion();
            String comandoInsertarChofer = "INSERT INTO choferes"+
            "(Clave_acceso,Nombre, Apellido, Direccion, Telefono, Licencia,Matricula_vehiculo,RFC)"+
            "VALUES(?,?,?,?,?,?,?,?) ";
            
            PreparedStatement sentencia = accesoBD.prepareStatement(comandoInsertarChofer);
            sentencia.setString(1,datos[0]);
            sentencia.setString(2,datos[1]);
            sentencia.setString(3,datos[2]);
            sentencia.setString(4,datos[3]);
            sentencia.setString(5,datos[4]);
            sentencia.setString(6,datos[5]);
            sentencia.setString(7,datos[6]);
            sentencia.setString(8,datos[7]);
            int banderaBinaria = sentencia.executeUpdate();
            
            if (banderaBinaria > 0) {
                respuestaRegistro = "registrado con exito";
            }
            
            
        } catch (SQLException | HeadlessException e) {
            
        }
        nuevaConexion.cerrarConexion();
        return respuestaRegistro;
        
        
    }// fin agregar chofer
    
    public ArrayList<Chofer> listarApellidosChoferes(){
        ArrayList listaApellidosChoferes = new ArrayList();
        Chofer chofer;
        String comandoListarApellidos = "select Apellido from choferes";
        
         try {
            Connection accesoBD = nuevaConexion.getConexion();
            PreparedStatement sentencia = accesoBD.prepareStatement(comandoListarApellidos);
            ResultSet resultados = sentencia.executeQuery();
            while (resultados.next()) {
                chofer = new Chofer();
                chofer.setApellidos(resultados.getString(1));
                listaApellidosChoferes.add(chofer);
            }
            
        } catch (Exception e) {
        }
        nuevaConexion.cerrarConexion();
        
        return listaApellidosChoferes;
    }
    
    public ArrayList<Chofer> listarChoferes(){
        ArrayList ListaChoferes = new ArrayList();
        Chofer chofer;
        
        String comandoListar = "select * from choferes";
        try {
            Connection accesoBD = nuevaConexion.getConexion();
            PreparedStatement sentencia = accesoBD.prepareStatement(comandoListar);
            ResultSet resultados = sentencia.executeQuery();
            while (resultados.next()) {
                chofer = new Chofer();
                chofer.setId(resultados.getString(1));
                chofer.setClaveAcceso(resultados.getString(2));
                chofer.setNombre(resultados.getString(3));
                chofer.setApellidos(resultados.getString(4));
                chofer.setDireccion(resultados.getString(5));
                chofer.setTelefono(resultados.getString(6));
                chofer.setLicencia(resultados.getString(7));
                chofer.setPlacasVehiculo(resultados.getString(8));
                chofer.setRFC(resultados.getString(9));
                ListaChoferes.add(chofer);
            }
            
        } catch (Exception e) {
        }
        nuevaConexion.cerrarConexion();
        return ListaChoferes;
    } //fin listar personas
    
    public int borrarChofer(String id){
         int respuestaComando= 0;
        String comandoBorrar = "delete from choferes where Id_chofer = ?";
        try {
            Connection accesoBD = nuevaConexion.getConexion();
            PreparedStatement sentencia = accesoBD.prepareStatement(comandoBorrar);
            //CallableStatement cs = accesoDB.prepareCall("{call sp_deletePersona(?)}");
            sentencia.setString(1, id);
            respuestaComando = sentencia.executeUpdate();
        } catch (Exception e) {
        }
        nuevaConexion.cerrarConexion();
        return respuestaComando;
    }// fin borrar chofer
    
    public int editarChofer(String datos[]){
         int filasAfectadas=0;
        String SqlEditar = "update choferes set Nombre = ?, Apellido= ?, Telefono = ?, "+
            "Direccion=?,Licencia=?,Matricula_vehiculo =?, Clave_acceso =?, RFC=? where Id_chofer =?"; 
        String comandoEditar = "UPDATE choferes set"+" Nombre = ?,"+" Apellido = ?,"+
            " Telefono = ?,"+"Direccion= ?, "+" Licencia = ?,"+" Matricula_vehiculo = ? ,"+
                " Clave_acceso = ?,"+" RFC = ?"+" WHERE Id_chofer = ?";
        try {
            Connection accesoDB = nuevaConexion.getConexion();
            //CallableStatement cs = accesoDB.prepareCall("{call sp_editPersona(?,?,?,?,?)}");
            PreparedStatement sentencia = accesoDB.prepareStatement(comandoEditar);
            sentencia.setString(1, datos[0]);
            sentencia.setString(2, datos[1]);
            sentencia.setString(3, datos[2]);
            sentencia.setString(4, datos[3]);
            sentencia.setString(5, datos[4]);
            sentencia.setString(6, datos[5]);
            sentencia.setString(7, datos[6]);
            sentencia.setString(8, datos[7]);
            sentencia.setString(9, datos[8]);
            
            
            filasAfectadas = sentencia.executeUpdate();
        } catch (Exception e) {
        }
        nuevaConexion.cerrarConexion();
        return filasAfectadas;  
        
    }// fin editar
    
     public ArrayList<Chofer> buscarChofer(String apellido){
        ArrayList listaChoferes = new ArrayList();
        Chofer chofer;
        
        String comandoBusqueda = "select * from choferes where Apellido like concat('%',?,'%') "; 
        try {
            Connection accesoBD = nuevaConexion.getConexion();
           // CallableStatement cs = acceDB.prepareCall("{call sp_buscaPxApellidos(?)}");
            PreparedStatement sentencia = accesoBD.prepareStatement(comandoBusqueda);
            sentencia.setString(1, apellido);
            ResultSet resultadoBusqueda = sentencia.executeQuery();
            
            while(resultadoBusqueda.next()){
                chofer = new Chofer();
                chofer.setId(resultadoBusqueda.getString(1));
                chofer.setClaveAcceso(resultadoBusqueda.getString(2));
                chofer.setNombre(resultadoBusqueda.getString(3));
                chofer.setApellidos(resultadoBusqueda.getString(4));
                chofer.setDireccion(resultadoBusqueda.getString(5));
                chofer.setTelefono(resultadoBusqueda.getString(6));
                chofer.setLicencia(resultadoBusqueda.getString(7));
                chofer.setPlacasVehiculo(resultadoBusqueda.getString(8));
                chofer.setRFC(resultadoBusqueda.getString(9));
                listaChoferes.add(chofer);
            }
        } catch (Exception e) {
        }
        nuevaConexion.cerrarConexion();
        return listaChoferes;
     }
    
    
}
